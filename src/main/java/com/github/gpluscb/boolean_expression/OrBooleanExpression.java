package com.github.gpluscb.boolean_expression;

import java.util.Objects;

public class OrBooleanExpression implements BooleanExpression {
    private BooleanExpression l;
    private BooleanExpression r;

    public OrBooleanExpression(BooleanExpression l, BooleanExpression r) {
        this.l = Objects.requireNonNull(l);
        this.r = Objects.requireNonNull(r);
    }

    @Override
    public boolean evaluate() {
        return l.evaluate() || r.evaluate();
    }
}
