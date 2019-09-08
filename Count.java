package com.company;


import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Count
{

        private int getTime()
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Seconds");
            int sec = s.nextInt();
            return sec;
        }

        int seconds = getTime();

        Timer timer = new Timer();
        TimerTask task = new TimerTask()
        {
            @Override
            public void run()
            {

                seconds--;
                if(seconds>=0)
                {
                    System.out.println("Seconds passed: " + seconds);
                }


            };
        };

        Count()
        {

            timer.scheduleAtFixedRate(task,1000,1000);
        }

}
