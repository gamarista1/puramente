package l2;

import android.media.MediaCodec;
import i2.C2076a;
import i2.L;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f23506a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f23507b;

    /* renamed from: c  reason: collision with root package name */
    public int f23508c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f23509d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f23510e;

    /* renamed from: f  reason: collision with root package name */
    public int f23511f;

    /* renamed from: g  reason: collision with root package name */
    public int f23512g;

    /* renamed from: h  reason: collision with root package name */
    public int f23513h;

    /* renamed from: i  reason: collision with root package name */
    private final MediaCodec.CryptoInfo f23514i;

    /* renamed from: j  reason: collision with root package name */
    private final b f23515j;

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final MediaCodec.CryptoInfo f23516a;

        /* renamed from: b  reason: collision with root package name */
        private final MediaCodec.CryptoInfo.Pattern f23517b;

        /* access modifiers changed from: private */
        public void b(int i10, int i11) {
            this.f23517b.set(i10, i11);
            this.f23516a.setPattern(this.f23517b);
        }

        private b(MediaCodec.CryptoInfo cryptoInfo) {
            this.f23516a = cryptoInfo;
            this.f23517b = new MediaCodec.CryptoInfo.Pattern(0, 0);
        }
    }

    public c() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f23514i = cryptoInfo;
        this.f23515j = L.f22072a >= 24 ? new b(cryptoInfo) : null;
    }

    public MediaCodec.CryptoInfo a() {
        return this.f23514i;
    }

    public void b(int i10) {
        if (i10 != 0) {
            if (this.f23509d == null) {
                int[] iArr = new int[1];
                this.f23509d = iArr;
                this.f23514i.numBytesOfClearData = iArr;
            }
            int[] iArr2 = this.f23509d;
            iArr2[0] = iArr2[0] + i10;
        }
    }

    public void c(int i10, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i11, int i12, int i13) {
        this.f23511f = i10;
        this.f23509d = iArr;
        this.f23510e = iArr2;
        this.f23507b = bArr;
        this.f23506a = bArr2;
        this.f23508c = i11;
        this.f23512g = i12;
        this.f23513h = i13;
        MediaCodec.CryptoInfo cryptoInfo = this.f23514i;
        cryptoInfo.numSubSamples = i10;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i11;
        if (L.f22072a >= 24) {
            ((b) C2076a.e(this.f23515j)).b(i12, i13);
        }
    }
}
