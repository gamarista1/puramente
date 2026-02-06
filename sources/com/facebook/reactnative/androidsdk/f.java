package com.facebook.reactnative.androidsdk;

import android.net.Uri;
import com.amazon.a.a.o.b;
import com.facebook.C3286a;
import com.facebook.C3293h;
import com.facebook.W;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.carousel.ActionType;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import v8.C4113c;
import v8.e;
import v8.f;
import v8.g;
import v8.j;
import v8.k;
import v8.m;
import v8.n;

public abstract class f {
    public static WritableMap a(C3286a aVar) {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("accessToken", aVar.n());
        createMap.putString("applicationID", aVar.c());
        createMap.putString("userID", aVar.o());
        createMap.putArray("permissions", Arguments.fromJavaArgs(q(aVar.k())));
        createMap.putArray("declinedPermissions", Arguments.fromJavaArgs(q(aVar.f())));
        createMap.putArray("expiredPermissions", Arguments.fromJavaArgs(q(aVar.g())));
        createMap.putString("accessTokenSource", aVar.l().name());
        createMap.putDouble("expirationTime", (double) aVar.h().getTime());
        createMap.putDouble("lastRefreshTime", (double) aVar.j().getTime());
        createMap.putDouble("dataAccessExpirationTime", (double) aVar.e().getTime());
        return createMap;
    }

    private static void b(e.a aVar, ReadableMap readableMap) {
        List list;
        if (readableMap.hasKey("commonParameters")) {
            ReadableMap map = readableMap.getMap("commonParameters");
            if (map.hasKey("peopleIds")) {
                list = p(map.getArray("peopleIds"));
            } else {
                list = null;
            }
            aVar.j(list);
            aVar.k(k(map, "placeId"));
            aVar.l(k(map, "ref"));
            if (map.hasKey("hashtag")) {
                aVar.m(new f.a().e(map.getString("hashtag")).a());
            }
        }
    }

    public static C3286a c(ReadableMap readableMap) {
        List list;
        List list2;
        List list3;
        C3293h hVar;
        Date date;
        Date date2;
        String string = readableMap.getString("accessToken");
        String string2 = readableMap.getString("applicationID");
        String string3 = readableMap.getString("userID");
        Date date3 = null;
        if (!readableMap.hasKey("permissions") || readableMap.isNull("permissions")) {
            list = null;
        } else {
            list = p(readableMap.getArray("permissions"));
        }
        if (!readableMap.hasKey("declinedPermissions") || readableMap.isNull("declinedPermissions")) {
            list2 = null;
        } else {
            list2 = p(readableMap.getArray("declinedPermissions"));
        }
        if (!readableMap.hasKey("expiredPermissions") || readableMap.isNull("expiredPermissions")) {
            list3 = null;
        } else {
            list3 = p(readableMap.getArray("expiredPermissions"));
        }
        if (!readableMap.hasKey("accessTokenSource") || readableMap.isNull("accessTokenSource")) {
            hVar = null;
        } else {
            hVar = C3293h.valueOf(readableMap.getString("accessTokenSource"));
        }
        if (!readableMap.hasKey("expirationTime") || readableMap.isNull("expirationTime")) {
            date = null;
        } else {
            date = new Date((long) readableMap.getDouble("expirationTime"));
        }
        if (!readableMap.hasKey("lastRefreshTime") || readableMap.isNull("lastRefreshTime")) {
            date2 = null;
        } else {
            date2 = new Date((long) readableMap.getDouble("lastRefreshTime"));
        }
        if (readableMap.hasKey("dataAccessExpirationTime") && !readableMap.isNull("dataAccessExpirationTime")) {
            date3 = new Date((long) readableMap.getDouble("dataAccessExpirationTime"));
        }
        return new C3286a(string, string2, string3, list, list2, list3, hVar, date, date2, date3);
    }

    public static C4113c d(ReadableMap readableMap) {
        C4113c.b bVar = new C4113c.b();
        String k10 = k(readableMap, "actionType");
        if (k10 != null) {
            bVar.k(C4113c.a.valueOf(k10.toUpperCase(Locale.ROOT)));
        }
        String k11 = k(readableMap, "filters");
        if (k11 != null) {
            bVar.m(C4113c.e.valueOf(k11.toUpperCase(Locale.ROOT)));
        }
        bVar.n(readableMap.getString(MetricTracker.Object.MESSAGE));
        if (readableMap.hasKey("recipients")) {
            bVar.p(p(readableMap.getArray("recipients")));
        }
        bVar.r(k(readableMap, b.f37461S));
        bVar.l(k(readableMap, "data"));
        bVar.o(k(readableMap, "objectId"));
        if (readableMap.hasKey("suggestions")) {
            bVar.q(p(readableMap.getArray("suggestions")));
        }
        return bVar.a();
    }

