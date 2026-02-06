package Ug;

import yf.C6798l;

/* renamed from: Ug.s0  reason: case insensitive filesystem */
public interface C5592s0 {

    /* renamed from: Ug.s0$a */
    public static final class a implements C5592s0 {

        /* renamed from: a  reason: collision with root package name */
        private final C6798l f65408a;

        public a(C6798l lVar) {
            this.f65408a = lVar;
        }

        public void b(Throwable th2) {
            this.f65408a.invoke(th2);
        }

        public String toString() {
            return "InternalCompletionHandler.UserSupplied[" + O.a(this.f65408a) + '@' + O.b(this) + ']';
        }
    }

    void b(Throwable th2);
}
