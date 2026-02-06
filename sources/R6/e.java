package r6;

import U5.a;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import j7.b;
import q6.C3954c;
import q6.g;
import q6.i;
import q6.j;
import q6.k;
import q6.l;
import q6.n;
import q6.o;
import q6.q;
import r6.C3979d;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private static final Drawable f47984a = new ColorDrawable(0);

    private static Drawable a(Drawable drawable, C3979d dVar, Resources resources) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            j jVar = new j(resources, bitmapDrawable.getBitmap(), bitmapDrawable.getPaint(), dVar.i());
            b(jVar, dVar);
            return jVar;
        } else if (drawable instanceof NinePatchDrawable) {
            n nVar = new n((NinePatchDrawable) drawable);
            b(nVar, dVar);
            return nVar;
        } else if (drawable instanceof ColorDrawable) {
            k a10 = k.a((ColorDrawable) drawable);
            b(a10, dVar);
            return a10;
        } else {
            a.K("WrappingUtils", "Don't know how to round that drawable: %s", drawable);
            return drawable;
        }
    }

    static void b(i iVar, C3979d dVar) {
        iVar.d(dVar.j());
        iVar.t(dVar.d());
        iVar.c(dVar.b(), dVar.c());
        iVar.j(dVar.g());
        iVar.p(dVar.l());
        iVar.o(dVar.h());
        iVar.m(dVar.i());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static q6.C3954c c(q6.C3954c r2) {
        /*
        L_0x0000:
            android.graphics.drawable.Drawable r0 = r2.b()
            if (r0 == r2) goto L_0x000f
            boolean r1 = r0 instanceof q6.C3954c
            if (r1 != 0) goto L_0x000b
            goto L_0x000f
        L_0x000b:
            r2 = r0
            q6.c r2 = (q6.C3954c) r2
            goto L_0x0000
        L_0x000f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.e.c(q6.c):q6.c");
    }

    static Drawable d(Drawable drawable, C3979d dVar, Resources resources) {
        try {
            if (b.d()) {
                b.a("WrappingUtils#maybeApplyLeafRounding");
            }
            if (!(drawable == null || dVar == null)) {
                if (dVar.k() == C3979d.a.BITMAP_ONLY) {
                    if (drawable instanceof g) {
                        C3954c c10 = c((g) drawable);
                        c10.i(a(c10.i(f47984a), dVar, resources));
                        if (b.d()) {
                            b.b();
                        }
                        return drawable;
                    }
                    Drawable a10 = a(drawable, dVar, resources);
                    if (b.d()) {
                        b.b();
                    }
                    return a10;
                }
            }
            return drawable;
        } finally {
            if (b.d()) {
                b.b();
            }
        }
    }

    static Drawable e(Drawable drawable, C3979d dVar) {
        try {
            if (b.d()) {
                b.a("WrappingUtils#maybeWrapWithRoundedOverlayColor");
            }
            if (!(drawable == null || dVar == null)) {
                if (dVar.k() == C3979d.a.OVERLAY_COLOR) {
                    l lVar = new l(drawable);
                    b(lVar, dVar);
                    lVar.y(dVar.f());
                    if (b.d()) {
                        b.b();
                    }
                    return lVar;
                }
            }
            return drawable;
        } finally {
            if (b.d()) {
                b.b();
            }
        }
    }

    static Drawable f(Drawable drawable, q qVar) {
        return g(drawable, qVar, (PointF) null);
    }

    static Drawable g(Drawable drawable, q qVar, PointF pointF) {
        if (b.d()) {
            b.a("WrappingUtils#maybeWrapWithScaleType");
        }
        if (drawable == null || qVar == null) {
            if (b.d()) {
                b.b();
            }
            return drawable;
        }
        o oVar = new o(drawable, qVar);
        if (pointF != null) {
            oVar.B(pointF);
        }
        if (b.d()) {
            b.b();
        }
        return oVar;
    }

    static void h(i iVar) {
        iVar.d(false);
        iVar.l(0.0f);
        iVar.c(0, 0.0f);
        iVar.j(0.0f);
        iVar.p(false);
        iVar.o(false);
        iVar.m(j.i());
    }

    static void i(C3954c cVar, C3979d dVar, Resources resources) {
        C3954c c10 = c(cVar);
        Drawable b10 = c10.b();
        if (dVar == null || dVar.k() != C3979d.a.BITMAP_ONLY) {
            if (b10 instanceof i) {
                h((i) b10);
            }
        } else if (b10 instanceof i) {
            b((i) b10, dVar);
        } else if (b10 != null) {
            c10.i(f47984a);
            c10.i(a(b10, dVar, resources));
        }
    }

    static void j(C3954c cVar, C3979d dVar) {
        Drawable b10 = cVar.b();
        if (dVar == null || dVar.k() != C3979d.a.OVERLAY_COLOR) {
            if (b10 instanceof l) {
                Drawable drawable = f47984a;
                cVar.i(((l) b10).v(drawable));
                drawable.setCallback((Drawable.Callback) null);
            }
        } else if (b10 instanceof l) {
            l lVar = (l) b10;
            b(lVar, dVar);
            lVar.y(dVar.f());
        } else {
            cVar.i(e(cVar.i(f47984a), dVar));
        }
    }

    static o k(C3954c cVar, q qVar) {
        Drawable f10 = f(cVar.i(f47984a), qVar);
        cVar.i(f10);
        T5.k.h(f10, "Parent has no child drawable!");
        return (o) f10;
    }
}
