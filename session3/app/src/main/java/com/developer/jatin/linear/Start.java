package com.developer.jatin.linear;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Start extends AppCompatActivity {
Button one ,two, three,equals,add,multi;
    TextView result;
    String val1="",val2="";
    String operator="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        result=(TextView)findViewById(R.id.calculation);
        one=(Button)findViewById(R.id.one);
        two=(Button)findViewById(R.id.two);
        three=(Button)findViewById(R.id.three);
        equals=(Button)findViewById(R.id.equals);
        add=(Button)findViewById(R.id.add);
        multi=(Button)findViewById(R.id.multi);








             one.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {

                    val1=val1+1;
                   result.setText(val1);
                 }
             });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1+=2;
                result.setText(val1);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                val1+=3;
                result.setText(val1);
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                operator="+";
                val2=val1;
                val1="";

            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("");
                operator="*";
                val2=val1;
                val1="";
   val2=val2.substring(0,val2.length()-1);
            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double num1=Double.valueOf(val1);
                Double num2=Double.valueOf(val2);
                if(operator.charAt(0)=='+')
                {
                    Double ans=num1+num2;
                    result.setText(ans+"");
                }

                else
                    if(operator.charAt(0)=='*')
                    {

                        Double ans=num1*num2;
                        result.setText(ans+"");
                    }
            }
        });
    }

}