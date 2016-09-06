package com.barbaros.firstexamples;

/**
 * Created by Bar-Mel on 6.09.2016.
 */
@FunctionalInterface
public interface Converter<F, T> {

        T convert(F from);

}
