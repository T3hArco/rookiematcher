/*
 * Copyright Arnaud Coel (c) 2018.
 * Licensed by https://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package me.arco.rookiematcher.dummy;

import me.arco.rookiematcher.model.Person;

import java.util.ArrayList;

public class DummyPersonProvider
{

    /**
     * Provides an ArrayList of dummy people
     * @return ArrayList of Person
     */
    public static ArrayList<Person> provide()
    {
        ArrayList<Person> output = new ArrayList<Person>();

        output.add(new Person("arnaud.coel", true));
        output.add(new Person("laura.peeraer", true));
        output.add(new Person("cina.farazdaghi", true));

        output.add(new Person("b.certyn", false));
        output.add(new Person("jawad.tallih", false));
        output.add(new Person("alexandre.carrot", false));
        output.add(new Person("m.hella", false));
        output.add(new Person("r.van.den.abeele", false));
        output.add(new Person("robbe.berrevoets", false));

        return output;
    }
}
