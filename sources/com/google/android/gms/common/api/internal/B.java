package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class B {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Map f53946a = Collections.synchronizedMap(new WeakHashMap());
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Map f53947b = Collections.synchronizedMap(new WeakHashMap());

    private final void h(boolean z10, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.f53946a) {
            hashMap = new HashMap(this.f53946a);
        }
        synchronized (this.f53947b) {
            hashMap2 = new HashMap(this.f53947b);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            if (z10 || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).forceFailureUnlessReady(status);
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            if (z10 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((TaskCompletionSource) entry2.getKey()).trySetException(new b(status));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(BasePendingResult basePendingResult, boolean z10) {
        this.f53946a.put(basePendingResult, Boolean.valueOf(z10));
        basePendingResult.addStatusListener(new C4513z(this, basePendingResult));
    }

    /* access modifiers changed from: package-private */
    public final void d(TaskCompletionSource taskCompletionSource, boolean z10) {
        this.f53947b.put(taskCompletionSource, Boolean.valueOf(z10));
        taskCompletionSource.getTask().addOnCompleteListener(new A(this, taskCompletionSource));
    }

    /* access modifiers changed from: package-private */
    public final void e(int i10, String str) {
        StringBuilder sb2 = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb2.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb2.append(" due to dead object exception.");
        }
        if (str != null) {
            sb2.append(" Last reason for disconnect: ");
            sb2.append(str);
        }
        h(true, new Status(20, sb2.toString()));
    }

    public final void f() {
        h(false, C4495g.f54022p);
    }

    /* access modifiers changed from: package-private */
    public final boolean g() {
        if (!this.f53946a.isEmpty() || !this.f53947b.isEmpty()) {
            return true;
        }
        return false;
    }
}
