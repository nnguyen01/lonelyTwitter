package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class EditTweetActivity extends Activity {
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Intent intent = getIntent();

        text = (TextView) findViewById(R.id.tweetBox);

        text.setText(intent.getExtras().getString("message"));
    }
}