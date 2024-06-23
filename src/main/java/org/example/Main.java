package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");

        for (String i = 1; i <= 5; i++) {

            new JavaClass().print(i);

            System.out.println("i = " + i);
        }
    }
}