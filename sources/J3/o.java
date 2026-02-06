package j3;

import androidx.lifecycle.a0;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class o extends a0 implements C2127D {

    /* renamed from: b  reason: collision with root package name */
    public static final b f22901b = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final c0.c f22902c = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Map f22903a = new LinkedHashMap();

    public static final class a implements c0.c {
        a() {
        }

        public a0 create(Class cls) {
            C6496s.h(cls, "modelClass");
            return new o();
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o a(d0 d0Var) {
            C6496s.h(d0Var, "viewModelStore");
            return (o) new c0(d0Var, o.f22902c, (Z1.a) null, 4, (DefaultConstructorMarker) null).b(o.class);
        }

        private b() {
        }
    }

    public d0 a(String str) {
        C6496s.h(str, "backStackEntryId");
        d0 d0Var = (d0) this.f22903a.get(str);
        if (d0Var != null) {
            return d0Var;
        }
        d0 d0Var2 = new d0();
        this.f22903a.put(str, d0Var2);
        return d0Var2;
    }

    public final void c(String str) {
        C6496s.h(str, "backStackEntryId");
        d0 d0Var = (d0) this.f22903a.remove(str);
        if (d0Var != null) {
            d0Var.a();
        }
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        for (d0 a10 : this.f22903a.values()) {
            a10.a();
        }
        this.f22903a.clear();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} ViewModelStores (");
        Iterator it = this.f22903a.keySet().iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        String sb3 = sb2.toString();
        C6496s.g(sb3, "sb.toString()");
        return sb3;
    }
}
