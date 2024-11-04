/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.baitap;

/**
 *
 * @author Admin
 */
public class baitap1 {
     public static void main(String[] args) {
        String chan = "";
        String le = "";

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                chan += i + " ";
            } else {
                le += i + " ";
            }
        }

        System.out.println("So chan tu 1 den 100 la : " + chan);
        System.out.println("So le tu 1 den 100 la : " + le);

    }
}
