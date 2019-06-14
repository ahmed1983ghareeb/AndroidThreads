package com.ghareeb.androidthreads;


import android.os.Handler;
import android.os.Message;
import android.util.Log;

public class MyHandler  extends Handler {
    @Override
    public void handleMessage(Message msg) {
        switch (msg.what){
            case 1:
                Log.d("Myhandler", "message 1 received");
                break;
            case 2:
                Log.d("Myhandler", "message 2 received");
                break;
                default:
                    Log.d("Myhandler", "unrecognized message with code " + msg.what + " !");
        }
    }
}
