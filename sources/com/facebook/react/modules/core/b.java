package com.facebook.react.modules.core;

import L7.b;
import U7.i;
import U7.j;
import U7.k;
import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.ArrayDeque;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import n7.C3863a;
import sf.C6714a;

public final class b {

    /* renamed from: f  reason: collision with root package name */
    public static final C0642b f40995f = new C0642b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static b f40996g;

    /* renamed from: a  reason: collision with root package name */
    private b.a f40997a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque[] f40998b;

    /* renamed from: c  reason: collision with root package name */
    private int f40999c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f41000d;

    /* renamed from: e  reason: collision with root package name */
    private final Choreographer.FrameCallback f41001e;

    public enum a {
        PERF_MARKERS(0),
        DISPATCH_UI(1),
        NATIVE_ANIMATED_MODULE(2),
        TIMERS_EVENTS(3),
        IDLE_EVENT(4);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f41009a;

        static {
            a[] a10;
            f41008h = C6714a.a(a10);
        }

        private a(int i10) {
            this.f41009a = i10;
        }

        public static EnumEntries b() {
            return f41008h;
        }

        public final int c() {
            return this.f41009a;
        }
    }

    /* renamed from: com.facebook.react.modules.core.b$b  reason: collision with other inner class name */
    public static final class C0642b {
        public /* synthetic */ C0642b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a() {
            b e10 = b.f40996g;
            if (e10 != null) {
                return e10;
            }
            throw new IllegalStateException("ReactChoreographer needs to be initialized.");
        }

        public final void b(L7.b bVar) {
            C6496s.h(bVar, "choreographerProvider");
            if (b.f40996g == null) {
                b.f40996g = new b(bVar, (DefaultConstructorMarker) null);
            }
        }

        private C0642b() {
        }
    }

    public /* synthetic */ b(L7.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar);
    }

    /* access modifiers changed from: private */
    public static final void d(b bVar, L7.b bVar2) {
        bVar.f40997a = bVar2.a();
    }

    /* access modifiers changed from: private */
    public static final void g(b bVar, long j10) {
        synchronized (bVar.f40998b) {
            try {
                bVar.f41000d = false;
                for (ArrayDeque arrayDeque : bVar.f40998b) {
                    int size = arrayDeque.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        Choreographer.FrameCallback frameCallback = (Choreographer.FrameCallback) arrayDeque.pollFirst();
                        if (frameCallback != null) {
                            frameCallback.doFrame(j10);
                            bVar.f40999c--;
                        } else {
                            U5.a.m("ReactNative", "Tried to execute non-existent frame callback");
                        }
                    }
                }
                bVar.j();
                C6514M m10 = C6514M.f71813a;
            } finally {
            }
        }
    }

    public static final b h() {
        return f40995f.a();
    }

    public static final void i(L7.b bVar) {
        f40995f.b(bVar);
    }

    private final void j() {
        boolean z10;
        if (this.f40999c >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C3863a.a(z10);
        if (this.f40999c == 0 && this.f41000d) {
            b.a aVar = this.f40997a;
            if (aVar != null) {
                aVar.b(this.f41001e);
            }
            this.f41000d = false;
        }
    }

    private final void l() {
        if (!this.f41000d) {
            b.a aVar = this.f40997a;
            if (aVar == null) {
                UiThreadUtil.runOnUiThread(new k(this));
                return;
            }
            aVar.a(this.f41001e);
            this.f41000d = true;
        }
    }

    /* access modifiers changed from: private */
    public static final void m(b bVar) {
        synchronized (bVar.f40998b) {
            bVar.l();
            C6514M m10 = C6514M.f71813a;
        }
    }

    public final void k(a aVar, Choreographer.FrameCallback frameCallback) {
        C6496s.h(aVar, "type");
        C6496s.h(frameCallback, "callback");
        synchronized (this.f40998b) {
            this.f40998b[aVar.c()].addLast(frameCallback);
            boolean z10 = true;
            int i10 = this.f40999c + 1;
            this.f40999c = i10;
            if (i10 <= 0) {
                z10 = false;
            }
            C3863a.a(z10);
            l();
            C6514M m10 = C6514M.f71813a;
        }
    }

    public final void n(a aVar, Choreographer.FrameCallback frameCallback) {
        C6496s.h(aVar, "type");
        synchronized (this.f40998b) {
            try {
                if (this.f40998b[aVar.c()].removeFirstOccurrence(frameCallback)) {
                    this.f40999c--;
                    j();
                } else {
                    U5.a.m("ReactNative", "Tried to remove non-existent frame callback");
                }
                C6514M m10 = C6514M.f71813a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private b(L7.b bVar) {
        int size = a.b().size();
        ArrayDeque[] arrayDequeArr = new ArrayDeque[size];
        for (int i10 = 0; i10 < size; i10++) {
            arrayDequeArr[i10] = new ArrayDeque();
        }
        this.f40998b = arrayDequeArr;
        this.f41001e = new i(this);
        UiThreadUtil.runOnUiThread(new j(this, bVar));
    }
}
