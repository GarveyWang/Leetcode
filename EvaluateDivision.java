package Leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class EvaluateDivision {
    public static void main(String[] args) {
        String[][] equations={{"x1","x2"},{"x2","x3"},{"x3","x4"},{"x4","x5"}};
        double[] values={3.0,4.0,5.0,6.0};
        String[][] queries = {{"x1","x5"},{"x5","x2"},{"x2","x4"},{"x2","x2"},{"x2","x9"},{"x9","x9"}};
        double[] result=calcEquation(equations,values,queries);
        for (double r:result){
            System.out.println(r);
        }
    }

    public static HashSet<String> seen=new HashSet<>();
    public static double[] calcEquation(String[][] equations, double[] values, String[][] queries) {

        HashMap<String,HashMap<String,Double>> outerMap=new HashMap<String, HashMap<String, Double>>();
        for (int i=0;i<equations.length;++i){
            if (!outerMap.containsKey(equations[i][0])){
                outerMap.put(equations[i][0],new HashMap<String, Double>());
            }
            if (!outerMap.containsKey(equations[i][1])){
                outerMap.put(equations[i][1],new HashMap<String, Double>());
            }
            HashMap<String,Double>innerMap=outerMap.get(equations[i][0]);
            innerMap.put(equations[i][1],values[i]);
            innerMap=outerMap.get(equations[i][1]);
            innerMap.put(equations[i][0],1/values[i]);
        }
        double[]result=new double[queries.length];

        for (int i=0;i<queries.length;++i){
            seen.clear();
            result[i]=query(outerMap, queries[i][0],queries[i][1]);
        }
        return result;
    }

    public static double query(HashMap<String,HashMap<String,Double>>outerMap,String src,String tar) {
        if(!outerMap.containsKey(src)||!outerMap.containsKey(tar)){
            return -1;
        }
        if (seen.contains(src)){
            return 0;
        }
        if(src.equals(tar)){
            return 1;
        }
        seen.add(src);
        HashMap<String ,Double>innerMap=outerMap.get(src);
        if (innerMap.containsKey(tar)){
            return innerMap.get(tar);
        }else {
            for (String key:innerMap.keySet()){
                double result = innerMap.get(key)*query(outerMap,key,tar);
                if(result>0){
                    return result;
                }
            }
        }
        return -1;
    }
}
