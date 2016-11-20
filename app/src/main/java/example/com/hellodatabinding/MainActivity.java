package example.com.hellodatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import example.com.hellodatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    Model model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActivityMainBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
        model=new Model("Welcome");
        binding.setModel(model);
    }

    public void click(View view)
    {
        model.setTitle("Welcome");
    }
}
