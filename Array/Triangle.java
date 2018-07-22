package Leetcode.Array;

import java.util.List;

public class Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = 1; i < triangle.size(); ++i) {
            List<Integer> layer = triangle.get(i);
            List<Integer> lastLayer = triangle.get(i - 1);
            layer.set(0, layer.get(0) + lastLayer.get(0));
            for (int j=1;j<layer.size()-1;++j){
                layer.set(j,layer.get(j)+Math.min(lastLayer.get(j-1),lastLayer.get(j)));
            }
            layer.set(layer.size()-1,layer.get(layer.size()-1)+lastLayer.get(lastLayer.size()-1));
        }
        List<Integer> lastLayer = triangle.get(triangle.size()-1);
        Integer min = lastLayer.get(0);
        for (Integer total: lastLayer){
            if (total<min){
                min=total;
            }
        }
        return min;
    }
}
