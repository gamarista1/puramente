package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.a;
import com.google.android.gms.internal.base.zau;
import java.util.concurrent.atomic.AtomicReference;
import w.C2780Y;

public abstract class t0 extends LifecycleCallback implements DialogInterface.OnCancelListener {

    /* renamed from: a  reason: collision with root package name */
    protected volatile boolean f54071a;

    /* renamed from: b  reason: collision with root package name */
    protected final AtomicReference f54072b = new AtomicReference((Object) null);

    /* renamed from: c  reason: collision with root package name */
    private final Handler f54073c = new zau(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    protected final a f54074d;

    t0(C4498j jVar, a aVar) {
        super(jVar);
        this.f54074d = aVar;
    }

    /* access modifiers changed from: private */
    public final void a(ConnectionResult connectionResult, int i10) {
        this.f54072b.set((Object) null);
        b(connectionResult, i10);
    }

    /* access modifiers changed from: private */
    public final void d() {
        this.f54072b.set((Object) null);
        c();
    }

    private static final int e(q0 q0Var) {
        if (q0Var == null) {
            return -1;
        }
        return q0Var.a();
    }

    /* access modifiers changed from: protected */
    public abstract void b(ConnectionResult connectionResult, int i10);

    /* access modifiers changed from: protected */
    public abstract void c();

    public final void h(ConnectionResult connectionResult, int i10) {
        AtomicReference atomicReference;
        q0 q0Var = new q0(connectionResult, i10);
        do {
            atomicReference = this.f54072b;
            if (C2780Y.a(atomicReference, (Object) null, q0Var)) {
                this.f54073c.post(new s0(this, q0Var));
                return;
            }
        } while (atomicReference.get() == null);
    }

    public final void onActivityResult(int i10, int i11, Intent intent) {
        q0 q0Var = (q0) this.f54072b.get();
        if (i10 != 1) {
            if (i10 == 2) {
                int g10 = this.f54074d.g(getActivity());
                if (g10 == 0) {
                    d();
                    return;
                } else if (q0Var == null) {
                    return;
                } else {
                    if (q0Var.b().o0() == 18 && g10 == 18) {
                        return;
                    }
                }
            }
        } else if (i11 == -1) {
            d();
            return;
        } else if (i11 == 0) {
            if (q0Var != null) {
                int i12 = 13;
                if (intent != null) {
                    i12 = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                }
                a(new ConnectionResult(i12, (PendingIntent) null, q0Var.b().toString()), e(q0Var));
                return;
            }
            return;
        }
        if (q0Var != null) {
            a(q0Var.b(), q0Var.a());
        }
    }

    public final void onCancel(DialogInterface dialogInterface) {
        a(new ConnectionResult(13, (PendingIntent) null), e((q0) this.f54072b.get()));
    }

    public final void onCreate(Bundle bundle) {
        q0 q0Var;
        super.onCreate(bundle);
        if (bundle != null) {
            AtomicReference atomicReference = this.f54072b;
            if (bundle.getBoolean("resolving_error", false)) {
                q0Var = new q0(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1));
            } else {
                q0Var = null;
            }
            atomicReference.set(q0Var);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        q0 q0Var = (q0) this.f54072b.get();
        if (q0Var != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", q0Var.a());
            bundle.putInt("failed_status", q0Var.b().o0());
            bundle.putParcelable("failed_resolution", q0Var.b().q0());
        }
    }

    public void onStart() {
        super.onStart();
        this.f54071a = true;
    }

    public void onStop() {
        super.onStop();
        this.f54071a = false;
    }
}
