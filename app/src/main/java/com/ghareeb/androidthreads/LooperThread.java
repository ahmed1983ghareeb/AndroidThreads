package com.ghareeb.androidthreads;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

public class LooperThread extends Thread {

    public Handler handler;
    public Looper looper;
    @Override
    public void run() {

            Looper.prepare();
            looper = Looper.myLooper();// we create the looper object to be able to stop the thread, otherwise we don't need it we just use the static name of the class Looper

            //handlers must have loopers. Handlers are objects that gets small packages of the work and pass them to loopers to be executed
            handler = new MyHandler();
            Looper.loop();
        Log.i("looperThread", "Thread terminated");
    }
}
