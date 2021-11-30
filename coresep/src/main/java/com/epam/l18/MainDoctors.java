package com.epam.l18;

import java.util.ArrayList;
import java.util.List;

public class MainDoctors {
    public static void main(String[] args) {
        //List<? extends Doctor> list = new ArrayList<MedicalStaff>();  // error compilation
        List<? extends Doctor> list = new ArrayList<>(); // тут мы можем добавлять потомков, но не можем добавлять родителей
        List<? extends Doctor> list2 = new ArrayList<HeadDoctor>(); // тут мы можем добавлять потомков, но не можем добавлять родителей
       // list2.add(new Doctor()); // error compilation  // тут мы не можем добавлять потомков, но можем добавлять родителей
       // list2.add(new HeadDoctor()); // error compilation // тут мы не можем добавлять потомков, но можем добавлять родителей

        //List<? super Doctor> list5 = new ArrayList<HeadDoctor>();
        List<? super Doctor> list3 = new ArrayList<Doctor>();
        List<? super Doctor> list4 = new ArrayList<MedicalStaff>();
        List<? super Doctor> list6 = new ArrayList<Object>();

//        list4.add(new Object());
//        list4.add(new MedicalStaff());
        list4.add(new Doctor());
        list4.add(new HeadDoctor());

        Object object = list4.get(0);
        MedicalStaff medicalStaff = (MedicalStaff) list4.get(0);

    }
}
