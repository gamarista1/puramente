package C9;

import C9.b;
import C9.l;
import C9.x;
import ja.M;
import ja.s;
import ja.w;

public final class j implements l.b {

    /* renamed from: a  reason: collision with root package name */
    private int f30151a = 0;

    /* renamed from: b  reason: collision with root package name */
    private boolean f30152b;

    public l a(l.a aVar) {
        int i10;
        int i11 = M.f44981a;
        if (i11 < 23 || ((i10 = this.f30151a) != 1 && (i10 != 0 || i11 < 31))) {
            return new x.b().a(aVar);
        }
        int k10 = w.k(aVar.f30160c.f45770l);
        s.f("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + M.l0(k10));
        return new b.C0502b(k10, this.f30152b).a(aVar);
    }
}
