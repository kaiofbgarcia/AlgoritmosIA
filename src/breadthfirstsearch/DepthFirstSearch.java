/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breadthfirstsearch;
 /**
 *
 * @author kaiof
 */

import java.util.*;

class Graph {
    private final int V; // Nº de vertices
 
    private final LinkedList<Integer> adj[];
 
    @SuppressWarnings("unchecked") Graph(int v){
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }
    void addEdge(int v, int w){
        adj[v].add(w); // Adiciona w na lista v
    }
    void DFSUtil(int v, boolean visited[], ArrayList cities){
        visited[v] = true;
        if(v == 1 || v==2){
            System.out.println("== " + cities.get(v) + " ==");
        }else System.out.println(cities.get(v) + " ");

        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()){
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited, cities);
        }
    }
    void DFS(int v, ArrayList cities){
        boolean visited[] = new boolean[V];
 
        DFSUtil(v, visited, cities);
    }
    public static void main(String args[]){
        Graph g = new Graph(21); // Nº de Vertices +1
        
        ArrayList<String> cities = new ArrayList();     //Array das cidades para printar
        cities.add("nulo"); //Cidade 0
        cities.add("Arad"); //Cidade 1
        cities.add("Bucharest"); //Cidade 2
        cities.add("Craiova"); //Cidade 3
        cities.add("Dobreta"); //Cidade 4
        cities.add("Eforie"); //Cidade 5
        cities.add("Fagaras"); //Cidade 6
        cities.add("Giurgio"); //Cidade 7
        cities.add("Hirsova"); //Cidade 8
        cities.add("Iasi"); //Cidade 9
        cities.add("Lugoj"); //Cidade 10
        cities.add("Mehadia"); //Cidade 11
        cities.add("Neamt"); //Cidade 12
        cities.add("Oradea"); //Cidade 13
        cities.add("Pitesti"); //Cidade 14
        cities.add("Rimnicu_Vilsea"); //Cidade 15
        cities.add("Sibiu"); //Cidade 16
        cities.add("Timisora"); //Cidade 17
        cities.add("Urziceni"); //Cidade 18
        cities.add("Vaslui"); //Cidade 19
        cities.add("Zerind"); //Cidade 20
        
        g.addEdge(1, 16); // Adiciona os vertices e ligações
        g.addEdge(1, 17);
        g.addEdge(1, 20);
        
        g.addEdge(2, 6);
        g.addEdge(2, 7);
        g.addEdge(2, 14);
        g.addEdge(2, 18);
        
        g.addEdge(3, 4);
        g.addEdge(3, 14);
        g.addEdge(3, 15);
  
        g.addEdge(4, 3);
        g.addEdge(4, 11);

        g.addEdge(5, 8);
        
        g.addEdge(6, 2);
        g.addEdge(6, 16);
        
        g.addEdge(7, 2);
        
        g.addEdge(8, 5);
        g.addEdge(8, 18);
        
        g.addEdge(9, 12);
        g.addEdge(9, 19);
        
        g.addEdge(10, 11);
        g.addEdge(10, 17);
        
        g.addEdge(11, 4);
        g.addEdge(11, 10);
        
        g.addEdge(12, 9);
        
        g.addEdge(13, 16);
        g.addEdge(13, 20);
        
        g.addEdge(14, 2);
        g.addEdge(14, 3);
        g.addEdge(14, 15);
        
        g.addEdge(15, 3);
        g.addEdge(15, 14);
        g.addEdge(15, 16);
        
        g.addEdge(16, 1);
        g.addEdge(16, 6);
        g.addEdge(16, 13);
        g.addEdge(16, 15);
        
        g.addEdge(17, 1);
        g.addEdge(17, 10);
        
        g.addEdge(18, 2);
        g.addEdge(18, 8);
        g.addEdge(18, 19);
        
        g.addEdge(19, 9);
        g.addEdge(19, 18);
        
        g.addEdge(20, 1);
        g.addEdge(20, 13);
        
        System.out.println("Seguindo o metodo DepthFirstSearch, tendo como origem a " + cities.get(1) + " e como alvo " + cities.get(2));
 
        g.DFS(1, cities);
    }
}