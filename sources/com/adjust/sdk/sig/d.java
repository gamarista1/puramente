package com.adjust.sdk.sig;

import android.content.Context;
import android.util.Log;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.Constants;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.security.InvalidKeyException;
import java.security.UnrecoverableKeyException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f36999a = false;

    public static void a(Set set, Map map, Map map2) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (map.containsKey(str)) {
                map2.put(str, (String) map.get(str));
            }
        }
    }

    public static void a(Context context, c cVar, a aVar, Map map, String str, String str2) {
        byte[] bArr;
        if (f36999a) {
            Log.e("SignerInstance", "sign: library received error. It has locked down");
        } else if (map == null || map.size() == 0 || str == null || str2 == null) {
            Log.e("SignerInstance", "sign: One or more parameters are null");
        } else {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(StdDateFormat.DATE_FORMAT_STR_ISO8601);
            boolean equals = AdjustConfig.ENVIRONMENT_SANDBOX.equals(map.get("environment"));
            if (equals) {
                Log.v("SignerInstance", "Signing all the parameters begin: " + simpleDateFormat.format(new Date(System.currentTimeMillis())));
            }
            map.put("activity_kind", str);
            map.put("client_sdk", str2);
            int i10 = 2;
            while (true) {
                if (i10 <= 0) {
                    bArr = null;
                    break;
                }
                try {
                    cVar.b(context);
                    bArr = cVar.a(context, map.toString().getBytes(Constants.ENCODING));
                    break;
                } catch (b e10) {
                    Log.e("SignerInstance", "sign: Api is less than JellyBean-4-18");
                    f36999a = true;
                    map.remove("activity_kind");
                    map.remove("client_sdk");
                    throw e10;
                } catch (InvalidKeyException | UnrecoverableKeyException e11) {
                    Log.e("SignerInstance", "sign: Received a retriable exception: " + e11.getMessage(), e11);
                    Log.e("SignerInstance", "sign: Attempting retry #" + i10);
                    i10 += -1;
                    cVar.a(context);
                } catch (Exception e12) {
                    Log.e("SignerInstance", "sign: Received an Exception: " + e12.getMessage(), e12);
                    map.remove("activity_kind");
                    map.remove("client_sdk");
                    throw e12;
                }
            }
            if (i10 == 0) {
                f36999a = true;
                map.remove("activity_kind");
                map.remove("client_sdk");
                return;
            }
            if (equals) {
                Log.v("SignerInstance", "Calling native begin: " + simpleDateFormat.format(new Date(System.currentTimeMillis())));
            }
            byte[] b10 = ((NativeLibHelper) aVar).b(context, map, bArr, cVar.f36998a);
            if (equals) {
                Log.v("SignerInstance", "Calling native end  : " + simpleDateFormat.format(new Date(System.currentTimeMillis())));
            }
            if (b10 == null) {
                Log.e("SignerInstance", "sign: Returned an null signature. Exiting...");
                map.remove("activity_kind");
                map.remove("client_sdk");
                return;
            }
            int length = b10.length;
            char[] cArr = e.f37000a;
            char[] cArr2 = new char[(length * 2)];
            for (int i11 = 0; i11 < length; i11++) {
                byte b11 = b10[i11];
                int i12 = i11 * 2;
                char[] cArr3 = e.f37000a;
                cArr2[i12] = cArr3[(b11 & 255) >>> 4];
                cArr2[i12 + 1] = cArr3[b11 & 15];
            }
            map.put("signature", new String(cArr2));
            map.remove("activity_kind");
            map.remove("client_sdk");
            if (equals) {
                Log.v("SignerInstance", "Signing all the parameters end  : " + simpleDateFormat.format(new Date(System.currentTimeMillis())));
            }
        }
    }
}
