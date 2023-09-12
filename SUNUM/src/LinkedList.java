public class LinkedList {
	
	public Node node;

	public LinkedList() {
		this.node = null;
	}

	public void addToHead(Vertex data) {
		Node newHead = new Node(data);
        Node AvailableHead = this.node;
        this.node = newHead;
        if (AvailableHead != null) {
          this.node.setNextNode(AvailableHead);
        }
	}

    public void addToTail(Vertex data) {
        Node t = this.node;
        if (t == null) {
          this.node = new Node(data);
        } else {
          while (t.getNextNode() != null) {
            t = t.getNextNode();
          }
          t.setNextNode(new Node(data));
        }
    }

    public Vertex removeHead() {
        Node deletednode = this.node;
        if (deletednode == null) {
          return null;
        }
        this.node = deletednode.getNextNode();
        return deletednode.data;
    }

  }