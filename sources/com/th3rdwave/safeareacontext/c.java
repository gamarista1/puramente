package com.th3rdwave.safeareacontext;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final float f60008a;

    /* renamed from: b  reason: collision with root package name */
    private final float f60009b;

    /* renamed from: c  reason: collision with root package name */
    private final float f60010c;

    /* renamed from: d  reason: collision with root package name */
    private final float f60011d;

    public c(float f10, float f11, float f12, float f13) {
        this.f60008a = f10;
        this.f60009b = f11;
        this.f60010c = f12;
        this.f60011d = f13;
    }

    public final float a() {
        return this.f60011d;
    }

    public final float b() {
        return this.f60010c;
    }

    public final float c() {
        return this.f60008a;
    }

    public final float d() {
        return this.f60009b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f60008a, cVar.f60008a) == 0 && Float.compare(this.f60009b, cVar.f60009b) == 0 && Float.compare(this.f60010c, cVar.f60010c) == 0 && Float.compare(this.f60011d, cVar.f60011d) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f60008a) * 31) + Float.hashCode(this.f60009b)) * 31) + Float.hashCode(this.f60010c)) * 31) + Float.hashCode(this.f60011d);
    }

    public String toString() {
        float f10 = this.f60008a;
        float f11 = this.f60009b;
        float f12 = this.f60010c;
        float f13 = this.f60011d;
        return "Rect(x=" + f10 + ", y=" + f11 + ", width=" + f12 + ", height=" + f13 + ")";
    }
}
