package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.base.zau;

final class i0 extends zau {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k0 f54043a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i0(k0 k0Var, Looper looper) {
        super(looper);
        this.f54043a = k0Var;
    }

    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            h hVar = (h) message.obj;
            synchronized (this.f54043a.f54052c) {
                try {
                    k0 k0Var = (k0) C4536s.l(this.f54043a.f54050a);
                    if (hVar == null) {
                        k0Var.g(new Status(13, "Transform returned null"));
                    } else {
                        k0Var.f(hVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else if (i10 != 1) {
            Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + i10);
        } else {
            RuntimeException runtimeException = (RuntimeException) message.obj;
            Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
            throw runtimeException;
        }
    }
}
