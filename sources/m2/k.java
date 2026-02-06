package m2;

import i2.L;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public int f23703a;

    /* renamed from: b  reason: collision with root package name */
    public int f23704b;

    /* renamed from: c  reason: collision with root package name */
    public int f23705c;

    /* renamed from: d  reason: collision with root package name */
    public int f23706d;

    /* renamed from: e  reason: collision with root package name */
    public int f23707e;

    /* renamed from: f  reason: collision with root package name */
    public int f23708f;

    /* renamed from: g  reason: collision with root package name */
    public int f23709g;

    /* renamed from: h  reason: collision with root package name */
    public int f23710h;

    /* renamed from: i  reason: collision with root package name */
    public int f23711i;

    /* renamed from: j  reason: collision with root package name */
    public int f23712j;

    /* renamed from: k  reason: collision with root package name */
    public long f23713k;

    /* renamed from: l  reason: collision with root package name */
    public int f23714l;

    private void b(long j10, int i10) {
        this.f23713k += j10;
        this.f23714l += i10;
    }

    public void a(long j10) {
        b(j10, 1);
    }

    public synchronized void c() {
    }

    public String toString() {
        return L.F("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f23703a), Integer.valueOf(this.f23704b), Integer.valueOf(this.f23705c), Integer.valueOf(this.f23706d), Integer.valueOf(this.f23707e), Integer.valueOf(this.f23708f), Integer.valueOf(this.f23709g), Integer.valueOf(this.f23710h), Integer.valueOf(this.f23711i), Integer.valueOf(this.f23712j), Long.valueOf(this.f23713k), Integer.valueOf(this.f23714l));
    }
}
