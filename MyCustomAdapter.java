package com.example.volumecalculator;

import android.content.Context;
import android.graphics.drawable.shapes.Shape;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MyCustomAdapter extends ArrayAdapter<shape> {
    private ArrayList<shape> shapesArrayList;
    Context context;


    public MyCustomAdapter(ArrayList<shape> shapesArrayList, Context context) {
        super(context, R.layout.grid_item_layout,shapesArrayList);
        this.shapesArrayList=shapesArrayList;
        this.context=context;
    }
    private static class myviewholder
    {
        TextView shapename;
        ImageView shapeImg;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        shape shapes=getItem(position);

        myviewholder Myviewholder;

        if(convertView==null)
        {
            Myviewholder=new myviewholder();
            LayoutInflater infalter=LayoutInflater.from(getContext());
            convertView=infalter.inflate(R.layout.grid_item_layout,parent,false);

            Myviewholder.shapename=(TextView) convertView.findViewById(R.id.textviewid);
            Myviewholder.shapeImg=(ImageView) convertView.findViewById(R.id.imageviewid);

            convertView.setTag(Myviewholder);
        }
        else
        {

         Myviewholder=(myviewholder) convertView.getTag();
        }
        Myviewholder.shapename.setText(shapes.getShapename());
        Myviewholder.shapeImg.setImageResource(shapes.getShapeImg());

      return convertView;








    }
}
