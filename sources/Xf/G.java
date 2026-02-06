package Xf;

import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6531o;
import mf.C6565s;
import mf.O;

public final class G {

    /* renamed from: a  reason: collision with root package name */
    private final O f66252a;

    /* renamed from: b  reason: collision with root package name */
    private final O f66253b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f66254c;

    /* renamed from: d  reason: collision with root package name */
    private final Lazy f66255d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f66256e;

    public G(O o10, O o11, Map map) {
        C6496s.h(o10, "globalLevel");
        C6496s.h(map, "userDefinedLevelForSpecificAnnotation");
        this.f66252a = o10;
        this.f66253b = o11;
        this.f66254c = map;
        this.f66255d = C6531o.b(new F(this));
        O o12 = O.IGNORE;
        this.f66256e = o10 == o12 && o11 == o12 && map.isEmpty();
    }

    /* access modifiers changed from: private */
    public static final String[] b(G g10) {
        List c10 = C6565s.c();
        c10.add(g10.f66252a.b());
        O o10 = g10.f66253b;
        if (o10 != null) {
            c10.add("under-migration:" + o10.b());
        }
        for (Map.Entry entry : g10.f66254c.entrySet()) {
            c10.add('@' + entry.getKey() + ':' + ((O) entry.getValue()).b());
        }
        return (String[]) C6565s.a(c10).toArray(new String[0]);
    }

    public final O c() {
        return this.f66252a;
    }

    public final O d() {
        return this.f66253b;
    }

    public final Map e() {
        return this.f66254c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g10 = (G) obj;
        if (this.f66252a == g10.f66252a && this.f66253b == g10.f66253b && C6496s.c(this.f66254c, g10.f66254c)) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f66256e;
    }

    public int hashCode() {
        int i10;
        int hashCode = this.f66252a.hashCode() * 31;
        O o10 = this.f66253b;
        if (o10 == null) {
            i10 = 0;
        } else {
            i10 = o10.hashCode();
        }
        return ((hashCode + i10) * 31) + this.f66254c.hashCode();
    }

    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f66252a + ", migrationLevel=" + this.f66253b + ", userDefinedLevelForSpecificAnnotation=" + this.f66254c + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ G(O o10, O o11, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(o10, (i10 & 2) != 0 ? null : o11, (i10 & 4) != 0 ? O.i() : map);
    }
}
