//编程要求
//        根据提示，在右侧编辑器Begin-End处补充代码：
//
//        声明一个Animal类，将属性name和age封装起来，提供对外的公共访问方法；
//
//        声明一个Cat类和Dog类，都继承Animal类，分别定义各自的voice方法和eat方法；
//
//        在main方法中分别实例化一个Cat对象和Dog对象，设置各自的属性并调用这两个方法，再打印出名字和年龄信息；
//
//        具体具体输出要求请看测试说明。
//
//        测试说明
//        测试输入：无
//        预期输出：
//        大花猫喵喵叫
//        大花猫吃鱼
//        大花猫6岁
//        大黑狗汪汪叫
//        大黑狗吃骨头
//        大黑狗8岁
//
package case52;


class Animal {
//        声明一个Animal类，将属性name和age封装起来，提供对外的公共访问方法；
    /********* begin *********/
    private String name;
    private int age;
    private String food;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }
    /********* end *********/

}

class Cat extends Animal {
    //        声明一个Cat类和Dog类，都继承Animal类，分别定义各自的voice方法和eat方法；
    // 定义Cat类的voice()和eat()方法
    /********* begin *********/
    public String eat(){
        return "吃";
    }
    public String voice(){
        return "喵喵叫";
    }

    /********* end *********/
}

class Dog extends Animal {
    // 声明一个Cat类和Dog类，都继承Animal类，分别定义各自的voice方法和eat方法；
    // 定义Dog类的voice()和eat()方法
    /********* begin *********/
    public String eat(){
        return "吃";
    }
    public String voice(){
        return "汪汪叫";
    }

    /********* end *********/
}

//public class extendsTest
public class test52 {
    public static void main(String args[]) {
        //        在main方法中分别实例化一个Cat对象和Dog对象，设置各自的属性并调用这两个方法，再打印出名字和年龄信息；
        // 实例化一个Cat对象，设置属性name和age，调用voice()和eat()方法，再打印出名字和年龄信息
        /********* begin *********/
        Cat cat1 = new Cat();
        cat1.setAge(6);
        cat1.setName("大花猫");
        cat1.setFood("鱼");
        cat1.voice();
        cat1.eat();
//        大花猫喵喵叫
//        大花猫吃鱼
//        大花猫6岁
        System.out.println(cat1.getName()+cat1.voice());;
        System.out.println(cat1.getName()+cat1.eat()+cat1.getFood());
        System.out.println(cat1.getName()+cat1.getAge()+"岁");
        /********* end *********/

        // 实例化一个Dog对象，设置属性name和age，调用voice()和eat()方法，再打印出名字和年龄信息
//        大黑狗汪汪叫
//        大黑狗吃骨头
//        大黑狗8岁
        /********* begin *********/
        Dog dog1 = new Dog();
        dog1.setAge(8);
        dog1.setName("大黑狗");
        dog1.setFood("骨头");

        System.out.println(dog1.getName()+dog1.voice());;
        System.out.println(dog1.getName()+dog1.eat()+dog1.getFood());
        System.out.println(dog1.getName()+dog1.getAge()+"岁");
        /********* end *********/

    }
}

//—— 预期输出 ——
//        —— 实际输出 ——
//
//        大花猫喵喵叫
//        大花猫吃鱼
//        大花猫6岁
//        大黑狗汪汪叫
//        大黑狗吃骨头
//        大黑狗8岁