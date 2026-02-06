package com.google.common.collect;

import com.google.common.primitives.f;
import com.google.common.primitives.h;
import java.util.Comparator;

/* renamed from: com.google.common.collect.n  reason: case insensitive filesystem */
public abstract class C4763n {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final C4763n f56734a = new a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final C4763n f56735b = new b(-1);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final C4763n f56736c = new b(1);

    /* renamed from: com.google.common.collect.n$a */
    class a extends C4763n {
        a() {
            super((a) null);
        }

        public C4763n d(int i10, int i11) {
            return k(f.e(i10, i11));
        }

        public C4763n e(long j10, long j11) {
            return k(h.a(j10, j11));
        }

        public C4763n f(Object obj, Object obj2, Comparator comparator) {
            return k(comparator.compare(obj, obj2));
        }

        public C4763n g(boolean z10, boolean z11) {
            return k(com.google.common.primitives.a.a(z10, z11));
        }

        public C4763n h(boolean z10, boolean z11) {
            return k(com.google.common.primitives.a.a(z11, z10));
        }

        public int i() {
            return 0;
        }

        /* access modifiers changed from: package-private */
        public C4763n k(int i10) {
            if (i10 < 0) {
                return C4763n.f56735b;
            }
            if (i10 > 0) {
                return C4763n.f56736c;
            }
            return C4763n.f56734a;
        }
    }

    /* renamed from: com.google.common.collect.n$b */
    private static final class b extends C4763n {

        /* renamed from: d  reason: collision with root package name */
        final int f56737d;

        b(int i10) {
            super((a) null);
            this.f56737d = i10;
        }

        public C4763n d(int i10, int i11) {
            return this;
        }

        public C4763n e(long j10, long j11) {
            return this;
        }

        public C4763n f(Object obj, Object obj2, Comparator comparator) {
            return this;
        }

        public C4763n g(boolean z10, boolean z11) {
            return this;
        }

        public C4763n h(boolean z10, boolean z11) {
            return this;
        }

        public int i() {
            return this.f56737d;
        }
    }

    /* synthetic */ C4763n(a aVar) {
        this();
    }

    public static C4763n j() {
        return f56734a;
    }

    public abstract C4763n d(int i10, int i11);

    public abstract C4763n e(long j10, long j11);

    public abstract C4763n f(Object obj, Object obj2, Comparator comparator);

    public abstract C4763n g(boolean z10, boolean z11);

    public abstract C4763n h(boolean z10, boolean z11);

    public abstract int i();

    private C4763n() {
    }
}
