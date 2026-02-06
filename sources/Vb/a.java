package Vb;

import java.io.IOException;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f53430a;

    /* renamed from: b  reason: collision with root package name */
    private final Map f53431b;

    public a(String str, Map map) {
        this.f53430a = str;
        this.f53431b = map;
    }

    public static a c(String str) {
        if (!str.startsWith("gauth|")) {
            return null;
        }
        try {
            Map a10 = b.a(str.substring(6));
            return new a((String) a10.get("token"), (Map) a10.get("auth"));
        } catch (IOException e10) {
            throw new RuntimeException("Failed to parse gauth token", e10);
        }
    }

    public Map a() {
        return this.f53431b;
    }

    public String b() {
        return this.f53430a;
    }
}
