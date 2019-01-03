package com.weather.app.weather;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private long exitTime =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK){
            exit();
            return false;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void exit(){
        if(System.currentTimeMillis() - exitTime >2000){
            Toast.makeText(getApplicationContext(),"再按一下退出程序",Toast.LENGTH_LONG).show();
            exitTime = System.currentTimeMillis();
        }
        else{
           finish();
           System.exit(0);
        }
    }
}
