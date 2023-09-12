import java.util.ArrayList;

public class Vertex {

    private int Value;
    private ArrayList<Edge> Cost;

    public Vertex(int inputData) {
        this.Value = inputData;
        this.Cost = new ArrayList<Edge>();
    }

    public void addEdge(Vertex endVertex, Integer weight) {
        this.Cost.add(new Edge(this, endVertex, weight));
    }

    public void removeEdge(Vertex endVertex) {
        this.Cost.removeIf(edge -> edge.getEnd().equals(endVertex));
    }

    public int getData() {
		return this.Value;
	}

	public ArrayList<Edge> getEdges(){
		return this.Cost;
	}

}
