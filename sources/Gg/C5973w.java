package gg;

import eg.C5830g;
import gg.C5972v;
import kotlin.jvm.internal.C6496s;
import mg.C6577e;
import ng.b;

/* renamed from: gg.w  reason: case insensitive filesystem */
public abstract class C5973w {
    public static final C5974x a(C5972v vVar, C5830g gVar, C6577e eVar) {
        C6496s.h(vVar, "<this>");
        C6496s.h(gVar, "javaClass");
        C6496s.h(eVar, "jvmMetadataVersion");
        C5972v.a a10 = vVar.a(gVar, eVar);
        if (a10 != null) {
            return a10.a();
        }
        return null;
    }

    public static final C5974x b(C5972v vVar, b bVar, C6577e eVar) {
        C6496s.h(vVar, "<this>");
        C6496s.h(bVar, "classId");
        C6496s.h(eVar, "jvmMetadataVersion");
        C5972v.a b10 = vVar.b(bVar, eVar);
        if (b10 != null) {
            return b10.a();
        }
        return null;
    }
}
