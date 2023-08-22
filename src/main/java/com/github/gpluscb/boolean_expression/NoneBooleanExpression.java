package com.github.gpluscb.boolean_expression;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class NoneBooleanExpression implements BooleanExpression {
    private final Stream<BooleanExpression> exprs;

    public NoneBooleanExpression(List<BooleanExpression> exprs) {
        this.exprs = Objects.requireNonNull(exprs).stream();
    }

    public NoneBooleanExpression(Stream<BooleanExpression> exprs) {
        this.exprs = Objects.requireNonNull(exprs);
    }

    @Override
    public boolean evaluate() {
        return exprs.noneMatch(BooleanExpression::evaluate);
    }
}
