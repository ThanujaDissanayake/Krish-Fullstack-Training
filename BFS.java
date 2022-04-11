import java.awt.geom.Line2D;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BFS {

    //Create Edge class for the graph
    static class Edge{
        int data;
        boolean isVisited ;
        static LinkedList <Edge> adjEdges; // To add adecent adges for current adge

        public Edge(int data) {
            this.data = data;
            this.adjEdges=new LinkedList<Edge>();
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public LinkedList<Edge> getAdjEdges() {
            return adjEdges;
        }

        public void setAdjEdges(LinkedList<Edge> adjEdges) {
            this.adjEdges = adjEdges;
        }

        // Adding adjecent adges to a LinkediLst
        public void addAdjEdge(Edge t){
            this.adjEdges.add(t);
        }
    }

    public void bfs(Edge src){

        // Create a queue for Breath First Search
        Queue<Edge> queue= new LinkedList<Edge>();
        // Add current adge to the Stack
        queue.add(src);

        //Check the emptyness of the queue to stop searching
        while (!queue.isEmpty()){
            // Remove an elements from queue
            Edge result=queue.remove();
            System.out.print(result.data+" ");

            //Check whether Root/current adge has sibligs or not.if it has, adding the adges to a list
            LinkedList<Edge> adjAdges=result.getAdjEdges();
            for (int i=0;i<adjAdges.size();i++){
                Edge e=adjAdges.get(i);
                if(e!=null && !e.isVisited){
                    queue.add(e);
                    e.isVisited=true;
                }
            }
        }
    }

    public static void main(String[] args) {
        Edge e0=new Edge(0);
        Edge e1=new Edge(1);
        Edge e2=new Edge(2);
        Edge e3=new Edge(3);
        Edge e4=new Edge(4);
        Edge e5=new Edge(5);
        Edge e6=new Edge(6);
        Edge e7=new Edge(7);

        e0.addAdjEdge(e3);
        e3.addAdjEdge(e7);
        e3.addAdjEdge(e5);
        e5.addAdjEdge(e6);
        e6.addAdjEdge(e2);
        e2.addAdjEdge(e1);

        BFS bfsImpl=new BFS();

	System.out.println("Breadth First Searching");
        //Callling BFS Traversal Method
        bfsImpl.bfs(e0);

    }

}









