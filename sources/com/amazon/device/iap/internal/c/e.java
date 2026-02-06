package com.amazon.device.iap.internal.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.amazon.a.a.o.b;
import com.amazon.a.a.o.f;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.PurchasingService;
import com.amazon.device.iap.internal.d;
import com.amazon.device.iap.internal.model.ProductBuilder;
import com.amazon.device.iap.internal.model.ProductDataResponseBuilder;
import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder;
import com.amazon.device.iap.internal.model.ReceiptBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.internal.model.UserDataResponseBuilder;
import com.amazon.device.iap.internal.util.a;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.Promotion;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataRequest;
import com.amazon.device.iap.model.UserDataResponse;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e implements com.amazon.device.iap.internal.e {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f37962a = "e";

    /* renamed from: b  reason: collision with root package name */
    private static final String f37963b = "com.amazon.sdktestclient";

    /* renamed from: c  reason: collision with root package name */
    private static final String f37964c = "com.amazon.sdktestclient.command.CommandBroker";

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: boolean} */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:19|20|21|22|23|41|24|17) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0069 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.amazon.device.iap.model.PurchaseUpdatesResponse b(android.content.Intent r11) {
        /*
            r10 = this;
            com.amazon.device.iap.model.PurchaseUpdatesResponse$RequestStatus r0 = com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.FAILED
            r1 = 0
            r2 = 0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0092 }
            java.lang.String r4 = "purchaseUpdatesOutput"
            java.lang.String r11 = r11.getStringExtra(r4)     // Catch:{ Exception -> 0x0092 }
            r3.<init>(r11)     // Catch:{ Exception -> 0x0092 }
            java.lang.String r11 = "requestId"
            java.lang.String r11 = r3.optString(r11)     // Catch:{ Exception -> 0x0092 }
            com.amazon.device.iap.model.RequestId r11 = com.amazon.device.iap.model.RequestId.fromString(r11)     // Catch:{ Exception -> 0x0092 }
            java.lang.String r4 = "status"
            java.lang.String r4 = r3.optString(r4)     // Catch:{ Exception -> 0x008d }
            com.amazon.device.iap.model.PurchaseUpdatesResponse$RequestStatus r0 = com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.valueOf(r4)     // Catch:{ Exception -> 0x008d }
            java.lang.String r4 = "isMore"
            boolean r4 = r3.optBoolean(r4)     // Catch:{ Exception -> 0x008d }
            java.lang.String r5 = "userId"
            java.lang.String r5 = r3.optString(r5)     // Catch:{ Exception -> 0x0089 }
            java.lang.String r6 = "marketplace"
            java.lang.String r6 = r3.optString(r6)     // Catch:{ Exception -> 0x0089 }
            com.amazon.device.iap.internal.model.UserDataBuilder r7 = new com.amazon.device.iap.internal.model.UserDataBuilder     // Catch:{ Exception -> 0x0089 }
            r7.<init>()     // Catch:{ Exception -> 0x0089 }
            com.amazon.device.iap.internal.model.UserDataBuilder r5 = r7.setUserId(r5)     // Catch:{ Exception -> 0x0089 }
            com.amazon.device.iap.internal.model.UserDataBuilder r5 = r5.setMarketplace(r6)     // Catch:{ Exception -> 0x0089 }
            com.amazon.device.iap.model.UserData r5 = r5.build()     // Catch:{ Exception -> 0x0089 }
            com.amazon.device.iap.model.PurchaseUpdatesResponse$RequestStatus r6 = com.amazon.device.iap.model.PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL     // Catch:{ Exception -> 0x0085 }
            if (r0 != r6) goto L_0x00a0
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x0085 }
            r6.<init>()     // Catch:{ Exception -> 0x0085 }
            java.lang.String r1 = "receipts"
            org.json.JSONArray r1 = r3.optJSONArray(r1)     // Catch:{ Exception -> 0x0082 }
            if (r1 == 0) goto L_0x009f
        L_0x0057:
            int r3 = r1.length()     // Catch:{ Exception -> 0x0082 }
            if (r2 >= r3) goto L_0x009f
            org.json.JSONObject r3 = r1.optJSONObject(r2)     // Catch:{ Exception -> 0x0082 }
            com.amazon.device.iap.model.Receipt r7 = r10.a((org.json.JSONObject) r3)     // Catch:{ Exception -> 0x0069 }
            r6.add(r7)     // Catch:{ Exception -> 0x0069 }
            goto L_0x007f
        L_0x0069:
            java.lang.String r7 = f37962a     // Catch:{ Exception -> 0x0082 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0082 }
            r8.<init>()     // Catch:{ Exception -> 0x0082 }
            java.lang.String r9 = "Failed to parse receipt from json:"
            r8.append(r9)     // Catch:{ Exception -> 0x0082 }
            r8.append(r3)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r3 = r8.toString()     // Catch:{ Exception -> 0x0082 }
            android.util.Log.e(r7, r3)     // Catch:{ Exception -> 0x0082 }
        L_0x007f:
            int r2 = r2 + 1
            goto L_0x0057
        L_0x0082:
            r1 = move-exception
        L_0x0083:
            r2 = r4
            goto L_0x0097
        L_0x0085:
            r2 = move-exception
            r6 = r1
        L_0x0087:
            r1 = r2
            goto L_0x0083
        L_0x0089:
            r2 = move-exception
            r5 = r1
            r6 = r5
            goto L_0x0087
        L_0x008d:
            r3 = move-exception
            r5 = r1
            r6 = r5
            r1 = r3
            goto L_0x0097
        L_0x0092:
            r11 = move-exception
            r5 = r1
            r6 = r5
            r1 = r11
            r11 = r6
        L_0x0097:
            java.lang.String r3 = f37962a
            java.lang.String r4 = "Error parsing purchase updates output"
            android.util.Log.e(r3, r4, r1)
            r4 = r2
        L_0x009f:
            r1 = r6
        L_0x00a0:
            com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder r2 = new com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder
            r2.<init>()
            com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder r11 = r2.setRequestId(r11)
            com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder r11 = r11.setRequestStatus(r0)
            com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder r11 = r11.setUserData(r5)
            com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder r11 = r11.setReceipts(r1)
            com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder r11 = r11.setHasMore(r4)
            com.amazon.device.iap.model.PurchaseUpdatesResponse r11 = r11.build()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.device.iap.internal.c.e.b(android.content.Intent):com.amazon.device.iap.model.PurchaseUpdatesResponse");
    }

    private void c(Intent intent) {
        a((Object) d(intent));
    }

    private ProductDataResponse d(Intent intent) {
        RequestId requestId;
        HashMap hashMap;
        ProductDataResponse.RequestStatus requestStatus;
        LinkedHashSet linkedHashSet;
        Exception e10;
        LinkedHashSet linkedHashSet2;
        ProductDataResponse.RequestStatus requestStatus2 = ProductDataResponse.RequestStatus.FAILED;
        LinkedHashSet linkedHashSet3 = null;
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra("itemDataOutput"));
            requestId = RequestId.fromString(jSONObject.optString(b.f37444B));
            try {
                requestStatus = ProductDataResponse.RequestStatus.valueOf(jSONObject.optString("status"));
                if (requestStatus != requestStatus2) {
                    try {
                        linkedHashSet2 = new LinkedHashSet();
                    } catch (Exception e11) {
                        linkedHashSet = null;
                        hashMap = null;
                        e10 = e11;
                        requestStatus2 = requestStatus;
                        Log.e(f37962a, "Error parsing item data output", e10);
                        requestStatus = requestStatus2;
                        linkedHashSet3 = linkedHashSet;
                        return new ProductDataResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setProductData(hashMap).setUnavailableSkus(linkedHashSet3).build();
                    }
                    try {
                        hashMap = new HashMap();
                    } catch (Exception e12) {
                        hashMap = null;
                        e10 = e12;
                        linkedHashSet = linkedHashSet2;
                        requestStatus2 = requestStatus;
                        Log.e(f37962a, "Error parsing item data output", e10);
                        requestStatus = requestStatus2;
                        linkedHashSet3 = linkedHashSet;
                        return new ProductDataResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setProductData(hashMap).setUnavailableSkus(linkedHashSet3).build();
                    }
                    try {
                        JSONArray optJSONArray = jSONObject.optJSONArray("unavailableSkus");
                        if (optJSONArray != null) {
                            for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                                linkedHashSet2.add(optJSONArray.getString(i10));
                            }
                        }
                        JSONObject optJSONObject = jSONObject.optJSONObject("items");
                        if (optJSONObject != null) {
                            Iterator<String> keys = optJSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                hashMap.put(next, a(next, optJSONObject.optJSONObject(next)));
                            }
                        }
                        linkedHashSet3 = linkedHashSet2;
                    } catch (Exception e13) {
                        e10 = e13;
                        linkedHashSet = linkedHashSet2;
                        requestStatus2 = requestStatus;
                        Log.e(f37962a, "Error parsing item data output", e10);
                        requestStatus = requestStatus2;
                        linkedHashSet3 = linkedHashSet;
                        return new ProductDataResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setProductData(hashMap).setUnavailableSkus(linkedHashSet3).build();
                    }
                } else {
                    hashMap = null;
                }
            } catch (Exception e14) {
                hashMap = null;
                e10 = e14;
                linkedHashSet = null;
                Log.e(f37962a, "Error parsing item data output", e10);
                requestStatus = requestStatus2;
                linkedHashSet3 = linkedHashSet;
                return new ProductDataResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setProductData(hashMap).setUnavailableSkus(linkedHashSet3).build();
            }
        } catch (Exception e15) {
            linkedHashSet = null;
            hashMap = null;
            e10 = e15;
            requestId = null;
            Log.e(f37962a, "Error parsing item data output", e10);
            requestStatus = requestStatus2;
            linkedHashSet3 = linkedHashSet;
            return new ProductDataResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setProductData(hashMap).setUnavailableSkus(linkedHashSet3).build();
        }
        return new ProductDataResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setProductData(hashMap).setUnavailableSkus(linkedHashSet3).build();
    }

    private void e(Intent intent) {
        JSONObject jSONObject;
        UserDataResponse f10 = f(intent);
        RequestId requestId = f10.getRequestId();
        String stringExtra = intent.getStringExtra("userInput");
        try {
            jSONObject = new JSONObject(stringExtra);
        } catch (JSONException e10) {
            String str = f37962a;
            Log.e(str, "Unable to parse request data: " + stringExtra, e10);
            jSONObject = null;
        }
        if (requestId == null || jSONObject == null) {
            a((Object) f10);
        } else if (!jSONObject.optBoolean(b.at, false)) {
            a((Object) f10);
        } else if (f10.getUserData() == null || f.a(f10.getUserData().getUserId())) {
            String str2 = f37962a;
            Log.e(str2, "No Userid found in userDataResponse" + f10);
            a((Object) new PurchaseUpdatesResponseBuilder().setRequestId(requestId).setRequestStatus(PurchaseUpdatesResponse.RequestStatus.FAILED).setUserData(f10.getUserData()).setReceipts(new ArrayList()).setHasMore(false).build());
        } else {
            String str3 = f37962a;
            Log.i(str3, "sendGetPurchaseUpdates with user id" + f10.getUserData().getUserId());
            a(requestId.toString(), f10.getUserData().getUserId(), jSONObject.optBoolean("reset", true));
        }
    }

    private UserDataResponse f(Intent intent) {
        RequestId requestId;
        UserDataResponse.RequestStatus requestStatus = UserDataResponse.RequestStatus.FAILED;
        UserData userData = null;
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra("userOutput"));
            requestId = RequestId.fromString(jSONObject.optString(b.f37444B));
            try {
                requestStatus = UserDataResponse.RequestStatus.valueOf(jSONObject.optString("status"));
                if (requestStatus == UserDataResponse.RequestStatus.SUCCESSFUL) {
                    String optString = jSONObject.optString("userId");
                    userData = new UserDataBuilder().setUserId(optString).setMarketplace(jSONObject.optString(b.f37490m)).setLWAConsentStatus(jSONObject.optString("UserDataResponse.LWAConsentStatus")).build();
                }
            } catch (Exception e10) {
                e = e10;
                Log.e(f37962a, "Error parsing userid output", e);
                return new UserDataResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).build();
            }
        } catch (Exception e11) {
            e = e11;
            requestId = null;
            Log.e(f37962a, "Error parsing userid output", e);
            return new UserDataResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).build();
        }
        return new UserDataResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).build();
    }

    private void g(Intent intent) {
        a((Object) h(intent));
    }

    private PurchaseResponse h(Intent intent) {
        RequestId requestId;
        UserData userData;
        PurchaseResponse.RequestStatus requestStatus = PurchaseResponse.RequestStatus.FAILED;
        Receipt receipt = null;
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra("purchaseOutput"));
            requestId = RequestId.fromString(jSONObject.optString(b.f37444B));
            try {
                userData = new UserDataBuilder().setUserId(jSONObject.optString("userId")).setMarketplace(jSONObject.optString(b.f37490m)).build();
                try {
                    requestStatus = PurchaseResponse.RequestStatus.safeValueOf(jSONObject.optString("purchaseStatus"));
                    JSONObject optJSONObject = jSONObject.optJSONObject(b.f37446D);
                    if (optJSONObject != null) {
                        receipt = a(optJSONObject);
                    }
                } catch (Exception e10) {
                    e = e10;
                    Log.e(f37962a, "Error parsing purchase output", e);
                    return new PurchaseResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).setReceipt(receipt).build();
                }
            } catch (Exception e11) {
                e = e11;
                userData = null;
                Log.e(f37962a, "Error parsing purchase output", e);
                return new PurchaseResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).setReceipt(receipt).build();
            }
        } catch (Exception e12) {
            e = e12;
            requestId = null;
            userData = null;
            Log.e(f37962a, "Error parsing purchase output", e);
            return new PurchaseResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).setReceipt(receipt).build();
        }
        return new PurchaseResponseBuilder().setRequestId(requestId).setRequestStatus(requestStatus).setUserData(userData).setReceipt(receipt).build();
    }

    public void a(RequestId requestId, UserDataRequest userDataRequest) {
        com.amazon.device.iap.internal.util.b.a(f37962a, "sendGetUserDataRequest");
        a(requestId.toString(), false, false, userDataRequest);
    }

    private void a(String str, boolean z10, boolean z11, UserDataRequest userDataRequest) {
        try {
            Context b10 = d.f().b();
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(b.f37444B, str);
            jSONObject.put("packageName", b10.getPackageName());
            jSONObject.put(b.f37451I, PurchasingService.SDK_VERSION);
            jSONObject.put(b.at, z10);
            jSONObject.put("reset", z11);
            if (userDataRequest != null) {
                jSONObject.put("UserDataRequest.fetchLWAConsentStatus", userDataRequest.getFetchLWAConsentStatus());
            }
            bundle.putString("userInput", jSONObject.toString());
            Intent a10 = a("com.amazon.testclient.iap.appUserId");
            a10.addFlags(268435456);
            a10.putExtras(bundle);
            b10.startService(a10);
        } catch (JSONException unused) {
            com.amazon.device.iap.internal.util.b.b(f37962a, "Error in sendGetUserDataRequest.");
        }
    }

    public void a(RequestId requestId, String str) {
        com.amazon.device.iap.internal.util.b.a(f37962a, "sendPurchaseRequest");
        try {
            Context b10 = d.f().b();
            boolean d10 = d.f().d();
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sku", str);
            jSONObject.put(b.f37472ac, d10);
            jSONObject.put(b.f37444B, requestId.toString());
            jSONObject.put("packageName", b10.getPackageName());
            jSONObject.put(b.f37451I, PurchasingService.SDK_VERSION);
            bundle.putString("purchaseInput", jSONObject.toString());
            Intent a10 = a("com.amazon.testclient.iap.purchase");
            a10.addFlags(268435456);
            a10.putExtras(bundle);
            b10.startService(a10);
        } catch (JSONException unused) {
            com.amazon.device.iap.internal.util.b.b(f37962a, "Error in sendPurchaseRequest.");
        }
    }

    public void a(RequestId requestId, Set<String> set) {
        com.amazon.device.iap.internal.util.b.a(f37962a, "sendItemDataRequest");
        try {
            Context b10 = d.f().b();
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray(set);
            jSONObject.put(b.f37444B, requestId.toString());
            jSONObject.put("packageName", b10.getPackageName());
            jSONObject.put(b.f37457O, jSONArray);
            jSONObject.put(b.f37451I, PurchasingService.SDK_VERSION);
            bundle.putString("itemDataInput", jSONObject.toString());
            Intent a10 = a("com.amazon.testclient.iap.itemData");
            a10.addFlags(268435456);
            a10.putExtras(bundle);
            b10.startService(a10);
        } catch (JSONException unused) {
            com.amazon.device.iap.internal.util.b.b(f37962a, "Error in sendItemDataRequest.");
        }
    }

    public void a(RequestId requestId, boolean z10) {
        if (requestId == null) {
            requestId = new RequestId();
        }
        String str = f37962a;
        com.amazon.device.iap.internal.util.b.a(str, "sendPurchaseUpdatesRequest/sendGetUserData first:" + requestId);
        a(requestId.toString(), true, z10, (UserDataRequest) null);
    }

    public void a(RequestId requestId, String str, FulfillmentResult fulfillmentResult) {
        com.amazon.device.iap.internal.util.b.a(f37962a, "sendNotifyPurchaseFulfilled");
        try {
            Context b10 = d.f().b();
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(b.f37444B, requestId.toString());
            jSONObject.put("packageName", b10.getPackageName());
            jSONObject.put(b.f37447E, str);
            jSONObject.put("fulfillmentResult", fulfillmentResult);
            jSONObject.put(b.f37451I, PurchasingService.SDK_VERSION);
            bundle.putString("purchaseFulfilledInput", jSONObject.toString());
            Intent a10 = a("com.amazon.testclient.iap.purchaseFulfilled");
            a10.addFlags(268435456);
            a10.putExtras(bundle);
            b10.startService(a10);
        } catch (JSONException unused) {
            com.amazon.device.iap.internal.util.b.b(f37962a, "Error in sendNotifyPurchaseFulfilled.");
        }
    }

    public void a(Context context, Intent intent) {
        com.amazon.device.iap.internal.util.b.a(f37962a, "handleResponse");
        intent.setComponent(new ComponentName(f37963b, f37964c));
        try {
            String string = intent.getExtras().getString("responseType");
            if (string.equalsIgnoreCase("com.amazon.testclient.iap.purchase")) {
                g(intent);
            } else if (string.equalsIgnoreCase("com.amazon.testclient.iap.appUserId")) {
                e(intent);
            } else if (string.equalsIgnoreCase("com.amazon.testclient.iap.itemData")) {
                c(intent);
            } else if (string.equalsIgnoreCase("com.amazon.testclient.iap.purchaseUpdates")) {
                a(intent);
            }
        } catch (Exception e10) {
            Log.e(f37962a, "Error handling response.", e10);
        }
    }

    private Intent a(String str) {
        Intent intent = new Intent(str);
        intent.setComponent(new ComponentName(f37963b, f37964c));
        return intent;
    }

    /* access modifiers changed from: protected */
    public void a(final Object obj) {
        f.a(obj, "response");
        Context b10 = d.f().b();
        final PurchasingListener a10 = d.f().a();
        if (b10 == null || a10 == null) {
            String str = f37962a;
            com.amazon.device.iap.internal.util.b.a(str, "PurchasingListener is not set. Dropping response: " + obj);
            return;
        }
        new Handler(b10.getMainLooper()).post(new Runnable() {
            public void run() {
                try {
                    Object obj = obj;
                    if (obj instanceof ProductDataResponse) {
                        a10.onProductDataResponse((ProductDataResponse) obj);
                    } else if (obj instanceof UserDataResponse) {
                        a10.onUserDataResponse((UserDataResponse) obj);
                    } else if (obj instanceof PurchaseUpdatesResponse) {
                        a10.onPurchaseUpdatesResponse((PurchaseUpdatesResponse) obj);
                    } else if (obj instanceof PurchaseResponse) {
                        a10.onPurchaseResponse((PurchaseResponse) obj);
                    } else {
                        String a10 = e.f37962a;
                        com.amazon.device.iap.internal.util.b.b(a10, "Unknown response type:" + obj.getClass().getName());
                    }
                } catch (Exception e10) {
                    String a11 = e.f37962a;
                    com.amazon.device.iap.internal.util.b.b(a11, "Error in sendResponse: " + e10);
                }
            }
        });
    }

    private void a(Intent intent) {
        PurchaseUpdatesResponse b10 = b(intent);
        if (b10.getRequestStatus() == PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL) {
            String optString = new JSONObject(intent.getStringExtra("purchaseUpdatesOutput")).optString(b.as);
            String str = f37962a;
            Log.i(str, "Offset for PurchaseUpdatesResponse:" + optString);
            a.a(b10.getUserData().getUserId(), optString);
        }
        a((Object) b10);
    }

    private Product a(String str, JSONObject jSONObject) {
        String str2;
        ProductType valueOf = ProductType.valueOf(jSONObject.optString(b.f37488k));
        JSONObject optJSONObject = jSONObject.optJSONObject(b.f37502y);
        List<Promotion> list = null;
        if (optJSONObject == null || optJSONObject == JSONObject.NULL) {
            str2 = null;
        } else {
            Currency instance = Currency.getInstance(optJSONObject.optString(b.f37469a));
            str2 = instance.getSymbol() + optJSONObject.optString("value");
        }
        String optString = jSONObject.optString(b.f37461S);
        String optString2 = jSONObject.optString(b.f37480c);
        String optString3 = jSONObject.optString("smallIconUrl");
        int optInt = jSONObject.optInt(b.f37462T, 0);
        String string = jSONObject.isNull("term") ? null : jSONObject.getString("term");
        String string2 = jSONObject.isNull(b.f37493p) ? null : jSONObject.getString(b.f37493p);
        if (!jSONObject.isNull(b.f37494q)) {
            list = a.a(jSONObject);
        }
        return new ProductBuilder().setSku(str).setProductType(valueOf).setDescription(optString2).setPrice(str2).setSmallIconUrl(optString3).setTitle(optString).setCoinsRewardAmount(optInt).setSubscriptionPeriod(string).setFreeTrialPeriod(string2).setPromotions(list).build();
    }

    private void a(String str, String str2, boolean z10) {
        try {
            Context b10 = d.f().b();
            String a10 = a.a(str2);
            String str3 = f37962a;
            Log.i(str3, "send PurchaseUpdates with user id:" + str2 + ";reset flag:" + z10 + ", local cursor:" + a10 + ", parsed from old requestId:" + str);
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(b.f37444B, str.toString());
            if (z10) {
                a10 = null;
            }
            jSONObject.put(b.as, a10);
            jSONObject.put(b.f37451I, PurchasingService.SDK_VERSION);
            jSONObject.put("packageName", b10.getPackageName());
            bundle.putString("purchaseUpdatesInput", jSONObject.toString());
            Intent a11 = a("com.amazon.testclient.iap.purchaseUpdates");
            a11.addFlags(268435456);
            a11.putExtras(bundle);
            b10.startService(a11);
        } catch (JSONException unused) {
            com.amazon.device.iap.internal.util.b.b(f37962a, "Error in sendPurchaseUpdatesRequest.");
        }
    }

    private Receipt a(JSONObject jSONObject) {
        String optString = jSONObject.optString(b.f37447E);
        String optString2 = jSONObject.optString("sku");
        ProductType valueOf = ProductType.valueOf(jSONObject.optString(b.f37488k));
        String optString3 = jSONObject.optString(b.f37459Q);
        DateFormat dateFormat = b.ar;
        Date parse = dateFormat.parse(optString3);
        String optString4 = jSONObject.optString(b.f37482e);
        Date parse2 = (optString4 == null || optString4.length() == 0) ? null : dateFormat.parse(optString4);
        String optString5 = jSONObject.optString(b.f37460R);
        return new ReceiptBuilder().setReceiptId(optString).setSku(optString2).setProductType(valueOf).setPurchaseDate(parse).setCancelDate(parse2).setDeferredSku(jSONObject.optString(b.f37455M, (String) null)).setDeferredDate((optString5 == null || optString5.length() == 0) ? null : dateFormat.parse(optString5)).setTermSku(jSONObject.optString(b.f37454L, (String) null)).build();
    }
}
