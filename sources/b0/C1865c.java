package b0;

import f0.d;
import java.util.List;
import mf.C6550c;
import zf.C6828a;

/* renamed from: b0.c  reason: case insensitive filesystem */
public interface C1865c extends List, C1864b, C6828a {

    /* renamed from: b0.c$a */
    private static final class a extends C6550c implements C1865c {

        /* renamed from: b  reason: collision with root package name */
        private final C1865c f19055b;

        /* renamed from: c  reason: collision with root package name */
        private final int f19056c;

        /* renamed from: d  reason: collision with root package name */
        private final int f19057d;

        /* renamed from: e  reason: collision with root package name */
        private int f19058e;

        public a(C1865c cVar, int i10, int i11) {
            this.f19055b = cVar;
            this.f19056c = i10;
            this.f19057d = i11;
            d.c(i10, i11, cVar.size());
            this.f19058e = i11 - i10;
        }

        public int a() {
            return this.f19058e;
        }

        public Object get(int i10) {
            d.a(i10, this.f19058e);
            return this.f19055b.get(this.f19056c + i10);
        }

        public C1865c subList(int i10, int i11) {
            d.c(i10, i11, this.f19058e);
            C1865c cVar = this.f19055b;
            int i12 = this.f19056c;
            return new a(cVar, i10 + i12, i12 + i11);
        }
    }

    C1865c subList(int i10, int i11) {
        return new a(this, i10, i11);
    }
}
