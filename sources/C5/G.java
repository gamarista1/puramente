package c5;

import T4.i;
import T4.k;
import V4.v;
import android.graphics.Bitmap;
import o5.l;

public final class G implements k {
    /* renamed from: c */
    public v b(Bitmap bitmap, int i10, int i11, i iVar) {
        return new a(bitmap);
    }

    /* renamed from: d */
    public boolean a(Bitmap bitmap, i iVar) {
        return true;
    }

    private static final class a implements v {

        /* renamed from: a  reason: collision with root package name */
        private final Bitmap f36439a;

        a(Bitmap bitmap) {
            this.f36439a = bitmap;
        }

        public Class a() {
            return Bitmap.class;
        }

        /* renamed from: b */
        public Bitmap get() {
            return this.f36439a;
        }

        public int getSize() {
            return l.i(this.f36439a);
        }

        public void recycle() {
        }
    }
}
