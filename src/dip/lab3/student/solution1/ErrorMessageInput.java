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
public class ErrorMessageInput implements MessageReader{

    private ArrayList<String> messages;
    
    @Override
    public void inputMessage(){       
        
        String response = JOptionPane.showInputDialog(null, "Enter message here:");
        messages.add(response);
    }
    
    @Override
    public ArrayList<String> getMessages(){
        return messages;
    }
}
