package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import com.amazon.a.a.o.b.f;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.measurement.internal.C4622h3;
import java.util.HashMap;
import java.util.Map;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* renamed from: com.google.android.gms.measurement.internal.f5  reason: case insensitive filesystem */
public final class C4610f5 {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f55085b = {"GoogleConsent", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "CmpSdkID"};

    /* renamed from: a  reason: collision with root package name */
    private final Map f55086a;

    private C4610f5(Map map) {
        HashMap hashMap = new HashMap();
        this.f55086a = hashMap;
        hashMap.putAll(map);
    }

    private static int a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getInt(str, -1);
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    public static C4610f5 c(SharedPreferences sharedPreferences) {
        HashMap hashMap = new HashMap();
        String f10 = f(sharedPreferences, "IABTCF_VendorConsents");
        if (!WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR.equals(f10) && f10.length() > 754) {
            hashMap.put("GoogleConsent", String.valueOf(f10.charAt(754)));
        }
        int a10 = a(sharedPreferences, "IABTCF_gdprApplies");
        if (a10 != -1) {
            hashMap.put("gdprApplies", String.valueOf(a10));
        }
        int a11 = a(sharedPreferences, "IABTCF_EnableAdvertiserConsentMode");
        if (a11 != -1) {
            hashMap.put("EnableAdvertiserConsentMode", String.valueOf(a11));
        }
        int a12 = a(sharedPreferences, "IABTCF_PolicyVersion");
        if (a12 != -1) {
            hashMap.put("PolicyVersion", String.valueOf(a12));
        }
        String f11 = f(sharedPreferences, "IABTCF_PurposeConsents");
        if (!WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR.equals(f11)) {
            hashMap.put("PurposeConsents", f11);
        }
        int a13 = a(sharedPreferences, "IABTCF_CmpSdkID");
        if (a13 != -1) {
            hashMap.put("CmpSdkID", String.valueOf(a13));
        }
        return new C4610f5(hashMap);
    }

    public static String d(String str, boolean z10) {
        if (!z10 || str.length() <= 4) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int i10 = 1;
        while (true) {
            if (i10 >= 64) {
                i10 = 0;
                break;
            } else if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i10)) {
                break;
            } else {
                i10++;
            }
        }
        charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(1 | i10);
        return String.valueOf(charArray);
    }

    private static String f(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
        } catch (ClassCastException unused) {
            return WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR;
        }
    }

    private final int h() {
        try {
            String str = (String) this.f55086a.get("CmpSdkID");
            if (!TextUtils.isEmpty(str)) {
                return Integer.parseInt(str);
            }
            return -1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    private final int i() {
        try {
            String str = (String) this.f55086a.get("PolicyVersion");
            if (!TextUtils.isEmpty(str)) {
                return Integer.parseInt(str);
            }
            return -1;
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final Bundle b() {
        String str;
        String str2;
        if (!"1".equals(this.f55086a.get("GoogleConsent")) || !"1".equals(this.f55086a.get("gdprApplies")) || !"1".equals(this.f55086a.get("EnableAdvertiserConsentMode"))) {
            return Bundle.EMPTY;
        }
        int i10 = i();
        if (i10 < 0) {
            return Bundle.EMPTY;
        }
        String str3 = (String) this.f55086a.get("PurposeConsents");
        if (TextUtils.isEmpty(str3)) {
            return Bundle.EMPTY;
        }
        Bundle bundle = new Bundle();
        String str4 = "denied";
        if (str3.length() > 0) {
            String str5 = C4622h3.a.AD_STORAGE.f55127a;
            if (str3.charAt(0) == '1') {
                str2 = "granted";
            } else {
                str2 = str4;
            }
            bundle.putString(str5, str2);
        }
        if (str3.length() > 3) {
            String str6 = C4622h3.a.AD_PERSONALIZATION.f55127a;
            if (str3.charAt(2) == '1' && str3.charAt(3) == '1') {
                str = "granted";
            } else {
                str = str4;
            }
            bundle.putString(str6, str);
        }
        if (str3.length() > 6 && i10 >= 4) {
            String str7 = C4622h3.a.AD_USER_DATA.f55127a;
            if (str3.charAt(0) == '1' && str3.charAt(6) == '1') {
                str4 = "granted";
            }
            bundle.putString(str7, str4);
        }
        return bundle;
    }

    public final String e() {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("1");
        int h10 = h();
        if (h10 < 0 || h10 > 4095) {
            sb2.append("00");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt((h10 >> 6) & 63));
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(h10 & 63));
        }
        int i11 = i();
        if (i11 < 0 || i11 > 63) {
            sb2.append("0");
        } else {
            sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i11));
        }
        C4536s.a(true);
        if ("1".equals(this.f55086a.get("gdprApplies"))) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int i12 = i10 | 4;
        if ("1".equals(this.f55086a.get("EnableAdvertiserConsentMode"))) {
            i12 = i10 | 12;
        }
        sb2.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i12));
        return sb2.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4610f5)) {
            return false;
        }
        return g().equalsIgnoreCase(((C4610f5) obj).g());
    }

    /* access modifiers changed from: package-private */
    public final String g() {
        StringBuilder sb2 = new StringBuilder();
        for (String str : f55085b) {
            if (this.f55086a.containsKey(str)) {
                if (sb2.length() > 0) {
                    sb2.append(";");
                }
                sb2.append(str);
                sb2.append(f.f37530b);
                sb2.append((String) this.f55086a.get(str));
            }
        }
        return sb2.toString();
    }

    public final int hashCode() {
        return g().hashCode();
    }

    public final String toString() {
        return g();
    }
}
