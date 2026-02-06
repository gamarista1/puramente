package Tg;

import kotlin.jvm.internal.C6496s;

abstract class e {
    public static final double a(double d10, d dVar, d dVar2) {
        C6496s.h(dVar, "sourceUnit");
        C6496s.h(dVar2, "targetUnit");
        long convert = dVar2.b().convert(1, dVar.b());
        if (convert > 0) {
            return d10 * ((double) convert);
        }
        return d10 / ((double) dVar.b().convert(1, dVar2.b()));
    }

    public static final long b(long j10, d dVar, d dVar2) {
        C6496s.h(dVar, "sourceUnit");
        C6496s.h(dVar2, "targetUnit");
        return dVar2.b().convert(j10, dVar.b());
    }

    public static final long c(long j10, d dVar, d dVar2) {
        C6496s.h(dVar, "sourceUnit");
        C6496s.h(dVar2, "targetUnit");
        return dVar2.b().convert(j10, dVar.b());
    }
}
