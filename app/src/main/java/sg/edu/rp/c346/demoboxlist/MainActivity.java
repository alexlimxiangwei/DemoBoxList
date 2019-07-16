package sg.edu.rp.c346.demoboxlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lvColor;
        CustomAdapter caColor;
        ArrayList<Color> alColor;

        lvColor = findViewById(R.id.lvColor);
        alColor = new ArrayList<>();
        alColor.add(new Color("blue"));
        alColor.add(new Color("brown"));
        alColor.add(new Color("orange"));

        caColor = new CustomAdapter(this,R.layout.row,alColor);
        lvColor.setAdapter(caColor);

    }

}
