package com.example.pr5;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        textView = findViewById(R.id.textView);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.log_btn:
                updateTextView("Выбрана авторизация");
                showNotification("Нажата авторизация");
                return true;

            case R.id.notif_btn:
                updateTextView("Выбраны уведомления");
                showNotification("Нажаты уведомления");
                return true;

            case R.id.exit_btn:
                updateTextView("Выбран выход");
                showNotification("Нажат выход");
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void updateTextView(String newText) {
        textView.setText(newText);
    }

    private void showNotification(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
