package j6;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import b7.C3158a;
import c7.C3185e;
import c7.C3186f;
import j7.b;
import q6.h;

/* renamed from: j6.a  reason: case insensitive filesystem */
public class C3641a implements C3158a {

    /* renamed from: a  reason: collision with root package name */
    private final Resources f44800a;

    /* renamed from: b  reason: collision with root package name */
    private final C3158a f44801b;

    public C3641a(Resources resources, C3158a aVar) {
        this.f44800a = resources;
        this.f44801b = aVar;
    }

    private static boolean c(C3186f fVar) {
        if (fVar.y0() == 1 || fVar.y0() == 0) {
            return false;
        }
        return true;
    }

    private static boolean d(C3186f fVar) {
        if (fVar.M0() == 0 || fVar.M0() == -1) {
            return false;
        }
        return true;
    }

    public Drawable a(C3185e eVar) {
        try {
            if (b.d()) {
                b.a("DefaultDrawableFactory#createDrawable");
            }
            if (eVar instanceof C3186f) {
                C3186f fVar = (C3186f) eVar;
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f44800a, fVar.h1());
                if (d(fVar) || c(fVar)) {
                    h hVar = new h(bitmapDrawable, fVar.M0(), fVar.y0());
                    if (b.d()) {
                        b.b();
                    }
                    return hVar;
                }
                if (b.d()) {
                    b.b();
                }
                return bitmapDrawable;
            }
            C3158a aVar = this.f44801b;
            if (aVar != null && aVar.b(eVar)) {
                Drawable a10 = this.f44801b.a(eVar);
                if (b.d()) {
                    b.b();
                }
                return a10;
            } else if (!b.d()) {
                return null;
            } else {
                b.b();
                return null;
            }
        } catch (Throwable th2) {
            if (b.d()) {
                b.b();
            }
            throw th2;
        }
    }

    public boolean b(C3185e eVar) {
        return true;
    }
}
