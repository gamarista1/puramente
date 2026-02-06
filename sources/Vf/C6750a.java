package vf;

import Cf.c;
import Df.a;
import uf.C6742a;

/* renamed from: vf.a  reason: case insensitive filesystem */
public class C6750a extends C6742a {

    /* renamed from: vf.a$a  reason: collision with other inner class name */
    private static final class C1075a {

        /* renamed from: a  reason: collision with root package name */
        public static final C1075a f73673a = new C1075a();

        /* renamed from: b  reason: collision with root package name */
        public static final Integer f73674b;

        static {
            Integer num;
            Integer num2 = null;
            try {
                Object obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object) null);
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                    if (num != null && num.intValue() > 0) {
                        num2 = num;
                    }
                    f73674b = num2;
                }
            } catch (Throwable unused) {
            }
            num = null;
            num2 = num;
            f73674b = num2;
        }

        private C1075a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C1075a.f73674b;
        if (num == null || num.intValue() >= i10) {
            return true;
        }
        return false;
    }

    public c b() {
        if (c(34)) {
            return new a();
        }
        return super.b();
    }
}
