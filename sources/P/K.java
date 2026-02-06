package P;

import kotlin.jvm.internal.DefaultConstructorMarker;
import r0.C2544x0;

public final class K {

    /* renamed from: a  reason: collision with root package name */
    private final long f4833a;

    /* renamed from: b  reason: collision with root package name */
    private final long f4834b;

    public /* synthetic */ K(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    public final long a() {
        return this.f4834b;
    }

    public final long b() {
        return this.f4833a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof K)) {
            return false;
        }
        K k10 = (K) obj;
        if (C2544x0.q(this.f4833a, k10.f4833a) && C2544x0.q(this.f4834b, k10.f4834b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (C2544x0.w(this.f4833a) * 31) + C2544x0.w(this.f4834b);
    }

    public String toString() {
        return "SelectionColors(selectionHandleColor=" + C2544x0.x(this.f4833a) + ", selectionBackgroundColor=" + C2544x0.x(this.f4834b) + ')';
    }

    private K(long j10, long j11) {
        this.f4833a = j10;
        this.f4834b = j11;
    }
}
