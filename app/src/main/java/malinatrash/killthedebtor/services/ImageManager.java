package malinatrash.killthedebtor.services;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.ImageView;

import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReference;

public class ImageManager extends AsyncTask<String, Void, Bitmap> {
    final AtomicReference<ImageView> bmImage = new AtomicReference<ImageView>();

    public ImageManager(ImageView bmImage) {
        this.bmImage.set(bmImage);
    }

    protected Bitmap doInBackground(String... urls) {
        String urldisplay = urls[0];
        Bitmap mIcon11 = null;
        try {
            InputStream in = new java.net.URL(urldisplay).openStream();
            mIcon11 = BitmapFactory.decodeStream(in);
        } catch (Exception e) {
            Log.e("Ошибка передачи изображения", e.getMessage());
            e.printStackTrace();
        }
        return mIcon11;
    }

    protected void onPostExecute(Bitmap result) {
        bmImage.get().setImageBitmap(result);
    }
}