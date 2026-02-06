package k7;

import O6.c;
import X6.y;
import kotlin.jvm.internal.C6496s;

public final class f implements d {

    /* renamed from: a  reason: collision with root package name */
    private final int f45158a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f45159b;

    /* renamed from: c  reason: collision with root package name */
    private final d f45160c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f45161d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f45162e;

    public f(int i10, boolean z10, d dVar, Integer num, boolean z11) {
        this.f45158a = i10;
        this.f45159b = z10;
        this.f45160c = dVar;
        this.f45161d = num;
        this.f45162e = z11;
    }

    private final c a(c cVar, boolean z10) {
        d dVar = this.f45160c;
        if (dVar != null) {
            return dVar.createImageTranscoder(cVar, z10);
        }
        return null;
    }

    private final c b(c cVar, boolean z10) {
        Integer num = this.f45161d;
        if (num == null) {
            return null;
        }
        if (num != null && num.intValue() == 0) {
            return c(cVar, z10);
        }
        if (num != null && num.intValue() == 1) {
            return d(cVar, z10);
        }
        throw new IllegalArgumentException("Invalid ImageTranscoderType");
    }

    private final c c(c cVar, boolean z10) {
        return com.facebook.imagepipeline.nativecode.c.a(this.f45158a, this.f45159b, this.f45162e).createImageTranscoder(cVar, z10);
    }

    private final c d(c cVar, boolean z10) {
        c createImageTranscoder = new h(this.f45158a).createImageTranscoder(cVar, z10);
        C6496s.g(createImageTranscoder, "createImageTranscoder(...)");
        return createImageTranscoder;
    }

    public c createImageTranscoder(c cVar, boolean z10) {
        C6496s.h(cVar, "imageFormat");
        c a10 = a(cVar, z10);
        if (a10 == null) {
            a10 = b(cVar, z10);
        }
        if (a10 == null && y.a()) {
            a10 = c(cVar, z10);
        }
        if (a10 == null) {
            return d(cVar, z10);
        }
        return a10;
    }
}
