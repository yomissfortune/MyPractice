package eazy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Administrator on 2018/1/3.
 */
public class KeyboardRow500 {
    public static final Set<Character> first = new HashSet<Character>(){{
        add('q');
        add('w');
        add('e');add('r');add('t');add('y');add('u');add('i');add('o');add('p');
    }};
    public static final Set<Character> second = new HashSet<Character>(){{
        add('a');
        add('s');
        add('d');add('f');add('g');add('h');add('j');add('k');add('l');
    }};
//    public static final Set<Character> third = new HashSet<Character>(){{
//        add('z');
//        add('x');
//        add('c');add('v');add('b');add('n');add('m')
//    }};

    public String[] findWords(String[] words) {
        List<String> set = new ArrayList<String>();
        for(String word:words){
            String tmp = word.toLowerCase();
            boolean output = true;
            int isfirst = 0;
            int isSecond = 0;
            int isthird = 0;
            for(int i = 0;i < word.length();i++){
                char c = tmp.charAt(i);
                if(first.contains(c)){
                    isfirst =1;
                }else if (second.contains(c)){
                    isSecond = 1;
                }else {
                    isthird = 1;
                }
                if(isfirst + isSecond+isthird>1){
                    output=false;
                    break;
                }
            }
            if(output){
                set.add(word);
            }
        }
        int size = set.size();
        String[] result = new String[set.size()];
        for(int i = 0;i< size;i++){
            result[i] = set.get(i);
        }

        return result;
    }

}
