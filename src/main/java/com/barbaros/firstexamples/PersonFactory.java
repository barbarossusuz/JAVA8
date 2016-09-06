package com.barbaros.firstexamples;

/**
 * Created by Bar-Mel on 6.09.2016.
 */
interface PersonFactory<P extends Person> {
    P create(String firstName, String lastName);
}