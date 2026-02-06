package androidx.work;

import android.content.Context;
import androidx.work.impl.P;
import java.util.Collections;
import java.util.List;

public abstract class E {
    protected E() {
    }

    public static E c(Context context) {
        return P.i(context);
    }

    public static void d(Context context, C1836c cVar) {
        P.d(context, cVar);
    }

    public final w a(F f10) {
        return b(Collections.singletonList(f10));
    }

    public abstract w b(List list);
}
