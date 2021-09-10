//编程要求
//根据提示，在右侧编辑器Begin-End处补充代码:
//
//仔细阅读代码，在右侧编辑器中调整代码使程序能正确编译运行;
//
//具体输出要求请看测试说明。
//
//测试说明
//测试输入：无
//预期输出：
//speedlimit=120
//running safely with 100kmph
//running safely with 100kmph

package case56;

//不可以修改 final 变量的值
// final方法,不可以重写
//// 不可以扩展 final 类
//请在此添加你的代码
/********** Begin *********/
class Bike1 {
    int speedlimit = 90;

    void run() {
        speedlimit = 120;
        System.out.println("speedlimit=120");
    }

}

class Bike2 {
    void run() {
        System.out.println("running");
    }
}

class Honda extends Bike2 {
    void run() {
        System.out.println("running safely with 100kmph");
    }

}

class Bike3 {
}

class Yamaha extends Bike3 {
    void run() {
        System.out.println("running safely with 100kmph");
    }

}
/********** End **********/

//public class finalTest
public class test56 {
    public static void main(String args[]) {
        Bike1 obj = new Bike1();
        obj.run();

        Honda honda = new Honda();
        honda.run();

        Yamaha yamaha = new Yamaha();
        yamaha.run();
    }
}

//—— 预期输出 ——
//—— 实际输出 ——
//
//speedlimit=120
//running safely with 100kmph
//running safely with 100kmph