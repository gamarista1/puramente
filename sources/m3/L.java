package m3;

import Sg.p;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.C6498u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.C6535s;
import mf.C6565s;
import qf.C6658d;
import yf.C6787a;
import yf.C6798l;
import zf.C6828a;

public abstract class L {
    private final C2217p invalidateCallbackTracker = new C2217p(c.f23860a, (C6787a) null, 2, (DefaultConstructorMarker) null);

    public static abstract class a {

        /* renamed from: c  reason: collision with root package name */
        public static final b f23845c = new b((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final int f23846a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f23847b;

        /* renamed from: m3.L$a$a  reason: collision with other inner class name */
        public static final class C0383a extends a {

            /* renamed from: d  reason: collision with root package name */
            private final Object f23848d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0383a(Object obj, int i10, boolean z10) {
                super(i10, z10, (DefaultConstructorMarker) null);
                C6496s.h(obj, SubscriberAttributeKt.JSON_NAME_KEY);
                this.f23848d = obj;
            }

            public Object a() {
                return this.f23848d;
            }
        }

        public static final class b {

            /* renamed from: m3.L$a$b$a  reason: collision with other inner class name */
            public /* synthetic */ class C0384a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f23849a;

                /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
                static {
                    /*
                        m3.t[] r0 = m3.C2220t.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        m3.t r1 = m3.C2220t.REFRESH     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        m3.t r1 = m3.C2220t.PREPEND     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        m3.t r1 = m3.C2220t.APPEND     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        f23849a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: m3.L.a.b.C0384a.<clinit>():void");
                }
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(C2220t tVar, Object obj, int i10, boolean z10) {
                C6496s.h(tVar, "loadType");
                int i11 = C0384a.f23849a[tVar.ordinal()];
                if (i11 == 1) {
                    return new d(obj, i10, z10);
                }
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new C6535s();
                    } else if (obj != null) {
                        return new C0383a(obj, i10, z10);
                    } else {
                        throw new IllegalArgumentException("key cannot be null for append");
                    }
                } else if (obj != null) {
                    return new c(obj, i10, z10);
                } else {
                    throw new IllegalArgumentException("key cannot be null for prepend");
                }
            }

            private b() {
            }
        }

        public static final class c extends a {

            /* renamed from: d  reason: collision with root package name */
            private final Object f23850d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(Object obj, int i10, boolean z10) {
                super(i10, z10, (DefaultConstructorMarker) null);
                C6496s.h(obj, SubscriberAttributeKt.JSON_NAME_KEY);
                this.f23850d = obj;
            }

            public Object a() {
                return this.f23850d;
            }
        }

        public static final class d extends a {

            /* renamed from: d  reason: collision with root package name */
            private final Object f23851d;

            public d(Object obj, int i10, boolean z10) {
                super(i10, z10, (DefaultConstructorMarker) null);
                this.f23851d = obj;
            }

            public Object a() {
                return this.f23851d;
            }
        }

        public /* synthetic */ a(int i10, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, z10);
        }

        public abstract Object a();

        private a(int i10, boolean z10) {
            this.f23846a = i10;
            this.f23847b = z10;
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f23852a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Throwable th2) {
                super((DefaultConstructorMarker) null);
                C6496s.h(th2, "throwable");
                this.f23852a = th2;
            }

            public final Throwable a() {
                return this.f23852a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if ((obj instanceof a) && C6496s.c(this.f23852a, ((a) obj).f23852a)) {
                    return true;
                }
                return false;
            }

            public int hashCode() {
                return this.f23852a.hashCode();
            }

            public String toString() {
                return p.h("LoadResult.Error(\n                    |   throwable: " + this.f23852a + "\n                    |) ", (String) null, 1, (Object) null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }

        /* renamed from: m3.L$b$b  reason: collision with other inner class name */
        public static final class C0385b extends b implements Iterable, C6828a {

            /* renamed from: f  reason: collision with root package name */
            public static final a f23853f = new a((DefaultConstructorMarker) null);

            /* renamed from: g  reason: collision with root package name */
            private static final C0385b f23854g = new C0385b(C6565s.n(), (Object) null, (Object) null, 0, 0);

            /* renamed from: a  reason: collision with root package name */
            private final List f23855a;

            /* renamed from: b  reason: collision with root package name */
            private final Object f23856b;

            /* renamed from: c  reason: collision with root package name */
            private final Object f23857c;

            /* renamed from: d  reason: collision with root package name */
            private final int f23858d;

            /* renamed from: e  reason: collision with root package name */
            private final int f23859e;

            /* renamed from: m3.L$b$b$a */
            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private a() {
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0385b(List list, Object obj, Object obj2, int i10, int i11) {
                super((DefaultConstructorMarker) null);
                C6496s.h(list, "data");
                this.f23855a = list;
                this.f23856b = obj;
                this.f23857c = obj2;
                this.f23858d = i10;
                this.f23859e = i11;
                if (i10 != Integer.MIN_VALUE && i10 < 0) {
                    throw new IllegalArgumentException("itemsBefore cannot be negative");
                } else if (i11 != Integer.MIN_VALUE && i11 < 0) {
                    throw new IllegalArgumentException("itemsAfter cannot be negative");
                }
            }

            public final List a() {
                return this.f23855a;
            }

            public final int b() {
                return this.f23859e;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0385b)) {
                    return false;
                }
                C0385b bVar = (C0385b) obj;
                if (C6496s.c(this.f23855a, bVar.f23855a) && C6496s.c(this.f23856b, bVar.f23856b) && C6496s.c(this.f23857c, bVar.f23857c) && this.f23858d == bVar.f23858d && this.f23859e == bVar.f23859e) {
                    return true;
                }
                return false;
            }

            public final int g() {
                return this.f23858d;
            }

            public int hashCode() {
                int i10;
                int hashCode = this.f23855a.hashCode() * 31;
                Object obj = this.f23856b;
                int i11 = 0;
                if (obj == null) {
                    i10 = 0;
                } else {
                    i10 = obj.hashCode();
                }
                int i12 = (hashCode + i10) * 31;
                Object obj2 = this.f23857c;
                if (obj2 != null) {
                    i11 = obj2.hashCode();
                }
                return ((((i12 + i11) * 31) + Integer.hashCode(this.f23858d)) * 31) + Integer.hashCode(this.f23859e);
            }

            public Iterator iterator() {
                return this.f23855a.listIterator();
            }

            public final Object k() {
                return this.f23857c;
            }

            public final Object n() {
                return this.f23856b;
            }

            public String toString() {
                return p.h("LoadResult.Page(\n                    |   data size: " + this.f23855a.size() + "\n                    |   first Item: " + C6565s.q0(this.f23855a) + "\n                    |   last Item: " + C6565s.B0(this.f23855a) + "\n                    |   nextKey: " + this.f23857c + "\n                    |   prevKey: " + this.f23856b + "\n                    |   itemsBefore: " + this.f23858d + "\n                    |   itemsAfter: " + this.f23859e + "\n                    |) ", (String) null, 1, (Object) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public C0385b(List list, Object obj, Object obj2) {
                this(list, obj, obj2, Integer.MIN_VALUE, Integer.MIN_VALUE);
                C6496s.h(list, "data");
            }
        }
    }

    static final class c extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final c f23860a = new c();

        c() {
            super(1);
        }

        public final void a(C6787a aVar) {
            C6496s.h(aVar, "it");
            aVar.invoke();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C6787a) obj);
            return C6514M.f71813a;
        }
    }

    public final boolean getInvalid() {
        return this.invalidateCallbackTracker.b();
    }

    public final int getInvalidateCallbackCount$paging_common_release() {
        return this.invalidateCallbackTracker.a();
    }

    public boolean getJumpingSupported() {
        return false;
    }

    public boolean getKeyReuseSupported() {
        return false;
    }

    public abstract Object getRefreshKey(M m10);

    public final void invalidate() {
        if (this.invalidateCallbackTracker.c()) {
            K k10 = K.f23844a;
            if (k10.a(3)) {
                k10.b(3, "Invalidated PagingSource " + this, (Throwable) null);
            }
        }
    }

    public abstract Object load(a aVar, C6658d dVar);

    public final void registerInvalidatedCallback(C6787a aVar) {
        C6496s.h(aVar, "onInvalidatedCallback");
        this.invalidateCallbackTracker.d(aVar);
    }

    public final void unregisterInvalidatedCallback(C6787a aVar) {
        C6496s.h(aVar, "onInvalidatedCallback");
        this.invalidateCallbackTracker.e(aVar);
    }
}
