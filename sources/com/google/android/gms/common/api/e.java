package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.c;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.internal.C;
import com.google.android.gms.common.api.internal.C4489a;
import com.google.android.gms.common.api.internal.C4490b;
import com.google.android.gms.common.api.internal.C4492d;
import com.google.android.gms.common.api.internal.C4495g;
import com.google.android.gms.common.api.internal.C4499k;
import com.google.android.gms.common.api.internal.C4500l;
import com.google.android.gms.common.api.internal.C4501m;
import com.google.android.gms.common.api.internal.C4504p;
import com.google.android.gms.common.api.internal.C4505q;
import com.google.android.gms.common.api.internal.C4508u;
import com.google.android.gms.common.api.internal.C4510w;
import com.google.android.gms.common.api.internal.C4512y;
import com.google.android.gms.common.api.internal.L;
import com.google.android.gms.common.api.internal.Q;
import com.google.android.gms.common.api.internal.f0;
import com.google.android.gms.common.internal.C4518c;
import com.google.android.gms.common.internal.C4522e;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.Collections;

public abstract class e {
    protected final C4495g zaa;
    private final Context zab;
    private final String zac;
    private final a zad;
    private final a.d zae;
    private final C4490b zaf;
    private final Looper zag;
    private final int zah;
    private final f zai;
    private final C4508u zaj;

    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public static final a f53922c = new C0820a().a();

        /* renamed from: a  reason: collision with root package name */
        public final C4508u f53923a;

        /* renamed from: b  reason: collision with root package name */
        public final Looper f53924b;

        /* renamed from: com.google.android.gms.common.api.e$a$a  reason: collision with other inner class name */
        public static class C0820a {

            /* renamed from: a  reason: collision with root package name */
            private C4508u f53925a;

            /* renamed from: b  reason: collision with root package name */
            private Looper f53926b;

            public a a() {
                if (this.f53925a == null) {
                    this.f53925a = new C4489a();
                }
                if (this.f53926b == null) {
                    this.f53926b = Looper.getMainLooper();
                }
                return new a(this.f53925a, this.f53926b);
            }

            public C0820a b(Looper looper) {
                C4536s.m(looper, "Looper must not be null.");
                this.f53926b = looper;
                return this;
            }

            public C0820a c(C4508u uVar) {
                C4536s.m(uVar, "StatusExceptionMapper must not be null.");
                this.f53925a = uVar;
                return this;
            }
        }

