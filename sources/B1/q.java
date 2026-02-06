package b1;

import c1.v;
import c1.w;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class q {

    /* renamed from: c  reason: collision with root package name */
    public static final a f19141c = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final q f19142d = new q(0, 0, 3, (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final long f19143a;

    /* renamed from: b  reason: collision with root package name */
    private final long f19144b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final q a() {
            return q.f19142d;
        }

        private a() {
        }
    }

    public /* synthetic */ q(long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11);
    }

    public final long b() {
        return this.f19143a;
    }

    public final long c() {
        return this.f19144b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (v.e(this.f19143a, qVar.f19143a) && v.e(this.f19144b, qVar.f19144b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (v.i(this.f19143a) * 31) + v.i(this.f19144b);
    }

    public String toString() {
        return "TextIndent(firstLine=" + v.j(this.f19143a) + ", restLine=" + v.j(this.f19144b) + ')';
    }

    private q(long j10, long j11) {
        this.f19143a = j10;
        this.f19144b = j11;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(long j10, long j11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? w.f(0) : j10, (i10 & 2) != 0 ? w.f(0) : j11, (DefaultConstructorMarker) null);
    }
}
