package O0;

import yf.C6787a;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final C6787a f4548a;

    /* renamed from: b  reason: collision with root package name */
    private final C6787a f4549b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f4550c;

    public h(C6787a aVar, C6787a aVar2, boolean z10) {
        this.f4548a = aVar;
        this.f4549b = aVar2;
        this.f4550c = z10;
    }

    public final C6787a a() {
        return this.f4549b;
    }

    public final boolean b() {
        return this.f4550c;
    }

    public final C6787a c() {
        return this.f4548a;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + ((Number) this.f4548a.invoke()).floatValue() + ", maxValue=" + ((Number) this.f4549b.invoke()).floatValue() + ", reverseScrolling=" + this.f4550c + ')';
    }
}
