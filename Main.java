package com.company;

import javax.swing.text.Segment;

public class Main
{

    public static void main(String args[])
    {

        Session s1 = new Session();
        Session s2 = new Session();
        s1.start();
        s2.start();
        try {
            s1.thread.join();
            s2.thread.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }

    }
}
