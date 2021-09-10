//编程要求
//根据提示，在右侧编辑器补充代码：
//
//声明一Person接口，并在里面声明三个常量：name、age、occupation，并分别赋值；
//
//声明一Student类，此类实现Person接口，并复写Person中的talk()方法；
//
//实例化一Student的对象s，并调用talk()方法，打印信息；
//
//具体输出要求请看测试说明。
//
//测试说明
//测试输入：无
//预期输出：
//学生——>姓名：张三，年龄：18，职业：学生！

package case57;

// 声明一个Person接口，并在里面声明三个常量：name、age和occupation，并分别赋值，声明一抽象方法talk()
interface Person {
    /********* begin *********/
    final String name = "张三";
    final int age = 18;
    final String occupation = "学生";
    abstract void talk();
    /********* end *********/
}

// Student类继承自Person类 复写talk()方法返回姓名、年龄和职业信息
class Student implements Person {
    /********* begin *********/
    public Student (){

    }

    @Override
    public void talk() {
        System.out.println("学生——>姓名："+name+"，年龄："+age+"，职业："+ occupation+"！");
        //学生——>姓名：张三，年龄：18，职业：学生！
    }

    /********* end *********/
}

//public class interfaceTest
public class test57 {
    public static void main(String[] args) {
        // 实例化一Student的对象s，并调用talk()方法，打印信息
        /********* begin *********/
        Student student1 = new Student();
        student1.talk();
        /********* end *********/

    }
}

//—— 预期输出 ——
//—— 实际输出 ——
//
//学生——>姓名：张三，年龄：18，职业：学生！