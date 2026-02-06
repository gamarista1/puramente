package Eb;

import ic.C5027b;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

class x implements C5027b {

    /* renamed from: a  reason: collision with root package name */
    private volatile Set f50749a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: b  reason: collision with root package name */
    private volatile Set f50750b = null;

    x(Collection collection) {
        this.f50749a.addAll(collection);
    }

    static x b(Collection collection) {
        return new x((Set) collection);
    }

    private synchronized void d() {
        try {
            for (C5027b bVar : this.f50749a) {
                this.f50750b.add(bVar.get());
            }
            this.f50749a = null;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(C5027b bVar) {
        try {
            if (this.f50750b == null) {
                this.f50749a.add(bVar);
            } else {
                this.f50750b.add(bVar.get());
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public Set get() {
        if (this.f50750b == null) {
            synchronized (this) {
                try {
                    if (this.f50750b == null) {
                        this.f50750b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return Collections.unmodifiableSet(this.f50750b);
    }
}
