package com.bugsnag.android;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

class x1 {

    /* renamed from: a  reason: collision with root package name */
    private static final Map f38971a;

    static {
        HashMap hashMap = new HashMap();
        f38971a = hashMap;
        hashMap.put(1, "DiskWrite");
        hashMap.put(2, "DiskRead");
        hashMap.put(4, "NetworkOperation");
        hashMap.put(8, "CustomSlowCall");
        hashMap.put(16, "ResourceMismatch");
        hashMap.put(256, "CursorLeak");
        hashMap.put(512, "CloseableLeak");
        hashMap.put(1024, "ActivityLeak");
        hashMap.put(2048, "InstanceLeak");
        hashMap.put(4096, "RegistrationLeak");
        hashMap.put(8192, "FileUriLeak");
        hashMap.put(16384, "CleartextNetwork");
    }

    x1() {
    }

    private Throwable a(Throwable th2) {
        List a10 = H1.a(th2);
        return (Throwable) a10.get(a10.size() - 1);
    }

    /* access modifiers changed from: package-private */
    public String b(String str) {
        if (!TextUtils.isEmpty(str)) {
            int lastIndexOf = str.lastIndexOf("violation=");
            if (lastIndexOf == -1) {
                return null;
            }
            String replace = str.substring(lastIndexOf).replace("violation=", "");
            if (!TextUtils.isDigitsOnly(replace)) {
                return null;
            }
            return (String) f38971a.get(Integer.valueOf(replace));
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public boolean c(Throwable th2) {
        return a(th2).getClass().getName().toLowerCase(Locale.US).startsWith("android.os.strictmode");
    }
}
