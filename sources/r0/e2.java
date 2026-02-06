package r0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import q0.C2421g;

public final class e2 {

    /* renamed from: d  reason: collision with root package name */
    public static final a f25491d = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final e2 f25492e = new e2(0, 0, 0.0f, 7, (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final long f25493a;

    /* renamed from: b  reason: collision with root package name */
    private final long f25494b;

    /* renamed from: c  reason: collision with root package name */
    private final float f25495c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e2 a() {
            return e2.f25492e;
        }

        private a() {
        }
    }

    public /* synthetic */ e2(long j10, long j11, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(j10, j11, f10);
    }

    public final float b() {
        return this.f25495c;
    }

    public final long c() {
        return this.f25493a;
    }

    public final long d() {
        return this.f25494b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        if (C2544x0.q(this.f25493a, e2Var.f25493a) && C2421g.j(this.f25494b, e2Var.f25494b) && this.f25495c == e2Var.f25495c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((C2544x0.w(this.f25493a) * 31) + C2421g.o(this.f25494b)) * 31) + Float.hashCode(this.f25495c);
    }

    public String toString() {
        return "Shadow(color=" + C2544x0.x(this.f25493a) + ", offset=" + C2421g.t(this.f25494b) + ", blurRadius=" + this.f25495c + ')';
    }

    private e2(long j10, long j11, float f10) {
        this.f25493a = j10;
        this.f25494b = j11;
        this.f25495c = f10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2(long j10, long j11, float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C2550z0.d(4278190080L) : j10, (i10 & 2) != 0 ? C2421g.f25320b.c() : j11, (i10 & 4) != 0 ? 0.0f : f10, (DefaultConstructorMarker) null);
    }
}
