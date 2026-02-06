package rg;

import Of.C5487e;
import Of.C5494l;
import Of.C5495m;
import Of.C5507z;
import Of.Z;
import Of.l0;
import java.util.Comparator;

/* renamed from: rg.l  reason: case insensitive filesystem */
public class C6694l implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public static final C6694l f73031a = new C6694l();

    private C6694l() {
    }

    private static Integer b(C5495m mVar, C5495m mVar2) {
        int c10 = c(mVar2) - c(mVar);
        if (c10 != 0) {
            return Integer.valueOf(c10);
        }
        if (C6691i.B(mVar) && C6691i.B(mVar2)) {
            return 0;
        }
        int c11 = mVar.getName().compareTo(mVar2.getName());
        if (c11 != 0) {
            return Integer.valueOf(c11);
        }
        return null;
    }

    private static int c(C5495m mVar) {
        if (C6691i.B(mVar)) {
            return 8;
        }
        if (mVar instanceof C5494l) {
            return 7;
        }
        if (mVar instanceof Z) {
            if (((Z) mVar).P() == null) {
                return 6;
            }
            return 5;
        } else if (mVar instanceof C5507z) {
            if (((C5507z) mVar).P() == null) {
                return 4;
            }
            return 3;
        } else if (mVar instanceof C5487e) {
            return 2;
        } else {
            if (mVar instanceof l0) {
                return 1;
            }
            return 0;
        }
    }

    /* renamed from: a */
    public int compare(C5495m mVar, C5495m mVar2) {
        Integer b10 = b(mVar, mVar2);
        if (b10 != null) {
            return b10.intValue();
        }
        return 0;
    }
}
