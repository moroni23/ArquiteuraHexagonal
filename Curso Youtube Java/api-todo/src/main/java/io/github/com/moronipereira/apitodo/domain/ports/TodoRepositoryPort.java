package io.github.com.moronipereira.apitodo.domain.ports;

import io.github.com.moronipereira.apitodo.domain.Todo;

import java.util.List;

public interface TodoRepositoryPort {

    Todo saveTodo(Todo todo);

    List<Todo> findall();
}
