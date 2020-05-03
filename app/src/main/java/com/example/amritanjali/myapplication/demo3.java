package com.example.amritanjali.myapplication;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class demo3 extends AppCompatActivity {
    Button B,b1,b2,b3,b4,b5,b6,b7,b8,b9,bp,be,del,b10;

    Button b;
    EditText E;
    String s;
    int k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo3);
        b = (Button) findViewById(R.id.call);
        E = (EditText) findViewById(R.id.e);


        b.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                s = String.valueOf(E.getText());
                k = Integer.valueOf(s);
                Intent i = new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:" + s));
                if (ActivityCompat.checkSelfPermission(demo3.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                startActivity(i);




                }


        });


    }
}
