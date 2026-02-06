package Z8;

import android.content.Context;
import i9.C3597a;

final class c extends h {

    /* renamed from: a  reason: collision with root package name */
    private final Context f35959a;

    /* renamed from: b  reason: collision with root package name */
    private final C3597a f35960b;

    /* renamed from: c  reason: collision with root package name */
    private final C3597a f35961c;

    /* renamed from: d  reason: collision with root package name */
    private final String f35962d;

    c(Context context, C3597a aVar, C3597a aVar2, String str) {
        if (context != null) {
            this.f35959a = context;
            if (aVar != null) {
                this.f35960b = aVar;
                if (aVar2 != null) {
                    this.f35961c = aVar2;
                    if (str != null) {
                        this.f35962d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public Context b() {
        return this.f35959a;
    }

    public String c() {
        return this.f35962d;
    }

    public C3597a d() {
        return this.f35961c;
    }

    public C3597a e() {
        return this.f35960b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (!this.f35959a.equals(hVar.b()) || !this.f35960b.equals(hVar.e()) || !this.f35961c.equals(hVar.d()) || !this.f35962d.equals(hVar.c())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.f35959a.hashCode() ^ 1000003) * 1000003) ^ this.f35960b.hashCode()) * 1000003) ^ this.f35961c.hashCode()) * 1000003) ^ this.f35962d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f35959a + ", wallClock=" + this.f35960b + ", monotonicClock=" + this.f35961c + ", backendName=" + this.f35962d + "}";
    }
}
