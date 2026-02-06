package com.facebook.imagepipeline.nativecode;

import O6.b;
import T5.d;
import k7.c;

@d
public class NativeJpegTranscoderFactory implements k7.d {

    /* renamed from: a  reason: collision with root package name */
    private final int f39769a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f39770b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f39771c;

    @d
    public NativeJpegTranscoderFactory(int i10, boolean z10, boolean z11) {
        this.f39769a = i10;
        this.f39770b = z10;
        this.f39771c = z11;
    }

    @d
    public c createImageTranscoder(O6.c cVar, boolean z10) {
        if (cVar != b.f33373b) {
            return null;
        }
        return new NativeJpegTranscoder(z10, this.f39769a, this.f39770b, this.f39771c);
    }
}
