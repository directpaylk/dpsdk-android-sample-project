package lk.directpay.paymentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.directpay.payments.dpsdk.DPSDK;
import com.directpay.payments.dpsdk.Models.Card;
import com.directpay.payments.dpsdk.Models.CardAddCallback;

public class MainActivity extends AppCompatActivity {

    private DPSDK directpay;

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        directpay = new DPSDK(
                "API_KEY",
                "YOUR_MERCHANT_ID",
                "USER_ID",
                "USER_NAME",
                "+94731234567",
                "emailifavailable@user.com"
        );

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                directpay.addNewCard(MainActivity.this, new CardAddCallback() {
                    @Override
                    public void onSuccess(Card card) {
                        Log.d("SUCCESS", card.toString());
                    }

                    @Override
                    public void onError(int code, String message) {
                        Log.e("ERROR", code + " - " + message);
                    }
                });
            }
        });
    }
}