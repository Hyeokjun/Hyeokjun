package com.example.user.write;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Cost extends Activity{
@Override
    protected void onCreate(Bundle savedInstanceState)
{
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_sub0);
}
    public void onClick(View view)
    {
        Intent intent = new Intent(this,cost_request.class);
        startActivity(intent);
    }
}
