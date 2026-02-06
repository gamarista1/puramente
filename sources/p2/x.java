package p2;

import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import i2.L;
import p2.C2404h;

public abstract class x {

    private static final class a {
        public static boolean a(Throwable th2) {
            return th2 instanceof MediaDrm.MediaDrmStateException;
        }

        public static int b(Throwable th2) {
            return L.V(L.W(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo()));
        }
    }

    private static final class b {
        public static boolean a(Throwable th2) {
            return th2 instanceof MediaDrmResetException;
        }
    }

    public static int a(Throwable th2, int i10) {
        int i11 = L.f22072a;
        if (i11 >= 21 && a.a(th2)) {
            return a.b(th2);
        }
        if (i11 >= 23 && b.a(th2)) {
            return 6006;
        }
        if ((th2 instanceof NotProvisionedException) || b(th2)) {
            return 6002;
        }
        if (th2 instanceof DeniedByServerException) {
            return 6007;
        }
        if (th2 instanceof N) {
            return 6001;
        }
        if (th2 instanceof C2404h.e) {
            return 6003;
        }
        if (th2 instanceof K) {
            return 6008;
        }
        if (i10 == 1) {
            return 6006;
        }
        if (i10 == 2) {
            return 6004;
        }
        if (i10 == 3) {
            return 6002;
        }
        throw new IllegalArgumentException();
    }

    public static boolean b(Throwable th2) {
        if (L.f22072a != 34 || !(th2 instanceof NoSuchMethodError) || th2.getMessage() == null || !th2.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(")) {
            return false;
        }
        return true;
    }

    public static boolean c(Throwable th2) {
        if (L.f22072a != 34 || !(th2 instanceof NoSuchMethodError) || th2.getMessage() == null || !th2.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(")) {
            return false;
        }
        return true;
    }
}
