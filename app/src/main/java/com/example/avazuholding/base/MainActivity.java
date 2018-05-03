package com.example.avazuholding.base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mButton;
    private BottomDialog mBottomDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButton = findViewById(R.id.btn_dialog);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mBottomDialog = BottomDialog.create(getSupportFragmentManager());
                mBottomDialog.setLayoutRes(R.layout.dialog_bottom)
                        .setViewGravity(Gravity.BOTTOM)
                        .setViewListener(new BottomDialog.ViewListener() {
                            @Override
                            public void bindView(View v) {

                            }
                        })
                        .show();
            }
        });
    }
}
