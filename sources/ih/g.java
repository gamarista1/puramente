package ih;

import Ef.i;
import Ef.m;
import ih.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kh.C6454h0;
import kh.C6460k0;
import kh.C6463m;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import lf.C6502A;
import lf.C6531o;
import mf.C6559l;
import mf.C6565s;
import mf.I;
import mf.O;
import yf.C6787a;
import yf.C6798l;

public final class g implements f, C6463m {

    /* renamed from: a  reason: collision with root package name */
    private final String f68483a;

    /* renamed from: b  reason: collision with root package name */
    private final j f68484b;

    /* renamed from: c  reason: collision with root package name */
    private final int f68485c;

    /* renamed from: d  reason: collision with root package name */
    private final List f68486d;

    /* renamed from: e  reason: collision with root package name */
    private final Set f68487e;

    /* renamed from: f  reason: collision with root package name */
    private final String[] f68488f;

    /* renamed from: g  reason: collision with root package name */
    private final f[] f68489g;

    /* renamed from: h  reason: collision with root package name */
    private final List[] f68490h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean[] f68491i;

    /* renamed from: j  reason: collision with root package name */
    private final Map f68492j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public final f[] f68493k;

    /* renamed from: l  reason: collision with root package name */
    private final Lazy f68494l;

    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f68495a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar) {
            super(0);
            this.f68495a = gVar;
        }

        /* renamed from: a */
        public final Integer invoke() {
            g gVar = this.f68495a;
            return Integer.valueOf(C6460k0.a(gVar, gVar.f68493k));
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f68496a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(g gVar) {
            super(1);
            this.f68496a = gVar;
        }

        public final CharSequence a(int i10) {
            return this.f68496a.e(i10) + ": " + this.f68496a.g(i10).i();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    public g(String str, j jVar, int i10, List list, C6000a aVar) {
        C6496s.h(str, "serialName");
        C6496s.h(jVar, "kind");
        C6496s.h(list, "typeParameters");
        C6496s.h(aVar, "builder");
        this.f68483a = str;
        this.f68484b = jVar;
        this.f68485c = i10;
        this.f68486d = aVar.c();
        this.f68487e = C6565s.c1(aVar.f());
        String[] strArr = (String[]) aVar.f().toArray(new String[0]);
        this.f68488f = strArr;
        this.f68489g = C6454h0.b(aVar.e());
        this.f68490h = (List[]) aVar.d().toArray(new List[0]);
        this.f68491i = C6565s.X0(aVar.g());
        Iterable<I> A12 = C6559l.A1(strArr);
        ArrayList arrayList = new ArrayList(C6565s.y(A12, 10));
        for (I i11 : A12) {
            arrayList.add(C6502A.a(i11.d(), Integer.valueOf(i11.c())));
        }
        this.f68492j = O.w(arrayList);
        this.f68493k = C6454h0.b(list);
        this.f68494l = C6531o.b(new a(this));
    }

    private final int l() {
        return ((Number) this.f68494l.getValue()).intValue();
    }

    public Set a() {
        return this.f68487e;
    }

    public boolean b() {
        return f.a.c(this);
    }

    public int c(String str) {
        C6496s.h(str, "name");
        Integer num = (Integer) this.f68492j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public int d() {
        return this.f68485c;
    }

    public String e(int i10) {
        return this.f68488f[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            f fVar = (f) obj;
            if (C6496s.c(i(), fVar.i()) && Arrays.equals(this.f68493k, ((g) obj).f68493k) && d() == fVar.d()) {
                int d10 = d();
                int i10 = 0;
                while (i10 < d10) {
                    if (C6496s.c(g(i10).i(), fVar.g(i10).i()) && C6496s.c(g(i10).h(), fVar.g(i10).h())) {
                        i10++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public List f(int i10) {
        return this.f68490h[i10];
    }

    public f g(int i10) {
        return this.f68489g[i10];
    }

    public List getAnnotations() {
        return this.f68486d;
    }

    public j h() {
        return this.f68484b;
    }

    public int hashCode() {
        return l();
    }

    public String i() {
        return this.f68483a;
    }

    public boolean isInline() {
        return f.a.b(this);
    }

    public boolean j(int i10) {
        return this.f68491i[i10];
    }

    public String toString() {
        i u10 = m.u(0, d());
        return C6565s.x0(u10, ", ", i() + '(', ")", 0, (CharSequence) null, new b(this), 24, (Object) null);
    }
}
