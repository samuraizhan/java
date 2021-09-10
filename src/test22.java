//任务描述
//        编写一个Java源程序，该源文件中有3个类：Circle类、Cylinder类和Test2类，分别用来刻画“圆形”、“圆柱体”和测试用类，具体要求如下：
//        a)    Circle类具有类型为double的半径（r）属性，具有返回周长(getPerimeter)、面积(getArea)的功能，其中求周长和求面积方法分别使用实例方法和类方法两种方式实现。自行补充类的get/set方法、有参/无参构造方法、toString方法。
//        b)    以组合方式定义圆柱体Cylinder类，具有高（h）、底面(undersurface)属性，底面是圆类型，具有返回表面积（getSurfaceArea）和体积(getVolumn)方法。自行补充类的get/set方法、有参/无参构造方法、toString方法。
//        c)  编写测试类Test2，分别调用类方法和实例方法，计算输出半径为5和8的圆面积和周长；以以上两个圆为底面，计算高均为8的圆柱体的表面积和体积。

//半径为5的圆的周长为（实例方法）：*.
//半径为5的圆的面积为（实例方法）：*.
//半径为8的圆的周长为（类方法）：*.
//半径为8的圆的面积为（类方法）：*.
//底面半径为5，高为8的圆柱体表面积为：*.
//底面半径为5，高为8的圆柱体体积为：*.
//底面半径为8，高为8的圆柱体表面积为：*.
//底面半径为8，高为8的圆柱体体积为：*.

class Circle{
    // 开始圆代码
    //************begin****************

    static double PI = 3.1415926;
    static double r;
    public Circle(){//默认构造方法
    }
    public Circle(double r){//有参构造方法
        this.r = r;
    }

    public void setr(double r){
        this.r = r;
    }
    public double getr(){
        return r;
    }
    //实例方法
    public double getPerimeter(){
        return 2*PI*r;
    }
    public double getArea(){
        return PI*r*r;
    }
    //类方法
    //要加static
    public static double getPerimeter(int r){
        return 2*PI*r;
    }
    public static double getArea(int r){
        return PI*r*r;
    }

    //*************end*****************

}


class Cylinder{
//    b)以组合方式定义圆柱体Cylinder类，具有高（h）、底面(undersurface)属性，底面是圆类型，具有返回表面积（getSurfaceArea）
//    和体积(getVolumn)方法。自行补充类的get/set方法、有参/无参构造方法、toString方法。
    // 开始圆柱体代码
    //************begin****************
    static double h;
    //组合方式需要先新建一个对象，来使用它的方法
    private Circle undersurface = new Circle() ;

    public Cylinder(){//默认构造方法
    }
    public Cylinder(double h,double r){//构造方法
        this.h = h;
        undersurface.setr(r);
    }

    public void setr(int r){
        undersurface.setr(r);
    }


    public double getVolumn(){
      return this.undersurface.getArea() * this.h;
    }
    public double getSurfaceArea(){
        return 2*this.undersurface.getArea()+this.undersurface.getPerimeter()*this.h;
    }
    public static double getVolumn(int h,int r){
        return Circle.getArea(r)*h;
    }
    public static double getSurfaceArea(int h, int r){
        return 2*Circle.getArea(r)+Circle.getPerimeter(r)*h;
    }

}

public class test22 {

    public static void main(String[] args) {
        // 开始测试代码
        //************begin****************

//        //实例方法
//        c1.getPerimeter(5);
//        c1.getArea(5);

        Circle c1 = new Circle();
        // 半径为5的圆的周长为（实例方法）：*
        // 半径为5的圆的面积为（实例方法）：*.
        // 半径为8的圆的周长为（类方法）：*.
        // 半径为8的圆的面积为（类方法）：*.
        c1.setr(5);
        System.out.println("半径为5的圆的周长为（实例方法）："+ c1.getPerimeter());
//        System.out.println("半径为5的圆的周长为（实例方法）："+ String.format("%.2f",c1.getPerimeter())); 只显示两位
        System.out.println("半径为5的圆的周长为（类方法）："+ Circle.getPerimeter((int) c1.getr()));
        c1.setr(8);
        System.out.println("半径为8的圆的面积为（实例方法）："+ c1.getArea());
        System.out.println("半径为8的圆的面积为（类方法）："+ Circle.getArea(8));

        Cylinder c2 = new Cylinder(8,5);
        //全部实例方法
        System.out.println("底面半径为5，高为8的圆柱体表面积为："+ c2.getSurfaceArea());
        System.out.println("底面半径为5，高为8的圆柱体体积为："+c2.getVolumn());
        c2.setr(8);
        System.out.println("底面半径为8，高为8的圆柱体表面积为："+ c2.getSurfaceArea());
        System.out.println("底面半径为8，高为8的圆柱体体积为："+ c2.getVolumn());

        //底面半径为5，高为8的圆柱体表面积为：*.
        // 底面半径为5，高为8的圆柱体体积为：*.
        // 底面半径为8，高为8的圆柱体表面积为：*.
        // 底面半径为8，高为8的圆柱体体积为：*.

    }
}
