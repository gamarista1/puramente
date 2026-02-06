package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.play.integrity.internal.C4743f;

final class v {

    /* renamed from: a  reason: collision with root package name */
    private static o f56547a;

    static synchronized o a(Context context) {
        o oVar;
        synchronized (v.class) {
            try {
                if (f56547a == null) {
                    m mVar = new m((l) null);
                    mVar.a(C4743f.a(context));
                    f56547a = mVar.b();
                }
                oVar = f56547a;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return oVar;
    }
}
