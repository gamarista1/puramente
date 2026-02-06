package b4;

import Gh.C5404e;
import Gh.C5413n;
import Gh.U;
import java.io.IOException;
import yf.C6798l;

/* renamed from: b4.d  reason: case insensitive filesystem */
public final class C3148d extends C5413n {

    /* renamed from: b  reason: collision with root package name */
    private final C6798l f36231b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f36232c;

    public C3148d(U u10, C6798l lVar) {
        super(u10);
        this.f36231b = lVar;
    }

    public void P(C5404e eVar, long j10) {
        if (this.f36232c) {
            eVar.skip(j10);
            return;
        }
        try {
            super.P(eVar, j10);
        } catch (IOException e10) {
            this.f36232c = true;
            this.f36231b.invoke(e10);
        }
    }

    public void close() {
        try {
            super.close();
        } catch (IOException e10) {
            this.f36232c = true;
            this.f36231b.invoke(e10);
        }
    }

    public void flush() {
        try {
            super.flush();
        } catch (IOException e10) {
            this.f36232c = true;
            this.f36231b.invoke(e10);
        }
    }
}
