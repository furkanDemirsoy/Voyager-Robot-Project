
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;
//import java.util.concurrent.Executors;
//import java.util.concurrent.ScheduledExecutorService;
//import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.Timer;
import javax.swing.event.ChangeListener;
//import java.util.TimerTask;
//import java.util.Timer;
//import java.util.TimerTask;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author izemd
 */
public class GridURL2 extends JPanel implements ActionListener{
     public JFrame frame=new JFrame();
    private Container c=frame.getContentPane();
    private Font font=new Font("Arial",Font.PLAIN,30);
    private Font font2=new Font("Arial",Font.PLAIN,15);
private JLabel label=new JLabel("34");
private Image ımage=new ImageIcon("C:\\Users\\izemd\\OneDrive\\Masaüstü\\bakalkskj.png").getImage();
public Coordinate coordinate[];

public int sumSquare;   
public int numberStart=0;
public int numberFinish;
public Coordinate temp=new Coordinate();
public JButton buton=new JButton("Çalıştır");    
public JButton buton2=new JButton("Sonuç Göster");  
     private int x, y;
    private final int DELTA = 5; // Change in position
    private Image image;
    private Timer timer;  
  private int kontrol=0;
  Robot robot=new Robot();
  Stack stack=new Stack();
  private int degisken=0;
 private Graph graph = new Graph(true, false);
 private Dijkstra dijkstra2=new Dijkstra();
 private Vertex vertex[];
private  int vertexnumber=0;
private int il=0;
private  int[] array6;
private int shadow=0;
public long startTime=0;
public long endTime=0;
public long totalTime=0;
private int timecounter=0;
public int squarenumber=0;
 private File myObj2 = new File("EnKısaYol.txt");
  public GridURL2()
  {
      
         
          
              
          
              
                  
              
          
              this.x=2500;
        this.y =0;
          
              
      
      vertex=new Vertex[10000];
        image = getImage(); // Get the image to be drawn
        timer = new Timer(100, this); // Create a timer with a 3 second delay
        
       startTime = System.currentTimeMillis();
               
       // timer.start(); // Start the timer
          
  }
      
             
  
  
  
  
  
  
  
