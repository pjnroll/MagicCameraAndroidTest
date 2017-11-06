package com.seu.magicfilter.exceptions;

/**
 * Created by pier on 11/10/17.
 */

public class MagicEngineException extends RuntimeException {
    public MagicEngineException() {
        this("MagicEngine must be built first");
    }

    private MagicEngineException(String s) {
        super(s);
    }
}
