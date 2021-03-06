package me.muctweezer.helloworld;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.view.View;


public class MainActivity extends ActionBarActivity {
    private FileManagement myFileManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        myFileManager = new FileManagement(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
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
    public void onClick(View view) {
        myFileManager.saveFile();
        Toast.makeText(this, R.string.button_response, Toast.LENGTH_LONG).show();
    }
    public void onClickTwo(View view) {
        myFileManager.deleteFile();
        Toast.makeText(this, R.string.button_response, Toast.LENGTH_LONG).show();
    }
    public void onButtonClick(View view) {
        switch(view.getId()) {
            case R.id.button:
                myFileManager.saveFile();
                Toast.makeText(this, R.string.button_response, Toast.LENGTH_LONG).show();
                break;
            case R.id.button2:
                myFileManager.deleteFile();
                Toast.makeText(this, R.string.button_response, Toast.LENGTH_LONG).show();
                break;
            default:
                //that wasn't a button
                break;
        }
    }
}
