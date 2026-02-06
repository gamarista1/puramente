package com.google.android.gms.measurement;

import Pa.k;
import W1.a;
import android.content.Context;
import android.content.Intent;

public final class AppMeasurementReceiver extends a implements k.a {

    /* renamed from: c  reason: collision with root package name */
    private k f54420c;

    public final void a(Context context, Intent intent) {
        a.c(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f54420c == null) {
            this.f54420c = new k(this);
        }
        this.f54420c.a(context, intent);
    }
}
