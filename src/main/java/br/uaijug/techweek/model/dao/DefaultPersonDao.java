package br.uaijug.techweek.model.dao;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import br.uaijug.techweek.model.Person;

public class DefaultPersonDao implements PersonDao {
	
	@Inject
	private EntityManager entityManager;

	public void add(Person person) {
		entityManager.persist(person);		
	}

	public Person load(Person person) {
		return (Person) entityManager.find(Person.class, person.getId());
	}

	public List<Person> listAll() {
		return entityManager.createQuery("select m from Person m", Person.class).getResultList();
	}

}
