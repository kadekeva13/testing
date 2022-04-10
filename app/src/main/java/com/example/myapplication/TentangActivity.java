package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.text.Html.fromHtml;

public class TentangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        TextView tvContact = (TextView) findViewById(R.id.tvContact);

        tvContact.setText(fromHtml("</font><font color='#3b5998'>CONTACT US</font>"));

        tvContact.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent email = new Intent(Intent.ACTION_SEND);
                email.setData(Uri.parse("mailto:"));
                email.setType("message/kadekeva785");
                email.putExtra(Intent.EXTRA_EMAIL,new String[]{"kadekeva785@gmail.com"});

                startActivity(Intent.createChooser(email,"Send Mail"));
            }
        });
    }
}