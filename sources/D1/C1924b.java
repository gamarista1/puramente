package d1;

import androidx.collection.Z;
import c1.m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;

/* renamed from: d1.b  reason: case insensitive filesystem */
public final class C1924b {

    /* renamed from: a  reason: collision with root package name */
    public static final C1924b f19438a;

    /* renamed from: b  reason: collision with root package name */
    private static final float[] f19439b = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* renamed from: c  reason: collision with root package name */
    private static volatile Z f19440c = new Z(0, 1, (DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private static final Object[] f19441d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f19442e = 8;

    static {
        C1924b bVar = new C1924b();
        f19438a = bVar;
        boolean z10 = false;
        Object[] objArr = new Object[0];
        f19441d = objArr;
        synchronized (objArr) {
            bVar.h(f19440c, 1.15f, new C1925c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            bVar.h(f19440c, 1.3f, new C1925c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            bVar.h(f19440c, 1.5f, new C1925c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            bVar.h(f19440c, 1.8f, new C1925c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            bVar.h(f19440c, 2.0f, new C1925c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            C6514M m10 = C6514M.f71813a;
        }
        if (bVar.e(f19440c.j(0)) - 0.01f > 1.03f) {
            z10 = true;
        }
        if (!z10) {
            m.b("You should only apply non-linear scaling to font scales > 1");
        }
    }

    private C1924b() {
    }

    private final C1923a a(C1923a aVar, C1923a aVar2, float f10) {
        float[] fArr = f19439b;
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            float f11 = f19439b[i10];
            fArr2[i10] = d.f19447a.b(aVar.b(f11), aVar2.b(f11), f10);
        }
        return new C1925c(f19439b, fArr2);
    }

    private final C1923a c(float f10) {
        return (C1923a) f19440c.g(d(f10));
    }

    private final int d(float f10) {
        return (int) (f10 * 100.0f);
    }

    private final float e(int i10) {
        return ((float) i10) / 100.0f;
    }

    private final void g(float f10, C1923a aVar) {
        synchronized (f19441d) {
            Z d10 = f19440c.clone();
            f19438a.h(d10, f10, aVar);
            f19440c = d10;
            C6514M m10 = C6514M.f71813a;
        }
    }

    private final void h(Z z10, float f10, C1923a aVar) {
        z10.k(d(f10), aVar);
    }

    public final C1923a b(float f10) {
        C1923a aVar;
        if (!f(f10)) {
            return null;
        }
        C1923a c10 = f19438a.c(f10);
        if (c10 != null) {
            return c10;
        }
        int h10 = f19440c.h(d(f10));
        if (h10 >= 0) {
            return (C1923a) f19440c.p(h10);
        }
        int i10 = -(h10 + 1);
        int i11 = i10 - 1;
        float f11 = 1.0f;
        if (i10 >= f19440c.o()) {
            C1925c cVar = new C1925c(new float[]{1.0f}, new float[]{f10});
            g(f10, cVar);
            return cVar;
        }
        if (i11 < 0) {
            float[] fArr = f19439b;
            aVar = new C1925c(fArr, fArr);
        } else {
            f11 = e(f19440c.j(i11));
            aVar = (C1923a) f19440c.p(i11);
        }
        C1923a a10 = a(aVar, (C1923a) f19440c.p(i10), d.f19447a.a(0.0f, 1.0f, f11, e(f19440c.j(i10)), f10));
        g(f10, a10);
        return a10;
    }

    public final boolean f(float f10) {
        if (f10 >= 1.03f) {
            return true;
        }
        return false;
    }
}
