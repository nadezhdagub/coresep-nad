package com.epam.l7;

public class Murzik {
    public synchronized String getIceCream() { //доступ не ко всему лотку мороденного,
                                               // а только к одной штуке, это делает synchronized
        return "you get Ice Cream";
    }
}
