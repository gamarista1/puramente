package r0;

import android.graphics.ColorFilter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: r0.g0  reason: case insensitive filesystem */
public final class C2493g0 extends C2547y0 {

    /* renamed from: c  reason: collision with root package name */
    private final long f25526c;

    /* renamed from: d  reason: collision with root package name */
    private final int f25527d;

    public /* synthetic */ C2493g0(long j10, int i10, ColorFilter colorFilter, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, i10, colorFilter);
    }

    public final int b() {
        return this.f25527d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2493g0)) {
            return false;
        }
        C2493g0 g0Var = (C2493g0) obj;
        if (C2544x0.q(this.f25526c, g0Var.f25526c) && C2490f0.E(this.f25527d, g0Var.f25527d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (C2544x0.w(this.f25526c) * 31) + C2490f0.F(this.f25527d);
    }

    public String toString() {
        return "BlendModeColorFilter(color=" + C2544x0.x(this.f25526c) + ", blendMode=" + C2490f0.G(this.f25527d) + ')';
    }

    public /* synthetic */ C2493g0(long j10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, i10);
    }

    private C2493g0(long j10, int i10, ColorFilter colorFilter) {
        super(colorFilter);
        this.f25526c = j10;
        this.f25527d = i10;
    }

    private C2493g0(long j10, int i10) {
        this(j10, i10, C2450I.c(j10, i10), (DefaultConstructorMarker) null);
    }
}
