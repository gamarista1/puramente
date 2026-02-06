package com.google.android.gms.internal.p002firebaseauthapi;

import Db.C4272u;
import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.C4498j;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.internal.C4536s;
import com.google.firebase.auth.A;
import com.google.firebase.auth.C4789h;
import com.google.firebase.auth.Q;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import ub.C5230g;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacz  reason: invalid package */
abstract class zzacz<ResultT, CallbackT> implements zzadl<ResultT> {
    protected final int zza;
    private ResultT zzaa;
    private Status zzab;
    protected final zzadb zzb = new zzadb(this);
    protected C5230g zzc;
    protected A zzd;
    protected CallbackT zze;
    protected C4272u zzf;
    protected zzacx<ResultT> zzg;
    protected final List<Q.b> zzh = new ArrayList();
    protected Executor zzi;
    protected zzafm zzj;
    protected zzaff zzk;
    protected zzaem zzl;
    protected zzafz zzm;
    protected String zzn;
    protected String zzo;
    protected C4789h zzp;
    protected String zzq;
    protected String zzr;
    protected zzym zzs;
    protected zzafn zzt;
    protected zzafi zzu;
    protected zzagi zzv;
    protected zzaga zzw;
    boolean zzx;
    private boolean zzy = true;
    /* access modifiers changed from: private */
    public boolean zzz;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacz$zza */
    private static class zza extends LifecycleCallback {
        private final List<Q.b> zza;

        private zza(C4498j jVar, List<Q.b> list) {
            super(jVar);
            this.mLifecycleFragment.a("PhoneAuthActivityStopCallback", this);
            this.zza = list;
        }

        public static void zza(Activity activity, List<Q.b> list) {
            C4498j fragment = LifecycleCallback.getFragment(activity);
            if (((zza) fragment.d("PhoneAuthActivityStopCallback", zza.class)) == null) {
                new zza(fragment, list);
            }
        }

        public void onStop() {
            synchronized (this.zza) {
                this.zza.clear();
            }
        }
    }

    public zzacz(int i10) {
        this.zza = i10;
    }

    public abstract void zzb();

    public final void zzb(ResultT resultt) {
        this.zzz = true;
        this.zzx = true;
        this.zzaa = resultt;
        this.zzg.zza(resultt, (Status) null);
    }

    public final zzacz<ResultT, CallbackT> zza(CallbackT callbackt) {
        this.zze = C4536s.m(callbackt, "external callback cannot be null");
        return this;
    }

    public final zzacz<ResultT, CallbackT> zza(C4272u uVar) {
        this.zzf = (C4272u) C4536s.m(uVar, "external failure callback cannot be null");
        return this;
    }

    public final zzacz<ResultT, CallbackT> zza(C5230g gVar) {
        this.zzc = (C5230g) C4536s.m(gVar, "firebaseApp cannot be null");
        return this;
    }

    public final zzacz<ResultT, CallbackT> zza(A a10) {
        this.zzd = (A) C4536s.m(a10, "firebaseUser cannot be null");
        return this;
    }

    public final zzacz<ResultT, CallbackT> zza(Q.b bVar, Activity activity, Executor executor, String str) {
        Q.b zza2 = zzads.zza(str, bVar, this);
        synchronized (this.zzh) {
            this.zzh.add((Q.b) C4536s.l(zza2));
        }
        if (activity != null) {
            zza.zza(activity, this.zzh);
        }
        this.zzi = (Executor) C4536s.l(executor);
        return this;
    }

    static /* synthetic */ void zza(zzacz zzacz) {
        zzacz.zzb();
        C4536s.p(zzacz.zzz, "no success or failure set on method implementation");
    }

    static /* synthetic */ void zza(zzacz zzacz, Status status) {
        C4272u uVar = zzacz.zzf;
        if (uVar != null) {
            uVar.zza(status);
        }
    }

    public final void zza(Status status) {
        this.zzz = true;
        this.zzx = false;
        this.zzab = status;
        this.zzg.zza(null, status);
    }
}
