//一天写完8个确实还是有点累的....
//编程要求
//根据提示，在右侧编辑器补充代码：
//
//声明一个Animal类，此类中定义eat()方法；
//
//声明Dog类、Cat类、Lion类，均继承自Animal类，并复写了eat()方法；
//
//运用多态方式实例化子类对象并调用eat()方法打印输出信息；
//
//具体输出要求请看测试说明。
//
//测试说明
//测试输入：无
//预期输出：
//eating bread...
//eating rat...
//eating meat...

package case58;

import java.sql.Driver;

// Animal类中定义eat()方法
abstract class Animal {
    /********* begin *********/
    public Animal(){

    }
    public abstract void eat();
    /********* end *********/
}

// Dog类继承Animal类 复写eat()方法
class Dog extends Animal {
    /********* begin *********/
    @Override
    public void eat(){
        System.out.println("eating bread...");
    }
    /********* end *********/
}

// Cat类继承Animal类 复写eat()方法
class Cat extends Animal {
    /********* begin *********/
    @Override
    public void eat(){
        System.out.println("eating rat...");
    }
    /********* end *********/
}

// Lion类继承Animal类 复写eat()方法
class Lion extends Animal {
    /********* begin *********/
    @Override
    public void eat(){
        System.out.println("eating meat....");
    }
    /********* end *********/
}

//public class TestPolymorphism
public class test58 {
    public static void main(String[] args) {
        // 以多态方式分别实例化子类对象并调用eat()方法
        /********* begin *********/
        Animal dog1 = new Dog();
        Animal cat1 = new Cat();
        Animal lion1 = new Lion();
        dog1.eat();
        cat1.eat();
        lion1.eat();
        /********* end *********/
    }
}

//—— 预期输出 ——
//—— 实际输出 ——
//
//eating bread...
//eating rat...
//eating meat...