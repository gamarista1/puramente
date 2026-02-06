package io.intercom.android.sdk.blocks;

import io.intercom.android.sdk.blocks.Video;
import io.intercom.android.sdk.blocks.views.VideoPreviewView;

public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Video.AnonymousClass2 f68530a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ VideoPreviewView f68531b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f68532c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ String f68533d;

    public /* synthetic */ b(Video.AnonymousClass2 r12, VideoPreviewView videoPreviewView, String str, String str2) {
        this.f68530a = r12;
        this.f68531b = videoPreviewView;
        this.f68532c = str;
        this.f68533d = str2;
    }

    public final void run() {
        this.f68530a.lambda$onResponse$0(this.f68531b, this.f68532c, this.f68533d);
    }
}
