package test2;

import javax.swing.text.html.MinimalHTMLWriter;
import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class lesson {
    int lessonnumber;
    String lessonname;

    public lesson() {
    }
    public lesson(int i, String j) {
        this.lessonnumber = i;
        this.lessonname = j;
    }

    public void setLessonname(String lessonname) {
        this.lessonname = lessonname;
    }

    public void setLessonnumber(int lessonnumber) {
        this.lessonnumber = lessonnumber;
    }

    public int getLessonnumber() {
        return lessonnumber;
    }

    public String getLessonname() {
        return lessonname;
    }

}
class test2 {
    public static void main(String[] args) throws IOException {
        lesson lesson1 = new lesson(2021530,"java");
        lesson lesson2 = new lesson();
        lesson lesson3 = new lesson(2020528,"python");
        lesson2.setLessonname("cpp");
        lesson2.setLessonnumber(2021529);
        HashSet set = new HashSet<lesson>();
        set.add(lesson1);
        set.add(lesson2);
        set.add(lesson3);

                BufferedWriter in = new BufferedWriter(new FileWriter("a.txt"));
                while (true){
                    String str = .nextLine();
                    if("".equals(str)){
                        break;
                    }else{
                        in.write(str);
                        in.write("\n");
                    }
                }
                in.close();


                try{
                    BufferedWriter in = new BufferedWriter(new FileWriter("a.txt"));
                    for(int i=0;i<3;i++){

                    }
                }


                //读
                String fileName = "a.txt";
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

        }




