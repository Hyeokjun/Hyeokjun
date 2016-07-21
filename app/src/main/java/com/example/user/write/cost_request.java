package com.example.user.write;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class cost_request extends Activity{
    private Context CONTEXT;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sin);
        CONTEXT= this;

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
