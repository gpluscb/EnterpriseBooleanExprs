package com.github.gpluscb.boolean_expression;

public class AtomBooleanExpression implements BooleanExpression {
    private final boolean value;

    public AtomBooleanExpression(boolean value) {
        this.value = value;
    }

    @Override
    public boolean evaluate() {
        return value;
    }
}
