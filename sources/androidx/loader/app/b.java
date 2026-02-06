package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.Z;
import androidx.lifecycle.C1798v;
import androidx.lifecycle.D;
import androidx.lifecycle.E;
import androidx.lifecycle.a0;
import androidx.lifecycle.c0;
import androidx.lifecycle.d0;
import androidx.loader.app.a;
import c2.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

class b extends a {

    /* renamed from: c  reason: collision with root package name */
    static boolean f17276c = false;

    /* renamed from: a  reason: collision with root package name */
    private final C1798v f17277a;

    /* renamed from: b  reason: collision with root package name */
    private final c f17278b;

    public static class a extends D implements c.b {

        /* renamed from: l  reason: collision with root package name */
        private final int f17279l;

        /* renamed from: m  reason: collision with root package name */
        private final Bundle f17280m;

        /* renamed from: n  reason: collision with root package name */
        private final c2.c f17281n;

        /* renamed from: o  reason: collision with root package name */
        private C1798v f17282o;

        /* renamed from: p  reason: collision with root package name */
        private C0308b f17283p;

        /* renamed from: q  reason: collision with root package name */
        private c2.c f17284q;

        a(int i10, Bundle bundle, c2.c cVar, c2.c cVar2) {
            this.f17279l = i10;
            this.f17280m = bundle;
            this.f17281n = cVar;
            this.f17284q = cVar2;
            cVar.t(i10, this);
        }

