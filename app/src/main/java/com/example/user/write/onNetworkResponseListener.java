package com.example.user.write;

/**
 * Created by user on 2016-08-04.
 */
import org.json.JSONObject;

public interface onNetworkResponseListener {
    void onSuccess(String api_key, JSONObject response);
    void onFailure(String api_key, String error_cd, String error_msg);
}
