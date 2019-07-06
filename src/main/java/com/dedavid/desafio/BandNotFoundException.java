package com.dedavid.desafio;

public class BandNotFoundException extends RuntimeException {
    public BandNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
