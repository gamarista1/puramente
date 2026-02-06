package dh;

import qf.C6658d;

/* renamed from: dh.a  reason: case insensitive filesystem */
public interface C5817a {

    /* renamed from: dh.a$a  reason: collision with other inner class name */
    public static final class C0988a {
        public static /* synthetic */ Object a(C5817a aVar, Object obj, C6658d dVar, int i10, Object obj2) {
            if (obj2 == null) {
                if ((i10 & 1) != 0) {
                    obj = null;
                }
                return aVar.a(obj, dVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
        }

        public static /* synthetic */ boolean b(C5817a aVar, Object obj, int i10, Object obj2) {
            if (obj2 == null) {
                if ((i10 & 1) != 0) {
                    obj = null;
                }
                return aVar.c(obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
        }

        public static /* synthetic */ void c(C5817a aVar, Object obj, int i10, Object obj2) {
            if (obj2 == null) {
                if ((i10 & 1) != 0) {
                    obj = null;
                }
                aVar.e(obj);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
        }
    }

    Object a(Object obj, C6658d dVar);

    boolean c(Object obj);

    boolean d();

    void e(Object obj);
}
