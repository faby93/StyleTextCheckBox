package com.example.talatec.styletextcheckbox;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

import java.lang.reflect.Type;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    CheckBox chkBold, chkItalic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.txt);
        chkBold = (CheckBox) findViewById(R.id.chkBold);
        chkItalic = (CheckBox)findViewById(R.id.chlItalic);

        //Eventos del Check
        chkBold.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (chkBold.isChecked() && chkItalic.isChecked())
                    editText.setTypeface(null, Typeface.BOLD_ITALIC);
                else if(chkBold.isChecked())
                    editText.setTypeface(null, Typeface.BOLD);
                else if(chkItalic.isChecked())
                    editText.setTypeface(null, Typeface.ITALIC);
                else if(!chkBold.isChecked())
                    editText.setTypeface(null, Typeface.NORMAL);
            }
        });

        chkItalic.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(chkItalic.isChecked() && chkBold.isChecked()){
                    editText.setTypeface(null,Typeface.BOLD_ITALIC);
                }
                else if(chkItalic.isChecked()){
                    editText.setTypeface(null, Typeface.ITALIC);
                }else if(chkBold.isChecked()){
                    editText.setTypeface(null, Typeface.BOLD);
                }else if(!chkItalic.isChecked()){
                    editText.setTypeface(null, Typeface.NORMAL);
                }


            }
        });

        }
    }



