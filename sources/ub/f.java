package Ub;

import android.util.Base64;
import com.revenuecat.purchases.common.Constants;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class f {

    /* renamed from: a  reason: collision with root package name */
    private URI f53355a;

    /* renamed from: b  reason: collision with root package name */
    private String f53356b;

    /* renamed from: c  reason: collision with root package name */
    private String f53357c = null;

    /* renamed from: d  reason: collision with root package name */
    private Map f53358d;

    public f(URI uri, String str, Map map) {
        this.f53355a = uri;
        this.f53356b = str;
        this.f53358d = map;
        this.f53357c = a();
    }

    private String a() {
        byte[] bArr = new byte[16];
        for (int i10 = 0; i10 < 16; i10++) {
            bArr[i10] = (byte) d(0, 255);
        }
        return Base64.encodeToString(bArr, 2);
    }

    private String b(LinkedHashMap linkedHashMap) {
        String str = new String();
        for (String str2 : linkedHashMap.keySet()) {
            str = str + str2 + ": " + ((String) linkedHashMap.get(str2)) + "\r\n";
        }
        return str;
    }

    private int d(int i10, int i11) {
        return (int) ((Math.random() * ((double) i11)) + ((double) i10));
    }

    public byte[] c() {
        String str;
        String path = this.f53355a.getPath();
        String query = this.f53355a.getQuery();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(path);
        if (query == null) {
            str = "";
        } else {
            str = "?" + query;
        }
        sb2.append(str);
        String sb3 = sb2.toString();
        String host = this.f53355a.getHost();
        if (this.f53355a.getPort() != -1) {
            host = host + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + this.f53355a.getPort();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Host", host);
        linkedHashMap.put("Upgrade", "websocket");
        linkedHashMap.put("Connection", "Upgrade");
        linkedHashMap.put("Sec-WebSocket-Version", "13");
        linkedHashMap.put("Sec-WebSocket-Key", this.f53357c);
        String str2 = this.f53356b;
        if (str2 != null) {
            linkedHashMap.put("Sec-WebSocket-Protocol", str2);
        }
        Map map = this.f53358d;
        if (map != null) {
            for (String str3 : map.keySet()) {
                if (!linkedHashMap.containsKey(str3)) {
                    linkedHashMap.put(str3, (String) this.f53358d.get(str3));
                }
            }
        }
        byte[] bytes = ((("GET " + sb3 + " HTTP/1.1\r\n") + b(linkedHashMap)) + "\r\n").getBytes(Charset.defaultCharset());
        byte[] bArr = new byte[bytes.length];
        System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        return bArr;
    }

    public void e(HashMap hashMap) {
        if (!"websocket".equals(hashMap.get("upgrade"))) {
            throw new e("connection failed: missing header field in server handshake: Upgrade");
        } else if (!"upgrade".equals(hashMap.get("connection"))) {
            throw new e("connection failed: missing header field in server handshake: Connection");
        }
    }

    public void f(String str) {
        int parseInt = Integer.parseInt(str.substring(9, 12));
        if (parseInt == 407) {
            throw new e("connection failed: proxy authentication not supported");
        } else if (parseInt == 404) {
            throw new e("connection failed: 404 not found");
        } else if (parseInt != 101) {
            throw new e("connection failed: unknown status code " + parseInt);
        }
    }
}
