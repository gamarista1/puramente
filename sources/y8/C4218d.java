package y8;

import com.facebook.soloader.C;
import com.facebook.soloader.C3452c;
import com.facebook.soloader.E;
import com.facebook.soloader.G;
import com.facebook.soloader.p;

/* renamed from: y8.d  reason: case insensitive filesystem */
public class C4218d implements C4222h {
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        if (!(unsatisfiedLinkError instanceof C)) {
            return false;
        }
        p.b("SoLoader", "Checking /data/data missing libraries.");
        boolean z10 = false;
        for (G g10 : eArr) {
            if ((g10 instanceof G) && !(g10 instanceof C3452c)) {
                G g11 = g10;
                try {
                    G.c[] o10 = g11.o();
                    int length = o10.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 >= length) {
                            break;
                        }
                        G.c cVar = o10[i10];
                        if (g11.f(cVar.f42489a) == null) {
                            p.b("SoLoader", "Missing " + cVar.f42489a + " from " + g11.c() + ", will force prepare.");
                            g11.e(2);
                            z10 = true;
                            break;
                        }
                        i10++;
                    }
                } catch (Exception e10) {
                    p.c("SoLoader", "Encountered an exception while recovering from /data/data failure ", e10);
                    return false;
                }
            }
        }
        if (z10) {
            p.b("SoLoader", "Successfully recovered from /data/data disk failure.");
            return true;
        }
        p.b("SoLoader", "No libraries missing from unpacking so paths while recovering /data/data failure");
        return false;
    }
}
