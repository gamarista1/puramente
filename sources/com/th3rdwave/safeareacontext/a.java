package com.th3rdwave.safeareacontext;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final float f60001a;

    /* renamed from: b  reason: collision with root package name */
    private final float f60002b;

    /* renamed from: c  reason: collision with root package name */
    private final float f60003c;

    /* renamed from: d  reason: collision with root package name */
    private final float f60004d;

    public a(float f10, float f11, float f12, float f13) {
        this.f60001a = f10;
        this.f60002b = f11;
        this.f60003c = f12;
        this.f60004d = f13;
    }

    public final float a() {
        return this.f60003c;
    }

    public final float b() {
        return this.f60004d;
    }

    public final float c() {
        return this.f60002b;
    }

    public final float d() {
        return this.f60001a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f60001a, aVar.f60001a) == 0 && Float.compare(this.f60002b, aVar.f60002b) == 0 && Float.compare(this.f60003c, aVar.f60003c) == 0 && Float.compare(this.f60004d, aVar.f60004d) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f60001a) * 31) + Float.hashCode(this.f60002b)) * 31) + Float.hashCode(this.f60003c)) * 31) + Float.hashCode(this.f60004d);
    }

    public String toString() {
        float f10 = this.f60001a;
        float f11 = this.f60002b;
        float f12 = this.f60003c;
        float f13 = this.f60004d;
        return "EdgeInsets(top=" + f10 + ", right=" + f11 + ", bottom=" + f12 + ", left=" + f13 + ")";
    }
}
