package w;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: w.Y  reason: case insensitive filesystem */
public abstract /* synthetic */ class C2780Y {
    public static /* synthetic */ boolean a(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
