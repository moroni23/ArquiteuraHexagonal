package io.github.com.moronipereira.apitodo.adapter.repository;

import io.github.com.moronipereira.apitodo.adapter.entities.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository  extends JpaRepository<TodoEntity, Integer> {


}
