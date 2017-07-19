package samplegit.example.comi.samplegit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final String TAG = MainActivity.class.getSimpleName();
    TextView textView;
    static final int SCAN_REQUEST = 10;
    //private int request;
    //private int result;
    //private Intent intenta;
    private Intent intent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       TextView aa = (TextView)findViewById(R.id.textView);
        aa.setText("0719これでどうだ！ブランチ");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume");
        /*
        if(intent != null){
            textView.setText(intent.getCharSequenceExtra("test"));
        }
        */


    }

    @Override
    protected void onPause() {
        Log.i(TAG, "onpause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i(TAG, "onStrop");
        super.onStop();
    }
}
