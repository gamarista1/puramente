package b1;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class o {

    /* renamed from: c  reason: collision with root package name */
    public static final a f19137c = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final o f19138d = new o(1.0f, 0.0f);

    /* renamed from: a  reason: collision with root package name */
    private final float f19139a;

    /* renamed from: b  reason: collision with root package name */
    private final float f19140b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o a() {
            return o.f19138d;
        }

        private a() {
        }
    }

    public o(float f10, float f11) {
        this.f19139a = f10;
        this.f19140b = f11;
    }

    public final float b() {
        return this.f19139a;
    }

    public final float c() {
        return this.f19140b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f19139a == oVar.f19139a && this.f19140b == oVar.f19140b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.f19139a) * 31) + Float.hashCode(this.f19140b);
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.f19139a + ", skewX=" + this.f19140b + ')';
    }
}
