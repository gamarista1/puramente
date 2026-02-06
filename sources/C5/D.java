package c5;

import T4.k;
import V4.v;
import W4.d;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import e5.i;

public class D implements k {

    /* renamed from: a  reason: collision with root package name */
    private final i f36428a;

    /* renamed from: b  reason: collision with root package name */
    private final d f36429b;

    public D(i iVar, d dVar) {
        this.f36428a = iVar;
        this.f36429b = dVar;
    }

    /* renamed from: c */
    public v b(Uri uri, int i10, int i11, T4.i iVar) {
        v c10 = this.f36428a.b(uri, i10, i11, iVar);
        if (c10 == null) {
            return null;
        }
        return t.a(this.f36429b, (Drawable) c10.get(), i10, i11);
    }

    /* renamed from: d */
    public boolean a(Uri uri, T4.i iVar) {
        return "android.resource".equals(uri.getScheme());
    }
}
