package uh;

import Gh.C5404e;
import Gh.C5413n;
import Gh.U;
import java.io.IOException;
import kotlin.jvm.internal.C6496s;
import yf.C6798l;

public class e extends C5413n {

    /* renamed from: b  reason: collision with root package name */
    private final C6798l f73671b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f73672c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(U u10, C6798l lVar) {
        super(u10);
        C6496s.h(u10, "delegate");
        C6496s.h(lVar, "onException");
        this.f73671b = lVar;
    }

    public void P(C5404e eVar, long j10) {
        C6496s.h(eVar, "source");
        if (this.f73672c) {
            eVar.skip(j10);
            return;
        }
        try {
            super.P(eVar, j10);
        } catch (IOException e10) {
            this.f73672c = true;
            this.f73671b.invoke(e10);
        }
    }

    public void close() {
        if (!this.f73672c) {
            try {
                super.close();
            } catch (IOException e10) {
                this.f73672c = true;
                this.f73671b.invoke(e10);
            }
        }
    }

    public void flush() {
        if (!this.f73672c) {
            try {
                super.flush();
            } catch (IOException e10) {
                this.f73672c = true;
                this.f73671b.invoke(e10);
            }
        }
    }
}
