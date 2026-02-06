package c5;

import T4.f;
import W4.d;
import android.graphics.Bitmap;
import java.security.MessageDigest;

public class l extends C3177h {

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f36464b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(f.f34158a);

    public void b(MessageDigest messageDigest) {
        messageDigest.update(f36464b);
    }

    /* access modifiers changed from: protected */
    public Bitmap c(d dVar, Bitmap bitmap, int i10, int i11) {
        return F.c(dVar, bitmap, i10, i11);
    }

    public boolean equals(Object obj) {
        return obj instanceof l;
    }

    public int hashCode() {
        return -670243078;
    }
}
