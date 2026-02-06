package androidx.work;

import B3.a;
import android.content.Context;
import androidx.work.C1836c;
import java.util.Collections;
import java.util.List;

public final class WorkManagerInitializer implements a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f18660a = s.i("WrkMgrInitializer");

    public List a() {
        return Collections.emptyList();
    }

    /* renamed from: c */
    public E b(Context context) {
        s.e().a(f18660a, "Initializing WorkManager with default configuration.");
        E.d(context, new C1836c.a().a());
        return E.c(context);
    }
}
