package com.google.android.recaptcha.internal;

import Ug.K;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import qf.C6658d;
import rf.C6680b;
import yf.p;

final class zzes extends l implements p {
    final /* synthetic */ zzez zza;
    final /* synthetic */ String zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzes(zzez zzez, String str, C6658d dVar) {
        super(2, dVar);
        this.zza = zzez;
        this.zzb = str;
    }

    public final C6658d create(Object obj, C6658d dVar) {
        return new zzes(this.zza, this.zzb, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzes) create((K) obj, (C6658d) obj2)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        C6680b.f();
        w.b(obj);
        WebView zzc = this.zza.zzc();
        zzc.evaluateJavascript("recaptcha.m.Main.execute(\"" + this.zzb + "\")", (ValueCallback) null);
        return C6514M.f71813a;
    }
}
