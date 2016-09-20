package edu.orangecoastcollege.cs273.nhoang53.inandout;

/**
 * Nguyen Hoang C02288487
 * Project 2: In and Out
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import java.text.NumberFormat;

public class OrderActivity extends AppCompatActivity {

    private EditText doubleDoubleEditText;
    private EditText cheeseburgerEditText;
    private EditText frenchFriesEditText;
    private EditText shakesEditText;
    private EditText smallEditText;
    private EditText mediumEditText;
    private EditText largeEditText;

    private Order currentOrder = new Order();
    private static NumberFormat currency = NumberFormat.getCurrencyInstance();

    /**
     * Create the App Layout
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        doubleDoubleEditText = (EditText) findViewById(R.id.doubleDoubleEditText);
        cheeseburgerEditText = (EditText) findViewById(R.id.cheeseBurgerEditText);
        frenchFriesEditText = (EditText) findViewById(R.id.frenchFriesEditText);
        shakesEditText = (EditText) findViewById(R.id.shakesEditText);
        smallEditText = (EditText) findViewById(R.id.smallDrinkEditText);
        mediumEditText = (EditText) findViewById(R.id.mediumDrinkEditText);
        largeEditText = (EditText) findViewById(R.id.largeDrinkEditText);

    }

    /**
     * Read value from each EditText controls and calculate price of order
     * Create the Intent object to pass information to the SummaryActivity
     * Start the SummaryActivity
     * @param view
     */
    public void activateOrderSummary(View view){
        if(cheeseburgerEditText.getText().length() > 0)
            currentOrder.setmCheeseburgers(Integer.parseInt(cheeseburgerEditText.getText().toString()));
        if(doubleDoubleEditText.getText().toString().length() > 0)
            currentOrder.setmDoubleDoubles(Integer.parseInt(doubleDoubleEditText.getText().toString()));
        if(frenchFriesEditText.getText().length() > 0)
            currentOrder.setmFrenchFires(Integer.parseInt(frenchFriesEditText.getText().toString()));
        if(largeEditText.getText().length() > 0)
            currentOrder.setmLargeDrinks(Integer.parseInt(largeEditText.getText().toString()));
        if(mediumEditText.getText().length() > 0)
            currentOrder.setmMediumDrinks(Integer.parseInt(mediumEditText.getText().toString()));
        if(smallEditText.getText().length() > 0)
            currentOrder.setmSmallDrinks(Integer.parseInt(smallEditText.getText().toString()));
        if(shakesEditText.getText().length() > 0)
            currentOrder.setmShakes(Integer.parseInt(shakesEditText.getText().toString()));

        String subTotal = currency.format(currentOrder.calculateSubtotal());
        String tax = currency.format(currentOrder.calculateTax());
        String total = currency.format(currentOrder.calculateTotal());
        String numberItemsOrdered = String.valueOf(currentOrder.getNumberItemsOrdered());

        Intent orderSummaryIntent = new Intent(OrderActivity.this, SummaryActivity.class);
        orderSummaryIntent.putExtra("subTotal", subTotal);
        orderSummaryIntent.putExtra("tax", tax);
        orderSummaryIntent.putExtra("total", total);
        orderSummaryIntent.putExtra("numberItemsOrdered", numberItemsOrdered);
        startActivity(orderSummaryIntent);
    }
}
