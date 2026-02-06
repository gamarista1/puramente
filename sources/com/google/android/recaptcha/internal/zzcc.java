package com.google.android.recaptcha.internal;

import Ug.K;
import android.webkit.ValueCallback;
import com.amazon.a.a.o.b.f;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.l;
import lf.C6514M;
import lf.w;
import mf.C6565s;
import qf.C6658d;
import rf.C6680b;
import yf.C6798l;
import yf.p;

final class zzcc extends l implements p {
    final /* synthetic */ String[] zza;
    final /* synthetic */ zzcd zzb;
    final /* synthetic */ String zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcc(String[] strArr, zzcd zzcd, String str, C6658d dVar) {
        super(2, dVar);
        this.zza = strArr;
        this.zzb = zzcd;
        this.zzc = str;
    }

    public final C6658d create(Object obj, C6658d dVar) {
        return new zzcc(this.zza, this.zzb, this.zzc, dVar);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcc) create((K) obj, (C6658d) obj2)).invokeSuspend(C6514M.f71813a);
    }

    public final Object invokeSuspend(Object obj) {
        C6680b.f();
        w.b(obj);
        ArrayList arrayList = new ArrayList(r1);
        for (String str : this.zza) {
            arrayList.add("\"" + str + "\"");
        }
        zzcd zzcd = this.zzb;
        String str2 = this.zzc;
        zzcd.zza.evaluateJavascript(str2 + "(" + C6565s.x0(arrayList, f.f37529a, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null) + ")", (ValueCallback) null);
        return C6514M.f71813a;
    }
}
