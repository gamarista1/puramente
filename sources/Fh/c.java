package Fh;

import Gh.C5404e;
import Gh.W;
import Gh.r;
import java.io.Closeable;
import java.util.zip.Inflater;
import kotlin.jvm.internal.C6496s;

public final class c implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f63091a;

    /* renamed from: b  reason: collision with root package name */
    private final C5404e f63092b;

    /* renamed from: c  reason: collision with root package name */
    private final Inflater f63093c;

    /* renamed from: d  reason: collision with root package name */
    private final r f63094d;

    public c(boolean z10) {
        this.f63091a = z10;
        C5404e eVar = new C5404e();
        this.f63092b = eVar;
        Inflater inflater = new Inflater(true);
        this.f63093c = inflater;
        this.f63094d = new r((W) eVar, inflater);
    }

    public final void a(C5404e eVar) {
        C6496s.h(eVar, "buffer");
        if (this.f63092b.B0() == 0) {
            if (this.f63091a) {
                this.f63093c.reset();
            }
            this.f63092b.K(eVar);
            this.f63092b.D(65535);
            long bytesRead = this.f63093c.getBytesRead() + this.f63092b.B0();
            do {
                this.f63094d.a(eVar, Long.MAX_VALUE);
            } while (this.f63093c.getBytesRead() < bytesRead);
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public void close() {
        this.f63094d.close();
    }
}
