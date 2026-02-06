package rh;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C6496s;

/* renamed from: rh.h  reason: case insensitive filesystem */
public final class C6711h {

    /* renamed from: a  reason: collision with root package name */
    private final String f73279a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f73280b;

    public C6711h(String str, Map map) {
        String str2;
        C6496s.h(str, "scheme");
        C6496s.h(map, "authParams");
        this.f73279a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            if (str3 != null) {
                Locale locale = Locale.US;
                C6496s.g(locale, "US");
                str2 = str3.toLowerCase(locale);
                C6496s.g(str2, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str2 = null;
            }
            linkedHashMap.put(str2, str4);
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        C6496s.g(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f73280b = unmodifiableMap;
    }

    public final Charset a() {
        String str = (String) this.f73280b.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                C6496s.g(forName, "forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        C6496s.g(charset, "ISO_8859_1");
        return charset;
    }

    public final String b() {
        return (String) this.f73280b.get("realm");
    }

    public final String c() {
        return this.f73279a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6711h) {
            C6711h hVar = (C6711h) obj;
            if (!C6496s.c(hVar.f73279a, this.f73279a) || !C6496s.c(hVar.f73280b, this.f73280b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.f73279a.hashCode()) * 31) + this.f73280b.hashCode();
    }

    public String toString() {
        return this.f73279a + " authParams=" + this.f73280b;
    }
}
