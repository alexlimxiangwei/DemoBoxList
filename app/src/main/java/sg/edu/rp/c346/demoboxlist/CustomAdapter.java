package sg.edu.rp.c346.demoboxlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context context;
    int resource;
    ArrayList<Color> objects;

    public CustomAdapter(Context context, int resource, ArrayList<Color> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(resource, parent, false);

        // Obtain the UI components and do the necessary binding
        ImageView ivColor = rowView.findViewById(R.id.ivColor);

        // Obtain the Android Version information based on the position
        Color color = objects.get(position);

        // Set values to the TextView to display the corresponding information

        if(color.getColor().equalsIgnoreCase("blue")) {
            ivColor.setImageResource(R.drawable.blue_box);
        }
        else if (color.getColor().equalsIgnoreCase("brown")){
            ivColor.setImageResource(R.drawable.brown_box);
        }
        else{
            ivColor.setImageResource(R.drawable.orange_box);
        }

        return rowView;
    }


}
