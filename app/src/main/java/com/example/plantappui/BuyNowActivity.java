package com.example.plantappui;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
public class BuyNowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_now);

        // Retrieve plant details from intent extras
        String plantName = getIntent().getStringExtra("plant_name");
        String plantCost = getIntent().getStringExtra("plant_cost");
        // Assuming you have the plant image resource ID
        int plantImageResId = getIntent().getIntExtra("plant_image_res_id", R.drawable.img_main);

        // Initialize views
        ImageView plantImage = findViewById(R.id.plant_image);
        TextView plantNameTextView = findViewById(R.id.plant_name);
        TextView plantCostTextView = findViewById(R.id.plant_cost);
        Button buyNowButton = findViewById(R.id.buy_now_button);

        // Set plant details to views
        plantImage.setImageResource(plantImageResId);
        plantNameTextView.setText(plantName);
        plantCostTextView.setText(plantCost);
    }
}