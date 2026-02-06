package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.api.internal.C4498j;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

final class zzv extends LifecycleCallback {
    private final List zza = new ArrayList();

    private zzv(C4498j jVar) {
        super(jVar);
        this.mLifecycleFragment.a("TaskOnStopCallback", this);
    }

    public static zzv zza(Activity activity) {
        zzv zzv;
        C4498j fragment = LifecycleCallback.getFragment(activity);
        synchronized (fragment) {
            try {
                zzv = (zzv) fragment.d("TaskOnStopCallback", zzv.class);
                if (zzv == null) {
                    zzv = new zzv(fragment);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzv;
    }

    public final void onStop() {
        synchronized (this.zza) {
            try {
                for (WeakReference weakReference : this.zza) {
                    zzq zzq = (zzq) weakReference.get();
                    if (zzq != null) {
                        zzq.zzc();
                    }
                }
                this.zza.clear();
            } finally {
            }
        }
    }

    public final void zzb(zzq zzq) {
        synchronized (this.zza) {
            this.zza.add(new WeakReference(zzq));
        }
    }
}
