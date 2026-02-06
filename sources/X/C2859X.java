package x;

import android.view.View;
import android.widget.Magnifier;
import c1.d;
import c1.s;
import q0.C2421g;

/* renamed from: x.X  reason: case insensitive filesystem */
public final class C2859X implements C2858W {

    /* renamed from: b  reason: collision with root package name */
    public static final C2859X f27895b = new C2859X();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f27896c = false;

    /* renamed from: x.X$a */
    public static class a implements C2857V {

        /* renamed from: a  reason: collision with root package name */
        private final Magnifier f27897a;

        public a(Magnifier magnifier) {
            this.f27897a = magnifier;
        }

        public void a(long j10, long j11, float f10) {
            this.f27897a.show(C2421g.m(j10), C2421g.n(j10));
        }

        public long b() {
            return s.a(this.f27897a.getWidth(), this.f27897a.getHeight());
        }

        public void c() {
            this.f27897a.update();
        }

        public final Magnifier d() {
            return this.f27897a;
        }

        public void dismiss() {
            this.f27897a.dismiss();
        }
    }

    private C2859X() {
    }

    public boolean b() {
        return f27896c;
    }

    /* renamed from: c */
    public a a(View view, boolean z10, long j10, float f10, float f11, boolean z11, d dVar, float f12) {
        return new a(new Magnifier(view));
    }
}
