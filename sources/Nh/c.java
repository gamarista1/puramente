package Nh;

import java.io.Serializable;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final a f64363a = new a();

    public static class a implements Serializable {
        private static final long serialVersionUID = 7092611880189329093L;

        a() {
        }

        private Object readResolve() {
            return c.f64363a;
        }
    }

    public static void a(StringBuffer stringBuffer, Object obj) {
        if (obj != null) {
            stringBuffer.append(obj.getClass().getName());
            stringBuffer.append('@');
            stringBuffer.append(Integer.toHexString(System.identityHashCode(obj)));
            return;
        }
        throw new NullPointerException("Cannot get the toString of a null identity");
    }
}
