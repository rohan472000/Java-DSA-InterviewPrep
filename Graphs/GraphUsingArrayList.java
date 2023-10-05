//Implementing graph using java
//Implemented adjacency list using arraylist
//for undirected unweighted graph

package Graphs;

import java.util.*; 

public class GraphUsingArrayList 
{

    //storing edges(source and destination) in the list
    static void addEdge(ArrayList<ArrayList<Integer> > graph, int s, int d) 
    { 
        graph.get(s).add(d); 
        graph.get(d).add(s); 
    } 

    static void printAdjacencyList(ArrayList<ArrayList<Integer> > graph) 
    { 
        for (int i = 0; i < graph.size(); i++) { 
            //Printing the vertex
            System.out.println("Adjacency list of " + i); 
            for (int j = 0; j < graph.get(i).size(); j++) { 
                //printing neighbours vertices
                System.out.print(graph.get(i).get(j) + " "); 
            } 
            System.out.println(); 
        } 
    } 

    //creating graph by adding edges
    public static void createGraph(ArrayList<ArrayList<Integer> > graph, int v) 
    {
        for (int i = 0; i < v ; i++) 
            graph.add(new ArrayList<Integer>()); 
  
        // adding edges 
        addEdge(graph, 0, 1); 
        addEdge(graph, 0, 4); 
        addEdge(graph, 1, 2); 
        addEdge(graph, 1, 3); 
        addEdge(graph, 1, 4); 
        addEdge(graph, 2, 3); 
        addEdge(graph, 3, 4); 

    }

    public static void main(String[] args) 
    { 
        //creating a graph of 5 vertices
        int v = 5; 
        ArrayList<ArrayList<Integer> > graph = new ArrayList<ArrayList<Integer> >(v); 
        createGraph(graph,v);
        printAdjacencyList(graph); 
    }
}