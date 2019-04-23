package com.example.datumdatabinding;

import android.content.Context;
import android.databinding.BindingAdapter;
import android.widget.Toast;

public class ToastText {

    private String text;

    public ToastText(String text){
        this.text = text;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @BindingAdapter("setToast")
    public static void setToast(String text){
        Toast.makeText( , setToast(text), Toast.LENGTH_SHORT).show();

    }

}
