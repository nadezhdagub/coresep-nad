package com.epam.l8;

public class PizzaRunner {
    private Pizza pizza; // ссылка интерфейса
    private Pizza pizzaS;
    private Pizza piz;
    public static void main(String[] args) {
        PizzaRunner runner = new PizzaRunner();
        runner.getPizzaInfo();
    }

    private void getPizzaInfo() {
        if (true) {
            piz = new PizzaInMoscow();
        } else {
            piz = new PizzaSPB();
        }
        pizza = new PizzaInMoscow();
        pizzaS = new PizzaSPB();
        pizza.wash();
        pizza.cook();
        pizza.delivery();
    }
}
