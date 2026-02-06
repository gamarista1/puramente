package C9;

import C9.l;
import android.media.MediaCodec;

public final /* synthetic */ class w implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f30264a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l.c f30265b;

    public /* synthetic */ w(x xVar, l.c cVar) {
        this.f30264a = xVar;
        this.f30265b = cVar;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        this.f30264a.p(this.f30265b, mediaCodec, j10, j11);
    }
}
