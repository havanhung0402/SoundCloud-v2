package com.framgia.music_31.screens.more;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.framgia.music_31.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MoreFragment extends Fragment {

    public static MoreFragment newInstance() {
        MoreFragment moreFragment = new MoreFragment();
        return moreFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_more, container, false);
    }
}
