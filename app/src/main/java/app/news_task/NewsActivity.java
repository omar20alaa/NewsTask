package app.news_task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import app.news_task.databinding.ActivityNewsBinding;

public class NewsActivity extends AppCompatActivity {

    // todo vars
    private ActivityNewsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNewsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);



    }
}