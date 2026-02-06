package n9;

import ja.M;

/* renamed from: n9.e  reason: case insensitive filesystem */
public final class C3869e {

    /* renamed from: a  reason: collision with root package name */
    public int f46937a;

    /* renamed from: b  reason: collision with root package name */
    public int f46938b;

    /* renamed from: c  reason: collision with root package name */
    public int f46939c;

    /* renamed from: d  reason: collision with root package name */
    public int f46940d;

    /* renamed from: e  reason: collision with root package name */
    public int f46941e;

    /* renamed from: f  reason: collision with root package name */
    public int f46942f;

    /* renamed from: g  reason: collision with root package name */
    public int f46943g;

    /* renamed from: h  reason: collision with root package name */
    public int f46944h;

    /* renamed from: i  reason: collision with root package name */
    public int f46945i;

    /* renamed from: j  reason: collision with root package name */
    public int f46946j;

    /* renamed from: k  reason: collision with root package name */
    public long f46947k;

    /* renamed from: l  reason: collision with root package name */
    public int f46948l;

    private void b(long j10, int i10) {
        this.f46947k += j10;
        this.f46948l += i10;
    }

    public void a(long j10) {
        b(j10, 1);
    }

    public synchronized void c() {
    }

    public String toString() {
        return M.C("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f46937a), Integer.valueOf(this.f46938b), Integer.valueOf(this.f46939c), Integer.valueOf(this.f46940d), Integer.valueOf(this.f46941e), Integer.valueOf(this.f46942f), Integer.valueOf(this.f46943g), Integer.valueOf(this.f46944h), Integer.valueOf(this.f46945i), Integer.valueOf(this.f46946j), Long.valueOf(this.f46947k), Integer.valueOf(this.f46948l));
    }
}
