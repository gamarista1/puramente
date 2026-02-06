package G6;

import T5.e;
import android.net.Uri;
import kotlin.jvm.internal.C6496s;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final l f31616a = new l();

    private l() {
    }

    public static final Uri a(Object obj, Object obj2, Object[] objArr, e eVar) {
        Uri uri;
        Uri uri2;
        C6496s.h(eVar, "requestToUri");
        if (obj != null) {
            uri = (Uri) eVar.apply(obj);
        } else {
            uri = null;
        }
        if (uri != null) {
            return uri;
        }
        if (!(objArr == null || objArr.length == 0)) {
            Object obj3 = objArr[0];
            if (obj3 != null) {
                uri2 = (Uri) eVar.apply(obj3);
            } else {
                uri2 = null;
            }
            if (uri2 != null) {
                return uri2;
            }
        }
        if (obj2 != null) {
            return (Uri) eVar.apply(obj2);
        }
        return null;
    }
}
