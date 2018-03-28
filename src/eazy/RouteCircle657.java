package eazy;

/**
 * Created by Administrator on 2018/1/3.
 */
public class RouteCircle657 {
//    Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.
//
//    The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.
//
//            Example 1:
//
//    Input: "UD"
//    Output: true
//
//    Example 2:
//
//    Input: "LL"
//    Output: false

    public boolean judgeCircle(String moves) {
        final char R = 'R';
        final char L = 'L';
        final char U = 'U';
        final char D = 'D';
        int lr = 0;
        int ud = 0;

        for(int i = 0;i<moves.length();i++){
            switch (moves.charAt(i)){
                case R : lr = lr +1 ; break;
                case L : lr = lr -1 ; break;
                case U : ud = ud +1 ; break;
                case D : ud = ud -1 ; break;
            }
        }
        if(lr ==0 &&ud ==0){
            return true;
        }else{
            return false;
        }

    }

}
