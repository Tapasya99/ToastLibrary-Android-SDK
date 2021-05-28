package com.anuj.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.shrikantkale.anuj.ToastLibraryUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToastLibraryUtil.showToast(MainActivity.this,"MainActivity","123");
    }
}