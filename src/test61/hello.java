//编程要求
//        请仔细阅读右侧代码，根据方法内的提示，在Begin - End区域内进行代码补充，创建ArrayList集合并且向集合中添加数据，具体要求如下：
//
//        添加字符串类型数据：https:www.educoder.net；
//
//        添加double类型数据：2018.423；
//
//        在方法中返回你创建的集合对象。dcfg   1qw2asd
//
//        测试说明
//        补充完代码后，点击测评，平台会对你编写的代码进行测试，当你的结果与预期输出一致时，即为通过。
//
//        预期输出：
//        https:www.educoder.net
//        2018.423



//package step1;
package test61;
// 导包
/********** Begin **********/
import java.util.ArrayList;
/********** End **********/

public class hello {

    @SuppressWarnings("unchecked")
    public ArrayList getList() {
        /********** Begin **********/
        ArrayList list = new ArrayList();
//        list.add("https:www.educoder.net");
//        list.add(2018.423);
        list.add("4");
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        return list;
        /********** End **********/

    }

}
