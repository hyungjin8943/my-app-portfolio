package com.example.android.myappportfolio;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b = (Button) findViewById(R.id.capstone_bt);
        ColorStateList csl = new ColorStateList(new int[][]{new int[0]}, new int[]{0xffff0000});
        setButtonTint(b, csl);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     * very important method that was used to create buttonTint to lower versions of android
     * this was found in stackoverflow 
     * @param button
     * @param tint new int[]{0xffff0000}
     */

    public static void setButtonTint(Button button, ColorStateList tint) {
        if (Build.VERSION.SDK_INT == Build.VERSION_CODES.LOLLIPOP && button instanceof AppCompatButton) {
            ((AppCompatButton) button).setSupportBackgroundTintList(tint);
        } else {
            ViewCompat.setBackgroundTintList(button, tint);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void spotifyLaunch(View v){
        Toast toast = new Toast(getApplicationContext());
        Toast.makeText(getApplicationContext(),"This button will launch Spotify streamer app!", Toast.LENGTH_LONG).show();

    }
    public void scoreLaunch(View v){
        Toast toast = new Toast(getApplicationContext());
        Toast.makeText(getApplicationContext(),"This button will launch scores app!", Toast.LENGTH_LONG).show();
    }
    public void libraryLaunch(View v){
        Toast toast = new Toast(getApplicationContext());
        Toast.makeText(getApplicationContext(),"This button will launch library app!", Toast.LENGTH_LONG).show();
    }
    public void buildLaunch(View v){
        Toast toast = new Toast(getApplicationContext());
        Toast.makeText(getApplicationContext(),"This button will launch build it bigger app!", Toast.LENGTH_LONG).show();
    }
    public void xyzLaunch(View v){
        Toast toast = new Toast(getApplicationContext());
        Toast.makeText(getApplicationContext(),"This button will xyz reader app!", Toast.LENGTH_LONG).show();
    }
    public void capstonLaunch(View v){
        Toast toast = new Toast(getApplicationContext());
        Toast.makeText(getApplicationContext(),"This button will launch capstone app!", Toast.LENGTH_LONG).show();
    }

}
