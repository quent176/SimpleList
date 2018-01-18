package fr.wcs.simplelist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class AddNewCoinActivity extends AppCompatActivity {

    private EditText mLongNameCoin, mShortNameCoin, mNumberHoldCoin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_coin);

        mLongNameCoin = findViewById(R.id.edit_longname_coin);
        mShortNameCoin = findViewById(R.id.edit_shortname_coin);
        mNumberHoldCoin = findViewById(R.id.edit_number_coin);

        mLongNameCoin.getText();
        mShortNameCoin.getText();
        mNumberHoldCoin.getText();

    }
}
