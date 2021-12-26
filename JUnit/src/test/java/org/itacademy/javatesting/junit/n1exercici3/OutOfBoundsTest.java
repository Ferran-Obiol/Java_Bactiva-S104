package org.itacademy.javatesting.junit.n1exercici3;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OutOfBoundsTest {

    @Test
    public void runArray() {
        OutOfBounds outOfBounds = new OutOfBounds();
        Exception exception = Assert.assertThrows(ArrayIndexOutOfBoundsException.class, outOfBounds::runArray);

        Assertions.assertEquals(exception.getClass(), ArrayIndexOutOfBoundsException.class);
    }
}