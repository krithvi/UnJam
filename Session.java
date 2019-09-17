package com.company;

public class Session implements Runnable
{
    Thread thread;
    Session()
    {
        thread = new Thread(this, "session thread");
        thread.start();
    }



    @Override
    public void run()
    {


        try
        {
            for(int i = 5;i>0;i--)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }

    public void start() {
    }
}
