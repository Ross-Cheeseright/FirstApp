package com.clearsimpledesign.firstapp;

import java.util.ArrayList;

class AsgardDate {
    int setDateNumberAsgard(int georgeDayOfYear){

        return georgeDayOfYear % 28;

    }

    private int asgardMonthNumber(int georgeDayOfYear)
    {
        return georgeDayOfYear / 28 +1;
    }

    String asgardMonthName(int georgeDayOfYear){
        ArrayList<String> al = new ArrayList<>();

        al.add("January");
        al.add("February");
        al.add("March");
        al.add("April");
        al.add("May");
        al.add("June");
        al.add("Asgard");
        al.add("July");
        al.add("August");
        al.add("September");
        al.add("October");
        al.add("November");
        al.add("December");
        al.add("Year Day!");

        return al.get(asgardMonthNumber(georgeDayOfYear)-1);

    }

    String asgardDayName(int weekDay){
        ArrayList<String> al = new ArrayList<>();

        al.add("Sunday");
        al.add("Monday");
        al.add("Tuesday");
        al.add("Wednesday");
        al.add("Thursday");
        al.add("Friday");
        al.add("Saturday");

        return al.get(weekDay-1);
    }
}
