
import java.util.ArrayList;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author izemd
 */
public class Coordinate {
    private int X;
    private int Y;
    private int id;
    public int numberStart;
    public int numberFinish;
  public  ArrayList<Coordinate> AllObjectXY=new ArrayList<>();
  public  ArrayList<Coordinate> Obstacle3XY=new ArrayList<>();
  public  ArrayList<Coordinate> Obstacle2XY=new ArrayList<>();
  public  ArrayList<Coordinate> PassObjectXY=new ArrayList<>();
  public  ArrayList<Coordinate>Obstacle1XY=new ArrayList<>();        
  public  ArrayList<Integer>Start=new ArrayList<>(); // bunlar PASSOBJECTXY NİN İNDEXLERİDİR
  public  ArrayList<Integer>Finish=new ArrayList<>(); 
  public ArrayList<Integer> arraylistVisitedX=new ArrayList<>();
  public ArrayList<Integer> arraylistVisitedY=new ArrayList<>(); 
  public ArrayList<Integer> arraylistVisitedid=new ArrayList<>(); 
  public ArrayList<Integer> arraylistKACISX=new ArrayList<>();
  public ArrayList<Integer> arraylistKACISY=new ArrayList<>();
  public ArrayList<Integer> arraylistShortPath=new ArrayList<>();
  public ArrayList<Integer> isMakingVertex=new ArrayList<>();
  public ArrayList<Integer> dijikstralist=new ArrayList<>();
  public ArrayList<Integer> seenList=new ArrayList<>();
  public ArrayList<Integer> seenListShadow=new ArrayList<>();
    /**
     * @return the X
     */
    public int getX() {
        return X;
    }

    /**
     * @param X the X to set
     */
    public void setX(int X) {
        this.X = X;
    }

    /**
     * @return the Y
     */
    public int getY() {
        return Y;
    }

    /**
     * @param Y the Y to set
     */
    public void setY(int Y) {
        this.Y = Y;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
    
            
}
