package androidx.compose.foundation.lazy.layout;

import E.C1150t;
import E.N;
import E.O;
import E.P;
import E.Q;
import E.r;
import H0.e0;
import J0.A0;
import J0.B0;
import android.os.Trace;
import androidx.compose.foundation.lazy.layout.d;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6565s;
import yf.C6798l;

public final class h {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final r f13053a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final e0 f13054b;

    /* renamed from: c  reason: collision with root package name */
    private final Q f13055c;

    private final class a implements d.b, O {

        /* renamed from: a  reason: collision with root package name */
        private final int f13056a;

        /* renamed from: b  reason: collision with root package name */
        private final long f13057b;

        /* renamed from: c  reason: collision with root package name */
        private final N f13058c;

        /* renamed from: d  reason: collision with root package name */
        private e0.a f13059d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f13060e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public boolean f13061f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f13062g;

        /* renamed from: h  reason: collision with root package name */
        private C0245a f13063h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f13064i;

        /* renamed from: androidx.compose.foundation.lazy.layout.h$a$a  reason: collision with other inner class name */
        private final class C0245a {

            /* renamed from: a  reason: collision with root package name */
            private final List f13066a;

            /* renamed from: b  reason: collision with root package name */
            private final List[] f13067b;

            /* renamed from: c  reason: collision with root package name */
            private int f13068c;

            /* renamed from: d  reason: collision with root package name */
            private int f13069d;

            public C0245a(List list) {
                this.f13066a = list;
                this.f13067b = new List[list.size()];
                if (list.isEmpty()) {
                    throw new IllegalArgumentException("NestedPrefetchController shouldn't be created with no states");
                }
            }

