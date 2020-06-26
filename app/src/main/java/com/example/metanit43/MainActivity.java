package com.example.metanit43;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckBox enableBox=findViewById(R.id.enabled);
        enableBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(getApplicationContext(), "Включено", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(), "Отключено",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void onCheckBoxClicked(View view){
        //получаем флажок
        CheckBox language=(CheckBox)view;
        //получаем, отмечен ли данный флажок
        boolean checked=language.isChecked();

        TextView selection=findViewById(R.id.selection);
        //Смотрим, какой именно флажок выделен
        switch (view.getId()) {
            case R.id.Java:
                if (checked){
                    selection.setText("Java");
                }
                break;
            case R.id.JavaScript:
                if (checked){
                    selection.setText("JavaScript");
                }
                break;
        }
    }
    public void onToggleClicked(View view){
        //включена ли кнопка
        boolean on=((ToggleButton)view).isChecked();
        if (on){
            Toast.makeText(this, "On", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "OFF", Toast.LENGTH_SHORT).show();
        }
    }
}
