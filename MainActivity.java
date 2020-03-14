package com.example.mysecondapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner m1;
    private Spinner m2;
    private TextView result;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        m1=(Spinner)findViewById(R.id.M1);
        m2=(Spinner)findViewById(R.id.M2);
        List<String> moneyList=new ArrayList<String>();
        moneyList.add("RON-Lei");
        moneyList.add("USD-Dollar");
        moneyList.add("EUR-Euro");
        moneyList.add("HUF-Forint");
        moneyList.add("BGN-Leva");

        ArrayAdapter<String>dataAdapter;
        dataAdapter=new ArrayAdapter(this, android.R.layout.simple_spinner_item,moneyList);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        m1.setAdapter(dataAdapter);
        m2.setAdapter(dataAdapter);
        result=(TextView)findViewById(R.id.Result);
        Button convertButton=(Button)findViewById(R.id.B);
        convertButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                switch ((String)m1.getSelectedItem()){
                    case "RON-Lei":
                        switch ((String)m2.getSelectedItem()){
                            case "RON-Lei":
                                result.setText("  1.00");
                                break;
                            case "USD-Dollar":
                                result.setText("  0.23");
                                break;
                            case "EUR-Euro":
                                result.setText("  0.21");
                                break;
                            case "HUF-Forint":
                                result.setText("  69.41");
                                break;
                            case "BGN-Leva":
                                result.setText("  0.41");
                                break;
                            default:break;
                        }
                        break;
                    case "USD-Dollar":
                        switch ((String)m2.getSelectedItem()){
                            case "RON-Lei":
                                result.setText("  4.31");
                                break;
                            case "USD-Dollar":
                                result.setText("  1.00");
                                break;
                            case "EUR-Euro":
                                result.setText("  0.90");
                                break;
                            case "HUF-Forint":
                                result.setText("  299.33");
                                break;
                            case "BGN-Leva":
                                result.setText("  1.76");
                                break;
                            default:break;
                        }
                        break;
                    case "HUF-Forint":
                        switch ((String)m2.getSelectedItem()){
                            case "RON-Lei":
                                result.setText("  0.014");
                                break;
                            case "USD-Dollar":
                                result.setText("  0.0033");
                                break;
                            case "EUR-Euro":
                                result.setText("  0.0030");
                                break;
                            case "HUF-Forint":
                                result.setText("  1.00");
                                break;
                            case "BGN-Leva":
                                result.setText("  0.0059");
                                break;
                            default:break;
                        }
                        break;
                    case "EUR-Euro":
                        switch ((String)m2.getSelectedItem()){
                            case "RON-Lei":
                                result.setText("  4.78");
                                break;
                            case "USD-Dollar":
                                result.setText("  1.11");
                                break;
                            case "EUR-Euro":
                                result.setText("  1.00");
                                break;
                            case "HUF-Forint":
                                result.setText("  331.43");
                                break;
                            case "BGN-Leva":
                                result.setText("  1.96");
                                break;
                            default:break;
                        }
                        break;
                    case "BGN-Leva":
                        switch ((String)m2.getSelectedItem()){
                            case "RON-Lei":
                                result.setText("  2.44");
                                break;
                            case "USD-Dollar":
                                result.setText("  0.57");
                                break;
                            case "EUR-Euro":
                                result.setText("  0.51");
                                break;
                            case "HUF-Forint":
                                result.setText("  169.64");
                                break;
                            case "BGN-Leva":
                                result.setText("  1.00");
                                break;
                            default:break;
                        }
                        break;
                    default:break;
                }
            }
        });




    }
}
