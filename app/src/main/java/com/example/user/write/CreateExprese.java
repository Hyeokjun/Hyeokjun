package com.example.user.write;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Spinner;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by user on 2016-08-04.
 */
public class CreateExprese extends AppCompatActivity implements onNetworkResponseListener{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            AccountTitleSpinnerList spinnerList;
            Spinner spinner;
            JSONObject req_data = new JSONObject();
            req_data.put("USER_ID", "test_user1");

            CommNetwork network = new CommNetwork(this, this);
            network.requestToServer("ACCOUNT_L001", req_data);

        } catch (Exception e) {
            ErrorUtils.AlertException(this, "오류가 발생하였습니다.", e);
        }
    }

    @Override
    public void onSuccess(String api_key, JSONObject response) {
        Toast.makeText(CreateExprese.this, "인증이 성공하였습니다.", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onFailure(String api_key, String error_cd, String error_msg) {
        Toast.makeText(CreateExprese.this, "인증이 실패하였습니다.", Toast.LENGTH_SHORT).show();
    }
}
