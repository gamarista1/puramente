package f9;

import i9.C3597a;
import java.util.Map;

/* renamed from: f9.b  reason: case insensitive filesystem */
final class C3521b extends f {

    /* renamed from: a  reason: collision with root package name */
    private final C3597a f43475a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f43476b;

    C3521b(C3597a aVar, Map map) {
        if (aVar != null) {
            this.f43475a = aVar;
            if (map != null) {
                this.f43476b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    /* access modifiers changed from: package-private */
    public C3597a e() {
        return this.f43475a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.f43475a.equals(fVar.e()) || !this.f43476b.equals(fVar.h())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public Map h() {
        return this.f43476b;
    }

    public int hashCode() {
        return ((this.f43475a.hashCode() ^ 1000003) * 1000003) ^ this.f43476b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f43475a + ", values=" + this.f43476b + "}";
    }
}