            public final boolean a(P p10) {
                if (this.f13068c >= this.f13066a.size()) {
                    return false;
                }
                if (!a.this.f13061f) {
                    Trace.beginSection("compose:lazy:prefetch:nested");
                    while (this.f13068c < this.f13066a.size()) {
                        try {
                            if (this.f13067b[this.f13068c] == null) {
                                if (p10.a() <= 0) {
                                    Trace.endSection();
                                    return true;
                                }
                                List[] listArr = this.f13067b;
                                int i10 = this.f13068c;
                                listArr[i10] = ((d) this.f13066a.get(i10)).b();
                            }
                            List list = this.f13067b[this.f13068c];
                            C6496s.e(list);
                            while (this.f13069d < list.size()) {
                                if (((O) list.get(this.f13069d)).b(p10)) {
                                    Trace.endSection();
                                    return true;
                                }
                                this.f13069d++;
                            }
                            this.f13069d = 0;
                            this.f13068c++;
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                    C6514M m10 = C6514M.f71813a;
                    Trace.endSection();
                    return false;
                }
                throw new IllegalStateException("Should not execute nested prefetch on canceled request");
            }
        }

        static final class b extends C6498u implements C6798l {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.N f13071a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(kotlin.jvm.internal.N n10) {
                super(1);
                this.f13071a = n10;
            }

            /* renamed from: a */
            public final A0 invoke(B0 b02) {
                C6496s.f(b02, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                d l22 = ((i) b02).l2();
                kotlin.jvm.internal.N n10 = this.f13071a;
                List list = (List) n10.f71759a;
                if (list != null) {
                    list.add(l22);
                } else {
                    list = C6565s.t(l22);
                }
                n10.f71759a = list;
                return A0.SkipSubtreeAndContinueTraversal;
            }
        }

        public /* synthetic */ a(h hVar, int i10, long j10, N n10, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, j10, n10);
        }

        private final boolean d() {
            if (this.f13059d != null) {
                return true;
            }
            return false;
        }

        private final boolean e() {
            if (!this.f13061f) {
                int a10 = ((C1150t) h.this.f13053a.d().invoke()).a();
                int i10 = this.f13056a;
                if (i10 < 0 || i10 >= a10) {
                    return false;
                }
                return true;
            }
            return false;
        }

        private final void f() {
            if (!e()) {
                throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performComposition()");
            } else if (this.f13059d == null) {
                C1150t tVar = (C1150t) h.this.f13053a.d().invoke();
                Object d10 = tVar.d(this.f13056a);
                this.f13059d = h.this.f13054b.i(d10, h.this.f13053a.b(this.f13056a, d10, tVar.f(this.f13056a)));
            } else {
                throw new IllegalArgumentException("Request was already composed!");
            }
        }

        private final void g(long j10) {
            if (this.f13061f) {
                throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()");
            } else if (!this.f13060e) {
                this.f13060e = true;
                e0.a aVar = this.f13059d;
                if (aVar != null) {
                    int d10 = aVar.d();
                    for (int i10 = 0; i10 < d10; i10++) {
                        aVar.b(i10, j10);
                    }
                    return;
                }
                throw new IllegalArgumentException("performComposition() must be called before performMeasure()");
            } else {
                throw new IllegalArgumentException("Request was already measured!");
            }
        }

        private final C0245a h() {
            e0.a aVar = this.f13059d;
            if (aVar != null) {
                kotlin.jvm.internal.N n10 = new kotlin.jvm.internal.N();
                aVar.a("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", new b(n10));
                List list = (List) n10.f71759a;
                if (list != null) {
                    return new C0245a(list);
                }
                return null;
            }
            throw new IllegalArgumentException("Should precompose before resolving nested prefetch states");
        }

        private final boolean i(P p10, long j10) {
            long a10 = p10.a();
            if ((!this.f13064i || a10 <= 0) && j10 >= a10) {
                return false;
            }
            return true;
        }

        public void a() {
            this.f13064i = true;
        }

        /* JADX INFO: finally extract failed */
        public boolean b(P p10) {
            long j10;
            boolean z10;
            long j11;
            if (!e()) {
                return false;
            }
            Object f10 = ((C1150t) h.this.f13053a.d().invoke()).f(this.f13056a);
            if (!d()) {
                if (f10 == null || !this.f13058c.f().a(f10)) {
                    j11 = this.f13058c.e();
                } else {
                    j11 = this.f13058c.f().c(f10);
                }
                if (!i(p10, j11)) {
                    return true;
                }
                N n10 = this.f13058c;
                long nanoTime = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:compose");
                try {
                    f();
                    C6514M m10 = C6514M.f71813a;
                    Trace.endSection();
                    long nanoTime2 = System.nanoTime() - nanoTime;
                    if (f10 != null) {
                        n10.f().p(f10, n10.d(nanoTime2, n10.f().e(f10, 0)));
                    }
                    n10.f1589c = n10.d(nanoTime2, n10.e());
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            if (!this.f13064i) {
                if (!this.f13062g) {
                    if (p10.a() <= 0) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        this.f13063h = h();
                        this.f13062g = true;
                        C6514M m11 = C6514M.f71813a;
                    } finally {
                        Trace.endSection();
                    }
                }
                C0245a aVar = this.f13063h;
                if (aVar != null) {
                    z10 = aVar.a(p10);
                } else {
                    z10 = false;
                }
                if (z10) {
                    return true;
                }
            }
            if (!this.f13060e && !c1.b.p(this.f13057b)) {
                if (f10 == null || !this.f13058c.h().a(f10)) {
                    j10 = this.f13058c.g();
                } else {
                    j10 = this.f13058c.h().c(f10);
                }
                if (!i(p10, j10)) {
                    return true;
                }
                N n11 = this.f13058c;
                long nanoTime3 = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:measure");
                try {
                    g(this.f13057b);
                    C6514M m12 = C6514M.f71813a;
                    Trace.endSection();
                    long nanoTime4 = System.nanoTime() - nanoTime3;
                    if (f10 != null) {
                        n11.h().p(f10, n11.d(nanoTime4, n11.h().e(f10, 0)));
                    }
                    n11.f1590d = n11.d(nanoTime4, n11.g());
                } catch (Throwable th3) {
                    Trace.endSection();
                    throw th3;
                }
            }
            return false;
        }

        public void cancel() {
            if (!this.f13061f) {
                this.f13061f = true;
                e0.a aVar = this.f13059d;
                if (aVar != null) {
                    aVar.dispose();
                }
                this.f13059d = null;
            }
        }

        public String toString() {
            return "HandleAndRequestImpl { index = " + this.f13056a + ", constraints = " + c1.b.q(this.f13057b) + ", isComposed = " + d() + ", isMeasured = " + this.f13060e + ", isCanceled = " + this.f13061f + " }";
        }

        private a(int i10, long j10, N n10) {
            this.f13056a = i10;
            this.f13057b = j10;
            this.f13058c = n10;
        }
    }

    public h(r rVar, e0 e0Var, Q q10) {
        this.f13053a = rVar;
        this.f13054b = e0Var;
        this.f13055c = q10;
    }

    public final O c(int i10, long j10, N n10) {
        return new a(this, i10, j10, n10, (DefaultConstructorMarker) null);
    }

    public final d.b d(int i10, long j10, N n10) {
        a aVar = new a(this, i10, j10, n10, (DefaultConstructorMarker) null);
        this.f13055c.a(aVar);
        return aVar;
    }
}
