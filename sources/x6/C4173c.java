package x6;

import android.graphics.Bitmap;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w6.C4142b;

/* renamed from: x6.c  reason: case insensitive filesystem */
public final class C4173c implements C4142b {

    /* renamed from: c  reason: collision with root package name */
    public static final a f49484c = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private int f49485a = -1;

    /* renamed from: b  reason: collision with root package name */
    private X5.a f49486b;

    /* renamed from: x6.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private final synchronized void f() {
        X5.a.E(this.f49486b);
        this.f49486b = null;
        this.f49485a = -1;
    }

    public void a(int i10, X5.a aVar, int i11) {
        C6496s.h(aVar, "bitmapReference");
    }

    public synchronized X5.a b(int i10) {
        return X5.a.t(this.f49486b);
    }

    public synchronized X5.a c(int i10, int i11, int i12) {
        X5.a t10;
        try {
            t10 = X5.a.t(this.f49486b);
            f();
        } catch (Throwable th2) {
            f();
            throw th2;
        }
        return t10;
    }

    public synchronized void clear() {
        f();
    }

    public synchronized void d(int i10, X5.a aVar, int i11) {
        Bitmap bitmap;
        try {
            C6496s.h(aVar, "bitmapReference");
            if (this.f49486b != null) {
                Object I10 = aVar.I();
                X5.a aVar2 = this.f49486b;
                if (aVar2 != null) {
                    bitmap = (Bitmap) aVar2.I();
                } else {
                    bitmap = null;
                }
                if (C6496s.c(I10, bitmap)) {
                    return;
                }
            }
            X5.a.E(this.f49486b);
            this.f49486b = X5.a.t(aVar);
            this.f49485a = i10;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    public synchronized X5.a e(int i10) {
        X5.a aVar;
        if (this.f49485a == i10) {
            aVar = X5.a.t(this.f49486b);
        } else {
            aVar = null;
        }
        return aVar;
    }

    public synchronized boolean p(int i10) {
        boolean z10;
        if (i10 != this.f49485a || !X5.a.T(this.f49486b)) {
            z10 = false;
        } else {
            z10 = true;
        }
        return z10;
    }
}
