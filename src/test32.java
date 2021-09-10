////任务描述
////（1）定义抽象类Car。包含品牌brand、型号type、价格price属性，定义start()、stop()抽象方法，重写Object的toString()方法，返回当前对象的各属性值的字符串形式；
////（2）定义Bench类，继承Car类，定义带参构造方法，完成对品牌、型号、价格的初始化；实现父类定义的抽象方法；
////（3）定义BMW类，继承Car类，定义带参构造方法，完成对品牌、型号、价格的初始化；实现父类定义的抽象方法；
////（4）定义测试类，构造一个Car类型的数组，存储多辆Bench和BMW车的实例对象。输出所有车辆信息，并调用行驶，停止等方法。
////
////编程要求
////注意输出的字符格式。
////
////测试说明
////请不要修改测试代码的初始化对象语句
////Car [brand=奔驰, type=GLA, price=26.48]
////奔驰GLA手动挡车辆启动。
////奔驰GLA车辆停止。
////Car [brand=奔驰, type=迈巴赫, price=138.08]
////奔驰迈巴赫手动挡车辆启动。
////奔驰迈巴赫车辆停止。
////Car [brand=宝马, type=1系, price=19.88]
////宝马1系车辆启动。
////宝马1系车辆停止。
////Car [brand=宝马, type=3系, price=29.39]
////宝马3系车辆启动。
////宝马3系车辆停止。
//
//abstract class Car{
////    （1）定义抽象类Car。包含品牌brand、型号type、价格price属性，定义start()、stop()抽象方法，重写Object的toString()方法，返回当前对象的各属性值的字符串形式；
//    String brand;       //品牌
//    String type;        //型号
//    double price;       //价格
//    //补充Car的代码
//    public Car(String brand,String type,double price){
//        this.brand = brand;
//        this.price = price;
//        this.type = type;
//    }
//
//    public Car() {
//
//    }
//
//    public abstract void start();{
//
//    }
//    public abstract void stop();{
//
//    }
//    public String toString(){
//        return "Car [brand="  + this.brand + " ,type="+ this.type+  " , price="+ this.price + "]";
//    }
//}
////定义Bench
//class Bench extends Car {
//    public Bench(String brand, String type, double price) {
//        super(brand, type, price);
//        this.brand = brand;
//        this.type = type;
//        this.price = price;
//    }
//
//    public Bench() {
//        super();
//    }
//
//    public void start() {
//
//    }
//    public void stop() {
//
//    }
//    //（2）定义Bench类，继承Car类，定义带参构造方法，完成对品牌、型号、价格的初始化；实现父类定义的抽象方法；
//    //补充BMW的代码
//
//}
//
////定义BMW
//class BMW extends Car{
//    public BMW(String brand, String type, double price) {
//        super(brand, type, price);
//    }
//
//    public BMW() {
//
//    }
//
//    public void start() {
//
//    }
//    public void stop() {
//
//    }
//    //补充BMW的代码
//    //（3）定义BMW类，继承Car类，定义带参构造方法，完成对品牌、型号、价格的初始化；实现父类定义的抽象方法；
//}
//
//public class test32 {
////    （4）定义测试类，构造一个Car类型的数组，存储多辆Bench和BMW车的实例对象。输出所有车辆信息，并调用行驶，停止等方法。
//    public static void main(String[] args) {
//        Car[] c=new Car[4];
//        int t;
//        Car a= new Bench() {
//
//        };
//        Car b= new BMW() {
//        };
//        c[0]= new Bench("奔驰", "GLA", 26.48) {
//            //奔驰GLA手动挡车辆启动。
//            // 奔驰GLA车辆停止。
//            public void start() {
//                System.out.println("奔驰GLA手动挡车辆启动。");
//            }
//            public void stop() {
//                System.out.println("奔驰GLA车辆停止。");
//            }
//        };
//        c[1]= new Bench("奔驰", "迈巴赫", 138.08) {
//            //奔驰迈巴赫手动挡车辆启动。
//            // 奔驰迈巴赫车辆停止。
//
//            public void start() {
//                System.out.println("奔驰迈巴赫手动挡车辆启动。");
//            }
//            public void stop() {
//                System.out.println("奔驰迈巴赫车辆停止。");
//            }
//        };
//        c[2]= new BMW("宝马", "1系", 19.88) {
//            //宝马1系车辆启动。
//            // 宝马1系车辆停止。
//
//            public void start() {
//                System.out.println("宝马1系车辆启动。");
//            }
//            public void stop() {
//                System.out.println("宝马1系车辆停止。");
//            }
//        };
//        c[3]= new BMW("宝马", "3系", 29.39) {
//            //宝马3系车辆启动。
//            //宝马3系车辆停止。
//
//            public void start() {
//                System.out.println("宝马3系车辆启动。");
//            }
//            public void stop() {
//                System.out.println("宝马3系车辆停止。");
//            }
//        };
//        for (int i = 0; i < 4; i++) {
//            System.out.println(c[i].toString());
//            c[i].start();
//            c[i].stop();
//        }
//    }
//}
//
//
//
////public class Test1 {
////    public static void main(String[] args) {
////        Car[] c=new Car[4];
////        int t;
////        Car a=new Bench();
////        Car b=new BMW();
////        c[0]=new Bench("奔驰","GLA",26.48);
////        c[1]=new Bench("奔驰","迈巴赫",138.08);
////        c[2]=new BMW("宝马","1系",19.88);
////        c[3]=new BMW("宝马","3系",29.39);
////        for (int i = 0; i < 4; i++) {
////            System.out.println(c[i].toString());
////            c[i].start();
////            c[i].stop();
////        }
////    }
////}
////
////abstract class Car{
////    String brand;       //品牌
////    String type;        //型号
////    double price;       //价格
////    //补充Car的代码
////
////
////
////}
//////定义Bench
////class Bench extends Car {
////    //补充BMW的代码
////
////
////
////}
////
//////定义BMW
////class BMW extends Car{
////    //补充BMW的代码
////
////
////
////
////}
////Car [brand=奔驰, type=GLA, price=26.48]
////奔驰GLA手动挡车辆启动。
////奔驰GLA车辆停止。
////Car [brand=奔驰, type=迈巴赫, price=138.08]
////奔驰迈巴赫手动挡车辆启动。
////奔驰迈巴赫车辆停止。
////Car [brand=宝马, type=1系, price=19.88]
////宝马1系车辆启动。
////宝马1系车辆停止。
////Car [brand=宝马, type=3系, price=29.39]
////宝马3系车辆启动。
////宝马3系车辆停止。