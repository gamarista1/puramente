package com.bugsnag.android;

import com.bugsnag.android.K0;
import java.util.Arrays;
import java.util.UUID;
import kotlin.jvm.internal.C6496s;

public final class I1 implements K0.a {

    /* renamed from: a  reason: collision with root package name */
    private final UUID f38500a;

    /* renamed from: b  reason: collision with root package name */
    private final long f38501b;

    public I1(UUID uuid, long j10) {
        this.f38500a = uuid;
        this.f38501b = j10;
    }

    private final String a(long j10) {
        String format = String.format("%016x", Arrays.copyOf(new Object[]{Long.valueOf(j10)}, 1));
        C6496s.g(format, "format(this, *args)");
        return format;
    }

    private final String b(UUID uuid) {
        String format = String.format("%016x%016x", Arrays.copyOf(new Object[]{Long.valueOf(uuid.getMostSignificantBits()), Long.valueOf(uuid.getLeastSignificantBits())}, 2));
        C6496s.g(format, "format(this, *args)");
        return format;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I1)) {
            return false;
        }
        I1 i12 = (I1) obj;
        return C6496s.c(this.f38500a, i12.f38500a) && this.f38501b == i12.f38501b;
    }

    public int hashCode() {
        return (this.f38500a.hashCode() * 31) + Long.hashCode(this.f38501b);
    }

    public void toStream(K0 k02) {
        k02.n().y("traceId").j0(b(this.f38500a)).y("spanId").j0(a(this.f38501b));
        k02.t();
    }

    public String toString() {
        return "TraceCorrelation(traceId=" + this.f38500a + ", spanId=" + this.f38501b + ')';
    }
}
