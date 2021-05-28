package ru.novemis.cards.common;

import java.util.function.Supplier;

public class Lazy<T> {
    private T value;

    private Supplier<T> supplier;

    public static Lazy lazy(Supplier supplier) {
        return new Lazy(supplier);
    }

    private Lazy(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public T get() {
        if (value == null) {
            value = supplier.get();
        }

        return value;
    }
}
