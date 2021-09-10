//编程要求
//根据提示，在右侧编辑器补充代码：
//
//声明一个名为Person的抽象类，在Person类中声明了三个属性name、age和occupation和一个抽象方法talk()；
//
//声明一个Student类和一个Worker类，都继承自Person类，添加带有三个参数的构造方法；
//
//分别实例化Student类与Worker类的对象，分别调用各自类中被复写的talk()方法打印输出信息；
//
//具体输出要求请看测试说明。
//
//测试说明
//测试输入： 无
//预期输出：
//学生——>姓名：张三，年龄：20，职业：学生！
//工人——>姓名：李四，年龄：30，职业：工人！
package case55;

// 声明一个名为Person的抽象类，在Person中声明了三个属性name age occupation和一个抽象方法——talk()。
abstract class Person {
    /********* begin *********/
    public String name;
    public int age;
    public String occupation;
    abstract void talk();
    /********* end *********/
}

// Student类继承自Person类，添加带三个参数的构造方法，复写talk()方法 返回姓名、年龄和职业信息
class Student extends Person {

    /********* begin *********/

    public Student (String name,int age,String occupation){
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    @Override
    public void talk() {
        //学生——>姓名：张三，年龄：20，职业：学生！
        System.out.println("学生——>姓名："+this.name+"，年龄："+this.age+"，职业："+this.occupation+"！");
    }

    /********* end *********/
}

// Worker类继承自Person类，添加带三个参数的构造方法，复写talk()方法 返回姓名、年龄和职业信息
class Worker extends Person {
    /********* begin *********/
    public Worker (String name,int age,String occupation){
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }
    @Override
    public void talk(){
        //工人——>姓名：李四，年龄：30，职业：工人！
        System.out.println("工人——>姓名："+this.name+"，年龄："+this.age+"，职业："+this.occupation+"！");
    }
    /********* end *********/

}

//public class abstractTest
public class test55 {
    public static void main(String[] args) {
        /********* begin *********/
        // 分别实例化Student类与Worker类的对象，并调用各自构造方法初始化类属性。
        Student student1 = new Student("张三",20,"学生");
        Worker worker1 = new Worker("李四",30,"工人");
        // 分别调用各自类中被复写的talk()方法 打印信息。
        student1.talk();
        worker1.talk();
        /********* end *********/

    }
}


//—— 预期输出 ——
//—— 实际输出 ——
//
//学生——>姓名：张三，年龄：20，职业：学生！
//工人——>姓名：李四，年龄：30，职业：工人！