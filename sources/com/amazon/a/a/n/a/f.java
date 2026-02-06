package com.amazon.a.a.n.a;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import com.amazon.a.a.i.d;
import com.amazon.a.a.n.a.a.e;
import com.amazon.a.a.o.c;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class f extends com.amazon.a.a.i.b {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final c f37360b = new c("DecisionDialog");

    /* renamed from: c  reason: collision with root package name */
    private final Thread f37361c = Thread.currentThread();

    /* renamed from: d  reason: collision with root package name */
    private final b f37362d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final BlockingQueue<a> f37363e = new LinkedBlockingQueue();

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private final com.amazon.d.a.a f37366a;

        /* renamed from: b  reason: collision with root package name */
        private final String f37367b;

        /* renamed from: c  reason: collision with root package name */
        private final Intent f37368c;

        public a(com.amazon.d.a.a aVar) {
            this.f37366a = aVar;
            this.f37367b = aVar.a();
            this.f37368c = aVar.b();
        }

        public com.amazon.d.a.a a() {
            return this.f37366a;
        }

        public String b() {
            return this.f37367b;
        }

        public Intent c() {
            return this.f37368c;
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f37369a;

        /* renamed from: b  reason: collision with root package name */
        private final String f37370b;

        /* renamed from: c  reason: collision with root package name */
        private final long f37371c;

        /* renamed from: d  reason: collision with root package name */
        private final a f37372d;

        /* renamed from: e  reason: collision with root package name */
        private final a f37373e;

        /* renamed from: f  reason: collision with root package name */
        private final a f37374f;

        public b(com.amazon.d.a.f fVar) {
            this.f37369a = fVar.b();
            this.f37370b = fVar.c();
            this.f37371c = fVar.d();
            this.f37372d = a(fVar.e());
            this.f37373e = a(fVar.f());
            this.f37374f = a(fVar.g());
        }

        private a a(com.amazon.d.a.a aVar) {
            if (aVar == null) {
                return null;
            }
            return new a(aVar);
        }

        public String b() {
            return this.f37370b;
        }

        public long c() {
            return this.f37371c;
        }

        public a d() {
            return this.f37374f;
        }

        public a e() {
            return this.f37373e;
        }

        public a f() {
            return this.f37372d;
        }

        public String a() {
            return this.f37369a;
        }
    }

    public f(com.amazon.d.a.f fVar) {
        this.f37362d = new b(fVar);
    }

    private ActivityInfo e(Activity activity) {
        try {
            return activity.getPackageManager().getActivityInfo(activity.getComponentName(), 128);
        } catch (PackageManager.NameNotFoundException unused) {
            if (!c.f37535b) {
                return null;
            }
            c cVar = f37360b;
            cVar.b("Unable to get info for activity: " + activity);
            return null;
        }
    }

    private Dialog f(Activity activity) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(this.f37362d.a()).setMessage(this.f37362d.b()).setCancelable(false);
        AlertDialog create = builder.create();
        a(activity, create, this.f37362d.f(), -1);
        a(activity, create, this.f37362d.e(), -3);
        a(activity, create, this.f37362d.d(), -2);
        return create;
    }

    private com.amazon.d.a.a n() {
        try {
            if (c.f37534a) {
                c cVar = f37360b;
                cVar.a("Blocking while awaiting customer decision: " + Thread.currentThread());
            }
            return this.f37363e.take().a();
        } catch (InterruptedException unused) {
            if (c.f37534a) {
                f37360b.a("Interrupted while awaiting decision, throwing decision expired!");
            }
            throw new e(o());
        }
    }

    private e o() {
        if (l() == d.NOT_COMPATIBLE) {
            return e.APP_NOT_COMPATIBLE;
        }
        return e.EXPIRATION_DURATION_ELAPSED;
    }

    private boolean p() {
        if (a(this.f37362d.f()) || a(this.f37362d.e()) || a(this.f37362d.d())) {
            return true;
        }
        return false;
    }

    public Dialog d(Activity activity) {
        return f(activity);
    }

    /* access modifiers changed from: protected */
    public long h() {
        return this.f37362d.c();
    }

    public com.amazon.d.a.a i() {
        if (c.f37534a) {
            c cVar = f37360b;
            cVar.a("GetCustomerDecision: " + this.f37361c);
        }
        return n();
    }

    public String toString() {
        return "DecisionDialog: " + this.f37362d.a();
    }

    private boolean a(a aVar) {
        return (aVar == null || aVar.c() == null) ? false : true;
    }

    public boolean b(Activity activity) {
        if (!p()) {
            return true;
        }
        ActivityInfo e10 = e(activity);
        if (e10 == null) {
            return false;
        }
        boolean z10 = e10.launchMode == 3;
        c cVar = f37360b;
        cVar.a("Single instance: " + z10);
        boolean z11 = (e10.flags & 2) != 0;
        cVar.a("Finish on task launch:" + z11);
        boolean z12 = (e10.flags & 128) != 0;
        cVar.a("No History: " + z12);
        if (z10 || z11 || z12) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void a(d dVar) {
        if (c.f37534a) {
            c cVar = f37360b;
            cVar.a("Expiring Decision Dialog: Thread: " + Thread.currentThread());
        }
        this.f37361c.interrupt();
    }

    private void a(Activity activity, AlertDialog alertDialog, final a aVar, int i10) {
        if (aVar != null) {
            alertDialog.setButton(i10, aVar.b(), new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i10) {
                    if (c.f37534a) {
                        f.f37360b.a("Choice selected!");
                    }
                    if (f.this.k()) {
                        f.this.f37363e.add(aVar);
                    }
                }
            });
        }
    }
}
