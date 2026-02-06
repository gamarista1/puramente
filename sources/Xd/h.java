package xd;

import com.swmansion.rnscreens.r;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public abstract class h {
    public static final boolean a(r rVar) {
        C6496s.h(rVar, "<this>");
        if (rVar.getStackPresentation() == r.e.FORM_SHEET && rVar.getSheetDetents().size() == 1 && ((Number) C6565s.o0(rVar.getSheetDetents())).doubleValue() == -1.0d) {
            return true;
        }
        return false;
    }

    public static final boolean b(r rVar) {
        C6496s.h(rVar, "<this>");
        if (rVar.getStackPresentation() == r.e.FORM_SHEET) {
            return true;
        }
        return false;
    }
}
