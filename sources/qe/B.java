package qe;

import Ff.p;
import ae.C4464a;
import com.facebook.react.bridge.Dynamic;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.jni.SingleType;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import lf.C6503B;
import mf.C6565s;

public abstract class B {
    private static final C5173u c(Object obj, boolean z10, Y y10, ExpectedType expectedType, C4464a aVar) {
        Object f10;
        for (SingleType singleType : expectedType.getPossibleTypes()) {
            if (z10) {
                return new h0(obj, y10, aVar);
            }
            if ((singleType.a().b().u(obj) || (obj instanceof Dynamic)) && (f10 = f(y10, obj, aVar)) != null) {
                return new C5166m(f10);
            }
        }
        return H.f61391a;
    }

    /* access modifiers changed from: private */
    public static final List d(Object obj, C4464a aVar, List list, List list2) {
        Iterable<Pair> iterable = list;
        ArrayList arrayList = new ArrayList(C6565s.y(iterable, 10));
        boolean z10 = false;
        for (Pair pair : iterable) {
            C5173u c10 = c(obj, z10, (Y) pair.b(), (ExpectedType) pair.a(), aVar);
            if (c10 instanceof C5166m) {
                z10 = true;
            }
            arrayList.add(c10);
        }
        if (z10) {
            return arrayList;
        }
        String x02 = C6565s.x0(list2, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, new A(), 30, (Object) null);
        throw new C6503B("Cannot cast '" + obj + "' to 'Either<" + x02 + ">'");
    }

    /* access modifiers changed from: private */
    public static final CharSequence e(p pVar) {
        C6496s.h(pVar, "it");
        return pVar.toString();
    }

    private static final Object f(Y y10, Object obj, C4464a aVar) {
        try {
            if (!y10.c() || (obj instanceof Dynamic)) {
                return y10.a(obj, aVar);
            }
            return obj;
        } catch (Throwable unused) {
            return null;
        }
    }
}
