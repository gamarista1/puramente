package l5;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class g {
    public k a(ImageView imageView, Class cls) {
        if (Bitmap.class.equals(cls)) {
            return new C3740b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new e(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
