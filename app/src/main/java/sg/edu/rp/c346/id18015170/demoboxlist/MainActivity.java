package sg.edu.rp.c346.id18015170.demoboxlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvBox;
    ArrayList<Box> alBoxList;
    CustomAdapter caBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvBox = findViewById(R.id.listViewBox);
        alBoxList = new ArrayList<>();
        Box box1 = new Box("blue");
        Box box2 = new Box("brown");
        Box box3 = new Box("orange");
        alBoxList.add(box1);
        alBoxList.add(box2);
        alBoxList.add(box3);

        caBox = new CustomAdapter(this, R.layout.row, alBoxList);
        lvBox.setAdapter(caBox);

    }
}
