package r2;

import android.media.MediaCodec;
import r2.j;

/* renamed from: r2.G  reason: case insensitive filesystem */
public final /* synthetic */ class C2560G implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ H f25590a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j.d f25591b;

    public /* synthetic */ C2560G(H h10, j.d dVar) {
        this.f25590a = h10;
        this.f25591b = dVar;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        this.f25590a.q(this.f25591b, mediaCodec, j10, j11);
    }
}
