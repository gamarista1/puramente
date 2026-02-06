package Fe;

import android.content.Context;
import com.adjust.sdk.Constants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: Fe.b  reason: case insensitive filesystem */
class C3013b {
    C3013b() {
    }

    private int a(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 3] << 24) & -16777216) | ((bArr[i10 + 2] << 16) & 16711680) | ((bArr[i10 + 1] << 8) & 65280);
    }

    private String b(byte[] bArr, int i10, int i11, int i12) {
        if (i12 < 0) {
            return null;
        }
        return c(bArr, i11 + a(bArr, i10 + (i12 * 4)));
    }

    private String c(byte[] bArr, int i10) {
        int i11 = ((bArr[i10 + 1] << 8) & 65280) | (bArr[i10] & 255);
        byte[] bArr2 = new byte[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            bArr2[i12] = bArr[i10 + 2 + (i12 * 2)];
        }
        return new String(bArr2);
    }

    private boolean e(String str) {
        if (str == null || "http".equals(str) || str.equals(Constants.SCHEME) || str.equals("geo") || str.equals("*") || str.equals("package") || str.equals("sms") || str.equals("smsto") || str.equals("mms") || str.equals("mmsto") || str.equals("tel") || str.equals("voicemail") || str.equals("file") || str.equals("content") || str.equals("mailto")) {
            return false;
        }
        return true;
    }

    public JSONObject d(byte[] bArr, Context context) {
        int i10;
        int i11;
        JSONObject jSONObject;
        JSONObject jSONObject2;
        int i12;
        int i13;
        String str;
        String str2;
        String str3;
        byte[] bArr2 = bArr;
        Context context2 = context;
        JSONObject jSONObject3 = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject4 = new JSONObject();
        int i14 = 36;
        int a10 = (a(bArr2, 16) * 4) + 36;
        int a11 = a(bArr2, 12);
        int i15 = a11;
        while (true) {
            i10 = 1048834;
            if (i15 >= bArr2.length - 4) {
                break;
            } else if (a(bArr2, i15) == 1048834) {
                a11 = i15;
                break;
            } else {
                i15 += 4;
            }
        }
        String str4 = "";
        while (true) {
            try {
                if (i11 >= bArr2.length) {
                    jSONObject2 = jSONObject4;
                    break;
                }
                try {
                    int a12 = a(bArr2, i11);
                    if (a12 != i10) {
                        jSONObject2 = jSONObject4;
                        i12 = i14;
                        if (a12 != 1048835) {
                            break;
                        }
                        i11 += 24;
                    } else {
                        int a13 = a(bArr2, i11 + 28);
                        i11 += 36;
                        int i16 = 0;
                        while (i16 < a13) {
                            int a14 = a(bArr2, i11 + 4);
                            int a15 = a(bArr2, i11 + 8);
                            int a16 = a(bArr2, i11 + 16);
                            int i17 = i11 + 20;
                            String b10 = b(bArr2, i14, a10, a14);
                            int i18 = i17;
                            int i19 = a13;
                            jSONObject2 = jSONObject4;
                            if ("scheme".equals(b10)) {
                                if (a15 != -1) {
                                    try {
                                        str3 = b(bArr2, 36, a10, a15);
                                    } catch (JSONException e10) {
                                        e = e10;
                                        jSONObject = jSONObject2;
                                        C3023l.m("Caught JSONException " + e.getMessage());
                                        return jSONObject;
                                    }
                                } else {
                                    str3 = C3031u.b(context2, a16);
                                }
                                if (e(str3)) {
                                    if (!jSONObject3.has(str3)) {
                                        jSONObject3.put(str3, new JSONArray());
                                    } else if (jSONObject3.has("0")) {
                                        jSONObject3.put(str3, (JSONArray) jSONObject3.get("0"));
                                        jSONObject3.remove("0");
                                    }
                                    str4 = str3;
                                }
                                if (!"http".equals(str3)) {
                                    if (Constants.SCHEME.equals(str3)) {
                                    }
                                }
                                str4 = str3;
                            } else if ("host".equals(b10)) {
                                if (a15 != -1) {
                                    str2 = b(bArr2, 36, a10, a15);
                                } else {
                                    str2 = C3031u.b(context2, a16);
                                }
                                if (!jSONObject3.has(str4) || str4 == null || Constants.SCHEME.equals(str4) || "http".equals(str4)) {
                                    if (!Constants.SCHEME.equals(str4)) {
                                        if (!"http".equals(str4)) {
                                            JSONArray jSONArray2 = new JSONArray();
                                            jSONArray2.put(str2);
                                            jSONObject3.put("0", jSONArray2);
                                        }
                                    }
                                    jSONArray.put(str2);
                                } else {
                                    JSONArray jSONArray3 = jSONObject3.getJSONArray(str4);
                                    jSONArray3.put(str2);
                                    jSONObject3.put(str4, jSONArray3);
                                }
                            } else if ("name".equals(b10)) {
                                if (a15 != -1) {
                                    i13 = 36;
                                    str = b(bArr2, 36, a10, a15);
                                } else {
                                    i13 = 36;
                                    str = C3031u.b(context2, a16);
                                }
                                if ("android.intent.action.VIEW".equals(str)) {
                                    str4 = null;
                                }
                                i16++;
                                i14 = i13;
                                i11 = i18;
                                a13 = i19;
                                jSONObject4 = jSONObject2;
                            }
                            i13 = 36;
                            i16++;
                            i14 = i13;
                            i11 = i18;
                            a13 = i19;
                            jSONObject4 = jSONObject2;
                        }
                        jSONObject2 = jSONObject4;
                        i12 = i14;
                    }
                    i14 = i12;
                    jSONObject4 = jSONObject2;
                    i10 = 1048834;
                } catch (JSONException e11) {
                    e = e11;
                    jSONObject2 = jSONObject4;
                    jSONObject = jSONObject2;
                    C3023l.m("Caught JSONException " + e.getMessage());
                    return jSONObject;
                }
            } catch (JSONException e12) {
                e = e12;
                jSONObject = jSONObject4;
                C3023l.m("Caught JSONException " + e.getMessage());
                return jSONObject;
            }
        }
        jSONObject3.remove("0");
        jSONObject = jSONObject2;
        try {
            jSONObject.put(y.URIScheme.b(), jSONObject3);
            jSONObject.put(y.AppLinks.b(), jSONArray);
        } catch (JSONException e13) {
            e = e13;
        }
        return jSONObject;
    }
}
