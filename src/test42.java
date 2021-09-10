////
//相关知识
//        为了完成本关任务，你需要掌握：1.对象数组排序，2.对象读写。
//
//        编程要求
//        1）创建3个学生对象，按学号排序后写入文件。
//        2）再从文件中读取并输出所有学生对象。
//
//        测试说明
//        请勿修改测试类提供的部分测试代码。

import java.io.*;
import java.util.Arrays;

//学生类
class Student implements Comparable<Student>,Serializable{
    private String sid;
    private String sname;
    //加入你的代码
    public Student() {
    }
    public Student(String sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }
    public String getSid() {
        return sid;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSname() {
        return sname;
    }

    @Override
    public int compareTo(Student o) {
        return this.sid.compareTo(o.sid);
    }
    public String toString(){
        return "Student [sid="  + this.sid + ", sname="+ this.sname+ "]";
    }
}

//测试类
public class test42 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Student[] list1=new Student[3];
        list1[0]=new Student("102","zs");
        list1[1]=new Student("101","ls");
        list1[2]=new Student("103","ws");
        //加入你的代码
        //1）创建3个学生对象，按学号排序后写入文件。
        //选择排序
        Student temp ;
        for(int i = 0;i<3-1;i++){
            for(int j=i;j<2;j++){
                if(list1[j].compareTo(list1[j+1])>0){
                    temp = list1[j];
                    list1[j] = list1[j+1];
                    list1[j+1] = temp;
                }
            }
        }
        //2）再从文件中读取并输出所有学生对象。
        String line;
        String fileName = "test42.txt";
        try{
            FileWriter writer = new FileWriter("test42.txt");
            for(int i = 0;i < 3;i++){
            writer.write(String.valueOf(list1[i])+"\n");
            }
            writer.close();
            BufferedReader out = new BufferedReader(new FileReader(fileName));
            line = out.readLine();
            while(line != null){
                System.out.println(line);
                line = out.readLine();
            }
            out.close();
        }
        catch (IOException iox){
            System.out.println("Problem reading"+fileName);
        }
    }
}

//—— 预期输出 ——
//
//        Student [sid=101, sname=ls]
//        Student [sid=102, sname=zs]
//        Student [sid=103, sname=ws]