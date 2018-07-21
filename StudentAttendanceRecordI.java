package Leetcode;

public class StudentAttendanceRecordI {
    public boolean checkRecord(String s) {
        int countL=0;
        int countA=0;
        boolean isL=false;
        for (int i=0;i<s.length();++i){
            switch (s.charAt(i)){
                case 'L':
                    ++countL;
                    if (countL>2){
                        isL=true;
                    }
                    break;
                case 'A':
                    ++countA;
                    countL=0;
                    break;
                default:
                    countL=0;
                    break;
            }
        }
        if (countA<=1&&!isL)
            return true;
        return false;
    }
}
