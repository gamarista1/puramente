package io.intercom.android.sdk.blocks;

import io.intercom.android.sdk.blocks.Video;
import io.intercom.android.sdk.blocks.views.VideoPreviewView;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Video.AnonymousClass3 f68534a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ VideoPreviewView f68535b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f68536c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f68537d;

    public /* synthetic */ c(Video.AnonymousClass3 r12, VideoPreviewView videoPreviewView, String str, String str2) {
        this.f68534a = r12;
        this.f68535b = videoPreviewView;
        this.f68536c = str;
        this.f68537d = str2;
    }

    public final void run() {
        this.f68534a.lambda$onResponse$0(this.f68535b, this.f68536c, this.f68537d);
    }
}
