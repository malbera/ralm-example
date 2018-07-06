package com.raml.example.impl;

import com.raml.example.api.Todo;
import com.raml.example.api.TodoController;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class TodoControllerImpl implements TodoController{

    public static final ArrayList<Todo> TODOS = new ArrayList<>();

    @Override
    public ResponseEntity getTodos() {
        return ResponseEntity.ok(TODOS);
    }

    @Override
    public ResponseEntity<Todo> getTodoById(Long id) {
        return ResponseEntity.ok(
                TODOS.stream()
                        .filter(t -> t.getId().equals(id))
                        .findFirst()
                        .orElseThrow(TodoNotFoundException::new)
        );
    }
}
