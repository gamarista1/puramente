package x;

import android.view.View;
import android.widget.Magnifier;
import c1.d;
import q0.C2421g;
import q0.C2422h;
import q0.C2427m;
import x.C2859X;

/* renamed from: x.Y  reason: case insensitive filesystem */
public final class C2860Y implements C2858W {

    /* renamed from: b  reason: collision with root package name */
    public static final C2860Y f27898b = new C2860Y();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f27899c = true;

    /* renamed from: x.Y$a */
    public static final class a extends C2859X.a {
        public a(Magnifier magnifier) {
            super(magnifier);
        }

        public void a(long j10, long j11, float f10) {
            if (!Float.isNaN(f10)) {
                d().setZoom(f10);
            }
            if (C2422h.c(j11)) {
                d().show(C2421g.m(j10), C2421g.n(j10), C2421g.m(j11), C2421g.n(j11));
            } else {
                d().show(C2421g.m(j10), C2421g.n(j10));
            }
        }
    }

    private C2860Y() {
    }

    public boolean b() {
        return f27899c;
    }

    /* renamed from: c */
    public a a(View view, boolean z10, long j10, float f10, float f11, boolean z11, d dVar, float f12) {
        if (z10) {
            return new a(new Magnifier(view));
        }
        long B12 = dVar.B1(j10);
        float t12 = dVar.t1(f10);
        float t13 = dVar.t1(f11);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (B12 != 9205357640488583168L) {
            builder.setSize(Af.a.d(C2427m.k(B12)), Af.a.d(C2427m.i(B12)));
        }
        if (!Float.isNaN(t12)) {
            builder.setCornerRadius(t12);
        }
        if (!Float.isNaN(t13)) {
            builder.setElevation(t13);
        }
        if (!Float.isNaN(f12)) {
            builder.setInitialZoom(f12);
        }
        builder.setClippingEnabled(z11);
        return new a(builder.build());
    }
}
