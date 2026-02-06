package com.google.android.gms.common.api.internal;

import android.app.Dialog;

final class r0 extends S {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Dialog f54066a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ s0 f54067b;

    r0(s0 s0Var, Dialog dialog) {
        this.f54067b = s0Var;
        this.f54066a = dialog;
    }

    public final void a() {
        this.f54067b.f54069b.d();
        if (this.f54066a.isShowing()) {
            this.f54066a.dismiss();
        }
    }
}
