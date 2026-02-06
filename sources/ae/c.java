package Ae;

import Fe.C3023l;
import Fe.E;
import Fe.y;
import Ug.C5572i;
import Ug.C5599w;
import Ug.C5600w0;
import Ug.C5603y;
import Ug.K;
import Ug.U0;
import Ug.Z;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.adjust.sdk.Constants;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.miui.referrer.api.GetAppsReferrerClient;
import com.miui.referrer.api.GetAppsReferrerStateListener;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6514M;
import lf.w;
import mf.C6565s;
import org.json.JSONException;
import org.json.JSONObject;
import qf.C6658d;
import rf.C6680b;
import wf.C6763c;
import yf.p;

public abstract class c {

    static final class a extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        Object f50276a;

        /* renamed from: b  reason: collision with root package name */
        Object f50277b;

        /* renamed from: c  reason: collision with root package name */
        Object f50278c;

        /* renamed from: d  reason: collision with root package name */
        Object f50279d;

        /* renamed from: e  reason: collision with root package name */
        Object f50280e;

        /* renamed from: f  reason: collision with root package name */
        int f50281f;

        /* renamed from: g  reason: collision with root package name */
        int f50282g;

        /* renamed from: h  reason: collision with root package name */
        private /* synthetic */ Object f50283h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ Context f50284i;

