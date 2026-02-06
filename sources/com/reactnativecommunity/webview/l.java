package com.reactnativecommunity.webview;

import android.webkit.DownloadListener;

public final /* synthetic */ class l implements DownloadListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f59360a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f59361b;

    public /* synthetic */ l(f fVar, m mVar) {
        this.f59360a = fVar;
        this.f59361b = mVar;
    }

    public final void onDownloadStart(String str, String str2, String str3, String str4, long j10) {
        m.f(this.f59360a, this.f59361b, str, str2, str3, str4, j10);
    }
}
