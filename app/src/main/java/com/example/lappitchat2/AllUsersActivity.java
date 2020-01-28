package com.example.lappitchat2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.firebase.database.FirebaseDatabase;

public class AllUsersActivity extends AppCompatActivity {
    private Toolbar mToolBar;
    private RecyclerView mUserList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_users);

        mToolBar = (Toolbar) findViewById(R.id.all_user_toolbar);
        setSupportActionBar(mToolBar);
        getSupportActionBar().setTitle("All User");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        mUserList = (RecyclerView)findViewById(R.id.users_list);
        mUserList.setHasFixedSize(true);




    }
}
