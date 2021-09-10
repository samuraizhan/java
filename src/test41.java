//任务描述
//本关任务：编写一个能计算数组平均值和最大值的小程序。
//
//相关知识
//为了完成本关任务，你需要掌握：1.写入文件，2.读文件。
//
//编程要求
//1）从键盘分行输入信息，以“quit”结束，将内容写入文件。
//2）再从文件中分行读出内容并输出。
//
//测试说明
//从键盘分行输入：
//
//hello java
//你好，java
//quit
//
//并输出一下内容
//
//文件内容如下:
//hello java
//你好，java

import java.io.*;
import java.util.Scanner;

public class test41 {
    public static void main(String[] args) throws IOException {
        //加入自己的代码
        /****************begin******************/
        //1）从键盘分行输入信息，以“quit”结束，将内容写入文件。
        Scanner sc = new Scanner(System.in);
        BufferedWriter in = new BufferedWriter(new FileWriter("test.txt"));
        while (true){
            String str = sc.nextLine();
            if("quit".equals(str)){
                break;
            }else{
                in.write(str);
                in.write("\n");
            }
        }
        in.close();
        //2）再从文件中分行读出内容并输出。
        String fileName = "test.txt";
        String line;
        try{
            BufferedReader out = new BufferedReader(new FileReader(fileName));
            line = out.readLine();
            System.out.println("文件内容如下:");
            while (line != null){
                System.out.println(line);
                line = out.readLine();
            }
            out.close();
        }
        catch (IOException iox){
            System.out.println("Problem reading"+fileName);
        }
    }


        /****************end******************/
}

//测试输入：
//hello java
//你好，java
//quit
//—— 预期输出 ——
//—— 实际输出 ——
//
//文件内容如下:
//hello java
//你好，java