////任务描述
////        本关任务：定义一个学生类，并完成一定测试
////
////        相关知识
////        为了完成本关任务，你需要掌握：
////        1.类的定义； 2.有参/无参构造方法的定义；
////        3.成员变量、方法的定义；  4.toString()方法的定义  5.对象类型数组的定义和使用。
////
////        编程要求
////        编写一个Java源程序，该源文件中有2个类：Student类和Test1类（公共类），分别用来刻画“学生”和测试用类，具体要求如下：
////        a) 学生包含姓名(sname)、学号(sid)、年龄(age)属性信息。
////        b) 定义每个成员变量的get/set方法
////        c）定义学生类的带参和不带参构造方法
////        d）重写学生类的toString()方法
////        c) 编写一个测试类Test1，创建一个2个长度的学生类数组。信息如下：
////        学生1信息：张三,1001,23
////        学生2信息：李四,1002,22
////        最后，遍历输出数组中的学生信息。
////
////        测试说明
////        一条学生信息单独一行输出
////        输出格式，采用eclipse自动生成代码格式输出，如：
////        Student [sname=李四, sid=1002, age=22]
//
//class Student {
//    private String sname;
//    private String sid;
//    private int age;
//    //补充学生类代码
//    //********begin*************
//    public void setsname(String name){
//        this.sname=name;
//    }
//    public String getsname(){
//        return this.sname;
//    }
//
//    public void setsid(String id){
//        this.sid=id;
//    }
//    public String getsid(){
//        return this.sid;
//    }
//
//    public void setage(int age){
//        this.age=age;、
//    }
//    public int getage(){
//        return this.age;
//    }
//
//    public Student(){
//
//    }
//    public Student(String name,String id,int aage){
//        sname=name;
//        sid=id;
//        age=aage;
//    }
//
//    public String toString() {
//
//        return "Student [sname=" + this.sname +", sid="+this.sid+  ", age=" + this.age + "]";
//
//
//    }
//
//    //**********end***************
//}
//
//public class test21 {
//
//    public static void main(String[] args) {
//        //补充测试代码
//        //********begin*************
//        Student []s1=new Student[2];
//        for (int i=0;i<s1.length;i++)
//            s1[i]=new Student();
//        s1[0].setsname("张三");
//        s1[0].setsid("1001");
//        s1[0].setage(23);
//        s1[1].setsname("李四");
//        s1[1].setsid("1002");
//        s1[1].setage(22);
//        System.out.println(s1[0]);
//        System.out.println(s1[1]);
//
//
//        //**********end***************
//
//    }
//
//}