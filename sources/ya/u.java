package ya;

import java.lang.ref.WeakReference;

abstract class u extends s {

    /* renamed from: c  reason: collision with root package name */
    private static final WeakReference f62295c = new WeakReference((Object) null);

    /* renamed from: b  reason: collision with root package name */
    private WeakReference f62296b = f62295c;

    u(byte[] bArr) {
        super(bArr);
    }

    /* access modifiers changed from: package-private */
    public final byte[] r1() {
        byte[] bArr;
        synchronized (this) {
            try {
                bArr = (byte[]) this.f62296b.get();
                if (bArr == null) {
                    bArr = s1();
                    this.f62296b = new WeakReference(bArr);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    public abstract byte[] s1();
}
