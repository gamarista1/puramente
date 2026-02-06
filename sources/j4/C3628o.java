package j4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import mf.O;
import o4.C3880c;
import zf.C6828a;

/* renamed from: j4.o  reason: case insensitive filesystem */
public final class C3628o implements Iterable, C6828a {

    /* renamed from: b  reason: collision with root package name */
    public static final b f44766b = new b((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final C3628o f44767c = new C3628o();
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Map f44768a;

    /* renamed from: j4.o$b */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* renamed from: j4.o$c */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final Object f44770a;

        /* renamed from: b  reason: collision with root package name */
        private final String f44771b;

        public c(Object obj, String str) {
            this.f44770a = obj;
            this.f44771b = str;
        }

        public final String a() {
            return this.f44771b;
        }

        public final Object b() {
            return this.f44770a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (!C6496s.c(this.f44770a, cVar.f44770a) || !C6496s.c(this.f44771b, cVar.f44771b)) {
                    return false;
                }
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i10;
            Object obj = this.f44770a;
            int i11 = 0;
            if (obj != null) {
                i10 = obj.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = i10 * 31;
            String str = this.f44771b;
            if (str != null) {
                i11 = str.hashCode();
            }
            return i12 + i11;
        }

        public String toString() {
            return "Entry(value=" + this.f44770a + ", memoryCacheKey=" + this.f44771b + ')';
        }
    }

    public /* synthetic */ C3628o(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public final Map b() {
        if (isEmpty()) {
            return O.i();
        }
        Map map = this.f44768a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String a10 = ((c) entry.getValue()).a();
            if (a10 != null) {
                linkedHashMap.put(entry.getKey(), a10);
            }
        }
        return linkedHashMap;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3628o) || !C6496s.c(this.f44768a, ((C3628o) obj).f44768a)) {
            return false;
        }
        return true;
    }

    public final a g() {
        return new a(this);
    }

    public int hashCode() {
        return this.f44768a.hashCode();
    }

    public final boolean isEmpty() {
        return this.f44768a.isEmpty();
    }

    public Iterator iterator() {
        Map map = this.f44768a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(C6502A.a((String) entry.getKey(), (c) entry.getValue()));
        }
        return arrayList.iterator();
    }

    public final Object k(String str) {
        c cVar = (c) this.f44768a.get(str);
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    public String toString() {
        return "Parameters(entries=" + this.f44768a + ')';
    }

    /* renamed from: j4.o$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Map f44769a;

        public a() {
            this.f44769a = new LinkedHashMap();
        }

        public final C3628o a() {
            return new C3628o(C3880c.b(this.f44769a), (DefaultConstructorMarker) null);
        }

        public final a b(String str, Object obj, String str2) {
            this.f44769a.put(str, new c(obj, str2));
            return this;
        }

        public a(C3628o oVar) {
            this.f44769a = O.B(oVar.f44768a);
        }
    }

    private C3628o(Map map) {
        this.f44768a = map;
    }

    public C3628o() {
        this(O.i());
    }
}
