package uf;

import kotlin.jvm.internal.C6496s;
import tf.C6727a;

/* renamed from: uf.a  reason: case insensitive filesystem */
public abstract class C6742a extends C6727a {

    /* renamed from: uf.a$a  reason: collision with other inner class name */
    private static final class C1072a {

        /* renamed from: a  reason: collision with root package name */
        public static final C1072a f73583a = new C1072a();

        /* renamed from: b  reason: collision with root package name */
        public static final Integer f73584b;

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
                    f73584b = num2;
                }
            } catch (Throwable unused) {
            }
            num = null;
            num2 = num;
            f73584b = num2;
        }

        private C1072a() {
        }
    }

    private final boolean c(int i10) {
        Integer num = C1072a.f73584b;
        if (num == null || num.intValue() >= i10) {
            return true;
        }
        return false;
    }

    public void a(Throwable th2, Throwable th3) {
        C6496s.h(th2, "cause");
        C6496s.h(th3, "exception");
        if (c(19)) {
            th2.addSuppressed(th3);
        } else {
            super.a(th2, th3);
        }
    }
}
