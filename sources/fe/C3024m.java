package Fe;

import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* renamed from: Fe.m  reason: case insensitive filesystem */
public class C3024m {

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f31131b = Pattern.compile("\\p{XDigit}+");

    /* renamed from: a  reason: collision with root package name */
    private final ConcurrentHashMap f31132a = new ConcurrentHashMap();

    private void b(String str, String str2, String str3) {
        h(str3).put(str, str2);
    }

    /* access modifiers changed from: package-private */
    public void a(String str, String str2) {
        if (g(str2)) {
            b(str, str2, "fb");
        } else {
            C3023l.m("Invalid partner parameter passed. Value must be a SHA 256 hash.");
        }
    }

    /* access modifiers changed from: package-private */
    public void c(String str, String str2) {
        if (g(str2)) {
            b(str, str2, "snap");
        } else {
            C3023l.m("Invalid partner parameter passed. Value must be a SHA 256 hash.");
        }
    }

    /* access modifiers changed from: package-private */
    public ConcurrentHashMap d() {
        return this.f31132a;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        this.f31132a.clear();
    }

    /* access modifiers changed from: package-private */
    public boolean f(String str) {
        if (str == null) {
            return false;
        }
        if (str.length() == 0) {
            return true;
        }
        return f31131b.matcher(str).matches();
    }

    /* access modifiers changed from: package-private */
    public boolean g(String str) {
        if (str == null || str.length() != 64 || !f(str)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public ConcurrentHashMap h(String str) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f31132a.get(str);
        if (concurrentHashMap != null) {
            return concurrentHashMap;
        }
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        this.f31132a.put(str, concurrentHashMap2);
        return concurrentHashMap2;
    }
}
