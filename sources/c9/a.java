package C9;

import C9.l;
import android.media.MediaCodec;

public final /* synthetic */ class a implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f30103a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l.c f30104b;

    public /* synthetic */ a(b bVar, l.c cVar) {
        this.f30103a = bVar;
        this.f30104b = cVar;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        this.f30103a.w(this.f30104b, mediaCodec, j10, j11);
    }
}
