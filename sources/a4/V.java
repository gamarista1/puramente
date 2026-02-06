package a4;

import Gh.C5406g;
import Gh.C5411l;
import Gh.M;
import a4.S;
import android.content.Context;
import java.io.Closeable;
import java.io.File;
import o4.l;

public abstract class V {
    /* access modifiers changed from: private */
    public static final File c(Context context) {
        return l.m(context);
    }

    /* access modifiers changed from: private */
    public static final File d(Context context) {
        return l.m(context);
    }

    public static final S e(C5406g gVar, Context context) {
        return new X(gVar, new U(context), (S.a) null);
    }

    public static final S f(C5406g gVar, Context context, S.a aVar) {
        return new X(gVar, new T(context), aVar);
    }

    public static final S g(M m10, C5411l lVar, String str, Closeable closeable) {
        return new C3123p(m10, lVar, str, closeable, (S.a) null);
    }

    public static /* synthetic */ S h(M m10, C5411l lVar, String str, Closeable closeable, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            lVar = C5411l.f63319b;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            closeable = null;
        }
        return g(m10, lVar, str, closeable);
    }
}
