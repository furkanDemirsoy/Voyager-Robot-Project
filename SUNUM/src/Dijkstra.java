import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class Dijkstra {
public Coordinate f=new Coordinate();
    public static Dictionary[] dijkstra(Graph Graph, Vertex StartSquare) {
        Dictionary<Integer, Integer> CostSquare = new Hashtable<>();
        Dictionary<Integer, Vertex> FormerVertex = new Hashtable<>();
        PriorityQueue<QueueObject> queue = new PriorityQueue<QueueObject>();

        queue.add(new QueueObject(StartSquare, 0));

        for (Vertex vertex: Graph.getVertices()) {
            if (vertex != StartSquare) {
                CostSquare.put(vertex.getData(), Integer.MAX_VALUE);
            }
            FormerVertex.put(vertex.getData(), new Vertex(0));
        }

        CostSquare.put(StartSquare.getData(), 0);

        while (queue.size() != 0) {
            Vertex AvaliableVertex = queue.poll().vertex;
            for (Edge e: AvaliableVertex.getEdges()) {
                Integer alternative = CostSquare.get(AvaliableVertex.getData()) + e.getWeight();
                int AdjacentCostValue = e.getEnd().getData();
                if (alternative < CostSquare.get(AdjacentCostValue)) {
                    CostSquare.put(AdjacentCostValue, alternative);
                    FormerVertex.put(AdjacentCostValue, AvaliableVertex);
                    queue.add(new QueueObject(e.getEnd(), CostSquare.get(AdjacentCostValue)));
                }
            }
        }
        return new Dictionary[]{CostSquare, FormerVertex};
    }

    public  int[] shortestPathBetween(Graph g, Vertex Start, Vertex Finish,int [] array9) {
        Dictionary[] dijkstraDictionaries = dijkstra(g, Start);
        Dictionary CostSquare = dijkstraDictionaries[0];
        Dictionary FormerVertex = dijkstraDictionaries[1];
        
        int i=0;
        Integer distance = (Integer) CostSquare.get(Finish.getData());
      //  System.out.println("Shortest Distance between " + Start.getData() + " and " + Finish.getData());
       // System.out.println(distance);

        ArrayList<Vertex> path = new ArrayList<>();
        Vertex v = Finish;

        while (v.getData() != 0) {
            path.add(0, v);
            v = (Vertex) FormerVertex.get(v.getData());
        }
     //   System.out.println("Shortest Path");
        for (Vertex pathVertex: path){
            System.out.println(pathVertex.getData());
            
            f.dijikstralist.add(pathVertex.getData());
            i++;
        }
return array9;
    }


   

}
