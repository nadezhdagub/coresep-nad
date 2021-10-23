package com.epam.l8;

import java.util.Date;

public class InterClone implements Cloneable{
    private Integer codeName;
    private Date date = new Date();

    @Override
    public Object clone() throws CloneNotSupportedException {
        InterClone obj = null;
        obj = (InterClone) super.clone();

        if(null != this.date) {
            obj.date = (Date) this.date.clone();
        }
        return obj;
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        InterClone interClone = new InterClone();
        interClone.date = new Date();

        InterClone interClone1 = (InterClone) interClone.clone();
        System.out.println(interClone1.date);
    }
}
