package com.tylerbrady34gmail.fitness;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void testMakeUser() {
        User myUser;
        myUser = new User("Tre", 24, 100, 165, true);
        assertEquals(myUser.getName(),"Tre");
        assertNotEquals(myUser.getAge(),30);
    }

    @Test
    public void testMakeExercises() {
        //TODO each type, use IExercise
    }

    @Test
    public void testMakeWorkout() {
        //TODO
    }
}