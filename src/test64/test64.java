package test64;

import java.util.*;

public class test64 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //程序会输入三次数据

        /********** Begin **********/
        List<String> list = new ArrayList<String>();
        for(int i=0;i<3;i++){
            list.add(sc.next());
        }

        System.out.println("集合的第1个数据为："+list.get(0));
        System.out.println("集合的第2个数据为："+list.get(1));
        System.out.println("集合的第3个数据为："+list.get(2));

        /********** End **********/
    }

}

//测试输入：
//        张三
//
//        李四
//
//        王五
//        —— 预期输出 ——
//        —— 实际输出 ——
//
//        集合的第1个数据为：张三
//        集合的第2个数据为：李四
//        集合的第3个数据为：王五