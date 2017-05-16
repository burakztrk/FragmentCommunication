package com.ozturkburak.fragmentcomm;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment2 extends Fragment
{
    TextView m_textView;

    public Fragment2()
    {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment2, container, false);
        m_textView = (TextView) view.findViewById(R.id.FRGMENT2_TEXTVIEW);

        return view;
    }


    public void setFragment2Text(String... options)
    {
        m_textView.setText(options[0]);
    }
}