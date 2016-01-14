package com.godjaku.android20160115.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.godjaku.android20160115.R;

public class MainFragment extends Fragment {
    private View wholeView= null;

    private EditText mEditID= null;

    public MainFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle data){
        wholeView= inflater.inflate(R.layout.fragment_main, null);
        return wholeView;
    }

    @Override
    public void onResume(){
        super.onResume();
        makeView();
    }
    @Override
    public void onPause(){
        super.onPause();
    }

    private void makeView(){
        ((Button)wholeView.findViewById(R.id.buttonFragmentMain)).setOnClickListener(click);
    }

    View.OnClickListener click= new View.OnClickListener(){
        @Override
        public void onClick(View v){
            int id= v.getId();

            if(id == R.id.buttonFragmentMain) {
                String string_id= ((EditText)wholeView.findViewById(R.id.editFragmentMainID)).getText().toString();
                String string_pw= ((EditText)wholeView.findViewById(R.id.editFragmentMainPW)).getText().toString();
                Toast.makeText(getActivity(), string_id+" / "+string_pw, Toast.LENGTH_SHORT).show();
            }
        }
    };
}
