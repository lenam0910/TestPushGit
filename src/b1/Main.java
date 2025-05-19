/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author THIS PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
        Input inputMethod = new Input();
        int number = inputMethod.inputNumber();
//        System.out.println(number);
        inputMethod.showNumber(number);
        System.out.println("-----------");
        System.out.println("-----------");
        System.out.println("-----------");
        Show j97 = new Show();
        j97.showSong();
    }

    public static class Show {

        public void showSong() {
            System.out.println("Thien ly oi !!!");
        }
    }

    public static class Input {

        //access Modifier type name 
        public int inputNumber() {
            Scanner input = new Scanner(System.in);
            do {
                try {
                    System.out.print("Enter Number: ");
                    int enter = Integer.parseInt(input.nextLine()); // 3
                    if (enter >= 100 && enter <= 500) {
                        return enter;
                    }
                    System.out.println("Invalid please enter number from 100<=x" + "<=500");
                } catch (Exception e) {
                    System.out.println("ERROR NUMBER");
                }
            } while (true);
        }
        
        public void showNumber(int number){
            System.out.println("NUMBER SHOW: " + number);
        }
    }

}
