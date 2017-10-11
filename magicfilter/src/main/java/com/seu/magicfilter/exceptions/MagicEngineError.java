package com.seu.magicfilter.exceptions;

/**
 * Created by pier on 11/10/17.
 */

public class MagicEngineError extends Error {
    public MagicEngineError() {
        this("MagicEngine must be built first");
    }

    private MagicEngineError(String s) {
        super(s);
    }
}
