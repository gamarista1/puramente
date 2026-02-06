package n9;

import android.media.MediaCodec;
import ja.C3645a;
import ja.M;

/* renamed from: n9.c  reason: case insensitive filesystem */
public final class C3867c {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f46925a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f46926b;

    /* renamed from: c  reason: collision with root package name */
    public int f46927c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f46928d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f46929e;

    /* renamed from: f  reason: collision with root package name */
    public int f46930f;

    /* renamed from: g  reason: collision with root package name */
    public int f46931g;

    /* renamed from: h  reason: collision with root package name */
    public int f46932h;

    /* renamed from: i  reason: collision with root package name */
    private final MediaCodec.CryptoInfo f46933i;

    /* renamed from: j  reason: collision with root package name */
    private final b f46934j;

    /* renamed from: n9.c$b */
    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final MediaCodec.CryptoInfo f46935a;

        /* renamed from: b  reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f46936b;

        /* access modifiers changed from: private */
        public void b(int i10, int i11) {
            this.f46936b.set(i10, i11);
            this.f46935a.setPattern(this.f46936b);
        }

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f46935a = cryptoInfo;
            this.f46936b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public C3867c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f46933i = cryptoInfo;
        this.f46934j = M.f44981a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f46933i;
    }

    public void b(int i10) {
        if (i10 != 0) {
            if (this.f46928d == null) {
                int[] iArr = new int[1];
                this.f46928d = iArr;
                this.f46933i.numBytesOfClearData = iArr;
            }
            int[] iArr2 = this.f46928d;
            iArr2[0] = iArr2[0] + i10;
        }
    }

    public void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f46930f = i10;
        this.f46928d = iArr;
        this.f46929e = iArr2;
        this.f46926b = bArr;
        this.f46925a = bArr2;
        this.f46927c = i11;
        this.f46931g = i12;
        this.f46932h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f46933i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (M.f44981a >= 24) {
            ((b) C3645a.e(this.f46934j)).b(i12, i13);
        }
    }
}
