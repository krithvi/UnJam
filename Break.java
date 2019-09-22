package com.company;

public class Break implements Runnable
{
    Thread thread;
    //Pattern p;

    Break()
    {
        //this.p = p;
        thread = new Thread(this, "break thread");
        thread.start();
    }



    @Override
    public void run()
    {
        call();
        //while(true)
        //{
          //  p.wall2();
        //}
    }

    public void start()
    {

    }

    synchronized void call()
    {

        try {

            for (int i = 5; i > 0; i--)
            {
                System.out.println("-");
                Thread.sleep(1000);
            }
        }

        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }


}
