package d6;

import T5.n;

/* renamed from: d6.d  reason: case insensitive filesystem */
public abstract class C3478d {

    /* renamed from: d6.d$a */
    class a implements n {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Throwable f43155a;

        a(Throwable th2) {
            this.f43155a = th2;
        }

        /* renamed from: a */
        public C3477c get() {
            return C3478d.b(this.f43155a);
        }
    }

    public static n a(Throwable th2) {
        return new a(th2);
    }

    public static C3477c b(Throwable th2) {
        i x10 = i.x();
        x10.p(th2);
        return x10;
    }
}
