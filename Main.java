package com.company;

public class Main
{

    public static void main(String args[])
    {

        Session s1 = new Session();
        Session s2 = new Session();
        Session s3 = new Session();
        Session s4 = new Session();
        s1.start();
        s2.start();
        try {
            s1.thread.join();
            s2.thread.join();
            s3.thread.join();
            s4.thread.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }

    }
}
