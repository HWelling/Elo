package de.welling.elo;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	
	@GetMapping("/hello")
	public String getGelloMessage(@RequestParam(value = "name", defaultValue = "World") String nameToGreet)
	{
		return String.format("Hello there, %s! Hope you have a nice %s!", nameToGreet, Calendar.getInstance(TimeZone.getDefault()).getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG_STANDALONE, Locale.UK));
	}
	
}
