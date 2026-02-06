package Ug;

import yf.C6798l;

/* renamed from: Ug.m  reason: case insensitive filesystem */
public interface C5580m extends M0 {

    /* renamed from: Ug.m$a */
    public static final class a implements C5580m {

        /* renamed from: a  reason: collision with root package name */
        private final C6798l f65395a;

        public a(C6798l lVar) {
            this.f65395a = lVar;
        }

        public void b(Throwable th2) {
            this.f65395a.invoke(th2);
        }

        public String toString() {
            return "CancelHandler.UserSupplied[" + O.a(this.f65395a) + '@' + O.b(this) + ']';
        }
    }

    void b(Throwable th2);
}
