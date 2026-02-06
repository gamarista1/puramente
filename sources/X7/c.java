package X7;

import T6.b;
import android.net.Uri;
import android.os.SystemClock;
import com.facebook.imagepipeline.producers.X;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.modules.network.i;
import com.google.android.gms.common.api.a;
import i7.C3593b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C6496s;
import lf.C6535s;
import rh.C;
import rh.C6703A;
import rh.C6707d;
import rh.u;

public final class c extends b {

    /* renamed from: e  reason: collision with root package name */
    private final C6703A f35375e;

    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f35376a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                X7.a[] r0 = X7.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                X7.a r1 = X7.a.RELOAD     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                X7.a r1 = X7.a.FORCE_CACHE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                X7.a r1 = X7.a.ONLY_IF_CACHED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                X7.a r1 = X7.a.DEFAULT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f35376a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: X7.c.a.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(C6703A a10) {
        super(a10);
        C6496s.h(a10, "okHttpClient");
        this.f35375e = a10;
    }

    private final Map p(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        HashMap hashMap = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            String string = readableMap.getString(nextKey);
            if (string != null) {
                hashMap.put(nextKey, string);
            }
        }
        return hashMap;
    }

    /* renamed from: j */
    public void a(b.C0555b bVar, X.a aVar) {
        Map map;
        C6496s.h(bVar, "fetchState");
        C6496s.h(aVar, "callback");
        bVar.f34187f = SystemClock.elapsedRealtime();
        Uri g10 = bVar.g();
        C6496s.g(g10, "getUri(...)");
        C6707d.a aVar2 = new C6707d.a();
        if (bVar.b().F() instanceof b) {
            C3593b F10 = bVar.b().F();
            C6496s.f(F10, "null cannot be cast to non-null type com.facebook.react.modules.fresco.ReactNetworkImageRequest");
            b bVar2 = (b) F10;
            map = p(bVar2.C());
            int i10 = a.f35376a[bVar2.B().ordinal()];
            if (i10 == 1) {
                aVar2.e().d();
            } else if (i10 == 2) {
                aVar2.c(a.e.API_PRIORITY_OTHER, TimeUnit.SECONDS);
            } else if (i10 == 3) {
                aVar2.f().c(a.e.API_PRIORITY_OTHER, TimeUnit.SECONDS);
            } else if (i10 == 4) {
                aVar2.e();
            } else {
                throw new C6535s();
            }
        } else {
            aVar2.e();
            map = null;
        }
        u b10 = i.b(map);
        C.a c10 = new C.a().c(aVar2.a());
        String uri = g10.toString();
        C6496s.g(uri, "toString(...)");
        C.a l10 = c10.l(uri);
        C6496s.e(b10);
        k(bVar, aVar, l10.f(b10).d().b());
    }
}
