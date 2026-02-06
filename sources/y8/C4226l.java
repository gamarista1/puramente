package y8;

import com.facebook.soloader.C3451b;
import com.facebook.soloader.E;
import com.facebook.soloader.p;

/* renamed from: y8.l  reason: case insensitive filesystem */
public class C4226l implements C4222h {
    public boolean a(UnsatisfiedLinkError unsatisfiedLinkError, E[] eArr) {
        for (E e10 : eArr) {
            if (e10 instanceof C3451b) {
                p.b("SoLoader", "Waiting on SoSource " + e10.c());
                ((C3451b) e10).a();
            }
        }
        return true;
    }
}
