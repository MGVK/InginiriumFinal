package ru.mgvk.inginiriumfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.calc: {
                Intent i = getPackageManager()
                        .getLaunchIntentForPackage("ru.mgvk.calculator");
                startActivity(i);
                break;
            }

            case R.id.game: {
                Intent i = getPackageManager()
                        .getLaunchIntentForPackage("ru.mgvk.megacliker");
                startActivity(i);
                break;
            }

            case R.id.player: {

                Intent i = getPackageManager()
                        .getLaunchIntentForPackage("ru.mgvk.megaplayer");
                startActivity(i);
                break;
            }
        }


    }
}
