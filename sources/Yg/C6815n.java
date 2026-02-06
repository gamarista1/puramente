package yg;

import Of.C5490h;
import Wf.b;
import java.util.Collection;
import ng.f;
import yf.C6798l;

/* renamed from: yg.n  reason: case insensitive filesystem */
public interface C6815n {

    /* renamed from: yg.n$a */
    public static final class a {
        public static /* synthetic */ Collection a(C6815n nVar, C6805d dVar, C6798l lVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    dVar = C6805d.f73920o;
                }
                if ((i10 & 2) != 0) {
                    lVar = C6812k.f73946a.c();
                }
                return nVar.f(dVar, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
        }
    }

    C5490h e(f fVar, b bVar);

    Collection f(C6805d dVar, C6798l lVar);
}
