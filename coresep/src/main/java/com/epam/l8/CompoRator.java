package com.epam.l8;

import java.util.Comparator;

public class CompoRator  implements Comparator<Geomrtric> {
    public static void main(String[] args) {

    }

    @Override
    public int compare(Geomrtric o1, Geomrtric o2) {
        double area1 = o1.getArea();
        double area2 = o1.getArea();

        if(area1 < area2) {
            return -1;
        } else if(area1 == area2) {

            return 0;
        } else {
            return 1;
        }
    }
}
