package c5;

import T4.f;
import W4.d;
import android.graphics.Bitmap;
import java.security.MessageDigest;

public class k extends C3177h {

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f36463b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(f.f34158a);

    public void b(MessageDigest messageDigest) {
        messageDigest.update(f36463b);
    }

    /* access modifiers changed from: protected */
    public Bitmap c(d dVar, Bitmap bitmap, int i10, int i11) {
        return F.b(dVar, bitmap, i10, i11);
    }

    public boolean equals(Object obj) {
        return obj instanceof k;
    }

    public int hashCode() {
        return -599754482;
    }
}
