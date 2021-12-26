package org.itacademy.javatesting.junit.n1exercici1;

import org.itacademy.javatesting.junit.n1exercici1.MesosFiller;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class MesosFillerTest {

    @Test
    public void fillMonths() {
        MesosFiller mesosFiller = new MesosFiller();
        ArrayList<String> mesos = mesosFiller.fillMonths();
        Assert.assertEquals(12, mesos.size());
        Assert.assertEquals("Agost", mesos.get(7));
    }
}