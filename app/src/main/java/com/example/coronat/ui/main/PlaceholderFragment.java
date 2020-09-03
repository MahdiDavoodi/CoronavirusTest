package com.example.coronat.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.coronat.R;
import com.google.android.material.tabs.TabLayout;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    private PageViewModel pageViewModel;

    public static PlaceholderFragment newInstance(int index) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel.class);
        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
        pageViewModel.setIndex(index);
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        int tabId = getArguments().getInt(ARG_SECTION_NUMBER);
        View root;
        switch (tabId) {
            case 1:
                root = inflater.inflate(R.layout.home_tab, container, false);
                break;
            case 2:
                root = inflater.inflate(R.layout.test_tab, container, false);
                break;
            case 3:
                root = inflater.inflate(R.layout.amar_tab, container, false);
                break;
            case 4:
                root = inflater.inflate(R.layout.aboutvirus_tab, container, false);
                break;
            case 5:
                root = inflater.inflate(R.layout.pishgiri_tab, container, false);
                break;
            case 6:
                root = inflater.inflate(R.layout.darmaan_tab, container, false);
                break;
            case 7:
                root = inflater.inflate(R.layout.aboutus_tab, container, false);
                break;
            default:
                root = inflater.inflate(R.layout.home_tab, container, false);

        }

        return root;
    }
}