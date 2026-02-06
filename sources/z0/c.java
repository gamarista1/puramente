package Z0;

import Q0.C;
import Q0.C1321d;
import Q0.C1322e;
import Q0.T;
import Q0.z;
import T0.b;
import T0.e;
import T0.f;
import T0.g;
import T0.l;
import T0.m;
import V0.h;
import V0.n;
import V0.o;
import V0.p;
import a1.C1540a;
import a1.C1541b;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import b1.C1869a;
import b1.C1876h;
import b1.k;
import c1.d;
import c1.v;
import c1.w;
import c1.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import mf.C6559l;
import q0.C2421g;
import r0.C2514n0;
import r0.C2550z0;
import r0.c2;
import r0.e2;
import r0.h2;
import t0.C2606g;
import yf.q;
import yf.r;

public abstract class c {

    static final class a extends C6498u implements q {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Spannable f10384a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f10385b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Spannable spannable, r rVar) {
            super(3);
            this.f10384a = spannable;
            this.f10385b = rVar;
        }

        public final void a(C c10, int i10, int i11) {
            int i12;
            int i13;
            Spannable spannable = this.f10384a;
            r rVar = this.f10385b;
            h i14 = c10.i();
            p n10 = c10.n();
            if (n10 == null) {
                n10 = p.f8210b.c();
            }
            n l10 = c10.l();
            if (l10 != null) {
                i12 = l10.i();
            } else {
                i12 = n.f8200b.b();
            }
            n c11 = n.c(i12);
            o m10 = c10.m();
            if (m10 != null) {
                i13 = m10.k();
            } else {
                i13 = o.f8204b.a();
            }
            spannable.setSpan(new T0.o((Typeface) rVar.invoke(i14, n10, c11, o.e(i13))), i10, i11, 33);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            return C6514M.f71813a;
        }
    }

    private static final MetricAffectingSpan a(long j10, d dVar) {
        long g10 = v.g(j10);
        x.a aVar = x.f19246b;
        if (x.g(g10, aVar.b())) {
            return new f(dVar.N0(j10));
        }
        if (x.g(g10, aVar.a())) {
            return new e(v.h(j10));
        }
        return null;
    }

    public static final void b(C c10, List list, q qVar) {
        if (list.size() > 1) {
            int size = list.size();
            int i10 = size * 2;
            Integer[] numArr = new Integer[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                numArr[i11] = 0;
            }
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                C1321d.c cVar = (C1321d.c) list.get(i12);
                numArr[i12] = Integer.valueOf(cVar.h());
                numArr[i12 + size] = Integer.valueOf(cVar.f());
            }
            C6559l.K((Comparable[]) numArr);
            int intValue = ((Number) C6559l.b0(numArr)).intValue();
            for (int i13 = 0; i13 < i10; i13++) {
                Integer num = numArr[i13];
                int intValue2 = num.intValue();
                if (intValue2 != intValue) {
                    int size3 = list.size();
                    C c11 = c10;
                    for (int i14 = 0; i14 < size3; i14++) {
                        C1321d.c cVar2 = (C1321d.c) list.get(i14);
                        if (cVar2.h() != cVar2.f() && C1322e.l(intValue, intValue2, cVar2.h(), cVar2.f())) {
                            c11 = f(c11, (C) cVar2.g());
                        }
                    }
                    if (c11 != null) {
                        qVar.invoke(c11, Integer.valueOf(intValue), num);
                    }
                    intValue = intValue2;
                }
            }
        } else if (!list.isEmpty()) {
            qVar.invoke(f(c10, (C) ((C1321d.c) list.get(0)).g()), Integer.valueOf(((C1321d.c) list.get(0)).h()), Integer.valueOf(((C1321d.c) list.get(0)).f()));
        }
    }

    private static final boolean c(C c10) {
        long g10 = v.g(c10.o());
        x.a aVar = x.f19246b;
        if (x.g(g10, aVar.b()) || x.g(v.g(c10.o()), aVar.a())) {
            return true;
        }
        return false;
    }

    private static final boolean d(T t10) {
        if (d.d(t10.N()) || t10.n() != null) {
            return true;
        }
        return false;
    }

    private static final boolean e(d dVar) {
        if (((double) dVar.r1()) > 1.05d) {
            return true;
        }
        return false;
    }

    private static final C f(C c10, C c11) {
        if (c10 == null) {
            return c11;
        }
        return c10.y(c11);
    }

    private static final float g(long j10, float f10, d dVar) {
        float h10;
        long g10 = v.g(j10);
        x.a aVar = x.f19246b;
        if (x.g(g10, aVar.b())) {
            if (!e(dVar)) {
                return dVar.N0(j10);
            }
            h10 = v.h(j10) / v.h(dVar.g0(f10));
        } else if (!x.g(g10, aVar.a())) {
            return Float.NaN;
        } else {
            h10 = v.h(j10);
        }
        return h10 * f10;
    }

    public static final void h(Spannable spannable, long j10, int i10, int i11) {
        if (j10 != 16) {
            u(spannable, new BackgroundColorSpan(C2550z0.k(j10)), i10, i11);
        }
    }

    private static final void i(Spannable spannable, C1869a aVar, int i10, int i11) {
        if (aVar != null) {
            u(spannable, new T0.a(aVar.h()), i10, i11);
        }
    }

    private static final void j(Spannable spannable, C2514n0 n0Var, float f10, int i10, int i11) {
        if (n0Var == null) {
            return;
        }
        if (n0Var instanceof h2) {
            k(spannable, ((h2) n0Var).b(), i10, i11);
        } else if (n0Var instanceof c2) {
            u(spannable, new C1541b((c2) n0Var, f10), i10, i11);
        }
    }

    public static final void k(Spannable spannable, long j10, int i10, int i11) {
        if (j10 != 16) {
            u(spannable, new ForegroundColorSpan(C2550z0.k(j10)), i10, i11);
        }
    }

    private static final void l(Spannable spannable, C2606g gVar, int i10, int i11) {
        if (gVar != null) {
            u(spannable, new C1540a(gVar), i10, i11);
        }
    }

    private static final void m(Spannable spannable, T t10, List list, r rVar) {
        C c10;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            C1321d.c cVar = (C1321d.c) obj;
            if (d.d((C) cVar.g()) || ((C) cVar.g()).m() != null) {
                arrayList.add(obj);
            }
        }
        if (d(t10)) {
            c10 = new C(0, 0, t10.o(), t10.m(), t10.n(), t10.j(), (String) null, 0, (C1869a) null, (b1.o) null, (X0.e) null, 0, (k) null, (e2) null, (z) null, (C2606g) null, 65475, (DefaultConstructorMarker) null);
        } else {
            c10 = null;
        }
        b(c10, arrayList, new a(spannable, rVar));
    }

    private static final void n(Spannable spannable, String str, int i10, int i11) {
        if (str != null) {
            u(spannable, new b(str), i10, i11);
        }
    }

    public static final void o(Spannable spannable, long j10, d dVar, int i10, int i11) {
        long g10 = v.g(j10);
        x.a aVar = x.f19246b;
        if (x.g(g10, aVar.b())) {
            u(spannable, new AbsoluteSizeSpan(Af.a.d(dVar.N0(j10)), false), i10, i11);
        } else if (x.g(g10, aVar.a())) {
            u(spannable, new RelativeSizeSpan(v.h(j10)), i10, i11);
        }
    }

    private static final void p(Spannable spannable, b1.o oVar, int i10, int i11) {
        if (oVar != null) {
            u(spannable, new ScaleXSpan(oVar.b()), i10, i11);
            u(spannable, new m(oVar.c()), i10, i11);
        }
    }

    public static final void q(Spannable spannable, long j10, float f10, d dVar, C1876h hVar) {
        int i10;
        float g10 = g(j10, f10, dVar);
        if (!Float.isNaN(g10)) {
            if (spannable.length() == 0 || Sg.p.k1(spannable) == 10) {
                i10 = spannable.length() + 1;
            } else {
                i10 = spannable.length();
            }
            u(spannable, new T0.h(g10, 0, i10, C1876h.c.f(hVar.c()), C1876h.c.g(hVar.c()), hVar.b()), 0, spannable.length());
        }
    }

    public static final void r(Spannable spannable, long j10, float f10, d dVar) {
        float g10 = g(j10, f10, dVar);
        if (!Float.isNaN(g10)) {
            u(spannable, new g(g10), 0, spannable.length());
        }
    }

    public static final void s(Spannable spannable, X0.e eVar, int i10, int i11) {
        if (eVar != null) {
            u(spannable, a.f10383a.a(eVar), i10, i11);
        }
    }

    private static final void t(Spannable spannable, e2 e2Var, int i10, int i11) {
        if (e2Var != null) {
            u(spannable, new l(C2550z0.k(e2Var.c()), C2421g.m(e2Var.d()), C2421g.n(e2Var.d()), d.b(e2Var.b())), i10, i11);
        }
    }

    public static final void u(Spannable spannable, Object obj, int i10, int i11) {
        spannable.setSpan(obj, i10, i11, 33);
    }

    private static final void v(Spannable spannable, C1321d.c cVar, d dVar) {
        int h10 = cVar.h();
        int f10 = cVar.f();
        C c10 = (C) cVar.g();
        i(spannable, c10.e(), h10, f10);
        k(spannable, c10.g(), h10, f10);
        j(spannable, c10.f(), c10.c(), h10, f10);
        x(spannable, c10.s(), h10, f10);
        o(spannable, c10.k(), dVar, h10, f10);
        n(spannable, c10.j(), h10, f10);
        p(spannable, c10.u(), h10, f10);
        s(spannable, c10.p(), h10, f10);
        h(spannable, c10.d(), h10, f10);
        t(spannable, c10.r(), h10, f10);
        l(spannable, c10.h(), h10, f10);
    }

    public static final void w(Spannable spannable, T t10, List list, d dVar, r rVar) {
        MetricAffectingSpan a10;
        m(spannable, t10, list, rVar);
        int size = list.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            C1321d.c cVar = (C1321d.c) list.get(i10);
            int h10 = cVar.h();
            int f10 = cVar.f();
            if (h10 >= 0 && h10 < spannable.length() && f10 > h10 && f10 <= spannable.length()) {
                v(spannable, cVar, dVar);
                if (c((C) cVar.g())) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            int size2 = list.size();
            for (int i11 = 0; i11 < size2; i11++) {
                C1321d.c cVar2 = (C1321d.c) list.get(i11);
                int h11 = cVar2.h();
                int f11 = cVar2.f();
                C c10 = (C) cVar2.g();
                if (h11 >= 0 && h11 < spannable.length() && f11 > h11 && f11 <= spannable.length() && (a10 = a(c10.o(), dVar)) != null) {
                    u(spannable, a10, h11, f11);
                }
            }
        }
    }

    public static final void x(Spannable spannable, k kVar, int i10, int i11) {
        if (kVar != null) {
            k.a aVar = k.f19119b;
            u(spannable, new T0.n(kVar.d(aVar.d()), kVar.d(aVar.b())), i10, i11);
        }
    }

    public static final void y(Spannable spannable, b1.q qVar, float f10, d dVar) {
        float f11;
        if (qVar == null) {
            return;
        }
        if ((!v.e(qVar.b(), w.f(0)) || !v.e(qVar.c(), w.f(0))) && !w.g(qVar.b()) && !w.g(qVar.c())) {
            long g10 = v.g(qVar.b());
            x.a aVar = x.f19246b;
            float f12 = 0.0f;
            if (x.g(g10, aVar.b())) {
                f11 = dVar.N0(qVar.b());
            } else if (x.g(g10, aVar.a())) {
                f11 = v.h(qVar.b()) * f10;
            } else {
                f11 = 0.0f;
            }
            long g11 = v.g(qVar.c());
            if (x.g(g11, aVar.b())) {
                f12 = dVar.N0(qVar.c());
            } else if (x.g(g11, aVar.a())) {
                f12 = v.h(qVar.c()) * f10;
            }
            u(spannable, new LeadingMarginSpan.Standard((int) ((float) Math.ceil((double) f11)), (int) ((float) Math.ceil((double) f12))), 0, spannable.length());
        }
    }
}
