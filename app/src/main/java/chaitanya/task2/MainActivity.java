package chaitanya.task2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnItemSelectedListener{

    TextView name,dept,roll;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(TextView)findViewById(R.id.nameet);
        roll=(TextView)findViewById(R.id.rollet);

        spinner =(Spinner)findViewById(R.id.spinner);


    }



    int flag=0;
    public void intentthanks(View v)
    {   String names=name.getText().toString();
        String rolls=roll.getText().toString();
        if(names.equals(""))
        {Toast.makeText(this, "Name not entered",Toast.LENGTH_SHORT).show();
            flag=1;}
        if(rolls.equals(""))
        {Toast.makeText(this, "RollNo not entered",Toast.LENGTH_SHORT).show();
            flag=1;}

        if(flag==0)
        {
            //intent

        }
}
