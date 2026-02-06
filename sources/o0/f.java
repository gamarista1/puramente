package O0;

import Ef.e;
import Ef.m;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class f {

    /* renamed from: d  reason: collision with root package name */
    public static final a f4534d = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final f f4535e = new f(0.0f, m.b(0.0f, 0.0f), 0, 4, (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final float f4536a;

    /* renamed from: b  reason: collision with root package name */
    private final e f4537b;

    /* renamed from: c  reason: collision with root package name */
    private final int f4538c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a() {
            return f.f4535e;
        }

        private a() {
        }
    }

    public f(float f10, e eVar, int i10) {
        this.f4536a = f10;
        this.f4537b = eVar;
        this.f4538c = i10;
        if (Float.isNaN(f10)) {
            throw new IllegalArgumentException("current must not be NaN");
        }
    }

    public final float b() {
        return this.f4536a;
    }

    public final e c() {
        return this.f4537b;
    }

    public final int d() {
        return this.f4538c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f4536a == fVar.f4536a && C6496s.c(this.f4537b, fVar.f4537b) && this.f4538c == fVar.f4538c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f4536a) * 31) + this.f4537b.hashCode()) * 31) + this.f4538c;
    }

    public String toString() {
        return "ProgressBarRangeInfo(current=" + this.f4536a + ", range=" + this.f4537b + ", steps=" + this.f4538c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(float f10, e eVar, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(f10, eVar, (i11 & 4) != 0 ? 0 : i10);
    }
}