        private a(C4508u uVar, Account account, Looper looper) {
            this.f53923a = uVar;
            this.f53924b = looper;
        }
    }

    public e(Activity activity, a aVar, a.d dVar, a aVar2) {
        this(activity, activity, aVar, dVar, aVar2);
    }

    private final C4492d b(int i10, C4492d dVar) {
        dVar.zak();
        this.zaa.C(this, i10, dVar);
        return dVar;
    }

    private final Task c(int i10, C4510w wVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zaa.D(this, i10, wVar, taskCompletionSource, this.zaj);
        return taskCompletionSource.getTask();
    }

    public f asGoogleApiClient() {
        return this.zai;
    }

    /* access modifiers changed from: protected */
    public C4522e.a createClientSettingsBuilder() {
        C4522e.a aVar = new C4522e.a();
        aVar.d((Account) null);
        aVar.c(Collections.emptySet());
        aVar.e(this.zab.getClass().getName());
        aVar.b(this.zab.getPackageName());
        return aVar;
    }

    /* access modifiers changed from: protected */
    public Task<Boolean> disconnectService() {
        return this.zaa.w(this);
    }

    public <A extends a.b, T extends C4492d> T doBestEffortWrite(T t10) {
        b(2, t10);
        return t10;
    }

    public <A extends a.b, T extends C4492d> T doRead(T t10) {
        b(0, t10);
        return t10;
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public <A extends a.b, T extends C4504p, U extends C4512y> Task<Void> doRegisterEventListener(T t10, U u10) {
        C4536s.l(t10);
        C4536s.l(u10);
        throw null;
    }

    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(C4499k.a aVar) {
        return doUnregisterEventListener(aVar, 0);
    }

    public <A extends a.b, T extends C4492d> T doWrite(T t10) {
        b(1, t10);
        return t10;
    }

    /* access modifiers changed from: protected */
    public String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    public final C4490b getApiKey() {
        return this.zaf;
    }

    public a.d getApiOptions() {
        return this.zae;
    }

    public Context getApplicationContext() {
        return this.zab;
    }

    /* access modifiers changed from: protected */
    public String getContextAttributionTag() {
        return this.zac;
    }

    /* access modifiers changed from: protected */
    @Deprecated
    public String getContextFeatureId() {
        return this.zac;
    }

    public Looper getLooper() {
        return this.zag;
    }

    public <L> C4499k registerListener(L l10, String str) {
        return C4500l.a(l10, this.zag, str);
    }

    public final int zaa() {
        return this.zah;
    }

    public final a.f zab(Looper looper, L l10) {
        a.f buildClient = ((a.C0818a) C4536s.l(this.zad.a())).buildClient(this.zab, looper, createClientSettingsBuilder().a(), (Object) this.zae, (f.b) l10, (f.c) l10);
        String contextAttributionTag = getContextAttributionTag();
        if (contextAttributionTag != null && (buildClient instanceof C4518c)) {
            ((C4518c) buildClient).setAttributionTag(contextAttributionTag);
        }
        if (contextAttributionTag == null || !(buildClient instanceof C4501m)) {
            return buildClient;
        }
        c.a(buildClient);
        throw null;
    }

    public final f0 zac(Context context, Handler handler) {
        return new f0(context, handler, createClientSettingsBuilder().a());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(android.app.Activity r2, com.google.android.gms.common.api.a r3, com.google.android.gms.common.api.a.d r4, com.google.android.gms.common.api.internal.C4508u r5) {
        /*
            r1 = this;
            com.google.android.gms.common.api.e$a$a r0 = new com.google.android.gms.common.api.e$a$a
            r0.<init>()
            r0.c(r5)
            android.os.Looper r5 = r2.getMainLooper()
            r0.b(r5)
            com.google.android.gms.common.api.e$a r5 = r0.a()
            r1.<init>((android.app.Activity) r2, (com.google.android.gms.common.api.a) r3, (com.google.android.gms.common.api.a.d) r4, (com.google.android.gms.common.api.e.a) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.e.<init>(android.app.Activity, com.google.android.gms.common.api.a, com.google.android.gms.common.api.a$d, com.google.android.gms.common.api.internal.u):void");
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> Task<TResult> doBestEffortWrite(C4510w wVar) {
        return c(2, wVar);
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> Task<TResult> doRead(C4510w wVar) {
        return c(0, wVar);
    }

    @ResultIgnorabilityUnspecified
    public Task<Boolean> doUnregisterEventListener(C4499k.a aVar, int i10) {
        C4536s.m(aVar, "Listener key cannot be null.");
        return this.zaa.x(this, aVar, i10);
    }

    @ResultIgnorabilityUnspecified
    public <TResult, A extends a.b> Task<TResult> doWrite(C4510w wVar) {
        return c(1, wVar);
    }

    private e(Context context, Activity activity, a aVar, a.d dVar, a aVar2) {
        String str;
        C4536s.m(context, "Null context is not permitted.");
        C4536s.m(aVar, "Api must not be null.");
        C4536s.m(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) C4536s.m(context.getApplicationContext(), "The provided context did not have an application context.");
        this.zab = context2;
        if (Build.VERSION.SDK_INT >= 30) {
            str = context.getAttributionTag();
        } else {
            str = getApiFallbackAttributionTag(context);
        }
        this.zac = str;
        this.zad = aVar;
        this.zae = dVar;
        this.zag = aVar2.f53924b;
        C4490b a10 = C4490b.a(aVar, dVar, str);
        this.zaf = a10;
        this.zai = new Q(this);
        C4495g u10 = C4495g.u(context2);
        this.zaa = u10;
        this.zah = u10.l();
        this.zaj = aVar2.f53923a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            C.j(activity, u10, a10);
        }
        u10.H(this);
    }

    @ResultIgnorabilityUnspecified
    public <A extends a.b> Task<Void> doRegisterEventListener(C4505q qVar) {
        C4536s.l(qVar);
        throw null;
    }

    public e(Context context, a aVar, a.d dVar, a aVar2) {
        this(context, (Activity) null, aVar, dVar, aVar2);
    }
}
