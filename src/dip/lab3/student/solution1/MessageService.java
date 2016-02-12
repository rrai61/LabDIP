/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author ritu
 */
public class MessageService {
    
    private MessageReader reader;
    private MessageWriter writer;
    
    public MessageService(MessageReader reader, MessageWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }
    
    public void inputMessage() {
        reader.inputMessage();
    }
    
    public void outputMessage() {
        writer.outputMessage(reader.getMessages());
    }
}
