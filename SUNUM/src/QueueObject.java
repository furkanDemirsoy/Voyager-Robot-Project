public class QueueObject implements Comparable<QueueObject> {
    public Vertex vertex;
    public int imp;

    public QueueObject(Vertex v, int p){
        this.vertex = v;
        this.imp = p;
    }

    @Override
    public int compareTo(QueueObject o) {
        if (this.imp == o.imp){
            return 0;
        }
        else if (this.imp > o.imp){
            return 1;
        }
        else {
            return -1;
        }
    }
}