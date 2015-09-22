package com.example.silver.controlesbasicos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;


public class MainActivity2 extends AppCompatActivity {

    RadioGroup rg;
    EditText txtPre,txtDscto,txtTotal;
    Button btnCalcular;
    CheckBox chkDscto1,chkDscto2;

    double precio=0,dscto1=0,dscto2=0,total=0,dsctof=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        rg=(RadioGroup)findViewById(R.id.rg1);
        txtPre=(EditText)findViewById(R.id.txtPre);
        txtDscto=(EditText)findViewById(R.id.txtDesc);
        txtTotal=(EditText)findViewById(R.id.txtTotal);
        chkDscto1=(CheckBox)findViewById(R.id.chkDscto1);
        chkDscto2=(CheckBox)findViewById(R.id.chkDscto2);
        btnCalcular=(Button)findViewById(R.id.btnCalcular);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rb1:
                        precio=1200;
                        txtPre.setText(precio+"");
                        break;
                    case R.id.rb2:
                        precio=180;
                        txtPre.setText(precio+"");
                        break;
                    case R.id.rb3:
                        precio=900;
                        txtPre.setText(precio+"");
                        break;
                }
            }
        });
        chkDscto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chkDscto1.isChecked()) {
                    dscto1 = precio * 0.10;
                } else {
                    dscto1 = 0;
                }
                dsctof = dscto1 + dscto2;
                txtDscto.setText(dsctof + "");
            }
        });
        chkDscto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chkDscto2.isChecked()){
                    dscto2=precio*0.05;
                }else{
                    dscto2=0;
                }
                dsctof=dscto1+dscto2;
                txtDscto.setText(dsctof+"");
            }
        });
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total=precio-dsctof;
                txtTotal.setText(total+"");
            }
        });

    }
}
