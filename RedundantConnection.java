package Leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RedundantConnection {
    public static int[] findRedundantConnection(int[][] edges) {
        //不断消除度为1的节点，同时更新与之相邻的节点的度
        //最后剩下的度不为0的点，构成环
        int N=edges.length;
        int[] degree = new int[N+1];
        for (int i=0;i<N;++i){
            ++degree[edges[i][0]];
            ++degree[edges[i][1]];
        }
        boolean flag=true;
        while (flag){
            flag=false;
            for (int i=1;i<=N;++i){
                if (degree[i]==1){
                    for (int j=0;j<N;++j){
                        if (edges[j][0]==i){
                            --degree[edges[j][1]];
                            edges[j][1]=0;
                            break;
                        }else if (edges[j][1]==i){
                            --degree[edges[j][0]];
                            edges[j][0]=0;
                            break;
                        }
                    }
                    degree[i]=0;
                    flag=true;
                }
            }
        }
        int i=N-1;
        for (;i>=0;--i){
            if (edges[i][0]!=0 && edges[i][1]!=0){
                break;
            }
        }
        return edges[i];
    }
}

class Solution{
    Set<Integer>seen=new HashSet<>();
    int MAX_EDGE_VAL = 1000;
    public int[] findRedundantConnection(int[][] edges){
        ArrayList<Integer>[] graph=new ArrayList[MAX_EDGE_VAL+1];
        for (int i=0;i<=MAX_EDGE_VAL;++i){
            graph[i]=new ArrayList<>();
        }
        for (int[]edge:edges){
            seen.clear();
            if (!graph[edge[0]].isEmpty() && !graph[edge[1]].isEmpty()&&dfs(graph,edge[0],edge[1])){
                return edge;
            }
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        throw new AssertionError();
    }

    public boolean dfs(ArrayList<Integer>[]graph, int source, int target){
        if (!seen.contains(source)){
            seen.add(source);
            if (source==target)
                return true;
            for (int nei:graph[source]){
                if (dfs(graph,nei,target))
                    return true;
            }
        }
        return false;
    }
}