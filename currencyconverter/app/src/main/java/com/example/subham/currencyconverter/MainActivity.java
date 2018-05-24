package com.example.subham.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.subham.currencyconverter.R.id.amountEditText;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){

        EditText amountEditText = (EditText) findViewById(R.id.amountEditText);

        Log.i("Amount", amountEditText.getText().toString() );

        Double dollarAmount = Double.parseDouble(amountEditText.getText().toString());

        Double poundAmount = dollarAmount*0.71;

        Toast.makeText(MainActivity.this, poundAmount.toString()+"pounds" , Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
