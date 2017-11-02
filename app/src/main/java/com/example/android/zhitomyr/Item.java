package com.example.android.zhitomyr;

/**
 * Created by Anastasiya on 16.06.2017.
 */

public class Item {
    private String nameItem;
    private String descriptionItem;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private int mAudioResourceId;
    private static final int NO_IMAGE_PROVIDED = -1;

    //Constructor of an item
    public Item(String item, String description, int img, int audio) {
        nameItem = item;
        descriptionItem = description;
        imageResourceId = img;
        mAudioResourceId = audio;
    }

    public String getNameItem() {
        return nameItem;
    }

    public String getDescriptionItem() {
        return descriptionItem;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public boolean hasImage() {
        //return an image if an image is provided
        return imageResourceId != NO_IMAGE_PROVIDED;
    }

    @Override
    public String toString() {
        return "Item{" +
                "nameItem='" + nameItem + '\'' +
                ", descriptionItem='" + descriptionItem + '\'' +
                ", imageResourceId=" + imageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
