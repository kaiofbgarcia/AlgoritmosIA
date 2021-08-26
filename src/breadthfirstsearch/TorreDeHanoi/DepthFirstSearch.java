/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;
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
        if(v == 1 || v==27){
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
        Graph g = new Graph(28); // Nº de Vertices +1
        
        ArrayList<String> cities = new ArrayList();     //Array das cidades para printar        
        
        cities.add("0");
        cities.add("AAA");
        cities.add("BAA");
        cities.add("CAA");
        cities.add("BCA");
        cities.add("CBA");
        cities.add("CCA");
        cities.add("ACA");
        cities.add("ABA");
        cities.add("BBA");
        cities.add("CCB");
        cities.add("BBC");
        cities.add("ACB");
        cities.add("BCB");
        cities.add("CBC");
        cities.add("ABC");
        cities.add("ABB");
        cities.add("BAB");
        cities.add("CAC");
        cities.add("ACC");
        cities.add("BBB");
        cities.add("CBB");
        cities.add("CAB");
        cities.add("AAB");
        cities.add("AAC");
        cities.add("BAC");
        cities.add("BCC");
        cities.add("CCC");

        g.addEdge(1, 2); // Adiciona os vertices e ligações
        g.addEdge(1, 3);
        
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        
        g.addEdge(3, 5);
        
        g.addEdge(4, 6);
        g.addEdge(4, 7);
        
        g.addEdge(5, 8);
        g.addEdge(5, 9);
        
        g.addEdge(6, 7);
        g.addEdge(6, 10);
        
        g.addEdge(7, 8);
        
        g.addEdge(8, 9);
        
        g.addEdge(9, 11);
        
        g.addEdge(10, 12);
        g.addEdge(10, 13);
        
        g.addEdge(11, 14);
        g.addEdge(11, 15);
        
        g.addEdge(12, 13);
        g.addEdge(12, 16);
        
        g.addEdge(13, 17);
        
        g.addEdge(14, 15);
        g.addEdge(14, 18);
        
        g.addEdge(15, 19);
        
        g.addEdge(16, 20);
        g.addEdge(16, 21);
        
        g.addEdge(17, 22);
        g.addEdge(17, 23);
        
        g.addEdge(18, 24);
        g.addEdge(18, 25);
        
        g.addEdge(19, 15);
        g.addEdge(19, 26);
        g.addEdge(19, 27);
        
        g.addEdge(20, 21);
        
        g.addEdge(21, 22);
        
        g.addEdge(22, 23);
        
        g.addEdge(23, 24);
        
        g.addEdge(24, 25);
        
        g.addEdge(25, 26);
        
        g.addEdge(26, 27);
        
        long tempoInicial = System.currentTimeMillis();
        System.out.println("Seguindo o metodo DepthFirstSearch, tendo como origem a " + cities.get(1) + " e como alvo " + cities.get(27));
        g.DFS(1, cities);
        System.out.println("\n\nExecutou em " + (System.currentTimeMillis() - tempoInicial) + " ms");
    }
}