package j1;

import i1.C2062d;
import i1.C2063e;
import i1.C2067i;
import j1.f;
import j1.p;

public class n extends p {

    /* renamed from: k  reason: collision with root package name */
    public f f22663k;

    /* renamed from: l  reason: collision with root package name */
    g f22664l = null;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f22665a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                j1.p$b[] r0 = j1.p.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f22665a = r0
                j1.p$b r1 = j1.p.b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f22665a     // Catch:{ NoSuchFieldError -> 0x001d }
                j1.p$b r1 = j1.p.b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f22665a     // Catch:{ NoSuchFieldError -> 0x0028 }
                j1.p$b r1 = j1.p.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: j1.n.a.<clinit>():void");
        }
    }

    public n(C2063e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f22663k = fVar;
        this.f22687h.f22632e = f.a.TOP;
        this.f22688i.f22632e = f.a.BOTTOM;
        fVar.f22632e = f.a.BASELINE;
        this.f22685f = 1;
    }

    public void a(d dVar) {
        int i10;
        float f10;
        float x10;
        float f11;
        int i11 = a.f22665a[this.f22689j.ordinal()];
        if (i11 == 1) {
            p(dVar);
        } else if (i11 == 2) {
            o(dVar);
        } else if (i11 == 3) {
            C2063e eVar = this.f22681b;
            n(dVar, eVar.f21898R, eVar.f21902T, 1);
            return;
        }
        g gVar = this.f22684e;
        if (gVar.f22630c && !gVar.f22637j && this.f22683d == C2063e.b.MATCH_CONSTRAINT) {
            C2063e eVar2 = this.f22681b;
            int i12 = eVar2.f21956x;
            if (i12 == 2) {
                C2063e M10 = eVar2.M();
                if (M10 != null) {
                    g gVar2 = M10.f21920f.f22684e;
                    if (gVar2.f22637j) {
                        this.f22684e.d((int) ((((float) gVar2.f22634g) * this.f22681b.f21872E) + 0.5f));
                    }
                }
            } else if (i12 == 3 && eVar2.f21918e.f22684e.f22637j) {
                int y10 = eVar2.y();
                if (y10 == -1) {
                    C2063e eVar3 = this.f22681b;
                    f10 = (float) eVar3.f21918e.f22684e.f22634g;
                    x10 = eVar3.x();
                } else if (y10 == 0) {
                    C2063e eVar4 = this.f22681b;
                    f11 = ((float) eVar4.f21918e.f22684e.f22634g) * eVar4.x();
                    i10 = (int) (f11 + 0.5f);
                    this.f22684e.d(i10);
                } else if (y10 != 1) {
                    i10 = 0;
                    this.f22684e.d(i10);
                } else {
                    C2063e eVar5 = this.f22681b;
                    f10 = (float) eVar5.f21918e.f22684e.f22634g;
                    x10 = eVar5.x();
                }
                f11 = f10 / x10;
                i10 = (int) (f11 + 0.5f);
                this.f22684e.d(i10);
            }
        }
        f fVar = this.f22687h;
        if (fVar.f22630c) {
            f fVar2 = this.f22688i;
            if (fVar2.f22630c) {
                if (!fVar.f22637j || !fVar2.f22637j || !this.f22684e.f22637j) {
                    if (!this.f22684e.f22637j && this.f22683d == C2063e.b.MATCH_CONSTRAINT) {
                        C2063e eVar6 = this.f22681b;
                        if (eVar6.f21954w == 0 && !eVar6.m0()) {
                            int i13 = ((f) this.f22687h.f22639l.get(0)).f22634g;
                            f fVar3 = this.f22687h;
                            int i14 = i13 + fVar3.f22633f;
                            int i15 = ((f) this.f22688i.f22639l.get(0)).f22634g + this.f22688i.f22633f;
                            fVar3.d(i14);
                            this.f22688i.d(i15);
                            this.f22684e.d(i15 - i14);
                            return;
                        }
                    }
                    if (!this.f22684e.f22637j && this.f22683d == C2063e.b.MATCH_CONSTRAINT && this.f22680a == 1 && this.f22687h.f22639l.size() > 0 && this.f22688i.f22639l.size() > 0) {
                        int i16 = (((f) this.f22688i.f22639l.get(0)).f22634g + this.f22688i.f22633f) - (((f) this.f22687h.f22639l.get(0)).f22634g + this.f22687h.f22633f);
                        g gVar3 = this.f22684e;
                        int i17 = gVar3.f22649m;
                        if (i16 < i17) {
                            gVar3.d(i16);
                        } else {
                            gVar3.d(i17);
                        }
                    }
                    if (this.f22684e.f22637j && this.f22687h.f22639l.size() > 0 && this.f22688i.f22639l.size() > 0) {
                        f fVar4 = (f) this.f22687h.f22639l.get(0);
                        f fVar5 = (f) this.f22688i.f22639l.get(0);
                        int i18 = fVar4.f22634g + this.f22687h.f22633f;
                        int i19 = fVar5.f22634g + this.f22688i.f22633f;
                        float T10 = this.f22681b.T();
                        if (fVar4 == fVar5) {
                            i18 = fVar4.f22634g;
                            i19 = fVar5.f22634g;
                            T10 = 0.5f;
                        }
                        this.f22687h.d((int) (((float) i18) + 0.5f + (((float) ((i19 - i18) - this.f22684e.f22634g)) * T10)));
                        this.f22688i.d(this.f22687h.f22634g + this.f22684e.f22634g);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d() {
        C2063e M10;
        C2063e M11;
        C2063e eVar = this.f22681b;
        if (eVar.f21910a) {
            this.f22684e.d(eVar.z());
        }
        if (!this.f22684e.f22637j) {
            this.f22683d = this.f22681b.V();
            if (this.f22681b.b0()) {
                this.f22664l = new C2120a(this);
            }
            C2063e.b bVar = this.f22683d;
            if (bVar != C2063e.b.MATCH_CONSTRAINT) {
                if (bVar == C2063e.b.MATCH_PARENT && (M11 = this.f22681b.M()) != null && M11.V() == C2063e.b.FIXED) {
                    int z10 = (M11.z() - this.f22681b.f21898R.f()) - this.f22681b.f21902T.f();
                    b(this.f22687h, M11.f21920f.f22687h, this.f22681b.f21898R.f());
                    b(this.f22688i, M11.f21920f.f22688i, -this.f22681b.f21902T.f());
                    this.f22684e.d(z10);
                    return;
                } else if (this.f22683d == C2063e.b.FIXED) {
                    this.f22684e.d(this.f22681b.z());
                }
            }
        } else if (this.f22683d == C2063e.b.MATCH_PARENT && (M10 = this.f22681b.M()) != null && M10.V() == C2063e.b.FIXED) {
            b(this.f22687h, M10.f21920f.f22687h, this.f22681b.f21898R.f());
            b(this.f22688i, M10.f21920f.f22688i, -this.f22681b.f21902T.f());
            return;
        }
        g gVar = this.f22684e;
        boolean z11 = gVar.f22637j;
        if (z11) {
            C2063e eVar2 = this.f22681b;
            if (eVar2.f21910a) {
                C2062d[] dVarArr = eVar2.f21908Y;
                C2062d dVar = dVarArr[2];
                C2062d dVar2 = dVar.f21849f;
                if (dVar2 != null && dVarArr[3].f21849f != null) {
                    if (eVar2.m0()) {
                        this.f22687h.f22633f = this.f22681b.f21908Y[2].f();
                        this.f22688i.f22633f = -this.f22681b.f21908Y[3].f();
                    } else {
                        f h10 = h(this.f22681b.f21908Y[2]);
                        if (h10 != null) {
                            b(this.f22687h, h10, this.f22681b.f21908Y[2].f());
                        }
                        f h11 = h(this.f22681b.f21908Y[3]);
                        if (h11 != null) {
                            b(this.f22688i, h11, -this.f22681b.f21908Y[3].f());
                        }
                        this.f22687h.f22629b = true;
                        this.f22688i.f22629b = true;
                    }
                    if (this.f22681b.b0()) {
                        b(this.f22663k, this.f22687h, this.f22681b.r());
                        return;
                    }
                    return;
                } else if (dVar2 != null) {
                    f h12 = h(dVar);
                    if (h12 != null) {
                        b(this.f22687h, h12, this.f22681b.f21908Y[2].f());
                        b(this.f22688i, this.f22687h, this.f22684e.f22634g);
                        if (this.f22681b.b0()) {
                            b(this.f22663k, this.f22687h, this.f22681b.r());
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    C2062d dVar3 = dVarArr[3];
                    if (dVar3.f21849f != null) {
                        f h13 = h(dVar3);
                        if (h13 != null) {
                            b(this.f22688i, h13, -this.f22681b.f21908Y[3].f());
                            b(this.f22687h, this.f22688i, -this.f22684e.f22634g);
                        }
                        if (this.f22681b.b0()) {
                            b(this.f22663k, this.f22687h, this.f22681b.r());
                            return;
                        }
                        return;
                    }
                    C2062d dVar4 = dVarArr[4];
                    if (dVar4.f21849f != null) {
                        f h14 = h(dVar4);
                        if (h14 != null) {
                            b(this.f22663k, h14, 0);
                            b(this.f22687h, this.f22663k, -this.f22681b.r());
                            b(this.f22688i, this.f22687h, this.f22684e.f22634g);
                            return;
                        }
                        return;
                    } else if (!(eVar2 instanceof C2067i) && eVar2.M() != null && this.f22681b.q(C2062d.a.CENTER).f21849f == null) {
                        b(this.f22687h, this.f22681b.M().f21920f.f22687h, this.f22681b.a0());
                        b(this.f22688i, this.f22687h, this.f22684e.f22634g);
                        if (this.f22681b.b0()) {
                            b(this.f22663k, this.f22687h, this.f22681b.r());
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
        if (z11 || this.f22683d != C2063e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            C2063e eVar3 = this.f22681b;
            int i10 = eVar3.f21956x;
            if (i10 == 2) {
                C2063e M12 = eVar3.M();
                if (M12 != null) {
                    g gVar2 = M12.f21920f.f22684e;
                    this.f22684e.f22639l.add(gVar2);
                    gVar2.f22638k.add(this.f22684e);
                    g gVar3 = this.f22684e;
                    gVar3.f22629b = true;
                    gVar3.f22638k.add(this.f22687h);
                    this.f22684e.f22638k.add(this.f22688i);
                }
            } else if (i10 == 3 && !eVar3.m0()) {
                C2063e eVar4 = this.f22681b;
                if (eVar4.f21954w != 3) {
                    g gVar4 = eVar4.f21918e.f22684e;
                    this.f22684e.f22639l.add(gVar4);
                    gVar4.f22638k.add(this.f22684e);
                    g gVar5 = this.f22684e;
                    gVar5.f22629b = true;
                    gVar5.f22638k.add(this.f22687h);
                    this.f22684e.f22638k.add(this.f22688i);
                }
            }
        }
        C2063e eVar5 = this.f22681b;
        C2062d[] dVarArr2 = eVar5.f21908Y;
        C2062d dVar5 = dVarArr2[2];
        C2062d dVar6 = dVar5.f21849f;
        if (dVar6 != null && dVarArr2[3].f21849f != null) {
            if (eVar5.m0()) {
                this.f22687h.f22633f = this.f22681b.f21908Y[2].f();
                this.f22688i.f22633f = -this.f22681b.f21908Y[3].f();
            } else {
                f h15 = h(this.f22681b.f21908Y[2]);
                f h16 = h(this.f22681b.f21908Y[3]);
                if (h15 != null) {
                    h15.b(this);
                }
                if (h16 != null) {
                    h16.b(this);
                }
                this.f22689j = p.b.CENTER;
            }
            if (this.f22681b.b0()) {
                c(this.f22663k, this.f22687h, 1, this.f22664l);
            }
        } else if (dVar6 != null) {
            f h17 = h(dVar5);
            if (h17 != null) {
                b(this.f22687h, h17, this.f22681b.f21908Y[2].f());
                c(this.f22688i, this.f22687h, 1, this.f22684e);
                if (this.f22681b.b0()) {
                    c(this.f22663k, this.f22687h, 1, this.f22664l);
                }
                C2063e.b bVar2 = this.f22683d;
                C2063e.b bVar3 = C2063e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f22681b.x() > 0.0f) {
                    l lVar = this.f22681b.f21918e;
                    if (lVar.f22683d == bVar3) {
                        lVar.f22684e.f22638k.add(this.f22684e);
                        this.f22684e.f22639l.add(this.f22681b.f21918e.f22684e);
                        this.f22684e.f22628a = this;
                    }
                }
            }
        } else {
            C2062d dVar7 = dVarArr2[3];
            if (dVar7.f21849f != null) {
                f h18 = h(dVar7);
                if (h18 != null) {
                    b(this.f22688i, h18, -this.f22681b.f21908Y[3].f());
                    c(this.f22687h, this.f22688i, -1, this.f22684e);
                    if (this.f22681b.b0()) {
                        c(this.f22663k, this.f22687h, 1, this.f22664l);
                    }
                }
            } else {
                C2062d dVar8 = dVarArr2[4];
                if (dVar8.f21849f != null) {
                    f h19 = h(dVar8);
                    if (h19 != null) {
                        b(this.f22663k, h19, 0);
                        c(this.f22687h, this.f22663k, -1, this.f22664l);
                        c(this.f22688i, this.f22687h, 1, this.f22684e);
                    }
                } else if (!(eVar5 instanceof C2067i) && eVar5.M() != null) {
                    b(this.f22687h, this.f22681b.M().f21920f.f22687h, this.f22681b.a0());
                    c(this.f22688i, this.f22687h, 1, this.f22684e);
                    if (this.f22681b.b0()) {
                        c(this.f22663k, this.f22687h, 1, this.f22664l);
                    }
                    C2063e.b bVar4 = this.f22683d;
                    C2063e.b bVar5 = C2063e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f22681b.x() > 0.0f) {
                        l lVar2 = this.f22681b.f21918e;
                        if (lVar2.f22683d == bVar5) {
                            lVar2.f22684e.f22638k.add(this.f22684e);
                            this.f22684e.f22639l.add(this.f22681b.f21918e.f22684e);
                            this.f22684e.f22628a = this;
                        }
                    }
                }
            }
        }
        if (this.f22684e.f22639l.size() == 0) {
            this.f22684e.f22630c = true;
        }
    }

    public void e() {
        f fVar = this.f22687h;
        if (fVar.f22637j) {
            this.f22681b.s1(fVar.f22634g);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f22682c = null;
        this.f22687h.c();
        this.f22688i.c();
        this.f22663k.c();
        this.f22684e.c();
        this.f22686g = false;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        if (this.f22683d != C2063e.b.MATCH_CONSTRAINT || this.f22681b.f21956x == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void q() {
        this.f22686g = false;
        this.f22687h.c();
        this.f22687h.f22637j = false;
        this.f22688i.c();
        this.f22688i.f22637j = false;
        this.f22663k.c();
        this.f22663k.f22637j = false;
        this.f22684e.f22637j = false;
    }

    public String toString() {
        return "VerticalRun " + this.f22681b.v();
    }
}
