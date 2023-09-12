
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Timer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author izemd
 */
public class Robot {
   
    
   

    
    
    public int Right(int x)
    {
        x=x+30;
        return x;
    }
   
    
    public int Left(int x)
    {
        x=x-30;
        return x;
    }
    
    
    public int up(int y)
    {
        y=y-30;
        return y;
    }
    public int down(int y)
    {
        y=y+30;
         
            
           
        return y;
       
       
    }
    
    
    
    public int[] cornerUpLeft(int x,int y)
    {
        int[] arrayXY=new int[2];
        x=x-30;
        y=y-30;
        arrayXY[0]=x;
        arrayXY[1]=y;
        return arrayXY;
        
    }
    public int[] cornerUpRight(int x,int y)
    {
        int[] arrayXY=new int[2];
        x=x+30;
        y=y-30;
        arrayXY[0]=x;
        arrayXY[1]=y;
        return arrayXY;
        
        
    }
    
    public int[] cornerDownRight(int x,int y)
    { int[] arrayXY=new int[2];
        x=x+30;
        y=y+30;
        arrayXY[0]=x;
        arrayXY[1]=y;
        return arrayXY;
    }
    public int[] cornerDownLeft(int x,int y)
    {
        int[] arrayXY=new int[2];
        x=x-30;
        y=y+30;
        arrayXY[0]=x;
        arrayXY[1]=y;
        return arrayXY;
        
    }
    
    public static void wait(int ms)
{
    try
    {
        Thread.sleep(ms);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }
    
    
}
   
}
