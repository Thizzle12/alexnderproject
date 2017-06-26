package com.example.theis.alexanderproduction;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.firebase.client.Firebase;

/**
 * Created by Theis on 30-04-2017.
 */
public class Login extends Activity implements View.OnClickListener{
    Firebase firebase;

    public View onCreateView(LayoutInflater i, ViewGroup container, Bundle savedInstanceState) {
        View root = i.inflate(R.layout.login_screen_page, container, false);
        firebase = new Firebase("https://alex-8d023.firebaseio.com/");
        return root;
    }

    @Override
    public void onClick(View v) {

    }
}
