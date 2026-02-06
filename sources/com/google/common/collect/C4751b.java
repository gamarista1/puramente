package com.google.common.collect;

import java.util.NoSuchElementException;
import nb.o;

/* renamed from: com.google.common.collect.b  reason: case insensitive filesystem */
public abstract class C4751b extends g0 {

    /* renamed from: a  reason: collision with root package name */
    private C0846b f56658a = C0846b.NOT_READY;

    /* renamed from: b  reason: collision with root package name */
    private Object f56659b;

    /* renamed from: com.google.common.collect.b$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f56660a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.google.common.collect.b$b[] r0 = com.google.common.collect.C4751b.C0846b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f56660a = r0
                com.google.common.collect.b$b r1 = com.google.common.collect.C4751b.C0846b.DONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f56660a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.common.collect.b$b r1 = com.google.common.collect.C4751b.C0846b.READY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.C4751b.a.<clinit>():void");
        }
    }

    /* renamed from: com.google.common.collect.b$b  reason: collision with other inner class name */
    private enum C0846b {
        READY,
        NOT_READY,
        DONE,
        FAILED
    }

    protected C4751b() {
    }

    private boolean c() {
        this.f56658a = C0846b.FAILED;
        this.f56659b = a();
        if (this.f56658a == C0846b.DONE) {
            return false;
        }
        this.f56658a = C0846b.READY;
        return true;
    }

    /* access modifiers changed from: protected */
    public abstract Object a();

    /* access modifiers changed from: protected */
    public final Object b() {
        this.f56658a = C0846b.DONE;
        return null;
    }

    public final boolean hasNext() {
        boolean z10;
        if (this.f56658a != C0846b.FAILED) {
            z10 = true;
        } else {
            z10 = false;
        }
        o.o(z10);
        int i10 = a.f56660a[this.f56658a.ordinal()];
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
            this.f56658a = C0846b.NOT_READY;
            Object a10 = M.a(this.f56659b);
            this.f56659b = null;
            return a10;
        }
        throw new NoSuchElementException();
    }
}
