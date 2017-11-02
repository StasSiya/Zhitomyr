package com.example.android.zhitomyr;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Anastasiya on 16.06.2017.
 */

public class ItemAdapter extends ArrayAdapter<Item> {

    private int mColorResourceId;
    private int mMediaPlayer;

    public ItemAdapter(Activity context, ArrayList<Item> items, int colorResourceId) {
        super(context, 0, items);
        mColorResourceId = colorResourceId;


    }

    @NonNull
    @Override
    //override the getView method
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item1, parent, false);
        }
        Item currentPart = getItem(position);

        TextView titleEn = (TextView) listItemView.findViewById(R.id.title_en);
        titleEn.setText(currentPart.getNameItem());

      /* TextView titleRu = (TextView) listItemView.findViewById(R.id.title_ru);
        titleRu.setText(currentPart.getDescriptionItem());*/

        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        image.setImageResource(currentPart.getImageResourceId());


        return listItemView;

    }
}