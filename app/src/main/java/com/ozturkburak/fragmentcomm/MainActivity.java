package com.ozturkburak.fragmentcomm;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements IFragmentComm
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.add(R.id.MAINACTIVITY_FRAME1, new Fragment1())
                .add(R.id.MAINACTIVITY_FRAME2, new Fragment2())
                .commit();

    }

    @Override
    public void setSomething(String... options)
    {
        Fragment2 fragment2 = (Fragment2) getFragmentManager().findFragmentById(R.id.MAINACTIVITY_FRAME2);
        fragment2.setFragment2Text(options[0]);
    }
}
