/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos;

/**
 *
 * @author Kaio
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;
 
public class IterativeDepthLimitedSearch{
    private final Stack<Integer> stack;
    private final int numberOfNodes;
    private static final int LIMIT = 22;
 
    public IterativeDepthLimitedSearch(int numberOfNodes){
        this.numberOfNodes = numberOfNodes;
        this.stack = new Stack<>();
    }
 
    public void iterativedepthLimitedSearch(int adjacencyMatrix[][], int origin, int search){
        ArrayList<String> cities = new ArrayList();     //Array das cidades para printar com a distancia
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
        int visited[] = new int[numberOfNodes + 1];
        int element, destination;
        int depth = 0;
        System.out.println("Origem == " + cities.get(origin)+ " == " + depth);
        stack.push(origin);
        visited[origin] = 1;
        depth = 0;
        while (!stack.isEmpty()){
            element = stack.peek();
            destination = element;
            while (destination <= numberOfNodes){
                if (depth < LIMIT){
                    if (adjacencyMatrix[element][destination] == 1 && visited[destination] == 0){
                        stack.push(destination);
                        visited[destination] = 1;
                        depth++;
                        if(destination == search){
                            System.out.println("Destino == " + cities.get(destination)+ " == " + depth);
                            return;
                        }else{
                        System.out.println(" - " + cities.get(destination)+ " " + depth);
                        }
                        element = destination;
                        destination = 1;
                    }
                } else{
                    return;
                }
                destination++;
            }
            stack.pop();
            depth--;
        }
    }
    public static void main(String... arg){
        int number_of_nodes, origin, search;
        try{
            number_of_nodes = 27;
            int graph[][] = new int[][]{//{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 6, 7}  Matriz de adjacencia 
                                     /*0*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                     /*1*/{ 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                     /*2*/{ 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                     /*3*/{ 0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                     /*4*/{ 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                     /*5*/{ 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                     /*6*/{ 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                     /*7*/{ 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
                                     /*8*/{ 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
                                     /*9*/{ 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
                                    /*10*/{ 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
                                    /*11*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
                                    /*12*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
                                    /*13*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
                                    /*14*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
                                    /*15*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}, 
                                    /*16*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0}, 
                                    /*17*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}, 
                                    /*18*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0}, 
                                    /*19*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1}, 
                                    /*20*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                                    /*21*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0},
                                    /*22*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0},
                                    /*23*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0},
                                    /*24*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 1, 0, 0},
                                    /*25*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0},
                                    /*26*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 1},
                                    /*27*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0},}; 
            long tempoInicial = System.currentTimeMillis();
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite a origem:");
            origin = sc.nextInt();
            System.out.println("Digite o alvo:");
            search = sc.nextInt();
            System.out.println("Caminho entre Computador 1 e 69:");
            IterativeDepthLimitedSearch iterativedepthLimitedSearch = new IterativeDepthLimitedSearch(number_of_nodes);
            iterativedepthLimitedSearch.iterativedepthLimitedSearch(graph, origin, search);
            System.out.println("\n\nExecutou em " + (System.currentTimeMillis() - tempoInicial) + " ms");
        } catch (InputMismatchException inputMismatch){ 
            System.out.println("Erro de Formatação!");
        }
    }
}



