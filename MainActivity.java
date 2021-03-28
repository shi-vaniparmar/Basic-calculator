package com.shi_vaniparmar.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bdot,bequal;
    Button bclear;

    EditText  ed1;
    float Res1,Res2;
    boolean Add,Sub,Mul,Div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        b0=(Button)findViewById(R.id.b0);
        badd=(Button)findViewById(R.id.badd);
        bsub=(Button)findViewById(R.id.bsub);
        bmul=(Button)findViewById(R.id.bmul);
        bdiv=(Button)findViewById(R.id.bdiv);
        bequal=(Button)findViewById(R.id.bequal);
        bdot=(Button)findViewById(R.id.bdot);
        bclear=(Button)findViewById(R.id.bclear);
        ed1=(EditText)findViewById(R.id.editTextTextPersonName);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ed1.setText(ed1.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ed1.setText(ed1.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ed1.setText(ed1.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ed1.setText(ed1.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ed1.setText(ed1.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ed1.setText(ed1.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ed1.setText(ed1.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ed1.setText(ed1.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ed1.setText(ed1.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ed1.setText(ed1.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                ed1.setText(ed1.getText()+".");
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null){
                    ed1.setText("");
                }
                else{
                    Res1=Float.parseFloat(ed1.getText()+"");
                    Add=true;
                    ed1.setText(null);
                }
            }
        });
        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null){
                    ed1.setText("");
                }
                else{
                    Res1=Float.parseFloat(ed1.getText()+"");
                    Sub=true;
                    ed1.setText(null);
                }
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null){
                    ed1.setText("");
                }
                else{
                    Res1=Float.parseFloat(ed1.getText()+"");
                    Mul=true;
                    ed1.setText(null);
                }
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed1==null){
                    ed1.setText("");
                }
                else{
                    Res1=Float.parseFloat(ed1.getText()+"");
                    Div=true;
                    ed1.setText(null);
                }
            }
        });
        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Res2=Float.parseFloat(ed1.getText()+"");
                if(Add==true) {
                    ed1.setText(Res1 + Res2 + "");
                    Add = false;
                }
                if(Sub==true) {
                    ed1.setText(Res1 - Res2 + "");
                    Sub = false;
                }
                if(Mul==true) {
                    ed1.setText(Res1 * Res2 + "");
                    Mul = false;
                }
                if(Div==true) {
                    ed1.setText(Res1 /Res2 + "");
                    Div = false;
                }
            }
        });
        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText("");
            }
        });
    }
}