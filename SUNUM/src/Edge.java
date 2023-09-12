public class Edge {
	private Vertex first;
	private Vertex finish;
	private Integer cost;

	public Edge(Vertex a, Vertex b, Integer c) {
		this.first = a;
		this.finish = b;
		this.cost = c;
	}

	public Vertex getStart() {
		return this.first;
	}
	
	public Vertex getEnd() {
		return this.finish;
	}
	
	public Integer getWeight() {
		return this.cost;
	}
}
