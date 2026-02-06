package Hd;

import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class o extends CookieHandler {

    /* renamed from: a  reason: collision with root package name */
    private CookieManager f51107a;

    private void a(String str, String str2) {
        CookieManager c10 = c();
        if (c10 != null) {
            c10.setCookie(str, str2, (ValueCallback) null);
        }
    }

    private CookieManager c() {
        if (this.f51107a == null) {
            try {
                this.f51107a = CookieManager.getInstance();
            } catch (Exception | IllegalArgumentException unused) {
                return null;
            }
        }
        return this.f51107a;
    }

    private static boolean d(String str) {
        if (str.equalsIgnoreCase("Set-cookie") || str.equalsIgnoreCase("Set-cookie2")) {
            return true;
        }
        return false;
    }

    public void b(String str, List list) {
        CookieManager c10 = c();
        if (c10 != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a(str, (String) it.next());
            }
            c10.flush();
        }
    }

    public Map get(URI uri, Map map) {
        CookieManager c10 = c();
        if (c10 == null) {
            return Collections.emptyMap();
        }
        String cookie = c10.getCookie(uri.toString());
        if (TextUtils.isEmpty(cookie)) {
            return Collections.emptyMap();
        }
        return Collections.singletonMap("Cookie", Collections.singletonList(cookie));
    }

    public void put(URI uri, Map map) {
        String uri2 = uri.toString();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null && d(str)) {
                b(uri2, (List) entry.getValue());
            }
        }
    }
}
