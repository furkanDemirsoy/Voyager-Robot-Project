


import com.formdev.flatlaf.themes.FlatMacDarkLaf;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Dictionary;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author izemd
 */
public class MAİN extends JFrame{
   
    
      public MAİN(int a)
      {
          Font font =new Font("Arial",Font.PLAIN,20);
         setSize(2000,800);
      setExtendedState(JFrame.MAXIMIZED_BOTH); 
      if(a==0)
      {
          
      
        Grid an=new Grid();
        setUndecorated(false);
        // setBackground(Color.yellow);
        an.buton.setFont(font);
        an.buton.setForeground(Color.white);
     an.buton.setLayout(null);
     an.buton.setBounds(1000,200,200,100);
     
     an.buton2.setFont(font);
        an.buton2.setForeground(Color.white);
     an.buton2.setLayout(null);
     an.buton2.setBounds(1000,300,200,100);
     add(an.buton);
     add(an.buton2);
   
  
     
     
     
     add(an);
     
     
     
      }
       if(a==5)
      {
          
      
       Grid an=new Grid();
        setUndecorated(false);
        // setBackground(Color.yellow);
        an.buton.setFont(font);
        an.buton.setForeground(Color.white);
     an.buton.setLayout(null);
     an.buton.setBounds(1000,200,200,100);
     
     an.buton2.setFont(font);
     
        an.buton2.setForeground(Color.white);
     an.buton2.setLayout(null);
     an.buton2.setBounds(1000,300,200,100);
     add(an.buton);
     add(an.buton2);
   
  
     
     
     
     add(an);
     
     
     
      }
     
     
     
     
     
     
      
      
        
      }
        
       
       
        
        
     public static void main(String[] args) {
        
          try {
             
              UIManager.setLookAndFeel(new FlatMacDarkLaf());//rengini benim belirlediğim şeylere dokunamıo renksiz olan şeyleri alıo
          } catch (UnsupportedLookAndFeelException ex) {
              Logger.getLogger(MAİN.class.getName()).log(Level.SEVERE, null, ex);
          }

        GUI guı=new GUI();
       
        
        
    }

  

}