        /* renamed from: Ae.c$a$a  reason: collision with other inner class name */
        static final class C0763a extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f50285a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Context f50286b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0763a(Context context, C6658d dVar) {
                super(2, dVar);
                this.f50286b = context;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new C0763a(this.f50286b, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((C0763a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f50285a;
                if (i10 == 0) {
                    w.b(obj);
                    Context context = this.f50286b;
                    this.f50285a = 1;
                    obj = c.c(context, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    w.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        static final class b extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f50287a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Context f50288b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(Context context, C6658d dVar) {
                super(2, dVar);
                this.f50288b = context;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new b(this.f50288b, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f50287a;
                if (i10 == 0) {
                    w.b(obj);
                    Context context = this.f50288b;
                    this.f50287a = 1;
                    obj = c.d(context, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    w.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* renamed from: Ae.c$a$c  reason: collision with other inner class name */
        static final class C0764c extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f50289a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Context f50290b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0764c(Context context, C6658d dVar) {
                super(2, dVar);
                this.f50290b = context;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new C0764c(this.f50290b, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((C0764c) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f50289a;
                if (i10 == 0) {
                    w.b(obj);
                    Context context = this.f50290b;
                    this.f50289a = 1;
                    obj = c.g(context, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    w.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        static final class d extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f50291a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Context f50292b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            d(Context context, C6658d dVar) {
                super(2, dVar);
                this.f50292b = context;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new d(this.f50292b, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((d) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f50291a;
                if (i10 == 0) {
                    w.b(obj);
                    Context context = this.f50292b;
                    this.f50291a = 1;
                    obj = c.h(context, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    w.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        static final class e extends l implements p {

            /* renamed from: a  reason: collision with root package name */
            int f50293a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Context f50294b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            e(Context context, C6658d dVar) {
                super(2, dVar);
                this.f50294b = context;
            }

            public final C6658d create(Object obj, C6658d dVar) {
                return new e(this.f50294b, dVar);
            }

            public final Object invoke(K k10, C6658d dVar) {
                return ((e) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C6680b.f();
                int i10 = this.f50293a;
                if (i10 == 0) {
                    w.b(obj);
                    Context context = this.f50294b;
                    this.f50293a = 1;
                    obj = c.i(context, this);
                    if (obj == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    w.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(Context context, C6658d dVar) {
            super(2, dVar);
            this.f50284i = context;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            a aVar = new a(this.f50284i, dVar);
            aVar.f50283h = obj;
            return aVar;
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((a) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0151 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0152  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x016b A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x016c  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0183 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x0184  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                java.lang.Object r1 = rf.C6680b.f()
                int r2 = r0.f50282g
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                r8 = 0
                if (r2 == 0) goto L_0x00aa
                if (r2 == r7) goto L_0x0087
                if (r2 == r6) goto L_0x0067
                if (r2 == r5) goto L_0x004b
                if (r2 == r4) goto L_0x0034
                if (r2 != r3) goto L_0x002c
                int r4 = r0.f50281f
                java.lang.Object r1 = r0.f50276a
                Be.a[] r1 = (Be.a[]) r1
                java.lang.Object r2 = r0.f50283h
                Be.a[] r2 = (Be.a[]) r2
                lf.w.b(r18)
                r6 = r2
                r2 = r18
                goto L_0x0185
            L_0x002c:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0034:
                int r5 = r0.f50281f
                java.lang.Object r2 = r0.f50277b
                Be.a[] r2 = (Be.a[]) r2
                java.lang.Object r6 = r0.f50276a
                Be.a[] r6 = (Be.a[]) r6
                java.lang.Object r7 = r0.f50283h
                Ug.S r7 = (Ug.S) r7
                lf.w.b(r18)
                r11 = r7
                r7 = r5
                r5 = r18
                goto L_0x016f
            L_0x004b:
                int r6 = r0.f50281f
                java.lang.Object r2 = r0.f50278c
                Be.a[] r2 = (Be.a[]) r2
                java.lang.Object r7 = r0.f50277b
                Be.a[] r7 = (Be.a[]) r7
                java.lang.Object r9 = r0.f50276a
                Ug.S r9 = (Ug.S) r9
                java.lang.Object r10 = r0.f50283h
                Ug.S r10 = (Ug.S) r10
                lf.w.b(r18)
                r11 = r9
                r9 = r2
                r2 = r5
                r5 = r18
                goto L_0x0154
            L_0x0067:
                int r7 = r0.f50281f
                java.lang.Object r2 = r0.f50279d
                Be.a[] r2 = (Be.a[]) r2
                java.lang.Object r9 = r0.f50278c
                Be.a[] r9 = (Be.a[]) r9
                java.lang.Object r10 = r0.f50277b
                Ug.S r10 = (Ug.S) r10
                java.lang.Object r11 = r0.f50276a
                Ug.S r11 = (Ug.S) r11
                java.lang.Object r12 = r0.f50283h
                Ug.S r12 = (Ug.S) r12
                lf.w.b(r18)
                r4 = r11
                r11 = r10
                r10 = r2
                r2 = r18
                goto L_0x0138
            L_0x0087:
                int r2 = r0.f50281f
                java.lang.Object r9 = r0.f50280e
                Be.a[] r9 = (Be.a[]) r9
                java.lang.Object r10 = r0.f50279d
                Be.a[] r10 = (Be.a[]) r10
                java.lang.Object r11 = r0.f50278c
                Ug.S r11 = (Ug.S) r11
                java.lang.Object r12 = r0.f50277b
                Ug.S r12 = (Ug.S) r12
                java.lang.Object r13 = r0.f50276a
                Ug.S r13 = (Ug.S) r13
                java.lang.Object r14 = r0.f50283h
                Ug.S r14 = (Ug.S) r14
                lf.w.b(r18)
                r4 = r12
                r5 = r13
                r12 = r18
                goto L_0x011b
            L_0x00aa:
                lf.w.b(r18)
                java.lang.Object r2 = r0.f50283h
                Ug.K r2 = (Ug.K) r2
                Ae.c$a$a r12 = new Ae.c$a$a
                android.content.Context r9 = r0.f50284i
                r12.<init>(r9, r8)
                r13 = 3
                r14 = 0
                r10 = 0
                r11 = 0
                r9 = r2
                Ug.S r15 = Ug.C5576k.b(r9, r10, r11, r12, r13, r14)
                Ae.c$a$b r12 = new Ae.c$a$b
                android.content.Context r9 = r0.f50284i
                r12.<init>(r9, r8)
                r9 = r2
                Ug.S r14 = Ug.C5576k.b(r9, r10, r11, r12, r13, r14)
                Ae.c$a$d r12 = new Ae.c$a$d
                android.content.Context r9 = r0.f50284i
                r12.<init>(r9, r8)
                r16 = 0
                r9 = r2
                r4 = r14
                r14 = r16
                Ug.S r14 = Ug.C5576k.b(r9, r10, r11, r12, r13, r14)
                Ae.c$a$e r12 = new Ae.c$a$e
                android.content.Context r9 = r0.f50284i
                r12.<init>(r9, r8)
                r9 = r2
                r5 = r14
                r14 = r16
                Ug.S r14 = Ug.C5576k.b(r9, r10, r11, r12, r13, r14)
                Ae.c$a$c r12 = new Ae.c$a$c
                android.content.Context r9 = r0.f50284i
                r12.<init>(r9, r8)
                r9 = r2
                r2 = r14
                r14 = r16
                Ug.S r9 = Ug.C5576k.b(r9, r10, r11, r12, r13, r14)
                Be.a[] r10 = new Be.a[r3]
                r0.f50283h = r4
                r0.f50276a = r5
                r0.f50277b = r2
                r0.f50278c = r9
                r0.f50279d = r10
                r0.f50280e = r10
                r11 = 0
                r0.f50281f = r11
                r0.f50282g = r7
                java.lang.Object r12 = r15.y(r0)
                if (r12 != r1) goto L_0x0116
                return r1
            L_0x0116:
                r14 = r4
                r4 = r2
                r2 = r11
                r11 = r9
                r9 = r10
            L_0x011b:
                Be.a r12 = (Be.a) r12
                r9[r2] = r12
                r0.f50283h = r5
                r0.f50276a = r4
                r0.f50277b = r11
                r0.f50278c = r10
                r0.f50279d = r10
                r0.f50280e = r8
                r0.f50281f = r7
                r0.f50282g = r6
                java.lang.Object r2 = r14.y(r0)
                if (r2 != r1) goto L_0x0136
                return r1
            L_0x0136:
                r12 = r5
                r9 = r10
            L_0x0138:
                Be.a r2 = (Be.a) r2
                r10[r7] = r2
                r0.f50283h = r4
                r0.f50276a = r11
                r0.f50277b = r9
                r0.f50278c = r9
                r0.f50279d = r8
                r0.f50281f = r6
                r2 = 3
                r0.f50282g = r2
                java.lang.Object r5 = r12.y(r0)
                if (r5 != r1) goto L_0x0152
                return r1
            L_0x0152:
                r10 = r4
                r7 = r9
            L_0x0154:
                Be.a r5 = (Be.a) r5
                r9[r6] = r5
                r0.f50283h = r11
                r0.f50276a = r7
                r0.f50277b = r7
                r0.f50278c = r8
                r0.f50281f = r2
                r4 = 4
                r0.f50282g = r4
                java.lang.Object r5 = r10.y(r0)
                if (r5 != r1) goto L_0x016c
                return r1
            L_0x016c:
                r6 = r7
                r7 = r2
                r2 = r6
            L_0x016f:
                Be.a r5 = (Be.a) r5
                r2[r7] = r5
                r0.f50283h = r6
                r0.f50276a = r6
                r0.f50277b = r8
                r0.f50281f = r4
                r0.f50282g = r3
                java.lang.Object r2 = r11.y(r0)
                if (r2 != r1) goto L_0x0184
                return r1
            L_0x0184:
                r1 = r6
            L_0x0185:
                Be.a r2 = (Be.a) r2
                r1[r4] = r2
                java.util.List r1 = mf.C6565s.q(r6)
                Be.a r2 = Ae.c.f(r1)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "All Install Referrers: "
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                Fe.C3023l.l(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Latest Install Referrer: "
                r1.append(r3)
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                Fe.C3023l.l(r1)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: Ae.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class b extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f50295a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f50296b;

        public static final class a implements InstallReferrerStateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5599w f50297a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ InstallReferrerClient f50298b;

            a(C5599w wVar, InstallReferrerClient installReferrerClient) {
                this.f50297a = wVar;
                this.f50298b = installReferrerClient;
            }

            public void onInstallReferrerServiceDisconnected() {
                if (!this.f50297a.o()) {
                    this.f50297a.j0((Object) null);
                }
            }

            public void onInstallReferrerSetupFinished(int i10) {
                int i11 = i10;
                C3023l.l("getGooglePlayStoreReferrerDetails onInstallReferrerSetupFinished response code: " + i11);
                Be.a aVar = null;
                if (i11 == 0) {
                    C5599w wVar = this.f50297a;
                    try {
                        ReferrerDetails installReferrer = this.f50298b.getInstallReferrer();
                        aVar = new Be.a(y.Google_Play_Store.b(), installReferrer.getInstallBeginTimestampSeconds(), installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), Long.valueOf(installReferrer.getInstallBeginTimestampServerSeconds()), Long.valueOf(installReferrer.getReferrerClickTimestampServerSeconds()), false, 64, (DefaultConstructorMarker) null);
                    } catch (Exception e10) {
                        C3023l.m("Caught getGooglePlayStoreReferrerDetails installReferrer exception: " + e10);
                    }
                    wVar.j0(aVar);
                } else {
                    this.f50297a.j0((Object) null);
                }
                this.f50298b.endConnection();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(Context context, C6658d dVar) {
            super(2, dVar);
            this.f50296b = context;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new b(this.f50296b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((b) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f50295a;
            if (i10 == 0) {
                w.b(obj);
                C5599w b10 = C5603y.b((C5600w0) null, 1, (Object) null);
                InstallReferrerClient build = InstallReferrerClient.newBuilder(this.f50296b.getApplicationContext()).build();
                build.startConnection(new a(b10, build));
                this.f50295a = 1;
                obj = b10.y(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    w.b(obj);
                } catch (Exception e10) {
                    C3023l.m("Caught getGooglePlayStoreReferrerDetails exception: " + e10);
                    return null;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return (Be.a) obj;
        }
    }

    /* renamed from: Ae.c$c  reason: collision with other inner class name */
    static final class C0765c extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f50299a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f50300b;

        /* renamed from: Ae.c$c$a */
        public static final class a implements com.huawei.hms.ads.installreferrer.api.InstallReferrerStateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5599w f50301a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.huawei.hms.ads.installreferrer.api.InstallReferrerClient f50302b;

            a(C5599w wVar, com.huawei.hms.ads.installreferrer.api.InstallReferrerClient installReferrerClient) {
                this.f50301a = wVar;
                this.f50302b = installReferrerClient;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0765c(Context context, C6658d dVar) {
            super(2, dVar);
            this.f50300b = context;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new C0765c(this.f50300b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((C0765c) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f50299a;
            if (i10 == 0) {
                w.b(obj);
                if (!Ie.f.a("com.huawei.hms.ads.installreferrer.api.InstallReferrerClient")) {
                    return null;
                }
                C5599w b10 = C5603y.b((C5600w0) null, 1, (Object) null);
                com.huawei.hms.ads.installreferrer.api.InstallReferrerClient build = com.huawei.hms.ads.installreferrer.api.InstallReferrerClient.newBuilder(this.f50300b).build();
                build.startConnection(new a(b10, build));
                this.f50299a = 1;
                obj = b10.y(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    w.b(obj);
                } catch (Exception e10) {
                    C3023l.m("Caught getHuaweiAppGalleryReferrerDetails exception: " + e10);
                    return null;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return (Be.a) obj;
        }
    }

    static final class d extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f50303a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f50304b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(Context context, C6658d dVar) {
            super(2, dVar);
            this.f50304b = context;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new d(this.f50304b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((d) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            C6680b.f();
            if (this.f50303a == 0) {
                w.b(obj);
                try {
                    String str = E.f30847k;
                    if (str != null) {
                        if (str.length() != 0) {
                            C3023l.l("Begin getMetaInstallReferrerDetails");
                            Context context = this.f50304b;
                            C6496s.g(str, "fbAppID");
                            return c.k(context, str);
                        }
                    }
                    C3023l.a("No Facebook App ID provided. Can't check for Meta Install Referrer");
                    return null;
                } catch (Exception e10) {
                    C3023l.b("Exception in getMetaInstallReferrerDetails: " + e10);
                    return null;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    static final class e extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f50305a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f50306b;

        public static final class a implements com.samsung.android.sdk.sinstallreferrer.api.InstallReferrerStateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5599w f50307a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.samsung.android.sdk.sinstallreferrer.api.InstallReferrerClient f50308b;

            a(C5599w wVar, com.samsung.android.sdk.sinstallreferrer.api.InstallReferrerClient installReferrerClient) {
                this.f50307a = wVar;
                this.f50308b = installReferrerClient;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Context context, C6658d dVar) {
            super(2, dVar);
            this.f50306b = context;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new e(this.f50306b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((e) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f50305a;
            if (i10 == 0) {
                w.b(obj);
                if (!Ie.f.a("com.samsung.android.sdk.sinstallreferrer.api.InstallReferrerClient")) {
                    return null;
                }
                C5599w b10 = C5603y.b((C5600w0) null, 1, (Object) null);
                com.samsung.android.sdk.sinstallreferrer.api.InstallReferrerClient build = com.samsung.android.sdk.sinstallreferrer.api.InstallReferrerClient.newBuilder(this.f50306b).build();
                build.startConnection(new a(b10, build));
                this.f50305a = 1;
                obj = b10.y(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    w.b(obj);
                } catch (Exception e10) {
                    C3023l.m("Caught getSamsungGalaxyStoreReferrerDetails exception: " + e10);
                    return null;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return (Be.a) obj;
        }
    }

    static final class f extends l implements p {

        /* renamed from: a  reason: collision with root package name */
        int f50309a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f50310b;

        public static final class a implements GetAppsReferrerStateListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C5599w f50311a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ GetAppsReferrerClient f50312b;

            a(C5599w wVar, GetAppsReferrerClient getAppsReferrerClient) {
                this.f50311a = wVar;
                this.f50312b = getAppsReferrerClient;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(Context context, C6658d dVar) {
            super(2, dVar);
            this.f50310b = context;
        }

        public final C6658d create(Object obj, C6658d dVar) {
            return new f(this.f50310b, dVar);
        }

        public final Object invoke(K k10, C6658d dVar) {
            return ((f) create(k10, dVar)).invokeSuspend(C6514M.f71813a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C6680b.f();
            int i10 = this.f50309a;
            if (i10 == 0) {
                w.b(obj);
                if (!Ie.f.a("com.miui.referrer.api.GetAppsReferrerClient")) {
                    return null;
                }
                C5599w b10 = C5603y.b((C5600w0) null, 1, (Object) null);
                GetAppsReferrerClient build = GetAppsReferrerClient.Companion.newBuilder(this.f50310b).build();
                build.startConnection(new a(b10, build));
                this.f50309a = 1;
                obj = b10.y(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    w.b(obj);
                } catch (Exception e10) {
                    C3023l.m("Caught getXiaomiGetAppsReferrerDetails exception: " + e10);
                    return null;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return (Be.a) obj;
        }
    }

    public static final Object b(Context context, C6658d dVar) {
        return U0.c(new a(context, (C6658d) null), dVar);
    }

    public static final Object c(Context context, C6658d dVar) {
        return C5572i.g(Z.a(), new b(context, (C6658d) null), dVar);
    }

    public static final Object d(Context context, C6658d dVar) {
        return C5572i.g(Z.a(), new C0765c(context, (C6658d) null), dVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: Be.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final Be.a e(java.util.List r7) {
        /*
            java.lang.String r0 = "allReferrers"
            kotlin.jvm.internal.C6496s.h(r7, r0)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.List r7 = mf.C6565s.l0(r7)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            boolean r0 = r7.hasNext()
            if (r0 != 0) goto L_0x0019
            r7 = 0
            goto L_0x0044
        L_0x0019:
            java.lang.Object r0 = r7.next()
            boolean r1 = r7.hasNext()
            if (r1 != 0) goto L_0x0025
        L_0x0023:
            r7 = r0
            goto L_0x0044
        L_0x0025:
            r1 = r0
            Be.a r1 = (Be.a) r1
            long r1 = r1.b()
        L_0x002c:
            java.lang.Object r3 = r7.next()
            r4 = r3
            Be.a r4 = (Be.a) r4
            long r4 = r4.b()
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x003d
            r0 = r3
            r1 = r4
        L_0x003d:
            boolean r3 = r7.hasNext()
            if (r3 != 0) goto L_0x002c
            goto L_0x0023
        L_0x0044:
            Be.a r7 = (Be.a) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: Ae.c.e(java.util.List):Be.a");
    }

    public static final Be.a f(List list) {
        C6496s.h(list, "allReferrers");
        Be.a e10 = e(list);
        Iterable<Be.a> l02 = C6565s.l0(list);
        if (!(l02 instanceof Collection) || !((Collection) l02).isEmpty()) {
            for (Be.a a10 : l02) {
                if (C6496s.c(a10.a(), y.Meta_Install_Referrer.b())) {
                    C6496s.e(e10);
                    return j(list, e10);
                }
            }
        }
        return e10;
    }

    public static final Object g(Context context, C6658d dVar) {
        return C5572i.g(Z.a(), new d(context, (C6658d) null), dVar);
    }

    public static final Object h(Context context, C6658d dVar) {
        return C5572i.g(Z.a(), new e(context, (C6658d) null), dVar);
    }

    public static final Object i(Context context, C6658d dVar) {
        return C5572i.g(Z.a(), new f(context, (C6658d) null), dVar);
    }

    private static final Be.a j(List list, Be.a aVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Iterable iterable = list;
        Iterator it = C6565s.l0(iterable).iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (C6496s.c(((Be.a) obj2).a(), y.Meta_Install_Referrer.b())) {
                break;
            }
        }
        Be.a aVar2 = (Be.a) obj2;
        C6496s.e(aVar2);
        if (!aVar2.g()) {
            Iterator it2 = C6565s.l0(iterable).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it2.next();
                if (C6496s.c(((Be.a) obj3).a(), y.Google_Play_Store.b())) {
                    break;
                }
            }
            Be.a aVar3 = (Be.a) obj3;
            if (aVar3 != null && aVar3.e() == 0) {
                return aVar2;
            }
            ArrayList arrayList = new ArrayList();
            for (Object next : C6565s.l0(iterable)) {
                if (!C6496s.c(((Be.a) next).a(), y.Meta_Install_Referrer.b())) {
                    arrayList.add(next);
                }
            }
            Iterator it3 = arrayList.iterator();
            if (it3.hasNext()) {
                obj = it3.next();
                if (it3.hasNext()) {
                    long b10 = ((Be.a) obj).b();
                    do {
                        Object next2 = it3.next();
                        long b11 = ((Be.a) next2).b();
                        if (b10 < b11) {
                            obj = next2;
                            b10 = b11;
                        }
                    } while (it3.hasNext());
                }
            }
            return (Be.a) obj;
        } else if (!C6496s.c(aVar.a(), y.Google_Play_Store.b()) || aVar.e() != aVar2.e()) {
            return aVar;
        } else {
            return aVar2;
        }
    }

    /* access modifiers changed from: private */
    public static final Be.a k(Context context, String str) {
        return e(C6565s.t(l(context, "content://com.facebook.katana.provider.InstallReferrerProvider/" + str), l(context, "content://com.instagram.contentprovider.InstallReferrerProvider/" + str), l(context, "content://com.facebook.lite.provider.InstallReferrerProvider/" + str)));
    }

    private static final Be.a l(Context context, String str) {
        Throwable th2;
        boolean z10;
        String str2;
        String str3 = str;
        Cursor query = context.getContentResolver().query(Uri.parse(str), new String[]{Constants.INSTALL_REFERRER, "is_ct", "actual_timestamp"}, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return null;
        }
        try {
            if (!query.moveToFirst()) {
                C3023l.a("getMetaInstallReferrerDetails - cursor is empty or null for provider " + str3);
                C6763c.a(query, (Throwable) null);
                return null;
            }
            int columnIndex = query.getColumnIndex("actual_timestamp");
            int columnIndex2 = query.getColumnIndex("is_ct");
            int columnIndex3 = query.getColumnIndex(Constants.INSTALL_REFERRER);
            if (!(columnIndex == -1 || columnIndex2 == -1)) {
                if (columnIndex3 != -1) {
                    long j10 = query.getLong(columnIndex);
                    if (query.getInt(columnIndex2) == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    String string = query.getString(columnIndex3);
                    try {
                        String decode = URLDecoder.decode(string, Constants.ENCODING);
                        C6496s.g(decode, "decode(installReferrerString, \"UTF-8\")");
                        String Q02 = Sg.p.Q0(decode, "utm_content=", "");
                        if (Q02.length() == 0) {
                            C3023l.m("getMetaInstallReferrerDetails - utm_content is empty for provider " + str3);
                            C6763c.a(query, (Throwable) null);
                            return null;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("getMetaInstallReferrerDetails - Got Meta Install Referrer as ");
                        if (z10) {
                            str2 = "click-through";
                        } else {
                            str2 = "view-through";
                        }
                        sb2.append(str2);
                        sb2.append(" from provider ");
                        sb2.append(str3);
                        sb2.append(": ");
                        sb2.append(string);
                        C3023l.d(sb2.toString());
                        try {
                            Be.a aVar = new Be.a(y.Meta_Install_Referrer.b(), new JSONObject(Q02).getLong("t"), string, j10, (Long) null, (Long) null, z10);
                            C6763c.a(query, (Throwable) null);
                            return aVar;
                        } catch (JSONException e10) {
                            C3023l.m("getMetaInstallReferrerDetails - JSONException in queryProvider: " + e10);
                            C6763c.a(query, (Throwable) null);
                            return null;
                        }
                    } catch (IllegalArgumentException e11) {
                        C3023l.m("getMetaInstallReferrerDetails - Error decoding URL: " + e11);
                        C6763c.a(query, (Throwable) null);
                        return null;
                    }
                }
            }
            C3023l.m("getMetaInstallReferrerDetails - Required column not found in cursor for provider " + str3);
            C6763c.a(query, (Throwable) null);
            return null;
        } catch (Throwable th3) {
            Throwable th4 = th3;
            C6763c.a(query, th2);
            throw th4;
        }
    }
}
