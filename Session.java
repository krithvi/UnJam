package com.company;

public class Session<synchronised> implements Runnable
{
    Thread thread;
    //Pattern p;


    Session()
    {
        //this.p = p;
        thread = new Thread(this, "session thread");
        thread.start();

    }


    @Override
    public void run()
    {
        fun();

    }

    public void start()
    {



    }

    synchronized void fun()
    {

        try {
            for (int i = 5; i > 0; i--)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println(e);
        }
    }


}
