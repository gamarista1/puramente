package com.amazon.device.iap.internal.util;

import com.amazon.a.a;
import com.amazon.a.a.o.b;
import com.amazon.a.a.o.f;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.a.e;
import com.amazon.device.iap.internal.model.ReceiptBuilder;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.Receipt;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f37979a = "c";

    /* renamed from: com.amazon.device.iap.internal.util.c$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f37980a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.amazon.device.iap.internal.util.d[] r0 = com.amazon.device.iap.internal.util.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f37980a = r0
                com.amazon.device.iap.internal.util.d r1 = com.amazon.device.iap.internal.util.d.V1     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f37980a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.amazon.device.iap.internal.util.d r1 = com.amazon.device.iap.internal.util.d.LEGACY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f37980a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.amazon.device.iap.internal.util.d r1 = com.amazon.device.iap.internal.util.d.V2     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f37980a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.amazon.device.iap.internal.util.d r1 = com.amazon.device.iap.internal.util.d.V3     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.iap.internal.util.c.AnonymousClass1.<clinit>():void");
        }
    }

    public static Receipt a(JSONObject jSONObject, String str, String str2) {
        int i10 = AnonymousClass1.f37980a[b(jSONObject).ordinal()];
        if (i10 == 1) {
            return c(jSONObject, str, str2);
        }
        if (i10 == 2) {
            return b(jSONObject, str, str2);
        }
        if (i10 != 3) {
            return e(jSONObject, str, str2);
        }
        return d(jSONObject, str, str2);
    }

    private static Receipt b(JSONObject jSONObject, String str, String str2) {
        String optString = jSONObject.optString("signature");
        if (!f.a(optString)) {
            try {
                Receipt a10 = a(jSONObject);
                String str3 = str + "-" + a10.getReceiptId();
                boolean a11 = a.a(str3, optString);
                b.a(f37979a, "stringToVerify/legacy:\n" + str3 + "\nsignature:\n" + optString);
                if (a11) {
                    return a10;
                }
                MetricsHelper.submitReceiptVerificationFailureMetrics(str2, str3, optString);
                throw new com.amazon.device.iap.internal.a.f(str2, str3, optString);
            } catch (JSONException e10) {
                throw new e(str2, jSONObject.toString(), e10);
            }
        } else {
            b.b(f37979a, "a signature was not found in the receipt for request ID " + str2);
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, "NO Signature found", optString);
            throw new com.amazon.device.iap.internal.a.f(str2, (String) null, optString);
        }
    }

    private static Receipt c(JSONObject jSONObject, String str, String str2) {
        Date date;
        Date date2;
        String optString = jSONObject.optString(b.f37468Z);
        String optString2 = jSONObject.optString("signature");
        if (!f.a(optString2)) {
            try {
                Receipt a10 = a(jSONObject);
                ProductType productType = a10.getProductType();
                String sku = a10.getSku();
                String receiptId = a10.getReceiptId();
                ProductType productType2 = ProductType.SUBSCRIPTION;
                if (productType2 == a10.getProductType()) {
                    date = a10.getPurchaseDate();
                } else {
                    date = null;
                }
                if (productType2 == a10.getProductType()) {
                    date2 = a10.getCancelDate();
                } else {
                    date2 = null;
                }
                String format = String.format("%s|%s|%s|%s|%s|%s|%s|%tQ|%tQ", new Object[]{PurchasingService.SDK_VERSION, str, optString, productType, sku, receiptId, str2, date, date2});
                b.a(f37979a, "stringToVerify/v1:\n" + format + "\nsignature:\n" + optString2);
                if (a.a(format, optString2)) {
                    return a10;
                }
                MetricsHelper.submitReceiptVerificationFailureMetrics(str2, format, optString2);
                throw new com.amazon.device.iap.internal.a.f(str2, format, optString2);
            } catch (JSONException e10) {
                throw new e(str2, jSONObject.toString(), e10);
            }
        } else {
            b.b(f37979a, "a signature was not found in the receipt for request ID " + str2);
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, "NO Signature found", optString2);
            throw new com.amazon.device.iap.internal.a.f(str2, (String) null, optString2);
        }
    }

    private static Receipt d(JSONObject jSONObject, String str, String str2) {
        Date date;
        String optString = jSONObject.optString(b.f37468Z);
        String optString2 = jSONObject.optString("signature");
        Date date2 = null;
        if (!f.a(optString2)) {
            try {
                String string = jSONObject.getString(b.f37447E);
                String string2 = jSONObject.getString("sku");
                ProductType valueOf = ProductType.valueOf(jSONObject.getString(b.f37488k).toUpperCase());
                String optString3 = jSONObject.optString(b.f37459Q);
                if (a(optString3)) {
                    date = null;
                } else {
                    date = b(optString3);
                }
                String optString4 = jSONObject.optString(b.f37482e);
                if (!a(optString4)) {
                    date2 = b(optString4);
                }
                Receipt build = new ReceiptBuilder().setReceiptId(string).setSku(string2).setProductType(valueOf).setPurchaseDate(date).setCancelDate(date2).build();
                String format = String.format("%s|%s|%s|%s|%s|%tQ|%tQ", new Object[]{str, optString, build.getProductType(), build.getSku(), build.getReceiptId(), build.getPurchaseDate(), build.getCancelDate()});
                b.a(f37979a, "stringToVerify/v2:\n" + format + "\nsignature:\n" + optString2);
                if (a.a(format, optString2)) {
                    return build;
                }
                MetricsHelper.submitReceiptVerificationFailureMetrics(str2, format, optString2);
                throw new com.amazon.device.iap.internal.a.f(str2, format, optString2);
            } catch (JSONException e10) {
                throw new e(str2, jSONObject.toString(), e10);
            }
        } else {
            b.b(f37979a, "a signature was not found in the receipt for request ID " + str2);
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, "NO Signature found", optString2);
            throw new com.amazon.device.iap.internal.a.f(str2, (String) null, optString2);
        }
    }

    private static Receipt e(JSONObject jSONObject, String str, String str2) {
        Date date;
        Date date2;
        String optString = jSONObject.optString(b.f37468Z);
        String optString2 = jSONObject.optString("signature");
        Date date3 = null;
        if (!f.a(optString2)) {
            try {
                String string = jSONObject.getString(b.f37447E);
                String string2 = jSONObject.getString("sku");
                String optString3 = jSONObject.optString(b.f37454L, (String) null);
                String optString4 = jSONObject.optString(b.f37455M, (String) null);
                ProductType valueOf = ProductType.valueOf(jSONObject.getString(b.f37488k).toUpperCase());
                String optString5 = jSONObject.optString(b.f37459Q);
                if (a(optString5)) {
                    date = null;
                } else {
                    date = b(optString5);
                }
                String optString6 = jSONObject.optString(b.f37482e);
                if (a(optString6)) {
                    date2 = null;
                } else {
                    date2 = b(optString6);
                }
                String optString7 = jSONObject.optString(b.f37460R);
                if (!a(optString7)) {
                    date3 = b(optString7);
                }
                Receipt build = new ReceiptBuilder().setReceiptId(string).setSku(string2).setProductType(valueOf).setPurchaseDate(date).setCancelDate(date2).setDeferredDate(date3).setDeferredSku(optString4).setTermSku(optString3).build();
                String format = String.format("%s|%s|%s|%s|%s|%s|%s|%tQ|%tQ|%tQ", new Object[]{str, optString, build.getProductType(), build.getSku(), build.getReceiptId(), build.getDeferredSku(), build.getTermSku(), build.getPurchaseDate(), build.getCancelDate(), build.getDeferredDate()});
                b.a(f37979a, "stringToVerify/v3:\n" + format + "\nsignature:\n" + optString2);
                if (a.a(format, optString2)) {
                    return build;
                }
                MetricsHelper.submitReceiptVerificationFailureMetrics(str2, format, optString2);
                throw new com.amazon.device.iap.internal.a.f(str2, format, optString2);
            } catch (JSONException e10) {
                throw new e(str2, jSONObject.toString(), e10);
            }
        } else {
            b.b(f37979a, "a signature was not found in the receipt for request ID " + str2);
            MetricsHelper.submitReceiptVerificationFailureMetrics(str2, "NO Signature found", optString2);
            throw new com.amazon.device.iap.internal.a.f(str2, (String) null, optString2);
        }
    }

    private static Receipt a(JSONObject jSONObject) {
        String optString = jSONObject.optString("token");
        String string = jSONObject.getString("sku");
        ProductType valueOf = ProductType.valueOf(jSONObject.getString(b.f37488k).toUpperCase());
        String optString2 = jSONObject.optString(b.f37458P);
        Date date = null;
        Date b10 = a(optString2) ? null : b(optString2);
        String optString3 = jSONObject.optString(b.f37481d);
        if (!a(optString3)) {
            date = b(optString3);
        }
        return new ReceiptBuilder().setReceiptId(optString).setSku(string).setProductType(valueOf).setPurchaseDate(b10).setCancelDate(date).build();
    }

    protected static Date b(String str) {
        try {
            Date parse = new SimpleDateFormat(b.aj).parse(str);
            if (0 == parse.getTime()) {
                return null;
            }
            return parse;
        } catch (ParseException e10) {
            throw new JSONException(e10.getMessage());
        }
    }

    private static d b(JSONObject jSONObject) {
        String optString = jSONObject.optString(b.f37468Z);
        String optString2 = jSONObject.optString(b.f37447E);
        String optString3 = jSONObject.optString(b.f37456N);
        if (!f.a(optString3)) {
            d dVar = d.V3;
            if (optString3.equals(dVar.name())) {
                return dVar;
            }
        }
        if (!f.a(optString2)) {
            return d.V2;
        }
        if (f.a(optString)) {
            return d.LEGACY;
        }
        return d.V1;
    }

    protected static boolean a(String str) {
        return str == null || str.trim().length() == 0;
    }

    protected static JSONObject a(Receipt receipt, String str) {
        JSONObject jSONObject = new JSONObject();
        if (receipt != null && !f.a(str)) {
            try {
                jSONObject.put(b.f37447E, receipt.getReceiptId());
                jSONObject.put("sku", receipt.getSku());
                jSONObject.put(b.f37488k, receipt.getProductType());
                jSONObject.put(b.f37459Q, receipt.getPurchaseDate());
                jSONObject.put(b.f37481d, receipt.getCancelDate());
                jSONObject.put("signature", str);
            } catch (JSONException unused) {
                String str2 = f37979a;
                b.b(str2, "Failure during toJsonInternal: " + receipt + ", signature:" + str);
            }
        }
        return jSONObject;
    }

    public static String b(Receipt receipt, String str) {
        try {
            return a(receipt, str).toString(4);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static List<Receipt> a(String str, String str2, String str3) {
        if (str2 == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str2);
        int i10 = 0;
        while (i10 < jSONArray.length()) {
            try {
                arrayList.add(a(jSONArray.getJSONObject(i10), str, str3));
                i10++;
            } catch (e e10) {
                String str4 = f37979a;
                b.b(str4, "fail to parse receipt, requestId:" + e10.a());
                throw e10;
            } catch (com.amazon.device.iap.internal.a.f e11) {
                String str5 = f37979a;
                b.b(str5, "fail to verify receipt, requestId:" + e11.a());
                throw e11;
            } catch (Throwable th2) {
                String str6 = f37979a;
                b.b(str6, "fail to verify receipt, requestId:" + th2.getMessage());
                throw th2;
            }
        }
        return arrayList;
    }
}
