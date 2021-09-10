package test62;

import java.util.ArrayList;
import java.util.Scanner;

public class test62 {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //获取输入的数据并添加至集合
        Scanner sc = new Scanner(System.in);
        ArrayList list = new ArrayList<>();
        int length = sc.nextInt();
        for(int i =0 ; i< length; i++){
            list.add(sc.next());
        }
        /********** Begin *********/
        Object obj1 = list.get(0);
        list.remove(list.size()-1);
        list.remove(obj1);
        list.add("hello");
        list.add("educoder");
        list.set(2,"list");
        int size=list.size();
        for(int i=0;i<size;i++){
            System.out.println(list.get(i));
        }
        /********** End **********/
    }
}

//测试说明
//补充完代码后，点击测评，平台会对你编写的代码进行测试，当你的结果与预期输出一致时，即为通过。
//
//测试输入：
//
//4
//张三
//李四
//王五
//赵六
//
//预期输出：
//
//李四
//王五
//list
//educoder
//
//提示，获取数组的长度：
//
//ArrayList list = new ArrayList();
//list.add(1);
//list.add(3);
//System.out.println(list.size());
//输出：2



//测试输入：
//        4
//
//        张三
//
//        李四
//
//        王五
//
//        赵六
//        —— 预期输出 ——
//        —— 实际输出 ——
//
//        李四
//
//        王五
//
//        list
//
//        educoder


//测试输入：
//        3
//
//        张无忌
//
//        张三丰
//
//        张富贵
//        —— 预期输出 ——
//        —— 实际输出 ——
//
//        张三丰
//
//        hello
//
//        list
