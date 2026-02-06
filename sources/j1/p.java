package j1;

import i1.C2062d;
import i1.C2063e;

public abstract class p implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f22680a;

    /* renamed from: b  reason: collision with root package name */
    C2063e f22681b;

    /* renamed from: c  reason: collision with root package name */
    m f22682c;

    /* renamed from: d  reason: collision with root package name */
    protected C2063e.b f22683d;

    /* renamed from: e  reason: collision with root package name */
    g f22684e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f22685f = 0;

    /* renamed from: g  reason: collision with root package name */
    boolean f22686g = false;

    /* renamed from: h  reason: collision with root package name */
    public f f22687h = new f(this);

    /* renamed from: i  reason: collision with root package name */
    public f f22688i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    protected b f22689j = b.NONE;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f22690a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                i1.d$a[] r0 = i1.C2062d.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22690a = r0
                i1.d$a r1 = i1.C2062d.a.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22690a     // Catch:{ NoSuchFieldError -> 0x001d }
                i1.d$a r1 = i1.C2062d.a.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f22690a     // Catch:{ NoSuchFieldError -> 0x0028 }
                i1.d$a r1 = i1.C2062d.a.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f22690a     // Catch:{ NoSuchFieldError -> 0x0033 }
                i1.d$a r1 = i1.C2062d.a.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f22690a     // Catch:{ NoSuchFieldError -> 0x003e }
                i1.d$a r1 = i1.C2062d.a.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j1.p.a.<clinit>():void");
        }
    }

    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(C2063e eVar) {
        this.f22681b = eVar;
    }

    private void l(int i10, int i11) {
        p pVar;
        float f10;
        int i12;
        int i13 = this.f22680a;
        if (i13 == 0) {
            this.f22684e.d(g(i11, i10));
        } else if (i13 == 1) {
            this.f22684e.d(Math.min(g(this.f22684e.f22649m, i10), i11));
        } else if (i13 == 2) {
            C2063e M10 = this.f22681b.M();
            if (M10 != null) {
                if (i10 == 0) {
                    pVar = M10.f21918e;
                } else {
                    pVar = M10.f21920f;
                }
                g gVar = pVar.f22684e;
                if (gVar.f22637j) {
                    if (i10 == 0) {
                        f10 = this.f22681b.f21866B;
                    } else {
                        f10 = this.f22681b.f21872E;
                    }
                    this.f22684e.d(g((int) ((((float) gVar.f22634g) * f10) + 0.5f), i10));
                }
            }
        } else if (i13 == 3) {
            C2063e eVar = this.f22681b;
            p pVar2 = eVar.f21918e;
            C2063e.b bVar = pVar2.f22683d;
            C2063e.b bVar2 = C2063e.b.MATCH_CONSTRAINT;
            if (bVar == bVar2 && pVar2.f22680a == 3) {
                n nVar = eVar.f21920f;
                if (nVar.f22683d == bVar2 && nVar.f22680a == 3) {
                    return;
                }
            }
            if (i10 == 0) {
                pVar2 = eVar.f21920f;
            }
            if (pVar2.f22684e.f22637j) {
                float x10 = eVar.x();
                if (i10 == 1) {
                    i12 = (int) ((((float) pVar2.f22684e.f22634g) / x10) + 0.5f);
                } else {
                    i12 = (int) ((x10 * ((float) pVar2.f22684e.f22634g)) + 0.5f);
                }
                this.f22684e.d(i12);
            }
        }
    }

    public abstract void a(d dVar);

    /* access modifiers changed from: protected */
    public final void b(f fVar, f fVar2, int i10) {
        fVar.f22639l.add(fVar2);
        fVar.f22633f = i10;
        fVar2.f22638k.add(fVar);
    }

    /* access modifiers changed from: protected */
    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f22639l.add(fVar2);
        fVar.f22639l.add(this.f22684e);
        fVar.f22635h = i10;
        fVar.f22636i = gVar;
        fVar2.f22638k.add(fVar);
        gVar.f22638k.add(fVar);
    }

    /* access modifiers changed from: package-private */
    public abstract void d();

    /* access modifiers changed from: package-private */
    public abstract void e();

    /* access modifiers changed from: package-private */
    public abstract void f();

    /* access modifiers changed from: protected */
    public final int g(int i10, int i11) {
        int i12;
        if (i11 == 0) {
            C2063e eVar = this.f22681b;
            int i13 = eVar.f21864A;
            i12 = Math.max(eVar.f21960z, i10);
            if (i13 > 0) {
                i12 = Math.min(i13, i10);
            }
            if (i12 == i10) {
                return i10;
            }
        } else {
            C2063e eVar2 = this.f22681b;
            int i14 = eVar2.f21870D;
            int max = Math.max(eVar2.f21868C, i10);
            if (i14 > 0) {
                max = Math.min(i14, i10);
            }
            if (i12 == i10) {
                return i10;
            }
        }
        return i12;
    }

    /* access modifiers changed from: protected */
    public final f h(C2062d dVar) {
        C2062d dVar2 = dVar.f21849f;
        if (dVar2 == null) {
            return null;
        }
        C2063e eVar = dVar2.f21847d;
        int i10 = a.f22690a[dVar2.f21848e.ordinal()];
        if (i10 == 1) {
            return eVar.f21918e.f22687h;
        }
        if (i10 == 2) {
            return eVar.f21918e.f22688i;
        }
        if (i10 == 3) {
            return eVar.f21920f.f22687h;
        }
        if (i10 == 4) {
            return eVar.f21920f.f22663k;
        }
        if (i10 != 5) {
            return null;
        }
        return eVar.f21920f.f22688i;
    }

    /* access modifiers changed from: protected */
    public final f i(C2062d dVar, int i10) {
        p pVar;
        C2062d dVar2 = dVar.f21849f;
        if (dVar2 == null) {
            return null;
        }
        C2063e eVar = dVar2.f21847d;
        if (i10 == 0) {
            pVar = eVar.f21918e;
        } else {
            pVar = eVar.f21920f;
        }
        int i11 = a.f22690a[dVar2.f21848e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f22688i;
        }
        return pVar.f22687h;
    }

    public long j() {
        g gVar = this.f22684e;
        if (gVar.f22637j) {
            return (long) gVar.f22634g;
        }
        return 0;
    }

    public boolean k() {
        return this.f22686g;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean m();

    /* access modifiers changed from: protected */
    public void n(d dVar, C2062d dVar2, C2062d dVar3, int i10) {
        float f10;
        f h10 = h(dVar2);
        f h11 = h(dVar3);
        if (h10.f22637j && h11.f22637j) {
            int f11 = h10.f22634g + dVar2.f();
            int f12 = h11.f22634g - dVar3.f();
            int i11 = f12 - f11;
            if (!this.f22684e.f22637j && this.f22683d == C2063e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f22684e;
            if (gVar.f22637j) {
                if (gVar.f22634g == i11) {
                    this.f22687h.d(f11);
                    this.f22688i.d(f12);
                    return;
                }
                if (i10 == 0) {
                    f10 = this.f22681b.A();
                } else {
                    f10 = this.f22681b.T();
                }
                if (h10 == h11) {
                    f11 = h10.f22634g;
                    f12 = h11.f22634g;
                    f10 = 0.5f;
                }
                this.f22687h.d((int) (((float) f11) + 0.5f + (((float) ((f12 - f11) - this.f22684e.f22634g)) * f10)));
                this.f22688i.d(this.f22687h.f22634g + this.f22684e.f22634g);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void o(d dVar) {
    }

    /* access modifiers changed from: protected */
    public void p(d dVar) {
    }
}
