package Hc;

import kotlin.jvm.internal.C6496s;

/* renamed from: Hc.e  reason: case insensitive filesystem */
public final class C4302e {

    /* renamed from: a  reason: collision with root package name */
    private final C4301d f51012a;

    /* renamed from: b  reason: collision with root package name */
    private final C4301d f51013b;

    /* renamed from: c  reason: collision with root package name */
    private final double f51014c;

    public C4302e(C4301d dVar, C4301d dVar2, double d10) {
        C6496s.h(dVar, "performance");
        C6496s.h(dVar2, "crashlytics");
        this.f51012a = dVar;
        this.f51013b = dVar2;
        this.f51014c = d10;
    }

    public final C4301d a() {
        return this.f51013b;
    }

    public final C4301d b() {
        return this.f51012a;
    }

    public final double c() {
        return this.f51014c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4302e)) {
            return false;
        }
        C4302e eVar = (C4302e) obj;
        if (this.f51012a == eVar.f51012a && this.f51013b == eVar.f51013b && Double.compare(this.f51014c, eVar.f51014c) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f51012a.hashCode() * 31) + this.f51013b.hashCode()) * 31) + Double.hashCode(this.f51014c);
    }

    public String toString() {
        return "DataCollectionStatus(performance=" + this.f51012a + ", crashlytics=" + this.f51013b + ", sessionSamplingRate=" + this.f51014c + ')';
    }
}
