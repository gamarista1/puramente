package t2;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import k2.j;

/* renamed from: t2.x  reason: case insensitive filesystem */
public final class C2658x {

    /* renamed from: h  reason: collision with root package name */
    private static final AtomicLong f26327h = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    public final long f26328a;

    /* renamed from: b  reason: collision with root package name */
    public final j f26329b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f26330c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f26331d;

    /* renamed from: e  reason: collision with root package name */
    public final long f26332e;

    /* renamed from: f  reason: collision with root package name */
    public final long f26333f;

    /* renamed from: g  reason: collision with root package name */
    public final long f26334g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C2658x(long r13, k2.j r15, long r16) {
        /*
            r12 = this;
            r3 = r15
            android.net.Uri r4 = r3.f23194a
            java.util.Map r5 = java.util.Collections.emptyMap()
            r8 = 0
            r10 = 0
            r0 = r12
            r1 = r13
            r6 = r16
            r0.<init>(r1, r3, r4, r5, r6, r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.C2658x.<init>(long, k2.j, long):void");
    }

    public static long a() {
        return f26327h.getAndIncrement();
    }

    public C2658x(long j10, j jVar, Uri uri, Map map, long j11, long j12, long j13) {
        this.f26328a = j10;
        this.f26329b = jVar;
        this.f26330c = uri;
        this.f26331d = map;
        this.f26332e = j11;
        this.f26333f = j12;
        this.f26334g = j13;
    }
}
