package com.barbaros.firstexamples;

/**
 * Created by Bar-Mel on 6.09.2016.
 */
public interface Developer {
    double calculate(int a);
    default double sqrt(int a) {
        return Math.sqrt(a);
    }

}
