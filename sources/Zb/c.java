package Zb;

import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f53541a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f53542b;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f53543a;

        /* renamed from: b  reason: collision with root package name */
        private Map f53544b = null;

        b(String str) {
            this.f53543a = str;
        }

        public c a() {
            Map map;
            String str = this.f53543a;
            if (this.f53544b == null) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(new HashMap(this.f53544b));
            }
            return new c(str, map);
        }

        public b b(Annotation annotation) {
            if (this.f53544b == null) {
                this.f53544b = new HashMap();
            }
            this.f53544b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    public static b a(String str) {
        return new b(str);
    }

    public static c d(String str) {
        return new c(str, Collections.emptyMap());
    }

    public String b() {
        return this.f53541a;
    }

    public Annotation c(Class cls) {
        return (Annotation) this.f53542b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f53541a.equals(cVar.f53541a) || !this.f53542b.equals(cVar.f53542b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f53541a.hashCode() * 31) + this.f53542b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f53541a + ", properties=" + this.f53542b.values() + "}";
    }

    private c(String str, Map map) {
        this.f53541a = str;
        this.f53542b = map;
    }
}
