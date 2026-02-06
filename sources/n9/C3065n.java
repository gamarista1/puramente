package N9;

import android.net.Uri;
import ia.n;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: N9.n  reason: case insensitive filesystem */
public final class C3065n {

    /* renamed from: h  reason: collision with root package name */
    private static final AtomicLong f33250h = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    public final long f33251a;

    /* renamed from: b  reason: collision with root package name */
    public final n f33252b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f33253c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f33254d;

    /* renamed from: e  reason: collision with root package name */
    public final long f33255e;

    /* renamed from: f  reason: collision with root package name */
    public final long f33256f;

    /* renamed from: g  reason: collision with root package name */
    public final long f33257g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C3065n(long r13, ia.n r15, long r16) {
        /*
            r12 = this;
            r3 = r15
            android.net.Uri r4 = r3.f44456a
            java.util.Map r5 = java.util.Collections.emptyMap()
            r8 = 0
            r10 = 0
            r0 = r12
            r1 = r13
            r6 = r16
            r0.<init>(r1, r3, r4, r5, r6, r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: N9.C3065n.<init>(long, ia.n, long):void");
    }

    public static long a() {
        return f33250h.getAndIncrement();
    }

    public C3065n(long j10, n nVar, Uri uri, Map map, long j11, long j12, long j13) {
        this.f33251a = j10;
        this.f33252b = nVar;
        this.f33253c = uri;
        this.f33254d = map;
        this.f33255e = j11;
        this.f33256f = j12;
        this.f33257g = j13;
    }
}
