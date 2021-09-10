//import java.awt.image.CropImageFilter;
//
////Shape类代码
//class Shape{
//    final double PI=3.1415926;
//    public double getArea(){
//        return 0.0;
//    }
//    public String toString(){
//        return "Shape []";
//    }
//}
//
////修改并补充Circle类代码
//class Circle extends Shape{
//    private double r;
//
//    public Circle(){
//
//    }
//
//    public Circle(double r){
//        this.r=r;
//    }
//
//    public void setr(int r){
//        this.r = r;
//    }
//    public double getArea(){
//        return this.PI*this.r*this.r;
//    }
//
//    public String toString(){
//        return "Circle [r=" + r + "]";
//    }
//}
//
////修改并补充Rectangle类代码
//
//class Rectangle extends Shape{
//    //补充Rectangle代码
//    private double width;
//    private double height;
//
//    public Rectangle(){
//
//    }
//    public Rectangle(int width,double height){
//        this.width = width;
//        this.height = height;
//    }
//    public double getArea(){
//        return this.width*this.height;
//    }
//    public String toString(){
//        return "Rectangle [width=" + this.width +", height="+this.height+ "]";
//    }
//
//}
//
//public class test31{
//    //补充测试代码
//    public static void main(String[] args) {
//        Shape s=new Shape();
//        //实例方法
//        Circle c1=new Circle(3.5);
//        Rectangle rec=new Rectangle(10,3.5);
//        System.out.println(s.toString());
//        System.out.printf("%.2f\n",s.getArea());
//        System.out.println(c1.toString());
//        System.out.printf("%.2f\n",c1.getArea());
//        System.out.println(rec.toString());
//        System.out.printf("%.2f\n",rec.getArea());
//    }
//
//}