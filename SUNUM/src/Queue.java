public class Queue {

    public LinkedList queue;
    public int dimension;
  
    public Queue() {
      this.queue = new LinkedList();
      this.dimension = 0;
    }
  
    public boolean isEmpty() {
      return this.dimension == 0;
    }
  
    public void enqueue(Vertex a) {
      this.queue.addToTail(a);
      this.dimension++;
    }
  
    public Vertex peek() {
      if (this.isEmpty()) {
        return null;
      } else {
        return this.queue.node.data;
      }    
    }
  
    public Vertex dequeue() {
      if (!this.isEmpty()) {
        Vertex a = this.queue.removeHead();
        this.dimension--;
        return a;
      } else {
        throw new Error("Queue BoŞ");
      }
    }
  
  }