package androidx.media3.exoplayer.image;

import android.graphics.Bitmap;

public interface ImageOutput {

    /* renamed from: a  reason: collision with root package name */
    public static final ImageOutput f17717a = new a();

    class a implements ImageOutput {
        a() {
        }

        public void a() {
        }

        public void onImageAvailable(long j10, Bitmap bitmap) {
        }
    }

    void a();

    void onImageAvailable(long j10, Bitmap bitmap);
}
