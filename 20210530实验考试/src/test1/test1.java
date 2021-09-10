//package test1;
//
//abstract class TV {
//    String brand;
//    String model;
//    double price;
//    public TV(String brand, String model, double price) {
//    }
//    public TV() {
//
//    }
//    public String getModel() {
//        return model;
//    }
//    public String getBrand() {
//        return brand;
//    }
//    public double getPrice() {
//        return price;
//    }
//    public void setBrand(String brand) {
//        this.brand = brand;
//    }
//    public void setModel(String model) {
//        this.model = model;
//    }
//    public void setPrice(float price) {
//        this.price = price;
//    }
//
//    public String toString(String s) {
//        return s;
//    }
//}
//class ChangHongTV extends TV{
//    public ChangHongTV() {
//        super();
//    }
//    public ChangHongTV(String brand, String model, double price) {
//        super(brand, model, price);
//        this.brand = brand;
//        this.model = model;
//        this.price = price;
//    }
//
//    @Override
//    public String toString() {
//        return super.toString("brand"+ this.brand + "model"+ this.model+"price"+ this.price);
//    }
//}
//
//
//interface TVfactory{
//    String getTV();
//}
//
//class changhongTVfactory implements TVfactory {
//    String brand;
//    double price;
//    String model;
//
//    public changhongTVfactory(String i, String j, double k) {
//        this.brand = i;
//        this.price = k;
//        this.model = j;
//
//    }
//
//    @Override
//    public String getTV() {
//        return (this.brand+this.model+this.price);
//    }
//
//}
//public class test1 {
//    public static void main(String[] args) {
//        changhongTVfactory changhongtv1 = new changhongTVfactory("xiaolan","mid",12.1);
//        System.out.println(changhongtv1.getTV());
//    }
//}
