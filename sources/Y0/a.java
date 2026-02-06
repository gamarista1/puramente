package Y0;

import Q0.C;
import Q0.C1321d;
import Q0.C1326i;
import Q0.V;
import Q0.W;
import Q0.z;
import V0.C1423d;
import V0.h;
import V0.n;
import V0.o;
import V0.p;
import V0.t;
import X0.e;
import Z0.c;
import android.graphics.Typeface;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ScaleXSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import b1.C1869a;
import b1.k;
import c1.d;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import r0.e2;
import t0.C2606g;

public abstract class a {
    private static final void a(SpannableString spannableString, C c10, int i10, int i11, d dVar, h.b bVar) {
        int a10;
        int i12;
        c.k(spannableString, c10.g(), i10, i11);
        c.o(spannableString, c10.k(), dVar, i10, i11);
        if (!(c10.n() == null && c10.l() == null)) {
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
            spannableString.setSpan(new StyleSpan(C1423d.c(n10, i12)), i10, i11, 33);
        }
        if (c10.i() != null) {
            if (c10.i() instanceof t) {
                spannableString.setSpan(new TypefaceSpan(((t) c10.i()).d()), i10, i11, 33);
            } else if (Build.VERSION.SDK_INT >= 28) {
                h i13 = c10.i();
                o m10 = c10.m();
                if (m10 != null) {
                    a10 = m10.k();
                } else {
                    a10 = o.f8204b.a();
                }
                Object value = h.b.a(bVar, i13, (p) null, 0, a10, 6, (Object) null).getValue();
                C6496s.f(value, "null cannot be cast to non-null type android.graphics.Typeface");
                spannableString.setSpan(i.f10243a.a((Typeface) value), i10, i11, 33);
            }
        }
        if (c10.s() != null) {
            k s10 = c10.s();
            k.a aVar = k.f19119b;
            if (s10.d(aVar.d())) {
                spannableString.setSpan(new UnderlineSpan(), i10, i11, 33);
            }
            if (c10.s().d(aVar.b())) {
                spannableString.setSpan(new StrikethroughSpan(), i10, i11, 33);
            }
        }
        if (c10.u() != null) {
            spannableString.setSpan(new ScaleXSpan(c10.u().b()), i10, i11, 33);
        }
        c.s(spannableString, c10.p(), i10, i11);
        c.h(spannableString, c10.d(), i10, i11);
    }

    public static final SpannableString b(C1321d dVar, d dVar2, h.b bVar, t tVar) {
        C1321d dVar3 = dVar;
        t tVar2 = tVar;
        SpannableString spannableString = new SpannableString(dVar.j());
        List h10 = dVar.h();
        if (h10 != null) {
            int size = h10.size();
            for (int i10 = 0; i10 < size; i10++) {
                C1321d.c cVar = (C1321d.c) h10.get(i10);
                a(spannableString, C.b((C) cVar.a(), 0, 0, (p) null, (n) null, (o) null, (h) null, (String) null, 0, (C1869a) null, (b1.o) null, (e) null, 0, (k) null, (e2) null, (z) null, (C2606g) null, 65503, (Object) null), cVar.b(), cVar.c(), dVar2, bVar);
            }
        }
        List k10 = dVar3.k(0, dVar.length());
        int size2 = k10.size();
        for (int i11 = 0; i11 < size2; i11++) {
            C1321d.c cVar2 = (C1321d.c) k10.get(i11);
            spannableString.setSpan(Z0.e.a((V) cVar2.a()), cVar2.b(), cVar2.c(), 33);
        }
        List l10 = dVar3.l(0, dVar.length());
        int size3 = l10.size();
        for (int i12 = 0; i12 < size3; i12++) {
            C1321d.c cVar3 = (C1321d.c) l10.get(i12);
            spannableString.setSpan(tVar2.c((W) cVar3.a()), cVar3.b(), cVar3.c(), 33);
        }
        List d10 = dVar3.d(0, dVar.length());
        int size4 = d10.size();
        for (int i13 = 0; i13 < size4; i13++) {
            C1321d.c cVar4 = (C1321d.c) d10.get(i13);
            if (cVar4.h() != cVar4.f()) {
                C1326i iVar = (C1326i) cVar4.g();
                if (!(iVar instanceof C1326i.b) || iVar.a() != null) {
                    spannableString.setSpan(tVar2.a(cVar4), cVar4.h(), cVar4.f(), 33);
                } else {
                    spannableString.setSpan(tVar2.b(c(cVar4)), cVar4.h(), cVar4.f(), 33);
                }
            }
        }
        return spannableString;
    }

    private static final C1321d.c c(C1321d.c cVar) {
        Object g10 = cVar.g();
        C6496s.f(g10, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
        return new C1321d.c((C1326i.b) g10, cVar.h(), cVar.f());
    }
}
