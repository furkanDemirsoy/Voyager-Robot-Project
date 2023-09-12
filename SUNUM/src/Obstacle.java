
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Stack;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * maze class, generate and solve the mass
 * 
 * @author Zayed
 *
 */
public class Obstacle extends JPanel implements ActionListener{

	private int cols, rows; // dimensions in units of cells
	private int cellSize; // size of 1 cell in pixels
          
    

	
	private enum FeatureSquare {
		
		ObstacleObject,

		
		EMPTY,

		
		PassObject,

		
		SOLUTION
	}

	private FeatureSquare[][] ArrayLabyrinth; // main data structure

	// start and stop positions of the maze
	private Point start;
	private Point stop;
        private Timer timer;

	
	public Obstacle(int width, int height, int size) {
		size = Math.abs(size);
		
		cols = Math.abs(width) / size;
		rows = Math.abs(height) / size;

		// make them biggest odd number smaller or equal
		cols = cols - 1 + cols % 2;
		rows = rows - 1 + rows % 2;

		cellSize = size;

		start = new Point(0, 1);
		stop = new Point(cols - 1, rows - 2);
 timer = new Timer(100, this);
 
 
 try {
      File myObj = new File("filename.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
		configure();
		generate();
                
                
                 try {
                     FileWriter myWriter = new FileWriter("filename2.txt");
                     for(int i=0;i<cols;i++)
                     {
                         for(int j=0;j<rows;j++)
                         {
                             if(ArrayLabyrinth[j][i]==FeatureSquare.PassObject)
                             {
                                 myWriter.write("0");
                             }
                             if(ArrayLabyrinth[j][i]==FeatureSquare.ObstacleObject)
                             {
                                 myWriter.write("1");
                             }
                              if(ArrayLabyrinth[j][i]==FeatureSquare.EMPTY) 
                              {
                                 myWriter.write("0");
                             }
                               if(ArrayLabyrinth[j][i]==FeatureSquare.SOLUTION) 
                              {
                                 myWriter.write("0");
                             }
                         }
                         myWriter.write("\n");
                     }
                     
      
      
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
                
                
		
               
                
	}

	
	public void configure() {

		ArrayLabyrinth = new FeatureSquare[cols][rows];

		
		int i, j;

		for (j = 0; j < rows; j++) {
			ArrayLabyrinth[0][j] = FeatureSquare.ObstacleObject;
			ArrayLabyrinth[cols - 1][j] = FeatureSquare.ObstacleObject;
		}
		for (i = 0; i < cols; i++) {
			ArrayLabyrinth[i][0] = FeatureSquare.ObstacleObject;
			ArrayLabyrinth[i][rows - 1] = FeatureSquare.ObstacleObject;
		}

		
		for (i = 1; i < cols - 1; i += 2) {
			for (j = 1; j < rows - 1; j += 2) {
				ArrayLabyrinth[i][j] = FeatureSquare.EMPTY;
				ArrayLabyrinth[i + 1][j] = FeatureSquare.ObstacleObject;
				ArrayLabyrinth[i][j + 1] = FeatureSquare.ObstacleObject;
			}
		}
		for (i = 2; i < cols - 2; i += 2) {
			for (j = 2; j < rows - 2; j += 2) {
				ArrayLabyrinth[i][j] = FeatureSquare.ObstacleObject;
			}
		}
	}

	/**
	 * generate the maze
	 */
	public void generate() {
		Point AvailableCell, next;
		Stack<Point> history = new Stack<Point>();

		int nToVisit = (cols - 1) * (rows - 1) / 4;
		int nVisited = 1;

		AvailableCell = new Point(start.x + 1, start.y);
		ArrayLabyrinth[AvailableCell.x][AvailableCell.y] = FeatureSquare.PassObject;

		while (nVisited < nToVisit) {

			next = checkNext(AvailableCell, FeatureSquare.EMPTY, 2);
			if (next != null) {
				int x = (AvailableCell.x + next.x) / 2;
				int y = (AvailableCell.y + next.y) / 2;
				ArrayLabyrinth[x][y] = FeatureSquare.PassObject;

				history.push(AvailableCell);
				AvailableCell= next;
				ArrayLabyrinth[AvailableCell.x][AvailableCell.y] = FeatureSquare.PassObject;

				nVisited++;
			} else if (!history.empty()) {
				AvailableCell = history.pop();
			}
		}
	}

	
	private Point checkNext(Point AvailableCell, FeatureSquare target, int dist) {

		final int n = 4; 

	
		Point[] options = { new Point(AvailableCell.x, AvailableCell.y + dist), new Point(AvailableCell.x, AvailableCell.y - dist),
				new Point(AvailableCell.x + dist, AvailableCell.y), new Point(AvailableCell.x - dist, AvailableCell.y) };

		boolean[] exitpath = new boolean[n]; 
		int adjacent = 0; 

		for (int i = 0; i < n; i++) {
			Point a = options[i];

			boolean g = a.x >= 0 && a.x < cols && a.y >= 0 && a.y < rows && ArrayLabyrinth[a.x][a.y] == target;
			exitpath[i] = g;

			if (g)
				adjacent++;
		}

		if (adjacent== 0)
			return null; 

		int rand = (int) (Math.random() * n);
		while (!exitpath[rand]) {
			rand = (int) (Math.random() * n);
		}

		return options[rand]; 

	}

	/**
	 * solve the maze
	 */
	

	
        @Override
    public void actionPerformed(ActionEvent e) {
       
       
                
    }
}
