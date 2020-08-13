package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    Button btnadd , btnsub, btnmul , btndiv;
    TextView tv1 , tv2 , ans;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();

        tv1 = (TextView)findViewById(R.id.View1);
        tv2 = (TextView)findViewById(R.id.View2);
        ans = (TextView)findViewById(R.id.ans);
/*
        tv1.setText(getIntent().getStringExtra("num1"));
        tv2.setText(getIntent().getStringExtra("num2"));
*/
        String no1 = intent.getStringExtra("num1");
        tv1.setText(no1);

        String no2 = intent.getStringExtra("num2");
        tv2.setText(no2);

        btnadd = (Button) findViewById(R.id.add);

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer s1 = Integer.parseInt(tv1.getText().toString());
                Integer s2 = Integer.parseInt(tv2.getText().toString());
                // double oper1 = Double.parseDouble(opr1.getText().toString());
                // double oper2 = Double.parseDouble(opr2.getText().toString());
                // double result = oper1 + oper2;
                Integer result = s1 + s2;
                ans.setText(tv1.getText() + "+" + tv2.getText() + "=" + Integer.toString(result));
            }         //anstv.setText(Integer.toString(result));
        } );

        btnsub = (Button) findViewById(R.id.sub);

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer s1 = Integer.parseInt(tv1.getText().toString());
                Integer s2 = Integer.parseInt(tv2.getText().toString());
                // double oper1 = Double.parseDouble(opr1.getText().toString());
                // double oper2 = Double.parseDouble(opr2.getText().toString());
                // double result = oper1 - oper2;
                Integer result = s1 - s2;
                ans.setText(tv1.getText() + "-" + tv2.getText() + "=" + Integer.toString(result));
            }         //anstv.setText(Integer.toString(result));
        } );
        btnmul = (Button) findViewById(R.id.mul);

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer s1 = Integer.parseInt(tv1.getText().toString());
                Integer s2 = Integer.parseInt(tv2.getText().toString());
                // double oper1 = Double.parseDouble(opr1.getText().toString());
                // double oper2 = Double.parseDouble(opr2.getText().toString());
                // double result = oper1 - oper2;
                Integer result = s1 * s2;
                ans.setText(tv1.getText() + "*" + tv2.getText() + "=" + Integer.toString(result));
            }         //anstv.setText(Integer.toString(result));
        } );
        btndiv = (Button) findViewById(R.id.div);

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Integer s1 = Integer.parseInt(tv1.getText().toString());
                Integer s2 = Integer.parseInt(tv2.getText().toString());
                // double oper1 = Double.parseDouble(opr1.getText().toString());
                // double oper2 = Double.parseDouble(opr2.getText().toString());
                // double result = oper1 / oper2;
                Integer result = s1 / s2;
                ans.setText(tv1.getText() + "/" + tv2.getText() + "=" + Integer.toString(result));
            }         //anstv.setText(Integer.toString(result));
        } );
    }
}