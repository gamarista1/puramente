package K3;

import java.util.HashSet;
import java.util.Set;

public abstract class l {

    /* renamed from: c  reason: collision with root package name */
    private static final Set f4021c = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    private final String f4022a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4023b;

    public static class a extends l {
        a(String str, String str2) {
            super(str, str2);
        }
    }

    public static class b extends l {
        b(String str, String str2) {
            super(str, str2);
        }
    }

    l(String str, String str2) {
        this.f4022a = str;
        this.f4023b = str2;
        f4021c.add(this);
    }
}
