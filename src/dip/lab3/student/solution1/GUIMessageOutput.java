/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author ritu
 */
public class GUIMessageOutput implements MessageWriter{
    private String msgs;
    
    @Override
    public void outputMessage(MessageReader inputReader){
        ArrayList<String> messages = inputReader.getMessages();
        for(String msg: messages){
            msgs += msg + " ";
        }
        JOptionPane.showMessageDialog(null,msgs);
        System.exit(0);
    }
    
}
