/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.ArrayList;

/**
 *
 * @author ritu
 */
public class ConsoleOutput implements Writer{
    
    @Override
    public void outputMessage(ArrayList<String> messages){
        System.out.println();
    }
    
}
