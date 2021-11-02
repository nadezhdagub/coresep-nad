package com.epam.l14;

public class Calc implements CalcService {
    private CalcService calcService;

    public Calc(CalcService calcService) {
        this.calcService = calcService;
    }

    public double sum(double val1, double val2) {
        return calcService.sum(val1, val2);
    }

    public double devide(double val1, double val2) {
        return calcService.devide(val1, val2);
    }
}
