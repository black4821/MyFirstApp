package com.example.myfirstapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.jetbrains.annotations.Nullable;

import java.lang.annotation.Native;

public class MessageFragment extends Fragment {
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saveInstanceState){
        return inflater.inflate(R.layout.fragment_message, container,false);
    }
}
