package br.uaijug.techweek.model.dao;

import java.util.List;

import br.uaijug.techweek.model.Person;

public interface PersonDao {
	
	void add(Person person);

	Person load(Person person);

	List<Person> listAll();

}
