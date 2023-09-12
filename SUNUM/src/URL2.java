
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author izemd
 */
public class URL2 extends JFrame{
    
    
    
      public URL2()
      {
          
        Font font =new Font("Arial",Font.PLAIN,20);
         setSize(2000,800);
      setExtendedState(JFrame.MAXIMIZED_BOTH); 
        GridURL2 an=new GridURL2();
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
   
 
               
               
              
        //   }
              
                  
          //    });
     
     
     
     add(an);
     
     
      
      
    
        
      }
}
