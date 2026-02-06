package nb;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: nb.b  reason: case insensitive filesystem */
abstract class C5107b implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    private C0897b f61072a = C0897b.NOT_READY;

    /* renamed from: b  reason: collision with root package name */
    private Object f61073b;

    /* renamed from: nb.b$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f61074a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                nb.b$b[] r0 = nb.C5107b.C0897b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f61074a = r0
                nb.b$b r1 = nb.C5107b.C0897b.DONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f61074a     // Catch:{ NoSuchFieldError -> 0x001d }
                nb.b$b r1 = nb.C5107b.C0897b.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: nb.C5107b.a.<clinit>():void");
        }
    }

    /* renamed from: nb.b$b  reason: collision with other inner class name */
    private enum C0897b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected C5107b() {
    }

    private boolean c() {
        this.f61072a = C0897b.FAILED;
        this.f61073b = a();
        if (this.f61072a == C0897b.DONE) {
            return false;
        }
        this.f61072a = C0897b.READY;
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract Object a();

    /* access modifiers changed from: protected */
    public final Object b() {
        this.f61072a = C0897b.DONE;
        return null;
    }

    public final boolean hasNext() {
        boolean z10;
        if (this.f61072a != C0897b.FAILED) {
            z10 = true;
        } else {
            z10 = false;
        }
        o.o(z10);
        int i10 = a.f61074a[this.f61072a.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 != 2) {
            return c();
        }
        return true;
    }

    public final Object next() {
        if (hasNext()) {
            this.f61072a = C0897b.NOT_READY;
            Object a10 = j.a(this.f61073b);
            this.f61073b = null;
            return a10;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
