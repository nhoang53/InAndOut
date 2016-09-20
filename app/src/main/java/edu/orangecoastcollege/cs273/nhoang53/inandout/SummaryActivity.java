package edu.orangecoastcollege.cs273.nhoang53.inandout;

/**
 * Nguyen Hoang C02288487
 * Project 2: In and Out
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {

    private TextView totalTextView;
    private TextView subTotalTextView;
    private TextView taxTextView;
    private TextView numberItemsOrderedTextView;

    /**
     * Create the app's layout
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        totalTextView = (TextView) findViewById(R.id.orderTotalTextView);
        subTotalTextView = (TextView) findViewById(R.id.subtotalTextView);
        taxTextView = (TextView) findViewById(R.id.taxTextView);
        numberItemsOrderedTextView = (TextView) findViewById(R.id.numberItemsOrderedTextVie);

        Intent intentFromOrderActivity = getIntent();
        totalTextView.setText(intentFromOrderActivity.getStringExtra("total"));
        subTotalTextView.setText(intentFromOrderActivity.getStringExtra("subTotal"));
        taxTextView.setText(intentFromOrderActivity.getStringExtra("tax"));
        numberItemsOrderedTextView.setText(intentFromOrderActivity.getStringExtra("numberItemsOrdered"));
    }

    /**
     * Close this layout and go back to previous layout
     * @param view
     */
    public void returnToDataEntry(View view){
        this.finish();
    }
}
