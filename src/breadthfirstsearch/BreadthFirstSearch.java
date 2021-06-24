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

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {
    private Queue<No> queue;
    static ArrayList<No> no=new ArrayList<No>();
    static class No{
        String cidade;
        boolean visited;
        List<No> neighbours;
 
        No(String cidade)
        {
            this.cidade=cidade;
            this.neighbours=new ArrayList<>();
        }
        public void addneighbours(No neighbourNode)
        {
            this.neighbours.add(neighbourNode);
        }
        public List<No> getNeighbours() {
            return neighbours;
        }
        public void setNeighbours(List<No> neighbours) {
            this.neighbours = neighbours;
        }
    }
 
    public BreadthFirstSearch()
    {
        queue = new LinkedList<No>();
    }
 
    public void bfs(No no){
        queue.add(no);
        no.visited=true;
        while (!queue.isEmpty()){
            No element=queue.remove();
            if ("Bucharest".equals(element.cidade)){
                System.out.print(element.cidade + "  ");
                break;
            }else{
            System.out.print(element.cidade + " | ");
            }
            List<No> neighbours=element.getNeighbours();
            for (int i = 0; i < neighbours.size(); i++) {
                No n=neighbours.get(i);
                if(n!=null && !n.visited)
                {
                    queue.add(n);
                    n.visited=true;
                }  
            }
            /*if ("Bucharest".equals(element.cidade)){
                break;
            }*/
        }
    }
 
    public static void main(String arg[]){
        No no1 =new No("Arad");
        No no2 =new No("Bucharest");
        No no3 =new No("Craiova");
        No no4 =new No("Dobreta");
        No no5 =new No("Eforie");
        No no6 =new No("Fagaras");
        No no7 =new No("Giurgio");
        No no8 =new No("Hirsova");
        No no9 =new No("Iasi");
        No no10 =new No("Lugoj");
        No no11 =new No("Mehadia");
        No no12 =new No("Neamt");
        No no13 =new No("Oradea");
        No no14 =new No("Pitesti");
        No no15 =new No("Rimnicu_Vilsea");
        No no16 =new No("Sibiu");
        No no17 =new No("Timisora");
        No no18 =new No("Urziceni");
        No no19 =new No("Vaslui");
        No no20 =new No("Zerind");
        
        no1.addneighbours(no16);
        no1.addneighbours(no17);
        no1.addneighbours(no20);
        
        no2.addneighbours(no6);
        no2.addneighbours(no7);
        no2.addneighbours(no14);
        no2.addneighbours(no18);
        
        no3.addneighbours(no4);
        no3.addneighbours(no14);
        no3.addneighbours(no15);
        
        no4.addneighbours(no3);
        no4.addneighbours(no11);
        
        no5.addneighbours(no8);
        
        no6.addneighbours(no2);
        no6.addneighbours(no16);
        
        no7.addneighbours(no2);
        
        no8.addneighbours(no5);
        no8.addneighbours(no18);
        
        no9.addneighbours(no12);
        no9.addneighbours(no19);
        
        no10.addneighbours(no11);
        no10.addneighbours(no17);
        
        no11.addneighbours(no4);
        no11.addneighbours(no10);
        
        no12.addneighbours(no9);
        
        no13.addneighbours(no16);
        no13.addneighbours(no20);
        
        no14.addneighbours(no2);
        no14.addneighbours(no3);
        no14.addneighbours(no15);
        
        no15.addneighbours(no3);
        no15.addneighbours(no14);
        no15.addneighbours(no16);
        
        no16.addneighbours(no1);
        no16.addneighbours(no6);
        no16.addneighbours(no13);
        no16.addneighbours(no15);
        
        no17.addneighbours(no1);
        no17.addneighbours(no10);
        
        no18.addneighbours(no2);
        no18.addneighbours(no8);
        no18.addneighbours(no19);
        
        no19.addneighbours(no9);
        no19.addneighbours(no18);
        
        no20.addneighbours(no1);
        no20.addneighbours(no13);
        
        System.out.println("O caminho encontrado foi : ");
        BreadthFirstSearch bfsExample = new BreadthFirstSearch();
        bfsExample.bfs(no1);
    }
}
