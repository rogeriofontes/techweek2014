package br.uaijug.techweek.controller;

import java.util.List;

import javax.inject.Inject;
import javax.validation.constraints.NotNull;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.uaijug.techweek.model.Person;
import br.uaijug.techweek.model.dao.PersonDao;

@Controller
public class PersonController {

	@Inject
	private Result result;

	@Inject
	private PersonDao personDao;

	public void form() {
	}

	@Get("/person/list")
	public List<Person> list() {
		return personDao.listAll();
	}

	@Post("/person/add")
	public void add(final @NotNull Person person) {

		personDao.add(person);

		result.include("message", person.getName() + " person added");
		result.redirectTo(PersonController.class).list();

	}
}
