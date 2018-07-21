package Leetcode;

public class SearchA2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length==0||matrix[0].length==0){
            return false;
        }
        int[] colArr = new int[matrix.length];
        for (int i=0;i<matrix.length;++i){
            colArr[i]=matrix[i][0];
        }
        int row = binarySearch(colArr,target);
        if(row==-1){
            return false;
        }
        int col = binarySearch(matrix[row],target);
        return matrix[row][col]==target;
    }

    public static int binarySearch(int[]arr,int target){
        int begin=0,end=arr.length-1;
        while (begin<=end){
            int mid = begin+(end-begin)/2;
            if(arr[mid]>target){
                end = mid-1;
            }else{
                begin = mid+1;
            }
        }
        return end;
    }

    public static void main(String[] args) {
        int[][] arr= {{1,3,5,7},{10,11,16,20},{23,30,34,50}};
        System.out.println(searchMatrix(arr,11));

        int[] a = {1};
        System.out.println(binarySearch(a,1));
    }
}
