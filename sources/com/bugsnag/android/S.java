package com.bugsnag.android;

import K4.k;
import K4.t;
import com.bugsnag.android.v1;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

class S extends C3261o {

    /* renamed from: g  reason: collision with root package name */
    static long f38593g = 3000;

    /* renamed from: a  reason: collision with root package name */
    final S0 f38594a;

    /* renamed from: b  reason: collision with root package name */
    private final C3283y0 f38595b;

    /* renamed from: c  reason: collision with root package name */
    private final k f38596c;

    /* renamed from: d  reason: collision with root package name */
    private final C3233e1 f38597d;

    /* renamed from: e  reason: collision with root package name */
    private final C3284z f38598e;

    /* renamed from: f  reason: collision with root package name */
    final K4.b f38599f;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C3271s0 f38600a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C3262o0 f38601b;

        a(C3271s0 s0Var, C3262o0 o0Var) {
            this.f38600a = s0Var;
            this.f38601b = o0Var;
        }

        public void run() {
            S.this.f(this.f38600a, this.f38601b);
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f38603a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bugsnag.android.V[] r0 = com.bugsnag.android.V.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f38603a = r0
                com.bugsnag.android.V r1 = com.bugsnag.android.V.DELIVERED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f38603a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bugsnag.android.V r1 = com.bugsnag.android.V.UNDELIVERED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f38603a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bugsnag.android.V r1 = com.bugsnag.android.V.FAILURE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.S.b.<clinit>():void");
        }
    }

    S(S0 s02, C3283y0 y0Var, k kVar, C3284z zVar, C3233e1 e1Var, K4.b bVar) {
        this.f38594a = s02;
        this.f38595b = y0Var;
        this.f38596c = kVar;
        this.f38598e = zVar;
        this.f38597d = e1Var;
        this.f38599f = bVar;
    }

    private void b(C3262o0 o0Var) {
        long currentTimeMillis = System.currentTimeMillis() + f38593g;
        Future J10 = this.f38595b.J(o0Var);
        long currentTimeMillis2 = currentTimeMillis - System.currentTimeMillis();
        if (J10 != null && currentTimeMillis2 > 0) {
            try {
                J10.get(currentTimeMillis2, TimeUnit.MILLISECONDS);
            } catch (Exception e10) {
                this.f38594a.b("failed to immediately deliver event", e10);
            }
            if (!J10.isDone()) {
                J10.cancel(true);
            }
        }
    }

    private void c(C3262o0 o0Var, boolean z10) {
        this.f38595b.k(o0Var);
        if (z10) {
            this.f38595b.v();
        }
    }

    private void e(C3262o0 o0Var, C3271s0 s0Var) {
        try {
            this.f38599f.d(t.ERROR_REQUEST, new a(s0Var, o0Var));
        } catch (RejectedExecutionException unused) {
            c(o0Var, false);
            this.f38594a.e("Exceeded max queue count, saving to disk to send later");
        }
    }

    /* access modifiers changed from: package-private */
    public void d(C3262o0 o0Var) {
        this.f38594a.g("DeliveryDelegate#deliver() - event being stored/delivered by Client");
        C3254l1 j10 = o0Var.j();
        if (j10 != null) {
            if (o0Var.m()) {
                o0Var.w(j10.j());
                updateState(v1.k.f38929a);
            } else {
                o0Var.w(j10.i());
                updateState(v1.j.f38928a);
            }
        }
        if (o0Var.i().l()) {
            boolean equals = "unhandledPromiseRejection".equals(o0Var.i().n());
            if (o0Var.i().q(o0Var) || equals) {
                c(o0Var, true);
            } else if (this.f38596c.e()) {
                b(o0Var);
            } else {
                c(o0Var, false);
            }
        } else if (this.f38598e.i(o0Var, this.f38594a)) {
            e(o0Var, new C3271s0(o0Var.e(), o0Var, this.f38597d, this.f38596c));
        }
    }

    /* access modifiers changed from: package-private */
    public V f(C3271s0 s0Var, C3262o0 o0Var) {
        this.f38594a.g("DeliveryDelegate#deliverPayloadInternal() - attempting event delivery");
        V b10 = this.f38596c.i().b(s0Var, this.f38596c.o(s0Var));
        int i10 = b.f38603a[b10.ordinal()];
        if (i10 == 1) {
            this.f38594a.d("Sent 1 new event to Bugsnag");
        } else if (i10 == 2) {
            this.f38594a.e("Could not send event(s) to Bugsnag, saving to disk to send later");
            c(o0Var, false);
        } else if (i10 == 3) {
            this.f38594a.e("Problem sending event to Bugsnag");
        }
        return b10;
    }
}
