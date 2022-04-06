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
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import static android.content.Context.MODE_PRIVATE;

public class PutUserTypeChangeCode extends AppCompatDialogFragment {

    EditText put_usertype_code;
    Button done;
    Globals g = Globals.getInstance();
    int prefMode = Activity.MODE_PRIVATE;
    public static String MY_PREFS = "MY_PREFS";
    private SharedPreferences mySharedPreferences;


    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_put_user_type_change_code, container, false);

        mySharedPreferences = getActivity().getSharedPreferences(MY_PREFS, prefMode);
        put_usertype_code = view.findViewById(R.id.usertype_code);
        done = view.findViewById(R.id.put_code_usertype_donebtn);

        done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String userType_code = put_usertype_code.getText().toString();


                FirebaseDatabase.getInstance().getReference().child(g.getSname()).addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        if(dataSnapshot.child("usertype_code").getValue().toString().equals(userType_code))
                        {
                            Toast.makeText(getContext(),"You are the new Secretary now",Toast.LENGTH_LONG).show();

                            FirebaseDatabase.getInstance().getReference().child(g.getSname()).child("HouseMaster").child(g.getHm_blockno().concat(g.getHm_flatno())).child("userType").setValue("Secretary");

                            //set the shared preference as "Secretary"
                            g.setHm_usertype("Secretary");
                            SharedPreferences.Editor editor = mySharedPreferences.edit();
                            editor.putString("newkey5xx", "Secretary");
                            editor.commit();
                            /////////////////////////

                            Intent i = new Intent(getContext(),MainActivity.class);
                            startActivity(i);

                        }
                        else
                        {
                            Toast.makeText(getContext(),"Wrong code",Toast.LENGTH_LONG).show();
                        }
                    }

                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });

            }
        });
        return view;
    }
}