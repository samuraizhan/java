//import java.util.Random;
//
//class Matrix {
//    private int data[][];
//    //补充矩阵类代码
//    //***************begin**************
//    public Matrix() {
//    }
//    public Matrix(int[][] data) {
//        this.data = data;
//    }
//
//    public void setData(int[][] data) {
//        this.data = data;
//    }
//    public int[][] getData() {
//        return data;
//    }
//
//    public int[][] add(Matrix a,Matrix b){
//        int c[][]=new int[3][3];
//        for (int i = 0; i < 3; i++) {
//            for (int i1 = 0; i1 < 3; i1++) {
//                c[i][i1]=a.data[i][i1]+b.data[i][i1];
//            }
//        }
//        return c;
//    }
//    public int[][] transposition(Matrix a){
//        int t;
//        for (int i = 0; i < a.data.length; i++) {
//            for (int i1 = 0; i1 < a.data[i].length; i1++) {
//                if(i!=i1&&i1>i) {
//                    t = a.data[i][i1];
//                    a.data[i][i1]=a.data[i1][i];
//                    a.data[i1][i]=t;
//                }
//            }
//        }
//        return a.data;
//    }
//    public void print(Matrix a){
//        for (int i = 0; i < 3; i++) {
//            for (int i1 = 0; i1 < 3; i1++) {
//                System.out.printf("%-8d",a.data[i][i1]);
//            }
//            System.out.println();
//        }
//    }
//
//    //***************end*****************
//}
//class Test3 {
//
//    public static void main(String[] args) {
//        //测试代码
//        //*************begin****************
//        Matrix a=new Matrix();
//        Matrix b=new Matrix();
//        int p[][]=new int[3][3];
//        int p1[][]=new int[3][3];
//        Random rand = new Random();
//        rand.setSeed(1);
//        for (int i = 0; i < 3; i++) {
//            for (int i1 = 0; i1 < 3; i1++) {
//                p1[i][i1]=p[i][i1]=rand.nextInt(101);
//
//            }
//        }
//
//        a.setData(p);
//        b.setData(p1);
//        b.transposition(b);
//        b.setData(b.add(a,b));
//        b.print(b);
//
//        //************end*******************
//    }
//
//}

//测试说明
//1、随机种子设置为1
//2、结果矩阵分行输出，每行以8个字符宽度输出每个元素，且左对齐

//—— 预期输出 ——
//194     46      54
//46      154     90
//54      90      90
