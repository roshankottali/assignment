package com.example.user.helloworld;

import android.app.Fragment;
import android.app.Service;
import android.bluetooth.BluetoothClass;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by User on 20-12-2016.
 */

public class FragmentPort extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
return inflater.inflate(R.layout.fragmnt_port,container,false);
    }
}
