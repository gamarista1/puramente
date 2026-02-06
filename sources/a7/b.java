package a7;

import O6.c;
import O6.e;
import T5.k;
import T5.n;
import T5.o;
import android.graphics.ColorSpace;
import android.graphics.Rect;
import c7.C3185e;
import c7.C3186f;
import c7.C3189i;
import c7.m;
import g7.d;
import java.io.InputStream;
import java.util.Map;
import l7.C3743a;
import l7.C3744b;

public class b implements c {

    /* renamed from: a  reason: collision with root package name */
    private final c f36124a;

    /* renamed from: b  reason: collision with root package name */
    private final c f36125b;

    /* renamed from: c  reason: collision with root package name */
    private final d f36126c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final n f36127d;

    /* renamed from: e  reason: collision with root package name */
    private final c f36128e;

    /* renamed from: f  reason: collision with root package name */
    private final Map f36129f;

    class a implements c {
        a() {
        }

        public C3185e a(C3189i iVar, int i10, c7.n nVar, W6.d dVar) {
            ColorSpace colorSpace;
            c y10 = iVar.y();
            if (((Boolean) b.this.f36127d.get()).booleanValue()) {
                colorSpace = dVar.f34882k;
                if (colorSpace == null) {
                    colorSpace = iVar.t();
                }
            } else {
                colorSpace = dVar.f34882k;
            }
            ColorSpace colorSpace2 = colorSpace;
            if (y10 == O6.b.f33373b) {
                return b.this.e(iVar, i10, nVar, dVar, colorSpace2);
            }
            if (y10 == O6.b.f33375d) {
                return b.this.d(iVar, i10, nVar, dVar);
            }
            if (y10 == O6.b.f33382k) {
                return b.this.c(iVar, i10, nVar, dVar);
            }
            if (y10 != c.f33387d) {
                return b.this.f(iVar, dVar);
            }
            throw new C3139a("unknown image format", iVar);
        }
    }

    public b(c cVar, c cVar2, d dVar) {
        this(cVar, cVar2, dVar, (Map) null);
    }

    public C3185e a(C3189i iVar, int i10, c7.n nVar, W6.d dVar) {
        c cVar;
        InputStream E10;
        c cVar2 = dVar.f34881j;
        if (cVar2 != null) {
            return cVar2.a(iVar, i10, nVar, dVar);
        }
        c y10 = iVar.y();
        if ((y10 == null || y10 == c.f33387d) && (E10 = iVar.E()) != null) {
            y10 = e.d(E10);
            iVar.L0(y10);
        }
        Map map = this.f36129f;
        if (map == null || (cVar = (c) map.get(y10)) == null) {
            return this.f36128e.a(iVar, i10, nVar, dVar);
        }
        return cVar.a(iVar, i10, nVar, dVar);
    }

    public C3185e c(C3189i iVar, int i10, c7.n nVar, W6.d dVar) {
        c cVar;
        if (dVar.f34878g || (cVar = this.f36125b) == null) {
            return f(iVar, dVar);
        }
        return cVar.a(iVar, i10, nVar, dVar);
    }

    public C3185e d(C3189i iVar, int i10, c7.n nVar, W6.d dVar) {
        c cVar;
        if (iVar.e() == -1 || iVar.d() == -1) {
            throw new C3139a("image width or height is incorrect", iVar);
        } else if (dVar.f34878g || (cVar = this.f36124a) == null) {
            return f(iVar, dVar);
        } else {
            return cVar.a(iVar, i10, nVar, dVar);
        }
    }

    public C3186f e(C3189i iVar, int i10, c7.n nVar, W6.d dVar, ColorSpace colorSpace) {
        X5.a a10 = this.f36126c.a(iVar, dVar.f34879h, (Rect) null, i10, colorSpace);
        try {
            C3744b.a((C3743a) null, a10);
            k.g(a10);
            C3186f l12 = C3186f.l1(a10, nVar, iVar.M0(), iVar.y0());
            l12.t("is_rounded", false);
            return l12;
        } finally {
            X5.a.E(a10);
        }
    }

    public C3186f f(C3189i iVar, W6.d dVar) {
        X5.a b10 = this.f36126c.b(iVar, dVar.f34879h, (Rect) null, dVar.f34882k);
        try {
            C3744b.a((C3743a) null, b10);
            k.g(b10);
            C3186f l12 = C3186f.l1(b10, m.f36558d, iVar.M0(), iVar.y0());
            l12.t("is_rounded", false);
            return l12;
        } finally {
            X5.a.E(b10);
        }
    }

    public b(c cVar, c cVar2, d dVar, Map map) {
        this.f36128e = new a();
        this.f36124a = cVar;
        this.f36125b = cVar2;
        this.f36126c = dVar;
        this.f36129f = map;
        this.f36127d = o.f34179b;
    }
}
