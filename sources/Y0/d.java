package Y0;

import Q0.C;
import Q0.C1321d;
import Q0.C1335s;
import Q0.T;
import R0.M;
import V0.F;
import V0.h;
import V0.n;
import V0.o;
import V0.p;
import Y.A1;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import yf.r;

public final class d implements C1335s {

    /* renamed from: a  reason: collision with root package name */
    private final String f10220a;

    /* renamed from: b  reason: collision with root package name */
    private final T f10221b;

    /* renamed from: c  reason: collision with root package name */
    private final List f10222c;

    /* renamed from: d  reason: collision with root package name */
    private final List f10223d;

    /* renamed from: e  reason: collision with root package name */
    private final h.b f10224e;

    /* renamed from: f  reason: collision with root package name */
    private final c1.d f10225f;

    /* renamed from: g  reason: collision with root package name */
    private final g f10226g;

    /* renamed from: h  reason: collision with root package name */
    private final CharSequence f10227h;

    /* renamed from: i  reason: collision with root package name */
    private final M f10228i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public s f10229j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f10230k;

    /* renamed from: l  reason: collision with root package name */
    private final int f10231l;

    static final class a extends C6498u implements r {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f10232a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(d dVar) {
            super(4);
            this.f10232a = dVar;
        }

        public final Typeface a(h hVar, p pVar, int i10, int i11) {
            A1 b10 = this.f10232a.g().b(hVar, pVar, i10, i11);
            if (!(b10 instanceof F.a)) {
                s sVar = new s(b10, this.f10232a.f10229j);
                this.f10232a.f10229j = sVar;
                return sVar.a();
            }
            Object value = b10.getValue();
            C6496s.f(value, "null cannot be cast to non-null type android.graphics.Typeface");
            return (Typeface) value;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
            return a((h) obj, (p) obj2, ((n) obj3).i(), ((o) obj4).k());
        }
    }

    public d(String str, T t10, List list, List list2, h.b bVar, c1.d dVar) {
        boolean z10;
        C1321d.c cVar;
        this.f10220a = str;
        this.f10221b = t10;
        this.f10222c = list;
        this.f10223d = list2;
        this.f10224e = bVar;
        this.f10225f = dVar;
        g gVar = new g(1, dVar.getDensity());
        this.f10226g = gVar;
        if (!e.c(t10)) {
            z10 = false;
        } else {
            z10 = ((Boolean) m.f10249a.a().getValue()).booleanValue();
        }
        this.f10230k = z10;
        this.f10231l = e.d(t10.B(), t10.u());
        a aVar = new a(this);
        Z0.d.e(gVar, t10.E());
        C a10 = Z0.d.a(gVar, t10.N(), aVar, dVar, !list.isEmpty());
        ArrayList arrayList = list;
        if (a10 != null) {
            int size = list.size() + 1;
            ArrayList arrayList2 = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 == 0) {
                    cVar = new C1321d.c(a10, 0, this.f10220a.length());
                } else {
                    cVar = (C1321d.c) this.f10222c.get(i10 - 1);
                }
                arrayList2.add(cVar);
            }
            arrayList = arrayList2;
        }
        CharSequence a11 = c.a(this.f10220a, this.f10226g.getTextSize(), this.f10221b, arrayList, this.f10223d, this.f10225f, aVar, this.f10230k);
        this.f10227h = a11;
        this.f10228i = new M(a11, this.f10226g, this.f10231l);
    }

    public float a() {
        return this.f10228i.b();
    }

    public float b() {
        return this.f10228i.c();
    }

    public boolean c() {
        boolean z10;
        s sVar = this.f10229j;
        if (sVar != null) {
            z10 = sVar.b();
        } else {
            z10 = false;
        }
        if (z10 || (!this.f10230k && e.c(this.f10221b) && ((Boolean) m.f10249a.a().getValue()).booleanValue())) {
            return true;
        }
        return false;
    }

    public final CharSequence f() {
        return this.f10227h;
    }

    public final h.b g() {
        return this.f10224e;
    }

    public final M h() {
        return this.f10228i;
    }

    public final T i() {
        return this.f10221b;
    }

    public final int j() {
        return this.f10231l;
    }

    public final g k() {
        return this.f10226g;
    }
}
