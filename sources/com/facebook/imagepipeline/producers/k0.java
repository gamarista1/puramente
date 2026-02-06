package com.facebook.imagepipeline.producers;

import T5.k;
import W5.i;
import W6.g;
import W6.h;
import b6.e;
import c7.C3189i;
import com.facebook.imagepipeline.producers.G;
import i7.C3593b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import k7.C3675b;
import k7.c;
import k7.d;

public class k0 implements d0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Executor f39988a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final i f39989b;

    /* renamed from: c  reason: collision with root package name */
    private final d0 f39990c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f39991d;

    /* renamed from: e  reason: collision with root package name */
    private final d f39992e;

    private class a extends C3313t {
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final boolean f39993c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final d f39994d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final e0 f39995e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public boolean f39996f = false;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public final G f39997g;

        /* renamed from: com.facebook.imagepipeline.producers.k0$a$a  reason: collision with other inner class name */
        class C0632a implements G.d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k0 f39999a;

            C0632a(k0 k0Var) {
                this.f39999a = k0Var;
            }

            public void a(C3189i iVar, int i10) {
                if (iVar != null) {
                    a aVar = a.this;
                    aVar.w(iVar, i10, (c) k.g(aVar.f39994d.createImageTranscoder(iVar.y(), a.this.f39993c)));
                    return;
                }
                a.this.p().c((Object) null, i10);
            }
        }

        class b extends C3300f {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ k0 f40001a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C3308n f40002b;

            b(k0 k0Var, C3308n nVar) {
                this.f40001a = k0Var;
                this.f40002b = nVar;
            }

            public void a() {
                if (a.this.f39995e.E()) {
                    a.this.f39997g.h();
                }
            }

            public void b() {
                a.this.f39997g.c();
                a.this.f39996f = true;
                this.f40002b.b();
            }
        }

        a(C3308n nVar, e0 e0Var, boolean z10, d dVar) {
            super(nVar);
            this.f39995e = e0Var;
            Boolean s10 = e0Var.F().s();
            this.f39993c = s10 != null ? s10.booleanValue() : z10;
            this.f39994d = dVar;
            this.f39997g = new G(k0.this.f39988a, new C0632a(k0.this), 100);
            e0Var.b(new b(k0.this, nVar));
        }

        private C3189i A(C3189i iVar) {
            h t10 = this.f39995e.F().t();
            if (t10.h() || !t10.g()) {
                return iVar;
            }
            return y(iVar, t10.f());
        }

        private C3189i B(C3189i iVar) {
            if (this.f39995e.F().t().d() || iVar.M0() == 0 || iVar.M0() == -1) {
                return iVar;
            }
            return y(iVar, 0);
        }

        /* access modifiers changed from: private */
        public void w(C3189i iVar, int i10, c cVar) {
            X5.a U10;
            C3189i iVar2;
            this.f39995e.y().d(this.f39995e, "ResizeAndRotateProducer");
            C3593b F10 = this.f39995e.F();
            W5.k c10 = k0.this.f39989b.c();
            Map map = null;
            try {
                C3675b c11 = cVar.c(iVar, c10, F10.t(), F10.r(), (O6.c) null, 85, iVar.t());
                if (c11.a() != 2) {
                    map = z(iVar, F10.r(), c11, cVar.a());
                    U10 = X5.a.U(c10.a());
                    iVar2 = new C3189i(U10);
                    iVar2.L0(O6.b.f33373b);
                    iVar2.j0();
                    this.f39995e.y().j(this.f39995e, "ResizeAndRotateProducer", map);
                    if (c11.a() != 1) {
                        i10 |= 16;
                    }
                    p().c(iVar2, i10);
                    C3189i.f(iVar2);
                    X5.a.E(U10);
                    c10.close();
                    return;
                }
                throw new RuntimeException("Error while transcoding the image");
            } catch (Exception e10) {
                this.f39995e.y().k(this.f39995e, "ResizeAndRotateProducer", e10, map);
                if (C3297c.e(i10)) {
                    p().a(e10);
                }
                c10.close();
            } catch (Throwable th2) {
                c10.close();
                throw th2;
            }
        }

        private void x(C3189i iVar, int i10, O6.c cVar) {
            C3189i iVar2;
            if (cVar == O6.b.f33373b || cVar == O6.b.f33383l) {
                iVar2 = B(iVar);
            } else {
                iVar2 = A(iVar);
            }
            p().c(iVar2, i10);
        }

        private C3189i y(C3189i iVar, int i10) {
            C3189i b10 = C3189i.b(iVar);
            if (b10 != null) {
                b10.P0(i10);
            }
            return b10;
        }

        private Map z(C3189i iVar, g gVar, C3675b bVar, String str) {
            String str2;
            if (!this.f39995e.y().f(this.f39995e, "ResizeAndRotateProducer")) {
                return null;
            }
            String str3 = iVar.e() + "x" + iVar.d();
            if (gVar != null) {
                str2 = gVar.f34903a + "x" + gVar.f34904b;
            } else {
                str2 = "Unspecified";
            }
            HashMap hashMap = new HashMap();
            hashMap.put("Image format", String.valueOf(iVar.y()));
            hashMap.put("Original size", str3);
            hashMap.put("Requested size", str2);
            hashMap.put("queueTime", String.valueOf(this.f39997g.f()));
            hashMap.put("Transcoder id", str);
            hashMap.put("Transcoding result", String.valueOf(bVar));
            return T5.g.a(hashMap);
        }

        /* access modifiers changed from: protected */
        /* renamed from: C */
        public void i(C3189i iVar, int i10) {
            if (!this.f39996f) {
                boolean e10 = C3297c.e(i10);
                if (iVar != null) {
                    O6.c y10 = iVar.y();
                    e e11 = k0.h(this.f39995e.F(), iVar, (c) k.g(this.f39994d.createImageTranscoder(y10, this.f39993c)));
                    if (!e10 && e11 == e.UNSET) {
                        return;
                    }
                    if (e11 != e.YES) {
                        x(iVar, i10, y10);
                    } else if (this.f39997g.k(iVar, i10)) {
                        if (e10 || this.f39995e.E()) {
                            this.f39997g.h();
                        }
                    }
                } else if (e10) {
                    p().c((Object) null, 1);
                }
            }
        }
    }

    public k0(Executor executor, i iVar, d0 d0Var, boolean z10, d dVar) {
        this.f39988a = (Executor) k.g(executor);
        this.f39989b = (i) k.g(iVar);
        this.f39990c = (d0) k.g(d0Var);
        this.f39992e = (d) k.g(dVar);
        this.f39991d = z10;
    }

    private static boolean f(h hVar, C3189i iVar) {
        if (hVar.d() || (k7.e.e(hVar, iVar) == 0 && !g(hVar, iVar))) {
            return false;
        }
        return true;
    }

    private static boolean g(h hVar, C3189i iVar) {
        if (hVar.g() && !hVar.d()) {
            return k7.e.f45157b.contains(Integer.valueOf(iVar.y0()));
        }
        iVar.E0(0);
        return false;
    }

    /* access modifiers changed from: private */
    public static e h(C3593b bVar, C3189i iVar, c cVar) {
        boolean z10;
        if (iVar == null || iVar.y() == O6.c.f33387d) {
            return e.UNSET;
        }
        if (!cVar.d(iVar.y())) {
            return e.NO;
        }
        if (f(bVar.t(), iVar) || cVar.b(iVar, bVar.t(), bVar.r())) {
            z10 = true;
        } else {
            z10 = false;
        }
        return e.c(z10);
    }

    public void b(C3308n nVar, e0 e0Var) {
        this.f39990c.b(new a(nVar, e0Var, this.f39991d, this.f39992e), e0Var);
    }
}
