package com.raml.example.impl;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "no todo found with given id")
public class TodoNotFoundException extends RuntimeException {
}
