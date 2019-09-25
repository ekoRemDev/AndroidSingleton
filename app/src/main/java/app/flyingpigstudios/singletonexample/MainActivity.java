package app.flyingpigstudios.singletonexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import app.flyingpigstudios.singletonexample.model.BubbleWrap;

public class MainActivity extends AppCompatActivity {

    private BubbleWrap bubbleWrap;
    private TextView tvNumberOfBuble;
    private Button btnAddMoreBubble;
    private Button btnPopBubble;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        bubbleWrap = new BubbleWrap();
        bubbleWrap = BubbleWrap.getInstance();

        tvNumberOfBuble = findViewById(R.id.textview_numberOfBuble);

        btnAddMoreBubble = findViewById(R.id.button_addMoreBuble);
        btnPopBubble = findViewById(R.id.button_popBubble);


        btnAddMoreBubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bubbleWrap.addMoreBubbles();
                tvNumberOfBuble.setText(String.valueOf(bubbleWrap.getNumBubles()));
            }
        });


        btnPopBubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,PopActivity.class);
                startActivity(i);
            }
        });





    }

    @Override
    protected void onResume() {
        super.onResume();
        tvNumberOfBuble.setText(String.valueOf(bubbleWrap.getNumBubles()));

    }
}
