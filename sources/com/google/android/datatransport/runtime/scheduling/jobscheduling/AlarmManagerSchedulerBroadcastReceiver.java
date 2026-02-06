package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import Y8.o;
import Y8.t;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import f9.C3520a;
import j9.C3644a;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    /* access modifiers changed from: private */
    public static /* synthetic */ void b() {
    }

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        t.f(context);
        o.a d10 = o.a().b(queryParameter).d(C3644a.b(intValue));
        if (queryParameter2 != null) {
            d10.c(Base64.decode(queryParameter2, 0));
        }
        t.c().e().v(d10.a(), i10, new C3520a());
    }
}
