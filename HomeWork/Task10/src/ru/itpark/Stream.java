package ru.itpark;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public interface Stream<T> {


    Stream filter(Predicate<T> predicate);

    Stream foreach(Consumer<T> consumer);

    <R> Stream map(Function<T,R> function);

}