        public void a(c2.c cVar, Object obj) {
            if (b.f17276c) {
                Log.v("LoaderManager", "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                n(obj);
                return;
            }
            if (b.f17276c) {
                Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
            }
            l(obj);
        }

        /* access modifiers changed from: protected */
        public void j() {
            if (b.f17276c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            this.f17281n.w();
        }

        /* access modifiers changed from: protected */
        public void k() {
            if (b.f17276c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            this.f17281n.x();
        }

        public void m(E e10) {
            super.m(e10);
            this.f17282o = null;
            this.f17283p = null;
        }

        public void n(Object obj) {
            super.n(obj);
            c2.c cVar = this.f17284q;
            if (cVar != null) {
                cVar.u();
                this.f17284q = null;
            }
        }

        /* access modifiers changed from: package-private */
        public c2.c o(boolean z10) {
            if (b.f17276c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            this.f17281n.b();
            this.f17281n.a();
            C0308b bVar = this.f17283p;
            if (bVar != null) {
                m(bVar);
                if (z10) {
                    bVar.d();
                }
            }
            this.f17281n.z(this);
            if ((bVar == null || bVar.c()) && !z10) {
                return this.f17281n;
            }
            this.f17281n.u();
            return this.f17284q;
        }

        public void p(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f17279l);
            printWriter.print(" mArgs=");
            printWriter.println(this.f17280m);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f17281n);
            c2.c cVar = this.f17281n;
            cVar.g(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f17283p != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f17283p);
                C0308b bVar = this.f17283p;
                bVar.b(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(q().d(f()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(g());
        }

        /* access modifiers changed from: package-private */
        public c2.c q() {
            return this.f17281n;
        }

        /* access modifiers changed from: package-private */
        public void r() {
            C1798v vVar = this.f17282o;
            C0308b bVar = this.f17283p;
            if (vVar != null && bVar != null) {
                super.m(bVar);
                h(vVar, bVar);
            }
        }

        /* access modifiers changed from: package-private */
        public c2.c s(C1798v vVar, a.C0307a aVar) {
            C0308b bVar = new C0308b(this.f17281n, aVar);
            h(vVar, bVar);
            C0308b bVar2 = this.f17283p;
            if (bVar2 != null) {
                m(bVar2);
            }
            this.f17282o = vVar;
            this.f17283p = bVar;
            return this.f17281n;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append("LoaderInfo{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" #");
            sb2.append(this.f17279l);
            sb2.append(" : ");
            Class<?> cls = this.f17281n.getClass();
            sb2.append(cls.getSimpleName());
            sb2.append("{");
            sb2.append(Integer.toHexString(System.identityHashCode(cls)));
            sb2.append("}}");
            return sb2.toString();
        }
    }

    /* renamed from: androidx.loader.app.b$b  reason: collision with other inner class name */
    static class C0308b implements E {

        /* renamed from: a  reason: collision with root package name */
        private final c2.c f17285a;

        /* renamed from: b  reason: collision with root package name */
        private final a.C0307a f17286b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f17287c = false;

        C0308b(c2.c cVar, a.C0307a aVar) {
            this.f17285a = cVar;
            this.f17286b = aVar;
        }

        public void a(Object obj) {
            if (b.f17276c) {
                Log.v("LoaderManager", "  onLoadFinished in " + this.f17285a + ": " + this.f17285a.d(obj));
            }
            this.f17287c = true;
            this.f17286b.a(this.f17285a, obj);
        }

        public void b(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f17287c);
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            return this.f17287c;
        }

        /* access modifiers changed from: package-private */
        public void d() {
            if (this.f17287c) {
                if (b.f17276c) {
                    Log.v("LoaderManager", "  Resetting: " + this.f17285a);
                }
                this.f17286b.b(this.f17285a);
            }
        }

        public String toString() {
            return this.f17286b.toString();
        }
    }

    static class c extends a0 {

        /* renamed from: c  reason: collision with root package name */
        private static final c0.c f17288c = new a();

        /* renamed from: a  reason: collision with root package name */
        private Z f17289a = new Z();

        /* renamed from: b  reason: collision with root package name */
        private boolean f17290b = false;

        static class a implements c0.c {
            a() {
            }

            public a0 create(Class cls) {
                return new c();
            }
        }

        c() {
        }

        static c d(d0 d0Var) {
            return (c) new c0(d0Var, f17288c).b(c.class);
        }

        public void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f17289a.o() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i10 = 0; i10 < this.f17289a.o(); i10++) {
                    a aVar = (a) this.f17289a.p(i10);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f17289a.j(i10));
                    printWriter.print(": ");
                    printWriter.println(aVar.toString());
                    aVar.p(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            this.f17290b = false;
        }

        /* access modifiers changed from: package-private */
        public a e(int i10) {
            return (a) this.f17289a.g(i10);
        }

        /* access modifiers changed from: package-private */
        public boolean f() {
            return this.f17290b;
        }

        /* access modifiers changed from: package-private */
        public void g() {
            int o10 = this.f17289a.o();
            for (int i10 = 0; i10 < o10; i10++) {
                ((a) this.f17289a.p(i10)).r();
            }
        }

        /* access modifiers changed from: package-private */
        public void h(int i10, a aVar) {
            this.f17289a.k(i10, aVar);
        }

        /* access modifiers changed from: package-private */
        public void i() {
            this.f17290b = true;
        }

        /* access modifiers changed from: protected */
        public void onCleared() {
            super.onCleared();
            int o10 = this.f17289a.o();
            for (int i10 = 0; i10 < o10; i10++) {
                ((a) this.f17289a.p(i10)).o(true);
            }
            this.f17289a.c();
        }
    }

    b(C1798v vVar, d0 d0Var) {
        this.f17277a = vVar;
        this.f17278b = c.d(d0Var);
    }

    private c2.c e(int i10, Bundle bundle, a.C0307a aVar, c2.c cVar) {
        try {
            this.f17278b.i();
            c2.c onCreateLoader = aVar.onCreateLoader(i10, bundle);
            if (onCreateLoader != null) {
                if (onCreateLoader.getClass().isMemberClass()) {
                    if (!Modifier.isStatic(onCreateLoader.getClass().getModifiers())) {
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + onCreateLoader);
                    }
                }
                a aVar2 = new a(i10, bundle, onCreateLoader, cVar);
                if (f17276c) {
                    Log.v("LoaderManager", "  Created new loader " + aVar2);
                }
                this.f17278b.h(i10, aVar2);
                this.f17278b.c();
                return aVar2.s(this.f17277a, aVar);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th2) {
            this.f17278b.c();
            throw th2;
        }
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f17278b.b(str, fileDescriptor, printWriter, strArr);
    }

    public c2.c c(int i10, Bundle bundle, a.C0307a aVar) {
        if (this.f17278b.f()) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            a e10 = this.f17278b.e(i10);
            if (f17276c) {
                Log.v("LoaderManager", "initLoader in " + this + ": args=" + bundle);
            }
            if (e10 == null) {
                return e(i10, bundle, aVar, (c2.c) null);
            }
            if (f17276c) {
                Log.v("LoaderManager", "  Re-using existing loader " + e10);
            }
            return e10.s(this.f17277a, aVar);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    public void d() {
        this.f17278b.g();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        Class<?> cls = this.f17277a.getClass();
        sb2.append(cls.getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(cls)));
        sb2.append("}}");
        return sb2.toString();
    }
}
