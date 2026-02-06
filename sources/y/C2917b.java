package y;

import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2544x0;

/* renamed from: y.b  reason: case insensitive filesystem */
public final class C2917b {

    /* renamed from: a  reason: collision with root package name */
    private final long f28451a;

    /* renamed from: b  reason: collision with root package name */
    private final long f28452b;

    /* renamed from: c  reason: collision with root package name */
    private final long f28453c;

    /* renamed from: d  reason: collision with root package name */
    private final long f28454d;

    /* renamed from: e  reason: collision with root package name */
    private final long f28455e;

    public /* synthetic */ C2917b(long j10, long j11, long j12, long j13, long j14, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12, j13, j14);
    }

    public final long a() {
        return this.f28451a;
    }

    public final long b() {
        return this.f28455e;
    }

    public final long c() {
        return this.f28454d;
    }

    public final long d() {
        return this.f28453c;
    }

    public final long e() {
        return this.f28452b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C2917b)) {
            return false;
        }
        C2917b bVar = (C2917b) obj;
        if (C2544x0.q(this.f28451a, bVar.f28451a) && C2544x0.q(this.f28452b, bVar.f28452b) && C2544x0.q(this.f28453c, bVar.f28453c) && C2544x0.q(this.f28454d, bVar.f28454d) && C2544x0.q(this.f28455e, bVar.f28455e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((((((C2544x0.w(this.f28451a) * 31) + C2544x0.w(this.f28452b)) * 31) + C2544x0.w(this.f28453c)) * 31) + C2544x0.w(this.f28454d)) * 31) + C2544x0.w(this.f28455e);
    }

    public String toString() {
        return "ContextMenuColors(backgroundColor=" + C2544x0.x(this.f28451a) + ", textColor=" + C2544x0.x(this.f28452b) + ", iconColor=" + C2544x0.x(this.f28453c) + ", disabledTextColor=" + C2544x0.x(this.f28454d) + ", disabledIconColor=" + C2544x0.x(this.f28455e) + ')';
    }

    private C2917b(long j10, long j11, long j12, long j13, long j14) {
        this.f28451a = j10;
        this.f28452b = j11;
        this.f28453c = j12;
        this.f28454d = j13;
        this.f28455e = j14;
    }
}
