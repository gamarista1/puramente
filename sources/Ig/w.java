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

public final class w extends C6647i implements q {

    /* renamed from: f  reason: collision with root package name */
    private static final w f68445f;

    /* renamed from: g  reason: collision with root package name */
    public static r f68446g = new a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C6642d f68447b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public List f68448c;

    /* renamed from: d  reason: collision with root package name */
    private byte f68449d;

    /* renamed from: e  reason: collision with root package name */
    private int f68450e;

    static class a extends C6640b {
        a() {
        }

        /* renamed from: j */
        public w b(C6643e eVar, C6645g gVar) {
            return new w(eVar, gVar);
        }
    }

    static {
        w wVar = new w(true);
        f68445f = wVar;
        wVar.x();
    }

    public static w u() {
        return f68445f;
    }

    private void x() {
        this.f68448c = Collections.emptyList();
    }

    public static b y() {
        return b.r();
    }

    public static b z(w wVar) {
        return y().k(wVar);
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
        int i10 = this.f68450e;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f68448c.size(); i12++) {
            i11 += C6644f.r(1, (p) this.f68448c.get(i12));
        }
        int size = i11 + this.f68447b.size();
        this.f68450e = size;
        return size;
    }

    public final boolean e() {
        byte b10 = this.f68449d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f68449d = 1;
        return true;
    }

    public void h(C6644f fVar) {
        a();
        for (int i10 = 0; i10 < this.f68448c.size(); i10++) {
            fVar.c0(1, (p) this.f68448c.get(i10));
        }
        fVar.h0(this.f68447b);
    }

    public int v() {
        return this.f68448c.size();
    }

    public List w() {
        return this.f68448c;
    }

    private w(C6647i.b bVar) {
        super(bVar);
        this.f68449d = -1;
        this.f68450e = -1;
        this.f68447b = bVar.j();
    }

    private w(boolean z10) {
        this.f68449d = -1;
        this.f68450e = -1;
        this.f68447b = C6642d.f72492a;
    }

    private w(C6643e eVar, C6645g gVar) {
        this.f68449d = -1;
        this.f68450e = -1;
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
                            this.f68448c = new ArrayList();
                            z11 = true;
                        }
                        this.f68448c.add(eVar.t(v.f68415m, gVar));
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
                    this.f68448c = Collections.unmodifiableList(this.f68448c);
                }
                try {
                    I10.H();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f68447b = x10.n();
                    throw th3;
                }
                this.f68447b = x10.n();
                m();
                throw th2;
            }
        }
        if (z11) {
            this.f68448c = Collections.unmodifiableList(this.f68448c);
        }
        try {
            I10.H();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f68447b = x10.n();
            throw th4;
        }
        this.f68447b = x10.n();
        m();
    }

    public static final class b extends C6647i.b implements q {

        /* renamed from: b  reason: collision with root package name */
        private int f68451b;

        /* renamed from: c  reason: collision with root package name */
        private List f68452c = Collections.emptyList();

        private b() {
            t();
        }

        /* access modifiers changed from: private */
        public static b r() {
            return new b();
        }

        private void s() {
            if ((this.f68451b & 1) != 1) {
                this.f68452c = new ArrayList(this.f68452c);
                this.f68451b |= 1;
            }
        }

        /* renamed from: o */
        public w f() {
            w p10 = p();
            if (p10.e()) {
                return p10;
            }
            throw C6639a.C1046a.i(p10);
        }

        public w p() {
            w wVar = new w((C6647i.b) this);
            if ((this.f68451b & 1) == 1) {
                this.f68452c = Collections.unmodifiableList(this.f68452c);
                this.f68451b &= -2;
            }
            List unused = wVar.f68448c = this.f68452c;
            return wVar;
        }

        /* renamed from: q */
        public b clone() {
            return r().k(p());
        }

        /* renamed from: u */
        public b k(w wVar) {
            if (wVar == w.u()) {
                return this;
            }
            if (!wVar.f68448c.isEmpty()) {
                if (this.f68452c.isEmpty()) {
                    this.f68452c = wVar.f68448c;
                    this.f68451b &= -2;
                } else {
                    s();
                    this.f68452c.addAll(wVar.f68448c);
                }
            }
            l(j().b(wVar.f68447b));
            return this;
        }

        /* renamed from: w */
        public b h0(C6643e eVar, C6645g gVar) {
            w wVar;
            w wVar2 = null;
            try {
                w wVar3 = (w) w.f68446g.b(eVar, gVar);
                if (wVar3 != null) {
                    k(wVar3);
                }
                return this;
            } catch (C6649k e10) {
                wVar = (w) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                wVar2 = wVar;
            }
            if (wVar2 != null) {
                k(wVar2);
            }
            throw th;
        }

        private void t() {
        }
    }
}
