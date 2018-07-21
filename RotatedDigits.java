package Leetcode;

public class RotatedDigits {
    public int rotatedDigits(int N) {
        int count=0;
        for (int i=1;i<=N;++i){
            if (isValid(i)){
                ++count;
            }
        }
        return count;
    }
    public boolean isValid(int n){
        boolean flag=false;
        while (n>0){
            switch (n%10){
                case 2: case 5: case 6: case 9:
                    flag=true;
                    break;
                case 3: case 4: case 7:
                    return false;
                default:
                    break;
            }
            n/=10;
        }
        return flag;
    }
}
