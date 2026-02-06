package Y8;

import W8.e;
import Y8.d;
import android.util.Base64;

public abstract class o {

    public static abstract class a {
        public abstract o a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(e eVar);
    }

    public static a a() {
        return new d.b().d(e.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract e d();

    public boolean e() {
        if (c() != null) {
            return true;
        }
        return false;
    }

    public o f(e eVar) {
        return a().b(b()).d(eVar).c(c()).a();
    }

    public final String toString() {
        String str;
        String b10 = b();
        e d10 = d();
        if (c() == null) {
            str = "";
        } else {
            str = Base64.encodeToString(c(), 2);
        }
        return String.format("TransportContext(%s, %s, %s)", new Object[]{b10, d10, str});
    }
}
