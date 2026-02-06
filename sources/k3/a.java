package K3;

import android.os.Build;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class a implements h {

    /* renamed from: c  reason: collision with root package name */
    private static final Set f4014c = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    private final String f4015a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4016b;

    /* renamed from: K3.a$a  reason: collision with other inner class name */
    private static class C0094a {

        /* renamed from: a  reason: collision with root package name */
        static final Set f4017a = new HashSet(Arrays.asList(s.d().a()));
    }

    public static class b extends a {
        b(String str, String str2) {
            super(str, str2);
        }

        public final boolean c() {
            return true;
        }
    }

    public static class c extends a {
        c(String str, String str2) {
            super(str, str2);
        }

        public final boolean c() {
            return true;
        }
    }

    public static class d extends a {
        d(String str, String str2) {
            super(str, str2);
        }

        public final boolean c() {
            return false;
        }
    }

    public static class e extends a {
        e(String str, String str2) {
            super(str, str2);
        }

        public final boolean c() {
            if (Build.VERSION.SDK_INT >= 26) {
                return true;
            }
            return false;
        }
    }

    public static class f extends a {
        f(String str, String str2) {
            super(str, str2);
        }

        public final boolean c() {
            if (Build.VERSION.SDK_INT >= 27) {
                return true;
            }
            return false;
        }
    }

    public static class g extends a {
        g(String str, String str2) {
            super(str, str2);
        }

        public final boolean c() {
            if (Build.VERSION.SDK_INT >= 28) {
                return true;
            }
            return false;
        }
    }

    public static class h extends a {
        h(String str, String str2) {
            super(str, str2);
        }

        public final boolean c() {
            if (Build.VERSION.SDK_INT >= 29) {
                return true;
            }
            return false;
        }
    }

    public static class i extends a {
        i(String str, String str2) {
            super(str, str2);
        }

        public final boolean c() {
            if (Build.VERSION.SDK_INT >= 33) {
                return true;
            }
            return false;
        }
    }

    a(String str, String str2) {
        this.f4015a = str;
        this.f4016b = str2;
        f4014c.add(this);
    }

    public static Set e() {
        return Collections.unmodifiableSet(f4014c);
    }

    public boolean a() {
        if (c() || d()) {
            return true;
        }
        return false;
    }

    public String b() {
        return this.f4015a;
    }

    public abstract boolean c();

    public boolean d() {
        return Th.a.b(C0094a.f4017a, this.f4016b);
    }
}
