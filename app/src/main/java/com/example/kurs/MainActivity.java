package com.example.kurs;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.kurs.R;


public class MainActivity extends AppCompatActivity implements OnClickListener{
    TextView dollars;
    TextView rupiah ;
    RadioButton dtor;
    RadioButton rtod;
    Button convert;


    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.desain);

        dollars = (TextView)this.findViewById(R.id.dollar);
        rupiah = (TextView)this.findViewById(R.id.rupiah);

        dtor = (RadioButton)this.findViewById(R.id.dtor);
        dtor.setChecked(true);
        rtod = (RadioButton)this.findViewById(R.id.rtod);

        convert = (Button)this.findViewById(R.id.convert);
        convert.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (dtor.isChecked()){
            convertDollarToRupiah();}
        if (rtod.isChecked()){
            convertRupiahToDollar();}
    }

    protected void convertDollarToRupiah() {
        double val= Double.parseDouble(dollars.getText().toString());
        rupiah.setText(Double.toString(val*14050));
    }

    protected void convertRupiahToDollar() {
        double val= Double.parseDouble(rupiah.getText().toString());
        dollars.setText(Double.toString(val/14050));
    }

}
