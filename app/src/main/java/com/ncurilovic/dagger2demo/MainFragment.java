package com.ncurilovic.dagger2demo;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.ncurilovic.dagger2demo.utilis.Keys;
import com.ncurilovic.dagger2demo.utilis.MyApplication;
import javax.inject.Inject;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Nikola on 29.12.2015..
 */
public class MainFragment extends Fragment {

    @Bind(R.id.tvTitle)
    TextView mTitle;
    @OnClick(R.id.bRead)
    public void click(Button b){
        mTitle.setText(mPreferences.getString(Keys.PREF_INPUT, "Something went wrong."));
    }

    @Inject
    SharedPreferences mPreferences;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((MyApplication)getActivity().getApplication()).getComponent().inject(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this, view);
        setPrefs();
        return view;
    }

    private void setPrefs() {
        mPreferences.edit().putString(Keys.PREF_INPUT, "This is some text").commit();
    }
}
