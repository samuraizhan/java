package test73;


class SellTask implements Runnable{
    private int num=20;   //票总数
    //补全卖票任务代码
    /*************begin*****************/
    @Override
    public void run() {
        while (true) {
            synchronized (SellTask.class) {
                if (num == 0)
                    System.out.println("结束卖票:)");
                if (num > 0) {
                    {
                        System.out.printf("正在售出1张票，还剩%d张票\n", --num);
                        try {
                            Thread.sleep(10);
                        } catch (Exception e) {
                        }

                    }
                }else
                    break;
            }
        }
    }
    /*************end************************/
}
public class test73 {

    public static void main(String[] args) {
        // 补全测试代码，实例化窗口线程
        /*****************begin***************************/
        SellTask a = new SellTask();
        Thread win1 =new Thread(a);
        Thread win2 =new Thread(a);
        Thread win3 =new Thread(a);
        /******************end**************************/
        win1.start();
        win2.start();
        win3.start();
    }

}
