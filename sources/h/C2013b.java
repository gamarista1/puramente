package h;

import Ef.m;
import android.content.Context;
import android.content.Intent;
import androidx.core.content.c;
import h.C2012a;
import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf.C6502A;
import mf.C6559l;
import mf.C6565s;
import mf.O;

/* renamed from: h.b  reason: case insensitive filesystem */
public final class C2013b extends C2012a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f21093a = new a((DefaultConstructorMarker) null);

    /* renamed from: h.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Intent a(String[] strArr) {
            C6496s.h(strArr, MetricTracker.Object.INPUT);
            Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            C6496s.g(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return putExtra;
        }

        private a() {
        }
    }

    /* renamed from: a */
    public Intent createIntent(Context context, String[] strArr) {
        C6496s.h(context, "context");
        C6496s.h(strArr, MetricTracker.Object.INPUT);
        return f21093a.a(strArr);
    }

    /* renamed from: b */
    public C2012a.C0351a getSynchronousResult(Context context, String[] strArr) {
        C6496s.h(context, "context");
        C6496s.h(strArr, MetricTracker.Object.INPUT);
        if (strArr.length == 0) {
            return new C2012a.C0351a(O.i());
        }
        for (String checkSelfPermission : strArr) {
            if (c.checkSelfPermission(context, checkSelfPermission) != 0) {
                return null;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m.d(O.e(strArr.length), 16));
        for (String a10 : strArr) {
            Pair a11 = C6502A.a(a10, Boolean.TRUE);
            linkedHashMap.put(a11.c(), a11.d());
        }
        return new C2012a.C0351a(linkedHashMap);
    }

    /* renamed from: c */
    public Map parseResult(int i10, Intent intent) {
        boolean z10;
        if (i10 != -1) {
            return O.i();
        }
        if (intent == null) {
            return O.i();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return O.i();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i11 : intArrayExtra) {
            if (i11 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            arrayList.add(Boolean.valueOf(z10));
        }
        return O.w(C6565s.n1(C6559l.Z(stringArrayExtra), arrayList));
    }
}
