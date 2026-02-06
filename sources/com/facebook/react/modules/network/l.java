package com.facebook.react.modules.network;

import Gh.C5404e;
import Gh.C5406g;
import Gh.C5414o;
import Gh.H;
import Gh.W;
import rh.F;
import rh.y;

public class l extends F {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final F f41097c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final j f41098d;

    /* renamed from: e  reason: collision with root package name */
    private C5406g f41099e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public long f41100f = 0;

    class a extends C5414o {
        a(W w10) {
            super(w10);
        }

        public long y1(C5404e eVar, long j10) {
            long j11;
            boolean z10;
            long y12 = super.y1(eVar, j10);
            l lVar = l.this;
            long M10 = lVar.f41100f;
            int i10 = (y12 > -1 ? 1 : (y12 == -1 ? 0 : -1));
            if (i10 != 0) {
                j11 = y12;
            } else {
                j11 = 0;
            }
            lVar.f41100f = M10 + j11;
            j F10 = l.this.f41098d;
            long M11 = l.this.f41100f;
            long o10 = l.this.f41097c.o();
            if (i10 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            F10.a(M11, o10, z10);
            return y12;
        }
    }

    public l(F f10, j jVar) {
        this.f41097c = f10;
        this.f41098d = jVar;
    }

    private W T(W w10) {
        return new a(w10);
    }

    public long U() {
        return this.f41100f;
    }

    public long o() {
        return this.f41097c.o();
    }

    public y q() {
        return this.f41097c.q();
    }

    public C5406g y() {
        if (this.f41099e == null) {
            this.f41099e = H.d(T(this.f41097c.y()));
        }
        return this.f41099e;
    }
}
