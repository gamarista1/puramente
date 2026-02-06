package Xf;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6529m;

public final class C {

    /* renamed from: d  reason: collision with root package name */
    public static final a f66239d = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final C f66240e = new C(O.STRICT, (C6529m) null, (O) null, 6, (DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final O f66241a;

    /* renamed from: b  reason: collision with root package name */
    private final C6529m f66242b;

    /* renamed from: c  reason: collision with root package name */
    private final O f66243c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C a() {
            return C.f66240e;
        }

        private a() {
        }
    }

    public C(O o10, C6529m mVar, O o11) {
        C6496s.h(o10, "reportLevelBefore");
        C6496s.h(o11, "reportLevelAfter");
        this.f66241a = o10;
        this.f66242b = mVar;
        this.f66243c = o11;
    }

    public final O b() {
        return this.f66243c;
    }

    public final O c() {
        return this.f66241a;
    }

    public final C6529m d() {
        return this.f66242b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        if (this.f66241a == c10.f66241a && C6496s.c(this.f66242b, c10.f66242b) && this.f66243c == c10.f66243c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.f66241a.hashCode() * 31;
        C6529m mVar = this.f66242b;
        if (mVar == null) {
            i10 = 0;
        } else {
            i10 = mVar.hashCode();
        }
        return ((hashCode + i10) * 31) + this.f66243c.hashCode();
    }

    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f66241a + ", sinceVersion=" + this.f66242b + ", reportLevelAfter=" + this.f66243c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C(O o10, C6529m mVar, O o11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(o10, (i10 & 2) != 0 ? new C6529m(1, 0) : mVar, (i10 & 4) != 0 ? o10 : o11);
    }
}
