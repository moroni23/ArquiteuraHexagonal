package io.github.com.moronipereira.apitodo.domain.services;

import io.github.com.moronipereira.apitodo.domain.Todo;
import io.github.com.moronipereira.apitodo.domain.ports.TodoRepositoryPort;
import io.github.com.moronipereira.apitodo.domain.ports.TodoServicePort;



import java.util.List;


public class TodoService implements TodoServicePort {


    private final TodoRepositoryPort todoRepositoryPort;

    public TodoService(TodoRepositoryPort todoRepositoryPort) {
        this.todoRepositoryPort = todoRepositoryPort;
    }

    @Override
    public Todo saveTodo(Todo todo) {
        return todoRepositoryPort.saveTodo(todo);
    }

    @Override
    public List<Todo> findall() {
        return todoRepositoryPort.findall();
    }
}
