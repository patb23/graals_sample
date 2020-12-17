package com.example.demo.serverless;

import com.example.demo.beans.Bar;
import com.example.demo.beans.Foo;

import java.util.function.Function;

public class UpperCase implements Function<Foo, Bar> {
    @Override
    public Bar apply(Foo foo) {
        return new Bar(foo.getValue());
    }
}
