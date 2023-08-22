package com.github.gpluscb.boolean_expression;

import java.util.Objects;

public class AndBooleanExpression implements BooleanExpression {
    private final BooleanExpression l;
    private final BooleanExpression r;

    public AndBooleanExpression(BooleanExpression l, BooleanExpression r) {
        this.l = Objects.requireNonNull(l);
        this.r = Objects.requireNonNull(r);
    }

    @Override
    public boolean evaluate() {
        return l.evaluate() && r.evaluate();
    }
}
