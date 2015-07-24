package academyteam.com.netmonsters;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by Aaron on 24/07/2015.
 */
public class SplashScreen extends Activity {

    private boolean mIsBackButtonPressed;
    private static final int SPLASH_DURATION = 5000;

    //onCreate method to add all the buttons and layouts for the activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.splash_screen);

        Handler handler = new Handler();

        handler.postDelayed(new Runnable() {
            public void run() {

                finish();

                if (!mIsBackButtonPressed) {
                    Intent intent = new Intent(SplashScreen.this, Home.class);
                    SplashScreen.this.startActivity(intent);
                }
            }
        }, SPLASH_DURATION);
    }

    @Override
    public void onBackPressed() {
        mIsBackButtonPressed = true;
        super.onBackPressed();
    }
}
