package mh;

import ih.f;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lh.C6538b;
import lh.i;
import lh.j;
import lh.v;
import mf.C6565s;
import mf.O;

final class Q extends M {

    /* renamed from: k  reason: collision with root package name */
    private final v f72138k;

    /* renamed from: l  reason: collision with root package name */
    private final List f72139l;

    /* renamed from: m  reason: collision with root package name */
    private final int f72140m;

    /* renamed from: n  reason: collision with root package name */
    private int f72141n = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Q(C6538b bVar, v vVar) {
        super(bVar, vVar, (String) null, (f) null, 12, (DefaultConstructorMarker) null);
        C6496s.h(bVar, "json");
        C6496s.h(vVar, "value");
        this.f72138k = vVar;
        List e12 = C6565s.e1(s0().keySet());
        this.f72139l = e12;
        this.f72140m = e12.size() * 2;
    }

    /* access modifiers changed from: protected */
    public String a0(f fVar, int i10) {
        C6496s.h(fVar, "descriptor");
        return (String) this.f72139l.get(i10 / 2);
    }

    public void c(f fVar) {
        C6496s.h(fVar, "descriptor");
    }

    /* access modifiers changed from: protected */
    public i e0(String str) {
        C6496s.h(str, "tag");
        if (this.f72141n % 2 == 0) {
            return j.c(str);
        }
        return (i) O.j(s0(), str);
    }

    public int o(f fVar) {
        C6496s.h(fVar, "descriptor");
        int i10 = this.f72141n;
        if (i10 >= this.f72140m - 1) {
            return -1;
        }
        int i11 = i10 + 1;
        this.f72141n = i11;
        return i11;
    }

    /* renamed from: w0 */
    public v s0() {
        return this.f72138k;
    }
}
