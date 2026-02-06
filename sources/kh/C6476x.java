package kh;

import ih.f;
import ih.h;
import ih.i;
import ih.j;
import ih.k;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import mf.C6565s;
import yf.C6787a;
import yf.C6798l;

/* renamed from: kh.x  reason: case insensitive filesystem */
public final class C6476x extends C6458j0 {

    /* renamed from: m  reason: collision with root package name */
    private final j f71721m = j.b.f68505a;

    /* renamed from: n  reason: collision with root package name */
    private final Lazy f71722n;

    /* renamed from: kh.x$a */
    static final class a extends C6498u implements C6787a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f71723a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f71724b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C6476x f71725c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int i10, String str, C6476x xVar) {
            super(0);
            this.f71723a = i10;
            this.f71724b = str;
            this.f71725c = xVar;
        }

        /* renamed from: a */
        public final f[] invoke() {
            int i10 = this.f71723a;
            f[] fVarArr = new f[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                fVarArr[i11] = i.d(this.f71724b + '.' + this.f71725c.e(i11), k.d.f68509a, new f[0], (C6798l) null, 8, (Object) null);
            }
            return fVarArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6476x(String str, int i10) {
        super(str, (D) null, i10, 2, (DefaultConstructorMarker) null);
        C6496s.h(str, "name");
        this.f71722n = C6531o.b(new a(i10, str, this));
    }

    private final f[] t() {
        return (f[]) this.f71722n.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (fVar.h() == j.b.f68505a && C6496s.c(i(), fVar.i()) && C6496s.c(C6454h0.a(this), C6454h0.a(fVar))) {
            return true;
        }
        return false;
    }

    public f g(int i10) {
        return t()[i10];
    }

    public j h() {
        return this.f71721m;
    }

    public int hashCode() {
        int i10;
        int hashCode = i().hashCode();
        int i11 = 1;
        for (String str : h.b(this)) {
            int i12 = i11 * 31;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            i11 = i12 + i10;
        }
        return (hashCode * 31) + i11;
    }

    public String toString() {
        Iterable b10 = h.b(this);
        return C6565s.x0(b10, ", ", i() + '(', ")", 0, (CharSequence) null, (C6798l) null, 56, (Object) null);
    }
}
