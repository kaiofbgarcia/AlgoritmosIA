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
        if(v == 0 || v==69){
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
        Graph g = new Graph(100); // Nº de Vertices +1
        
        ArrayList<String> cities = new ArrayList();     //Array das cidades para printar
        
        cities.add("0");
        cities.add("1");
        cities.add("2");
        cities.add("3");
        cities.add("4");
        cities.add("5");
        cities.add("6");
        cities.add("7");
        cities.add("8");
        cities.add("9");
        cities.add("10");
        cities.add("11");
        cities.add("12");
        cities.add("13");
        cities.add("14");
        cities.add("15");
        cities.add("16");
        cities.add("17");
        cities.add("18");
        cities.add("19");
        cities.add("20");
        
        cities.add("21");
        cities.add("22");
        cities.add("23");
        cities.add("24");
        cities.add("25");
        cities.add("26");
        cities.add("27");
        cities.add("28");
        cities.add("29");
        cities.add("30");
        cities.add("31");
        cities.add("32");
        cities.add("33");
        cities.add("34");
        cities.add("35");
        cities.add("36");
        cities.add("37");
        cities.add("38");
        cities.add("39");
        cities.add("40");
        
        cities.add("41");
        cities.add("42");
        cities.add("43");
        cities.add("44");
        cities.add("45");
        cities.add("46");
        cities.add("47");
        cities.add("48");
        cities.add("49");
        cities.add("50");
        cities.add("51");
        cities.add("53");
        cities.add("54");
        cities.add("55");
        cities.add("56");
        cities.add("57");
        cities.add("58");
        cities.add("59");
        cities.add("60");
        
        cities.add("61");
        cities.add("62");
        cities.add("63");
        cities.add("64");
        cities.add("65");
        cities.add("66");
        cities.add("67");
        cities.add("68");
        cities.add("69");
        cities.add("70");
        cities.add("71");
        cities.add("72");
        cities.add("73");
        cities.add("74");
        cities.add("75");
        cities.add("76");
        cities.add("77");
        cities.add("78");
        cities.add("79");
        cities.add("80");
        
        cities.add("81");
        cities.add("82");
        cities.add("83");
        cities.add("84");
        cities.add("85");
        cities.add("86");
        cities.add("87");
        cities.add("88");
        cities.add("89");
        cities.add("90");
        cities.add("91");
        cities.add("92");
        cities.add("93");
        cities.add("94");
        cities.add("95");
        cities.add("96");
        cities.add("97");
        cities.add("98");
        cities.add("99");

        g.addEdge(0, 84); // Adiciona os vertices e ligações
        g.addEdge(0, 43);
        g.addEdge(0, 55);
        g.addEdge(0, 38);
        g.addEdge(0, 97);
        g.addEdge(0, 31);
        
        g.addEdge(1, 10);
        g.addEdge(1, 31);
        g.addEdge(1, 37);
        g.addEdge(1, 5);
        g.addEdge(1, 12);
        g.addEdge(1, 3);
        
        g.addEdge(2, 12);
        g.addEdge(2, 35);
        g.addEdge(2, 8);
        g.addEdge(2, 29);
        g.addEdge(2, 37);
        g.addEdge(2, 38);
        
        g.addEdge(3, 1);
        g.addEdge(3, 5);
        g.addEdge(3, 29);
        g.addEdge(3, 6);
        g.addEdge(3, 32);
        g.addEdge(3, 87);
        
        g.addEdge(4, 43);
        g.addEdge(4, 24);
        g.addEdge(4, 15);
        g.addEdge(4, 34);
        g.addEdge(4, 79);
        
        g.addEdge(5, 1);
        g.addEdge(5, 33);
        g.addEdge(5, 99);
        
        g.addEdge(6, 3);
        g.addEdge(6, 8);
        g.addEdge(6, 99);
        
        g.addEdge(7, 32);
        g.addEdge(7, 69);
        g.addEdge(7, 81);
        g.addEdge(7, 51);
        g.addEdge(7, 82);
        
        g.addEdge(8, 2);
        g.addEdge(8, 6);
        
        g.addEdge(9, 83);
        g.addEdge(9, 88);
        g.addEdge(9, 96);
        
        g.addEdge(10, 1);
        g.addEdge(10, 86);
        
        g.addEdge(11, 40);
        g.addEdge(11, 64);
        g.addEdge(11, 70);

        
        g.addEdge(12, 1);
        g.addEdge(12, 2);
      
        g.addEdge(13, 27);
        g.addEdge(13, 54);
        g.addEdge(13, 80);
        
        g.addEdge(14, 57);
        g.addEdge(14, 91);
        
        g.addEdge(15, 4);
        g.addEdge(15, 17);
        
        g.addEdge(16, 19);
        g.addEdge(16, 28);
        g.addEdge(16, 30);
        g.addEdge(16, 78);
        
        g.addEdge(17, 15);
        g.addEdge(17, 21);
        g.addEdge(17, 34);
        g.addEdge(17, 91);
        
        g.addEdge(18, 36);
        g.addEdge(18, 54);
        g.addEdge(18, 89);
        
        g.addEdge(19, 16);
        g.addEdge(19, 89);
        
        g.addEdge(20, 24);
        g.addEdge(20, 43);
        g.addEdge(20, 84);
        
        g.addEdge(21, 17);
        g.addEdge(21, 24);
        
        g.addEdge(22, 26);
        g.addEdge(22, 82);
        g.addEdge(22, 83);
        g.addEdge(22, 88);
        
        g.addEdge(23, 52);
        g.addEdge(23, 91);
        
        g.addEdge(24, 4);
        g.addEdge(24, 20);
        g.addEdge(24, 21);
        
        g.addEdge(25, 27);
        g.addEdge(25, 77);
        g.addEdge(25, 82);    
        
        g.addEdge(26, 22);
        g.addEdge(26, 32);
        g.addEdge(26, 82);
        g.addEdge(26, 85);
        
        g.addEdge(27, 13);
        g.addEdge(27, 25);
        g.addEdge(27, 76);
        g.addEdge(27, 88);
        g.addEdge(27, 98);
        
        g.addEdge(28, 16);
        g.addEdge(28, 51);
        g.addEdge(28, 77);
        g.addEdge(28, 90);
        
        g.addEdge(29, 2);
        g.addEdge(29, 3);
        
        g.addEdge(30, 16);
        g.addEdge(30, 41);
        g.addEdge(30, 57);
        g.addEdge(30, 80);
        g.addEdge(30, 91);
        
        g.addEdge(31, 0);
        g.addEdge(31, 1);
        g.addEdge(31, 37);
        g.addEdge(31, 86);
        g.addEdge(31, 97);
        
        g.addEdge(32, 3);
        g.addEdge(32, 7);
        g.addEdge(32, 26);
        g.addEdge(32, 94);
        g.addEdge(32, 99);
        
        g.addEdge(33, 5);
        g.addEdge(33, 55);
        g.addEdge(33, 79);
        
        g.addEdge(34, 4);
        g.addEdge(34, 17);
        
        g.addEdge(35, 2);
        g.addEdge(35, 3);
        
        g.addEdge(36, 18);
        g.addEdge(36, 68);
        
        g.addEdge(37, 2);
        g.addEdge(37, 31);
        g.addEdge(37, 38);
        
        g.addEdge(38, 0);
        g.addEdge(38, 2);
        
        g.addEdge(39, 46);
        g.addEdge(39, 61);
        g.addEdge(39, 68);
        
        g.addEdge(40, 11);
        g.addEdge(40, 54);
        
        g.addEdge(41, 30);
        g.addEdge(41, 79);
        g.addEdge(41, 91);
        
        g.addEdge(42, 47);
        g.addEdge(42, 60);
        g.addEdge(42, 61);
        g.addEdge(42, 67);
       
        g.addEdge(43, 0);
        g.addEdge(43, 4);
        g.addEdge(43, 20);
        
        g.addEdge(44, 50);
        g.addEdge(44, 63);
        
        g.addEdge(45, 64);
        g.addEdge(45, 70);
        
        g.addEdge(46, 39);
        g.addEdge(46, 50);
        
        g.addEdge(47, 42);
        g.addEdge(47, 63);
        
        g.addEdge(48, 50);
        g.addEdge(48, 70);
        
        g.addEdge(49, 92);
        
        g.addEdge(50, 44);
        g.addEdge(50, 46);
        g.addEdge(50, 48);
        g.addEdge(50, 63);
        
        g.addEdge(51, 7);
        g.addEdge(51, 28);
        
        g.addEdge(52, 23);
        g.addEdge(52, 53);
        g.addEdge(52, 56);
        g.addEdge(52, 57);
        g.addEdge(52, 93);
        
        g.addEdge(53, 52);
        g.addEdge(53, 57);
        g.addEdge(53, 68);
        g.addEdge(53, 93);
        
        g.addEdge(54, 13);
        g.addEdge(54, 18);
        g.addEdge(54, 40);
        g.addEdge(54, 66);
        
        g.addEdge(55, 0);
        g.addEdge(55, 33);
        
        g.addEdge(56, 52);
        g.addEdge(56, 92);
        
        g.addEdge(57, 14);
        g.addEdge(57, 30);
        g.addEdge(57, 52);
        g.addEdge(57, 53);
        g.addEdge(57, 89);
        
        g.addEdge(58, 60);
        g.addEdge(58, 67);
        
        g.addEdge(59, 62);
        g.addEdge(59, 74);
        g.addEdge(59, 95);
        
        g.addEdge(60, 42);
        g.addEdge(60, 58);
        g.addEdge(60, 65);
        
        g.addEdge(61, 39);
        g.addEdge(61, 42);
        
        g.addEdge(62, 59);
        g.addEdge(62, 66);
        g.addEdge(62, 95);
        
        g.addEdge(63, 44);
        g.addEdge(63, 47);
        g.addEdge(63, 50);
        
        g.addEdge(64, 11);
        g.addEdge(64, 45);
        g.addEdge(64, 68);
        
        g.addEdge(65, 60);
        g.addEdge(65, 67);
        
        g.addEdge(66, 54);
        g.addEdge(66, 62);
        g.addEdge(66, 98);
        
        g.addEdge(67, 42);
        g.addEdge(67, 58);
        g.addEdge(67, 65);
        g.addEdge(67, 71);
        g.addEdge(67, 92);
        
        g.addEdge(68, 36);
        g.addEdge(68, 39);
        g.addEdge(68, 53);
        g.addEdge(68, 64);
        g.addEdge(68, 71);
        
        g.addEdge(69, 7);
        g.addEdge(69, 78);
        
        g.addEdge(70, 45);
        g.addEdge(70, 48);
        g.addEdge(70, 5);
        
        g.addEdge(71, 67);
        g.addEdge(71, 68);
        g.addEdge(71, 93);
        
        g.addEdge(72, 73);
        g.addEdge(72, 85);
        
        g.addEdge(73, 72);
        g.addEdge(73, 88);
        
        g.addEdge(74, 59);
        g.addEdge(74, 96);
        g.addEdge(74, 98);
        
        g.addEdge(75, 85);
        g.addEdge(75, 87);
        
        g.addEdge(76, 27);
        g.addEdge(76, 95);
        g.addEdge(76, 96);
        
        g.addEdge(77, 25);
        g.addEdge(77, 28);
        g.addEdge(77, 80);
        
        g.addEdge(78, 16);
        g.addEdge(78, 69);
        g.addEdge(78, 79);
        g.addEdge(78, 81);
        
        g.addEdge(79, 4);
        g.addEdge(79, 33);
        g.addEdge(79, 41);
        g.addEdge(79, 78);
        
        g.addEdge(80, 13);
        g.addEdge(80, 30);
        g.addEdge(80, 77);
        
        g.addEdge(81, 7);
        g.addEdge(81, 78);
        
        g.addEdge(82, 7);
        g.addEdge(82, 22);
        g.addEdge(82, 25);
        g.addEdge(82, 26);
        g.addEdge(82, 90);
        
        g.addEdge(83, 9);
        g.addEdge(83, 22);
        g.addEdge(83, 85);
        
        g.addEdge(84, 0);
        g.addEdge(84, 20);
        g.addEdge(84, 86);
        
        g.addEdge(85, 26);
        g.addEdge(85, 72);
        g.addEdge(85, 75);
        g.addEdge(85, 83);
        
        g.addEdge(86, 10);
        g.addEdge(86, 84);
        
        g.addEdge(87, 3);
        g.addEdge(87, 75);
        g.addEdge(87, 94);
        
        g.addEdge(88, 9);
        g.addEdge(88, 22);
        g.addEdge(88, 27);
        g.addEdge(88, 73);
        
        g.addEdge(89, 18);
        g.addEdge(89, 19);
        g.addEdge(89, 57);
        
        g.addEdge(90, 28);
        g.addEdge(90, 82);
        
        g.addEdge(91, 14);
        g.addEdge(91, 17);
        g.addEdge(91, 23);
        g.addEdge(91, 30);
        g.addEdge(91, 41);
        
        g.addEdge(92, 49);
        g.addEdge(92, 56);
        g.addEdge(92, 67);
        
        g.addEdge(93, 52);
        g.addEdge(93, 53);
        g.addEdge(93, 71);
        
        g.addEdge(94, 32);
        g.addEdge(94, 87);
        
        g.addEdge(95, 59);
        g.addEdge(95, 62);
        g.addEdge(95, 70);
        g.addEdge(95, 76);
        
        g.addEdge(96, 9);
        g.addEdge(96, 74);
        g.addEdge(96, 76);
        
        g.addEdge(97, 31);
        
        g.addEdge(98, 36);
        g.addEdge(98, 39);
        g.addEdge(98, 53);
        g.addEdge(98, 64);
        g.addEdge(98, 71);
        
        g.addEdge(99, 5);
        g.addEdge(99, 6);
        g.addEdge(99, 32);
        
        long tempoInicial = System.currentTimeMillis();
        System.out.println("Seguindo o metodo DepthFirstSearch, tendo como origem a " + cities.get(0) + " e como alvo " + cities.get(69));
        g.DFS(0, cities);
        System.out.println("\n\nExecutou em " + (System.currentTimeMillis() - tempoInicial) + " ms");
    }
}