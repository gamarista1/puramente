package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C4743f;

final class aj {

    /* renamed from: a  reason: collision with root package name */
    private static s f56478a;

    static synchronized s a(Context context) {
        s sVar;
        synchronized (aj.class) {
            try {
                if (f56478a == null) {
                    q qVar = new q((p) null);
                    qVar.a(C4743f.a(context));
                    f56478a = qVar.b();
                }
                sVar = f56478a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return sVar;
    }
}
