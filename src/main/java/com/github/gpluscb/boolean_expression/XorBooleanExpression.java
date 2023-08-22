package com.github.gpluscb.boolean_expression;

import java.util.Objects;

public class XorBooleanExpression implements BooleanExpression {
    private final BooleanExpression l;
    private final BooleanExpression r;

    public XorBooleanExpression(BooleanExpression l, BooleanExpression r) {
        this.l = Objects.requireNonNull(l);
        this.r = Objects.requireNonNull(r);
    }

    @Override
    public boolean evaluate() {
        return l.evaluate() ^ r.evaluate();
    }
}
