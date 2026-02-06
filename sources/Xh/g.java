package xh;

import java.util.List;
import kotlin.jvm.internal.C6496s;
import rh.C;
import rh.C6708e;
import rh.E;
import rh.w;
import wh.C6773c;
import wh.C6775e;

public final class g implements w.a {

    /* renamed from: a  reason: collision with root package name */
    private final C6775e f73883a;

    /* renamed from: b  reason: collision with root package name */
    private final List f73884b;

    /* renamed from: c  reason: collision with root package name */
    private final int f73885c;

    /* renamed from: d  reason: collision with root package name */
    private final C6773c f73886d;

    /* renamed from: e  reason: collision with root package name */
    private final C f73887e;

    /* renamed from: f  reason: collision with root package name */
    private final int f73888f;

    /* renamed from: g  reason: collision with root package name */
    private final int f73889g;

    /* renamed from: h  reason: collision with root package name */
    private final int f73890h;

    /* renamed from: i  reason: collision with root package name */
    private int f73891i;

    public g(C6775e eVar, List list, int i10, C6773c cVar, C c10, int i11, int i12, int i13) {
        C6496s.h(eVar, "call");
        C6496s.h(list, "interceptors");
        C6496s.h(c10, "request");
        this.f73883a = eVar;
        this.f73884b = list;
        this.f73885c = i10;
        this.f73886d = cVar;
        this.f73887e = c10;
        this.f73888f = i11;
        this.f73889g = i12;
        this.f73890h = i13;
    }

    public static /* synthetic */ g c(g gVar, int i10, C6773c cVar, C c10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = gVar.f73885c;
        }
        if ((i14 & 2) != 0) {
            cVar = gVar.f73886d;
        }
        C6773c cVar2 = cVar;
        if ((i14 & 4) != 0) {
            c10 = gVar.f73887e;
        }
        C c11 = c10;
        if ((i14 & 8) != 0) {
            i11 = gVar.f73888f;
        }
        int i15 = i11;
        if ((i14 & 16) != 0) {
            i12 = gVar.f73889g;
        }
        int i16 = i12;
        if ((i14 & 32) != 0) {
            i13 = gVar.f73890h;
        }
        return gVar.b(i10, cVar2, c11, i15, i16, i13);
    }

    public E a(C c10) {
        C6496s.h(c10, "request");
        if (this.f73885c < this.f73884b.size()) {
            this.f73891i++;
            C6773c cVar = this.f73886d;
            if (cVar != null) {
                if (!cVar.j().g(c10.l())) {
                    throw new IllegalStateException(("network interceptor " + this.f73884b.get(this.f73885c - 1) + " must retain the same host and port").toString());
                } else if (this.f73891i != 1) {
                    throw new IllegalStateException(("network interceptor " + this.f73884b.get(this.f73885c - 1) + " must call proceed() exactly once").toString());
                }
            }
            g c11 = c(this, this.f73885c + 1, (C6773c) null, c10, 0, 0, 0, 58, (Object) null);
            w wVar = (w) this.f73884b.get(this.f73885c);
            E intercept = wVar.intercept(c11);
            if (intercept == null) {
                throw new NullPointerException("interceptor " + wVar + " returned null");
            } else if (this.f73886d != null && this.f73885c + 1 < this.f73884b.size() && c11.f73891i != 1) {
                throw new IllegalStateException(("network interceptor " + wVar + " must call proceed() exactly once").toString());
            } else if (intercept.a() != null) {
                return intercept;
            } else {
                throw new IllegalStateException(("interceptor " + wVar + " returned a response with no body").toString());
            }
        } else {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final g b(int i10, C6773c cVar, C c10, int i11, int i12, int i13) {
        C6496s.h(c10, "request");
        return new g(this.f73883a, this.f73884b, i10, cVar, c10, i11, i12, i13);
    }

    public C6708e call() {
        return this.f73883a;
    }

    public final C6775e d() {
        return this.f73883a;
    }

    public final int e() {
        return this.f73888f;
    }

    public final C6773c f() {
        return this.f73886d;
    }

    public final int g() {
        return this.f73889g;
    }

    public final C h() {
        return this.f73887e;
    }

    public final int i() {
        return this.f73890h;
    }

    public int j() {
        return this.f73889g;
    }

    public C request() {
        return this.f73887e;
    }
}
