/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ritu
 */
public class Startup {
    public static void main (String args[]) {
        
        MessageReader tipInput = new RandomTipMessageInput();
        MessageWriter console = new ConsoleMessageOutput();
        
        MessageService messgr = new MessageService(tipInput, console);
        
        messgr.inputMessage();
        messgr.outputMessage();
    }
}