package com.google.firebase.storage;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

class E {

    /* renamed from: c  reason: collision with root package name */
    private static final E f57989c = new E();

    /* renamed from: a  reason: collision with root package name */
    private final Map f57990a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Object f57991b = new Object();

    E() {
    }

    static E b() {
        return f57989c;
    }

    public void a(D d10) {
        synchronized (this.f57991b) {
            this.f57990a.put(d10.I().toString(), new WeakReference(d10));
        }
    }

    public void c(D d10) {
        D d11;
        synchronized (this.f57991b) {
            try {
                String oVar = d10.I().toString();
                WeakReference weakReference = (WeakReference) this.f57990a.get(oVar);
                if (weakReference != null) {
                    d11 = (D) weakReference.get();
                } else {
                    d11 = null;
                }
                if (d11 == null || d11 == d10) {
                    this.f57990a.remove(oVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
