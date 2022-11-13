package com.graph;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph {
    private ArrayList<String> vertexList;//存储顶点
    private int[][] edges;//graph 领结矩阵
    private int numOfEdges;//边的数目
    //recode if vertex is visited
    private boolean[] isVisited;

    public Graph(int n){
        edges = new int[n][n];
        vertexList = new ArrayList<>(n);
        numOfEdges = 0;
        isVisited = new boolean[5];
    }
    //get first

    /**
     *
     * @param index
     * @return
     */
    public int getFirstNeighbour(int index){
        for (int i = 0; i < vertexList.size(); i++) {
            if (edges[index][i] > 0){
                return i;
            }
        }
        return -1;
    }
    public int getNextNeighbour(int v1,int v2){
        for (int i = v2+1;i<vertexList.size();i++){
            if (edges[v1][i] > 0 ){
                return i;
            }
        }
        return -1;
    }
    public void DFS(boolean[] isVisited,int i){
        System.out.println(getValueByIndex(i)+">");
        //设置为已经访问
        isVisited[i] = true;
        int w = getFirstNeighbour(i);
        while (w != -1) {
            if (!isVisited[w]) {
                DFS(isVisited, w);
            }
            w = getNextNeighbour(i, w);
        }
    }
    public void DFS(){
        for (int i = 0; i < getVertexNum(); i++) {
            if (!isVisited[i]) {
                DFS(isVisited, i);
            }
        }
    }
    //insert vertex
    public void insertVertex(String vertex){
        vertexList.add(vertex);
    }

    /**
     *
     * @param v1  点的下标即是第几个顶点 A-B,A>0,B>1
     * @param v2  第二个顶点下标
     * @param weight 表示矩阵关联关系
     */
    public void insertEdges(int v1,int v2,int weight){
        edges[v1][v2] = weight;
        edges[v2][v1] = weight;
        numOfEdges++;
    }
    public int getNumOfEdges(){
        return numOfEdges;
    }
    public int getVertexNum(){
        return vertexList.size();
    }
    public String getValueByIndex(int i){
        return vertexList.get(i);
    }
    public int getWeight(int v1,int v2){
        return edges[v1][v2];
    }
    public void showGraph(){
        for (int[] link: edges) {
            System.out.println(Arrays.toString(link));
        }

    }
    public static void main(String[] args) {
        int n = 5;
        String[] vertex = {"a","b","c","d","e"};
        Graph graph = new Graph(n);
        for(String value : vertex){
            graph.insertVertex(value);
        }
        //a-b,a-c,b-c,b-e,b-d
        graph.insertEdges(0,1,1);
        graph.insertEdges(0,2,1);
        graph.insertEdges(1,2,1);
        graph.insertEdges(1,4,1);
        graph.insertEdges(1,3,1);
        graph.showGraph();

        System.out.println("DFS");
        graph.DFS();
    }
    //PRINT GRAPH
}
