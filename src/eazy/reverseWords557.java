package eazy;

/**
 * Created by Administrator on 2018/1/3.
 */
public class reverseWords557 {
    public String reverseWords(String s) {
        String result = "";
        String tmp [] = s.split(" ");
        for (String a : tmp){
            StringBuilder build = new StringBuilder();
            int l = a.length();
            for(int i =l-1;i>=0;i--){
                build = build.append(a.charAt(i));
            }
            result = result.concat(build.toString());
            result = result.concat(" ");
        }
        result = result.substring(0,result.length()-1);
        return result;
    }
}
