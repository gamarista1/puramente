package We;

import ff.C5869w;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import p003if.a;
import p003if.h;

public final class C0 {

    /* renamed from: c  reason: collision with root package name */
    private static volatile C0 f65546c;

    /* renamed from: d  reason: collision with root package name */
    private static final a f65547d = new a();

    /* renamed from: e  reason: collision with root package name */
    private static volatile Boolean f65548e = null;

    /* renamed from: f  reason: collision with root package name */
    private static final a f65549f = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Set f65550a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    private final Set f65551b = new CopyOnWriteArraySet();

    private C0() {
    }

    public static C0 c() {
        if (f65546c == null) {
            C5664z a10 = f65547d.a();
            try {
                if (f65546c == null) {
                    f65546c = new C0();
                }
                if (a10 != null) {
                    a10.close();
                }
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
        return f65546c;
        throw th;
    }

    public void a(String str) {
        h.c(str, "integration is required.");
        this.f65550a.add(str);
    }

    public void b(String str, String str2) {
        h.c(str, "name is required.");
        h.c(str2, "version is required.");
        this.f65551b.add(new C5869w(str, str2));
        C5664z a10 = f65549f.a();
        try {
            f65548e = null;
            if (a10 != null) {
                a10.close();
                return;
            }
            return;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }
}
