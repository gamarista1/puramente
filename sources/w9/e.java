package W9;

import android.os.Bundle;
import com.google.common.collect.C4770v;
import ja.C3647c;
import java.util.ArrayList;
import java.util.List;
import k9.C3700i;

public final class e implements C3700i {

    /* renamed from: b  reason: collision with root package name */
    public static final e f34962b = new e(C4770v.E());

    /* renamed from: c  reason: collision with root package name */
    public static final C3700i.a f34963c = new d();

    /* renamed from: a  reason: collision with root package name */
    public final C4770v f34964a;

    public e(List list) {
        this.f34964a = C4770v.z(list);
    }

    /* access modifiers changed from: private */
    public static final e b(Bundle bundle) {
        C4770v vVar;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(c(0));
        if (parcelableArrayList == null) {
            vVar = C4770v.E();
        } else {
            vVar = C3647c.b(b.f34927s, parcelableArrayList);
        }
        return new e(vVar);
    }

    private static String c(int i10) {
        return Integer.toString(i10, 36);
    }
}
