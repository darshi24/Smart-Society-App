package com.example.darshi.homescreen;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.firebase.database.FirebaseDatabase;

import java.util.Random;


//Secretary gets a code that he can send to the new secretary
public class GetUserTypeChangeCode extends AppCompatDialogFragment {

    TextView usertype_code;
    Button done;
    int c;
    Globals g = Globals.getInstance();
    int prefMode = Activity.MODE_PRIVATE;
    public static String MY_PREFS = "MY_PREFS";
    private SharedPreferences mySharedPreferences;


    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_get_user_type_change_code, container, false);
        Toast.makeText(getContext(),"called", Toast.LENGTH_LONG).show();

        mySharedPreferences = getActivity().getSharedPreferences(MY_PREFS, prefMode);
        usertype_code = view.findViewById(R.id.usertype_code);
        done = view.findViewById(R.id.get_code_usertype_donebtn);

        Random number = new Random();
        c = number.nextInt(10000);

        final String userType_code = "a" + c + "ab";
        usertype_code.setText(userType_code);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase.getInstance().getReference().child(g.getSname()).child("usertype_code").setValue(userType_code);
                FirebaseDatabase.getInstance().getReference().child(g.getSname()).child("HouseMaster").child(g.getHm_blockno().concat(g.getHm_flatno())).child("userType").setValue("Resident");

                //set the shared preference as "Resident"
                g.setHm_usertype("Resident");
                SharedPreferences.Editor editor = mySharedPreferences.edit();
                editor.putString("newkey5xx", "Resident");
                editor.commit();
                /////////////////////////

                Toast.makeText(getContext(),g.getHm_usertype().toString(), Toast.LENGTH_LONG).show();

                if(g.getHm_usertype().equals("Resident"))
                {
                    Intent i = new Intent(getContext(),MainActivity.class);
                    startActivity(i);

                }

            }
        });

        return view;
    }
}