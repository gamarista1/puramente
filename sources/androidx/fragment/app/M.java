package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.a0;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

final class M extends a0 {

    /* renamed from: h  reason: collision with root package name */
    private static final c0.c f16778h = new a();

    /* renamed from: a  reason: collision with root package name */
    private final HashMap f16779a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap f16780b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap f16781c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final boolean f16782d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f16783e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f16784f = false;

    /* renamed from: g  reason: collision with root package name */
    private boolean f16785g = false;

    class a implements c0.c {
        a() {
        }

        public a0 create(Class cls) {
            return new M(true);
        }
    }

    M(boolean z10) {
        this.f16782d = z10;
    }

    private void e(String str, boolean z10) {
        M m10 = (M) this.f16780b.get(str);
        if (m10 != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(m10.f16780b.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m10.d((String) it.next(), true);
                }
            }
            m10.onCleared();
            this.f16780b.remove(str);
        }
        d0 d0Var = (d0) this.f16781c.get(str);
        if (d0Var != null) {
            d0Var.a();
            this.f16781c.remove(str);
        }
    }

    static M h(d0 d0Var) {
        return (M) new c0(d0Var, f16778h).b(M.class);
    }

    /* access modifiers changed from: package-private */
    public void b(C1769q qVar) {
        if (this.f16785g) {
            if (J.L0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (!this.f16779a.containsKey(qVar.mWho)) {
            this.f16779a.put(qVar.mWho, qVar);
            if (J.L0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + qVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(C1769q qVar, boolean z10) {
        if (J.L0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + qVar);
        }
        e(qVar.mWho, z10);
    }

    /* access modifiers changed from: package-private */
    public void d(String str, boolean z10) {
        if (J.L0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        e(str, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || M.class != obj.getClass()) {
            return false;
        }
        M m10 = (M) obj;
        if (!this.f16779a.equals(m10.f16779a) || !this.f16780b.equals(m10.f16780b) || !this.f16781c.equals(m10.f16781c)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public C1769q f(String str) {
        return (C1769q) this.f16779a.get(str);
    }

    /* access modifiers changed from: package-private */
    public M g(C1769q qVar) {
        M m10 = (M) this.f16780b.get(qVar.mWho);
        if (m10 != null) {
            return m10;
        }
        M m11 = new M(this.f16782d);
        this.f16780b.put(qVar.mWho, m11);
        return m11;
    }

    public int hashCode() {
        return (((this.f16779a.hashCode() * 31) + this.f16780b.hashCode()) * 31) + this.f16781c.hashCode();
    }

    /* access modifiers changed from: package-private */
    public Collection i() {
        return new ArrayList(this.f16779a.values());
    }

    /* access modifiers changed from: package-private */
    public d0 j(C1769q qVar) {
        d0 d0Var = (d0) this.f16781c.get(qVar.mWho);
        if (d0Var != null) {
            return d0Var;
        }
        d0 d0Var2 = new d0();
        this.f16781c.put(qVar.mWho, d0Var2);
        return d0Var2;
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        return this.f16783e;
    }

    /* access modifiers changed from: package-private */
    public void l(C1769q qVar) {
        if (this.f16785g) {
            if (J.L0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.f16779a.remove(qVar.mWho) != null && J.L0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + qVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void m(boolean z10) {
        this.f16785g = z10;
    }

    /* access modifiers changed from: package-private */
    public boolean n(C1769q qVar) {
        if (!this.f16779a.containsKey(qVar.mWho)) {
            return true;
        }
        if (this.f16782d) {
            return this.f16783e;
        }
        return !this.f16784f;
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        if (J.L0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f16783e = true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f16779a.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f16780b.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f16781c.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
