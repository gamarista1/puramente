package com.google.android.recaptcha.internal;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adjust.sdk.Constants;
import java.io.ByteArrayInputStream;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C6496s;
import lf.C6521e;

public final class zzeu extends WebViewClient {
    final /* synthetic */ zzez zza;

    zzeu(zzez zzez) {
        this.zza = zzez;
    }

    public final void onLoadResource(WebView webView, String str) {
        System.currentTimeMillis();
    }

    public final void onPageFinished(WebView webView, String str) {
        zzez zzez = this.zza;
        zzez.zzi.zza(zzez.zzp.zza(zzne.INIT_NETWORK));
        long zza2 = this.zza.zzn.zza(TimeUnit.MICROSECONDS);
        zzv zzv = zzv.zza;
        zzv.zza(zzx.zzl.zza(), zza2);
    }

    @C6521e
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        zzn zzn = zzn.zze;
        zzl zzl = (zzl) this.zza.zzk.get(Integer.valueOf(i10));
        if (zzl == null) {
            zzl = zzl.zzY;
        }
        zzp zzp = new zzp(zzn, zzl, (String) null);
        this.zza.zzk().hashCode();
        zzp.getMessage();
        this.zza.zzk().f(zzp);
    }

    @C6521e
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Uri parse = Uri.parse(str);
        zzfb zzfb = zzfb.zza;
        C6496s.e(parse);
        if (!zzfb.zzb(parse) || zzfb.zza(parse)) {
            return super.shouldInterceptRequest(webView, str);
        }
        zzp zzp = new zzp(zzn.zzc, zzl.zzac, (String) null);
        this.zza.zzk().hashCode();
        parse.toString();
        this.zza.zzk().f(zzp);
        return new WebResourceResponse("text/plain", Constants.ENCODING, new ByteArrayInputStream(new byte[0]));
    }
}
