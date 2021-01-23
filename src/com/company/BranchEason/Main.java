package com.company.BranchEason;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("what is your city");
        String city =input.nextLine();
        System.out.println(city);

        int zip =43215;
        int dailyHighs[] ={32,25,27,40,45};
        float aveT=(dailyHighs[0]+dailyHighs[1]+dailyHighs[2]+dailyHighs[3]+dailyHighs[4])/5f;

        System.out.println("City: "+city+" Zip code: "+zip+" Average high tempature: "+aveT);
    }
}
