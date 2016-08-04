package com.example.user.write;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;
import java.util.Calendar;

public class cost_request extends AppCompatActivity{
    private Context CONTEXT;
    private Spinner sSpinner = null;
    private ArrayAdapter<String> sSpinnerAdapter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sin);
        CONTEXT= this;

        sSpinner = (Spinner) findViewById(R.id.spinner0);

        sSpinnerAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,
                (String[]) getResources().getStringArray(R.array.data_sin));
        sSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sSpinner.setAdapter(sSpinnerAdapter);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolBar);
        toolbar.setTitle(R.string.text_login);
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }
   /* public void showDatePickerDialog(View v) {
        DialogFragment newFragment = new DialogFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }
    */
    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case android.R.id.home:
                finish();
        }
        return (super.onOptionsItemSelected(menuItem));
    }

    public void onClick(View view)
    {
        EditText txt_1 = (EditText) findViewById(R.id.name_sa);
        EditText txt_2 = (EditText) findViewById(R.id.cost);
        //EditText txt_3 = (EditText) findViewById(R.id.datea);
        if(txt_1.equals(null)){
            Toast.makeText(CONTEXT, "입력받은 사용처가 없습니다.", Toast.LENGTH_SHORT).show();
        }
        else if (txt_2.equals(null)){
            Toast.makeText(CONTEXT, "입력받은 사용금액이 없습니다.", Toast.LENGTH_SHORT).show();
        }
       /*
        else if (txt_3.equals(null)){

            Toast.makeText(CONTEXT, "입력받은 날짜가 없습니다.", Toast.LENGTH_SHORT).show();
        }
          */
        else{

        }
    }

}

