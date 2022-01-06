package com.example.cricketscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView showTick120, showTick119, showTick118, showTick117, showTick116, showTick115, showTick1Bulls;
    int giCounter120, giCounter119, giCounter118, giCounter117, giCounter116, giCounter115, giCounter1Bulls = 0;

    TextView showTick220, showTick219, showTick218, showTick217, showTick216, showTick215, showTick2Bulls;
    int giCounter220, giCounter219, giCounter218, giCounter217, giCounter216, giCounter215, giCounter2Bulls = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TEAM 1 FUNCTIONS
        showTick120 = (TextView) findViewById(R.id.tick120);
        showTick119 = (TextView) findViewById(R.id.tick119);
        showTick118 = (TextView) findViewById(R.id.tick118);
        showTick117 = (TextView) findViewById(R.id.tick117);
        showTick116 = (TextView) findViewById(R.id.tick116);
        showTick115 = (TextView) findViewById(R.id.tick115);
        showTick1Bulls = (TextView) findViewById(R.id.tick1Bulls);

        // TEAM 2 FUNCTIONS
        showTick220 = (TextView) findViewById(R.id.tick220);
        showTick219 = (TextView) findViewById(R.id.tick219);
        showTick218 = (TextView) findViewById(R.id.tick218);
        showTick217 = (TextView) findViewById(R.id.tick217);
        showTick216 = (TextView) findViewById(R.id.tick216);
        showTick215 = (TextView) findViewById(R.id.tick215);
        showTick2Bulls = (TextView) findViewById(R.id.tick2Bulls);
    }

    // UNDO

    // TEAM 1 SCORE
    // Adds tick per button clicked for 20
    public void onClick120(View view) {
        giCounter120 += 1;

        if(giCounter120 == 1)
        {
            showTick120.setText("/");
        }
        else if (giCounter120 == 2)
        {
            showTick120.setText("X");
        }
        else if (giCounter120 == 3)
        {
            showTick120.setText("O");
        }
    }

    // Adds tick per button clicked for 19
    public void onClick119(View view) {
        giCounter119 += 1;

        if(giCounter119 == 1)
        {
            showTick119.setText("/");
        }
        else if (giCounter119 == 2)
        {
            showTick119.setText("X");
        }
        else if (giCounter119 == 3)
        {
            showTick119.setText("O");
        }
    }

    // Adds tick per button clicked for 18
    public void onClick118(View view) {
        giCounter118 += 1;

        if(giCounter118 == 1)
        {
            showTick118.setText("/");
        }
        else if (giCounter118 == 2)
        {
            showTick118.setText("X");
        }
        else if (giCounter118 == 3)
        {
            showTick118.setText("O");
        }
    }

    // Adds tick per button clicked for 17
    public void onClick117(View view) {
        giCounter117 += 1;

        if(giCounter117 == 1)
        {
            showTick117.setText("/");
        }
        else if (giCounter117 == 2)
        {
            showTick117.setText("X");
        }
        else if (giCounter117 == 3)
        {
            showTick117.setText("O");
        }
    }

    // Adds tick per button clicked for 16
    public void onClick116(View view) {
        giCounter116 += 1;

        if(giCounter116 == 1)
        {
            showTick116.setText("/");
        }
        else if (giCounter116 == 2)
        {
            showTick116.setText("X");
        }
        else if (giCounter116 == 3)
        {
            showTick116.setText("O");
        }
    }

    // Adds tick per button clicked for 15
    public void onClick115(View view) {
        giCounter115 += 1;

        if(giCounter115 == 1)
        {
            showTick115.setText("/");
        }
        else if (giCounter115 == 2)
        {
            showTick115.setText("X");
        }
        else if (giCounter115 == 3)
        {
            showTick115.setText("O");
        }
    }

    // Adds tick per button clicked for Bullseye
    public void onClick1Bulls(View view) {
        giCounter1Bulls += 1;

        if(giCounter1Bulls == 1)
        {
            showTick1Bulls.setText("/");
        }
        else if (giCounter1Bulls == 2)
        {
            showTick1Bulls.setText("X");
        }
        else if (giCounter1Bulls == 3)
        {
            showTick1Bulls.setText("O");
        }
    }

    // TEAM 2 SCORE
    // Adds tick per button clicked for Team 2 Score 20
    public void onClick220(View view) {
        giCounter220 += 1;

        if(giCounter220 == 1)
        {
            showTick220.setText("/");
        }
        else if (giCounter220 == 2)
        {
            showTick220.setText("X");
        }
        else if (giCounter220 == 3)
        {
            showTick220.setText("O");
        }
    }

    // Adds tick per button clicked for Team 2 Score 19
    public void onClick219(View view) {
        giCounter219 += 1;

        if(giCounter219 == 1)
        {
            showTick219.setText("/");
        }
        else if (giCounter219 == 2)
        {
            showTick219.setText("X");
        }
        else if (giCounter219 == 3)
        {
            showTick219.setText("O");
        }
    }

    // Adds tick per button clicked for Team 2 Score 18
    public void onClick218(View view) {
        giCounter218 += 1;

        if(giCounter218 == 1)
        {
            showTick218.setText("/");
        }
        else if (giCounter218 == 2)
        {
            showTick218.setText("X");
        }
        else if (giCounter218 == 3)
        {
            showTick218.setText("O");
        }
    }

    // Adds tick per button clicked for Team 2 Score 17
    public void onClick217(View view) {
        giCounter217 += 1;

        if(giCounter217 == 1)
        {
            showTick217.setText("/");
        }
        else if (giCounter217 == 2)
        {
            showTick217.setText("X");
        }
        else if (giCounter217 == 3)
        {
            showTick217.setText("O");
        }
    }

    // Adds tick per button clicked for Team 2 Score 16
    public void onClick216(View view) {
        giCounter216 += 1;

        if(giCounter216 == 1)
        {
            showTick216.setText("/");
        }
        else if (giCounter216 == 2)
        {
            showTick216.setText("X");
        }
        else if (giCounter216 == 3)
        {
            showTick216.setText("O");
        }
    }

    // Adds tick per button clicked for Team 2 Score 15
    public void onClick215(View view) {
        giCounter215 += 1;

        if(giCounter215 == 1)
        {
            showTick215.setText("/");
        }
        else if (giCounter215 == 2)
        {
            showTick215.setText("X");
        }
        else if (giCounter215 == 3)
        {
            showTick215.setText("O");
        }
    }

    // Adds tick per button clicked for Team 2 Score Bullseye
    public void onClick2Bulls(View view) {
        giCounter2Bulls += 1;

        if(giCounter2Bulls == 1)
        {
            showTick2Bulls.setText("/");
        }
        else if (giCounter2Bulls == 2)
        {
            showTick2Bulls.setText("X");
        }
        else if (giCounter2Bulls == 3)
        {
            showTick2Bulls.setText("O");
        }
    }
}
