package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:

    Button mButtonTop;
    Button mButtonBottom;
    TextView textStory;
    int mStoryIndex = 1;

//    final int[] storyLines = new int[]{
//            R.string.T1_Story,
//            R.string.T2_Story,
//            R.string.T3_Story,
//            R.string.T4_End,
//            R.string.T5_End,
//            R.string.T6_End
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mButtonTop = (Button) findViewById(R.id.buttonTop);
        mButtonBottom = (Button) findViewById(R.id.buttonBottom);
        textStory = (TextView) findViewById(R.id.storyTextView);

        textStory.setText(R.string.T1_Story);
        mButtonTop.setText(R.string.T1_Ans1);
        mButtonBottom.setText(R.string.T1_Ans2);

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1 || mStoryIndex == 2){
                    mStoryIndex = 3;
                    textStory.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);
                }else if (mStoryIndex == 3) {
                    storyEnd6();
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) {
                    mStoryIndex = 2;
                    textStory.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonBottom.setText(R.string.T2_Ans2);
                }else if (mStoryIndex == 3){
                    storyEnd5();
                }else {
                    storyEnd4();
                }
            }
        });
    }

    public void storyEnd4 (){
        textStory.setText(R.string.T4_End);
        mButtonTop.setVisibility(View.GONE);
        mButtonBottom.setVisibility(View.GONE);
    }

    public void storyEnd5 (){
        textStory.setText(R.string.T5_End);
        mButtonTop.setVisibility(View.GONE);
        mButtonBottom.setVisibility(View.GONE);
    }

    public void storyEnd6 (){
        textStory.setText(R.string.T6_End);
        mButtonTop.setVisibility(View.GONE);
        mButtonBottom.setVisibility(View.GONE);
    }

}
