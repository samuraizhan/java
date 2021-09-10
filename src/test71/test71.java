package test71;
class ThreadSum extends Thread{
    public void run(){
        /***********begin****************/
        int sum=0;
        try {
            for(int i=1;i<=100;i++)
            {
                sum+=i;
                sleep(200);
            }
        }
        catch(Exception e){

        }
        System.out.println("1+2+...+100="+sum);

        /***********end****************/
    }
}

public class test71 {

    public static void main(String[] args) {
        ThreadSum t=new ThreadSum();
        /***********begin****************/
        t.start();


        /***********end****************/
    }

}
