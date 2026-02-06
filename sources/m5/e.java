package M5;

import b6.c;
import com.adjust.sdk.Constants;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C6496s;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f32599a = new e();

    private e() {
    }

    public static final String a(d dVar) {
        C6496s.h(dVar, SubscriberAttributeKt.JSON_NAME_KEY);
        try {
            if (!(dVar instanceof f)) {
                return f32599a.c(dVar);
            }
            List d10 = ((f) dVar).d();
            C6496s.g(d10, "getCacheKeys(...)");
            e eVar = f32599a;
            Object obj = d10.get(0);
            C6496s.g(obj, "get(...)");
            return eVar.c((d) obj);
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static final List b(d dVar) {
        ArrayList arrayList;
        String str;
        C6496s.h(dVar, SubscriberAttributeKt.JSON_NAME_KEY);
        try {
            if (dVar instanceof f) {
                List d10 = ((f) dVar).d();
                C6496s.g(d10, "getCacheKeys(...)");
                arrayList = new ArrayList(d10.size());
                int size = d10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    e eVar = f32599a;
                    Object obj = d10.get(i10);
                    C6496s.g(obj, "get(...)");
                    arrayList.add(eVar.c((d) obj));
                }
            } else {
                arrayList = new ArrayList(1);
                if (dVar.c()) {
                    str = dVar.a();
                } else {
                    str = f32599a.c(dVar);
                }
                arrayList.add(str);
            }
            return arrayList;
        } catch (UnsupportedEncodingException e10) {
            throw new RuntimeException(e10);
        }
    }

    private final String c(d dVar) {
        String a10 = dVar.a();
        C6496s.g(a10, "getUriString(...)");
        Charset forName = Charset.forName(Constants.ENCODING);
        C6496s.g(forName, "forName(...)");
        byte[] bytes = a10.getBytes(forName);
        C6496s.g(bytes, "getBytes(...)");
        String a11 = c.a(bytes);
        C6496s.g(a11, "makeSHA1HashBase64(...)");
        return a11;
    }
}
