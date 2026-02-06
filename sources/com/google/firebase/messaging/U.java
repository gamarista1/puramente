package com.google.firebase.messaging;

import android.content.Context;
import com.google.android.gms.tasks.OnSuccessListener;

public final /* synthetic */ class U implements OnSuccessListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f57437a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f57438b;

    public /* synthetic */ U(Context context, boolean z10) {
        this.f57437a = context;
        this.f57438b = z10;
    }

    public final void onSuccess(Object obj) {
        V.h(this.f57437a, this.f57438b);
    }
}
