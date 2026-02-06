package C9;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import k9.C3717q0;
import n9.C3867c;

public interface l {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final n f30158a;

        /* renamed from: b  reason: collision with root package name */
        public final MediaFormat f30159b;

        /* renamed from: c  reason: collision with root package name */
        public final C3717q0 f30160c;

        /* renamed from: d  reason: collision with root package name */
        public final Surface f30161d;

        /* renamed from: e  reason: collision with root package name */
        public final MediaCrypto f30162e;

        /* renamed from: f  reason: collision with root package name */
        public final int f30163f;

        private a(n nVar, MediaFormat mediaFormat, C3717q0 q0Var, Surface surface, MediaCrypto mediaCrypto, int i10) {
            this.f30158a = nVar;
            this.f30159b = mediaFormat;
            this.f30160c = q0Var;
            this.f30161d = surface;
            this.f30162e = mediaCrypto;
            this.f30163f = i10;
        }

        public static a a(n nVar, MediaFormat mediaFormat, C3717q0 q0Var, MediaCrypto mediaCrypto) {
            return new a(nVar, mediaFormat, q0Var, (Surface) null, mediaCrypto, 0);
        }

        public static a b(n nVar, MediaFormat mediaFormat, C3717q0 q0Var, Surface surface, MediaCrypto mediaCrypto) {
            return new a(nVar, mediaFormat, q0Var, surface, mediaCrypto, 0);
        }
    }

    public interface b {
        l a(a aVar);
    }

    public interface c {
        void a(l lVar, long j10, long j11);
    }

    void a(int i10, int i11, int i12, long j10, int i13);

    void b(Bundle bundle);

    MediaFormat c();

    void d(int i10);

    ByteBuffer e(int i10);

    void f(Surface surface);

    void flush();

    boolean h();

    void i(int i10, long j10);

    int j();

    int k(MediaCodec.BufferInfo bufferInfo);

    void l(int i10, boolean z10);

    ByteBuffer m(int i10);

    void n(c cVar, Handler handler);

    void o(int i10, int i11, C3867c cVar, long j10, int i12);

    void release();
}
