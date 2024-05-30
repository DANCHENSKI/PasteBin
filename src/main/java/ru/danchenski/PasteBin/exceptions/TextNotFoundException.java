package ru.danchenski.PasteBin.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TextNotFoundException extends RuntimeException {
    public TextNotFoundException() {
        super("Text Not Found");
    }
}
