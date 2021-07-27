import java.util.ArrayList;

class ShortestPath {                
    static final int V = 21;        //Numero de Vertices + 1
    int minDistance(int dist[], Boolean sptSet[]){  // Função utilizada para encontrar o vertice seguinte com menor distancia do vertice origem
        int min = Integer.MAX_VALUE, min_index = -1;    //Inicializa o menor valor
        for (int v = 0; v < V; v++)
            if (sptSet[v] == false && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }
        return min_index;
    }
    void printSolution(int dist[], int start, int src){ // Função utilizada para printar a solução
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
        System.out.println("Cidade de origem: "+ cities.get(start)); // Mostra qual é a cidade origem
        System.out.println("Cidade procurada: "+ cities.get(src)); // Mostra qual é a cidade buscada
        System.out.println("Distancia entre "+cities.get(start)+" e "+ cities.get(src) +" = "+ dist[start]); // Printa a distancia entre a cidade origem e cidade buscada
        System.out.println("\nCidade  -|-  Distancia até a cidade Procurada\n");
        for (int i = 1; i < V; i++){
            System.out.println(cities.get(i)+"  -|-  "+ dist[i]);
        }
    }
    void dijkstra(int graph[][], int start, int src){   // Essa função que implementa o algoritmo de Dijkstra usando a matriz de adjacencia
        int dist[] = new int[V];    //Cria um vetor de distancias com o tamanho = ao nº de cidades
        Boolean sptSet[] = new Boolean[V];
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }
        dist[src] = 0;      // A distancia entre o vertice procurado e ele msm é 0
        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(dist, sptSet);
            sptSet[u] = true;
            for (int v = 0; v < V; v++)
                if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
        }
        printSolution(dist, start, src);    // Chama a função de printar a solução passando o vetor de distancias e o vertice procurado
    }
 
    public static void main(String[] args){ 
        int graph[][] = new int[][]{//{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}  Matriz de adjacencia 
                                 /*0*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                 /*1*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 140, 118, 0, 0, 75},
                                 /*2*/{ 0, 0, 0, 0, 0, 0, 211, 90, 0, 0, 0, 0, 0, 0, 101, 0, 0, 0, 85, 0, 0},
                                 /*3*/{ 0, 0, 0, 0, 85, 0, 0, 0, 0, 0, 0, 0, 0, 0, 138, 146, 0, 0, 0, 0, 0},
                                 /*4*/{ 0, 0, 0, 120, 0, 0, 0, 0, 0, 0, 0, 75, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                 /*5*/{ 0, 0, 0, 0, 0, 0, 0, 0, 86, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                                 /*6*/{ 0, 0, 211, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 99, 0, 0, 0, 0},
                                 /*7*/{ 0, 0, 90, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
                                 /*8*/{ 0, 0, 0, 0, 0, 86, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 98, 0, 0}, 
                                 /*9*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 87, 0, 0, 0, 0, 0, 0, 92, 0}, 
                                /*10*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 70, 0, 0, 0, 0, 0, 111, 0, 0, 0}, 
                                /*11*/{ 0, 0, 0, 0, 75, 0, 0, 0, 0, 0, 70, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
                                /*12*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 87, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
                                /*13*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 151, 0, 0, 0, 71}, 
                                /*14*/{ 0, 0, 101, 138, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 97, 0, 0, 0, 0, 0}, 
                                /*15*/{ 0, 0, 0, 146, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 97, 0, 80, 0, 0, 0, 0}, 
                                /*16*/{ 0, 140, 0, 0, 0, 0, 99, 0, 0, 0, 0, 0, 0, 151, 0, 80, 0, 0, 0, 0, 0}, 
                                /*17*/{ 0, 118, 0, 0, 0, 0, 0, 0, 0, 0, 111, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
                                /*18*/{ 0, 0, 211, 0, 0, 0, 0, 0, 98, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 142, 0}, 
                                /*19*/{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 82, 0, 0, 0, 0, 0, 0, 0, 0, 142, 0, 0}, 
                                /*20*/{ 0, 75, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},}; 
        ShortestPath t = new ShortestPath();
        t.dijkstra(graph, 1, 2); // Passa o grafo , cidade origem e cidade destino
    }
}
