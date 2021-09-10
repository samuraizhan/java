//        编程要求
//        根据提示，在右侧编辑器Begin-End处补充代码：
//
//        声明一个Person类，私有化属性name和age，并将字段封装起来；
//
//        在Person类中定义一个talk()方法，打印姓名和年龄信息；
//
//        在main方法中声明并实例化一Person对象p，给p中的属性赋值，调用talk()方法打印  我是：张三，今年：18岁。
//
//        测试说明
//        测试输入： 无
//        预期输出：
//        我是：张三，今年：18岁

package case51;

// 在这里定义Person类
class Person {
    /********* begin *********/
    private String name;
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void talk() {
        System.out.println("我是："+this.getName()+"，今年："+this.getAge()+"岁");
    }
    /********* end *********/
}

public class test51 {
    public static void main(String[] args) {
        /********* begin *********/
        // 声明并实例化一Person对象p
        Person p1 = new Person();
        // 给p中的属性赋值
        p1.setAge(18);
        p1.setName("张三");
        // 调用Person类中的talk()方法
        p1.talk();
        /********* end *********/

    }
}