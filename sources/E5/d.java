package E5;

import android.os.Build;
import android.os.Bundle;
import com.facebook.I;
import io.branch.rnbranch.RNBranchModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.C6496s;
import o7.C3884A;
import o7.C3906w;
import o7.W;
import org.json.JSONArray;
import org.json.JSONObject;
import t7.C4049a;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f30645a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f30646b;

    /* renamed from: c  reason: collision with root package name */
    private static JSONArray f30647c;

    /* renamed from: d  reason: collision with root package name */
    private static String[] f30648d = {"event", "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};

    private d() {
    }

    public static final void a() {
        Class<d> cls = d.class;
        if (!C4049a.d(cls)) {
            try {
                f30645a.g();
                if (f30647c != null) {
                    f30646b = true;
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final void b(Bundle bundle, String str) {
        String str2;
        Class<d> cls = d.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(bundle, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS);
                C6496s.h(str, "event");
                bundle.putString("event", str);
                StringBuilder sb2 = new StringBuilder();
                W w10 = W.f47163a;
                Locale J10 = w10.J();
                String str3 = null;
                if (J10 != null) {
                    str2 = J10.getLanguage();
                } else {
                    str2 = null;
                }
                String str4 = "";
                if (str2 == null) {
                    str2 = str4;
                }
                sb2.append(str2);
                sb2.append('_');
                Locale J11 = w10.J();
                if (J11 != null) {
                    str3 = J11.getCountry();
                }
                if (str3 == null) {
                    str3 = str4;
                }
                sb2.append(str3);
                bundle.putString("_locale", sb2.toString());
                String R10 = w10.R();
                if (R10 == null) {
                    R10 = str4;
                }
                bundle.putString("_appVersion", R10);
                bundle.putString("_deviceOS", "ANDROID");
                bundle.putString("_platform", "mobile");
                String str5 = Build.MODEL;
                if (str5 == null) {
                    str5 = str4;
                }
                bundle.putString("_deviceModel", str5);
                bundle.putString("_nativeAppID", I.m());
                String R11 = w10.R();
                if (R11 != null) {
                    str4 = R11;
                }
                bundle.putString("_nativeAppShortVersion", str4);
                bundle.putString("_timezone", w10.E());
                bundle.putString("_carrier", w10.z());
                bundle.putString("_deviceOSTypeName", "ANDROID");
                bundle.putString("_deviceOSVersion", Build.VERSION.RELEASE);
                bundle.putLong("_remainingDiskGB", w10.x());
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final String c(JSONObject jSONObject) {
        Class<d> cls = d.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(jSONObject, "logic");
            Iterator<String> keys = jSONObject.keys();
            if (keys.hasNext()) {
                return keys.next();
            }
            return null;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final String d(Bundle bundle) {
        Class<d> cls = d.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            JSONArray jSONArray = f30647c;
            if (jSONArray == null) {
                return "[]";
            }
            if (jSONArray != null && jSONArray.length() == 0) {
                return "[]";
            }
            JSONArray jSONArray2 = f30647c;
            C6496s.f(jSONArray2, "null cannot be cast to non-null type org.json.JSONArray");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray2.length();
            for (int i10 = 0; i10 < length; i10++) {
                String optString = jSONArray2.optString(i10);
                if (optString != null) {
                    JSONObject jSONObject = new JSONObject(optString);
                    long optLong = jSONObject.optLong("id");
                    if (optLong != 0) {
                        String optString2 = jSONObject.optString("rule");
                        if (optString2 != null) {
                            if (f(optString2, bundle)) {
                                arrayList.add(Long.valueOf(optLong));
                            }
                        }
                    }
                }
            }
            String jSONArray3 = new JSONArray(arrayList).toString();
            C6496s.g(jSONArray3, "JSONArray(res).toString()");
            return jSONArray3;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final ArrayList e(JSONArray jSONArray) {
        Class<d> cls = d.class;
        if (C4049a.d(cls) || jSONArray == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(jSONArray.get(i10).toString());
            }
            return arrayList;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final boolean f(String str, Bundle bundle) {
        Class<d> cls = d.class;
        if (!(C4049a.d(cls) || str == null || bundle == null)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String c10 = c(jSONObject);
                if (c10 == null) {
                    return false;
                }
                Object obj = jSONObject.get(c10);
                int hashCode = c10.hashCode();
                if (hashCode != 3555) {
                    if (hashCode != 96727) {
                        if (hashCode == 109267) {
                            if (c10.equals("not")) {
                                return !f(obj.toString(), bundle);
                            }
                        }
                    } else if (c10.equals("and")) {
                        JSONArray jSONArray = (JSONArray) obj;
                        if (jSONArray == null) {
                            return false;
                        }
                        int length = jSONArray.length();
                        for (int i10 = 0; i10 < length; i10++) {
                            if (!f(jSONArray.get(i10).toString(), bundle)) {
                                return false;
                            }
                        }
                        return true;
                    }
                } else if (c10.equals("or")) {
                    JSONArray jSONArray2 = (JSONArray) obj;
                    if (jSONArray2 == null) {
                        return false;
                    }
                    int length2 = jSONArray2.length();
                    for (int i11 = 0; i11 < length2; i11++) {
                        if (f(jSONArray2.get(i11).toString(), bundle)) {
                            return true;
                        }
                    }
                    return false;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                if (jSONObject2 == null) {
                    return false;
                }
                return j(c10, jSONObject2, bundle);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
        return false;
    }

    private final void g() {
        if (!C4049a.d(this)) {
            try {
                C3906w u10 = C3884A.u(I.m(), false);
                if (u10 != null) {
                    f30647c = u10.k();
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    public static final void h(Bundle bundle, String str) {
        Class<d> cls = d.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(str, "event");
                if (f30646b && bundle != null) {
                    try {
                        b(bundle, str);
                        bundle.putString("_audiencePropertyIds", d(bundle));
                        bundle.putString("cs_maca", "1");
                        i(bundle);
                    } catch (Exception unused) {
                    }
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    public static final void i(Bundle bundle) {
        Class<d> cls = d.class;
        if (!C4049a.d(cls)) {
            try {
                C6496s.h(bundle, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_PARAMS);
                for (String remove : f30648d) {
                    bundle.remove(remove);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01bf, code lost:
        if (kotlin.jvm.internal.C6496s.c(r7.toString(), r3) != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01db, code lost:
        if (java.lang.Double.parseDouble(r7.toString()) <= java.lang.Double.parseDouble(r3)) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x020b, code lost:
        if (java.lang.Double.parseDouble(r7.toString()) >= java.lang.Double.parseDouble(r3)) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0219, code lost:
        if (r9 != null) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x021b, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0220, code lost:
        if (r9.isEmpty() == false) goto L_0x0224;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0224, code lost:
        r8 = r9.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x022c, code lost:
        if (r8.hasNext() == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x022e, code lost:
        r10 = java.util.Locale.ROOT;
        r9 = ((java.lang.String) r8.next()).toLowerCase(r10);
        kotlin.jvm.internal.C6496s.g(r9, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        r10 = r7.toString().toLowerCase(r10);
        kotlin.jvm.internal.C6496s.g(r10, "this as java.lang.String).toLowerCase(Locale.ROOT)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x024c, code lost:
        if (kotlin.jvm.internal.C6496s.c(r9, r10) == false) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x025a, code lost:
        if (r9 != null) goto L_0x025d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x025c, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0261, code lost:
        if (r9.isEmpty() == false) goto L_0x0265;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0265, code lost:
        r8 = r9.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x026d, code lost:
        if (r8.hasNext() == false) goto L_0x034e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x026f, code lost:
        r10 = java.util.Locale.ROOT;
        r9 = ((java.lang.String) r8.next()).toLowerCase(r10);
        kotlin.jvm.internal.C6496s.g(r9, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        r10 = r7.toString().toLowerCase(r10);
        kotlin.jvm.internal.C6496s.g(r10, "this as java.lang.String).toLowerCase(Locale.ROOT)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x028d, code lost:
        if (kotlin.jvm.internal.C6496s.c(r9, r10) == false) goto L_0x0269;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0308, code lost:
        if (r9 != null) goto L_0x030b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x030a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x031d, code lost:
        if (r9 != null) goto L_0x0320;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x031f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        if (r7 == null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:?, code lost:
        return kotlin.jvm.internal.C6496s.c(r7.toString(), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:?, code lost:
        return r9.contains(r7.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:?, code lost:
        return r9.contains(r7.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0183, code lost:
        if (java.lang.Double.parseDouble(r7.toString()) < java.lang.Double.parseDouble(r3)) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01a9, code lost:
        if (java.lang.Double.parseDouble(r7.toString()) > java.lang.Double.parseDouble(r3)) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean j(java.lang.String r8, org.json.JSONObject r9, android.os.Bundle r10) {
        /*
            java.lang.Class<E5.d> r0 = E5.d.class
            boolean r1 = t7.C4049a.d(r0)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            java.lang.String r1 = "variable"
            kotlin.jvm.internal.C6496s.h(r8, r1)     // Catch:{ all -> 0x0042 }
            java.lang.String r1 = "values"
            kotlin.jvm.internal.C6496s.h(r9, r1)     // Catch:{ all -> 0x0042 }
            java.lang.String r1 = c(r9)     // Catch:{ all -> 0x0042 }
            if (r1 != 0) goto L_0x001b
            return r2
        L_0x001b:
            java.lang.Object r3 = r9.get(r1)     // Catch:{ all -> 0x0042 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0042 }
            org.json.JSONArray r9 = r9.optJSONArray(r1)     // Catch:{ all -> 0x0042 }
            java.util.ArrayList r9 = e(r9)     // Catch:{ all -> 0x0042 }
            java.lang.String r4 = "exists"
            boolean r4 = kotlin.jvm.internal.C6496s.c(r1, r4)     // Catch:{ all -> 0x0042 }
            r5 = 1
            if (r4 == 0) goto L_0x0046
            if (r10 == 0) goto L_0x0045
            boolean r8 = r10.containsKey(r8)     // Catch:{ all -> 0x0042 }
            boolean r9 = java.lang.Boolean.parseBoolean(r3)     // Catch:{ all -> 0x0042 }
            if (r8 != r9) goto L_0x0045
            r2 = r5
            goto L_0x0045
        L_0x0042:
            r8 = move-exception
            goto L_0x034f
        L_0x0045:
            return r2
        L_0x0046:
            r4 = 0
            java.lang.String r6 = "this as java.lang.String).toLowerCase(Locale.ROOT)"
            if (r10 == 0) goto L_0x005a
            java.util.Locale r7 = java.util.Locale.ROOT     // Catch:{ all -> 0x0042 }
            java.lang.String r7 = r8.toLowerCase(r7)     // Catch:{ all -> 0x0042 }
            kotlin.jvm.internal.C6496s.g(r7, r6)     // Catch:{ all -> 0x0042 }
            java.lang.Object r7 = r10.get(r7)     // Catch:{ all -> 0x0042 }
            if (r7 != 0) goto L_0x0066
        L_0x005a:
            if (r10 == 0) goto L_0x0062
            java.lang.Object r8 = r10.get(r8)     // Catch:{ all -> 0x0042 }
            r7 = r8
            goto L_0x0063
        L_0x0062:
            r7 = r4
        L_0x0063:
            if (r7 != 0) goto L_0x0066
            return r2
        L_0x0066:
            int r8 = r1.hashCode()     // Catch:{ all -> 0x0042 }
            r10 = 2
            switch(r8) {
                case -1729128927: goto L_0x0329;
                case -1179774633: goto L_0x0314;
                case -1039699439: goto L_0x02ff;
                case -969266188: goto L_0x02ed;
                case -966353971: goto L_0x02d5;
                case -665609109: goto L_0x02cb;
                case -567445985: goto L_0x02b7;
                case -327990090: goto L_0x0291;
                case -159812115: goto L_0x0250;
                case -92753547: goto L_0x020f;
                case 60: goto L_0x01f3;
                case 61: goto L_0x01df;
                case 62: goto L_0x01c3;
                case 1084: goto L_0x01ad;
                case 1921: goto L_0x0191;
                case 1952: goto L_0x0187;
                case 1983: goto L_0x016b;
                case 3244: goto L_0x0161;
                case 3294: goto L_0x0157;
                case 3309: goto L_0x014d;
                case 3365: goto L_0x0143;
                case 3449: goto L_0x0139;
                case 3464: goto L_0x012f;
                case 3511: goto L_0x0125;
                case 102680: goto L_0x011b;
                case 107485: goto L_0x0111;
                case 108954: goto L_0x0107;
                case 127966736: goto L_0x00e3;
                case 127966857: goto L_0x00d9;
                case 363990325: goto L_0x00b5;
                case 1091487233: goto L_0x00ab;
                case 1918401035: goto L_0x0094;
                case 1961112862: goto L_0x0070;
                default: goto L_0x006e;
            }     // Catch:{ all -> 0x0042 }
        L_0x006e:
            goto L_0x034e
        L_0x0070:
            java.lang.String r8 = "i_starts_with"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x007a
            goto L_0x034e
        L_0x007a:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x0042 }
            java.util.Locale r9 = java.util.Locale.ROOT     // Catch:{ all -> 0x0042 }
            java.lang.String r8 = r8.toLowerCase(r9)     // Catch:{ all -> 0x0042 }
            kotlin.jvm.internal.C6496s.g(r8, r6)     // Catch:{ all -> 0x0042 }
            java.lang.String r9 = r3.toLowerCase(r9)     // Catch:{ all -> 0x0042 }
            kotlin.jvm.internal.C6496s.g(r9, r6)     // Catch:{ all -> 0x0042 }
            boolean r2 = Sg.p.J(r8, r9, r2, r10, r4)     // Catch:{ all -> 0x0042 }
            goto L_0x034e
        L_0x0094:
            java.lang.String r8 = "not_contains"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x009e
            goto L_0x034e
        L_0x009e:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x0042 }
            boolean r8 = Sg.p.O(r8, r3, r2, r10, r4)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x034e
        L_0x00a8:
            r2 = r5
            goto L_0x034e
        L_0x00ab:
            java.lang.String r8 = "i_is_not_any"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x0219
            goto L_0x034e
        L_0x00b5:
            java.lang.String r8 = "i_contains"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x00bf
            goto L_0x034e
        L_0x00bf:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x0042 }
            java.util.Locale r9 = java.util.Locale.ROOT     // Catch:{ all -> 0x0042 }
            java.lang.String r8 = r8.toLowerCase(r9)     // Catch:{ all -> 0x0042 }
            kotlin.jvm.internal.C6496s.g(r8, r6)     // Catch:{ all -> 0x0042 }
            java.lang.String r9 = r3.toLowerCase(r9)     // Catch:{ all -> 0x0042 }
            kotlin.jvm.internal.C6496s.g(r9, r6)     // Catch:{ all -> 0x0042 }
            boolean r2 = Sg.p.O(r8, r9, r2, r10, r4)     // Catch:{ all -> 0x0042 }
            goto L_0x034e
        L_0x00d9:
            java.lang.String r8 = "i_str_in"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x025a
            goto L_0x034e
        L_0x00e3:
            java.lang.String r8 = "i_str_eq"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x00ed
            goto L_0x034e
        L_0x00ed:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x0042 }
            java.util.Locale r9 = java.util.Locale.ROOT     // Catch:{ all -> 0x0042 }
            java.lang.String r8 = r8.toLowerCase(r9)     // Catch:{ all -> 0x0042 }
            kotlin.jvm.internal.C6496s.g(r8, r6)     // Catch:{ all -> 0x0042 }
            java.lang.String r9 = r3.toLowerCase(r9)     // Catch:{ all -> 0x0042 }
            kotlin.jvm.internal.C6496s.g(r9, r6)     // Catch:{ all -> 0x0042 }
            boolean r2 = kotlin.jvm.internal.C6496s.c(r8, r9)     // Catch:{ all -> 0x0042 }
            goto L_0x034e
        L_0x0107:
            java.lang.String r8 = "neq"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x01b7
            goto L_0x034e
        L_0x0111:
            java.lang.String r8 = "lte"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x019b
            goto L_0x034e
        L_0x011b:
            java.lang.String r8 = "gte"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x0175
            goto L_0x034e
        L_0x0125:
            java.lang.String r8 = "ne"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x01b7
            goto L_0x034e
        L_0x012f:
            java.lang.String r8 = "lt"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x01fd
            goto L_0x034e
        L_0x0139:
            java.lang.String r8 = "le"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x019b
            goto L_0x034e
        L_0x0143:
            java.lang.String r8 = "in"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x031d
            goto L_0x034e
        L_0x014d:
            java.lang.String r8 = "gt"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x01cd
            goto L_0x034e
        L_0x0157:
            java.lang.String r8 = "ge"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x0175
            goto L_0x034e
        L_0x0161:
            java.lang.String r8 = "eq"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x01e9
            goto L_0x034e
        L_0x016b:
            java.lang.String r8 = ">="
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x0175
            goto L_0x034e
        L_0x0175:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x0042 }
            double r8 = java.lang.Double.parseDouble(r8)     // Catch:{ all -> 0x0042 }
            double r0 = java.lang.Double.parseDouble(r3)     // Catch:{ all -> 0x0042 }
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 < 0) goto L_0x034e
            goto L_0x00a8
        L_0x0187:
            java.lang.String r8 = "=="
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x01e9
            goto L_0x034e
        L_0x0191:
            java.lang.String r8 = "<="
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x019b
            goto L_0x034e
        L_0x019b:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x0042 }
            double r8 = java.lang.Double.parseDouble(r8)     // Catch:{ all -> 0x0042 }
            double r0 = java.lang.Double.parseDouble(r3)     // Catch:{ all -> 0x0042 }
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 > 0) goto L_0x034e
            goto L_0x00a8
        L_0x01ad:
            java.lang.String r8 = "!="
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x01b7
            goto L_0x034e
        L_0x01b7:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x0042 }
            boolean r8 = kotlin.jvm.internal.C6496s.c(r8, r3)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x034e
            goto L_0x00a8
        L_0x01c3:
            java.lang.String r8 = ">"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x01cd
            goto L_0x034e
        L_0x01cd:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x0042 }
            double r8 = java.lang.Double.parseDouble(r8)     // Catch:{ all -> 0x0042 }
            double r0 = java.lang.Double.parseDouble(r3)     // Catch:{ all -> 0x0042 }
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x034e
            goto L_0x00a8
        L_0x01df:
            java.lang.String r8 = "="
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x01e9
            goto L_0x034e
        L_0x01e9:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x0042 }
            boolean r2 = kotlin.jvm.internal.C6496s.c(r8, r3)     // Catch:{ all -> 0x0042 }
            goto L_0x034e
        L_0x01f3:
            java.lang.String r8 = "<"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x01fd
            goto L_0x034e
        L_0x01fd:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x0042 }
            double r8 = java.lang.Double.parseDouble(r8)     // Catch:{ all -> 0x0042 }
            double r0 = java.lang.Double.parseDouble(r3)     // Catch:{ all -> 0x0042 }
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 >= 0) goto L_0x034e
            goto L_0x00a8
        L_0x020f:
            java.lang.String r8 = "i_str_not_in"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x0219
            goto L_0x034e
        L_0x0219:
            if (r9 != 0) goto L_0x021c
            return r2
        L_0x021c:
            boolean r8 = r9.isEmpty()     // Catch:{ all -> 0x0042 }
            if (r8 == 0) goto L_0x0224
            goto L_0x00a8
        L_0x0224:
            java.util.Iterator r8 = r9.iterator()     // Catch:{ all -> 0x0042 }
        L_0x0228:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0042 }
            if (r9 == 0) goto L_0x00a8
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0042 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0042 }
            java.util.Locale r10 = java.util.Locale.ROOT     // Catch:{ all -> 0x0042 }
            java.lang.String r9 = r9.toLowerCase(r10)     // Catch:{ all -> 0x0042 }
            kotlin.jvm.internal.C6496s.g(r9, r6)     // Catch:{ all -> 0x0042 }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x0042 }
            java.lang.String r10 = r1.toLowerCase(r10)     // Catch:{ all -> 0x0042 }
            kotlin.jvm.internal.C6496s.g(r10, r6)     // Catch:{ all -> 0x0042 }
            boolean r9 = kotlin.jvm.internal.C6496s.c(r9, r10)     // Catch:{ all -> 0x0042 }
            if (r9 == 0) goto L_0x0228
            goto L_0x034e
        L_0x0250:
            java.lang.String r8 = "i_is_any"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x025a
            goto L_0x034e
        L_0x025a:
            if (r9 != 0) goto L_0x025d
            return r2
        L_0x025d:
            boolean r8 = r9.isEmpty()     // Catch:{ all -> 0x0042 }
            if (r8 == 0) goto L_0x0265
            goto L_0x034e
        L_0x0265:
            java.util.Iterator r8 = r9.iterator()     // Catch:{ all -> 0x0042 }
        L_0x0269:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x0042 }
            if (r9 == 0) goto L_0x034e
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x0042 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ all -> 0x0042 }
            java.util.Locale r10 = java.util.Locale.ROOT     // Catch:{ all -> 0x0042 }
            java.lang.String r9 = r9.toLowerCase(r10)     // Catch:{ all -> 0x0042 }
            kotlin.jvm.internal.C6496s.g(r9, r6)     // Catch:{ all -> 0x0042 }
            java.lang.String r1 = r7.toString()     // Catch:{ all -> 0x0042 }
            java.lang.String r10 = r1.toLowerCase(r10)     // Catch:{ all -> 0x0042 }
            kotlin.jvm.internal.C6496s.g(r10, r6)     // Catch:{ all -> 0x0042 }
            boolean r9 = kotlin.jvm.internal.C6496s.c(r9, r10)     // Catch:{ all -> 0x0042 }
            if (r9 == 0) goto L_0x0269
            goto L_0x00a8
        L_0x0291:
            java.lang.String r8 = "i_str_neq"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x029b
            goto L_0x034e
        L_0x029b:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x0042 }
            java.util.Locale r9 = java.util.Locale.ROOT     // Catch:{ all -> 0x0042 }
            java.lang.String r8 = r8.toLowerCase(r9)     // Catch:{ all -> 0x0042 }
            kotlin.jvm.internal.C6496s.g(r8, r6)     // Catch:{ all -> 0x0042 }
            java.lang.String r9 = r3.toLowerCase(r9)     // Catch:{ all -> 0x0042 }
            kotlin.jvm.internal.C6496s.g(r9, r6)     // Catch:{ all -> 0x0042 }
            boolean r8 = kotlin.jvm.internal.C6496s.c(r8, r9)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x034e
            goto L_0x00a8
        L_0x02b7:
            java.lang.String r8 = "contains"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x02c1
            goto L_0x034e
        L_0x02c1:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x0042 }
            boolean r2 = Sg.p.O(r8, r3, r2, r10, r4)     // Catch:{ all -> 0x0042 }
            goto L_0x034e
        L_0x02cb:
            java.lang.String r8 = "is_not_any"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x0308
            goto L_0x034e
        L_0x02d5:
            java.lang.String r8 = "regex_match"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x02df
            goto L_0x034e
        L_0x02df:
            Sg.m r8 = new Sg.m     // Catch:{ all -> 0x0042 }
            r8.<init>((java.lang.String) r3)     // Catch:{ all -> 0x0042 }
            java.lang.String r9 = r7.toString()     // Catch:{ all -> 0x0042 }
            boolean r2 = r8.d(r9)     // Catch:{ all -> 0x0042 }
            goto L_0x034e
        L_0x02ed:
            java.lang.String r8 = "starts_with"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x02f6
            goto L_0x034e
        L_0x02f6:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x0042 }
            boolean r2 = Sg.p.J(r8, r3, r2, r10, r4)     // Catch:{ all -> 0x0042 }
            goto L_0x034e
        L_0x02ff:
            java.lang.String r8 = "not_in"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x0308
            goto L_0x034e
        L_0x0308:
            if (r9 != 0) goto L_0x030b
            return r2
        L_0x030b:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x0042 }
            boolean r2 = r9.contains(r8)     // Catch:{ all -> 0x0042 }
            goto L_0x034e
        L_0x0314:
            java.lang.String r8 = "is_any"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x031d
            goto L_0x034e
        L_0x031d:
            if (r9 != 0) goto L_0x0320
            return r2
        L_0x0320:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x0042 }
            boolean r2 = r9.contains(r8)     // Catch:{ all -> 0x0042 }
            goto L_0x034e
        L_0x0329:
            java.lang.String r8 = "i_not_contains"
            boolean r8 = r1.equals(r8)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x0332
            goto L_0x034e
        L_0x0332:
            java.lang.String r8 = r7.toString()     // Catch:{ all -> 0x0042 }
            java.util.Locale r9 = java.util.Locale.ROOT     // Catch:{ all -> 0x0042 }
            java.lang.String r8 = r8.toLowerCase(r9)     // Catch:{ all -> 0x0042 }
            kotlin.jvm.internal.C6496s.g(r8, r6)     // Catch:{ all -> 0x0042 }
            java.lang.String r9 = r3.toLowerCase(r9)     // Catch:{ all -> 0x0042 }
            kotlin.jvm.internal.C6496s.g(r9, r6)     // Catch:{ all -> 0x0042 }
            boolean r8 = Sg.p.O(r8, r9, r2, r10, r4)     // Catch:{ all -> 0x0042 }
            if (r8 != 0) goto L_0x034e
            goto L_0x00a8
        L_0x034e:
            return r2
        L_0x034f:
            t7.C4049a.b(r8, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: E5.d.j(java.lang.String, org.json.JSONObject, android.os.Bundle):boolean");
    }
}
