/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author izemd
 */
public class Robot2 {
     public int Right(int x)
    {
        x=x+20;
        return x;
    }
   
    
    public int Left(int x)
    {
        x=x-20;
        return x;
    }
    
    
    public int up(int y)
    {
        y=y-20;
        return y;
    }
    public int down(int y)
    {
        y=y+20;
         
            
           
        return y;
       
       
    }
    
    
    
    public int[] cornerUpLeft(int x,int y)
    {
        int[] arrayXY=new int[2];
        x=x-20;
        y=y-20;
        arrayXY[0]=x;
        arrayXY[1]=y;
        return arrayXY;
        
    }
    public int[] cornerUpRight(int x,int y)
    {
        int[] arrayXY=new int[2];
        x=x+20;
        y=y-20;
        arrayXY[0]=x;
        arrayXY[1]=y;
        return arrayXY;
        
        
    }
    
    public int[] cornerDownRight(int x,int y)
    { int[] arrayXY=new int[2];
        x=x+20;
        y=y+20;
        arrayXY[0]=x;
        arrayXY[1]=y;
        return arrayXY;
    }
    public int[] cornerDownLeft(int x,int y)
    {
        int[] arrayXY=new int[2];
        x=x-20;
        y=y+20;
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
