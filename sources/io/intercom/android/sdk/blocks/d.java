package io.intercom.android.sdk.blocks;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;

public final /* synthetic */ class d implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ImageView f68538a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ WebView f68539b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f68540c;

    public /* synthetic */ d(ImageView imageView, WebView webView, String str) {
        this.f68538a = imageView;
        this.f68539b = webView;
        this.f68540c = str;
    }

    public final void onClick(View view) {
        VideoFile.lambda$addVideoFile$0(this.f68538a, this.f68539b, this.f68540c, view);
    }
}
