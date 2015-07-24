package academyteam.com.netmonsters;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by James on 24/07/2015.
 */
public class Training extends Activity {
    Install install;
    private Monster monster1;
    private Monster monster2;
    private Monster monster3;
    private int current;
    ImageButton btnMonster1, btnMonster2, btnMonster3;
    Button play, feed, clean, beat, teach;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        current = 1;
        install = new Install(getBaseContext());
        Monster[] m = install.findMyMonsters();
        monster1 = m[0];
        monster2 = m[1];
        monster3 = m[2];
        btnMonster1 = (ImageButton) findViewById(R.id.monster1);
        btnMonster2 = (ImageButton) findViewById(R.id.monster2);
        btnMonster3 = (ImageButton) findViewById(R.id.monster3);
        play = (Button) findViewById(R.id.play);
        feed = (Button) findViewById(R.id.feed);
        clean = (Button) findViewById(R.id.clean);
        beat = (Button) findViewById(R.id.beat);
        teach = (Button) findViewById(R.id.teachattack);
        btnMonster1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current = 1;
            }
        });
        btnMonster2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current = 2;
            }
        });
        btnMonster3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current = 3;
            }
        });
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(current) {
                    case 1:
                        monster1.play();
                        break;
                    case 2:
                        monster2.play();
                        break;
                    case 3:
                        monster3.play();
                        break;
                }
            }
        });
        feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(current) {
                    case 1:
                        monster1.feed();
                        break;
                    case 2:
                        monster2.feed();
                        break;
                    case 3:
                        monster3.feed();
                        break;
                }
            }
        });
        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(current) {
                    case 1:
                        monster1.clean();
                        break;
                    case 2:
                        monster2.clean();
                        break;
                    case 3:
                        monster3.clean();
                        break;
                }
            }
        });
        beat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(current) {
                    case 1:
                        monster1.beat();
                        break;
                    case 2:
                        monster2.beat();
                        break;
                    case 3:
                        monster3.beat();
                        break;
                }
            }
        });
        teach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO
            }
        });
    }


}
