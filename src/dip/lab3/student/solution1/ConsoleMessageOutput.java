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
public class ConsoleMessageOutput implements MessageWriter{
    
    @Override
    public void outputMessage(MessageReader inputReader){
        ArrayList<String> messages = inputReader.getMessages();
        for (String msg: messages){
            System.out.println(msg);
        }
    }
    
}
