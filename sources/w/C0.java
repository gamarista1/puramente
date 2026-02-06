package w;

import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class C0 {

    /* renamed from: a  reason: collision with root package name */
    private final C2805q f27157a;

    /* renamed from: b  reason: collision with root package name */
    private final C2760D f27158b;

    /* renamed from: c  reason: collision with root package name */
    private final int f27159c;

    public /* synthetic */ C0(C2805q qVar, C2760D d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(qVar, d10, i10);
    }

    public final int a() {
        return this.f27159c;
    }

    public final C2760D b() {
        return this.f27158b;
    }

    public final C2805q c() {
        return this.f27157a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0)) {
            return false;
        }
        C0 c02 = (C0) obj;
        if (C6496s.c(this.f27157a, c02.f27157a) && C6496s.c(this.f27158b, c02.f27158b) && C2808t.c(this.f27159c, c02.f27159c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f27157a.hashCode() * 31) + this.f27158b.hashCode()) * 31) + C2808t.d(this.f27159c);
    }

    public String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f27157a + ", easing=" + this.f27158b + ", arcMode=" + C2808t.e(this.f27159c) + ')';
    }

    private C0(C2805q qVar, C2760D d10, int i10) {
        this.f27157a = qVar;
        this.f27158b = d10;
        this.f27159c = i10;
    }
}
