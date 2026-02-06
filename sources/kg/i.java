package kg;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import kotlin.jvm.internal.C6496s;

public abstract class i {
    public static final boolean a(C6434a aVar) {
        C6496s.h(aVar, DiagnosticsEntry.VERSION_KEY);
        if ((aVar.a() != 1 || aVar.b() < 4) && aVar.a() <= 1) {
            return false;
        }
        return true;
    }

    public static final boolean b(C6434a aVar) {
        C6496s.h(aVar, DiagnosticsEntry.VERSION_KEY);
        return a(aVar);
    }
}
