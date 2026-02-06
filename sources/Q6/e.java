package Q6;

import P6.c;
import R6.d;
import T5.k;
import U6.d;
import W5.h;
import android.graphics.Bitmap;
import android.graphics.Rect;
import c7.C3183c;
import c7.C3185e;
import c7.C3186f;
import c7.C3189i;
import c7.m;
import java.util.ArrayList;
import java.util.List;
import l7.C3743a;

public class e implements d {

    /* renamed from: e  reason: collision with root package name */
    static c f33665e = g("com.facebook.animated.gif.GifImage");

    /* renamed from: f  reason: collision with root package name */
    static c f33666f = g("com.facebook.animated.webp.WebPImage");

    /* renamed from: a  reason: collision with root package name */
    private final R6.b f33667a;

    /* renamed from: b  reason: collision with root package name */
    private final d f33668b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f33669c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f33670d;

    public e(R6.b bVar, d dVar, boolean z10) {
        this(bVar, dVar, z10, true);
    }

    private X5.a c(int i10, int i11, Bitmap.Config config) {
        X5.a d10 = this.f33668b.d(i10, i11, config);
        ((Bitmap) d10.I()).eraseColor(0);
        ((Bitmap) d10.I()).setHasAlpha(true);
        return d10;
    }

    private X5.a d(c cVar, Bitmap.Config config, int i10) {
        X5.a c10 = c(cVar.e(), cVar.d(), config);
        new R6.d(this.f33667a.a(P6.e.b(cVar), (Rect) null), this.f33669c, new a()).h(i10, (Bitmap) c10.I());
        return c10;
    }

    private List e(c cVar, Bitmap.Config config) {
        P6.a a10 = this.f33667a.a(P6.e.b(cVar), (Rect) null);
        ArrayList arrayList = new ArrayList(a10.a());
        R6.d dVar = new R6.d(a10, this.f33669c, new b(arrayList));
        for (int i10 = 0; i10 < a10.a(); i10++) {
            X5.a c10 = c(a10.e(), a10.d(), config);
            dVar.h(i10, (Bitmap) c10.I());
            arrayList.add(c10);
        }
        return arrayList;
    }

    private C3185e f(String str, W6.d dVar, c cVar, Bitmap.Config config) {
        List list;
        int i10;
        X5.a aVar;
        X5.a aVar2 = null;
        try {
            if (dVar.f34875d) {
                i10 = cVar.a() - 1;
            } else {
                i10 = 0;
            }
            if (dVar.f34878g) {
                C3186f q02 = C3186f.q0(d(cVar, config, i10), m.f36558d, 0);
                X5.a.E((X5.a) null);
                X5.a.F((Iterable) null);
                return q02;
            }
            if (dVar.f34877f) {
                list = e(cVar, config);
                try {
                    aVar = X5.a.t((X5.a) list.get(i10));
                } catch (Throwable th2) {
                    th = th2;
                    X5.a.E(aVar2);
                    X5.a.F(list);
                    throw th;
                }
            } else {
                list = null;
                aVar = null;
            }
            try {
                if (dVar.f34874c && aVar == null) {
                    aVar = d(cVar, config, i10);
                }
                C3183c cVar2 = new C3183c(P6.e.f(cVar).k(aVar).j(i10).i(list).h((C3743a) null).l(str).a(), this.f33670d);
                X5.a.E(aVar);
                X5.a.F(list);
                return cVar2;
            } catch (Throwable th3) {
                th = th3;
                aVar2 = aVar;
                X5.a.E(aVar2);
                X5.a.F(list);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            list = null;
            X5.a.E(aVar2);
            X5.a.F(list);
            throw th;
        }
    }

    private static c g(String str) {
        try {
            return (c) Class.forName(str).newInstance();
        } catch (Throwable unused) {
            return null;
        }
    }

    public C3185e a(C3189i iVar, W6.d dVar, Bitmap.Config config) {
        c cVar;
        if (f33666f != null) {
            X5.a o10 = iVar.o();
            k.g(o10);
            try {
                h hVar = (h) o10.I();
                if (hVar.l() != null) {
                    cVar = f33666f.f(hVar.l(), dVar);
                } else {
                    cVar = f33666f.g(hVar.s(), hVar.size(), dVar);
                }
                C3185e f10 = f(iVar.Q(), dVar, cVar, config);
                X5.a.E(o10);
                return f10;
            } catch (Throwable th2) {
                X5.a.E(o10);
                throw th2;
            }
        } else {
            throw new UnsupportedOperationException("To encode animated webp please add the dependency to the animated-webp module");
        }
    }

    public C3185e b(C3189i iVar, W6.d dVar, Bitmap.Config config) {
        c cVar;
        if (f33665e != null) {
            X5.a o10 = iVar.o();
            k.g(o10);
            try {
                h hVar = (h) o10.I();
                if (hVar.l() != null) {
                    cVar = f33665e.f(hVar.l(), dVar);
                } else {
                    cVar = f33665e.g(hVar.s(), hVar.size(), dVar);
                }
                C3185e f10 = f(iVar.Q(), dVar, cVar, config);
                X5.a.E(o10);
                return f10;
            } catch (Throwable th2) {
                X5.a.E(o10);
                throw th2;
            }
        } else {
            throw new UnsupportedOperationException("To encode animated gif please add the dependency to the animated-gif module");
        }
    }

    public e(R6.b bVar, d dVar, boolean z10, boolean z11) {
        this.f33667a = bVar;
        this.f33668b = dVar;
        this.f33669c = z10;
        this.f33670d = z11;
    }

    class a implements d.b {
        a() {
        }

        public X5.a b(int i10) {
            return null;
        }

        public void a(int i10, Bitmap bitmap) {
        }
    }

    class b implements d.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List f33672a;

        b(List list) {
            this.f33672a = list;
        }

        public X5.a b(int i10) {
            return X5.a.t((X5.a) this.f33672a.get(i10));
        }

        public void a(int i10, Bitmap bitmap) {
        }
    }
}
