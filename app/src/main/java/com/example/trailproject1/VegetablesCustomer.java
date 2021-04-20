package com.example.trailproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class VegetablesCustomer extends AppCompatActivity {
    TextView Tomatoquantity,Onionquantity;
    int count=0;
    Button CustomerTomatoSelectBtn,CustomerOnionSelectBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetables_customer);
        Tomatoquantity = (TextView) findViewById(R.id.RetailerTomatoQuantityValue);
        Onionquantity = (TextView) findViewById(R.id.RetailerOrangeQuantityValue);

        CustomerTomatoSelectBtn=(Button)findViewById(R.id.CustomerTomatoQauntitySelectButton);
        CustomerOnionSelectBtn=(Button)findViewById(R.id.CustomerOnionQauntitySelectButton);


        CustomerTomatoSelectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(VegetablesCustomer.this,CustomerVegetableTomatoAddToCartPage.class);
                startActivity(intent);
            }
        });
        CustomerOnionSelectBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(VegetablesCustomer.this,CustomerVegetableTomatoAddToCartPage.class);
                startActivity(intent);
            }
        });
    }
    public void incrementTomato(View v)
    {
        count++;
        Tomatoquantity.setText("" + count);
    }
    public void decrementTomato(View v)
    {
        if(count<=0)
            count = 0;
        else
            count--;
        Tomatoquantity.setText("" + count);
    }
    public void incrementOnion(View v)
    {
        count++;
        Onionquantity.setText("" + count);
    }
    public void decrementOnion(View v)
    {
        if(count<=0)
            count = 0;
        else
            count--;
        Onionquantity.setText("" + count);
    }
}

/*package com.example.allpagesfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class VMC extends AppCompatActivity {

    TextView Tomatoquantity,Onionquantity,Carrotquantity;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_v_m_c);


        Carrotquantity = (TextView) findViewById(R.id.BananaQuantityValue);
    }


    public void incrementcarrot(View v)
    {
        count++;
        Carrotquantity.setText("" + count);
    }
    public void decrementcarrot(View v)
    {
        if(count<=0)
            count = 0;
        else
            count--;
        Carrotquantity.setText("" + count);
    }
}*/