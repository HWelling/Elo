package de.welling.elo.person.service;

import static org.junit.Assert.*;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.testcontainers.containers.MongoDBContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import de.welling.elo.person.EloPerson;

@SpringBootTest
@Testcontainers
public class EloPersonRepositoryTest {
	
	@Container
	private static final MongoDBContainer MONGO_DB = new MongoDBContainer("mongo:4.2.5");

	@Autowired
    private MongoTemplate mongo;

    @Test
    void testConnection() {
        final String uuid = UUID.randomUUID().toString();
        this.mongo.createCollection(EloPerson.class);
        assertTrue(this.mongo.collectionExists(uuid));
    }
}
