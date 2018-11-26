package cn.zealon.array;

/**
 *
 * 宰相的麦子：相传古印度宰相达依尔，是国际象棋的发明者。有一次，国王因为他的贡献要奖励他，问他想要什么。
 * 达依尔说：“只要在国际象棋棋盘上（共64格）摆上这么些麦子就行了：第一格一粒，第二格两粒，……，
 * 后面一格的麦子总是前一格麦子数的两倍，摆满整个棋盘，我就感恩不尽了。”国王一想，这还不容易，刚想答应，
 * 如果你这时在国王旁边站着，你会不会劝国王别答应
 * @auther: Zealon
 * @Date: 2018-11-26 16:02
 */
public class WheatOfCheckerboard64 {
    public static void main(String[] args){

        long sum = 0;  //累计麦子数
        long temp = 0; //上一格子的麦子数
        for (int i = 1; i < 65; i++) {
            long current = 1; // 当前格子麦子数
            if (sum==0){
                sum = 1;
                temp = 1;
            }else {
                current = temp * 2;
                temp = current;
                sum = sum + current;

            }
            System.out.println(i+",sum:"+sum+",current:"+current);
        }
        System.out.println(sum);
    }
}
