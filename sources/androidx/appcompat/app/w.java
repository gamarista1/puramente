package androidx.appcompat.app;

import java.util.LinkedHashSet;
import java.util.Locale;
import u1.i;

abstract class w {
    private static i a(i iVar, i iVar2) {
        Locale locale;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i10 = 0; i10 < iVar.g() + iVar2.g(); i10++) {
            if (i10 < iVar.g()) {
                locale = iVar.c(i10);
            } else {
                locale = iVar2.c(i10 - iVar.g());
            }
            if (locale != null) {
                linkedHashSet.add(locale);
            }
        }
        return i.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static i b(i iVar, i iVar2) {
        if (iVar == null || iVar.f()) {
            return i.e();
        }
        return a(iVar, iVar2);
    }
}
