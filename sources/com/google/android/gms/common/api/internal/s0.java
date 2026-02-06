package com.google.android.gms.common.api.internal;

import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.C4536s;

final class s0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final q0 f54068a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ t0 f54069b;

    s0(t0 t0Var, q0 q0Var) {
        this.f54069b = t0Var;
        this.f54068a = q0Var;
    }

    public final void run() {
        if (this.f54069b.f54071a) {
            ConnectionResult b10 = this.f54068a.b();
            if (b10.r0()) {
                t0 t0Var = this.f54069b;
                t0Var.mLifecycleFragment.startActivityForResult(GoogleApiActivity.a(t0Var.getActivity(), (PendingIntent) C4536s.l(b10.q0()), this.f54068a.a(), false), 1);
                return;
            }
            t0 t0Var2 = this.f54069b;
            if (t0Var2.f54074d.b(t0Var2.getActivity(), b10.o0(), (String) null) != null) {
                t0 t0Var3 = this.f54069b;
                t0Var3.f54074d.y(t0Var3.getActivity(), t0Var3.mLifecycleFragment, b10.o0(), 2, this.f54069b);
            } else if (b10.o0() == 18) {
                t0 t0Var4 = this.f54069b;
                Dialog t10 = t0Var4.f54074d.t(t0Var4.getActivity(), t0Var4);
                t0 t0Var5 = this.f54069b;
                t0Var5.f54074d.u(t0Var5.getActivity().getApplicationContext(), new r0(this, t10));
            } else {
                this.f54069b.a(b10, this.f54068a.a());
            }
        }
    }
}
