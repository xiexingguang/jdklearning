package com.xxg.juc.Timer;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by ecuser on 2015/12/24.
 */
public class TimerTest {

    private Timer timer = new Timer();

    public void luncherTimer() {
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

            }
        },1,1);
    }







}
