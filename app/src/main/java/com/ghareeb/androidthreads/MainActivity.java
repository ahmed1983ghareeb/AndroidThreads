package com.ghareeb.androidthreads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

private LooperThread looperThread = new LooperThread();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendTask(View view){
        looperThread.handler.post(new Runnable() {
            @Override
            public void run() {
                for (int i =0; i<10 ; i++){
                Log.i("looperThread", "Running for i = " + i);
            try {
                //each iteration loop requires 0.5 sec
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
                }
            }
        });
    }

    public void start(View view){

        looperThread.start();
    }

    public void stop(View view){
        looperThread.looper.quit();

    }

   //loopers are objects that waits for commands from users

public void sendTaskMsgHandler(View view){

        //we define the message here and define the action in the handler class
    Message message1 = Message.obtain();
    message1.what = 1;
    looperThread.handler.sendMessage(message1);

    Message message2 = Message.obtain();
    message2.what = 2;
    looperThread.handler.sendMessage(message2);


    Message message3 = Message.obtain();
    message3.what = 3;
    looperThread.handler.sendMessage(message3);


}


}