    public static e e(ReadableMap readableMap) {
        if (readableMap != null) {
            String string = readableMap.getString("contentType");
            if (string.equals(ActionType.LINK)) {
                return f(readableMap);
            }
            if (string.equals("photo")) {
                return h(readableMap);
            }
            if (string.equals("video")) {
                return j(readableMap);
            }
        }
        return null;
    }

    public static g f(ReadableMap readableMap) {
        g.a aVar = new g.a();
        aVar.h(Uri.parse(readableMap.getString("contentUrl")));
        aVar.p(k(readableMap, "quote"));
        b(aVar, readableMap);
        return aVar.n();
    }

    public static j g(ReadableMap readableMap) {
        j.a aVar = new j.a();
        aVar.m(Uri.parse(readableMap.getString("imageUrl")));
        aVar.l(k(readableMap, "caption"));
        if (readableMap.hasKey("userGenerated")) {
            aVar.n(readableMap.getBoolean("userGenerated"));
        }
        return aVar.d();
    }

    public static k h(ReadableMap readableMap) {
        Uri uri;
        k.a aVar = new k.a();
        aVar.s(o(readableMap.getArray("photos")));
        String k10 = k(readableMap, "contentUrl");
        if (k10 != null) {
            uri = Uri.parse(k10);
        } else {
            uri = null;
        }
        aVar.h(uri);
        b(aVar, readableMap);
        return aVar.p();
    }

    public static m i(ReadableMap readableMap) {
        m.a aVar = new m.a();
        if (readableMap.hasKey("localUrl")) {
            aVar.h(Uri.parse(readableMap.getString("localUrl")));
        }
        return aVar.d();
    }

    public static e j(ReadableMap readableMap) {
        Uri uri;
        n.a aVar = new n.a();
        String k10 = k(readableMap, "contentUrl");
        if (k10 != null) {
            uri = Uri.parse(k10);
        } else {
            uri = null;
        }
        aVar.h(uri);
        aVar.s(k(readableMap, "contentDescription"));
        aVar.t(k(readableMap, "contentTitle"));
        if (readableMap.hasKey("previewPhoto")) {
            aVar.u(g(readableMap.getMap("previewPhoto")));
        }
        if (readableMap.hasKey("video")) {
            aVar.v(i(readableMap.getMap("video")));
        }
        b(aVar, readableMap);
        return aVar.n();
    }

    public static String k(ReadableMap readableMap, String str) {
        if (readableMap.hasKey(str)) {
            return readableMap.getString(str);
        }
        return null;
    }

    public static WritableArray l(List list) {
        WritableArray createArray = Arguments.createArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            createArray.pushString((String) it.next());
        }
        return createArray;
    }

    public static WritableMap m(W w10) {
        WritableMap createMap = Arguments.createMap();
        n(createMap, "name", w10.getName());
        n(createMap, "firstName", w10.c());
        n(createMap, "lastName", w10.e());
        n(createMap, "middleName", w10.g());
        n(createMap, "imageURL", w10.h(100, 100).toString());
        n(createMap, "linkURL", w10.f().toString());
        n(createMap, "userID", w10.d());
        return createMap;
    }

    private static void n(WritableMap writableMap, String str, String str2) {
        if (str2 == null) {
            writableMap.putNull(str);
        } else {
            writableMap.putString(str, str2);
        }
    }

    public static List o(ReadableArray readableArray) {
        ArrayList arrayList = new ArrayList(readableArray.size());
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            arrayList.add(g(readableArray.getMap(i10)));
        }
        return arrayList;
    }

    public static List p(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(readableArray.size());
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            arrayList.add(readableArray.getString(i10));
        }
        return arrayList;
    }

    public static String[] q(Set set) {
        String[] strArr = new String[set.size()];
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            strArr[i10] = (String) it.next();
            i10++;
        }
        return strArr;
    }
}
