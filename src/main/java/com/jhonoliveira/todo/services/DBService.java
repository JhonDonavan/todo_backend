package com.jhonoliveira.todo.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jhonoliveira.todo.domain.Todo;
import com.jhonoliveira.todo.repository.TodoRepository;

@Service
public class DBService {

	@Autowired
	private TodoRepository todoRepository;

	public void instanciaBaseDeDados() throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Todo t1 = new Todo(null, "estudar", "estudar spring boot 2", sdf.parse("29/04/2021"), true);
		Todo t2 = new Todo(null, "Ler", "Livro de desenvolvimento pessoal", sdf.parse("31/04/2021"), false);
		Todo t3 = new Todo(null, "Praticar violão", "Praticar violão e guitarra", sdf.parse("01/05/2021"), false);
		Todo t4 = new Todo(null, "Excercicios", "Praticar exercicios fisicos", sdf.parse("15/04/2021"), false);
		Todo t5 = new Todo(null, "Limpar geladeira", "Limpar geladeira", sdf.parse("02/04/2021"), true);
		
		todoRepository.saveAll(Arrays.asList(t1, t2, t3, t4, t5));
	}
}
