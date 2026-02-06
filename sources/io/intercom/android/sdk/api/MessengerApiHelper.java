package io.intercom.android.sdk.api;

import com.google.gson.e;
import io.intercom.android.sdk.Injector;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import mf.O;
import rh.D;
import rh.y;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0001¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u00020\u00072\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\t¨\u0006\r"}, d2 = {"Lio/intercom/android/sdk/api/MessengerApiHelper;", "", "<init>", "()V", "", "", "options", "Lrh/D;", "optionsMapToRequestBody", "(Ljava/util/Map;)Lrh/D;", "bodyParams", "getDefaultRequestBody$intercom_sdk_base_release", "getDefaultRequestBody", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MessengerApiHelper {
    public static final int $stable = 0;
    public static final MessengerApiHelper INSTANCE = new MessengerApiHelper();

    private MessengerApiHelper() {
    }

    public static /* synthetic */ D getDefaultRequestBody$intercom_sdk_base_release$default(MessengerApiHelper messengerApiHelper, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = O.i();
        }
        return messengerApiHelper.getDefaultRequestBody$intercom_sdk_base_release(map);
    }

    public final D getDefaultRequestBody$intercom_sdk_base_release(Map<String, ? extends Object> map) {
        C6496s.h(map, "bodyParams");
        Injector injector = Injector.get();
        Map<String, Object> map2 = injector.getUserIdentity().toMap();
        injector.getApi().addSecureHash(map2);
        map2.putAll(map);
        C6496s.e(map2);
        return optionsMapToRequestBody(map2);
    }

    public final D optionsMapToRequestBody(Map<String, ? extends Object> map) {
        C6496s.h(map, "options");
        D.a aVar = D.Companion;
        String v10 = new e().v(map);
        C6496s.g(v10, "toJson(...)");
        return aVar.c(v10, y.f73499e.a("application/json; charset=utf-8"));
    }
}
