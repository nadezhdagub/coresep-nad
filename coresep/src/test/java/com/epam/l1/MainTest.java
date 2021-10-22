package com.epam.l1;

import com.epam.l7.Barsik;
import com.epam.l7.Cat;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MainTest {
    private Cat cat = new Cat();

    {
        Barsik barsik = new Barsik();
        barsik.setName("barsik");
    }

    @Before
    public void setup() {

    }

    @BeforeClass
    public static void init() {

    }

    @Test
    public void getCatName(){
        Assert.assertEquals("barsik", cat.getCatName());
    }

}
