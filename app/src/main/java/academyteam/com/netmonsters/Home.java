package academyteam.com.netmonsters;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by Aaron on 24/07/2015.
 */
public class Home extends Activity {

    ImageButton btnCapture, btnTrain, btnBattle, btnOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the reference of the buttons
       //btnBattle = (Button) findViewById(R.id.buttonBattle);
        btnCapture = (ImageButton) findViewById(R.id.buttonCapture);
       /* btnOptions = (Button) findViewById(R.id.buttonOptions);
        btnTrain = (Button) findViewById(R.id.buttonTrain);*/

        //set onClick listeners for each button
        btnCapture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Edit the "Capture.class" when Capture section completed.
                Intent intentCapture = new Intent(getApplicationContext(), Capture.class);
                startActivity(intentCapture);
            }
        });

       /* btnBattle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Edit the "Capture.class" when Capture section completed.
               // Intent intentBattle = new Intent(getApplicationContext(), Battle.class);
               // startActivity(intentBattle);
            }
        });

        btnOptions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Edit the "Capture.class" when Capture section completed.
                //Intent intentOptions = new Intent(getApplicationContext(), Options.class);
               //startActivity(intentOptions);
            }
        });

        btnTrain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Edit the "Capture.class" when Capture section completed.
               // Intent intentTrain = new Intent(getApplicationContext(), Train.class);
                //startActivity(intentTrain);
            }
        });*/
    }

}
