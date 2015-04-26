package sxd.learn.android.linkgame.view;

import android.graphics.Bitmap;
import android.media.Image;

/**
 * Created by Xiaodong on 4/6/2015.
 */
public class PieceImage {
    private Bitmap image;
    public int imageId;

    public PieceImage(Bitmap image, int imageId){
        super();
        this.image = image;
        this.imageId = imageId;
    }

    public void setImage(Bitmap image) {
        this.image = image;
    }

    public Bitmap getImage(){
        return image;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
