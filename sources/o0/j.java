package O0;

import androidx.compose.ui.platform.E0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import lf.C6525i;
import yf.C6787a;
import zf.C6828a;

public final class j implements v, Iterable, C6828a {

    /* renamed from: a  reason: collision with root package name */
    private final Map f4582a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private boolean f4583b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4584c;

    public final void A(j jVar) {
        for (Map.Entry entry : jVar.f4582a.entrySet()) {
            u uVar = (u) entry.getKey();
            Object value = entry.getValue();
            Object obj = this.f4582a.get(uVar);
            C6496s.f(uVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object c10 = uVar.c(obj, value);
            if (c10 != null) {
                this.f4582a.put(uVar, c10);
            }
        }
    }

    public final void C(boolean z10) {
        this.f4584c = z10;
    }

    public final void D(boolean z10) {
        this.f4583b = z10;
    }

    public void a(u uVar, Object obj) {
        if (!(obj instanceof a) || !g(uVar)) {
            this.f4582a.put(uVar, obj);
            return;
        }
        Object obj2 = this.f4582a.get(uVar);
        C6496s.f(obj2, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        a aVar = (a) obj2;
        Map map = this.f4582a;
        a aVar2 = (a) obj;
        String b10 = aVar2.b();
        if (b10 == null) {
            b10 = aVar.b();
        }
        C6525i a10 = aVar2.a();
        if (a10 == null) {
            a10 = aVar.a();
        }
        map.put(uVar, new a(b10, a10));
    }

    public final void b(j jVar) {
        if (jVar.f4583b) {
            this.f4583b = true;
        }
        if (jVar.f4584c) {
            this.f4584c = true;
        }
        for (Map.Entry entry : jVar.f4582a.entrySet()) {
            u uVar = (u) entry.getKey();
            Object value = entry.getValue();
            if (!this.f4582a.containsKey(uVar)) {
                this.f4582a.put(uVar, value);
            } else if (value instanceof a) {
                Object obj = this.f4582a.get(uVar);
                C6496s.f(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                a aVar = (a) obj;
                Map map = this.f4582a;
                String b10 = aVar.b();
                if (b10 == null) {
                    b10 = ((a) value).b();
                }
                C6525i a10 = aVar.a();
                if (a10 == null) {
                    a10 = ((a) value).a();
                }
                map.put(uVar, new a(b10, a10));
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (C6496s.c(this.f4582a, jVar.f4582a) && this.f4583b == jVar.f4583b && this.f4584c == jVar.f4584c) {
            return true;
        }
        return false;
    }

    public final boolean g(u uVar) {
        return this.f4582a.containsKey(uVar);
    }

    public int hashCode() {
        return (((this.f4582a.hashCode() * 31) + Boolean.hashCode(this.f4583b)) * 31) + Boolean.hashCode(this.f4584c);
    }

    public Iterator iterator() {
        return this.f4582a.entrySet().iterator();
    }

    public final boolean k() {
        Iterable<u> keySet = this.f4582a.keySet();
        if ((keySet instanceof Collection) && ((Collection) keySet).isEmpty()) {
            return false;
        }
        for (u b10 : keySet) {
            if (b10.b()) {
                return true;
            }
        }
        return false;
    }

    public final j n() {
        j jVar = new j();
        jVar.f4583b = this.f4583b;
        jVar.f4584c = this.f4584c;
        jVar.f4582a.putAll(this.f4582a);
        return jVar;
    }

    public final Object r(u uVar) {
        Object obj = this.f4582a.get(uVar);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Key not present: " + uVar + " - consider getOrElse or getOrNull");
    }

    public final Object t(u uVar, C6787a aVar) {
        Object obj = this.f4582a.get(uVar);
        if (obj == null) {
            return aVar.invoke();
        }
        return obj;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = "";
        if (this.f4583b) {
            sb2.append(str);
            sb2.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.f4584c) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f4582a.entrySet()) {
            Object value = entry.getValue();
            sb2.append(str);
            sb2.append(((u) entry.getKey()).a());
            sb2.append(" : ");
            sb2.append(value);
            str = ", ";
        }
        return E0.a(this, (String) null) + "{ " + sb2 + " }";
    }

    public final Object v(u uVar, C6787a aVar) {
        Object obj = this.f4582a.get(uVar);
        if (obj == null) {
            return aVar.invoke();
        }
        return obj;
    }

    public final boolean x() {
        return this.f4584c;
    }

    public final boolean z() {
        return this.f4583b;
    }
}
