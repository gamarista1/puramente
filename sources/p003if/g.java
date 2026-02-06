package p003if;

import We.C5654u;
import We.E0;

/* renamed from: if.g  reason: invalid package */
public class g {
    public boolean a(String str, C5654u uVar) {
        if (b(str, uVar) != null) {
            return true;
        }
        return false;
    }

    public Class b(String str, C5654u uVar) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            if (uVar == null) {
                return null;
            }
            E0 e02 = E0.INFO;
            uVar.b(e02, "Class not available: " + str, new Object[0]);
            return null;
        } catch (UnsatisfiedLinkError e10) {
            if (uVar == null) {
                return null;
            }
            E0 e03 = E0.ERROR;
            uVar.a(e03, "Failed to load (UnsatisfiedLinkError) " + str, e10);
            return null;
        } catch (Throwable th2) {
            if (uVar == null) {
                return null;
            }
            E0 e04 = E0.ERROR;
            uVar.a(e04, "Failed to initialize " + str, th2);
            return null;
        }
    }
}
