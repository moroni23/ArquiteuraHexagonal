package io.github.com.moronipereira.apitodo.adapter.Infra;

import io.github.com.moronipereira.apitodo.domain.ports.TodoRepositoryPort;
import io.github.com.moronipereira.apitodo.domain.ports.TodoServicePort;
import io.github.com.moronipereira.apitodo.domain.services.TodoService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
    @Bean
    public TodoServicePort todoServicePort(TodoRepositoryPort todoRepositoryPort){
        return new TodoService(todoRepositoryPort);
        }
    }

