package test67;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
@SuppressWarnings("unchecked")
public class test67 {
    //字典结构
    HashMap<String, LinkedList> dict = new HashMap<String, LinkedList>();

    public void initDict() {
        //加入你的代码读取字典文件dic.txt,初始化HashMap结构

        try {

            String filename="./dic.txt";
            BufferedReader in = new BufferedReader(new FileReader(filename));
            String str = "";
            String line;
            while ((line = in.readLine()) != null) {
                LinkedList <String> linkedList1 = new LinkedList<String>();
                LinkedList <String> linkedList = new LinkedList<String>();
                String[] dictionary = line.split("\\s+");
                if(dict.containsKey(dictionary[0])){
                    if(!dict.get(dictionary[0]).contains(dictionary[1])){
                        dict.get(dictionary[0]).add(" "+dictionary[1]);
                    }
                }
                else {
                    linkedList1.add(dictionary[1]);
                    dict.put(dictionary[0], linkedList1);
                }

                if(dict.containsKey(dictionary[1])){
                    if(!dict.get(dictionary[1]).contains(dictionary[0])){
                        dict.get(dictionary[1]).add(" "+dictionary[0]);
                    }
                }
                else {
                    linkedList.add(dictionary[0]);
                    dict.put(dictionary[1], linkedList);
                }
            }
        } catch (IOException iox) {
            System.out.println("无字典");
        }



    }

    public String translate(String word) {
        //加入你的代码翻译word结果

        if(dict.containsKey(word)){
            String str="";
            for( Object i:dict.get(word)){
                str=str +(String)i;
            }
            return str;
        }
        else{

            return "查找词典，无相关结果";
        }



    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //请勿修改测试代码
        test67 cndic = new test67();
        try {

            cndic.initDict();
            //System.out.println("请输入待翻译的词:");
            Scanner sc = new Scanner(System.in);
            String word = sc.nextLine();
            System.out.println("翻译结果为：" + cndic.translate(word));

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
