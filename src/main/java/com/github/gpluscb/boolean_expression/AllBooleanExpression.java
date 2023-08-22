package com.github.gpluscb.boolean_expression;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class AllBooleanExpression implements BooleanExpression {
    private final Stream<BooleanExpression> exprs;

    public AllBooleanExpression(List<BooleanExpression> exprs) {
        this.exprs = Objects.requireNonNull(exprs).stream();
    }

    public AllBooleanExpression(Stream<BooleanExpression> exprs) {
        this.exprs = Objects.requireNonNull(exprs);
    }

    @Override
    public boolean evaluate() {
        return exprs.allMatch(BooleanExpression::evaluate);
    }
}
