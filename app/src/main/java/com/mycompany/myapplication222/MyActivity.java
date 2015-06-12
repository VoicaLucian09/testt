package com.mycompany.myapplication222;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.util.Log;

public class MyActivity extends ActionBarActivity {
    private static RadioGroup rad_gr_1,rad_gr_2,rad_gr_3;
    private static RadioButton b11,b12,b13,b21,b22,b23,b31,b32,b33;
    private int m1,m2,m3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

    }

    public void onButtonClick(View v) {
        EditText e1=(EditText)findViewById(R.id.editText);
        EditText e2=(EditText)findViewById(R.id.editText2);
        EditText e3=(EditText)findViewById(R.id.editText3);
        TextView r1=(TextView)findViewById(R.id.result);
        int m1=1,m2=1,m3=1;

        RadioGroup  mRadioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        int nIdRadio = mRadioGroup.getCheckedRadioButtonId();
        if(nIdRadio==R.id.rb11) m1=1;
         else if(nIdRadio==R.id.rb12) m1=2;
         else if(nIdRadio==R.id.rb13) m1=3;

        mRadioGroup=(RadioGroup) findViewById(R.id.radioGroup2);
        nIdRadio = mRadioGroup.getCheckedRadioButtonId();
        if(nIdRadio==R.id.rb21) m2=1;
        else if(nIdRadio==R.id.rb22) m2=2;
        else if(nIdRadio==R.id.rb23) m2=3;

        mRadioGroup=(RadioGroup) findViewById(R.id.radioGroup3);
        nIdRadio = mRadioGroup.getCheckedRadioButtonId();
        if(nIdRadio==R.id.rb31) m3=1;
        else if(nIdRadio==R.id.rb32) m3=2;
        else if(nIdRadio==R.id.rb33) m3=3;


        int num1=0,num2=0,num3=0;
        //if(Integer.parseInt(e1.getText().toString())>=0)
            num1=Integer.parseInt(e1.getText().toString());

            num2=Integer.parseInt(e2.getText().toString());

            num3=Integer.parseInt(e3.getText().toString());

        int sum=num1*m1+num2*m2+num3*m3;
        r1.setText(Integer.toString(sum));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}