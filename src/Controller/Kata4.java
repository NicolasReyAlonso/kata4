/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Histogram;
import Model.Mail;
import View.HistogramDisplay;
import View.MailHistogramBuilder;
import View.MailListReader;
import java.util.List;

/**
 *
 * @author nicolasreyalonso
 */
public class Kata4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String fileName = "/Users/nicolasreyalonso/NetBeansProjects/kata4/email.txt";
        List <Mail> a = MailListReader.read(fileName); 
        Histogram<String> b = MailHistogramBuilder.build(a);
        HistogramDisplay hist = new HistogramDisplay(b);
        hist.execute();
    }
    
}
