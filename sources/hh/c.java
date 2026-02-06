package Hh;

import Gh.C5410k;
import Gh.C5411l;
import Gh.M;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import mf.C6558k;

public abstract class c {
    public static final void a(C5411l lVar, M m10, boolean z10) {
        C6496s.h(lVar, "<this>");
        C6496s.h(m10, "dir");
        C6558k kVar = new C6558k();
        M m11 = m10;
        while (m11 != null && !lVar.j(m11)) {
            kVar.addFirst(m11);
            m11 = m11.l();
        }
        if (!z10 || !kVar.isEmpty()) {
            Iterator it = kVar.iterator();
            while (it.hasNext()) {
                lVar.f((M) it.next());
            }
            return;
        }
        throw new IOException(m10 + " already exists.");
    }

    public static final boolean b(C5411l lVar, M m10) {
        C6496s.h(lVar, "<this>");
        C6496s.h(m10, "path");
        if (lVar.m(m10) != null) {
            return true;
        }
        return false;
    }

    public static final C5410k c(C5411l lVar, M m10) {
        C6496s.h(lVar, "<this>");
        C6496s.h(m10, "path");
        C5410k m11 = lVar.m(m10);
        if (m11 != null) {
            return m11;
        }
        throw new FileNotFoundException("no such file: " + m10);
    }
}
