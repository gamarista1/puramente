package io.invertase.firebase.database;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.g;
import io.invertase.firebase.common.b;
import java.util.Map;

public class U extends b {
    U(Context context, String str) {
        super(context, str);
    }

    /* access modifiers changed from: package-private */
    public Task g(String str, String str2, String str3) {
        return P.b(str, str2).f(str3).M().c();
    }

    /* access modifiers changed from: package-private */
    public Task h(String str, String str2, String str3) {
        return P.b(str, str2).f(str3).M().f();
    }

    /* access modifiers changed from: package-private */
    public Task i(String str, String str2, String str3, Object obj) {
        return P.b(str, str2).f(str3).M().g(obj);
    }

    /* access modifiers changed from: package-private */
    public Task j(String str, String str2, String str3, Object obj, Object obj2) {
        g M10 = P.b(str, str2).f(str3).M();
        if (obj2 instanceof String) {
            return M10.i(obj, (String) obj2);
        }
        return M10.h(obj, ((Double) obj2).doubleValue());
    }

    /* access modifiers changed from: package-private */
    public Task k(String str, String str2, String str3, Map map) {
        return P.b(str, str2).f(str3).M().j(map);
    }
}
