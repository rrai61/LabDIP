/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;
import java.util.Scanner;

/**
 *
 * @author ritu
 */
public class Startup {
    public static void main (String args[]) {
        
        Reader tipInput = new RandomTipInput();
        Writer console = new ConsoleOutput();
        
        Messager messgr = new Messager(tipInput, console);
        
        messgr.inputMessage();
        messgr.outputMessage();
    }
}