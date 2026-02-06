package com.amazon.a.a.i;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.view.KeyEvent;
import com.amazon.a.a.e.c;
import com.amazon.a.a.k.a;
import com.amazon.a.a.n.b.d;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class b extends c<b> {

    /* renamed from: b  reason: collision with root package name */
    private static final com.amazon.a.a.o.c f37196b = new com.amazon.a.a.o.c("Prompt");
    @a

    /* renamed from: c  reason: collision with root package name */
    private com.amazon.a.a.m.c f37197c;

    /* renamed from: d  reason: collision with root package name */
    private final int f37198d;

    /* renamed from: e  reason: collision with root package name */
    private Activity f37199e;

    /* renamed from: f  reason: collision with root package name */
    private d f37200f;

    /* renamed from: g  reason: collision with root package name */
    private Dialog f37201g;

    /* renamed from: h  reason: collision with root package name */
    private final AtomicBoolean f37202h = new AtomicBoolean(false);

    public b() {
        int i10 = i();
        this.f37198d = i10;
        if (com.amazon.a.a.o.c.f37534a) {
            com.amazon.a.a.o.c cVar = f37196b;
            cVar.a("Creating Prompt: " + i10);
        }
    }

    private boolean e(Activity activity) {
        if (this.f37197c.b(com.amazon.a.a.m.c.f37300e)) {
            return false;
        }
        return b(activity);
    }

    private void f(Activity activity) {
        if (com.amazon.a.a.o.c.f37534a) {
            com.amazon.a.a.o.c cVar = f37196b;
            cVar.a("Showing prompt, id: " + j() + ", prompt: " + this + ", activity: " + activity);
        }
        if (this.f37199e != null) {
            m();
        }
        activity.showDialog(j());
    }

    private int i() {
        int nextInt = new Random().nextInt(2146249079) + 1234567;
        if (nextInt <= 1234567) {
            return 1234567;
        }
        return nextInt;
    }

    private void m() {
        if (com.amazon.a.a.o.c.f37534a) {
            com.amazon.a.a.o.c cVar = f37196b;
            cVar.b("Dismissing dialog: " + this.f37198d);
        }
        try {
            this.f37199e.dismissDialog(this.f37198d);
            this.f37199e.removeDialog(this.f37198d);
        } catch (Exception unused) {
            if (com.amazon.a.a.o.c.f37534a) {
                com.amazon.a.a.o.c cVar2 = f37196b;
                cVar2.b("Unable to remove dialog: " + this.f37198d);
            }
        }
        this.f37199e = null;
        this.f37201g = null;
    }

    public final void a(Activity activity) {
        com.amazon.a.a.o.a.a.a((Object) activity, "activity");
        com.amazon.a.a.o.a.a.a();
        if (e(activity)) {
            f(activity);
        } else {
            b(d.NOT_COMPATIBLE);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(d dVar);

    /* access modifiers changed from: protected */
    public boolean b(Activity activity) {
        return true;
    }

    public final Dialog c(Activity activity) {
        this.f37199e = activity;
        Dialog d10 = d(activity);
        this.f37201g = d10;
        d10.setCancelable(false);
        this.f37201g.setOnKeyListener(new DialogInterface.OnKeyListener() {
            public boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                return i10 == 84;
            }
        });
        return this.f37201g;
    }

    /* access modifiers changed from: protected */
    public abstract Dialog d(Activity activity);

    /* access modifiers changed from: protected */
    public final void d() {
        if (com.amazon.a.a.o.c.f37534a) {
            com.amazon.a.a.o.c cVar = f37196b;
            cVar.a("Expiring prompt: " + this);
        }
        this.f37160a.a(d.FOREGROUND, new com.amazon.a.a.n.a() {
            public void a() {
                b.this.k();
            }

            public String toString() {
                return "DismissPromptTask: " + b.this.toString();
            }
        });
        a(l());
    }

    public int j() {
        return this.f37198d;
    }

    /* access modifiers changed from: protected */
    public final boolean k() {
        com.amazon.a.a.o.a.a.a();
        if (com.amazon.a.a.o.c.f37534a) {
            com.amazon.a.a.o.c cVar = f37196b;
            cVar.a("Dismissing Prompt: " + this.f37198d);
        }
        if (!this.f37202h.compareAndSet(false, true)) {
            if (com.amazon.a.a.o.c.f37534a) {
                f37196b.b("Prompt has already been dismissed");
            }
            return false;
        }
        if (this.f37199e != null) {
            m();
        }
        f();
        return true;
    }

    /* access modifiers changed from: protected */
    public d l() {
        if (!g()) {
            return null;
        }
        d dVar = this.f37200f;
        if (dVar == null) {
            return d.EXPIRATION_DURATION_ELAPSED;
        }
        return dVar;
    }

    private void b(d dVar) {
        if (com.amazon.a.a.o.c.f37534a) {
            com.amazon.a.a.o.c cVar = f37196b;
            cVar.a("Expiring prompt pre-maturely: id: " + j() + ", prompt: " + this + ",, reason: " + dVar);
        }
        this.f37200f = dVar;
        c();
    }

    public void a(Activity activity, boolean z10) {
        if (activity != this.f37199e) {
            if (com.amazon.a.a.o.c.f37534a) {
                f37196b.a("Unrecognized context");
            }
        } else if (z10 && !this.f37201g.isShowing()) {
            if (com.amazon.a.a.o.c.f37534a) {
                f37196b.a("showing dialog because it was not showing");
            }
            this.f37201g.show();
        }
    }
}
