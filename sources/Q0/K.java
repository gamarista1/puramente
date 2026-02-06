package Q0;

import V0.g;
import V0.h;
import c1.b;
import c1.d;
import c1.t;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class K {

    /* renamed from: a  reason: collision with root package name */
    private final C1321d f5261a;

    /* renamed from: b  reason: collision with root package name */
    private final T f5262b;

    /* renamed from: c  reason: collision with root package name */
    private final List f5263c;

    /* renamed from: d  reason: collision with root package name */
    private final int f5264d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f5265e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5266f;

    /* renamed from: g  reason: collision with root package name */
    private final d f5267g;

    /* renamed from: h  reason: collision with root package name */
    private final t f5268h;

    /* renamed from: i  reason: collision with root package name */
    private final h.b f5269i;

    /* renamed from: j  reason: collision with root package name */
    private final long f5270j;

    /* renamed from: k  reason: collision with root package name */
    private g f5271k;

    public /* synthetic */ K(C1321d dVar, T t10, List list, int i10, boolean z10, int i11, d dVar2, t tVar, h.b bVar, long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, t10, list, i10, z10, i11, dVar2, tVar, bVar, j10);
    }

    public final long a() {
        return this.f5270j;
    }

    public final d b() {
        return this.f5267g;
    }

    public final h.b c() {
        return this.f5269i;
    }

    public final t d() {
        return this.f5268h;
    }

    public final int e() {
        return this.f5264d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k10 = (K) obj;
        if (C6496s.c(this.f5261a, k10.f5261a) && C6496s.c(this.f5262b, k10.f5262b) && C6496s.c(this.f5263c, k10.f5263c) && this.f5264d == k10.f5264d && this.f5265e == k10.f5265e && b1.t.e(this.f5266f, k10.f5266f) && C6496s.c(this.f5267g, k10.f5267g) && this.f5268h == k10.f5268h && C6496s.c(this.f5269i, k10.f5269i) && b.f(this.f5270j, k10.f5270j)) {
            return true;
        }
        return false;
    }

    public final int f() {
        return this.f5266f;
    }

    public final List g() {
        return this.f5263c;
    }

    public final boolean h() {
        return this.f5265e;
    }

    public int hashCode() {
        return (((((((((((((((((this.f5261a.hashCode() * 31) + this.f5262b.hashCode()) * 31) + this.f5263c.hashCode()) * 31) + this.f5264d) * 31) + Boolean.hashCode(this.f5265e)) * 31) + b1.t.f(this.f5266f)) * 31) + this.f5267g.hashCode()) * 31) + this.f5268h.hashCode()) * 31) + this.f5269i.hashCode()) * 31) + b.o(this.f5270j);
    }

    public final T i() {
        return this.f5262b;
    }

    public final C1321d j() {
        return this.f5261a;
    }

    public String toString() {
        return "TextLayoutInput(text=" + this.f5261a + ", style=" + this.f5262b + ", placeholders=" + this.f5263c + ", maxLines=" + this.f5264d + ", softWrap=" + this.f5265e + ", overflow=" + b1.t.g(this.f5266f) + ", density=" + this.f5267g + ", layoutDirection=" + this.f5268h + ", fontFamilyResolver=" + this.f5269i + ", constraints=" + b.q(this.f5270j) + ')';
    }

    private K(C1321d dVar, T t10, List list, int i10, boolean z10, int i11, d dVar2, t tVar, g gVar, h.b bVar, long j10) {
        this.f5261a = dVar;
        this.f5262b = t10;
        this.f5263c = list;
        this.f5264d = i10;
        this.f5265e = z10;
        this.f5266f = i11;
        this.f5267g = dVar2;
        this.f5268h = tVar;
        this.f5269i = bVar;
        this.f5270j = j10;
        this.f5271k = gVar;
    }

    private K(C1321d dVar, T t10, List list, int i10, boolean z10, int i11, d dVar2, t tVar, h.b bVar, long j10) {
        this(dVar, t10, list, i10, z10, i11, dVar2, tVar, (g) null, bVar, j10);
    }
}
