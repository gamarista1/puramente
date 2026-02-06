package k2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class t {

    /* renamed from: a  reason: collision with root package name */
    private final Map f23266a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private Map f23267b;

    public synchronized Map a() {
        try {
            if (this.f23267b == null) {
                this.f23267b = Collections.unmodifiableMap(new HashMap(this.f23266a));
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f23267b;
    }
}
