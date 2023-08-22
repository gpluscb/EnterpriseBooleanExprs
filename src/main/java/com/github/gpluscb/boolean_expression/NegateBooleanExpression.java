package com.github.gpluscb.boolean_expression;

import java.util.Objects;

public class NegateBooleanExpression implements BooleanExpression {
    private final BooleanExpression expr;

    public NegateBooleanExpression(BooleanExpression expr) {
        this.expr = Objects.requireNonNull(expr);
    }

    @Override
    public boolean evaluate() {
        return !expr.evaluate();
    }
}
