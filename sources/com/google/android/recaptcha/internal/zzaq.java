package com.google.android.recaptcha.internal;

import Ug.K;
import com.google.android.recaptcha.RecaptchaAction;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.v;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

final class zzaq extends l implements p {
    int zza;
    final /* synthetic */ zzaw zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ long zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzaq(zzaw zzaw, RecaptchaAction recaptchaAction, long j10, C6658d dVar) {
        super(2, dVar);
        this.zzb = zzaw;
        this.zzc = recaptchaAction;
        this.zzd = j10;
    }

    public final C6658d create(Object obj, C6658d dVar) {
        return new zzaq(this.zzb, this.zzc, this.zzd, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaq) create((K) obj, (C6658d) obj2)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object f10 = C6680b.f();
        int i10 = this.zza;
        w.b(obj);
        if (i10 != 0) {
            obj2 = ((v) obj).j();
        } else {
            zzaw zzaw = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j10 = this.zzd;
            this.zza = 1;
            obj2 = zzaw.zzk(recaptchaAction, j10, this);
            if (obj2 == f10) {
                return f10;
            }
        }
        return v.a(obj2);
    }
}
