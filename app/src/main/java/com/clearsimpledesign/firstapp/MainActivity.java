package com.clearsimpledesign.firstapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.Calendar;
import static java.util.Calendar.DAY_OF_YEAR;

public class MainActivity extends AppCompatActivity {

    //Button bt1;
    TextView asgardDate;
    TextView asgardDay;
    TextView asgardMonth;
    AsgardDate test = new AsgardDate();
    String newString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Calendar Functions //
        int day = Calendar.getInstance().get(DAY_OF_YEAR);
        int weekDay = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);

        // Day of year //
        asgardDate = (TextView) findViewById(R.id.dateNumberAsgard);
        asgardDate.setText(String.valueOf(test.setDateNumberAsgard(day)));

        // Month //
        asgardMonth = (TextView) findViewById(R.id.monthAsgardia);
        asgardMonth.setText(String.valueOf(test.asgardMonthName(day)));

        // Day //
        asgardDay = (TextView) findViewById(R.id.dayAsgard);
        asgardDay.setText(String.valueOf(test.asgardDayName(weekDay)));

        // Newlines//

    }


}
