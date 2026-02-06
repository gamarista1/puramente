package f7;

import android.graphics.Bitmap;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m7.C3783c;

public class j extends u {

    /* renamed from: c  reason: collision with root package name */
    public static final a f43443c = new a((DefaultConstructorMarker) null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* renamed from: e */
    public Bitmap get(int i10) {
        Bitmap bitmap = (Bitmap) super.get(i10);
        if (bitmap == null || !g(bitmap)) {
            return null;
        }
        bitmap.eraseColor(0);
        return bitmap;
    }

    /* renamed from: f */
    public int a(Bitmap bitmap) {
        C6496s.h(bitmap, "bitmap");
        return C3783c.j(bitmap);
    }

    /* access modifiers changed from: protected */
    public final boolean g(Bitmap bitmap) {
        if (bitmap == null) {
            return false;
        }
        if (bitmap.isRecycled()) {
            U5.a.O("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", bitmap);
            return false;
        } else if (bitmap.isMutable()) {
            return true;
        } else {
            U5.a.O("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", bitmap);
            return false;
        }
    }

    /* renamed from: h */
    public void c(Bitmap bitmap) {
        C6496s.h(bitmap, "bitmap");
        if (g(bitmap)) {
            super.c(bitmap);
        }
    }
}
