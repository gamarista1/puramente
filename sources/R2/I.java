package r2;

import android.media.MediaCodec;
import android.os.Bundle;
import l2.c;

class I implements k {

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f25595a;

    public I(MediaCodec mediaCodec) {
        this.f25595a = mediaCodec;
    }

    public void a(int i10, int i11, int i12, long j10, int i13) {
        this.f25595a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    public void b(Bundle bundle) {
        this.f25595a.setParameters(bundle);
    }

    public void g(int i10, int i11, c cVar, long j10, int i12) {
        this.f25595a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    public void c() {
    }

    public void flush() {
    }

    public void shutdown() {
    }

    public void start() {
    }
}
