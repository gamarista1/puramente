package h;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.c;
import h.C2012a;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.jvm.internal.C6496s;

/* renamed from: h.c  reason: case insensitive filesystem */
public final class C2014c extends C2012a {
    /* renamed from: a */
    public C2012a.C0351a getSynchronousResult(Context context, String str) {
        C6496s.h(context, "context");
        C6496s.h(str, MetricTracker.Object.INPUT);
        if (c.checkSelfPermission(context, str) == 0) {
            return new C2012a.C0351a(Boolean.TRUE);
        }
        return null;
    }

    /* renamed from: b */
    public Boolean parseResult(int i10, Intent intent) {
        if (intent == null || i10 != -1) {
            return Boolean.FALSE;
        }
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        boolean z10 = false;
        if (intArrayExtra != null) {
            int length = intArrayExtra.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                } else if (intArrayExtra[i11] == 0) {
                    z10 = true;
                    break;
                } else {
                    i11++;
                }
            }
        }
        return Boolean.valueOf(z10);
    }

    public Intent createIntent(Context context, String str) {
        C6496s.h(context, "context");
        C6496s.h(str, MetricTracker.Object.INPUT);
        return C2013b.f21093a.a(new String[]{str});
    }
}
