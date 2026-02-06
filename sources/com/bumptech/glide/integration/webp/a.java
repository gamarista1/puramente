package com.bumptech.glide.integration.webp;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f39067a;

    /* renamed from: b  reason: collision with root package name */
    public final int f39068b;

    /* renamed from: c  reason: collision with root package name */
    public final int f39069c;

    /* renamed from: d  reason: collision with root package name */
    public final int f39070d;

    /* renamed from: e  reason: collision with root package name */
    public final int f39071e;

    /* renamed from: f  reason: collision with root package name */
    public final int f39072f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f39073g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f39074h;

    a(int i10, WebpFrame webpFrame) {
        this.f39067a = i10;
        this.f39068b = webpFrame.getXOffest();
        this.f39069c = webpFrame.getYOffest();
        this.f39070d = webpFrame.getWidth();
        this.f39071e = webpFrame.getHeight();
        this.f39072f = webpFrame.getDurationMs();
        this.f39073g = webpFrame.isBlendWithPreviousFrame();
        this.f39074h = webpFrame.shouldDisposeToBackgroundColor();
    }

    public String toString() {
        return "frameNumber=" + this.f39067a + ", xOffset=" + this.f39068b + ", yOffset=" + this.f39069c + ", width=" + this.f39070d + ", height=" + this.f39071e + ", duration=" + this.f39072f + ", blendPreviousFrame=" + this.f39073g + ", disposeBackgroundColor=" + this.f39074h;
    }
}
