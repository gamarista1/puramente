package com.google.android.recaptcha.internal;

import Ug.C5600w0;
import Ug.K;
import Ug.M;
import android.webkit.WebView;
import java.util.Arrays;
import qf.C6658d;
import qf.g;

public final class zzcd {
    /* access modifiers changed from: private */
    public final WebView zza;
    private final K zzb;

    public zzcd(WebView webView, K k10) {
        this.zza = webView;
        this.zzb = k10;
    }

    public final void zzb(String str, String... strArr) {
        C5600w0 unused = C5576k.d(this.zzb, (g) null, (M) null, new zzcc((String[]) Arrays.copyOf(strArr, strArr.length), this, str, (C6658d) null), 3, (Object) null);
    }
}
