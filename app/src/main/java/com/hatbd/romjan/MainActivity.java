package com.hatbd.romjan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.Switch;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    private TextView showDate;
    private CalendarView calendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      /*  String currentDate = DateFormat.getDateTimeInstance().format(new Date());

        SimpleDateFormat dateFormat = new SimpleDateFormat("HH : mm : ss");
        showDate.setText(currentDate+"\n"+dateFormat.format(Calendar.getInstance().getTime()));*/

        showDate = findViewById(R.id.date_textView);
        calendarView = findViewById(R.id.calenderView);

        long currentDate = calendarView.getDate();

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange( CalendarView view, int year, int month, int dayOfMonth) {

                int date = dayOfMonth;
                switch (date)
                {
                    case  7:
                        showDate.setText("সেহেরি : 4 : 52\n"+"ইফতারি : 6 : 34");
                        break;
                        case  8:
                        showDate.setText("Seheri : 4 : 52\n"+"Iftari : 6 : 34");
                        break;
                        case  9:
                        showDate.setText("Seheri : 4 : 52\n"+"Iftari : 6 : 34");
                        break;
                        default:
                            showDate.setText(dayOfMonth +"/"+month+"/"+year);
                }

            }
        });

        //showDate.setText((int) currentDate);



    }
}
