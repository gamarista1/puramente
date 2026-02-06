package y8;

import com.facebook.soloader.B;
import com.facebook.soloader.C;
import com.facebook.soloader.C3452c;
import com.facebook.soloader.E;
import com.facebook.soloader.G;
import com.facebook.soloader.p;

/* renamed from: y8.k  reason: case insensitive filesystem */
public class C4225k implements C4222h {
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        String str;
        if (!(unsatisfiedLinkError instanceof C) || (unsatisfiedLinkError instanceof B)) {
            return false;
        }
        String a10 = ((C) unsatisfiedLinkError).a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Reunpacking NonApk UnpackingSoSources due to ");
        sb2.append(unsatisfiedLinkError);
        if (a10 == null) {
            str = "";
        } else {
            str = ", retrying for specific library " + a10;
        }
        sb2.append(str);
        p.b("SoLoader", sb2.toString());
        for (G g10 : eArr) {
            if (g10 instanceof G) {
                G g11 = g10;
                if (!(g11 instanceof C3452c)) {
                    try {
                        p.b("SoLoader", "Runpacking " + g11.c());
                        g11.e(2);
                    } catch (Exception e10) {
                        p.c("SoLoader", "Encountered an exception while reunpacking " + g11.c() + " for library " + a10 + ": ", e10);
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
