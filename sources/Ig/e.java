package ig;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import pg.C6639a;
import pg.C6640b;
import pg.C6642d;
import pg.C6643e;
import pg.C6644f;
import pg.C6645g;
import pg.C6647i;
import pg.C6649k;
import pg.p;
import pg.q;
import pg.r;

public final class e extends C6647i implements q {

    /* renamed from: f  reason: collision with root package name */
    private static final e f68054f;

    /* renamed from: g  reason: collision with root package name */
    public static r f68055g = new a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C6642d f68056b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public List f68057c;

    /* renamed from: d  reason: collision with root package name */
    private byte f68058d;

    /* renamed from: e  reason: collision with root package name */
    private int f68059e;

    static class a extends C6640b {
        a() {
        }

        /* renamed from: j */
        public e b(C6643e eVar, C6645g gVar) {
            return new e(eVar, gVar);
        }
    }

    static {
        e eVar = new e(true);
        f68054f = eVar;
        eVar.x();
    }

    public static e u() {
        return f68054f;
    }

    private void x() {
        this.f68057c = Collections.emptyList();
    }

    public static b y() {
        return b.r();
    }

    public static b z(e eVar) {
        return y().k(eVar);
    }

    /* renamed from: A */
    public b c() {
        return y();
    }

    /* renamed from: B */
    public b g() {
        return z(this);
    }

    public int a() {
        int i10 = this.f68059e;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f68057c.size(); i12++) {
            i11 += C6644f.r(1, (p) this.f68057c.get(i12));
        }
        int size = i11 + this.f68056b.size();
        this.f68059e = size;
        return size;
    }

    public final boolean e() {
        byte b10 = this.f68058d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < w(); i10++) {
            if (!v(i10).e()) {
                this.f68058d = 0;
                return false;
            }
        }
        this.f68058d = 1;
        return true;
    }

    public void h(C6644f fVar) {
        a();
        for (int i10 = 0; i10 < this.f68057c.size(); i10++) {
            fVar.c0(1, (p) this.f68057c.get(i10));
        }
        fVar.h0(this.f68056b);
    }

    public f v(int i10) {
        return (f) this.f68057c.get(i10);
    }

    public int w() {
        return this.f68057c.size();
    }

    private e(C6647i.b bVar) {
        super(bVar);
        this.f68058d = -1;
        this.f68059e = -1;
        this.f68056b = bVar.j();
    }

    private e(boolean z10) {
        this.f68058d = -1;
        this.f68059e = -1;
        this.f68056b = C6642d.f72492a;
    }

    private e(C6643e eVar, C6645g gVar) {
        this.f68058d = -1;
        this.f68059e = -1;
        x();
        C6642d.b x10 = C6642d.x();
        C6644f I10 = C6644f.I(x10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                int J10 = eVar.J();
                if (J10 != 0) {
                    if (J10 == 10) {
                        if (!z11) {
                            this.f68057c = new ArrayList();
                            z11 = true;
                        }
                        this.f68057c.add(eVar.t(f.f68063k, gVar));
                    } else if (p(eVar, I10, gVar, J10)) {
                    }
                }
                z10 = true;
            } catch (C6649k e10) {
                throw e10.i(this);
            } catch (IOException e11) {
                throw new C6649k(e11.getMessage()).i(this);
            } catch (Throwable th2) {
                if (z11) {
                    this.f68057c = Collections.unmodifiableList(this.f68057c);
                }
                try {
                    I10.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f68056b = x10.n();
                    throw th3;
                }
                this.f68056b = x10.n();
                m();
                throw th2;
            }
        }
        if (z11) {
            this.f68057c = Collections.unmodifiableList(this.f68057c);
        }
        try {
            I10.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f68056b = x10.n();
            throw th4;
        }
        this.f68056b = x10.n();
        m();
    }

    public static final class b extends C6647i.b implements q {

        /* renamed from: b  reason: collision with root package name */
        private int f68060b;

        /* renamed from: c  reason: collision with root package name */
        private List f68061c = Collections.emptyList();

        private b() {
            t();
        }

        /* access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        private void s() {
            if ((this.f68060b & 1) != 1) {
                this.f68061c = new ArrayList(this.f68061c);
                this.f68060b |= 1;
            }
        }

        /* renamed from: o */
        public e f() {
            e p10 = p();
            if (p10.e()) {
                return p10;
            }
            throw C6639a.C1046a.i(p10);
        }

        public e p() {
            e eVar = new e((C6647i.b) this);
            if ((this.f68060b & 1) == 1) {
                this.f68061c = Collections.unmodifiableList(this.f68061c);
                this.f68060b &= -2;
            }
            List unused = eVar.f68057c = this.f68061c;
            return eVar;
        }

        /* renamed from: q */
        public b clone() {
            return r().k(p());
        }

        /* renamed from: u */
        public b k(e eVar) {
            if (eVar == e.u()) {
                return this;
            }
            if (!eVar.f68057c.isEmpty()) {
                if (this.f68061c.isEmpty()) {
                    this.f68061c = eVar.f68057c;
                    this.f68060b &= -2;
                } else {
                    s();
                    this.f68061c.addAll(eVar.f68057c);
                }
            }
            l(j().b(eVar.f68056b));
            return this;
        }

        /* renamed from: w */
        public b h0(C6643e eVar, C6645g gVar) {
            e eVar2;
            e eVar3 = null;
            try {
                e eVar4 = (e) e.f68055g.b(eVar, gVar);
                if (eVar4 != null) {
                    k(eVar4);
                }
                return this;
            } catch (C6649k e10) {
                eVar2 = (e) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                eVar3 = eVar2;
            }
            if (eVar3 != null) {
                k(eVar3);
            }
            throw th;
        }

        private void t() {
        }
    }
}
