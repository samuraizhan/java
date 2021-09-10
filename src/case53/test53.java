//####编程要求
//comment: <> (“编程要求”部分介绍本关任务的具体要求，如实现步骤，规则等，最好能给出效果图)
//根据提示，在右侧编辑器Begin-End处补充代码：
//

//声明一个名为Person的类，里面有name与age两个属性，并声明一个含有两个参数的构造方法；
//
//声明一个名为Student的类，此类继承自Person类，添加一个属性school，在子类的构造方法中调用父类中有两个参数的构造方法；
//
//实例化一个Student类的对象s，为Student对象s中的school赋值，打印输出姓名：张三，年龄：18，学校：哈佛大学。
//
//测试说明
//测试输入：无
//预期输出：
//姓名：张三，年龄：18，学校：哈佛大学

package case53;

class Person {
    //声明一个名为Person的类，里面有name与age两个属性，并声明一个含有两个参数的构造方法；
    /********* begin *********/
    private String name;
    private int age;

//    public void setAge(int age) {
//        this.age = age;
//    }

    public int getAge() {
        return age;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getName() {
        return name;
    }

    public Person(){

    }
    public Person(String name,int age){
        this.age = age;
        this.name = name;
    }
    /********* end *********/
}

class Student extends Person {

    //声明一个名为Student的类，此类继承自Person类，添加一个属性school，在子类的构造方法中调用父类中有两个参数的构造方法；
    /********* begin *********/
    String school;

    public Student(){

    }
    public Student(String name,int age,String school){
        super(name, age);
        this.school = school;
    }

//    public void setSchool(String school) {
//        this.school = school;
//    }
    public String getSchool() {
        return school;
    }

    /********* end *********/
}
//public class superTest
public class test53 {
    public static void main(String[] args) {
        //实例化一个Student类的对象s，为Student对象s中的school赋值，打印输出姓名：张三，年龄：18，学校：哈佛大学。
        /********* begin *********/
        Student student1 = new Student("张三",18,"哈佛大学");
//        student1.setAge(18);
//        student1.setName("张三");
//        student1.setSchool("哈佛大学");
        System.out.println("姓名："+student1.getName()+"，年龄："+student1.getAge()+"，学校："+student1.getSchool());
        /********* end *********/
    }
}

//—— 预期输出 ——
//        —— 实际输出 ——
//
//        姓名：张三，年龄：18，学校：哈佛大学