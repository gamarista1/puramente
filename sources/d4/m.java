package d4;

import a4.C3114g;
import a4.S;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class m extends C3471h {

    /* renamed from: a  reason: collision with root package name */
    private final S f43133a;

    /* renamed from: b  reason: collision with root package name */
    private final String f43134b;

    /* renamed from: c  reason: collision with root package name */
    private final C3114g f43135c;

    public m(S s10, String str, C3114g gVar) {
        super((DefaultConstructorMarker) null);
        this.f43133a = s10;
        this.f43134b = str;
        this.f43135c = gVar;
    }

    public final C3114g a() {
        return this.f43135c;
    }

    public final String b() {
        return this.f43134b;
    }

    public final S c() {
        return this.f43133a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (!C6496s.c(this.f43133a, mVar.f43133a) || !C6496s.c(this.f43134b, mVar.f43134b) || this.f43135c != mVar.f43135c) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.f43133a.hashCode() * 31;
        String str = this.f43134b;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return ((hashCode + i10) * 31) + this.f43135c.hashCode();
    }
}
