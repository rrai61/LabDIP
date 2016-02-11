/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ritu
 */
public class RandomTipInput {
    ArrayList<String> messages;
    Scanner scan = new Scanner(System.in);
    
    public void inputMessage(String message) {
        System.out.println("Please enter a random tip for the day: ");
        messages.add(scan.nextLine());
    }
}
