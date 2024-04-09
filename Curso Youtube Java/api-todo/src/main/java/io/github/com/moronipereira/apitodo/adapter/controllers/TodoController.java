package io.github.com.moronipereira.apitodo.adapter.controllers;


import io.github.com.moronipereira.apitodo.domain.Todo;
import io.github.com.moronipereira.apitodo.domain.ports.TodoServicePort;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("todos")
@AllArgsConstructor
public class TodoController {

    private final TodoServicePort todoServicePort;

    @PostMapping
    public Todo create(@RequestBody Todo todo) {
        return todoServicePort.saveTodo(todo);
    }

    @GetMapping
    public List<Todo> findAll() {
        return todoServicePort.findall();
    }


}
