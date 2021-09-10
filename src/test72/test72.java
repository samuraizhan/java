package test72;
//补充代码，定义线程任务代码
/********begin************/
class Task1 implements Runnable{
    @Override
    public void run() {
        int sum=0,i;
        try {

            for(i=1;i<=100;i++)
            {
                sum+=i;
                if(sum>3000)
                {
                    System.out.println("N="+i);
                    break;
                }
            }
        }
        catch(Exception e){

        }
    }
}
/********end***************/
public class test72 {

    public static void main(String[] args) {
        //创建线程并启动线程
        /***********begin**********************/
        Task1 s = new Task1();
        new Thread(s).start();
        /************end*************************/
    }

}
