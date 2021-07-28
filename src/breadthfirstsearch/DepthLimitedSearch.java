/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breadthfirstsearch;

/**
 *
 * @author Kaio
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Stack;
 
public class DepthLimitedSearch{
    private final Stack<Integer> stack;
    private final int numberOfNodes;
    private static final int MAX_DEPTH = 5;
 
    public DepthLimitedSearch(int numberOfNodes)
    {
        this.numberOfNodes = numberOfNodes;
        this.stack = new Stack<>();
    }
 
    public void depthLimitedSearch(int adjacencyMatrix[][], int origin){
        ArrayList<String> cities = new ArrayList();     //Array das cidades para printar com a distancia
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
        int visited[] = new int[numberOfNodes + 1];
        int element, destination;
        int depth = 0;
        System.out.println(origin + " == " + cities.get(origin)+ " == " + depth);
        stack.push(origin);
        visited[origin] = 1;
        depth = 0;
        while (!stack.isEmpty()){
            element = stack.peek();
            destination = element;
            while (destination <= numberOfNodes){
                if (depth < MAX_DEPTH){
                    if (adjacencyMatrix[element][destination] == 1 && visited[destination] == 0){
                        stack.push(destination);
                        visited[destination] = 1;
                        depth++;
                        if(destination == 2){
                            System.out.println(destination + " == " + cities.get(destination)+ " == " + depth);
                        }else{
                            System.out.println(destination + " - " + cities.get(destination)+ " " + depth);
                        }
                        element = destination;
                        destination = 1;
                    }
                }
                else{
                    return;
                }
                destination++;
            }
            stack.pop();
            depth--;
        }
    }
    public static void main(String... arg){
        int number_of_nodes, origin;
        try{
            number_of_nodes = 20;
            int graph[][] = new int[][]{//{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}  Matriz de adjacencia 
                                 /*0*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                 /*1*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1},
                                 /*2*/{ 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0},
                                 /*3*/{ 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0},
                                 /*4*/{ 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                 /*5*/{ 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                 /*6*/{ 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0},
                                 /*7*/{ 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
                                 /*8*/{ 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0}, 
                                 /*9*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0}, 
                                /*10*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0}, 
                                /*11*/{ 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
                                /*12*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
                                /*13*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1}, 
                                /*14*/{ 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, 
                                /*15*/{ 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0}, 
                                /*16*/{ 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0}, 
                                /*17*/{ 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
                                /*18*/{ 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0}, 
                                /*19*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0}, 
                                /*20*/{ 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},}; 
            origin = 1;
            System.out.println("Caminho de Arad a Bucharest");
            DepthLimitedSearch depthLimitedSearch = new DepthLimitedSearch(number_of_nodes);
            depthLimitedSearch.depthLimitedSearch(graph, origin);
        } catch (InputMismatchException inputMismatch){ 
            System.out.println("Erro de Formatação!");
        }
    }
}
