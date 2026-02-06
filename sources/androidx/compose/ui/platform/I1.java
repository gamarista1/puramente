package androidx.compose.ui.platform;

import Ug.C5600w0;
import Ug.K;
import Ug.M;
import Xg.C5695g;
import Xg.C5696h;
import Xg.H;
import Xg.L;
import Y.C1490h0;
import Y.C1526z0;
import Y.O0;
import Y.r;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.C1790m;
import androidx.lifecycle.C1795s;
import androidx.lifecycle.C1798v;
import androidx.lifecycle.f0;
import java.util.LinkedHashMap;
import java.util.Map;
import k0.m;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.N;
import lf.C6514M;
import lf.C6527k;
import lf.w;
import qf.C6658d;
import qf.e;
import qf.g;
import qf.h;
import rf.C6680b;
import yf.C6798l;
import yf.p;

public abstract class I1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Map f13550a = new LinkedHashMap();

    public static final class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f13551a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ O0 f13552b;

        a(View view, O0 o02) {
            this.f13551a = view;
            this.f13552b = o02;
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            this.f13551a.removeOnAttachStateChangeListener(this);
            this.f13552b.Y();
        }
    }

    public static final class b implements C1795s {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ K f13553a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C1526z0 f13554b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ O0 f13555c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ N f13556d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View f13557e;

        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f13558a;

            /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|17) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
            static {
                /*
                    androidx.lifecycle.m$a[] r0 = androidx.lifecycle.C1790m.a.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    androidx.lifecycle.m$a r1 = androidx.lifecycle.C1790m.a.ON_CREATE     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    androidx.lifecycle.m$a r1 = androidx.lifecycle.C1790m.a.ON_START     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    androidx.lifecycle.m$a r1 = androidx.lifecycle.C1790m.a.ON_STOP     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    androidx.lifecycle.m$a r1 = androidx.lifecycle.C1790m.a.ON_DESTROY     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    androidx.lifecycle.m$a r1 = androidx.lifecycle.C1790m.a.ON_PAUSE     // Catch:{ NoSuchFieldError -> 0x0034 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                    r2 = 5
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
                L_0x0034:
                    androidx.lifecycle.m$a r1 = androidx.lifecycle.C1790m.a.ON_RESUME     // Catch:{ NoSuchFieldError -> 0x003d }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                    r2 = 6
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
                L_0x003d:
                    androidx.lifecycle.m$a r1 = androidx.lifecycle.C1790m.a.ON_ANY     // Catch:{ NoSuchFieldError -> 0x0046 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                    r2 = 7
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
                L_0x0046:
                    f13558a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.I1.b.a.<clinit>():void");
            }
        }

        /* renamed from: androidx.compose.ui.platform.I1$b$b  reason: collision with other inner class name */
        static final class C0256b extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f13559a;

            /* renamed from: b  reason: collision with root package name */
            private /* synthetic */ Object f13560b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ N f13561c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ O0 f13562d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C1798v f13563e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ b f13564f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ View f13565g;

            /* renamed from: androidx.compose.ui.platform.I1$b$b$a */
            static final class a extends l implements p {

                /* renamed from: a  reason: collision with root package name */
                int f13566a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ L f13567b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ G0 f13568c;

                /* renamed from: androidx.compose.ui.platform.I1$b$b$a$a  reason: collision with other inner class name */
                static final class C0257a implements C5695g {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ G0 f13569a;

                    C0257a(G0 g02) {
                        this.f13569a = g02;
                    }

                    public final Object a(float f10, C6658d dVar) {
                        this.f13569a.c(f10);
                        return C6514M.f71813a;
                    }

                    public /* bridge */ /* synthetic */ Object emit(Object obj, C6658d dVar) {
                        return a(((Number) obj).floatValue(), dVar);
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                a(L l10, G0 g02, C6658d dVar) {
                    super(2, dVar);
                    this.f13567b = l10;
                    this.f13568c = g02;
                }

                public final C6658d create(Object obj, C6658d dVar) {
                    return new a(this.f13567b, this.f13568c, dVar);
                }

                public final Object invoke(K k10, C6658d dVar) {
                    return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C6680b.f();
                    int i10 = this.f13566a;
                    if (i10 == 0) {
                        w.b(obj);
                        L l10 = this.f13567b;
                        C0257a aVar = new C0257a(this.f13568c);
                        this.f13566a = 1;
                        if (l10.collect(aVar, this) == f10) {
                            return f10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        w.b(obj);
                    }
                    throw new C6527k();
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0256b(N n10, O0 o02, C1798v vVar, b bVar, View view, C6658d dVar) {
                super(2, dVar);
                this.f13561c = n10;
                this.f13562d = o02;
                this.f13563e = vVar;
                this.f13564f = bVar;
                this.f13565g = view;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                C0256b bVar = new C0256b(this.f13561c, this.f13562d, this.f13563e, this.f13564f, this.f13565g, dVar);
                bVar.f13560b = obj;
                return bVar;
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((C0256b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:29:0x0083  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r12) {
                /*
                    r11 = this;
                    java.lang.Object r0 = rf.C6680b.f()
                    int r1 = r11.f13559a
                    r2 = 1
                    r3 = 0
                    if (r1 == 0) goto L_0x001f
                    if (r1 != r2) goto L_0x0017
                    java.lang.Object r0 = r11.f13560b
                    Ug.w0 r0 = (Ug.C5600w0) r0
                    lf.w.b(r12)     // Catch:{ all -> 0x0014 }
                    goto L_0x006a
                L_0x0014:
                    r12 = move-exception
                    goto L_0x0081
                L_0x0017:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L_0x001f:
                    lf.w.b(r12)
                    java.lang.Object r12 = r11.f13560b
                    r4 = r12
                    Ug.K r4 = (Ug.K) r4
                    kotlin.jvm.internal.N r12 = r11.f13561c     // Catch:{ all -> 0x0058 }
                    java.lang.Object r12 = r12.f71759a     // Catch:{ all -> 0x0058 }
                    androidx.compose.ui.platform.G0 r12 = (androidx.compose.ui.platform.G0) r12     // Catch:{ all -> 0x0058 }
                    if (r12 == 0) goto L_0x005b
                    android.view.View r1 = r11.f13565g     // Catch:{ all -> 0x0058 }
                    android.content.Context r1 = r1.getContext()     // Catch:{ all -> 0x0058 }
                    android.content.Context r1 = r1.getApplicationContext()     // Catch:{ all -> 0x0058 }
                    Xg.L r1 = androidx.compose.ui.platform.I1.e(r1)     // Catch:{ all -> 0x0058 }
                    java.lang.Object r5 = r1.getValue()     // Catch:{ all -> 0x0058 }
                    java.lang.Number r5 = (java.lang.Number) r5     // Catch:{ all -> 0x0058 }
                    float r5 = r5.floatValue()     // Catch:{ all -> 0x0058 }
                    r12.c(r5)     // Catch:{ all -> 0x0058 }
                    androidx.compose.ui.platform.I1$b$b$a r7 = new androidx.compose.ui.platform.I1$b$b$a     // Catch:{ all -> 0x0058 }
                    r7.<init>(r1, r12, r3)     // Catch:{ all -> 0x0058 }
                    r8 = 3
                    r9 = 0
                    r5 = 0
                    r6 = 0
                    Ug.w0 r12 = Ug.C5576k.d(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0058 }
                    goto L_0x005c
                L_0x0058:
                    r12 = move-exception
                    r0 = r3
                    goto L_0x0081
                L_0x005b:
                    r12 = r3
                L_0x005c:
                    Y.O0 r1 = r11.f13562d     // Catch:{ all -> 0x007d }
                    r11.f13560b = r12     // Catch:{ all -> 0x007d }
                    r11.f13559a = r2     // Catch:{ all -> 0x007d }
                    java.lang.Object r1 = r1.z0(r11)     // Catch:{ all -> 0x007d }
                    if (r1 != r0) goto L_0x0069
                    return r0
                L_0x0069:
                    r0 = r12
                L_0x006a:
                    if (r0 == 0) goto L_0x006f
                    Ug.C5600w0.a.a(r0, r3, r2, r3)
                L_0x006f:
                    androidx.lifecycle.v r12 = r11.f13563e
                    androidx.lifecycle.m r12 = r12.getLifecycle()
                    androidx.compose.ui.platform.I1$b r0 = r11.f13564f
                    r12.d(r0)
                    lf.M r12 = lf.C6514M.f71813a
                    return r12
                L_0x007d:
                    r0 = move-exception
                    r10 = r0
                    r0 = r12
                    r12 = r10
                L_0x0081:
                    if (r0 == 0) goto L_0x0086
                    Ug.C5600w0.a.a(r0, r3, r2, r3)
                L_0x0086:
                    androidx.lifecycle.v r0 = r11.f13563e
                    androidx.lifecycle.m r0 = r0.getLifecycle()
                    androidx.compose.ui.platform.I1$b r1 = r11.f13564f
                    r0.d(r1)
                    throw r12
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.I1.b.C0256b.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        b(K k10, C1526z0 z0Var, O0 o02, N n10, View view) {
            this.f13553a = k10;
            this.f13554b = z0Var;
            this.f13555c = o02;
            this.f13556d = n10;
            this.f13557e = view;
        }

        public void f(C1798v vVar, C1790m.a aVar) {
            int i10 = a.f13558a[aVar.ordinal()];
            if (i10 == 1) {
                C5600w0 unused = C5576k.d(this.f13553a, (g) null, M.UNDISPATCHED, new C0256b(this.f13556d, this.f13555c, vVar, this, this.f13557e, (C6658d) null), 1, (Object) null);
            } else if (i10 == 2) {
                C1526z0 z0Var = this.f13554b;
                if (z0Var != null) {
                    z0Var.d();
                }
                this.f13555c.y0();
            } else if (i10 == 3) {
                this.f13555c.l0();
            } else if (i10 == 4) {
                this.f13555c.Y();
            }
        }
    }

    static final class c extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f13570a;

        /* renamed from: b  reason: collision with root package name */
        int f13571b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f13572c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ContentResolver f13573d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Uri f13574e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d f13575f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Wg.d f13576g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Context f13577h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ContentResolver contentResolver, Uri uri, d dVar, Wg.d dVar2, Context context, C6658d dVar3) {
            super(2, dVar3);
            this.f13573d = contentResolver;
            this.f13574e = uri;
            this.f13575f = dVar;
            this.f13576g = dVar2;
            this.f13577h = context;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            c cVar = new c(this.f13573d, this.f13574e, this.f13575f, this.f13576g, this.f13577h, dVar);
            cVar.f13572c = obj;
            return cVar;
        }

        public final Object invoke(C5695g gVar, C6658d dVar) {
            return ((c) create(gVar, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0055 A[Catch:{ all -> 0x001b }] */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0060 A[Catch:{ all -> 0x001b }] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = rf.C6680b.f()
                int r1 = r8.f13571b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0031
                if (r1 == r3) goto L_0x0025
                if (r1 != r2) goto L_0x001d
                java.lang.Object r1 = r8.f13570a
                Wg.f r1 = (Wg.f) r1
                java.lang.Object r4 = r8.f13572c
                Xg.g r4 = (Xg.C5695g) r4
                lf.w.b(r9)     // Catch:{ all -> 0x001b }
            L_0x0019:
                r9 = r4
                goto L_0x0048
            L_0x001b:
                r9 = move-exception
                goto L_0x008c
            L_0x001d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x0025:
                java.lang.Object r1 = r8.f13570a
                Wg.f r1 = (Wg.f) r1
                java.lang.Object r4 = r8.f13572c
                Xg.g r4 = (Xg.C5695g) r4
                lf.w.b(r9)     // Catch:{ all -> 0x001b }
                goto L_0x0058
            L_0x0031:
                lf.w.b(r9)
                java.lang.Object r9 = r8.f13572c
                Xg.g r9 = (Xg.C5695g) r9
                android.content.ContentResolver r1 = r8.f13573d
                android.net.Uri r4 = r8.f13574e
                r5 = 0
                androidx.compose.ui.platform.I1$d r6 = r8.f13575f
                r1.registerContentObserver(r4, r5, r6)
                Wg.d r1 = r8.f13576g     // Catch:{ all -> 0x001b }
                Wg.f r1 = r1.iterator()     // Catch:{ all -> 0x001b }
            L_0x0048:
                r8.f13572c = r9     // Catch:{ all -> 0x001b }
                r8.f13570a = r1     // Catch:{ all -> 0x001b }
                r8.f13571b = r3     // Catch:{ all -> 0x001b }
                java.lang.Object r4 = r1.a(r8)     // Catch:{ all -> 0x001b }
                if (r4 != r0) goto L_0x0055
                return r0
            L_0x0055:
                r7 = r4
                r4 = r9
                r9 = r7
            L_0x0058:
                java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch:{ all -> 0x001b }
                boolean r9 = r9.booleanValue()     // Catch:{ all -> 0x001b }
                if (r9 == 0) goto L_0x0082
                r1.next()     // Catch:{ all -> 0x001b }
                android.content.Context r9 = r8.f13577h     // Catch:{ all -> 0x001b }
                android.content.ContentResolver r9 = r9.getContentResolver()     // Catch:{ all -> 0x001b }
                java.lang.String r5 = "animator_duration_scale"
                r6 = 1065353216(0x3f800000, float:1.0)
                float r9 = android.provider.Settings.Global.getFloat(r9, r5, r6)     // Catch:{ all -> 0x001b }
                java.lang.Float r9 = kotlin.coroutines.jvm.internal.b.b(r9)     // Catch:{ all -> 0x001b }
                r8.f13572c = r4     // Catch:{ all -> 0x001b }
                r8.f13570a = r1     // Catch:{ all -> 0x001b }
                r8.f13571b = r2     // Catch:{ all -> 0x001b }
                java.lang.Object r9 = r4.emit(r9, r8)     // Catch:{ all -> 0x001b }
                if (r9 != r0) goto L_0x0019
                return r0
            L_0x0082:
                android.content.ContentResolver r9 = r8.f13573d
                androidx.compose.ui.platform.I1$d r0 = r8.f13575f
                r9.unregisterContentObserver(r0)
                lf.M r9 = lf.C6514M.f71813a
                return r9
            L_0x008c:
                android.content.ContentResolver r0 = r8.f13573d
                androidx.compose.ui.platform.I1$d r1 = r8.f13575f
                r0.unregisterContentObserver(r1)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.I1.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class d extends ContentObserver {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Wg.d f13578a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Wg.d dVar, Handler handler) {
            super(handler);
            this.f13578a = dVar;
        }

        public void onChange(boolean z10, Uri uri) {
            this.f13578a.c(C6514M.f71813a);
        }
    }

    public static final O0 b(View view, g gVar, C1790m mVar) {
        C1526z0 z0Var;
        g gVar2;
        if (gVar.b(e.f72642c0) == null || gVar.b(C1490h0.f10013R) == null) {
            gVar = T.f13656m.a().n1(gVar);
        }
        C1490h0 h0Var = (C1490h0) gVar.b(C1490h0.f10013R);
        if (h0Var != null) {
            C1526z0 z0Var2 = new C1526z0(h0Var);
            z0Var2.c();
            z0Var = z0Var2;
        } else {
            z0Var = null;
        }
        N n10 = new N();
        g gVar3 = (k0.l) gVar.b(k0.l.f23090W);
        if (gVar3 == null) {
            gVar3 = new G0();
            n10.f71759a = gVar3;
        }
        if (z0Var != null) {
            gVar2 = z0Var;
        } else {
            gVar2 = h.f72645a;
        }
        g n12 = gVar.n1(gVar2).n1(gVar3);
        O0 o02 = new O0(n12);
        o02.l0();
        K a10 = Ug.L.a(n12);
        if (mVar == null) {
            C1798v a11 = f0.a(view);
            if (a11 != null) {
                mVar = a11.getLifecycle();
            } else {
                mVar = null;
            }
        }
        if (mVar != null) {
            view.addOnAttachStateChangeListener(new a(view, o02));
            mVar.a(new b(a10, z0Var, o02, n10, view));
            return o02;
        }
        G0.a.c("ViewTreeLifecycleOwner not found from " + view);
        throw new C6527k();
    }

    public static /* synthetic */ O0 c(View view, g gVar, C1790m mVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            gVar = h.f72645a;
        }
        if ((i10 & 2) != 0) {
            mVar = null;
        }
        return b(view, gVar, mVar);
    }

    public static final r d(View view) {
        r f10 = f(view);
        if (f10 != null) {
            return f10;
        }
        ViewParent parent = view.getParent();
        while (f10 == null && (parent instanceof View)) {
            f10 = f((View) parent);
            parent = parent.getParent();
        }
        return f10;
    }

    /* access modifiers changed from: private */
    public static final L e(Context context) {
        L l10;
        Map map = f13550a;
        synchronized (map) {
            try {
                Object obj = map.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    Wg.d b10 = Wg.g.b(-1, (Wg.a) null, (C6798l) null, 6, (Object) null);
                    obj = C5696h.M(C5696h.y(new c(contentResolver, uriFor, new d(b10, u1.h.a(Looper.getMainLooper())), b10, context, (C6658d) null)), Ug.L.b(), H.a.b(H.f66443a, 0, 0, 3, (Object) null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    map.put(context, obj);
                }
                l10 = (L) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return l10;
    }

    public static final r f(View view) {
        Object tag = view.getTag(m.f23098G);
        if (tag instanceof r) {
            return (r) tag;
        }
        return null;
    }

    private static final View g(View view) {
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            if (view2.getId() == 16908290) {
                return view;
            }
            View view3 = view2;
            parent = view2.getParent();
            view = view3;
        }
        return view;
    }

    public static final O0 h(View view) {
        if (!view.isAttachedToWindow()) {
            G0.a.b("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        View g10 = g(view);
        r f10 = f(g10);
        if (f10 == null) {
            return H1.f13529a.a(g10);
        }
        if (f10 instanceof O0) {
            return (O0) f10;
        }
        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
    }

    public static final void i(View view, r rVar) {
        view.setTag(m.f23098G, rVar);
    }
}
