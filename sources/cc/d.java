package Cc;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class d {

    /* renamed from: b  reason: collision with root package name */
    private static volatile d f50394b;

    /* renamed from: a  reason: collision with root package name */
    private final Set f50395a = new HashSet();

    d() {
    }

    public static d a() {
        d dVar = f50394b;
        if (dVar == null) {
            synchronized (d.class) {
                try {
                    dVar = f50394b;
                    if (dVar == null) {
                        dVar = new d();
                        f50394b = dVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return dVar;
    }

    /* access modifiers changed from: package-private */
    public Set b() {
        Set unmodifiableSet;
        synchronized (this.f50395a) {
            unmodifiableSet = Collections.unmodifiableSet(this.f50395a);
        }
        return unmodifiableSet;
    }
}
