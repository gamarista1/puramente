package com.bugsnag.android;

import K4.s;
import K4.v;
import com.bugsnag.android.K0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.V;
import mf.C6565s;

public final class Y0 implements K0.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f38641c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Map f38642a;

    /* renamed from: b  reason: collision with root package name */
    private final C3239g1 f38643b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(Map map, String str, Map map2) {
            Object obj = map.get(str);
            Object obj2 = map2.get(str);
            if (obj2 != null) {
                if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
                    map.put(str, obj2);
                    return;
                }
                map.put(str, c(C6565s.q((Map) obj, (Map) obj2)));
            } else if (obj != null) {
                map.put(str, obj);
            }
        }

        public final Y0 b(Y0... y0Arr) {
            ArrayList arrayList = new ArrayList(y0Arr.length);
            int length = y0Arr.length;
            int i10 = 0;
            int i11 = 0;
            while (i11 < length) {
                Y0 y02 = y0Arr[i11];
                i11++;
                arrayList.add(y02.n());
            }
            ArrayList arrayList2 = new ArrayList();
            int length2 = y0Arr.length;
            while (i10 < length2) {
                Y0 y03 = y0Arr[i10];
                i10++;
                C6565s.D(arrayList2, y03.g().c());
            }
            Y0 y04 = new Y0(V.d(c(arrayList)));
            y04.m(C6565s.j1(arrayList2));
            return y04;
        }

        public final Map c(List list) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C6565s.D(arrayList, ((Map) it.next()).keySet());
            }
            Set<String> j12 = C6565s.j1(arrayList);
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Map map = (Map) it2.next();
                for (String a10 : j12) {
                    a(concurrentHashMap, a10, map);
                }
            }
            return concurrentHashMap;
        }

        private a() {
        }
    }

    public Y0() {
        this((Map) null, 1, (DefaultConstructorMarker) null);
    }

    private final void l(Map map, String str, Object obj) {
        Object obj2 = map.get(str);
        if (obj2 != null && (obj instanceof Map)) {
            obj = f38641c.c(C6565s.q((Map) obj2, (Map) obj));
        }
        map.put(str, obj);
    }

    public void a(String str, String str2, Object obj) {
        if (obj == null) {
            d(str, str2);
            return;
        }
        Map map = (Map) this.f38642a.get(str);
        if (map == null) {
            map = new ConcurrentHashMap();
        }
        this.f38642a.put(str, map);
        l(map, str2, obj);
    }

    public void b(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            a(str, (String) entry.getKey(), entry.getValue());
        }
    }

    public void c(String str) {
        this.f38642a.remove(str);
    }

    public void d(String str, String str2) {
        Map map = (Map) this.f38642a.get(str);
        if (map != null) {
            map.remove(str2);
        }
        if (map == null || map.isEmpty()) {
            this.f38642a.remove(str);
        }
    }

    public final Y0 e() {
        Y0 f10 = f(n());
        f10.m(C6565s.j1(j()));
        return f10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Y0) && C6496s.c(this.f38642a, ((Y0) obj).f38642a);
    }

    public final Y0 f(Map map) {
        return new Y0(map);
    }

    public final C3239g1 g() {
        return this.f38643b;
    }

    public Object h(String str, String str2) {
        Map i10 = i(str);
        if (i10 == null) {
            return null;
        }
        return i10.get(str2);
    }

    public int hashCode() {
        return this.f38642a.hashCode();
    }

    public Map i(String str) {
        return (Map) this.f38642a.get(str);
    }

    public final Set j() {
        return this.f38643b.c();
    }

    public final Map k() {
        return this.f38642a;
    }

    public final void m(Set set) {
        this.f38643b.h(set);
    }

    public final Map n() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(this.f38642a);
        for (Map.Entry entry : this.f38642a.entrySet()) {
            concurrentHashMap.put(entry.getKey(), new ConcurrentHashMap((Map) entry.getValue()));
        }
        return concurrentHashMap;
    }

    public final v o(int i10) {
        int i11 = 0;
        int i12 = 0;
        for (Map.Entry value : this.f38642a.entrySet()) {
            v e10 = s.f32405a.e(i10, V.d(value.getValue()));
            i11 += e10.d();
            i12 += e10.c();
        }
        return new v(i11, i12);
    }

    public void toStream(K0 k02) {
        this.f38643b.f(this.f38642a, k02, true);
    }

    public String toString() {
        return "Metadata(store=" + this.f38642a + ')';
    }

    public Y0(Map map) {
        this.f38642a = map;
        this.f38643b = new C3239g1();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y0(Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ConcurrentHashMap() : map);
    }
}
