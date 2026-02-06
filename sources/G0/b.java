package g0;

import Y.C1500m;
import Y.K0;
import Y.M0;
import Y.Y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.V;
import lf.C6514M;
import yf.p;
import yf.q;
import yf.r;
import yf.s;
import yf.t;

public final class b implements C2005a {

    /* renamed from: a  reason: collision with root package name */
    private final int f20832a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f20833b;

    /* renamed from: c  reason: collision with root package name */
    private Object f20834c;

    /* renamed from: d  reason: collision with root package name */
    private K0 f20835d;

    /* renamed from: e  reason: collision with root package name */
    private List f20836e;

    static final class a extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f20837a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f20838b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f20839c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(b bVar, Object obj, int i10) {
            super(2);
            this.f20837a = bVar;
            this.f20838b = obj;
            this.f20839c = i10;
        }

        public final void a(C1500m mVar, int i10) {
            this.f20837a.b(this.f20838b, mVar, M0.a(this.f20839c) | 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    /* renamed from: g0.b$b  reason: collision with other inner class name */
    static final class C0347b extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f20840a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f20841b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f20842c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f20843d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0347b(b bVar, Object obj, Object obj2, int i10) {
            super(2);
            this.f20840a = bVar;
            this.f20841b = obj;
            this.f20842c = obj2;
            this.f20843d = i10;
        }

        public final void a(C1500m mVar, int i10) {
            this.f20840a.c(this.f20841b, this.f20842c, mVar, M0.a(this.f20843d) | 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class c extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f20844a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f20845b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f20846c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f20847d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f20848e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(b bVar, Object obj, Object obj2, Object obj3, int i10) {
            super(2);
            this.f20844a = bVar;
            this.f20845b = obj;
            this.f20846c = obj2;
            this.f20847d = obj3;
            this.f20848e = i10;
        }

        public final void a(C1500m mVar, int i10) {
            this.f20844a.e(this.f20845b, this.f20846c, this.f20847d, mVar, M0.a(this.f20848e) | 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    static final class d extends C6498u implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f20849a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Object f20850b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Object f20851c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f20852d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f20853e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f20854f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
            super(2);
            this.f20849a = bVar;
            this.f20850b = obj;
            this.f20851c = obj2;
            this.f20852d = obj3;
            this.f20853e = obj4;
            this.f20854f = i10;
        }

        public final void a(C1500m mVar, int i10) {
            this.f20849a.h(this.f20850b, this.f20851c, this.f20852d, this.f20853e, mVar, M0.a(this.f20854f) | 1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C1500m) obj, ((Number) obj2).intValue());
            return C6514M.f71813a;
        }
    }

    public b(int i10, boolean z10, Object obj) {
        this.f20832a = i10;
        this.f20833b = z10;
        this.f20834c = obj;
    }

    private final void i(C1500m mVar) {
        K0 x10;
        if (this.f20833b && (x10 = mVar.x()) != null) {
            mVar.s(x10);
            if (c.f(this.f20835d, x10)) {
                this.f20835d = x10;
                return;
            }
            List list = this.f20836e;
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                this.f20836e = arrayList;
                arrayList.add(x10);
                return;
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (c.f((K0) list.get(i10), x10)) {
                    list.set(i10, x10);
                    return;
                }
            }
            list.add(x10);
        }
    }

    private final void j() {
        if (this.f20833b) {
            K0 k02 = this.f20835d;
            if (k02 != null) {
                k02.invalidate();
                this.f20835d = null;
            }
            List list = this.f20836e;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((K0) list.get(i10)).invalidate();
                }
                list.clear();
            }
        }
    }

    public Object a(C1500m mVar, int i10) {
        int i11;
        C1500m h10 = mVar.h(this.f20832a);
        i(h10);
        if (h10.S(this)) {
            i11 = c.d(0);
        } else {
            i11 = c.g(0);
        }
        int i12 = i10 | i11;
        Object obj = this.f20834c;
        C6496s.f(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((p) V.f(obj, 2)).invoke(h10, Integer.valueOf(i12));
        Y0 k10 = h10.k();
        if (k10 != null) {
            C6496s.f(this, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
            k10.a((p) V.f(this, 2));
        }
        return invoke;
    }

    public Object b(Object obj, C1500m mVar, int i10) {
        int i11;
        C1500m h10 = mVar.h(this.f20832a);
        i(h10);
        if (h10.S(this)) {
            i11 = c.d(1);
        } else {
            i11 = c.g(1);
        }
        Object obj2 = this.f20834c;
        C6496s.f(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((q) V.f(obj2, 3)).invoke(obj, h10, Integer.valueOf(i11 | i10));
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new a(this, obj, i10));
        }
        return invoke;
    }

    public Object c(Object obj, Object obj2, C1500m mVar, int i10) {
        int i11;
        C1500m h10 = mVar.h(this.f20832a);
        i(h10);
        if (h10.S(this)) {
            i11 = c.d(2);
        } else {
            i11 = c.g(2);
        }
        Object obj3 = this.f20834c;
        C6496s.f(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((r) V.f(obj3, 4)).invoke(obj, obj2, h10, Integer.valueOf(i11 | i10));
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new C0347b(this, obj, obj2, i10));
        }
        return invoke;
    }

    public Object e(Object obj, Object obj2, Object obj3, C1500m mVar, int i10) {
        int i11;
        C1500m h10 = mVar.h(this.f20832a);
        i(h10);
        if (h10.S(this)) {
            i11 = c.d(3);
        } else {
            i11 = c.g(3);
        }
        Object obj4 = this.f20834c;
        C6496s.f(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object invoke = ((s) V.f(obj4, 5)).invoke(obj, obj2, obj3, h10, Integer.valueOf(i11 | i10));
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new c(this, obj, obj2, obj3, i10));
        }
        return invoke;
    }

    public /* bridge */ /* synthetic */ Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return h(obj, obj2, obj3, obj4, (C1500m) obj5, ((Number) obj6).intValue());
    }

    public Object h(Object obj, Object obj2, Object obj3, Object obj4, C1500m mVar, int i10) {
        int i11;
        C1500m h10 = mVar.h(this.f20832a);
        i(h10);
        if (h10.S(this)) {
            i11 = c.d(4);
        } else {
            i11 = c.g(4);
        }
        Object obj5 = this.f20834c;
        C6496s.f(obj5, "null cannot be cast to non-null type kotlin.Function6<@[ParameterName(name = 'p1')] kotlin.Any?, @[ParameterName(name = 'p2')] kotlin.Any?, @[ParameterName(name = 'p3')] kotlin.Any?, @[ParameterName(name = 'p4')] kotlin.Any?, @[ParameterName(name = 'c')] androidx.compose.runtime.Composer, @[ParameterName(name = 'changed')] kotlin.Int, kotlin.Any?>");
        Object f10 = ((t) V.f(obj5, 6)).f(obj, obj2, obj3, obj4, h10, Integer.valueOf(i11 | i10));
        Y0 k10 = h10.k();
        if (k10 != null) {
            k10.a(new d(this, obj, obj2, obj3, obj4, i10));
        }
        return f10;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return a((C1500m) obj, ((Number) obj2).intValue());
    }

    public final void l(Object obj) {
        boolean z10;
        if (!C6496s.c(this.f20834c, obj)) {
            if (this.f20834c == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f20834c = obj;
            if (!z10) {
                j();
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return b(obj, (C1500m) obj2, ((Number) obj3).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return c(obj, obj2, (C1500m) obj3, ((Number) obj4).intValue());
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return e(obj, obj2, obj3, (C1500m) obj4, ((Number) obj5).intValue());
    }
}
