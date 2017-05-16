package com.ozturkburak.fragmentcomm;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.Random;


public class Fragment1 extends Fragment implements View.OnClickListener
{
    private IFragmentComm m_fragmentComm;
    private Button m_button;

    public Fragment1()
    {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment1, container, false);

        m_button = (Button) view.findViewById(R.id.FRAGMENT1_BUTTON);
        m_button.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View v)
    {
        Toast.makeText(getActivity().getBaseContext(), "Clicked", Toast.LENGTH_SHORT).show();

        Random random = new Random();
        int randomVal = random.nextInt(1000);

        m_fragmentComm = (IFragmentComm) getActivity();
        m_fragmentComm.setSomething(String.valueOf(randomVal));
    }

}
