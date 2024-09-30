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

public class InsectsFragment extends Fragment {

    public InsectsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_insects, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Initialize views
        ImageView imageView = view.findViewById(R.id.image_insects);
        TextView descriptionTextView = view.findViewById(R.id.text_description_insects);

        // Set image and text
        imageView.setImageResource(R.drawable.insects_image); // Replace "insects_image" with your actual image resource
        descriptionTextView.setText(getString(R.string.text_insects_description)); // Set the description text
    }
}

