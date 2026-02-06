package r0;

import android.graphics.Shader;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class h2 extends C2514n0 {

    /* renamed from: c  reason: collision with root package name */
    private final long f25528c;

    public /* synthetic */ h2(long j10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10);
    }

    public void a(long j10, Q1 q12, float f10) {
        long j11;
        q12.c(1.0f);
        if (f10 == 1.0f) {
            j11 = this.f25528c;
        } else {
            long j12 = this.f25528c;
            j11 = C2544x0.o(j12, C2544x0.r(j12) * f10, 0.0f, 0.0f, 0.0f, 14, (Object) null);
        }
        q12.m(j11);
        if (q12.s() != null) {
            q12.r((Shader) null);
        }
    }

    public final long b() {
        return this.f25528c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h2) && C2544x0.q(this.f25528c, ((h2) obj).f25528c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C2544x0.w(this.f25528c);
    }

    public String toString() {
        return "SolidColor(value=" + C2544x0.x(this.f25528c) + ')';
    }

    private h2(long j10) {
        super((DefaultConstructorMarker) null);
        this.f25528c = j10;
    }
}
