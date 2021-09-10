package test65;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class HelloWorld {

    public static void main(String[] args) {
        Map<String, Integer> menuDict = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            menuDict.put(sc.next(),sc.nextInt());
        }
        /********** Begin **********/
        menuDict.put("lamb",50);
        System.out.println(menuDict.get("fish"));
        menuDict.put("fish",100);
        menuDict.remove("noodles");
        System.out.println(menuDict.toString());

        /********** End **********/
    }

}

//测试输入：
//pizza
//
//40
//
//noodles
//
//30
//
//carrot
//
//20
//
//turkey
//
//34
//
//fish
//
//37
//—— 预期输出 ——
//—— 实际输出 ——
//
//37
//{pizza=40, turkey=34, fish=100, lamb=50, carrot=20}