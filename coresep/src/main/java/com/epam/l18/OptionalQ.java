package com.epam.l18;

public class OptionalQ<T extends Number> {
    public T mark;

    public OptionalQ(T mark) {
        this.mark = mark;
    }

    public T getMark() {
        return mark;
    }

    public void setMark(T mark) {
        this.mark = mark;
    }

    public int roundMark() {
        return Math.round(mark.floatValue());
    }
    public boolean someAny(OptionalQ<? extends Number> ob) {
        return roundMark() == ob.roundMark();
    }

    public boolean same (OptionalQ<T> ob) {
        return getMark() == ob.getMark();
    }
    public static void main(String[] args) {

    }
}
