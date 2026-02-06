package rb;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* renamed from: rb.b  reason: case insensitive filesystem */
public abstract class C5190b {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f61558a = Logger.getLogger(C5190b.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f61559b = new AtomicBoolean(false);

    /* renamed from: rb.b$b  reason: collision with other inner class name */
    public enum C0906b {
        ALGORITHM_NOT_FIPS {
            public boolean a() {
                return !C5190b.c();
            }
        },
        ALGORITHM_REQUIRES_BORINGCRYPTO {
            public boolean a() {
                if (!C5190b.c() || C5190b.b()) {
                    return true;
                }
                return false;
            }
        };

        public abstract boolean a();
    }

    static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", (Class[]) null).invoke((Object) null, (Object[]) null);
        } catch (Exception unused) {
            f61558a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return a().booleanValue();
    }

    public static boolean c() {
        if (C5189a.a() || f61559b.get()) {
            return true;
        }
        return false;
    }
}
