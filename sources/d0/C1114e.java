package D0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.C2421g;

/* renamed from: D0.e  reason: case insensitive filesystem */
public final class C1114e {

    /* renamed from: a  reason: collision with root package name */
    private final long f1456a;

    /* renamed from: b  reason: collision with root package name */
    private final long f1457b;

    /* renamed from: c  reason: collision with root package name */
    private long f1458c;

    public /* synthetic */ C1114e(long j10, long j11, long j12, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, j12);
    }

    public final long a() {
        return this.f1458c;
    }

    public final long b() {
        return this.f1457b;
    }

    public final long c() {
        return this.f1456a;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f1456a + ", position=" + C2421g.t(this.f1457b) + ')';
    }

    public /* synthetic */ C1114e(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    private C1114e(long j10, long j11) {
        this.f1456a = j10;
        this.f1457b = j11;
        this.f1458c = C2421g.f25320b.c();
    }

    private C1114e(long j10, long j11, long j12) {
        this(j10, j11, (DefaultConstructorMarker) null);
        this.f1458c = j12;
    }
}
