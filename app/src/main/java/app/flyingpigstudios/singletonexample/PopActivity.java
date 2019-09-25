package app.flyingpigstudios.singletonexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import app.flyingpigstudios.singletonexample.model.BubbleWrap;

public class PopActivity extends AppCompatActivity {

    private BubbleWrap bubbleWrap;
    private TextView tvNumberOfBuble;
    private Button btnPopBubble;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop);

//        bubbleWrap = new BubbleWrap();
        bubbleWrap = BubbleWrap.getInstance();

        btnPopBubble = findViewById(R.id.button_PopBubble);
        tvNumberOfBuble = findViewById(R.id.textview_numberOfBuble);

        btnPopBubble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bubbleWrap.popBubble();
                tvNumberOfBuble.setText(String.valueOf(bubbleWrap.getNumBubles()));
            }
        });


    }


    @Override
    protected void onResume() {
        super.onResume();
        tvNumberOfBuble.setText(String.valueOf(bubbleWrap.getNumBubles()));

    }
}
