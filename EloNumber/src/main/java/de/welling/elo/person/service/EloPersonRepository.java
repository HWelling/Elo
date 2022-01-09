package de.welling.elo.person.service;

import org.springframework.data.repository.CrudRepository;

import de.welling.elo.person.EloPerson;

public interface EloPersonRepository extends CrudRepository<EloPerson, Long>{
	
	public EloPerson getByNameAndLastname(final String name, final String lastname);
	
}