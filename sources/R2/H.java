package r2;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import i2.C2076a;
import i2.L;
import java.nio.ByteBuffer;
import l2.c;
import r2.j;

public final class H implements j {

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f25592a;

    /* renamed from: b  reason: collision with root package name */
    private ByteBuffer[] f25593b;

    /* renamed from: c  reason: collision with root package name */
    private ByteBuffer[] f25594c;

    public static class b implements j.b {
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public r2.j a(r2.j.a r6) {
            /*
                r5 = this;
                r0 = 0
                android.media.MediaCodec r1 = r5.b(r6)     // Catch:{ IOException -> 0x0030, RuntimeException -> 0x002e }
                java.lang.String r2 = "configureCodec"
                i2.H.a(r2)     // Catch:{ IOException -> 0x002c, RuntimeException -> 0x0029 }
                android.media.MediaFormat r2 = r6.f25646b     // Catch:{ IOException -> 0x002c, RuntimeException -> 0x0029 }
                android.view.Surface r3 = r6.f25648d     // Catch:{ IOException -> 0x002c, RuntimeException -> 0x0029 }
                android.media.MediaCrypto r4 = r6.f25649e     // Catch:{ IOException -> 0x002c, RuntimeException -> 0x0029 }
                int r6 = r6.f25650f     // Catch:{ IOException -> 0x002c, RuntimeException -> 0x0029 }
                r1.configure(r2, r3, r4, r6)     // Catch:{ IOException -> 0x002c, RuntimeException -> 0x0029 }
                i2.H.b()     // Catch:{ IOException -> 0x002c, RuntimeException -> 0x0029 }
                java.lang.String r6 = "startCodec"
                i2.H.a(r6)     // Catch:{ IOException -> 0x002c, RuntimeException -> 0x0029 }
                r1.start()     // Catch:{ IOException -> 0x002c, RuntimeException -> 0x0029 }
                i2.H.b()     // Catch:{ IOException -> 0x002c, RuntimeException -> 0x0029 }
                r2.H r6 = new r2.H     // Catch:{ IOException -> 0x002c, RuntimeException -> 0x0029 }
                r6.<init>(r1)     // Catch:{ IOException -> 0x002c, RuntimeException -> 0x0029 }
                return r6
            L_0x0029:
                r6 = move-exception
            L_0x002a:
                r0 = r1
                goto L_0x0031
            L_0x002c:
                r6 = move-exception
                goto L_0x002a
            L_0x002e:
                r6 = move-exception
                goto L_0x0031
            L_0x0030:
                r6 = move-exception
            L_0x0031:
                if (r0 == 0) goto L_0x0036
                r0.release()
            L_0x0036:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: r2.H.b.a(r2.j$a):r2.j");
        }

        /* access modifiers changed from: protected */
        public MediaCodec b(j.a aVar) {
            C2076a.e(aVar.f25645a);
            String str = aVar.f25645a.f25654a;
            i2.H.a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            i2.H.b();
            return createByCodecName;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void q(j.d dVar, MediaCodec mediaCodec, long j10, long j11) {
        dVar.a(this, j10, j11);
    }

    public void a(int i10, int i11, int i12, long j10, int i13) {
        this.f25592a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    public void b(Bundle bundle) {
        this.f25592a.setParameters(bundle);
    }

    public MediaFormat c() {
        return this.f25592a.getOutputFormat();
    }

    public void d(int i10) {
        this.f25592a.setVideoScalingMode(i10);
    }

    public ByteBuffer e(int i10) {
        if (L.f22072a >= 21) {
            return this.f25592a.getInputBuffer(i10);
        }
        return ((ByteBuffer[]) L.h(this.f25593b))[i10];
    }

    public void f(Surface surface) {
        this.f25592a.setOutputSurface(surface);
    }

    public void flush() {
        this.f25592a.flush();
    }

    public void g(int i10, int i11, c cVar, long j10, int i12) {
        this.f25592a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    public boolean h() {
        return false;
    }

    public void i(int i10, long j10) {
        this.f25592a.releaseOutputBuffer(i10, j10);
    }

    public int j() {
        return this.f25592a.dequeueInputBuffer(0);
    }

    public int k(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f25592a.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -3 && L.f22072a < 21) {
                this.f25594c = this.f25592a.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    public void l(int i10, boolean z10) {
        this.f25592a.releaseOutputBuffer(i10, z10);
    }

    public ByteBuffer m(int i10) {
        if (L.f22072a >= 21) {
            return this.f25592a.getOutputBuffer(i10);
        }
        return ((ByteBuffer[]) L.h(this.f25594c))[i10];
    }

    public void o(j.d dVar, Handler handler) {
        this.f25592a.setOnFrameRenderedListener(new C2560G(this, dVar), handler);
    }

    public void release() {
        this.f25593b = null;
        this.f25594c = null;
        try {
            int i10 = L.f22072a;
            if (i10 >= 30 && i10 < 33) {
                this.f25592a.stop();
            }
        } finally {
            this.f25592a.release();
        }
    }

    private H(MediaCodec mediaCodec) {
        this.f25592a = mediaCodec;
        if (L.f22072a < 21) {
            this.f25593b = mediaCodec.getInputBuffers();
            this.f25594c = mediaCodec.getOutputBuffers();
        }
    }
}
