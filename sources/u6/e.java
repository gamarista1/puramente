package U6;

import X6.C3078a;
import f7.D;
import f7.i;
import g7.d;
import kotlin.jvm.internal.C6496s;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f34418a = new e();

    private e() {
    }

    public static final d a(D d10, d dVar, C3078a aVar) {
        C6496s.h(d10, "poolFactory");
        C6496s.h(dVar, "platformDecoder");
        C6496s.h(aVar, "closeableReferenceFactory");
        i b10 = d10.b();
        C6496s.g(b10, "getBitmapPool(...)");
        return new a(b10, aVar);
    }
}
