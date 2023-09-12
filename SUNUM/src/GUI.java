
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import static java.awt.SystemColor.window;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author izemd
 */
public class GUI extends JFrame{
    
    public JFrame frame=new JFrame("Labyrinth Game ");
    private Image icon= Toolkit.getDefaultToolkit().getImage("C:\\Users\\izemd\\OneDrive\\Masaüstü\\depositphotos_11494024-stock-illustration-maze.jpg");  
        private JTextField textfield=new JTextField();
   private  Font font =new Font("Arial",Font.PLAIN,20);
   private JPasswordField password=new JPasswordField();
    private JPanel panel=new JPanel();
   private  Container c=frame.getContentPane();
   private JLabel label=new JLabel("Please Choose a Problem");
   private JLabel label3=new JLabel("Welcome to My Labyrinth Game");
   private JLabel label2=new JLabel("I Have 2 Problem to Play Game");
   private JButton exitButon=new JButton("X");
   private JButton problem1=new JButton("Problem 1");
   private JButton problem2=new JButton("Problem 2");
   private JFrame frame2=new JFrame(); 
   private JButton calistir=new JButton();
   private JButton sonuc=new JButton();
   private Container c2=frame2.getContentPane();
   public int VERY=0;
 // private ImageIcon icon2=new ImageIcon("C:\\Users\\izemd\\OneDrive\\Masaüstü\\depositphotos_11494024-stock-illustration-maze.jpg");//icon2 resmi temsil ediyor
  
  private ImageIcon icon2=new ImageIcon("C:\\Users\\izemd\\OneDrive\\Masaüstü\\Maze-Print-101.png");//icon2 resmi temsil ediyor
  
  private JLabel Imagelabel2=new JLabel(icon2);
  private JLabel Imagelabel=new JLabel(icon2);
    public GUI() 
    {
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
frame.setUndecorated(false);

        frame.setIconImage(icon);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0, 0, 2000,800);
        frame.setLayout(null);
        panel.setBounds(480,0,525,1000);
        panel.setBackground(Color.black);
        panel.setLayout(null);
        
        problem1.setBounds(140,200,230,100);
        problem2.setBounds(140,400,230,100);
        
        problem1.setBackground(Color.white);
        problem2.setBackground(Color.white);
         
        problem1.setFont(font);
        problem2.setFont(font);
        problem1.setForeground(Color.BLACK);
        problem2.setForeground(Color.BLACK);
        
        label.setBounds(130,100,500,50);//panele eklediğinde paneldeki koordinatlar 0 lanır
        label.setForeground(Color.white);
        
        label.setFont(font);
        
        label2.setBounds(100,50,500,50);
        label2.setForeground(Color.white);
        label2.setFont(font);        
        label3.setBounds(100,0,500,50);
        label3.setForeground(Color.white);
        label3.setFont(font);
        
      //  Imagelabel.setBounds(500,0,icon2.getIconWidth(),icon2.getIconHeight());//sonra yerleştir
         Imagelabel.setBounds(0,0,500,1000);//sonra yerleştir
         Imagelabel2.setBounds(1000,0,800,1000);
        c.add(panel);
        c.add(Imagelabel);
        c.add(label);
        c.add(label2);
        c.add(label3);
        c.add(problem1);
        c.add(problem2);
        c.add(Imagelabel2);
       
        
        
       
        
        
        
        
        
        
        panel.add(label);
        panel.add(problem1);
        panel.add(label2);
        panel.add(label3);
        panel.add(problem2);
        
        
        problem1.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               //FURKAN BURDA BİR TRY CATCH MEKANİZMASI MURDU KENDİSİ SORUN OLURSA BURAYA BAK TEKRAR
               //1. problemin giriş sayfasının constractrını çağır buraya
               
               int sel=JOptionPane.showConfirmDialog(c,"1. url mi ?","Labirent Seçimi",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(sel==JOptionPane.YES_OPTION)
                {
                    MAİN main=new MAİN(0);
               main.setVisible(true);
              
               
                }
                if(sel==JOptionPane.NO_OPTION)
                {
                    
                    URL2 obstacle=new URL2();
                    obstacle.setVisible(true);
                }
                if(sel==JOptionPane.CANCEL_OPTION)
                {
                    System.exit(0);
                }
               
               
              
           }
              
                  
              });
        
        
        problem2.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e) {
               //FURKAN BURDA BİR TRY CATCH MEKANİZMASI MURDU KENDİSİ SORUN OLURSA BURAYA BAK TEKRAR
               //1. problemin giriş sayfasının constractrını çağır buraya
               
              
                String str=JOptionPane.showInputDialog("Enter Widht Value");
               String str2=JOptionPane.showInputDialog("Enter Height Value");
                
                    
                int number = Integer.parseInt(str);
               int number2 = Integer.parseInt(str2);
                
               
                
              
               TEMP temp2=new TEMP(number,number2);
              
               Problem2 main=new Problem2();
               //temp2.setVisible(true);
               BAK bak=new BAK();
               bak.setVisible(true);
              
           }
              
                  
              
        });
        frame.setVisible(true);
    }
   
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
