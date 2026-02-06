package r2;

import android.media.MediaCodec;
import r2.j;

/* renamed from: r2.a  reason: case insensitive filesystem */
public final /* synthetic */ class C2561a implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C2562b f25596a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j.d f25597b;

    public /* synthetic */ C2561a(C2562b bVar, j.d dVar) {
        this.f25596a = bVar;
        this.f25597b = dVar;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        this.f25596a.x(this.f25597b, mediaCodec, j10, j11);
    }
}
