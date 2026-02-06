package c7;

import U5.a;

/* renamed from: c7.g  reason: case insensitive filesystem */
public abstract class C3187g extends C3181a {
    /* access modifiers changed from: protected */
    public void finalize() {
        if (!isClosed()) {
            a.K("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }
}
