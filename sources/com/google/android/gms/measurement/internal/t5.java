package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

final class t5 implements D5 {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ q5 f55355a;

    t5(q5 q5Var) {
        this.f55355a = q5Var;
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.f55355a.zzl().y(new w5(this, str, str2, bundle));
        } else if (this.f55355a.f55305l != null) {
            this.f55355a.f55305l.zzj().B().b("AppId not known when logging event", str2);
        }
    }
}
