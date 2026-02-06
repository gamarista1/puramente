package g5;

import T4.m;
import V4.v;
import android.content.Context;
import android.graphics.Bitmap;
import c5.C3176g;
import com.bumptech.glide.c;
import java.security.MessageDigest;
import o5.k;

/* renamed from: g5.f  reason: case insensitive filesystem */
public class C3533f implements m {

    /* renamed from: b  reason: collision with root package name */
    private final m f43625b;

    public C3533f(m mVar) {
        this.f43625b = (m) k.d(mVar);
    }

    public v a(Context context, v vVar, int i10, int i11) {
        C3530c cVar = (C3530c) vVar.get();
        C3176g gVar = new C3176g(cVar.e(), c.e(context).h());
        v a10 = this.f43625b.a(context, gVar, i10, i11);
        if (!gVar.equals(a10)) {
            gVar.recycle();
        }
        cVar.m(this.f43625b, (Bitmap) a10.get());
        return vVar;
    }

    public void b(MessageDigest messageDigest) {
        this.f43625b.b(messageDigest);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3533f) {
            return this.f43625b.equals(((C3533f) obj).f43625b);
        }
        return false;
    }

    public int hashCode() {
        return this.f43625b.hashCode();
    }
}
