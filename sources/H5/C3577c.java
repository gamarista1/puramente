package h5;

import T4.i;
import V4.v;
import W4.d;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import c5.C3176g;
import g5.C3530c;

/* renamed from: h5.c  reason: case insensitive filesystem */
public final class C3577c implements C3579e {

    /* renamed from: a  reason: collision with root package name */
    private final d f44005a;

    /* renamed from: b  reason: collision with root package name */
    private final C3579e f44006b;

    /* renamed from: c  reason: collision with root package name */
    private final C3579e f44007c;

    public C3577c(d dVar, C3579e eVar, C3579e eVar2) {
        this.f44005a = dVar;
        this.f44006b = eVar;
        this.f44007c = eVar2;
    }

    public v a(v vVar, i iVar) {
        Drawable drawable = (Drawable) vVar.get();
        if (drawable instanceof BitmapDrawable) {
            return this.f44006b.a(C3176g.c(((BitmapDrawable) drawable).getBitmap(), this.f44005a), iVar);
        }
        if (drawable instanceof C3530c) {
            return this.f44007c.a(b(vVar), iVar);
        }
        return null;
    }

    private static v b(v vVar) {
        return vVar;
    }
}
