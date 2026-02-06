package io.invertase.firebase.messaging;

import Ue.C5547b;
import Ue.m;
import com.amazon.a.a.o.b;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.google.firebase.messaging.W;
import io.branch.rnbranch.RNBranchModule;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import io.intercom.android.sdk.models.carousel.ActionType;
import java.util.Map;

public abstract class q {
    public static C5547b a(String str, Exception exc) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("messageId", str);
        createMap.putMap(RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR, m.b(exc));
        return new C5547b("messaging_message_send_error", createMap);
    }

    public static C5547b b(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("messageId", str);
        return new C5547b("messaging_message_sent", createMap);
    }

    public static C5547b c() {
        return new C5547b("messaging_message_deleted", Arguments.createMap());
    }

    public static C5547b d(String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("token", str);
        return new C5547b("messaging_token_refresh", createMap);
    }

    static W e(ReadableMap readableMap) {
        W.b bVar = new W.b(readableMap.getString("to"));
        if (readableMap.hasKey("ttl")) {
            bVar.f(readableMap.getInt("ttl"));
        }
        if (readableMap.hasKey("messageId")) {
            bVar.d(readableMap.getString("messageId"));
        }
        if (readableMap.hasKey("messageType")) {
            bVar.e(readableMap.getString("messageType"));
        }
        if (readableMap.hasKey("collapseKey")) {
            bVar.c(readableMap.getString("collapseKey"));
        }
        if (readableMap.hasKey("data")) {
            ReadableMap map = readableMap.getMap("data");
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                bVar.a(nextKey, map.getString(nextKey));
            }
        }
        return bVar.b();
    }

    public static C5547b f(WritableMap writableMap, Boolean bool) {
        String str;
        if (bool.booleanValue()) {
            str = "messaging_notification_opened";
        } else {
            str = "messaging_message_received";
        }
        return new C5547b(str, writableMap);
    }

    static WritableMap g(W.c cVar) {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        if (cVar.o() != null) {
            createMap.putString(b.f37461S, cVar.o());
        }
        if (cVar.q() != null) {
            createMap.putString("titleLocKey", cVar.q());
        }
        if (cVar.p() != null) {
            createMap.putArray("titleLocArgs", Arguments.fromJavaArgs(cVar.p()));
        }
        if (cVar.a() != null) {
            createMap.putString("body", cVar.a());
        }
        if (cVar.c() != null) {
            createMap.putString("bodyLocKey", cVar.c());
        }
        if (cVar.b() != null) {
            createMap.putArray("bodyLocArgs", Arguments.fromJavaArgs(cVar.b()));
        }
        if (cVar.d() != null) {
            createMap2.putString("channelId", cVar.d());
        }
        if (cVar.e() != null) {
            createMap2.putString("clickAction", cVar.e());
        }
        if (cVar.f() != null) {
            createMap2.putString("color", cVar.f());
        }
        if (cVar.g() != null) {
            createMap2.putString("smallIcon", cVar.g());
        }
        if (cVar.h() != null) {
            createMap2.putString("imageUrl", cVar.h().toString());
        }
        if (cVar.i() != null) {
            createMap2.putString(ActionType.LINK, cVar.i().toString());
        }
        if (cVar.k() != null) {
            createMap2.putInt("count", cVar.k().intValue());
        }
        if (cVar.l() != null) {
            createMap2.putInt("priority", cVar.l().intValue());
        }
        if (cVar.m() != null) {
            createMap2.putString("sound", cVar.m());
        }
        if (cVar.n() != null) {
            createMap2.putString("ticker", cVar.n());
        }
        if (cVar.r() != null) {
            createMap2.putInt("visibility", cVar.r().intValue());
        }
        createMap.putMap("android", createMap2);
        return createMap;
    }

    public static C5547b h(W w10, Boolean bool) {
        String str;
        if (bool.booleanValue()) {
            str = "messaging_notification_opened";
        } else {
            str = "messaging_message_received";
        }
        return new C5547b(str, i(w10));
    }

    static WritableMap i(W w10) {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        if (w10.o0() != null) {
            createMap.putString("collapseKey", w10.o0());
        }
        if (w10.q0() != null) {
            createMap.putString(TicketDetailDestinationKt.LAUNCHED_FROM, w10.q0());
        }
        if (w10.v0() != null) {
            createMap.putString("to", w10.v0());
        }
        if (w10.r0() != null) {
            createMap.putString("messageId", w10.r0());
        }
        if (w10.s0() != null) {
            createMap.putString("messageType", w10.s0());
        }
        if (w10.p0().size() > 0) {
            for (Map.Entry entry : w10.p0().entrySet()) {
                createMap2.putString((String) entry.getKey(), (String) entry.getValue());
            }
        }
        createMap.putMap("data", createMap2);
        createMap.putDouble("ttl", (double) w10.w0());
        createMap.putDouble("sentTime", (double) w10.u0());
        if (w10.t0() != null) {
            createMap.putMap("notification", g(w10.t0()));
        }
        return createMap;
    }
}
