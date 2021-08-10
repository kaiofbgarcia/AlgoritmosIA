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
        No no0 =new No("0");
        No no1 =new No("1");
        No no2 =new No("2");
        No no3 =new No("3");
        No no4 =new No("4");
        No no5 =new No("5");
        No no6 =new No("6");
        No no7 =new No("7");
        No no8 =new No("8");
        No no9 =new No("9");
        No no10 =new No("10");
        No no11 =new No("11");
        No no12 =new No("12");
        No no13 =new No("13");
        No no14 =new No("14");
        No no15 =new No("15");
        No no16 =new No("16");
        No no17 =new No("17");
        No no18 =new No("18");
        No no19 =new No("19");
        No no20 =new No("20");
        
        No no21 =new No("21");
        No no22 =new No("22");
        No no23 =new No("23");
        No no24 =new No("24");
        No no25 =new No("25");
        No no26 =new No("26");
        No no27 =new No("27");
        No no28 =new No("28");
        No no29 =new No("29");
        No no30 =new No("30");
        No no31 =new No("31");
        No no32 =new No("32");
        No no33 =new No("33");
        No no34 =new No("34");
        No no35 =new No("35");
        No no36 =new No("36");
        No no37 =new No("37");
        No no38 =new No("38");
        No no39 =new No("39");
        No no40 =new No("40");
        
        No no41 =new No("41");
        No no42 =new No("42");
        No no43 =new No("43");
        No no44 =new No("44");
        No no45 =new No("45");
        No no46 =new No("46");
        No no47 =new No("47");
        No no48 =new No("48");
        No no49 =new No("49");
        No no50 =new No("50");
        No no51 =new No("51");
        No no52 =new No("52");
        No no53 =new No("53");
        No no54 =new No("54");
        No no55 =new No("55");
        No no56 =new No("56");
        No no57 =new No("57");
        No no58 =new No("58");
        No no59 =new No("59");
        No no60 =new No("60");
        
        No no61 =new No("61");
        No no62 =new No("62");
        No no63 =new No("63");
        No no64 =new No("64");
        No no65 =new No("65");
        No no66 =new No("66");
        No no67 =new No("67");
        No no68 =new No("68");
        No no69 =new No("69");
        No no70 =new No("70");
        No no71 =new No("71");
        No no72 =new No("72");
        No no73 =new No("73");
        No no74 =new No("74");
        No no75 =new No("75");
        No no76 =new No("76");
        No no77 =new No("77");
        No no78 =new No("78");
        No no79 =new No("79");
        No no80 =new No("80");
        
        No no81 =new No("81");
        No no82 =new No("82");
        No no83 =new No("83");
        No no84 =new No("84");
        No no85 =new No("85");
        No no86 =new No("86");
        No no87 =new No("87");
        No no88 =new No("88");
        No no89 =new No("89");
        No no90 =new No("90");
        No no91 =new No("91");
        No no92 =new No("92");
        No no93 =new No("93");
        No no94 =new No("94");
        No no95 =new No("95");
        No no96 =new No("96");
        No no97 =new No("97");
        No no98 =new No("98");
        No no99 =new No("99");

        
        no0.addneighbours(no84);
        no0.addneighbours(no43);
        no0.addneighbours(no55);
        no0.addneighbours(no38);
        no0.addneighbours(no97);
        no0.addneighbours(no31);
        
        no1.addneighbours(no3);
        no1.addneighbours(no5);
        no1.addneighbours(no10);
        no1.addneighbours(no12);
        no1.addneighbours(no31);
        no1.addneighbours(no37);   
        
        no2.addneighbours(no12);
        no2.addneighbours(no35);
        no2.addneighbours(no8);
        no2.addneighbours(no29);
        no2.addneighbours(no37);
        no2.addneighbours(no38);
        
        no3.addneighbours(no1);
        no3.addneighbours(no35);
        no3.addneighbours(no29);
        no3.addneighbours(no6);
        no3.addneighbours(no32);
        no3.addneighbours(no87);
        
        no4.addneighbours(no43);
        no4.addneighbours(no24);
        no4.addneighbours(no15);
        no4.addneighbours(no34);
        no4.addneighbours(no79);
        
        no5.addneighbours(no1);
        no5.addneighbours(no33);
        no5.addneighbours(no99);
        
        no6.addneighbours(no3);
        no6.addneighbours(no8);
        no6.addneighbours(no99);
        
        no7.addneighbours(no32);
        no7.addneighbours(no69);
        no7.addneighbours(no81);
        no7.addneighbours(no51);
        no7.addneighbours(no82);
        
        no8.addneighbours(no2);
        no8.addneighbours(no6);
        
        no9.addneighbours(no83);
        no9.addneighbours(no88);
        no9.addneighbours(no96);
        
        no10.addneighbours(no1);
        no10.addneighbours(no86);
        
        no11.addneighbours(no40);
        no11.addneighbours(no64);
        no11.addneighbours(no70);

        
        no12.addneighbours(no1);
        no12.addneighbours(no2);
      
        no13.addneighbours(no27);
        no13.addneighbours(no54);
        no13.addneighbours(no80);
        
        no14.addneighbours(no57);
        no14.addneighbours(no91);
        
        no15.addneighbours(no4);
        no15.addneighbours(no17);
        
        no16.addneighbours(no19);
        no16.addneighbours(no28);
        no16.addneighbours(no30);
        no16.addneighbours(no78);
        
        no17.addneighbours(no15);
        no17.addneighbours(no21);
        no17.addneighbours(no34);
        no17.addneighbours(no91);
        
        no18.addneighbours(no36);
        no18.addneighbours(no54);
        no18.addneighbours(no89);
        
        no19.addneighbours(no16);
        no19.addneighbours(no89);
        
        no20.addneighbours(no24);
        no20.addneighbours(no43);
        no20.addneighbours(no84);
        
        no21.addneighbours(no17);
        no21.addneighbours(no24);
        
        no22.addneighbours(no26);
        no22.addneighbours(no82);
        no22.addneighbours(no83);
        no22.addneighbours(no88);
        
        no23.addneighbours(no52);
        no23.addneighbours(no91);
        
        no24.addneighbours(no4);
        no24.addneighbours(no20);
        no24.addneighbours(no21);
        
        no25.addneighbours(no27);
        no25.addneighbours(no77);
        no25.addneighbours(no82);    
        
        no26.addneighbours(no22);
        no26.addneighbours(no32);
        no26.addneighbours(no82);
        no26.addneighbours(no85);
        
        no27.addneighbours(no13);
        no27.addneighbours(no25);
        no27.addneighbours(no76);
        no27.addneighbours(no88);
        no27.addneighbours(no98);
        
        no28.addneighbours(no16);
        no28.addneighbours(no51);
        no28.addneighbours(no77);
        no28.addneighbours(no90);
        
        no29.addneighbours(no2);
        no29.addneighbours(no3);
        
        no30.addneighbours(no16);
        no30.addneighbours(no41);
        no30.addneighbours(no57);
        no30.addneighbours(no80);
        no30.addneighbours(no91);
        
        no31.addneighbours(no0);
        no31.addneighbours(no1);
        no31.addneighbours(no37);
        no31.addneighbours(no86);
        no31.addneighbours(no97);
        
        no32.addneighbours(no3);
        no32.addneighbours(no7);
        no32.addneighbours(no26);
        no32.addneighbours(no94);
        no32.addneighbours(no99);
        
        no33.addneighbours(no5);
        no33.addneighbours(no55);
        no33.addneighbours(no79);
        
        no34.addneighbours(no4);
        no34.addneighbours(no17);
        
        no35.addneighbours(no2);
        no35.addneighbours(no3);
        
        no36.addneighbours(no18);
        no36.addneighbours(no68);
        
        no37.addneighbours(no2);
        no37.addneighbours(no31);
        no37.addneighbours(no38);
        
        no38.addneighbours(no0);
        no38.addneighbours(no2);
        
        no39.addneighbours(no46);
        no39.addneighbours(no61);
        no39.addneighbours(no68);
        
        no40.addneighbours(no11);
        no40.addneighbours(no54);
        
        no41.addneighbours(no30);
        no41.addneighbours(no79);
        no41.addneighbours(no91);
        
        no42.addneighbours(no47);
        no42.addneighbours(no60);
        no42.addneighbours(no61);
        no42.addneighbours(no67);
        
        no43.addneighbours(no0);
        no43.addneighbours(no4);
        no43.addneighbours(no20);
        
        no44.addneighbours(no50);
        no44.addneighbours(no63);
        
        no45.addneighbours(no64);
        no45.addneighbours(no70);
        
        no46.addneighbours(no39);
        no46.addneighbours(no50);
        
        no47.addneighbours(no42);
        no47.addneighbours(no63);
        
        no48.addneighbours(no50);
        no48.addneighbours(no70);
        
        no49.addneighbours(no92);
        
        no50.addneighbours(no44);
        no50.addneighbours(no46);
        no50.addneighbours(no48);
        no50.addneighbours(no63);
        
        no51.addneighbours(no7);
        no51.addneighbours(no28);
        
        no52.addneighbours(no23);
        no52.addneighbours(no53);
        no52.addneighbours(no56);
        no52.addneighbours(no57);
        no52.addneighbours(no93);
        
        no53.addneighbours(no52);
        no53.addneighbours(no57);
        no53.addneighbours(no68);
        no53.addneighbours(no93);
        
        no54.addneighbours(no13);
        no54.addneighbours(no18);
        no54.addneighbours(no40);
        no54.addneighbours(no66);
        
        no55.addneighbours(no0);
        no55.addneighbours(no33);
        
        no56.addneighbours(no52);
        no56.addneighbours(no92);
        
        no57.addneighbours(no14);
        no57.addneighbours(no30);
        no57.addneighbours(no52);
        no57.addneighbours(no53);
        no57.addneighbours(no89);
        
        no58.addneighbours(no60);
        no58.addneighbours(no67);
        
        no59.addneighbours(no62);
        no59.addneighbours(no74);
        no59.addneighbours(no95);
        
        no60.addneighbours(no42);
        no60.addneighbours(no58);
        no60.addneighbours(no65);
        
        no61.addneighbours(no39);
        no61.addneighbours(no42);
        
        no62.addneighbours(no59);
        no62.addneighbours(no66);
        no62.addneighbours(no95);
        
        no63.addneighbours(no44);
        no63.addneighbours(no47);
        no63.addneighbours(no50);
        
        no64.addneighbours(no11);
        no64.addneighbours(no45);
        no64.addneighbours(no68);
        
        no65.addneighbours(no60);
        no65.addneighbours(no67);
        
        no66.addneighbours(no54);
        no66.addneighbours(no62);
        no66.addneighbours(no98);
        
        no67.addneighbours(no42);
        no67.addneighbours(no58);
        no67.addneighbours(no65);
        no67.addneighbours(no71);
        no67.addneighbours(no92);
        
        no68.addneighbours(no36);
        no68.addneighbours(no39);
        no68.addneighbours(no53);
        no68.addneighbours(no64);
        no68.addneighbours(no71);
        
        no69.addneighbours(no7);
        no69.addneighbours(no78);
        
        no70.addneighbours(no45);
        no70.addneighbours(no48);
        no70.addneighbours(no95);
        
        no71.addneighbours(no67);
        no71.addneighbours(no68);
        no71.addneighbours(no93);
        
        no72.addneighbours(no73);
        no72.addneighbours(no85);
        
        no73.addneighbours(no72);
        no73.addneighbours(no88);
        
        no74.addneighbours(no59);
        no74.addneighbours(no96);
        no74.addneighbours(no98);
        
        no75.addneighbours(no85);
        no75.addneighbours(no87);
        
        no76.addneighbours(no27);
        no76.addneighbours(no95);
        no76.addneighbours(no96);
        
        no77.addneighbours(no25);
        no77.addneighbours(no28);
        no77.addneighbours(no80);
        
        no78.addneighbours(no16);
        no78.addneighbours(no69);
        no78.addneighbours(no79);
        no78.addneighbours(no81);
        
        no79.addneighbours(no4);
        no79.addneighbours(no33);
        no79.addneighbours(no41);
        no79.addneighbours(no78);
        
        no80.addneighbours(no13);
        no80.addneighbours(no30);
        no80.addneighbours(no77);
        
        no81.addneighbours(no7);
        no81.addneighbours(no78);
        
        no82.addneighbours(no7);
        no82.addneighbours(no22);
        no82.addneighbours(no25);
        no82.addneighbours(no26);
        no82.addneighbours(no90);
        
        no83.addneighbours(no9);
        no83.addneighbours(no22);
        no83.addneighbours(no85);
        
        no84.addneighbours(no0);
        no84.addneighbours(no20);
        no84.addneighbours(no86);
        
        no85.addneighbours(no26);
        no85.addneighbours(no72);
        no85.addneighbours(no75);
        no85.addneighbours(no83);
        
        no86.addneighbours(no10);
        no86.addneighbours(no84);
        
        no87.addneighbours(no3);
        no87.addneighbours(no75);
        no87.addneighbours(no94);
        
        no88.addneighbours(no9);
        no88.addneighbours(no22);
        no88.addneighbours(no27);
        no88.addneighbours(no73);
        
        no89.addneighbours(no18);
        no89.addneighbours(no19);
        no89.addneighbours(no57);
        
        no90.addneighbours(no28);
        no90.addneighbours(no82);
        
        no91.addneighbours(no14);
        no91.addneighbours(no17);
        no91.addneighbours(no23);
        no91.addneighbours(no30);
        no91.addneighbours(no41);
        
        no92.addneighbours(no49);
        no92.addneighbours(no56);
        no92.addneighbours(no67);
        
        no93.addneighbours(no52);
        no93.addneighbours(no53);
        no93.addneighbours(no71);
        
        no94.addneighbours(no32);
        no94.addneighbours(no87);
        
        no95.addneighbours(no59);
        no95.addneighbours(no62);
        no95.addneighbours(no70);
        no95.addneighbours(no76);
        
        no96.addneighbours(no9);
        no96.addneighbours(no74);
        no96.addneighbours(no76);
        
        no97.addneighbours(no31);
        
        no98.addneighbours(no36);
        no98.addneighbours(no39);
        no98.addneighbours(no53);
        no98.addneighbours(no64);
        no98.addneighbours(no71);
        
        no99.addneighbours(no5);
        no99.addneighbours(no6);
        no99.addneighbours(no32);
        
        
        long tempoInicial = System.currentTimeMillis();
        System.out.println("O caminho encontrado foi : ");
        BreadthFirstSearch bfsExample = new BreadthFirstSearch();
        bfsExample.bfs(no1);
        System.out.println("\n\nExecutou em " + (System.currentTimeMillis() - tempoInicial) + " ms");
    }
}
