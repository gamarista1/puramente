package C9;

import C9.l;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import ja.C3645a;
import ja.J;
import ja.M;
import java.nio.ByteBuffer;
import n9.C3867c;

public final class x implements l {

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f30266a;

    /* renamed from: b  reason: collision with root package name */
    private ByteBuffer[] f30267b;

    /* renamed from: c  reason: collision with root package name */
    private ByteBuffer[] f30268c;

    public static class b implements l.b {
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C9.l a(C9.l.a r6) {
            /*
                r5 = this;
                r0 = 0
                android.media.MediaCodec r1 = r5.b(r6)     // Catch:{ IOException -> 0x0030, RuntimeException -> 0x002e }
                java.lang.String r2 = "configureCodec"
                ja.J.a(r2)     // Catch:{ IOException -> 0x002c, RuntimeException -> 0x0029 }
                android.media.MediaFormat r2 = r6.f30159b     // Catch:{ IOException -> 0x002c, RuntimeException -> 0x0029 }
                android.view.Surface r3 = r6.f30161d     // Catch:{ IOException -> 0x002c, RuntimeException -> 0x0029 }
                android.media.MediaCrypto r4 = r6.f30162e     // Catch:{ IOException -> 0x002c, RuntimeException -> 0x0029 }
                int r6 = r6.f30163f     // Catch:{ IOException -> 0x002c, RuntimeException -> 0x0029 }
                r1.configure(r2, r3, r4, r6)     // Catch:{ IOException -> 0x002c, RuntimeException -> 0x0029 }
                ja.J.c()     // Catch:{ IOException -> 0x002c, RuntimeException -> 0x0029 }
                java.lang.String r6 = "startCodec"
                ja.J.a(r6)     // Catch:{ IOException -> 0x002c, RuntimeException -> 0x0029 }
                r1.start()     // Catch:{ IOException -> 0x002c, RuntimeException -> 0x0029 }
                ja.J.c()     // Catch:{ IOException -> 0x002c, RuntimeException -> 0x0029 }
                C9.x r6 = new C9.x     // Catch:{ IOException -> 0x002c, RuntimeException -> 0x0029 }
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
            throw new UnsupportedOperationException("Method not decompiled: C9.x.b.a(C9.l$a):C9.l");
        }

        /* access modifiers changed from: protected */
        public MediaCodec b(l.a aVar) {
            C3645a.e(aVar.f30158a);
            String str = aVar.f30158a.f30166a;
            J.a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            J.c();
            return createByCodecName;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void p(l.c cVar, MediaCodec mediaCodec, long j10, long j11) {
        cVar.a(this, j10, j11);
    }

    public void a(int i10, int i11, int i12, long j10, int i13) {
        this.f30266a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    public void b(Bundle bundle) {
        this.f30266a.setParameters(bundle);
    }

    public MediaFormat c() {
        return this.f30266a.getOutputFormat();
    }

    public void d(int i10) {
        this.f30266a.setVideoScalingMode(i10);
    }

    public ByteBuffer e(int i10) {
        if (M.f44981a >= 21) {
            return this.f30266a.getInputBuffer(i10);
        }
        return ((ByteBuffer[]) M.j(this.f30267b))[i10];
    }

    public void f(Surface surface) {
        this.f30266a.setOutputSurface(surface);
    }

    public void flush() {
        this.f30266a.flush();
    }

    public boolean h() {
        return false;
    }

    public void i(int i10, long j10) {
        this.f30266a.releaseOutputBuffer(i10, j10);
    }

    public int j() {
        return this.f30266a.dequeueInputBuffer(0);
    }

    public int k(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f30266a.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer == -3 && M.f44981a < 21) {
                this.f30268c = this.f30266a.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    public void l(int i10, boolean z10) {
        this.f30266a.releaseOutputBuffer(i10, z10);
    }

    public ByteBuffer m(int i10) {
        if (M.f44981a >= 21) {
            return this.f30266a.getOutputBuffer(i10);
        }
        return ((ByteBuffer[]) M.j(this.f30268c))[i10];
    }

    public void n(l.c cVar, Handler handler) {
        this.f30266a.setOnFrameRenderedListener(new w(this, cVar), handler);
    }

    public void o(int i10, int i11, C3867c cVar, long j10, int i12) {
        this.f30266a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    public void release() {
        this.f30267b = null;
        this.f30268c = null;
        this.f30266a.release();
    }

    private x(MediaCodec mediaCodec) {
        this.f30266a = mediaCodec;
        if (M.f44981a < 21) {
            this.f30267b = mediaCodec.getInputBuffers();
            this.f30268c = mediaCodec.getOutputBuffers();
        }
    }
}