     @Override
    public void paint(Graphics g)
    {
        super.paint(g);
         buton.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                      shadow=1;
                      timer.start(); 
                      
                  }
              });
          buton2.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                      
                   timecounter=1;
                   
                    // g.drawString(totalTime, 1000, 500);
                    System.out.println("Execution time in milliseconds  : " + totalTime);
                  }
              });
          
              
          if(squarenumber!=0)
          {
              
          
              g.setColor(Color.red);
              g.setFont(font);
           totalTime = endTime - startTime;
           totalTime=totalTime/1000;
                    String s=String.valueOf(totalTime);
                    g.drawString("Zaman:", 1100, 600);
         g.drawString(s, 1200, 600);
          }
          if(squarenumber!=0)
          {
              String h=String.valueOf(squarenumber);
              g.drawString("Kare:",1100 , 500);
              g.drawString(h, 1200, 500);
          }
          
      

    
    
        
       int CoordinateHandlerX[];
       int CoordinateHandlerY[];
       
        Random StartPoint=new Random();
        Random FinishPoint=new Random();
        Coordinate nesne=new Coordinate();
      //  Coordinate temp=new Coordinate();
       
        
        int st;
        int satirsayac=0; 
        int numberofZero=0;//0
        int numberofOne=0;//1
        int numberofTwo=0;//2
        int numberofThree=0;//3
        int i=0;
       coordinate=new Coordinate[10000];//10000 nesne oluşturucak şekilde ayarlandı
         try {
            int x= 0;
            int y=100;
            
            
            
            
            
            
          //  URL  url=new URL("http://bilgisayar.kocaeli.edu.tr/prolab2/url1.txt");
             
             String jkl="http://bilgisayar.kocaeli.edu.tr/prolab2/url2.txt";
             
             
              
               
             
             
             URL  url=new URL(jkl);
             
             
             
             
             
             
             
             
        BufferedReader read=new BufferedReader(new InputStreamReader(url.openStream()));
        
        int kl=0;
        char[] dizi;
        String mk;
        while ((mk = read.readLine()) != null)
        {
            satirsayac=satirsayac+30;
                     x=0;
            System.out.println(i);
           dizi= mk.toCharArray();
           for(char lk:dizi)
           {
               st=lk;
              // System.out.println("ALLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL    "+st);
           
        
        
        
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            //satır satır oluştur 10 ve 13 ü görene kadar oluştur sonra da y yi değiştir ve alt satıra geçsinler
             
                 
                
                 x=x+30;
                 if(shadow==0)
                 {
                     
                 
                 g.drawRect(x,satirsayac,30,30);
                 }
                 if(st==49)
                 {
                     g.setColor(Color.darkGray);
                     numberofOne++;
                     
                      coordinate[i]=new Coordinate();
             coordinate[i].setX(x);
             coordinate[i].setY(satirsayac);
             coordinate[i].setId(i);
             temp.Obstacle1XY.add(coordinate[i]);//1 nolu engellerin listesi
             i++;
                     
                 }
                 if(st==48)
                 {
                     g.setColor(Color.WHITE);
                     numberofZero++;
                      coordinate[i]=new Coordinate();
             coordinate[i].setX(x);
             coordinate[i].setY(satirsayac);
             coordinate[i].setId(i);
             temp.PassObjectXY.add(coordinate[i]);//0 olanları passobjevt listesinde tutuyoruz
             i++;
                     
                 }
                 if(st==50)
                 {
                     g.setColor(Color.darkGray);
                     numberofTwo++;
                      coordinate[i]=new Coordinate();
             coordinate[i].setX(x);
             coordinate[i].setY(satirsayac);
             coordinate[i].setId(i);
             temp.Obstacle2XY.add(coordinate[i]);
             i++;
                 }
                 if(st==51)
                 {
                     g.setColor(Color.darkGray);
                     numberofThree++;
                      coordinate[i]=new Coordinate();
             coordinate[i].setX(x);
             coordinate[i].setY(satirsayac);
             coordinate[i].setId(i);
             temp.Obstacle3XY.add(coordinate[i]);
             i++;
                 }
                
                     
                 if(shadow==0)
                 {
                     
                 
                 g.fillRect(x, satirsayac,29,29);
                 }
               
             }
        }
         read.close();
              sumSquare=numberofThree+numberofTwo+numberofZero+numberofOne;
             
             
             
              
           
             
             
             for(int m=0;m<sumSquare;m++)
             {
                 
             
            temp.AllObjectXY.add(coordinate[m]);
            
             
             
             System.out.println("Nesne X Y  :"+coordinate[m].getId()+"X: "+coordinate[m].getX()+" Y : "+coordinate[m].getY());
             
             }
             
             System.out.println(temp.PassObjectXY.get(0).getId());//furkan unutma i 0 dan başladığı için İD numaraları da 
             //EKLENME SIRASININ 1 EKSİĞİDİR YANİ İD=12 İS O 13. OLARAK EKLENMİŞ KUTUDUR
             //listelere nesneler eklendi
             
          //BUTON EKLEYEBİLİYORSUN GÖLGELEMEYİ BU SAYEDE YAP   
        int yuı=78;
             
             if(temp.Start.isEmpty())//FURKAN UNUTMAAAAAAAAAAAAA TİMER İF LERE GİREMEZ!!!!!!!!!!!!!!!!! KOŞULU SAĞLAMIYORSA
             {
             Random random=new Random();
             
             int p=temp.PassObjectXY.size();
            numberStart=  random.nextInt(p);//Passobjectxy dizisinden random seçilecek index
           
            numberFinish=random.nextInt(p);////Passobjectxy dizisinden random seçilecek index
           while(numberStart==numberFinish)
           {
               numberStart=  random.nextInt(p);
           
           numberFinish=random.nextInt(p);
           }
           temp.Start.add(numberStart);
           temp.Finish.add(numberFinish);
             }
         //  Robot robot=new Robot(temp.Start,temp.Finish,temp.Obstacle1XY,temp.PassObjectXY,temp.Obstacle2XY,temp.Obstacle3XY,temp.AllObjectXY);
           
           
           g.setColor(Color.GREEN);
           g.setFont(font2);
             g.fillRect(temp.PassObjectXY.get(numberStart).getX(),temp.PassObjectXY.get(numberStart).getY(),29,29);
             g.setColor(Color.BLACK);
             g.drawString("B", temp.PassObjectXY.get(numberStart).getX()+10, temp.PassObjectXY.get(numberStart).getY()+20);
             if(temp.seenListShadow.isEmpty())
             {
                 
             
             g.setColor(Color.red);
             g.fillRect(temp.PassObjectXY.get(numberFinish).getX(),temp.PassObjectXY.get(numberFinish).getY(),29,29);
             g.setColor(Color.WHITE);
             g.drawString("H", temp.PassObjectXY.get(numberFinish).getX()+10, temp.PassObjectXY.get(numberFinish).getY()+20);
             }
           
             //ROBOTUMUZUN ÇİZİM FONKSİYONU
             //BAŞLANGIÇ NOKTASINDAN X OLARAK 60 SAĞINA YERLEŞSİN DİYE KOYDUM BUNU DEĞİŞTİR TABİ Kİ DE
             /*
            Timer timer=new Timer(1000,new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    
                    
                   g.drawImage(ımage,temp.PassObjectXY.get(numberStart).getX(),temp.PassObjectXY.get(numberStart).getY(),29,29,frame);
                    
                    
                    
                    
                    revalidate();
                  repaint();
                  
                }
                
            });
            timer.start();
*/
            
            
                
     
        
              // Create a Timer object with a delay of 3000 milliseconds (3 seconds)
 
           
           
             
             System.out.println("Toplam kare  :"+sumSquare);
             
            
             //------------------------GÖLGELEME BÖLGESİİİİ--------------------------------------------------
             
          // g.drawImage(ımage,this.x,this.y,29,29,frame);
           
          
          
          int aRS=-5;
        int aLS=-5;
        int aUS=-5;
        int aDS=-5;
        
        int cURS=-5;
        int cULS=-5;
        int cDLS=-5;
        int cDRS=-5;
        
       
       
       
        for(int lkj=0;lkj<temp.AllObjectXY.size();lkj++)
       {
           if(robot.Left(this.x)==temp.AllObjectXY.get(lkj).getX()&&this.y==temp.AllObjectXY.get(lkj).getY())
           {
              
               aLS= temp.AllObjectXY.get(lkj).getId();
              
               
                   
                 
                   temp.seenListShadow.add(aLS);
               
                break;
                
           }
       }
          
         for(int lkj=0;lkj<temp.AllObjectXY.size();lkj++)
       {
           if(robot.Right(this.x)==temp.AllObjectXY.get(lkj).getX()&&this.y==temp.AllObjectXY.get(lkj).getY())
           {
               aRS= temp.AllObjectXY.get(lkj).getId();
              
               
                   
                 
                   temp.seenListShadow.add(aRS);
                   break;
                
           }
       }
          for(int lkj=0;lkj<temp.AllObjectXY.size();lkj++)
       {
           if(robot.up(this.y)==temp.AllObjectXY.get(lkj).getY()&&this.x==temp.AllObjectXY.get(lkj).getX())
           {
               aUS= temp.AllObjectXY.get(lkj).getId();
              
               
                   
                 
                   temp.seenListShadow.add(aUS);
                   break;
                
           }
       }
          
           for(int lkj=0;lkj<temp.AllObjectXY.size();lkj++)
       {
           if(robot.down(this.y)==temp.AllObjectXY.get(lkj).getY()&&this.x==temp.AllObjectXY.get(lkj).getX())
           {
               aDS= temp.AllObjectXY.get(lkj).getId();
              
               
                   
                 
                   temp.seenListShadow.add(aDS);
                   break;
                
                
           }
       }
           int[] graphArray;//CORNERUPLEFT
           graphArray=robot.cornerUpLeft(this.x, this.y);
           for(int lkj=0;lkj<temp.AllObjectXY.size();lkj++)
           {
               if(graphArray[0]==temp.AllObjectXY.get(lkj).getX()&&graphArray[1]==temp.AllObjectXY.get(lkj).getY())
               {
                    cULS= temp.AllObjectXY.get(lkj).getId();
              
               
                   
                 
                   temp.seenListShadow.add(cULS);
                   break;
               }
           }
           
            int[] graphArray2;//CORNERUPRİGHT
           graphArray2=robot.cornerUpRight(this.x, this.y);
           for(int lkj=0;lkj<temp.AllObjectXY.size();lkj++)
           {
               if(graphArray2[0]==temp.AllObjectXY.get(lkj).getX()&&graphArray2[1]==temp.AllObjectXY.get(lkj).getY())
               {
                    cURS= temp.AllObjectXY.get(lkj).getId();
              
               
                   
                 
                   temp.seenListShadow.add(cURS);
                   break;
               }
           }
           
           int[] graphArray3;//CORNERDOWNLEFT
           graphArray3=robot.cornerDownLeft(this.x, this.y);
           for(int lkj=0;lkj<temp.AllObjectXY.size();lkj++)
           {
               if(graphArray3[0]==temp.AllObjectXY.get(lkj).getX()&&graphArray3[1]==temp.AllObjectXY.get(lkj).getY())
               {
                    cDLS= temp.AllObjectXY.get(lkj).getId();
              
               
                   
                 
                   temp.seenListShadow.add(cDLS);
                   break;
               }
           }
           
           int[] graphArray4;//CORNERDOW
           graphArray4=robot.cornerDownRight(this.x, this.y);
           for(int lkj=0;lkj<temp.AllObjectXY.size();lkj++)
           {
               if(graphArray4[0]==temp.AllObjectXY.get(lkj).getX()&&graphArray4[1]==temp.AllObjectXY.get(lkj).getY())
               {
                   cDRS= temp.AllObjectXY.get(lkj).getId();
              
               
                   
                 
                   temp.seenListShadow.add(cDRS);
                   break;
                   
               }
           }
          
          
          if(!temp.seenListShadow.isEmpty())
          {
              
          
          
           for(int asdf=0;asdf<temp.seenListShadow.size();asdf++)
             {
                 for(int opy=0;opy<temp.AllObjectXY.size();opy++)
                 {
                      if(temp.seenListShadow.get(asdf)==temp.AllObjectXY.get(opy).getId())
                      {
                          
                                  g.drawRect(temp.AllObjectXY.get(opy).getX(), temp.AllObjectXY.get(opy).getY(),30,30);
                                 int controlColor=0;
                                 for(int lkjh=0;lkjh<temp.PassObjectXY.size();lkjh++)
                                 {
                                     if(temp.PassObjectXY.get(lkjh).getId()==temp.AllObjectXY.get(opy).getId())//bu bir passobjectdir
                                     {
                                        controlColor=1;//bu bir passobjectdir
                                        break;
                                     }
                                 }
                                 if(controlColor==1)
                                 {
                                     g.setColor(Color.WHITE);
                                 }
                                 if(controlColor==0)
                                 {
                                     g.setColor(Color.darkGray);
                                 }
                                 g.fillRect(temp.AllObjectXY.get(opy).getX(), temp.AllObjectXY.get(opy).getY(), 29,29);
                      }
                 }
                 
             }
          }
          
          g.setColor(Color.GREEN);
          g.fillRect(temp.PassObjectXY.get(numberStart).getX(),temp.PassObjectXY.get(numberStart).getY(),29,29);
             g.setColor(Color.BLACK);
             g.drawString("B", temp.PassObjectXY.get(numberStart).getX()+10, temp.PassObjectXY.get(numberStart).getY()+20);
          
          
          
          
          
          
           for(int ghj=1;ghj<temp.arraylistVisitedX.size();ghj++)
           {
               g.setColor(Color.CYAN);
            g.fillRect(temp.arraylistVisitedX.get(ghj), temp.arraylistVisitedY.get(ghj), 29, 29);
           
           }
           g.drawImage(ımage,this.x,this.y,29,29,frame);
         //  g.setColor(Color.red);
            // g.fillRect(stack.arraylistVisited.get(stack.arraylistVisited.size()-1).getX(), stack.arraylistVisited.get(stack.arraylistVisited.size()-1).getY(), 29, 29);
            // g.drawLine(100,100,29,29);
           
             
      if(!dijkstra2.f.dijikstralist.isEmpty())
      {FileWriter myWriter = new FileWriter("EnKısaYol.txt");
          for(int eru=0;eru<dijkstra2.f.dijikstralist.size();eru++)
          {
              for(int asd=0;asd<temp.PassObjectXY.size();asd++)
              {
                 if( temp.PassObjectXY.get(asd).getId()==dijkstra2.f.dijikstralist.get(eru))
                 {
                     g.setColor(Color.PINK);
                    g.fillRect(temp.PassObjectXY.get(asd).getX(), temp.PassObjectXY.get(asd).getY(),29,29); 
                    try {
      
      if (myObj2.createNewFile()) {
        System.out.println("File created: " + myObj2.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
		
                
                
                 try {
                    
                        
                         myWriter.write("X: "+temp.PassObjectXY.get(asd).getX()+" Y: "+temp.PassObjectXY.get(asd).getY()+" İD: "+temp.PassObjectXY.get(asd).getId()+"\n");
                     
                     
      
      
     // myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
                 
                 
                    g.setColor(Color.GREEN);
           
             g.fillRect(temp.PassObjectXY.get(numberStart).getX(),temp.PassObjectXY.get(numberStart).getY(),29,29);
             g.setColor(Color.BLACK);
             g.drawString("B", temp.PassObjectXY.get(numberStart).getX()+10, temp.PassObjectXY.get(numberStart).getY()+20);
             g.setColor(Color.red);
             g.fillRect(temp.PassObjectXY.get(numberFinish).getX(),temp.PassObjectXY.get(numberFinish).getY(),29,29);
             g.setColor(Color.WHITE);
             g.drawString("H", temp.PassObjectXY.get(numberFinish).getX()+10, temp.PassObjectXY.get(numberFinish).getY()+20);
                  break;   
                 }
              }
             
          }
        myWriter.close();
      }
            
             
                 
             
             
             
             
             
             
             
             
             
             
             
             
             
             
         } catch (IOException ex) {
             Logger.getLogger(GridURL2.class.getName()).log(Level.SEVERE, null, ex);
         } 
      
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        // Move the image by DELTA in both x and y directions
        //temp.PassObjectXY.get(0).getX()
        
        if(!temp.PassObjectXY.isEmpty()&&kontrol!=5)
        {
            this.x=temp.PassObjectXY.get(numberStart).getX();
            this.y=temp.PassObjectXY.get(numberStart).getY();
            this.kontrol=5;
            
          //  this.x=robot.Right(this.x);
            /*
         int gk=0;
       
        for(int hjk=0;hjk<temp.Obstacle1XY.size();hjk++)
        {
            if(temp.Obstacle1XY.get(hjk).getX()==robot.Left(x)&&temp.Obstacle1XY.get(hjk).getY()==y)
            {
                gk=1;
            }
            if(temp.Obstacle2XY.get(hjk).getX()==robot.Left(x)&&temp.Obstacle2XY.get(hjk).getY()==y)
            {
                gk=1;
            }
            if(temp.Obstacle3XY.get(hjk).getX()==robot.Left(x)&&temp.Obstacle3XY.get(hjk).getY()==y)
            {
                gk=1;
            }
            
            
        }
         
      
     
     if(gk==1)
     {
         this.x=robot.Right(this.x);
     }
     */
        // this.x=robot.Right(this.x);
     
        }
        
        /*
      if( false==robot.İsObstacleLeft(this.x, this.y))
      {
          this.x= robot.Left(this.x);
         
      }
      else
      {
          this.x= robot.Right(this.x);
         
      }
       */
        
        
        //her  harekette yeni bir nesne oluşturmak lazım o yüzden burda oluşmalı çünkü her harekette
        //yeni bir kare oluşmalı
     //   this.x= robot.Left(this.x);//İLK OLARAK X Y Yİ GÜNCELLERSEN SONRA ARRAYLİSTVİSİTED A EKLERSEN ROBOTUN GELDİĞİ YER DE EKLENİR LİSTEYE
        temp.arraylistVisitedX.add(this.x);
        temp.arraylistVisitedY.add(this.y);
       if(!temp.PassObjectXY.isEmpty())
       {
          // vertex=new Vertex[10000];
       
        for(int gh=0;gh<temp.PassObjectXY.size();gh++)
        {
            if(this.x==temp.PassObjectXY.get(gh).getX())
            {
                if(this.y==temp.PassObjectXY.get(gh).getY())
                {
                   temp.arraylistVisitedid.add(temp.PassObjectXY.get(gh).getId());//şu anda visited nesnesinin X,Y,İD bilgileri visited nesnesine eklendi
                }
            }
            
            
        }
       }
        
        
       
        //vertex=new Vertex[10000];
        int aR=-5;
        int aL=-5;
        int aU=-5;
        int aD=-5;
        int az=-5;//bizim bulunduğumuz vertex yani id numarası
        int cUR=-5;
        int cUL=-5;
        int cDL=-5;
        int cDR=-5;
        
       for(int lkj=0;lkj<temp.PassObjectXY.size();lkj++)
       {
           if(this.x==temp.PassObjectXY.get(lkj).getX()&&this.y==temp.PassObjectXY.get(lkj).getY())
           {
               int kontrolert=0;
               az= temp.PassObjectXY.get(lkj).getId();
               for(int ert=0;ert<temp.isMakingVertex.size();ert++)
               {
                   if(temp.isMakingVertex.get(ert)==az)
                   {
                       kontrolert=1;//1 ise daha önce oluşmuştur
                       break;
                   }
               }
               if(kontrolert==0)
               {
                   vertex[az]=graph.addVertex(az);
                   temp.isMakingVertex.add(az);
                   temp.seenList.add(az);
               }
               // vertex[az]=graph.addVertex(az);//geçtiğimiz noktaların vertexe ekledik
               // temp.isMakingVertex.add(az);//bu listenin içindeyse bir vertex daha önceden oluşturulmuştur
                
                
           }
       }
       
       
        for(int lkj=0;lkj<temp.PassObjectXY.size();lkj++)
       {
           if(robot.Left(this.x)==temp.PassObjectXY.get(lkj).getX()&&this.y==temp.PassObjectXY.get(lkj).getY())
           {
              int kontrolert=0;
               aL= temp.PassObjectXY.get(lkj).getId();
               for(int ert=0;ert<temp.isMakingVertex.size();ert++)
               {
                   if(temp.isMakingVertex.get(ert)==aL)
                   {
                       kontrolert=1;//1 ise daha önce oluşmuştur
                       break;
                   }
               }
               if(kontrolert==0)
               {
                   vertex[aL]=graph.addVertex(aL);
                   temp.isMakingVertex.add(aL);
                   temp.seenList.add(aL);
               }
                
                
           }
       }
          
         for(int lkj=0;lkj<temp.PassObjectXY.size();lkj++)
       {
           if(robot.Right(this.x)==temp.PassObjectXY.get(lkj).getX()&&this.y==temp.PassObjectXY.get(lkj).getY())
           {
               int kontrolert=0;
               aR= temp.PassObjectXY.get(lkj).getId();
               for(int ert=0;ert<temp.isMakingVertex.size();ert++)
               {
                   if(temp.isMakingVertex.get(ert)==aR)
                   {
                       kontrolert=1;//1 ise daha önce oluşmuştur
                       break;
                   }
               }
               if(kontrolert==0)
               {
                   vertex[aR]=graph.addVertex(aR);
                   temp.isMakingVertex.add(aR);
                   temp.seenList.add(aR);
               }
                
           }
       }
          for(int lkj=0;lkj<temp.PassObjectXY.size();lkj++)
       {
           if(robot.up(this.y)==temp.PassObjectXY.get(lkj).getY()&&this.x==temp.PassObjectXY.get(lkj).getX())
           {
               int kontrolert=0;
               aU= temp.PassObjectXY.get(lkj).getId();
               for(int ert=0;ert<temp.isMakingVertex.size();ert++)
               {
                   if(temp.isMakingVertex.get(ert)==aU)
                   {
                       kontrolert=1;//1 ise daha önce oluşmuştur
                       break;
                   }
               }
               if(kontrolert==0)
               {
                   vertex[aU]=graph.addVertex(aU);
                   temp.isMakingVertex.add(aU);
                   temp.seenList.add(aU);
               }
                
           }
       }
          
           for(int lkj=0;lkj<temp.PassObjectXY.size();lkj++)
       {
           if(robot.down(this.y)==temp.PassObjectXY.get(lkj).getY()&&this.x==temp.PassObjectXY.get(lkj).getX())
           {
               int kontrolert=0;
               aD= temp.PassObjectXY.get(lkj).getId();
               for(int ert=0;ert<temp.isMakingVertex.size();ert++)
               {
                   if(temp.isMakingVertex.get(ert)==aD)
                   {
                       kontrolert=1;//1 ise daha önce oluşmuştur
                       break;
                   }
               }
               if(kontrolert==0)
               {
                   vertex[aD]=graph.addVertex(aD);
                   temp.isMakingVertex.add(aD);
                   temp.seenList.add(aD);
               }
                
                
           }
       }
           int[] graphArray;//CORNERUPLEFT
           graphArray=robot.cornerUpLeft(this.x, this.y);
           for(int lkj=0;lkj<temp.PassObjectXY.size();lkj++)
           {
               if(graphArray[0]==temp.PassObjectXY.get(lkj).getX()&&graphArray[1]==temp.PassObjectXY.get(lkj).getY())
               {
                    int kontrolert=0;
               cUL= temp.PassObjectXY.get(lkj).getId();
               for(int ert=0;ert<temp.isMakingVertex.size();ert++)
               {
                   if(temp.isMakingVertex.get(ert)==cUL)
                   {
                       kontrolert=1;//1 ise daha önce oluşmuştur
                       break;
                   }
               }
               if(kontrolert==0)
               {
                   vertex[cUL]=graph.addVertex(cUL);
                   temp.isMakingVertex.add(cUL);
                   temp.seenList.add(cUL);
               }
               }
           }
           
            int[] graphArray2;//CORNERUPRİGHT
           graphArray2=robot.cornerUpRight(this.x, this.y);
           for(int lkj=0;lkj<temp.PassObjectXY.size();lkj++)
           {
               if(graphArray2[0]==temp.PassObjectXY.get(lkj).getX()&&graphArray2[1]==temp.PassObjectXY.get(lkj).getY())
               {
                    int kontrolert=0;
               cUR= temp.PassObjectXY.get(lkj).getId();
               for(int ert=0;ert<temp.isMakingVertex.size();ert++)
               {
                   if(temp.isMakingVertex.get(ert)==cUR)
                   {
                       kontrolert=1;//1 ise daha önce oluşmuştur
                       break;
                   }
               }
               if(kontrolert==0)
               {
                   vertex[cUR]=graph.addVertex(cUR);
                   temp.isMakingVertex.add(cUR);
                   temp.seenList.add(cUR);
               }
               }
           }
           
           int[] graphArray3;//CORNERDOWNLEFT
           graphArray3=robot.cornerDownLeft(this.x, this.y);
           for(int lkj=0;lkj<temp.PassObjectXY.size();lkj++)
           {
               if(graphArray3[0]==temp.PassObjectXY.get(lkj).getX()&&graphArray3[1]==temp.PassObjectXY.get(lkj).getY())
               {
                    int kontrolert=0;
               cDL= temp.PassObjectXY.get(lkj).getId();
               for(int ert=0;ert<temp.isMakingVertex.size();ert++)
               {
                   if(temp.isMakingVertex.get(ert)==cDL)
                   {
                       kontrolert=1;//1 ise daha önce oluşmuştur
                       break;
                   }
               }
               if(kontrolert==0)
               {
                   vertex[cDL]=graph.addVertex(cDL);
                   temp.isMakingVertex.add(cDL);
                   temp.seenList.add(cDL);
               }
               }
           }
           
           int[] graphArray4;//CORNERDOW
           graphArray4=robot.cornerDownRight(this.x, this.y);
           for(int lkj=0;lkj<temp.PassObjectXY.size();lkj++)
           {
               if(graphArray4[0]==temp.PassObjectXY.get(lkj).getX()&&graphArray4[1]==temp.PassObjectXY.get(lkj).getY())
               {
                    int kontrolert=0;
               cDR= temp.PassObjectXY.get(lkj).getId();
               for(int ert=0;ert<temp.isMakingVertex.size();ert++)
               {
                   if(temp.isMakingVertex.get(ert)==cDR)
                   {
                       kontrolert=1;//1 ise daha önce oluşmuştur
                       break;
                   }
               }
               if(kontrolert==0)
               {
                   vertex[cDR]=graph.addVertex(cDR);
                   temp.isMakingVertex.add(cDR);
                   temp.seenList.add(cDR);
               }
               }
           }
           
         
       if(az!=-5&&aL!=-5)
       {
           graph.addEdge(vertex[az], vertex[aL], 10);
       }
       if(az!=-5&&aR!=-5)
       {
           graph.addEdge(vertex[az], vertex[aR], 10);
       }
       if(az!=-5&&aU!=-5)
       {
           graph.addEdge(vertex[az], vertex[aU], 10);
       }
     if(az!=-5&&aD!=-5)
     {
         graph.addEdge(vertex[az], vertex[aD], 10);
     }
      if(aL!=-5&&cUL!=-5)
      {
          graph.addEdge(vertex[aL], vertex[cUL], 10);
      }
      if(aL!=-5&&cDL!=-5)
      {
          graph.addEdge(vertex[aL], vertex[cDL], 10);
      }
      if(aR!=-5&&cUR!=-5)
      {
          graph.addEdge(vertex[aR], vertex[cUR], 10);
      }
       if(aR!=-5&&cDR!=-5)
       {
           graph.addEdge(vertex[aR], vertex[cDR], 10);
       }
       if(aU!=-5&&cUL!=-5)
       {
           graph.addEdge(vertex[aU], vertex[cUL], 10);
       }
        if(aU!=-5&&cUR!=-5)
        {
            graph.addEdge(vertex[aU], vertex[cUR], 10);
        }
         if(aD!=-5&&cDL!=-5)
         {
             graph.addEdge(vertex[aD], vertex[cDL], 10);
         }
       
     if(aD!=-5&&cDR!=-5)
     {
         graph.addEdge(vertex[aD], vertex[cDR], 10);
     }
      
     
    
     
         
            
            
           
      
      
       
       
        
       
         
       // repaint();
       // this.x= robot.Left(this.x);
       // repaint();
       /*
        for(int hjk=0;hjk<stack.arraylistVisited.size();hjk++)
        {
            if(stack.arraylistVisited.get(hjk).getX()!=this.x&&stack.arraylistVisited.get(hjk).getY()!=this.y)
            {
                this.x= robot.Left(this.x);
            }
            
        }
*/
       
       //ENGEL KONTROL DURUMLARI
       
      int Lk=0;//SOLDA ENGEL VAR MI?
       
        for(int hjk=0;hjk<temp.Obstacle1XY.size();hjk++)
        {
            if(temp.Obstacle1XY.get(hjk).getX()==robot.Left(x)&&temp.Obstacle1XY.get(hjk).getY()==y)
            {
                Lk=1;
                
            }
        }
        for(int hjk=0;hjk<temp.Obstacle2XY.size();hjk++)
        {
            if(temp.Obstacle2XY.get(hjk).getX()==robot.Left(x)&&temp.Obstacle2XY.get(hjk).getY()==y)
            {
                Lk=1;
                
            }
        }
         for(int hjk=0;hjk<temp.Obstacle3XY.size();hjk++)
        {
            if(temp.Obstacle3XY.get(hjk).getX()==robot.Left(x)&&temp.Obstacle3XY.get(hjk).getY()==y)
            {
                Lk=1;
                
            }
        }  
       //---------------------------------
       int Rk=0;//Sağda engel var mı?;
         for(int hjk=0;hjk<temp.Obstacle1XY.size();hjk++)
        {
            if(temp.Obstacle1XY.get(hjk).getX()==robot.Right(x)&&temp.Obstacle1XY.get(hjk).getY()==y)
            {
                Rk=1;
                        
            }
        }
          for(int hjk=0;hjk<temp.Obstacle2XY.size();hjk++)
        {
            if(temp.Obstacle2XY.get(hjk).getX()==robot.Right(x)&&temp.Obstacle2XY.get(hjk).getY()==y)
            {
                Rk=1;
                        
            }
        }
          for(int hjk=0;hjk<temp.Obstacle3XY.size();hjk++)
        {
            if(temp.Obstacle3XY.get(hjk).getX()==robot.Right(x)&&temp.Obstacle3XY.get(hjk).getY()==y)
            {
                Rk=1;
                        
            }
        }   
        
         //---------------------------------------------
         //YUKARIDA ENGEL VAR MI?
        int Uk=0;
          for(int hjk=0;hjk<temp.Obstacle1XY.size();hjk++)
        {
            if(temp.Obstacle1XY.get(hjk).getX()==x&&temp.Obstacle1XY.get(hjk).getY()==robot.up(y))
            {
               Uk=1;
            }
        }
             for(int hjk=0;hjk<temp.Obstacle2XY.size();hjk++)
        {
            if(temp.Obstacle2XY.get(hjk).getX()==x&&temp.Obstacle2XY.get(hjk).getY()==robot.up(y))
            {
               Uk=1;
            }
        }
              for(int hjk=0;hjk<temp.Obstacle3XY.size();hjk++)
        {
            if(temp.Obstacle3XY.get(hjk).getX()==x&&temp.Obstacle3XY.get(hjk).getY()==robot.up(y))
            {
               Uk=1;
            }
        }
       //--------------------------------
       //AŞAĞIDA ENGEL VAR MI
       int Dk=0;
       
       for(int hjk=0;hjk<temp.Obstacle1XY.size();hjk++)
        {
            if(temp.Obstacle1XY.get(hjk).getX()==x&&temp.Obstacle1XY.get(hjk).getY()==robot.down(y))
            {
                Dk=1;
            }
        }
            for(int hjk=0;hjk<temp.Obstacle2XY.size();hjk++)
        {
            if(temp.Obstacle2XY.get(hjk).getX()==x&&temp.Obstacle2XY.get(hjk).getY()==robot.down(y))
            {
                Dk=1;
            }
        }
            for(int hjk=0;hjk<temp.Obstacle3XY.size();hjk++)
        {
            if(temp.Obstacle3XY.get(hjk).getX()==x&&temp.Obstacle3XY.get(hjk).getY()==robot.down(y))
            {
                Dk=1;
            }
        }
       
       
       //DAHA ÖNCEDEN ZİYARET EDİLME DURUMLARI
     int VL=0;  //SOLDAKİ DAHA ÖNCE ZİYARET EDİLDİ Mİ?
       for(int hjk=0;hjk<temp.arraylistVisitedX.size();hjk++)
        {
            
            if(temp.arraylistVisitedX.get(hjk)==robot.Left(x)&&temp.arraylistVisitedY.get(hjk)==y)
            {
                VL=1;//VİSİTEDLEFT
            }
            
        }
       
       //------------------------------------
       int VR=0;//SAĞDAKİ DAHA ÖNCE ZİYARET EDİLDİ Mİ?
       for(int hjk=0;hjk<temp.arraylistVisitedX.size();hjk++)
        {
            
            if(temp.arraylistVisitedX.get(hjk)==robot.Right(x)&&temp.arraylistVisitedY.get(hjk)==y)
            {
                VR=1;
            }
            
        }
       //-------------------------------------
       int VU=0;//YUKARIDAKİ DAHA ÖNCE ZİYARET EDİLDİ Mİ
        for(int hjk=0;hjk<temp.arraylistVisitedX.size();hjk++)
        {
            
            if(temp.arraylistVisitedX.get(hjk)==x&&temp.arraylistVisitedY.get(hjk)==robot.up(y))
            {
                VU=1;
            }
            
        }
       
       //-------------------------------------
       int VD=0;//AŞAĞIDAKİ DAHA ÖNCE ZİYARET EDİLDİ Mİ?
        for(int hjk=0;hjk<temp.arraylistVisitedX.size();hjk++)
        {
            
            if(temp.arraylistVisitedX.get(hjk)==x&&temp.arraylistVisitedY.get(hjk)==robot.down(y))
            {
                VD=1;
            }
            
        }
        //--------------------------------
        //SPACE Mİ DEĞİL Mİ?
        
        
        int SLk=0;//SOLDA ENGEL VAR MI?
       
        for(int hjk=0;hjk<temp.PassObjectXY.size();hjk++)
        {
            if(temp.PassObjectXY.get(hjk).getX()==robot.Left(x)&&temp.PassObjectXY.get(hjk).getY()==y)
            {
                SLk=1;
                
            }
        }
        
       //---------------------------------
       int SRk=0;//Sağda engel var mı?;
         for(int hjk=0;hjk<temp.PassObjectXY.size();hjk++)
        {
            if(temp.PassObjectXY.get(hjk).getX()==robot.Right(x)&&temp.PassObjectXY.get(hjk).getY()==y)
            {
                SRk=1;
                        
            }
        }
         
        
         //---------------------------------------------
         //YUKARIDA ENGEL VAR MI?
        int SUk=0;
          for(int hjk=0;hjk<temp.PassObjectXY.size();hjk++)
        {
            if(temp.PassObjectXY.get(hjk).getX()==x&&temp.PassObjectXY.get(hjk).getY()==robot.up(y))//yukarıdaki passobject ise 1 yapar yani burda eğer 1 ise dememiz lazım
            {
               SUk=1;
            }
        }
            
       //--------------------------------
       //AŞAĞIDA ENGEL VAR MI
       int SDk=0;
       
       for(int hjk=0;hjk<temp.PassObjectXY.size();hjk++)
        {
            if(temp.PassObjectXY.get(hjk).getX()==x&&temp.PassObjectXY.get(hjk).getY()==robot.down(y))
            {
                SDk=1;
            }
        }
           
       int g=temp.arraylistVisitedX.size()-2;
       int VİSİTEDL=5;
            int VİSİTEDR=5;
            int VİSİTEDU=5;
            int VİSİTEDD=5;
            int ispassobjectL=0;
            int ispassobjectR=0;
            int ispassobjectU=0;
            int ispassobjectD=0;
        //KAÇIŞ PLANI
        while(g>=0)
        {
             ispassobjectL=0;
             ispassobjectR=0;
             ispassobjectU=0;
             ispassobjectD=0;
           
             VİSİTEDL=0;
             VİSİTEDR=0;
             VİSİTEDU=0;
             VİSİTEDD=0;
             int İNDEXX=temp.arraylistVisitedX.get(g);//robottan bir öncekinin x  i
            int İNDEXY=temp.arraylistVisitedY.get(g);//robottan bir öncekininb y si
            int İNDEXL=robot.Left(temp.arraylistVisitedX.get(g));//solunun x si
            int İNDEXR=robot.Right(temp.arraylistVisitedX.get(g));//sağının x i
            int İNDEXU=robot.up(temp.arraylistVisitedY.get(g));//üstünün y si
            int İNDEXD=robot.down(temp.arraylistVisitedY.get(g));//altının y si
        
            
            
            for(int l=0;l<temp.PassObjectXY.size();l++)
            {
                if(İNDEXL==temp.PassObjectXY.get(l).getX()&&İNDEXY==temp.PassObjectXY.get(l).getY())
                {
                    ispassobjectL=1;
                    for(int gh=0;gh<temp.arraylistVisitedid.size();gh++)
                    {
                    if(temp.arraylistVisitedid.get(gh)== temp.PassObjectXY.get(l).getId())//solunun id numarası
                   {
                       VİSİTEDL=1;
                   }
                    }
                  
                }
            }
            
            //--------------------------
             for(int l=0;l<temp.PassObjectXY.size();l++)
            {
                if(İNDEXR==temp.PassObjectXY.get(l).getX()&&İNDEXY==temp.PassObjectXY.get(l).getY())
                {
                    ispassobjectR=1;
                    for(int gh=0;gh<temp.arraylistVisitedid.size();gh++)
                    {
                    if(temp.arraylistVisitedid.get(gh)== temp.PassObjectXY.get(l).getId())//solunun id numarası
                    {
                       VİSİTEDR=1;
                    }
                    
                    
                    }
                  
                }
            }
        //----------------------------
         for(int l=0;l<temp.PassObjectXY.size();l++)
            {
                if(İNDEXU==temp.PassObjectXY.get(l).getY()&&İNDEXX==temp.PassObjectXY.get(l).getX())
                {
                    ispassobjectU=1;
                    for(int gh=0;gh<temp.arraylistVisitedid.size();gh++)
                    {
                    if(temp.arraylistVisitedid.get(gh)== temp.PassObjectXY.get(l).getId())//solunun id numarası
                   {
                       VİSİTEDU=1;
                   }
                    }
                  
                }
            }
       
       //--------------------------------------
        for(int l=0;l<temp.PassObjectXY.size();l++)
            {
                if(İNDEXD==temp.PassObjectXY.get(l).getY()&&İNDEXX==temp.PassObjectXY.get(l).getX())
                {
                    ispassobjectD=1;
                    for(int gh=0;gh<temp.arraylistVisitedid.size();gh++)
                    {
                    if(temp.arraylistVisitedid.get(gh)== temp.PassObjectXY.get(l).getId())//solunun id numarası
                   {
                       VİSİTEDD=1;
                   }
                    }
                  
                }
            }
        
           if(VİSİTEDL==0&&ispassobjectL==1)
           {
               
               break;
           }
           if(VİSİTEDR==0&&ispassobjectR==1)
           {
               
               break;
           }
           if(VİSİTEDU==0&&ispassobjectU==1)
           {
               
               break;
           }
           if(VİSİTEDD==0&&ispassobjectD==1)
           {
               
               break;
           }
            
                       
                          
                   
                       
                   
             g--;
           
        
        }
        int[] arrayUpLeft=robot.cornerUpLeft(this.x, this.y);
        int[] arrayUpRight=robot.cornerUpRight(this.x, this.y);
        int[] arrayDownLeft=robot.cornerDownLeft(this.x, this.y);
        int[] arrayDownRight=robot.cornerDownRight(this.x, this.y);
        int RobotsLeft=robot.Left(this.x);
        int RobotsRight=robot.Right(this.x);
        int RobotsUp=robot.up(this.y);
        int RobotsDown=robot.down(this.y);
        int ResultControl=0;
          //listelere dışardan erişmeye izin vermiyo diğer şeylere izin veriyo
        
         
         if(temp.PassObjectXY.get(numberFinish).getX()==RobotsLeft&&temp.PassObjectXY.get(numberFinish).getY()==this.y)
         {
             this.x= robot.Left(this.x);
             ResultControl=1;
           //  timer.stop();
         }
         else if(temp.PassObjectXY.get(numberFinish).getX()==RobotsRight&&temp.PassObjectXY.get(numberFinish).getY()==this.y)
         {
             this.x= robot.Right(this.x);
             ResultControl=1;
            // timer.stop();
         }
         else if(temp.PassObjectXY.get(numberFinish).getX()==this.x&&temp.PassObjectXY.get(numberFinish).getY()==RobotsUp)
         {
             this.y= robot.up(this.y);
             ResultControl=1;
            // timer.stop();
         }
         else if(temp.PassObjectXY.get(numberFinish).getX()==this.x&&temp.PassObjectXY.get(numberFinish).getY()==RobotsDown)
         {
             this.y= robot.down(this.y);
             ResultControl=1;
           //  timer.stop();
         }
         else if(temp.PassObjectXY.get(numberFinish).getX()==arrayUpLeft[0]&&temp.PassObjectXY.get(numberFinish).getY()==arrayUpLeft[1])
         {
             
             for(int i=0;i<temp.PassObjectXY.size();i++)
             {
                 if(robot.up(this.y)==temp.PassObjectXY.get(i).getY()&&this.x==temp.PassObjectXY.get(i).getX())
                 {
                    this.y= robot.up(this.y);
                   ResultControl=1;
                   break;
                   // this.x= robot.Left(this.x);
                 }
                 else if(robot.Left(this.x)==temp.PassObjectXY.get(i).getX()&&this.y==temp.PassObjectXY.get(i).getY())
                 {
                     this.x=robot.Left(this.x);
                     ResultControl=1;
                     break;
                     
                 }
                         
                     
                
             }
             
         }
         else if(temp.PassObjectXY.get(numberFinish).getX()==arrayUpRight[0]&&temp.PassObjectXY.get(numberFinish).getY()==arrayUpRight[1])
         {
              for(int i=0;i<temp.PassObjectXY.size();i++)
             {
                 if(robot.up(this.y)==temp.PassObjectXY.get(i).getY()&&this.x==temp.PassObjectXY.get(i).getX())
                 {
                    this.y= robot.up(this.y);
                  ResultControl=1;
                  break;
                   // this.x= robot.Left(this.x);
                 }
                 else if(robot.Right(this.x)==temp.PassObjectXY.get(i).getX()&&this.y==temp.PassObjectXY.get(i).getY())
                 {
                     this.x=robot.Right(this.x);
                  ResultControl=1;
                  break;
                     
                 }
                         
                     
                
             }
         }
         else if(temp.PassObjectXY.get(numberFinish).getX()==arrayDownLeft[0]&&temp.PassObjectXY.get(numberFinish).getY()==arrayDownLeft[1])
         {
              for(int i=0;i<temp.PassObjectXY.size();i++)
             {
                 if(robot.down(this.y)==temp.PassObjectXY.get(i).getY()&&this.x==temp.PassObjectXY.get(i).getX())
                 {
                    this.y= robot.down(this.y);
                   ResultControl=1;
                   break;
                   // this.x= robot.Left(this.x);
                 }
                 else if(robot.Left(this.x)==temp.PassObjectXY.get(i).getX()&&this.y==temp.PassObjectXY.get(i).getY())
                 {
                     this.x=robot.Left(this.x);
                     ResultControl=1;
                     break;
                     
                 }
                         
                     
                
             }
         }
         else if(temp.PassObjectXY.get(numberFinish).getX()==arrayDownRight[0]&&temp.PassObjectXY.get(numberFinish).getY()==arrayDownRight[1])
         {
              for(int i=0;i<temp.PassObjectXY.size();i++)
             {
                 if(robot.down(this.y)==temp.PassObjectXY.get(i).getY()&&this.x==temp.PassObjectXY.get(i).getX())
                 {
                    this.y= robot.down(this.y);
                    ResultControl=1;
                    break;
                   // this.x= robot.Left(this.x);
                 }
                 else if(robot.Right(this.x)==temp.PassObjectXY.get(i).getX()&&this.y==temp.PassObjectXY.get(i).getY())
                 {
                     this.x=robot.Right(this.x);
                     ResultControl=1;
                     break;
                     
                 }
                         
                     
                
             }
         }
        int İDROBOT = -10;
        int İDLEFTR=-10;
        int İDRİGHTR=-10;
        int İDUPR=-10;
        int İDDOWNR=-10;
        for(int zxa=0;zxa<temp.PassObjectXY.size();zxa++)
        {
            if(temp.PassObjectXY.get(zxa).getX()==this.x&&temp.PassObjectXY.get(zxa).getY()==this.y)
            {
              İDROBOT=  temp.PassObjectXY.get(zxa).getId();//robotun bulunduğu konumun id si
              break;
            }
        }
            
      
        for(int poı=0;poı<temp.AllObjectXY.size();poı++)
        {
           if(temp.AllObjectXY.get(poı).getX()==robot.Left(robot.Left(this.x))&&temp.AllObjectXY.get(poı).getY()==this.y)
            {
              İDLEFTR=  temp.AllObjectXY.get(poı).getId();//2 solunun id si
              break;
            }
        }
        
        for(int poı=0;poı<temp.AllObjectXY.size();poı++)
        {
           if(temp.AllObjectXY.get(poı).getX()==robot.Right(robot.Right(this.x))&&temp.AllObjectXY.get(poı).getY()==this.y)
            {
              İDRİGHTR=  temp.AllObjectXY.get(poı).getId();//2 SAĞININ id si
              break;
            }
        }
        
        for(int poı=0;poı<temp.AllObjectXY.size();poı++)
        {
           if(temp.AllObjectXY.get(poı).getX()==this.x&&temp.AllObjectXY.get(poı).getY()==robot.up(robot.up(this.y)))
            {
              İDUPR=  temp.AllObjectXY.get(poı).getId();//2 ÜSTÜNÜN id si
              break;
            }
        }
        
        for(int poı=0;poı<temp.AllObjectXY.size();poı++)
        {
           if(temp.AllObjectXY.get(poı).getX()==this.x&&temp.AllObjectXY.get(poı).getY()==robot.down(robot.down(this.y)))
            {
              İDDOWNR=  temp.AllObjectXY.get(poı).getId();//2 ÜSTÜNÜN id si
              break;
            }
        }
        
        int ControlLeftCost=0;
        int ControlRightCost=0;
        int ControlUpCost=0;
        int ControlDownCost=0;
        
        
        for(int rt=0;rt<temp.seenList.size();rt++)
        {
            if(temp.seenList.get(rt)==İDLEFTR)
            {
                ControlLeftCost=1;//1 ise daha önce ziyaret edilmiştir
            }
            if(temp.seenList.get(rt)==İDRİGHTR)
            {
                ControlRightCost=1;
            }
            if(temp.seenList.get(rt)==İDUPR)
            {
                ControlUpCost=1;
            }
            if(temp.seenList.get(rt)==İDDOWNR)
            {
                ControlDownCost=1;
            }
            
        }
        
        
        
        
        
            if(VL==0&&Lk==0&&SLk==1&&ControlLeftCost!=1)
           {
               if(ResultControl!=1)
               {
                   this.x= robot.Left(this.x);
               }

              // this.x= robot.Left(this.x);
             //  if(temp.PassObjectXY.get(numberFinish).getX()==this.x&&temp.PassObjectXY.get(numberFinish).getY()==this.y)
               //{
                 //  timer.stop();
               //}
             //  this.x= robot.Left(this.x);BURADA EKLEME İŞLEMİNİ YAPMALISIN ÇÜNKÜ ROBOTUN BULUNDUĞU X,Y BURADAKİDİR
           
           }
           else if(VR==0&&Rk==0&&SRk==1&&ControlRightCost!=1)
           {
               if(ResultControl!=1)
               {
                   this.x= robot.Right(this.x);
               }
              // this.x= robot.Right(this.x);
              // if(temp.PassObjectXY.get(numberFinish).getX()==this.x&&temp.PassObjectXY.get(numberFinish).getY()==this.y)
               //{
                 //  timer.stop();
               //}
             //  this.x= robot.Right(this.x);
           }
           else if(VU==0&&Uk==0&&SUk==1&&ControlUpCost!=1)
           {
               if(ResultControl!=1)
               {
                   this.y= robot.up(this.y);
               }
              // this.y= robot.up(this.y);
              // if(temp.PassObjectXY.get(numberFinish).getX()==this.x&&temp.PassObjectXY.get(numberFinish).getY()==this.y)
               //{
                   //timer.stop();
               //}
               // this.y= robot.up(this.y);
               
           }
           else if(VD==0&&Dk==0&&SDk==1&&ControlDownCost!=1)
           {
               if(ResultControl!=1)
               {
                   this.y= robot.down(this.y);
               }
               //this.y= robot.down(this.y);
              // if(temp.PassObjectXY.get(numberFinish).getX()==this.x&&temp.PassObjectXY.get(numberFinish).getY()==this.y)
               //{
                   //timer.stop();
               //}
             //  this.y= robot.down(this.y);
           }//----------------------------------------------------------------------------------------------
           
           else if(VL==0&&Lk==0&&SLk==1)//----------------------------------------------------------------
           {
               if(ResultControl!=1)
               {
                   this.x= robot.Left(this.x);
               }

              // this.x= robot.Left(this.x);
             //  if(temp.PassObjectXY.get(numberFinish).getX()==this.x&&temp.PassObjectXY.get(numberFinish).getY()==this.y)
               //{
                 //  timer.stop();
               //}
             //  this.x= robot.Left(this.x);BURADA EKLEME İŞLEMİNİ YAPMALISIN ÇÜNKÜ ROBOTUN BULUNDUĞU X,Y BURADAKİDİR
           
           }
           else if(VR==0&&Rk==0&&SRk==1)
           {
               if(ResultControl!=1)
               {
                   this.x= robot.Right(this.x);
               }
              // this.x= robot.Right(this.x);
              // if(temp.PassObjectXY.get(numberFinish).getX()==this.x&&temp.PassObjectXY.get(numberFinish).getY()==this.y)
               //{
                 //  timer.stop();
               //}
             //  this.x= robot.Right(this.x);
           }
           else if(VU==0&&Uk==0&&SUk==1)
           {
               if(ResultControl!=1)
               {
                   this.y= robot.up(this.y);
               }
              // this.y= robot.up(this.y);
              // if(temp.PassObjectXY.get(numberFinish).getX()==this.x&&temp.PassObjectXY.get(numberFinish).getY()==this.y)
               //{
                   //timer.stop();
               //}
               // this.y= robot.up(this.y);
               
           }
           else if(VD==0&&Dk==0&&SDk==1)
           {
               if(ResultControl!=1)
               {
                   this.y= robot.down(this.y);
               }
               //this.y= robot.down(this.y);
              // if(temp.PassObjectXY.get(numberFinish).getX()==this.x&&temp.PassObjectXY.get(numberFinish).getY()==this.y)
               //{
                   //timer.stop();
               //}
             //  this.y= robot.down(this.y);
           }
           else if(VİSİTEDL==0&&ispassobjectL==1)
           {
               if(ResultControl!=1)
               {
                    this.x=robot.Left(temp.arraylistVisitedX.get(g));
               this.y=temp.arraylistVisitedY.get(g);
               }
               
              // if(temp.PassObjectXY.get(numberFinish).getX()==this.x&&temp.PassObjectXY.get(numberFinish).getY()==this.y)
               //{
                 //  timer.stop();
               //}
              // this.x=robot.Left(temp.arraylistVisitedX.get(g));
               //this.y=temp.arraylistVisitedY.get(g);
           }
           else if(VİSİTEDR==0&&ispassobjectR==1)
           {
               if(ResultControl!=1)
               {
                   
               
               this.x=robot.Right(temp.arraylistVisitedX.get(g));
               this.y=temp.arraylistVisitedY.get(g);
               }
              // if(temp.PassObjectXY.get(numberFinish).getX()==this.x&&temp.PassObjectXY.get(numberFinish).getY()==this.y)
               //{
                 //  timer.stop();
               //}
              // this.x=robot.Right(temp.arraylistVisitedX.get(g));
               //this.y=temp.arraylistVisitedY.get(g);
           }
           else if(VİSİTEDU==0&&ispassobjectU==1)
           {
               if(ResultControl!=1)
               {
                   
               
               this.x=temp.arraylistVisitedX.get(g);
               this.y=robot.up(temp.arraylistVisitedY.get(g));
               }
             //  if(temp.PassObjectXY.get(numberFinish).getX()==this.x&&temp.PassObjectXY.get(numberFinish).getY()==this.y)
              // {
                //   timer.stop();
               //}
              // this.x=temp.arraylistVisitedX.get(g);
              // this.y=robot.up(temp.arraylistVisitedY.get(g));
           }
           else if(VİSİTEDD==0&&ispassobjectD==1)
           {
               if(ResultControl!=1)
               {
                   
               
               this.x=temp.arraylistVisitedX.get(g);
               this.y=robot.down(temp.arraylistVisitedY.get(g));
               }
               //if(temp.PassObjectXY.get(numberFinish).getX()==this.x&&temp.PassObjectXY.get(numberFinish).getY()==this.y)
               //{
                 //  timer.stop();
               //}
              // this.x=temp.arraylistVisitedX.get(g);
               //this.y=robot.down(temp.arraylistVisitedY.get(g));
           }
           //ROBOTUN KENDİ KONUMUNUN BULUNDUĞU YER BURASIDIR BU YÜZDEN BAĞLAMALAR BURDAN YAPULMALIDIR
         //  int[] arrayyyy;
          // vertex[temp.arraylistVisitedid.get()]=graph.addVertex(1);//bunların ikiside id numarasıdır robotun etrafındaki karelerin
           //id numaralarını bularak her turda yeni gelen id leri ekliycek şekilde bir algoritma kur aynı kazamda edgeleri de
         // arrayyyy= dijkstra2.shortestPathBetween(graph, vertex[2],vertex[7]);
           if(temp.PassObjectXY.get(numberFinish).getX()==this.x&&temp.PassObjectXY.get(numberFinish).getY()==this.y)
               {
                   
                   
                   
                   
                    
          
        
                   
                   
                   
                   
                   
                   System.out.println("YOOOOOOOOOOOOOOOOOOLLLLLLL");
                   
                   
                   
                   
             
                 int finished=temp.PassObjectXY.get(numberFinish).getId();
                     // int finishid=     temp.arraylistVisitedid.get(temp.arraylistVisitedid.size()-1);
                        int startid=    temp.arraylistVisitedid.get(0);
                     //   dijkstra2.dijkstraResultPrinter(dijkstra2.dijkstra(graph, vertex[startid]));
                  array6=   dijkstra2.shortestPathBetween(graph, vertex[startid], vertex[finished],array6);
                    
                 
       
     
                   
                squarenumber=   temp.arraylistVisitedX.size();
                   
                   
                   
                   
                   
                   endTime = System.currentTimeMillis();
                  timer.stop();
               }
                  
     /* 
     if(gk==0)
     {
         this.x= robot.Left(this.x);
     }
     else if(gk==1)
     {
         this.x=robot.Right(this.x);
     }
          
         
      */
      
       
//robot.İsVisitedLeft(this.x, this.y);
        
       // visited.setId(id);
       // stack.arraylistVisited.
        
       // robot.Left(this.x);
       
           
       if(!temp.arraylistVisitedX.isEmpty())
       {
           
       
     //   System.out.println("BSJKAHGDHKGSKDG:  "+temp.arraylistVisitedX.get(temp.arraylistVisitedid.get(temp.arraylistVisitedid-1))+"   "+temp.arraylistVisitedY.get(temp.arraylistVisitedX.size()-1));//burda sorun yok 
        //System.out.println("BSJKAHGDHKGSKDG:  "+temp.arraylistVisitedX.get(temp.arraylistVisitedX.size()-2)+"   "+temp.arraylistVisitedY.get(temp.arraylistVisitedX.size()-2));//burda so
       }
       // System.out.println("BSJKAHGDHKGSKDG:  "+temp.PassObjectXY.get(numberStart).getX()+"   "+temp.PassObjectXY.get(numberStart).getY());
        //aynı anda problem1 e denemek için 2-3 kere basıosun ya o yüzden farklı sayılar basıo;
       
       // this.x += 30;
        //this.y += 30;
     // this.x= robot.Left(this.x);
     //  this.y=robot.up(this.y);
        // Repaint the panel to update the image's position
       repaint();
    }
    
    
      
private Image getImage() {
        // Load the image from file
        // Replace "image.png" with the actual file name and location
        return Toolkit.getDefaultToolkit().getImage("C:\\Users\\izemd\\OneDrive\\Masaüstü\\bakalkskj.png");
    }
}
