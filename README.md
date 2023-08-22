# EnterpriseBooleanExprs

Tired of writing stuff like `boolean x = a && !(b && c)`?
Well now you can write
```java
BooleanExpression expression = BooleanExpressionBuilder
        .atom(a)
        .and(BooleanExpressionBuilder
                .atom(b)
                .and(c)
                .negate())
        .build();

boolean x = expression.evaluate();
```

instead.\
Much more readable.\
Much more robust.\
Much more enterprise.\
Much more production ready.

# Why?

I am procrastinating writing a job application.
Someone had this idea in Discord.
I also thought this would be funny.

# Is this published for maven/gradle?

No.

... Why do you ask?
