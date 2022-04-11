import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class DFS {

    //Create Edge class fr the graph
    static class Edge{
        int data;
        boolean isVisited ;
        static LinkedList <Edge> adjEdges; // For adding adecent adges to current adge

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

        // Adding adecent adges to a LinkediLst
        public void addAdjEdge(Edge t){
            this.adjEdges.add(t);
        }
    }

    public void dfs(Edge src){

        // Create a stack for Deapth First Search
        Stack<Edge> stack= new Stack<>();
        // Add current adge to the Stack
        stack.add(src);

        //Check the emptyness of the stack to stop searching
        while (!stack.isEmpty()){
            // Remove an element from stack
            Edge result=stack.pop();
            //Check whether,which has been already visited/explored or not.
            if(!result.isVisited) {
                System.out.print(result.data + " ");
                result.isVisited = true;
            }

            //Check whether Root/current adge has sibligs or not.if it has, adding the rest adges to the stack
            LinkedList<Edge> adjAdges=result.getAdjEdges();
            for (int i=0;i<adjAdges.size();i++){
                Edge e=adjAdges.get(i);
                if(e!=null && !e.isVisited){
                    stack.add(e);
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

        DFS dfsImpl=new DFS ();

	System.out.println("Depth First Search");
        //Callling Traversal Method
        dfsImpl.dfs(e0);

    }

}









