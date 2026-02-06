package y7;

import com.facebook.C3286a;
import com.facebook.C3320j;
import java.util.Set;
import kotlin.jvm.internal.C6496s;

public final class F {

    /* renamed from: a  reason: collision with root package name */
    private final C3286a f49603a;

    /* renamed from: b  reason: collision with root package name */
    private final C3320j f49604b;

    /* renamed from: c  reason: collision with root package name */
    private final Set f49605c;

    /* renamed from: d  reason: collision with root package name */
    private final Set f49606d;

    public F(C3286a aVar, C3320j jVar, Set set, Set set2) {
        C6496s.h(aVar, "accessToken");
        C6496s.h(set, "recentlyGrantedPermissions");
        C6496s.h(set2, "recentlyDeniedPermissions");
        this.f49603a = aVar;
        this.f49604b = jVar;
        this.f49605c = set;
        this.f49606d = set2;
    }

    public final C3286a a() {
        return this.f49603a;
    }

    public final Set b() {
        return this.f49606d;
    }

    public final Set c() {
        return this.f49605c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        if (C6496s.c(this.f49603a, f10.f49603a) && C6496s.c(this.f49604b, f10.f49604b) && C6496s.c(this.f49605c, f10.f49605c) && C6496s.c(this.f49606d, f10.f49606d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.f49603a.hashCode() * 31;
        C3320j jVar = this.f49604b;
        if (jVar == null) {
            i10 = 0;
        } else {
            i10 = jVar.hashCode();
        }
        return ((((hashCode + i10) * 31) + this.f49605c.hashCode()) * 31) + this.f49606d.hashCode();
    }

    public String toString() {
        return "LoginResult(accessToken=" + this.f49603a + ", authenticationToken=" + this.f49604b + ", recentlyGrantedPermissions=" + this.f49605c + ", recentlyDeniedPermissions=" + this.f49606d + ')';
    }
}
