package org.pltw.neilgrand.ritday8intentsexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mSubmitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSubmitButton = (Button) findViewById(R.id.button_submit);
        mSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, ReceiveMessageActivity.class);
//                startActivity(intent);

//                Intent intent = new Intent(Intent.ACTION_DIAL);
//                intent.setType("text/plain");
//                intent.putExtra(Intent.EXTRA_TEXT,"this is a msg");

//                Intent intent = new Intent(Intent);
//                startActivity(intent);

                //new work 3:36PM
                int i = 0;


            }
        });

    }
}
