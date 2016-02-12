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
public class GUIOutput implements MessageWriter{
    
    @Override
    public void outputMessage(ArrayList<String> messages){
        for(String msg: messages){
            JOptionPane.showMessageDialog(null,msg);
        }
    }
    
}
