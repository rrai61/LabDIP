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
public class RandomTipMessageInput implements MessageReader {
    private ArrayList<String> messages = new ArrayList<String>();
    
    @Override
    public void inputMessage() {
        System.out.println("Please enter a random tip for the day: ");
        
        Scanner scan = new Scanner(System.in);
        String tip = scan.nextLine();
        messages.add(tip);
    }
    
    @Override
    public ArrayList<String> getMessages() {
        return messages;
    }
}
