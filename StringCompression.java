package Leetcode;

public class StringCompression {
    public int compress(char[] chars) {
        int anchor=0,write=0;
        for (int read=0;read<chars.length;++read){
            if (read==chars.length-1||chars[read+1]!=chars[read]){
                chars[write++]=chars[anchor];
                if (read>anchor){
                    String times=String.valueOf(read-anchor+1);
                    for (int i=0;i<times.length();++i){
                        chars[write++]=times.charAt(i);
                    }
                }
                anchor=read+1;
            }
        }
        return write;
    }
}
