package org.example;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        List<Integer> integers = List.of(1, 2, 3, 4, 5);

        for (String i = 1; i <= 5; i++) {


            System.out.println("i = " + i);
        }

        for (int i = 0; i < integers.size(); i++) {

            System.out.println("integers.get(i) = " + integers.get(i));

        }
    }
}