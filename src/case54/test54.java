package case54;

class Person {
    //        声明一个名为Person的类，里面声明name与age两个属性，定义talk()方法返回姓名和年龄信息；
    /********* begin *********/
    public String name;
    public int age;

    public Person(){

    }
    public Person(String name,int age){
        this.name = name;
        this.age  = age;
    }
    public void talk(String name, int age){
        System.out.println("我是："+this.name+"，今年："+this.age+"岁");
    }
    /********* end *********/
}

class Student extends Person {
    //        声明一个名为Student的类，此类继承自Person类，添加school属性，声明带三个参数的构造方法，复写talk()方法，在该方法中调用父类的talk()方法，返回姓名、年龄和学校信息；
    /********* begin *********/
    private String school;
    public Student (String name, int age,String school){
        super(name,age);
        this.school = school;
    }

    public Student() {

    }
    public void talk(){
        //        我是：张三，今年：18岁，我在哈佛大学上学
        System.out.println("我是："+this.name+"，今年："+this.age+"岁"+"，我在"+this.school+"上学");
    }
    /********* end *********/
}

//public class overridingTest
public class test54 {
    public static void main(String[] args) {
        //        实例化子类对象s，调用talk()方法打印我是：张三，今年：18岁，我在哈佛大学上学。
        /********* begin *********/
        Student student1 = new Student("张三",18,"哈佛大学");
        student1.talk();
        /********* end *********/

    }
}

//编程要求
//        根据提示，在右侧编辑器补充代码。
//
//        声明一个名为Person的类，里面声明name与age两个属性，定义talk()方法返回姓名和年龄信息；
//
//        声明一个名为Student的类，此类继承自Person类，添加school属性，声明带三个参数的构造方法，复写talk()方法，在该方法中调用父类的talk()方法，返回姓名、年龄和学校信息；
//
//        实例化子类对象s，调用talk()方法打印我是：张三，今年：18岁，我在哈佛大学上学。
//
//        测试说明
//        测试输入： 无
//        预期输出：
//        我是：张三，今年：18岁，我在哈佛大学上学
//
//—— 预期输出 ——
//        —— 实际输出 ——
//
//        我是：张三，今年：18岁，我在哈佛大学上学