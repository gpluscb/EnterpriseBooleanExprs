package com.github.gpluscb.builder;

import com.github.gpluscb.boolean_expression.*;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class BooleanExpressionBuilder {
    private BooleanExpression current;

    public BooleanExpressionBuilder(BooleanExpression startExpression) {
        current = Objects.requireNonNull(startExpression);
    }

    public static BooleanExpressionBuilder atom(boolean value) {
        return new BooleanExpressionBuilder(new AtomBooleanExpression(value));
    }

    public static BooleanExpressionBuilder all(List<BooleanExpression> exprs) {
        return new BooleanExpressionBuilder(new AllBooleanExpression(Objects.requireNonNull(exprs)));
    }

    public static BooleanExpressionBuilder all(Stream<BooleanExpression> exprs) {
        return new BooleanExpressionBuilder(new AllBooleanExpression(Objects.requireNonNull(exprs)));
    }

    public static BooleanExpressionBuilder none(List<BooleanExpression> exprs) {
        return new BooleanExpressionBuilder(new NoneBooleanExpression(Objects.requireNonNull(exprs)));
    }

    public static BooleanExpressionBuilder none(Stream<BooleanExpression> exprs) {
        return new BooleanExpressionBuilder(new NoneBooleanExpression(Objects.requireNonNull(exprs)));
    }

    public BooleanExpressionBuilder and(BooleanExpression other) {
        current = new AndBooleanExpression(current, Objects.requireNonNull(other));
        return this;
    }

    public BooleanExpressionBuilder or(BooleanExpression other) {
        current = new OrBooleanExpression(current, Objects.requireNonNull(other));
        return this;
    }

    public BooleanExpressionBuilder xor(BooleanExpression other) {
        current = new XorBooleanExpression(current, Objects.requireNonNull(other));
        return this;
    }

    public BooleanExpressionBuilder negate() {
        current = new NegateBooleanExpression(current);
        return this;
    }

    public BooleanExpression build() {
        return current;
    }
}
