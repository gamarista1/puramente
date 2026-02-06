package androidx.compose.animation;

import c1.n;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w.C2763G;
import w.C2798j;
import w.G0;
import w.n0;
import yf.C6798l;

public interface d extends n0.b {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0224a f12266a = new C0224a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public static final int f12267b = g(0);
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final int f12268c = g(1);
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public static final int f12269d = g(2);
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public static final int f12270e = g(3);
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public static final int f12271f = g(4);
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public static final int f12272g = g(5);

        /* renamed from: androidx.compose.animation.d$a$a  reason: collision with other inner class name */
        public static final class C0224a {
            public /* synthetic */ C0224a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final int a() {
                return a.f12270e;
            }

            public final int b() {
                return a.f12272g;
            }

            public final int c() {
                return a.f12267b;
            }

            public final int d() {
                return a.f12268c;
            }

            public final int e() {
                return a.f12271f;
            }

            public final int f() {
                return a.f12269d;
            }

            private C0224a() {
            }
        }

        public static int g(int i10) {
            return i10;
        }

        public static final boolean h(int i10, int i11) {
            return i10 == i11;
        }
    }

    static final class b extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f12273a = new b();

        b() {
            super(1);
        }

        public final Integer a(int i10) {
            return Integer.valueOf(i10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final c f12274a = new c();

        c() {
            super(1);
        }

        public final Integer a(int i10) {
            return Integer.valueOf(i10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static /* synthetic */ k c(d dVar, int i10, C2763G g10, C6798l lVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                g10 = C2798j.h(0.0f, 0.0f, n.b(G0.c(n.f19226b)), 3, (Object) null);
            }
            if ((i11 & 4) != 0) {
                lVar = c.f12274a;
            }
            return dVar.b(i10, g10, lVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideOutOfContainer-mOhB8PU");
    }

    static /* synthetic */ i f(d dVar, int i10, C2763G g10, C6798l lVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                g10 = C2798j.h(0.0f, 0.0f, n.b(G0.c(n.f19226b)), 3, (Object) null);
            }
            if ((i11 & 4) != 0) {
                lVar = b.f12273a;
            }
            return dVar.a(i10, g10, lVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: slideIntoContainer-mOhB8PU");
    }

    i a(int i10, C2763G g10, C6798l lVar);

    k b(int i10, C2763G g10, C6798l lVar);
}
