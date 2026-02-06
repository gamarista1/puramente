package D;

import kotlin.jvm.internal.C6498u;
import yf.C6798l;
import yf.q;
import yf.r;

public interface x {

    static final class a extends C6498u implements C6798l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f1353a = new a();

        a() {
            super(1);
        }

        public final Void a(int i10) {
            return null;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    static /* synthetic */ void c(x xVar, Object obj, Object obj2, q qVar, int i10, Object obj3) {
        if (obj3 == null) {
            if ((i10 & 1) != 0) {
                obj = null;
            }
            if ((i10 & 2) != 0) {
                obj2 = null;
            }
            xVar.d(obj, obj2, qVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
    }

    static /* synthetic */ void e(x xVar, int i10, C6798l lVar, C6798l lVar2, r rVar, int i11, Object obj) {
        if (obj == null) {
            if ((i11 & 2) != 0) {
                lVar = null;
            }
            if ((i11 & 4) != 0) {
                lVar2 = a.f1353a;
            }
            xVar.a(i10, lVar, lVar2, rVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
    }

    void a(int i10, C6798l lVar, C6798l lVar2, r rVar);

    void d(Object obj, Object obj2, q qVar);
}
