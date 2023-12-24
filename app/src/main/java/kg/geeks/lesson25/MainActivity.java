package kg.geeks.lesson25;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.InputDevice;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button_click);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                EditText editText = findViewById(R.id.edit_text);
                TextView textView = findViewById(R.id.text_view);
                String text = editText.getText().toString();
                textView.append(text);
            }
        });
    }
}