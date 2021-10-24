package com.epam.l11;

import com.epam.l7.Barsik;

public class Cat implements Cloneable{
    private int age;
    private String name;
    private int height;
    private final int weight;

    {
        weight = 12;
    }
    public Cat(String a) {
        height = 10;
    }

    public static void main(String[] args) {
        Cat barsic = new Cat("MAMA");
        //0
        System.out.println(barsic.age);
        //null
        System.out.println(barsic.name);
    }

    //@Autowired
    private Barsik barsik;     // будет проблема, потому что у наса изначально barsik = null и поменять не можем. Избежать это может помочь блок инициализации, но крайне не рекомендуется, есть более целесообразные способы

    public String getCatName() {
        return barsik.getName();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
