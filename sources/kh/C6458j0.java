package kh;

import Ef.i;
import Ef.m;
import gh.C5978b;
import ih.f;
import ih.j;
import ih.k;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import lf.C6534r;
import mf.C6565s;
import mf.O;
import yf.C6787a;
import yf.C6798l;

/* renamed from: kh.j0  reason: case insensitive filesystem */
public class C6458j0 implements f, C6463m {

    /* renamed from: a  reason: collision with root package name */
    private final String f71667a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final D f71668b;

    /* renamed from: c  reason: collision with root package name */
    private final int f71669c;

    /* renamed from: d  reason: collision with root package name */
    private int f71670d;

    /* renamed from: e  reason: collision with root package name */
    private final String[] f71671e;

    /* renamed from: f  reason: collision with root package name */
    private final List[] f71672f;

    /* renamed from: g  reason: collision with root package name */
    private List f71673g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean[] f71674h;

    /* renamed from: i  reason: collision with root package name */
    private Map f71675i;

    /* renamed from: j  reason: collision with root package name */
    private final Lazy f71676j;

    /* renamed from: k  reason: collision with root package name */
    private final Lazy f71677k;

    /* renamed from: l  reason: collision with root package name */
    private final Lazy f71678l;

    /* renamed from: kh.j0$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6458j0 f71679a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C6458j0 j0Var) {
            super(0);
            this.f71679a = j0Var;
        }

        /* renamed from: a */
        public final Integer invoke() {
            C6458j0 j0Var = this.f71679a;
            return Integer.valueOf(C6460k0.a(j0Var, j0Var.p()));
        }
    }

    /* renamed from: kh.j0$b */
    static final class b extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6458j0 f71680a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C6458j0 j0Var) {
            super(0);
            this.f71680a = j0Var;
        }

        /* renamed from: a */
        public final C5978b[] invoke() {
            C5978b[] childSerializers;
            D k10 = this.f71680a.f71668b;
            if (k10 == null || (childSerializers = k10.childSerializers()) == null) {
                return C6462l0.f71686a;
            }
            return childSerializers;
        }
    }

    /* renamed from: kh.j0$c */
    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6458j0 f71681a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C6458j0 j0Var) {
            super(1);
            this.f71681a = j0Var;
        }

        public final CharSequence a(int i10) {
            return this.f71681a.e(i10) + ": " + this.f71681a.g(i10).i();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* renamed from: kh.j0$d */
    static final class d extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6458j0 f71682a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C6458j0 j0Var) {
            super(0);
            this.f71682a = j0Var;
        }

        /* renamed from: a */
        public final f[] invoke() {
            ArrayList arrayList;
            C5978b[] typeParametersSerializers;
            D k10 = this.f71682a.f71668b;
            if (k10 == null || (typeParametersSerializers = k10.typeParametersSerializers()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(typeParametersSerializers.length);
                for (C5978b descriptor : typeParametersSerializers) {
                    arrayList.add(descriptor.getDescriptor());
                }
            }
            return C6454h0.b(arrayList);
        }
    }

    public C6458j0(String str, D d10, int i10) {
        C6496s.h(str, "serialName");
        this.f71667a = str;
        this.f71668b = d10;
        this.f71669c = i10;
        this.f71670d = -1;
        String[] strArr = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            strArr[i11] = "[UNINITIALIZED]";
        }
        this.f71671e = strArr;
        int i12 = this.f71669c;
        this.f71672f = new List[i12];
        this.f71674h = new boolean[i12];
        this.f71675i = O.i();
        C6534r rVar = C6534r.PUBLICATION;
        this.f71676j = C6531o.a(rVar, new b(this));
        this.f71677k = C6531o.a(rVar, new d(this));
        this.f71678l = C6531o.a(rVar, new a(this));
    }

    public static /* synthetic */ void m(C6458j0 j0Var, String str, boolean z10, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            j0Var.l(str, z10);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addElement");
    }

    private final Map n() {
        HashMap hashMap = new HashMap();
        int length = this.f71671e.length;
        for (int i10 = 0; i10 < length; i10++) {
            hashMap.put(this.f71671e[i10], Integer.valueOf(i10));
        }
        return hashMap;
    }

    private final C5978b[] o() {
        return (C5978b[]) this.f71676j.getValue();
    }

    private final int q() {
        return ((Number) this.f71678l.getValue()).intValue();
    }

    public Set a() {
        return this.f71675i.keySet();
    }

    public boolean b() {
        return f.a.c(this);
    }

    public int c(String str) {
        C6496s.h(str, "name");
        Integer num = (Integer) this.f71675i.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public final int d() {
        return this.f71669c;
    }

    public String e(int i10) {
        return this.f71671e[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6458j0) {
            f fVar = (f) obj;
            if (C6496s.c(i(), fVar.i()) && Arrays.equals(p(), ((C6458j0) obj).p()) && d() == fVar.d()) {
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
        List list = this.f71672f[i10];
        if (list == null) {
            return C6565s.n();
        }
        return list;
    }

    public f g(int i10) {
        return o()[i10].getDescriptor();
    }

    public List getAnnotations() {
        List list = this.f71673g;
        if (list == null) {
            return C6565s.n();
        }
        return list;
    }

    public j h() {
        return k.a.f68506a;
    }

    public int hashCode() {
        return q();
    }

    public String i() {
        return this.f71667a;
    }

    public boolean isInline() {
        return f.a.b(this);
    }

    public boolean j(int i10) {
        return this.f71674h[i10];
    }

    public final void l(String str, boolean z10) {
        C6496s.h(str, "name");
        String[] strArr = this.f71671e;
        int i10 = this.f71670d + 1;
        this.f71670d = i10;
        strArr[i10] = str;
        this.f71674h[i10] = z10;
        this.f71672f[i10] = null;
        if (i10 == this.f71669c - 1) {
            this.f71675i = n();
        }
    }

    public final f[] p() {
        return (f[]) this.f71677k.getValue();
    }

    public final void r(Annotation annotation) {
        C6496s.h(annotation, "annotation");
        List list = this.f71672f[this.f71670d];
        if (list == null) {
            list = new ArrayList(1);
            this.f71672f[this.f71670d] = list;
        }
        list.add(annotation);
    }

    public final void s(Annotation annotation) {
        C6496s.h(annotation, "a");
        if (this.f71673g == null) {
            this.f71673g = new ArrayList(1);
        }
        List list = this.f71673g;
        C6496s.e(list);
        list.add(annotation);
    }

    public String toString() {
        i u10 = m.u(0, this.f71669c);
        return C6565s.x0(u10, ", ", i() + '(', ")", 0, (CharSequence) null, new c(this), 24, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6458j0(String str, D d10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : d10, i10);
    }
}
