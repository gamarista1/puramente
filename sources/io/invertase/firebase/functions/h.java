package io.invertase.firebase.functions;

import android.content.Context;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.functions.n;
import com.google.firebase.functions.x;
import com.google.firebase.functions.y;
import io.invertase.firebase.common.b;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import ub.C5230g;

public class h extends b {
    h(Context context, String str) {
        super(context, str);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object k(String str, String str2, String str3, ReadableMap readableMap, String str4, Integer num, Object obj) {
        n m10 = n.m(C5230g.p(str), str2);
        x k10 = m10.k(str3);
        if (readableMap.hasKey("timeout")) {
            k10.b((long) readableMap.getInt("timeout"), TimeUnit.SECONDS);
        }
        if (str4 != null) {
            m10.u(str4, num.intValue());
        }
        return ((y) Tasks.await(k10.a(obj))).a();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Object l(String str, String str2, String str3, ReadableMap readableMap, String str4, Integer num, Object obj) {
        n m10 = n.m(C5230g.p(str), str2);
        x l10 = m10.l(new URL(str3));
        if (readableMap.hasKey("timeout")) {
            l10.b((long) readableMap.getInt("timeout"), TimeUnit.SECONDS);
        }
        if (str4 != null) {
            m10.u(str4, num.intValue());
        }
        return ((y) Tasks.await(l10.a(obj))).a();
    }

    /* access modifiers changed from: package-private */
    public Task i(String str, String str2, String str3, Integer num, String str4, Object obj, ReadableMap readableMap) {
        return Tasks.call(d(), new g(str, str2, str4, readableMap, str3, num, obj));
    }

    /* access modifiers changed from: package-private */
    public Task j(String str, String str2, String str3, Integer num, String str4, Object obj, ReadableMap readableMap) {
        return Tasks.call(d(), new f(str, str2, str4, readableMap, str3, num, obj));
    }
}
