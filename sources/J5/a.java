package J5;

import Sg.C5541d;
import Sg.p;
import android.util.Patterns;
import com.amazon.a.a.o.b;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import io.intercom.android.sdk.NotificationStatuses;
import io.intercom.android.sdk.models.AttributeType;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C6496s;
import lf.C6502A;
import mf.O;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t7.C4049a;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f32166a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static Map f32167b;

    /* renamed from: c  reason: collision with root package name */
    private static Map f32168c;

    /* renamed from: d  reason: collision with root package name */
    private static Map f32169d;

    /* renamed from: e  reason: collision with root package name */
    private static JSONObject f32170e;

    /* renamed from: f  reason: collision with root package name */
    private static boolean f32171f;

    private a() {
    }

    public static final float[] a(JSONObject jSONObject, String str) {
        Class<a> cls = a.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(jSONObject, "viewHierarchy");
            C6496s.h(str, "appName");
            if (!f32171f) {
                return null;
            }
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            try {
                String lowerCase = str.toLowerCase();
                C6496s.g(lowerCase, "this as java.lang.String).toLowerCase()");
                JSONObject jSONObject2 = new JSONObject(jSONObject.optJSONObject("view").toString());
                String optString = jSONObject.optString("screenname");
                JSONArray jSONArray = new JSONArray();
                a aVar = f32166a;
                aVar.j(jSONObject2, jSONArray);
                aVar.m(fArr, aVar.i(jSONObject2));
                JSONObject b10 = aVar.b(jSONObject2);
                if (b10 == null) {
                    return null;
                }
                C6496s.g(optString, "screenName");
                String jSONObject3 = jSONObject2.toString();
                C6496s.g(jSONObject3, "viewTree.toString()");
                aVar.m(fArr, aVar.h(b10, jSONArray, optString, jSONObject3, lowerCase));
                return fArr;
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    private final JSONObject b(JSONObject jSONObject) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return jSONObject;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            if (optJSONArray == null) {
                return null;
            }
            int length = optJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                C6496s.g(jSONObject2, "children.getJSONObject(i)");
                JSONObject b10 = b(jSONObject2);
                if (b10 != null) {
                    return b10;
                }
            }
            return null;
        } catch (JSONException unused) {
        } catch (Throwable th2) {
            C4049a.b(th2, this);
        }
    }

    public static final String c(String str, String str2, String str3) {
        Class<a> cls = a.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            C6496s.h(str, "buttonText");
            C6496s.h(str2, "activityName");
            C6496s.h(str3, "appName");
            String lowerCase = (str3 + " | " + str2 + ", " + str).toLowerCase();
            C6496s.g(lowerCase, "this as java.lang.String).toLowerCase()");
            return lowerCase;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final void d(File file) {
        Class<a> cls = a.class;
        if (!C4049a.d(cls)) {
            try {
                f32170e = new JSONObject();
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                f32170e = new JSONObject(new String(bArr, C5541d.f65029b));
                try {
                    f32167b = O.l(C6502A.a("ENGLISH", "1"), C6502A.a("GERMAN", "2"), C6502A.a("SPANISH", "3"), C6502A.a("JAPANESE", "4"));
                    f32168c = O.l(C6502A.a("VIEW_CONTENT", "0"), C6502A.a("SEARCH", "1"), C6502A.a("ADD_TO_CART", "2"), C6502A.a("ADD_TO_WISHLIST", "3"), C6502A.a("INITIATE_CHECKOUT", "4"), C6502A.a("ADD_PAYMENT_INFO", "5"), C6502A.a("PURCHASE", "6"), C6502A.a("LEAD", "7"), C6502A.a("COMPLETE_REGISTRATION", "8"));
                    f32169d = O.l(C6502A.a("BUTTON_TEXT", "1"), C6502A.a("PAGE_TITLE", "2"), C6502A.a("RESOLVED_DOCUMENT_LINK", "3"), C6502A.a("BUTTON_ID", "4"));
                    f32171f = true;
                } catch (Throwable th2) {
                    C4049a.b(th2, cls);
                }
            } catch (Exception unused) {
            }
        }
    }

    private final boolean e(JSONObject jSONObject) {
        if (C4049a.d(this)) {
            return false;
        }
        try {
            if (((jSONObject.optInt("classtypebitmask") & 1) << 5) > 0) {
                return true;
            }
            return false;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }

    public static final boolean f() {
        Class<a> cls = a.class;
        if (C4049a.d(cls)) {
            return false;
        }
        try {
            return f32171f;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return false;
        }
    }

    private final boolean g(String[] strArr, String[] strArr2) {
        if (C4049a.d(this)) {
            return false;
        }
        try {
            for (String str : strArr) {
                for (String O10 : strArr2) {
                    if (p.O(O10, str, false, 2, (Object) null)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }

    private final float[] h(JSONObject jSONObject, JSONArray jSONArray, String str, String str2, String str3) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        String str4 = str2;
        if (C4049a.d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            int length = jSONArray.length();
            if (length > 1) {
                f10 = ((float) length) - 1.0f;
            } else {
                f10 = 0.0f;
            }
            fArr[3] = f10;
            try {
                int length2 = jSONArray.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i11);
                    C6496s.g(jSONObject2, "siblings.getJSONObject(i)");
                    if (e(jSONObject2)) {
                        fArr[9] = fArr[9] + 1.0f;
                    }
                }
            } catch (JSONException unused) {
            }
            fArr[13] = -1.0f;
            fArr[14] = -1.0f;
            String str5 = str + '|' + str3;
            StringBuilder sb2 = new StringBuilder();
            StringBuilder sb3 = new StringBuilder();
            n(jSONObject, sb3, sb2);
            String sb4 = sb2.toString();
            C6496s.g(sb4, "hintSB.toString()");
            String sb5 = sb3.toString();
            C6496s.g(sb5, "textSB.toString()");
            if (l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_TEXT", sb5)) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            fArr[15] = f11;
            if (l("ENGLISH", "COMPLETE_REGISTRATION", "PAGE_TITLE", str5)) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            fArr[16] = f12;
            if (l("ENGLISH", "COMPLETE_REGISTRATION", "BUTTON_ID", sb4)) {
                f13 = 1.0f;
            } else {
                f13 = 0.0f;
            }
            fArr[17] = f13;
            if (p.O(str4, "password", false, 2, (Object) null)) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            fArr[18] = f14;
            if (k("(?i)(confirm.*password)|(password.*(confirmation|confirm)|confirmation)", str4)) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            fArr[19] = f15;
            if (k("(?i)(sign in)|login|signIn", str4)) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            fArr[20] = f16;
            if (k("(?i)(sign.*(up|now)|registration|register|(create|apply).*(profile|account)|open.*account|account.*(open|creation|application)|enroll|join.*now)", str4)) {
                f17 = 1.0f;
            } else {
                f17 = 0.0f;
            }
            fArr[21] = f17;
            if (l("ENGLISH", "PURCHASE", "BUTTON_TEXT", sb5)) {
                f18 = 1.0f;
            } else {
                f18 = 0.0f;
            }
            fArr[22] = f18;
            if (l("ENGLISH", "PURCHASE", "PAGE_TITLE", str5)) {
                f19 = 1.0f;
            } else {
                f19 = 0.0f;
            }
            fArr[24] = f19;
            if (k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart", sb5)) {
                f20 = 1.0f;
            } else {
                f20 = 0.0f;
            }
            fArr[25] = f20;
            if (k("(?i)add to(\\s|\\Z)|update(\\s|\\Z)|cart|shop|buy", str5)) {
                f21 = 1.0f;
            } else {
                f21 = 0.0f;
            }
            fArr[27] = f21;
            if (l("ENGLISH", "LEAD", "BUTTON_TEXT", sb5)) {
                f22 = 1.0f;
            } else {
                f22 = 0.0f;
            }
            fArr[28] = f22;
            if (l("ENGLISH", "LEAD", "PAGE_TITLE", str5)) {
                f23 = 1.0f;
            } else {
                f23 = 0.0f;
            }
            fArr[29] = f23;
            return fArr;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    private final float[] i(JSONObject jSONObject) {
        if (C4049a.d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            String optString = jSONObject.optString(AttributeType.TEXT);
            C6496s.g(optString, "node.optString(TEXT_KEY)");
            String lowerCase = optString.toLowerCase();
            C6496s.g(lowerCase, "this as java.lang.String).toLowerCase()");
            String optString2 = jSONObject.optString("hint");
            C6496s.g(optString2, "node.optString(HINT_KEY)");
            String lowerCase2 = optString2.toLowerCase();
            C6496s.g(lowerCase2, "this as java.lang.String).toLowerCase()");
            String optString3 = jSONObject.optString("classname");
            C6496s.g(optString3, "node.optString(CLASS_NAME_KEY)");
            String lowerCase3 = optString3.toLowerCase();
            C6496s.g(lowerCase3, "this as java.lang.String).toLowerCase()");
            int optInt = jSONObject.optInt("inputtype", -1);
            String[] strArr = {lowerCase, lowerCase2};
            if (g(new String[]{"$", "amount", b.f37501x, "total"}, strArr)) {
                fArr[0] = fArr[0] + 1.0f;
            }
            if (g(new String[]{"password", "pwd"}, strArr)) {
                fArr[1] = fArr[1] + 1.0f;
            }
            if (g(new String[]{"tel", AttributeType.PHONE}, strArr)) {
                fArr[2] = fArr[2] + 1.0f;
            }
            if (g(new String[]{"search"}, strArr)) {
                fArr[4] = fArr[4] + 1.0f;
            }
            if (optInt >= 0) {
                fArr[5] = fArr[5] + 1.0f;
            }
            if (optInt == 2 || optInt == 3) {
                fArr[6] = fArr[6] + 1.0f;
            }
            if (optInt == 32 || Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                fArr[7] = fArr[7] + 1.0f;
            }
            if (p.O(lowerCase3, "checkbox", false, 2, (Object) null)) {
                fArr[8] = fArr[8] + 1.0f;
            }
            if (g(new String[]{NotificationStatuses.COMPLETE_STATUS, "confirm", "done", "submit"}, new String[]{lowerCase})) {
                fArr[10] = fArr[10] + 1.0f;
            }
            if (p.O(lowerCase3, "radio", false, 2, (Object) null) && p.O(lowerCase3, "button", false, 2, (Object) null)) {
                fArr[12] = fArr[12] + 1.0f;
            }
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                int length = optJSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i11);
                    C6496s.g(jSONObject2, "childViews.getJSONObject(i)");
                    m(fArr, i(jSONObject2));
                }
            } catch (JSONException unused) {
            }
            return fArr;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return null;
        }
    }

    private final boolean j(JSONObject jSONObject, JSONArray jSONArray) {
        boolean z10;
        if (C4049a.d(this)) {
            return false;
        }
        try {
            if (jSONObject.optBoolean("is_interacted")) {
                return true;
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
            int length = optJSONArray.length();
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z10 = false;
                    break;
                } else if (optJSONArray.getJSONObject(i10).optBoolean("is_interacted")) {
                    z10 = true;
                    break;
                } else {
                    i10++;
                }
            }
            boolean z11 = z10;
            JSONArray jSONArray2 = new JSONArray();
            if (z10) {
                int length2 = optJSONArray.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    jSONArray.put(optJSONArray.getJSONObject(i11));
                }
            } else {
                int length3 = optJSONArray.length();
                for (int i12 = 0; i12 < length3; i12++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i12);
                    C6496s.g(jSONObject2, "child");
                    if (j(jSONObject2, jSONArray)) {
                        jSONArray2.put(jSONObject2);
                        z11 = true;
                    }
                }
                jSONObject.put("childviews", jSONArray2);
            }
            return z11;
        } catch (JSONException unused) {
            return false;
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }

    private final boolean k(String str, String str2) {
        if (C4049a.d(this)) {
            return false;
        }
        try {
            return Pattern.compile(str).matcher(str2).find();
        } catch (Throwable th2) {
            C4049a.b(th2, this);
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.Map] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean l(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            boolean r0 = t7.C4049a.d(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            org.json.JSONObject r0 = f32170e     // Catch:{ all -> 0x0014 }
            r2 = 0
            if (r0 != 0) goto L_0x0016
            java.lang.String r0 = "rules"
            kotlin.jvm.internal.C6496s.v(r0)     // Catch:{ all -> 0x0014 }
            r0 = r2
            goto L_0x0016
        L_0x0014:
            r5 = move-exception
            goto L_0x0077
        L_0x0016:
            java.lang.String r3 = "rulesForLanguage"
            org.json.JSONObject r0 = r0.optJSONObject(r3)     // Catch:{ all -> 0x0014 }
            if (r0 == 0) goto L_0x006f
            java.util.Map r3 = f32167b     // Catch:{ all -> 0x0014 }
            if (r3 != 0) goto L_0x0028
            java.lang.String r3 = "languageInfo"
            kotlin.jvm.internal.C6496s.v(r3)     // Catch:{ all -> 0x0014 }
            r3 = r2
        L_0x0028:
            java.lang.Object r5 = r3.get(r5)     // Catch:{ all -> 0x0014 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0014 }
            org.json.JSONObject r5 = r0.optJSONObject(r5)     // Catch:{ all -> 0x0014 }
            if (r5 == 0) goto L_0x006f
            java.lang.String r0 = "rulesForEvent"
            org.json.JSONObject r5 = r5.optJSONObject(r0)     // Catch:{ all -> 0x0014 }
            if (r5 == 0) goto L_0x006f
            java.util.Map r0 = f32168c     // Catch:{ all -> 0x0014 }
            if (r0 != 0) goto L_0x0046
            java.lang.String r0 = "eventInfo"
            kotlin.jvm.internal.C6496s.v(r0)     // Catch:{ all -> 0x0014 }
            r0 = r2
        L_0x0046:
            java.lang.Object r6 = r0.get(r6)     // Catch:{ all -> 0x0014 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0014 }
            org.json.JSONObject r5 = r5.optJSONObject(r6)     // Catch:{ all -> 0x0014 }
            if (r5 == 0) goto L_0x006f
            java.lang.String r6 = "positiveRules"
            org.json.JSONObject r5 = r5.optJSONObject(r6)     // Catch:{ all -> 0x0014 }
            if (r5 == 0) goto L_0x006f
            java.util.Map r6 = f32169d     // Catch:{ all -> 0x0014 }
            if (r6 != 0) goto L_0x0064
            java.lang.String r6 = "textTypeInfo"
            kotlin.jvm.internal.C6496s.v(r6)     // Catch:{ all -> 0x0014 }
            goto L_0x0065
        L_0x0064:
            r2 = r6
        L_0x0065:
            java.lang.Object r6 = r2.get(r7)     // Catch:{ all -> 0x0014 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x0014 }
            java.lang.String r2 = r5.optString(r6)     // Catch:{ all -> 0x0014 }
        L_0x006f:
            if (r2 != 0) goto L_0x0072
            goto L_0x0076
        L_0x0072:
            boolean r1 = r4.k(r2, r8)     // Catch:{ all -> 0x0014 }
        L_0x0076:
            return r1
        L_0x0077:
            t7.C4049a.b(r5, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: J5.a.l(java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    private final void m(float[] fArr, float[] fArr2) {
        if (!C4049a.d(this)) {
            try {
                int length = fArr.length;
                for (int i10 = 0; i10 < length; i10++) {
                    fArr[i10] = fArr[i10] + fArr2[i10];
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    private final void n(JSONObject jSONObject, StringBuilder sb2, StringBuilder sb3) {
        if (!C4049a.d(this)) {
            try {
                String optString = jSONObject.optString(AttributeType.TEXT, "");
                C6496s.g(optString, "view.optString(TEXT_KEY, \"\")");
                String lowerCase = optString.toLowerCase();
                C6496s.g(lowerCase, "this as java.lang.String).toLowerCase()");
                String optString2 = jSONObject.optString("hint", "");
                C6496s.g(optString2, "view.optString(HINT_KEY, \"\")");
                String lowerCase2 = optString2.toLowerCase();
                C6496s.g(lowerCase2, "this as java.lang.String).toLowerCase()");
                if (lowerCase.length() > 0) {
                    sb2.append(lowerCase);
                    sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                }
                if (lowerCase2.length() > 0) {
                    sb3.append(lowerCase2);
                    sb3.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("childviews");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i10 = 0; i10 < length; i10++) {
                        try {
                            JSONObject jSONObject2 = optJSONArray.getJSONObject(i10);
                            C6496s.g(jSONObject2, "currentChildView");
                            n(jSONObject2, sb2, sb3);
                        } catch (JSONException unused) {
                        }
                    }
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }
}
