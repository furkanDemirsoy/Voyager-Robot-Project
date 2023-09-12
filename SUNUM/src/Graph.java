import java.util.ArrayList;

public class Graph {
    
    private ArrayList<Vertex> vertices;
    private boolean isCost;
    private boolean isTwoWay;

    public Graph(boolean w, boolean d) {
        this.vertices = new ArrayList<Vertex>();
        this.isCost = w;
        this.isTwoWay = d;
    }

    public Vertex addVertex(int data) {
        Vertex newVertex = new Vertex(data);
        this.vertices.add(newVertex);
        return newVertex;
    }

    public void addEdge(Vertex a, Vertex b, Integer weight) {
        if (!this.isCost) {
            weight = null;
        }
        a.addEdge(b, weight);
        if (!this.isTwoWay) {
            b.addEdge(a, weight);
        }
    }

    public void removeEdge(Vertex a, Vertex b) {
        a.removeEdge(b);
        if (!this.isTwoWay) {
            b.removeEdge(a);
        }
    }

    public void removeVertex(Vertex a) {
        this.vertices.remove(a);
    }

    public ArrayList<Vertex> getVertices() {
		return this.vertices;
	}

	public boolean isWeighted() {
		return this.isCost;
	}

	public boolean isDirected() {
		return this.isTwoWay;
	}

	public Vertex getVertexByValue(int value) {
		for(Vertex v: this.vertices) { 
			if (v.getData() == value) {
				return v;
			}
		}

		return null;
	}
	

}
