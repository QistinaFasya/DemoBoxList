package sg.edu.rp.c346.id18015170.demoboxlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<Box> boxList;

    public CustomAdapter(Context context, int resource, ArrayList<Box> objects){
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        boxList = objects;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);
        ImageView ivGender = rowView.findViewById(R.id.imageViewBox);

        Box currentItem =boxList.get(position);
        if(currentItem.getColour().equals("blue")){
            ivGender.setImageResource(R.drawable.blue_box);
        }
        else if(currentItem.getColour().equals("brown")){
            ivGender.setImageResource(R.drawable.brown_box);
        }
        else{
            ivGender.setImageResource(R.drawable.orange_box);
        }


        return rowView;
    }
}
