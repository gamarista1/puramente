package D0;

import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.C2421g;

public final class D {

    /* renamed from: a  reason: collision with root package name */
    private final long f1380a;

    /* renamed from: b  reason: collision with root package name */
    private final long f1381b;

    /* renamed from: c  reason: collision with root package name */
    private final long f1382c;

    /* renamed from: d  reason: collision with root package name */
    private final long f1383d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f1384e;

    /* renamed from: f  reason: collision with root package name */
    private final float f1385f;

    /* renamed from: g  reason: collision with root package name */
    private final int f1386g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f1387h;

    /* renamed from: i  reason: collision with root package name */
    private final List f1388i;

    /* renamed from: j  reason: collision with root package name */
    private final long f1389j;

    /* renamed from: k  reason: collision with root package name */
    private final long f1390k;

    public /* synthetic */ D(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List list, long j14, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, z10, f10, i10, z11, list, j14, j15);
    }

    public final boolean a() {
        return this.f1387h;
    }

    public final boolean b() {
        return this.f1384e;
    }

    public final List c() {
        return this.f1388i;
    }

    public final long d() {
        return this.f1380a;
    }

    public final long e() {
        return this.f1390k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d10 = (D) obj;
        if (z.d(this.f1380a, d10.f1380a) && this.f1381b == d10.f1381b && C2421g.j(this.f1382c, d10.f1382c) && C2421g.j(this.f1383d, d10.f1383d) && this.f1384e == d10.f1384e && Float.compare(this.f1385f, d10.f1385f) == 0 && O.g(this.f1386g, d10.f1386g) && this.f1387h == d10.f1387h && C6496s.c(this.f1388i, d10.f1388i) && C2421g.j(this.f1389j, d10.f1389j) && C2421g.j(this.f1390k, d10.f1390k)) {
            return true;
        }
        return false;
    }

    public final long f() {
        return this.f1383d;
    }

    public final long g() {
        return this.f1382c;
    }

    public final float h() {
        return this.f1385f;
    }

    public int hashCode() {
        return (((((((((((((((((((z.e(this.f1380a) * 31) + Long.hashCode(this.f1381b)) * 31) + C2421g.o(this.f1382c)) * 31) + C2421g.o(this.f1383d)) * 31) + Boolean.hashCode(this.f1384e)) * 31) + Float.hashCode(this.f1385f)) * 31) + O.h(this.f1386g)) * 31) + Boolean.hashCode(this.f1387h)) * 31) + this.f1388i.hashCode()) * 31) + C2421g.o(this.f1389j)) * 31) + C2421g.o(this.f1390k);
    }

    public final long i() {
        return this.f1389j;
    }

    public final int j() {
        return this.f1386g;
    }

    public final long k() {
        return this.f1381b;
    }

    public String toString() {
        return "PointerInputEventData(id=" + z.f(this.f1380a) + ", uptime=" + this.f1381b + ", positionOnScreen=" + C2421g.t(this.f1382c) + ", position=" + C2421g.t(this.f1383d) + ", down=" + this.f1384e + ", pressure=" + this.f1385f + ", type=" + O.i(this.f1386g) + ", activeHover=" + this.f1387h + ", historical=" + this.f1388i + ", scrollDelta=" + C2421g.t(this.f1389j) + ", originalEventPosition=" + C2421g.t(this.f1390k) + ')';
    }

    private D(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, List list, long j14, long j15) {
        this.f1380a = j10;
        this.f1381b = j11;
        this.f1382c = j12;
        this.f1383d = j13;
        this.f1384e = z10;
        this.f1385f = f10;
        this.f1386g = i10;
        this.f1387h = z11;
        this.f1388i = list;
        this.f1389j = j14;
        this.f1390k = j15;
    }
}
