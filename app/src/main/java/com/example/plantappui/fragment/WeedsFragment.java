package com.example.plantappui.fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.plantappui.R;

public class WeedsFragment extends Fragment {

    public WeedsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_weeds, container, false);
    }
        @Override
        public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
            super.onViewCreated(view, savedInstanceState);

            // Initialize views
            ImageView imageView = view.findViewById(R.id.image_weeds);
            TextView descriptionTextView = view.findViewById(R.id.text_description);

            // Set image and text
            imageView.setImageResource(R.drawable.weeds_image); // Replace "weeds_image" with your actual image resource
            descriptionTextView.setText(getString(R.string.text_description)); // Set the description text
        }
    }