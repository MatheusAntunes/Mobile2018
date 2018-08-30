package br.usjt.ads.desmob.ciclodevide;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class ActivityA extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
    }

    @Override
    protected void onStart() {
       super.onStart();
    }

    @Override
    public void onRestart() {
        super.onRestart();
    }
    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onStop() {
        super.onStop();

    }
    @Override
    public void onDestroy(){
        super.onDestroy();

    }


    public void startActivityB(View view) {
    }

    public void startActivityC(View view) {
    }

    public void finishActivityA(View view) {
    }

    public void stratDialog(View view) {
    }
}
