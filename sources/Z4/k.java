package Z4;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class k implements i {

    /* renamed from: c  reason: collision with root package name */
    private final Map f35883c;

    /* renamed from: d  reason: collision with root package name */
    private volatile Map f35884d;

    public static final class a {

        /* renamed from: d  reason: collision with root package name */
        private static final String f35885d;

        /* renamed from: e  reason: collision with root package name */
        private static final Map f35886e;

        /* renamed from: a  reason: collision with root package name */
        private boolean f35887a = true;

        /* renamed from: b  reason: collision with root package name */
        private Map f35888b = f35886e;

        /* renamed from: c  reason: collision with root package name */
        private boolean f35889c = true;

        static {
            String g10 = g();
            f35885d = g10;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(g10)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(g10)));
            }
            f35886e = Collections.unmodifiableMap(hashMap);
        }

        private Map d() {
            HashMap hashMap = new HashMap(this.f35888b.size());
            for (Map.Entry entry : this.f35888b.entrySet()) {
                hashMap.put(entry.getKey(), new ArrayList((Collection) entry.getValue()));
            }
            return hashMap;
        }

        private void e() {
            if (this.f35887a) {
                this.f35887a = false;
                this.f35888b = d();
            }
        }

        private List f(String str) {
            List list = (List) this.f35888b.get(str);
            if (list != null) {
                return list;
            }
            ArrayList arrayList = new ArrayList();
            this.f35888b.put(str, arrayList);
            return arrayList;
        }

        static String g() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb2 = new StringBuilder(property.length());
            for (int i10 = 0; i10 < length; i10++) {
                char charAt = property.charAt(i10);
                if ((charAt > 31 || charAt == 9) && charAt < 127) {
                    sb2.append(charAt);
                } else {
                    sb2.append('?');
                }
            }
            return sb2.toString();
        }

        public a a(String str, j jVar) {
            if (this.f35889c && "User-Agent".equalsIgnoreCase(str)) {
                return h(str, jVar);
            }
            e();
            f(str).add(jVar);
            return this;
        }

        public a b(String str, String str2) {
            return a(str, new b(str2));
        }

        public k c() {
            this.f35887a = true;
            return new k(this.f35888b);
        }

        public a h(String str, j jVar) {
            e();
            if (jVar == null) {
                this.f35888b.remove(str);
            } else {
                List f10 = f(str);
                f10.clear();
                f10.add(jVar);
            }
            if (this.f35889c && "User-Agent".equalsIgnoreCase(str)) {
                this.f35889c = false;
            }
            return this;
        }
    }

    static final class b implements j {

        /* renamed from: a  reason: collision with root package name */
        private final String f35890a;

        b(String str) {
            this.f35890a = str;
        }

        public String a() {
            return this.f35890a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f35890a.equals(((b) obj).f35890a);
            }
            return false;
        }

        public int hashCode() {
            return this.f35890a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.f35890a + '\'' + '}';
        }
    }

    k(Map map) {
        this.f35883c = Collections.unmodifiableMap(map);
    }

    private String b(List list) {
        StringBuilder sb2 = new StringBuilder();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            String a10 = ((j) list.get(i10)).a();
            if (!TextUtils.isEmpty(a10)) {
                sb2.append(a10);
                if (i10 != list.size() - 1) {
                    sb2.append(',');
                }
            }
        }
        return sb2.toString();
    }

    private Map c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f35883c.entrySet()) {
            String b10 = b((List) entry.getValue());
            if (!TextUtils.isEmpty(b10)) {
                hashMap.put(entry.getKey(), b10);
            }
        }
        return hashMap;
    }

    public Map a() {
        if (this.f35884d == null) {
            synchronized (this) {
                try {
                    if (this.f35884d == null) {
                        this.f35884d = Collections.unmodifiableMap(c());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f35884d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k) {
            return this.f35883c.equals(((k) obj).f35883c);
        }
        return false;
    }

    public int hashCode() {
        return this.f35883c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f35883c + '}';
    }
}
