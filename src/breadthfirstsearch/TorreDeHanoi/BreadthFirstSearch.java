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
        
        No no1 =new No("AAA");
        No no2 =new No("BAA");
        No no3 =new No("CAA");
        No no4 =new No("BCA");
        No no5 =new No("CBA");
        No no6 =new No("CCA");
        No no7 =new No("ACA");
        No no8 =new No("ABA");
        No no9 =new No("BBA");
        No no10 =new No("CCB");
        No no11 =new No("BBC");
        No no12 =new No("ACB");
        No no13 =new No("BCB");
        No no14 =new No("CBC");
        No no15 =new No("ABC");
        No no16 =new No("ABB");
        No no17 =new No("BAB");
        No no18 =new No("CAC");
        No no19 =new No("ACC");
        No no20 =new No("BBB");
        No no21 =new No("CBB");
        No no22 =new No("CAB");
        No no23 =new No("AAB");
        No no24 =new No("AAC");
        No no25 =new No("BAC");
        No no26 =new No("BCC");
        No no27 =new No("CCC");
        
        no1.addneighbours(no2);
        no1.addneighbours(no3); 
        
        no2.addneighbours(no3);
        no2.addneighbours(no4);
        
        no3.addneighbours(no5);
//        no3.addneighbours(no2);
        
//        no4.addneighbours(no2);
        no4.addneighbours(no6);
        no4.addneighbours(no7);
        
//        no5.addneighbours(no3);
        no5.addneighbours(no8);
        no5.addneighbours(no9);
        
//        no6.addneighbours(no4);
        no6.addneighbours(no7);
        no6.addneighbours(no10);
        
//        no7.addneighbours(no4);
//        no7.addneighbours(no6);
        no7.addneighbours(no8);
        
//        no8.addneighbours(no5);
//        no8.addneighbours(no7);
        no8.addneighbours(no9);
        
//        no9.addneighbours(no5);
//        no9.addneighbours(no8);
        no9.addneighbours(no11);
        
//        no10.addneighbours(no6);
        no10.addneighbours(no12);
        no10.addneighbours(no13);
        
//        no11.addneighbours(no9);
        no11.addneighbours(no14);
        no11.addneighbours(no15);
        
//        no12.addneighbours(no10);
        no12.addneighbours(no13);
        no12.addneighbours(no16);
        
//        no13.addneighbours(no10);
//        no13.addneighbours(no12);
        no13.addneighbours(no17);
        
//        no14.addneighbours(no11);
        no14.addneighbours(no15);
        no14.addneighbours(no18);
        
//        no15.addneighbours(no11);
//        no15.addneighbours(no14);
        no15.addneighbours(no19);
        
//        no16.addneighbours(no12);
        no16.addneighbours(no20);
        no16.addneighbours(no21);
        
//        no17.addneighbours(no13);
        no17.addneighbours(no22);
        no17.addneighbours(no23);
        
//        no18.addneighbours(no14);
        no18.addneighbours(no24);
        no18.addneighbours(no25);
        
        no19.addneighbours(no15);
        no19.addneighbours(no26);
        no19.addneighbours(no27);
        
//        no20.addneighbours(no16);
        no20.addneighbours(no21);
        
//        no21.addneighbours(no16);
//        no21.addneighbours(no20);
        no21.addneighbours(no22);
        
//        no22.addneighbours(no17);
//        no22.addneighbours(no21);
        no22.addneighbours(no23);
        
//        no23.addneighbours(no17);
//        no23.addneighbours(no22);
        no23.addneighbours(no24);
        
//        no24.addneighbours(no18);
//        no24.addneighbours(no23);
        no24.addneighbours(no25);
        
//        no25.addneighbours(no18);
//        no25.addneighbours(no24);
        no25.addneighbours(no26);
        
//        no26.addneighbours(no19);
//        no26.addneighbours(no25);
        no26.addneighbours(no27);
        
//        no27.addneighbours(no19);
//        no27.addneighbours(no26);
        
        long tempoInicial = System.currentTimeMillis();
        System.out.println("O caminho encontrado foi : ");
        BreadthFirstSearch bfsExample = new BreadthFirstSearch();
        bfsExample.bfs(no1);
        System.out.println("\n\nExecutou em " + (System.currentTimeMillis() - tempoInicial) + " ms");
    }
}
