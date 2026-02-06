package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.C4833n;
import com.google.firebase.messaging.L;
import java.util.concurrent.ExecutionException;
import xa.C5268a;
import xa.C5269b;

public final class FirebaseInstanceIdReceiver extends C5269b {
    private static Intent f(Context context, String str, Bundle bundle) {
        return new Intent(str).putExtras(bundle);
    }

    /* access modifiers changed from: protected */
    public int b(Context context, C5268a aVar) {
        try {
            return ((Integer) Tasks.await(new C4833n(context).k(aVar.o0()))).intValue();
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e10);
            return 500;
        }
    }

    /* access modifiers changed from: protected */
    public void c(Context context, Bundle bundle) {
        Intent f10 = f(context, "com.google.firebase.messaging.NOTIFICATION_DISMISS", bundle);
        if (L.E(f10)) {
            L.v(f10);
        }
    }
}
