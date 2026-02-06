package R8;

import Ef.m;
import Y.C1510r0;
import Y.T0;
import Y.o1;
import android.graphics.ColorFilter;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import c1.t;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6531o;
import lf.C6535s;
import q0.C2427m;
import r0.C2448H;
import r0.C2450I;
import r0.C2520p0;
import r0.C2547y0;
import t0.C2605f;
import w0.C2817c;
import yf.C6787a;

public final class a extends C2817c implements T0 {

    /* renamed from: g  reason: collision with root package name */
    private final Drawable f33734g;

    /* renamed from: h  reason: collision with root package name */
    private final C1510r0 f33735h = u1.d(0, (o1) null, 2, (Object) null);

    /* renamed from: i  reason: collision with root package name */
    private final C1510r0 f33736i;

    /* renamed from: j  reason: collision with root package name */
    private final Lazy f33737j;

    /* renamed from: R8.a$a  reason: collision with other inner class name */
    public /* synthetic */ class C0548a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f33738a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                c1.t[] r0 = c1.t.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                c1.t r1 = c1.t.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                c1.t r1 = c1.t.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f33738a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: R8.a.C0548a.<clinit>():void");
        }
    }

    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f33739a;

        /* renamed from: R8.a$b$a  reason: collision with other inner class name */
        public static final class C0549a implements Drawable.Callback {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ a f33740a;

            C0549a(a aVar) {
                this.f33740a = aVar;
            }

            public void invalidateDrawable(Drawable drawable) {
                C6496s.h(drawable, "d");
                a aVar = this.f33740a;
                aVar.u(aVar.r() + 1);
                a aVar2 = this.f33740a;
                aVar2.v(b.c(aVar2.s()));
            }

            public void scheduleDrawable(Drawable drawable, Runnable runnable, long j10) {
                C6496s.h(drawable, "d");
                C6496s.h(runnable, "what");
                b.d().postAtTime(runnable, j10);
            }

            public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                C6496s.h(drawable, "d");
                C6496s.h(runnable, "what");
                b.d().removeCallbacks(runnable);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar) {
            super(0);
            this.f33739a = aVar;
        }

        /* renamed from: a */
        public final C0549a invoke() {
            return new C0549a(this.f33739a);
        }
    }

    public a(Drawable drawable) {
        C6496s.h(drawable, "drawable");
        this.f33734g = drawable;
        this.f33736i = u1.d(C2427m.c(b.c(drawable)), (o1) null, 2, (Object) null);
        this.f33737j = C6531o.b(new b(this));
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    private final Drawable.Callback q() {
        return (Drawable.Callback) this.f33737j.getValue();
    }

    /* access modifiers changed from: private */
    public final int r() {
        return ((Number) this.f33735h.getValue()).intValue();
    }

    private final long t() {
        return ((C2427m) this.f33736i.getValue()).o();
    }

    /* access modifiers changed from: private */
    public final void u(int i10) {
        this.f33735h.setValue(Integer.valueOf(i10));
    }

    /* access modifiers changed from: private */
    public final void v(long j10) {
        this.f33736i.setValue(C2427m.c(j10));
    }

    /* access modifiers changed from: protected */
    public boolean a(float f10) {
        this.f33734g.setAlpha(m.l(Af.a.d(f10 * ((float) 255)), 0, 255));
        return true;
    }

    public void b() {
        this.f33734g.setCallback(q());
        this.f33734g.setVisible(true, true);
        Drawable drawable = this.f33734g;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    public void c() {
        d();
    }

    public void d() {
        Drawable drawable = this.f33734g;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        this.f33734g.setVisible(false, false);
        this.f33734g.setCallback((Drawable.Callback) null);
    }

    /* access modifiers changed from: protected */
    public boolean e(C2547y0 y0Var) {
        ColorFilter colorFilter;
        Drawable drawable = this.f33734g;
        if (y0Var != null) {
            colorFilter = C2450I.d(y0Var);
        } else {
            colorFilter = null;
        }
        drawable.setColorFilter(colorFilter);
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean f(t tVar) {
        C6496s.h(tVar, "layoutDirection");
        Drawable drawable = this.f33734g;
        int i10 = C0548a.f33738a[tVar.ordinal()];
        int i11 = 1;
        if (i10 == 1) {
            i11 = 0;
        } else if (i10 != 2) {
            throw new C6535s();
        }
        return drawable.setLayoutDirection(i11);
    }

    public long k() {
        return t();
    }

    /* access modifiers changed from: protected */
    public void m(C2605f fVar) {
        C6496s.h(fVar, "<this>");
        C2520p0 f10 = fVar.w1().f();
        r();
        this.f33734g.setBounds(0, 0, Af.a.d(C2427m.k(fVar.d())), Af.a.d(C2427m.i(fVar.d())));
        try {
            f10.q();
            this.f33734g.draw(C2448H.d(f10));
        } finally {
            f10.h();
        }
    }

    public final Drawable s() {
        return this.f33734g;
    }
}
