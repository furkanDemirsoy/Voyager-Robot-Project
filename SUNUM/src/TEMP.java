
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author izemd
 */
public class TEMP extends JPanel{
    private  int Width; // width in pixels
	public   int Height; // height in pixels
     
         private Obstacle an;
         
  public TEMP(int w,int h)
  {
      Font font =new Font("Arial",Font.PLAIN,20);
       this.Width=w;
   this.Height=h;
    initialize(); 
 //  Problem2 b=new Problem2();
     
        
     
   // add(b);
  //   buton.addActionListener(new ActionListener(){
    //       @Override
      //     public void actionPerformed(ActionEvent e) {//YANİ BURASI GUI DİR ASLINDA
               //FURKAN BURDA BİR TRY CATCH MEKANİZMASI MURDU KENDİSİ SORUN OLURSA BURAYA BAK TEKRAR
               //1. problemin giriş sayfasının constractrını çağır buraya
               
             //  TEMP r=new TEMP();
              // r.setBounds(100, 200, 500,500);
               //r.setVisible(true);
               
              
              
        //   }
              
                  
          //    });
     
     
     
     
     
  }
  
  private void initialize() {
	 this.an= new Obstacle(Width, Height, 10);
	}
  public void m()
  {
     TEMP game = new TEMP(Width,Height);
  }

}
