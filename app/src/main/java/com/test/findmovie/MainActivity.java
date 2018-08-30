package com.test.findmovie;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.userNameInputLayout)
    TextInputLayout userNameInputLayout;

    @BindView(R.id.userNameEditText)
    EditText userNameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.showDetailsButton)
    void showDetails() {
        String movieName = userNameEditText.getText().toString().trim();
        if (!TextUtils.isEmpty(movieName)) {
            userNameInputLayout.setError("");
            // TODO start search
        } else {
            userNameInputLayout.setError(getString(R.string.error_invalid_input));
        }
    }
}
