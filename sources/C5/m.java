package c5;

import T4.f;
import W4.d;
import android.graphics.Bitmap;
import java.security.MessageDigest;

public class m extends C3177h {

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f36465b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(f.f34158a);

    public void b(MessageDigest messageDigest) {
        messageDigest.update(f36465b);
    }

    /* access modifiers changed from: protected */
    public Bitmap c(d dVar, Bitmap bitmap, int i10, int i11) {
        return F.d(dVar, bitmap, i10, i11);
    }

    public boolean equals(Object obj) {
        return obj instanceof m;
    }

    public int hashCode() {
        return 1101716364;
    }
}
