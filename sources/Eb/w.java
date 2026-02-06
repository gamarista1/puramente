package Eb;

import ic.C5027b;

public class w implements C5027b {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f50746c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile Object f50747a = f50746c;

    /* renamed from: b  reason: collision with root package name */
    private volatile C5027b f50748b;

    public w(C5027b bVar) {
        this.f50748b = bVar;
    }

    public Object get() {
        Object obj = this.f50747a;
        Object obj2 = f50746c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f50747a;
                    if (obj == obj2) {
                        obj = this.f50748b.get();
                        this.f50747a = obj;
                        this.f50748b = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return obj;
    }
}
