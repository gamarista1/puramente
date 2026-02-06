package tg;

import kotlin.jvm.internal.C6496s;
import ng.b;

/* renamed from: tg.f  reason: case insensitive filesystem */
public final class C6740f {

    /* renamed from: a  reason: collision with root package name */
    private final b f73554a;

    /* renamed from: b  reason: collision with root package name */
    private final int f73555b;

    public C6740f(b bVar, int i10) {
        C6496s.h(bVar, "classId");
        this.f73554a = bVar;
        this.f73555b = i10;
    }

    public final b a() {
        return this.f73554a;
    }

    public final int b() {
        return this.f73555b;
    }

    public final int c() {
        return this.f73555b;
    }

    public final b d() {
        return this.f73554a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6740f)) {
            return false;
        }
        C6740f fVar = (C6740f) obj;
        if (C6496s.c(this.f73554a, fVar.f73554a) && this.f73555b == fVar.f73555b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f73554a.hashCode() * 31) + Integer.hashCode(this.f73555b);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f73555b;
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("kotlin/Array<");
        }
        sb2.append(this.f73554a);
        int i12 = this.f73555b;
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append(">");
        }
        String sb3 = sb2.toString();
        C6496s.g(sb3, "toString(...)");
        return sb3;
    }
}
