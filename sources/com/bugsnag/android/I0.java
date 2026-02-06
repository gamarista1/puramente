package com.bugsnag.android;

import K4.b;
import K4.k;
import K4.t;
import L4.d;
import android.content.Context;
import android.os.Build;
import android.os.storage.StorageManager;
import com.bugsnag.android.D0;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;

class I0 implements D0.a {

    /* renamed from: a  reason: collision with root package name */
    final S0 f38489a;

    /* renamed from: b  reason: collision with root package name */
    final k f38490b;

    /* renamed from: c  reason: collision with root package name */
    final StorageManager f38491c;

    /* renamed from: d  reason: collision with root package name */
    final C3249k f38492d;

    /* renamed from: e  reason: collision with root package name */
    final d f38493e;

    /* renamed from: f  reason: collision with root package name */
    final Context f38494f;

    /* renamed from: g  reason: collision with root package name */
    final C3266p1 f38495g;

    /* renamed from: h  reason: collision with root package name */
    final C3233e1 f38496h;

    /* renamed from: i  reason: collision with root package name */
    final b f38497i;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C3271s0 f38498a;

        a(C3271s0 s0Var) {
            this.f38498a = s0Var;
        }

        public void run() {
            try {
                I0.this.f38489a.g("InternalReportDelegate - sending internal event");
                Q i10 = I0.this.f38490b.i();
                U o10 = I0.this.f38490b.o(this.f38498a);
                if (i10 instanceof O) {
                    Map b10 = o10.b();
                    b10.put("Bugsnag-Internal-Error", "bugsnag-android");
                    b10.remove("Bugsnag-Api-Key");
                    ((O) i10).c(o10.a(), this.f38498a.a(), this.f38498a.e(), b10);
                }
            } catch (Exception e10) {
                I0.this.f38489a.b("Failed to report internal event to Bugsnag", e10);
            }
        }
    }

    I0(Context context, S0 s02, k kVar, StorageManager storageManager, C3249k kVar2, d dVar, C3266p1 p1Var, C3233e1 e1Var, b bVar) {
        this.f38489a = s02;
        this.f38490b = kVar;
        this.f38491c = storageManager;
        this.f38492d = kVar2;
        this.f38493e = dVar;
        this.f38494f = context;
        this.f38495g = p1Var;
        this.f38496h = e1Var;
        this.f38497i = bVar;
    }

    public void a(Exception exc, File file, String str) {
        C3262o0 o0Var = new C3262o0(exc, this.f38490b, q1.h("unhandledException"), this.f38489a);
        o0Var.r(str);
        o0Var.b("BugsnagDiagnostics", "canRead", Boolean.valueOf(file.canRead()));
        o0Var.b("BugsnagDiagnostics", "canWrite", Boolean.valueOf(file.canWrite()));
        o0Var.b("BugsnagDiagnostics", "exists", Boolean.valueOf(file.exists()));
        o0Var.b("BugsnagDiagnostics", "usableSpace", Long.valueOf(this.f38494f.getCacheDir().getUsableSpace()));
        o0Var.b("BugsnagDiagnostics", "filename", file.getName());
        o0Var.b("BugsnagDiagnostics", "fileLength", Long.valueOf(file.length()));
        b(o0Var);
        c(o0Var);
    }

    /* access modifiers changed from: package-private */
    public void b(C3262o0 o0Var) {
        if (this.f38491c != null && Build.VERSION.SDK_INT >= 26) {
            File file = new File(this.f38494f.getCacheDir(), "bugsnag/errors");
            try {
                boolean a10 = this.f38491c.isCacheBehaviorTombstone(file);
                boolean a11 = this.f38491c.isCacheBehaviorGroup(file);
                o0Var.b("BugsnagDiagnostics", "cacheTombstone", Boolean.valueOf(a10));
                o0Var.b("BugsnagDiagnostics", "cacheGroup", Boolean.valueOf(a11));
            } catch (IOException e10) {
                this.f38489a.b("Failed to record cache behaviour, skipping diagnostics", e10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(C3262o0 o0Var) {
        o0Var.p(this.f38492d.e());
        o0Var.s(((C3223b0) this.f38493e.get()).j(new Date().getTime()));
        o0Var.b("BugsnagDiagnostics", "notifierName", this.f38496h.b());
        o0Var.b("BugsnagDiagnostics", "notifierVersion", this.f38496h.d());
        o0Var.b("BugsnagDiagnostics", "apiKey", this.f38490b.a());
        try {
            this.f38497i.d(t.INTERNAL_REPORT, new a(new C3271s0((String) null, o0Var, this.f38496h, this.f38490b)));
        } catch (RejectedExecutionException unused) {
        }
    }
}
