
    package graph;
import java.util.*;

class Graph{
     ArrayList<ArrayList<Integer>>l=new ArrayList<> ();
     public  Graph(int v){
            for (int i = 0; i <v; i++) {
                 l.add(new ArrayList<Integer> ());
            }
     } 
     public void addedge(int u,int v){
         l.get(u).add(v);
         l.get(v).add(u);
    }
    public void display(){
        for (int i = 0; i < l.size()-1; i++) {
            System.out.println("Element in the list"+i);
            for (int j = 0; j < l.get(i).size(); j++) {
                System.out.println(l.get(i).get(j));
            }
        }
    }
    public void bfs(int v){
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[l.size()];
        q.add(v);
        visited[v]=true;
        while(q.size()!=0){
             int vertex=q.remove();
             System.out.print(vertex+" ");
             for (int i = 0; i < l.get(vertex).size(); i++) {
                 int av=l.get(vertex).get(i);
                 if(!visited[av]){
                    q.add(av);
                    visited[av]=true; 
                } 
             }
        }
    }
    public void dfs(int v){
        Stack<Integer> s=new Stack<>();
        boolean visited[]=new boolean[l.size()];
        s.add(v);
        visited[v]=true;
        while(s.size()!=0){
             int vertex=s.pop();
             System.out.print(vertex+" ");
             for (int i = 0; i < l.get(vertex).size(); i++) {
                 int av=l.get(vertex).get(i);
                 if(!visited[av]){
                    s.add(av);
                    visited[av]=true; 
                } 
             }
        }
    }
}

 public class Graph1 {

    public static void main(String[] args) {
 
        Graph g=new Graph(5);
        g.addedge(0, 1);
        g.addedge(0, 3);
        g.addedge(1, 2);
        g.addedge(1, 3);
        g.addedge(2, 4);
        g.addedge(3, 4);
        g.bfs(0);
        System.out.println();
        g.dfs(0);

        // g.display();
        
    }
}

