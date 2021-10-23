package com.epam.l8;

public interface Pizza extends Payable, Checker{
    void wash();
    void cook();
    void delivery();

}
