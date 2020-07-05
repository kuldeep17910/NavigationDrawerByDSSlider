package com.suriyal.navigationdrawerbyds.ui.search;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.suriyal.navigationdrawerbyds.R;

public class SearchFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //1
        /*
        View view = inflater.inflate(R.layout.fragment_search, container, false);
        return view;

         */
        return  inflater.inflate(R.layout.fragment_search, container, false);

        //        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
