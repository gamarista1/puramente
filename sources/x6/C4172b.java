package x6;

import R6.c;
import android.util.SparseArray;
import c7.C3186f;
import c7.m;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w6.C4142b;

/* renamed from: x6.b  reason: case insensitive filesystem */
public final class C4172b implements C4142b {

    /* renamed from: e  reason: collision with root package name */
    public static final a f49478e = new a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    private static final Class f49479f = C4172b.class;

    /* renamed from: a  reason: collision with root package name */
    private final c f49480a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f49481b;

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray f49482c = new SparseArray();

    /* renamed from: d  reason: collision with root package name */
    private X5.a f49483d;

    /* renamed from: x6.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final X5.a c(X5.a aVar) {
            C3186f q02 = C3186f.q0(aVar, m.f36558d, 0);
            C6496s.g(q02, "of(...)");
            return X5.a.U(q02);
        }

        public final X5.a b(X5.a aVar) {
            try {
                if (X5.a.T(aVar)) {
                    C6496s.e(aVar);
                    if (aVar.I() instanceof C3186f) {
                        Object I10 = aVar.I();
                        C6496s.f(I10, "null cannot be cast to non-null type com.facebook.imagepipeline.image.CloseableStaticBitmap");
                        return ((C3186f) I10).B();
                    }
                }
                X5.a.E(aVar);
                return null;
            } finally {
                X5.a.E(aVar);
            }
        }

        private a() {
        }
    }

    public C4172b(c cVar, boolean z10) {
        C6496s.h(cVar, "animatedFrameCache");
        this.f49480a = cVar;
        this.f49481b = z10;
    }

    private final synchronized void f(int i10) {
        X5.a aVar = (X5.a) this.f49482c.get(i10);
        if (aVar != null) {
            this.f49482c.delete(i10);
            X5.a.E(aVar);
            U5.a.z(f49479f, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(i10), this.f49482c);
        }
    }

    public synchronized void a(int i10, X5.a aVar, int i11) {
        C6496s.h(aVar, "bitmapReference");
        X5.a aVar2 = null;
        try {
            aVar2 = f49478e.c(aVar);
            if (aVar2 != null) {
                X5.a a10 = this.f49480a.a(i10, aVar2);
                if (X5.a.T(a10)) {
                    X5.a.E((X5.a) this.f49482c.get(i10));
                    this.f49482c.put(i10, a10);
                    U5.a.z(f49479f, "cachePreparedFrame(%d) cached. Pending frames: %s", Integer.valueOf(i10), this.f49482c);
                }
                X5.a.E(aVar2);
            }
        } finally {
            X5.a.E(aVar2);
        }
    }

    public synchronized X5.a b(int i10) {
        return f49478e.b(X5.a.t(this.f49483d));
    }

    public synchronized X5.a c(int i10, int i11, int i12) {
        if (!this.f49481b) {
            return null;
        }
        return f49478e.b(this.f49480a.d());
    }

    public synchronized void clear() {
        try {
            X5.a.E(this.f49483d);
            this.f49483d = null;
            int size = this.f49482c.size();
            for (int i10 = 0; i10 < size; i10++) {
                X5.a.E((X5.a) this.f49482c.valueAt(i10));
            }
            this.f49482c.clear();
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized void d(int i10, X5.a aVar, int i11) {
        C6496s.h(aVar, "bitmapReference");
        f(i10);
        X5.a aVar2 = null;
        try {
            aVar2 = f49478e.c(aVar);
            if (aVar2 != null) {
                X5.a.E(this.f49483d);
                this.f49483d = this.f49480a.a(i10, aVar2);
            }
        } finally {
            X5.a.E(aVar2);
        }
    }

    public synchronized X5.a e(int i10) {
        return f49478e.b(this.f49480a.c(i10));
    }

    public synchronized boolean p(int i10) {
        return this.f49480a.b(i10);
    }
}
