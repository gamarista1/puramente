package com.google.android.gms.common;

import android.content.Context;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zau;

final class e extends zau {

    /* renamed from: a  reason: collision with root package name */
    private final Context f54108a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f54109b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public e(com.google.android.gms.common.a r1, android.content.Context r2) {
        /*
            r0 = this;
            r0.f54109b = r1
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto L_0x000d
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            goto L_0x0011
        L_0x000d:
            android.os.Looper r1 = android.os.Looper.myLooper()
        L_0x0011:
            r0.<init>(r1)
            android.content.Context r1 = r2.getApplicationContext()
            r0.f54108a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.e.<init>(com.google.android.gms.common.a, android.content.Context):void");
    }

    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        a aVar = this.f54109b;
        int g10 = aVar.g(this.f54108a);
        if (aVar.j(g10)) {
            this.f54109b.r(this.f54108a, g10);
        }
    }
}
