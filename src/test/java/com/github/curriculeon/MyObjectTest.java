package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MyObjectTest {
    @Test
    public void testArrayOfPerson() {
        // given
        int key = 1;
        Person person1 = new Person("Leon");
        Person expected = new Person("Hunter");
        Person[] personArray = new Person[2];
        personArray[0] = person1;
        personArray[1] = expected;

        // when
        Person actual = personArray[key];

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMapIntegerToPerson() { // TODO
        Map<Integer, Person> map = new HashMap<>();

    }

    @Test
    public void testMapPhoneNumberToPerson() { // TODO
    }
}
