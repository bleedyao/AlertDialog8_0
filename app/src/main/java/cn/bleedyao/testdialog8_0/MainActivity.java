package cn.bleedyao.testdialog8_0;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private AlertDialog mDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "test", Toast.LENGTH_SHORT).show();
                mDialog = new AlertDialog.Builder(MainActivity.this)
                        .setTitle("test dialog")
                        .setMessage("就是看看能不能显示出来")
//                        .setPositiveButton("确认",null)
                        .setNegativeButton("取消",null)
                        .show();
            }
        });

    }
}
