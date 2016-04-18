package com.example.iths.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class Calc extends AppCompatActivity implements View.OnClickListener{






        private   Button one;
        private Button two;
        private Button three;
        private Button four;
        private Button five;
        private Button six;
        private Button seven;
        private Button eight;
        private Button nine;
        private Button zero;
        private Button comma;
        private EditText disp;
        private double op1;
        private double op2;
        private String optr;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_calc);


            one = (Button) findViewById(R.id.one);
            two = (Button) findViewById(R.id.two);
            three = (Button) findViewById(R.id.three);
            four = (Button) findViewById(R.id.four);
            five = (Button) findViewById(R.id.five);
            six = (Button) findViewById(R.id.six);
            seven = (Button) findViewById(R.id.seven);
            eight = (Button) findViewById(R.id.eight);
            nine = (Button) findViewById(R.id.nine);
            zero = (Button) findViewById(R.id.zero);
            comma = (Button) findViewById(R.id.comma);
            Button add = (Button) findViewById(R.id.add);
            Button sub = (Button) findViewById(R.id.sub);
            Button mul = (Button) findViewById(R.id.mul);
            Button div = (Button) findViewById(R.id.div);
            Button cancel = (Button) findViewById(R.id.cancel);
            Button equal = (Button) findViewById(R.id.equal);
            disp = (EditText) findViewById(R.id.display);
                try{
                    one.setOnClickListener(this);
                    two.setOnClickListener(this);
                    three.setOnClickListener(this);
                    four.setOnClickListener(this);
                    five.setOnClickListener(this);
                    six.setOnClickListener(this);
                    seven.setOnClickListener(this);
                    eight.setOnClickListener(this);
                    nine.setOnClickListener(this);
                    zero.setOnClickListener(this);
                    comma.setOnClickListener(this);
                    cancel.setOnClickListener(this);
                    add.setOnClickListener(this);
                    sub.setOnClickListener(this);
                    mul.setOnClickListener(this);
                    div.setOnClickListener(this);
                    equal.setOnClickListener(this);
                } catch(Exception e){
                }
        }

    private void operation(){
        switch (optr) {
            case "+":
                op2 = Double.parseDouble(disp.getText().toString());
                disp.setText("");
                op1 = op1 + op2;
                disp.setText(getString(R.string.result) + Double.toString(op1));
                break;
            case "-":
                op2 = Double.parseDouble(disp.getText().toString());
                disp.setText("");
                op1 = op1 - op2;
                disp.setText(getString(R.string.result) + Double.toString(op1));
                break;
            case "*":
                op2 = Double.parseDouble(disp.getText().toString());
                disp.setText("");
                op1 = op1 * op2;
                disp.setText(getString(R.string.result) + Double.toString(op1));
                break;
            case "/":
                op2 = Double.parseDouble(disp.getText().toString());
                disp.setText("");
                op1 = op1 / op2;
                disp.setText(getString(R.string.result) + Double.toString(op1));
                break;
        }
    }
    @Override
    public void onClick(View arg0) {
        Editable str = disp.getText();

        switch(arg0.getId()){
            case R.id.comma:
                if (op2 != 0){
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(comma.getText());
                disp.setText(str);
                break;
            case R.id.zero:
                if(op2 != 0){
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(zero.getText());
                disp.setText(str);
                break;
            case R.id.one:
                if(op2 != 0){
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(one.getText());
                disp.setText(str);
                break;
            case R.id.two:
                if(op2 != 0){
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(two.getText());
                disp.setText(str);
                break;
            case R.id.three:
                if(op2 != 0){
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(three.getText());
                disp.setText(str);
                break;
            case R.id.four:
                if(op2 != 0){
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(four.getText());
                disp.setText(str);
                break;
            case R.id.five:
                if(op2 != 0){
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(five.getText());
                disp.setText(str);
                break;
            case R.id.six:
                if(op2 != 0){
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(six.getText());
                disp.setText(str);
                break;
            case R.id.seven:
                if(op2 != 0){
                    op2 = 0;
                    disp.setText("");
                }
                str = str.append(seven.getText());
                disp.setText(str);
                break;
            case R.id.eight:
                if(op2 != 0){
                    op2 = 0; disp.setText("");
                } str = str.append(eight.getText());
                disp.setText(str);
                break;
            case R.id.nine:
                if(op2 != 0){
                    op2 = 0; disp.setText("");
                } str = str.append(nine.getText());
                disp.setText(str);
                break;
            case R.id.cancel:
                op1 = 0; op2 = 0;
                disp.setText("");
                disp.setHint(R.string.performOperation);
                break;
            case R.id.add: optr = "+";
                if(op1 == 0){
                    op1 = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                } else if(op2 != 0){
                    op2 = 0;
                    disp.setText("");
                } else{ op2 = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                    op1 = op1 + op2;
                    disp.setText(getString(R.string.result) + Double.toString(op1));
                }
                break;
            case R.id.sub: optr = "-";
                if(op1 == 0){
                    op1 = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                } else if(op2 != 0){
                    op2 = 0;
                    disp.setText("");
                } else{ op2 = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                    op1 = op1 - op2;
                    disp.setText(getString(R.string.result) + Double.toString(op1));
                }
                break;
            case R.id.mul: optr = "*";
                if(op1 == 0){
                    op1 = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                } else if(op2 != 0){
                    op2 = 0; disp.setText("");
                } else{
                    op2 = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                    op1 = op1 * op2;
                    disp.setText(getString(R.string.result) + Double.toString(op1));
                }
                break;
            case R.id.div:
                optr = "/";
                if(op1 == 0){
                    op1 = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                } else if(op2 != 0){
                    op2 = 0; disp.setText("");
                } else{
                    op2 = Double.parseDouble(disp.getText().toString());
                    disp.setText("");
                    op1 = op1 / op2;
                    disp.setText(getString(R.string.result) + Double.toString(op1));
                }
                break;
            case R.id.equal:
                if(!optr.equals("")){ if(op2 != 0){
                    switch (optr) {
                        case "+":
                            disp.setText("");
                 /*op1 = op1 + op2;*/
                            disp.setText(getString(R.string.result) + Double.toString(op1));
                            break;
                        case "-":
                            disp.setText("");
                /* op1 = op1 - op2;*/
                            disp.setText(getString(R.string.result) + Double.toString(op1));
                            break;
                        case "*":
                            disp.setText("");
                    /* op1 = op1 * op2;*/
                            disp.setText(getString(R.string.result) + Double.toString(op1));
                            break;
                        case "/":
                            disp.setText("");
                    /* op1 = op1 / op2;*/
                            disp.setText(getString(R.string.result) + Double.toString(op1));
                            break;
                    }
                } else{ operation();
                }
                }
                break;
        }
    }
}

