////任务描述
////本关任务：完成如下要求。
////（1）定义Chargeable接口，表示付费功能，其中定义float pay()方法
////（2）定义Taxi类，实现Chargeable接口，包含行驶公里数，基价、每公里单价信息，实现接口中定义的pay()方法，根据前两个信息计算费用并返回。
////注意出租车计费公式为：起步价10元(两公里以内),超出两公里的公里数每公里按3元计费。
////（3）定义Movie类，实现Chargeable接口，包含电影名称、单价、人数信息，实现接口中定义的pay()方法，根据单价和人数信息计算费用并返回
////
////编程要求
////根据提示，在右侧编辑器补充剩余代码。
////
////测试说明
////请不要修改测试代码中的初始代码
////
////开始你的任务吧，祝你成功！
//
////定义Chargeable接口
///*********begin*************/
////（1）定义Chargeable接口，表示付费功能，其中定义float pay()方法
//interface Chargeable{
//    float pay();
//}
///**********end************/
//
////Taxi代码
//class Taxi implements Chargeable {
////（2）定义Taxi类，实现Chargeable接口，包含行驶公里数，基价、每公里单价信息，实现接口中定义的pay()方法，根据前两个信息计算费用并返回。
//    private double Kilometer;   //行驶公里数
//    private static double StartFare=10;   //起步价（2千米10元）
//    private static double price=3;       //超出部分每公里单价
//    private static int StartKilo=2;
//    //补充Taxi代码
//    /*********begin*************/
//    public void setKilometer(double Kilometer) {
//        this.Kilometer = Kilometer;
//    }
//    public double getKilometer(){
//        return this.Kilometer;
//    }
//
//    public float pay() {
//        //注意出租车计费公式为：起步价10元(两公里以内),超出两公里的公里数每公里按3元计费。
//        return (float) (StartFare+(Kilometer-StartKilo)*price);
//    }
//    /**********end************/
//
//}
////Movie
////（3）定义Movie类，实现Chargeable接口，包含电影名称、单价、人数信息，实现接口中定义的pay()方法，根据单价和人数信息计算费用并返回
//class Movie implements Chargeable {
//    private String Moviename;//电影名称
//    private double price;   //电影价格
//    private int count;
//
//    //补充Movie代码
//    /*********begin*************/
//    public void setMoviename(String moviename){
//        this.Moviename = moviename;
//    }
//    public String getMoviename(){
//        return this.Moviename;
//    }
//
//    public void setCount(int i) {
//        this.count = i;
//    }
//    public int getCount(){
//        return this.count;
//    }
//    public void setPrice(int i) {
//        this.price = i;
//    }
//    public double getPrice(){
//        return this.price;
//    }
//
//    public float pay() {
//        return (float) (this.price*this.count);
//    }
//    /**********end************/
//}
//
//
//
//public class test33 {
//    public static void main(String[] args) {
//        Taxi taxi=new Taxi();
//        Movie movie=new Movie();
//        taxi.setKilometer(5.2);
//        System.out.printf("行驶的公里数为：%.2f,应付%.2f元\n",taxi.getKilometer(), taxi.pay());
//        movie.setMoviename("《蚊子侠》");
//        movie.setCount(4);
//        movie.setPrice(25);
//        System.out.printf("影片为：%s,观影人数为%d人,电影单价为%.2f元，应付%.2f元"
//                ,movie.getMoviename(),movie.getCount(),
//                movie.getPrice(),movie.pay());
//    }
//}
//
//
//////测试代码
////public class Test2 {
////    public static void main(String[] args) {
////        Taxi taxi=new Taxi();
////        Movie movie=new Movie();
////        taxi.setKilometer(5.2);
////        System.out.printf("行驶的公里数为：%.2f,应付%.2f元\n",taxi.getKilometer(),
////                taxi.pay());
////        movie.setMoviename("《蚊子侠》");
////        movie.setCount(4);
////        movie.setPrice(25);
////        System.out.printf("影片为：%s,观影人数为%d人,电影单价为%.2f元，应付%.2f元"
////                ,movie.getMoviename(),movie.getCount(),
////                movie.getPrice(),movie.pay());
////    }
////}
//
//////定义Chargeable接口
/////*********begin*************/
////
////
////
////
////
////
/////**********end************/
////
////
//////Taxi代码
////class Taxi implements Chargeable {
////    private double Kilometer;   //行驶公里数
////    private static double StartFare=10;   //起步价（2千米10元）
////    private static double price=3;       //超出部分每公里单价
////    private static int StartKilo=2;
////
////    //补充Taxi代码
////    /*********begin*************/
////
////
////
////
////
////
////    /**********end************/
////
////}
//////Movie
////class Movie implements Chargeable {
////    private String Moviename;//电影名称
////    private double price;   //电影价格
////    private int count;
////    //补充Movie代码
////    /*********begin*************/
////
////
////
////
////
////
////    /**********end************/
////
////}
//
//
//
//
////行驶的公里数为：5.20,应付19.60元
////影片为：《蚊子侠》,观影人数为4人,电影单价为25.00元，应付100.00元