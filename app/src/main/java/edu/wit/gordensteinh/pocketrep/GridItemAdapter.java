package edu.wit.gordensteinh.pocketrep;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

public class GridItemAdapter extends ArrayAdapter<GridItem> {

    private LayoutInflater mInflater;

    public GridItemAdapter(Context context, int rid, List<GridItem> list)
    {
        super(context, rid, list);

        mInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }

    public View getView(int position, View convertView, ViewGroup parent)
    {
        GridItem item = (GridItem) getItem(position);

        View view = mInflater.inflate(R.layout.grid_item, null);

        ImageView image;
        image = (ImageView)view.findViewById(R.id.image);
        image.setImageBitmap(item.image);

        TextView name = (TextView) view.findViewById(R.id.name);
        name.setText(item.name);

        return view;
    }
}
