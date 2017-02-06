package com.miguelcr.a01_killduck;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    ImageView logo;
    Button btnStartGame;
    EditText nick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = (ImageView) findViewById(R.id.imageViewLogo);
        btnStartGame = (Button) findViewById(R.id.buttonStartGame);
        nick = (EditText) findViewById(R.id.editText);

        Picasso.with(this)
                .load("http://rest.miguelcr.com/assets/images/killduck.png")
                .resize(400,400)
                .into(logo);

        // We change the title that appear in the Toolbar, in this Activity
        setTitle("KillDuck");

        // With this line is possible to hide the Toolbar
        getSupportActionBar().hide();

        Typeface type = Typeface.createFromAsset(getAssets(),"pixel.otf");
        btnStartGame.setTypeface(type);
        nick.setTypeface(type);
    }
}
