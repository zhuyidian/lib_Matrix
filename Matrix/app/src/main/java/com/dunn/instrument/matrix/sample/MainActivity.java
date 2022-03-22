package com.dunn.instrument.matrix.sample;


import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        TextView tv = findViewById(R.id.sample_text);
        tv.setOnClickListener(this);

        A();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    public void onClick(View v) {

    }

    private void A() {
        B();
        H();
        L();
        SystemClock.sleep(800);
    }

    private void B() {
        C();
        G();
        SystemClock.sleep(200);
    }

    private void C() {
        D();
        E();
        F();
        SystemClock.sleep(100);
    }

    private void D() {
        SystemClock.sleep(20);
    }

    private void E() {
        SystemClock.sleep(20);
    }

    private void F() {
        SystemClock.sleep(20);
    }

    private void G() {
        SystemClock.sleep(20);
    }

    private void H() {
        SystemClock.sleep(20);
        I();
        J();
        K();
    }

    private void I() {
        SystemClock.sleep(20);
    }

    private void J() {
        SystemClock.sleep(6);
    }

    private void K() {
        SystemClock.sleep(10);
    }


    private void L() {
        SystemClock.sleep(10000);
    }
}
