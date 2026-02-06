package r2;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import f2.s;
import java.nio.ByteBuffer;

public interface j {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final m f25645a;

        /* renamed from: b  reason: collision with root package name */
        public final MediaFormat f25646b;

        /* renamed from: c  reason: collision with root package name */
        public final s f25647c;

        /* renamed from: d  reason: collision with root package name */
        public final Surface f25648d;

        /* renamed from: e  reason: collision with root package name */
        public final MediaCrypto f25649e;

        /* renamed from: f  reason: collision with root package name */
        public final int f25650f;

        private a(m mVar, MediaFormat mediaFormat, s sVar, Surface surface, MediaCrypto mediaCrypto, int i10) {
            this.f25645a = mVar;
            this.f25646b = mediaFormat;
            this.f25647c = sVar;
            this.f25648d = surface;
            this.f25649e = mediaCrypto;
            this.f25650f = i10;
        }

        public static a a(m mVar, MediaFormat mediaFormat, s sVar, MediaCrypto mediaCrypto) {
            return new a(mVar, mediaFormat, sVar, (Surface) null, mediaCrypto, 0);
        }

        public static a b(m mVar, MediaFormat mediaFormat, s sVar, Surface surface, MediaCrypto mediaCrypto) {
            return new a(mVar, mediaFormat, sVar, surface, mediaCrypto, 0);
        }
    }

    public interface b {
        j a(a aVar);
    }

    public interface c {
        void a();

        void b();
    }

    public interface d {
        void a(j jVar, long j10, long j11);
    }

    void a(int i10, int i11, int i12, long j10, int i13);

    void b(Bundle bundle);

    MediaFormat c();

    void d(int i10);

    ByteBuffer e(int i10);

    void f(Surface surface);

    void flush();

    void g(int i10, int i11, l2.c cVar, long j10, int i12);

    boolean h();

    void i(int i10, long j10);

    int j();

    int k(MediaCodec.BufferInfo bufferInfo);

    void l(int i10, boolean z10);

    ByteBuffer m(int i10);

    boolean n(c cVar) {
        return false;
    }

    void o(d dVar, Handler handler);

    void release();
}
