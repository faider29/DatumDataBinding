package com.example.datumdatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.datumdatabinding.R;
import com.example.datumdatabinding.databinding.AcMainBinding;

public class MainActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LookAtMe lookAtMe = new LookAtMe("Gis", 13);
        ToastText toastText = new ToastText("Did I do my homework?");


        AcMainBinding binding = DataBindingUtil.setContentView(this,R.layout.ac_main);
        binding.setLookAtMe(lookAtMe);
        binding.setIMainActivity((IMainActivity) this);
        binding.setToast(toastText);
    }

//    @Override
//    public void clickToast() {
//        Toast.makeText(this, "Say YOLO!!", Toast.LENGTH_SHORT).show();
//
//    }
}
