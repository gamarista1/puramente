package com.google.firebase.messaging;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* renamed from: com.google.firebase.messaging.l  reason: case insensitive filesystem */
public final /* synthetic */ class C4831l implements Continuation {
    public final Object then(Task task) {
        return Integer.valueOf(RCHTTPStatusCodes.FORBIDDEN);
    }
}
