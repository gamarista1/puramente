package com.amazon.device.simplesignin.a.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.amazon.device.simplesignin.ISimpleSignInResponseHandler;
import com.amazon.device.simplesignin.SimpleSignInService;
import com.amazon.device.simplesignin.a.a.a;
import com.amazon.device.simplesignin.a.c;
import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import com.amazon.device.simplesignin.model.request.SSIEventRequest;
import com.amazon.device.simplesignin.model.response.GetUserAndLinksResponse;
import com.amazon.device.simplesignin.model.response.LinkUserAccountResponse;
import com.amazon.device.simplesignin.model.response.RecordMetricsEventResponse;
import com.amazon.device.simplesignin.model.response.ShowLoginSelectionResponse;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class b implements com.amazon.device.simplesignin.a.b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f38085a = "b";

    /* renamed from: b  reason: collision with root package name */
    private static final String f38086b = "com.amazon.sdktestclient";

    /* renamed from: c  reason: collision with root package name */
    private static final String f38087c = "com.amazon.sdktestclient.command.CommandBroker";

    private RecordMetricsEventResponse b(Intent intent) {
        RecordMetricsEventResponse recordMetricsEventResponse = new RecordMetricsEventResponse();
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra("recordMetricsEventOutput"));
            recordMetricsEventResponse.setRequestId(new RequestId(jSONObject.getString(com.amazon.a.a.o.b.f37444B)));
            RequestStatus valueOf = RequestStatus.valueOf(jSONObject.getString("status"));
            recordMetricsEventResponse.setRequestStatus(valueOf);
            RequestStatus.SUCCESSFUL.equals(valueOf);
            return recordMetricsEventResponse;
        } catch (JSONException e10) {
            Log.e(f38085a, "Exception while parsing RecordMetricsEvent response", e10);
            return recordMetricsEventResponse;
        }
    }

    private LinkUserAccountResponse c(Intent intent) {
        LinkUserAccountResponse linkUserAccountResponse = new LinkUserAccountResponse();
        try {
            String stringExtra = intent.getStringExtra("linkUserAccountOutput");
            String str = f38085a;
            Log.i(str, "SimpleSignInService : linkUserAccountOutput " + stringExtra);
            JSONObject jSONObject = new JSONObject(stringExtra);
            linkUserAccountResponse.setRequestId(new RequestId(jSONObject.getString(com.amazon.a.a.o.b.f37444B)));
            RequestStatus valueOf = RequestStatus.valueOf(jSONObject.getString("status"));
            linkUserAccountResponse.setRequestStatus(valueOf);
            if (!RequestStatus.SUCCESSFUL.equals(valueOf)) {
                return linkUserAccountResponse;
            }
            String string = jSONObject.getString(a.f38014m);
            if (!LinkUserAccountResponse.SuccessCode.ConsentDenied.equals(LinkUserAccountResponse.SuccessCode.valueOf(string))) {
                linkUserAccountResponse.setLinkId(jSONObject.getString(a.f38012k));
            }
            linkUserAccountResponse.setSuccessCode(LinkUserAccountResponse.SuccessCode.valueOf(string));
            return linkUserAccountResponse;
        } catch (JSONException e10) {
            Log.e(f38085a, "Exception while parsing LinkUserAccount response", e10);
        }
    }

    private ShowLoginSelectionResponse d(Intent intent) {
        ShowLoginSelectionResponse showLoginSelectionResponse = new ShowLoginSelectionResponse();
        try {
            String stringExtra = intent.getStringExtra("showLoginSelectionOutput");
            String str = f38085a;
            Log.i(str, "SimpleSignInService : loginSelectionOutput " + stringExtra);
            JSONObject jSONObject = new JSONObject(stringExtra);
            showLoginSelectionResponse.setRequestId(new RequestId(jSONObject.getString(com.amazon.a.a.o.b.f37444B)));
            RequestStatus valueOf = RequestStatus.valueOf(jSONObject.getString("status"));
            showLoginSelectionResponse.setRequestStatus(valueOf);
            if (!RequestStatus.SUCCESSFUL.equals(valueOf)) {
                return showLoginSelectionResponse;
            }
            String string = jSONObject.getString(a.f38018q);
            ShowLoginSelectionResponse.UserSelection userSelection = ShowLoginSelectionResponse.UserSelection.LoginSelected;
            if (!userSelection.name().equals(string)) {
                showLoginSelectionResponse.setUserSelection(ShowLoginSelectionResponse.UserSelection.ManualSignIn);
                return showLoginSelectionResponse;
            }
            String string2 = jSONObject.getString(a.f38019r);
            if (string2 != null) {
                showLoginSelectionResponse.setUserSelection(userSelection);
                showLoginSelectionResponse.setLinkId(string2);
            }
            return showLoginSelectionResponse;
        } catch (JSONException e10) {
            Log.e(f38085a, "Exception while parsing LinkUserAccount response", e10);
            showLoginSelectionResponse.setUserSelection(ShowLoginSelectionResponse.UserSelection.ManualSignIn);
        }
    }

    public void a(RequestId requestId, String str) {
        Log.i(f38085a, "Handling getUserAndLinks sandbox request.");
        Context c10 = c.a().c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.amazon.a.a.o.b.f37444B, requestId);
            jSONObject.put("packageName", c10.getPackageName());
            jSONObject.put(com.amazon.a.a.o.b.f37451I, SimpleSignInService.SDK_VERSION);
            jSONObject.put(a.f38002a, str);
            Bundle bundle = new Bundle();
            bundle.putString("getUserAndLinksInput", jSONObject.toString());
            Intent a10 = a("com.amazon.testclient.simplesignin.getUserAndLinks");
            a10.addFlags(268435456);
            a10.putExtras(bundle);
            c10.startService(a10);
        } catch (JSONException unused) {
            Log.e(f38085a, "Error in preparing getUserAndLinksInput.");
        }
    }

    public void a(RequestId requestId, LinkUserAccountRequest linkUserAccountRequest) {
        Log.i(f38085a, "Handling linkUserAccount sandbox request.");
        Context c10 = c.a().c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.amazon.a.a.o.b.f37444B, requestId);
            jSONObject.put("packageName", c10.getPackageName());
            jSONObject.put(com.amazon.a.a.o.b.f37451I, SimpleSignInService.SDK_VERSION);
            jSONObject.put(a.f38005d, linkUserAccountRequest.getPartnerUserId());
            jSONObject.put(a.f38002a, linkUserAccountRequest.getIdentityProviderName());
            jSONObject.put(a.f38006e, linkUserAccountRequest.getUserLoginName());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("token", linkUserAccountRequest.getLinkToken().getToken());
            jSONObject2.put(a.f37994E, linkUserAccountRequest.getLinkToken().getSchema());
            jSONObject.put(a.f38008g, jSONObject2.toString());
            jSONObject.put(a.f38007f, linkUserAccountRequest.getLinkSigningKey());
            Bundle bundle = new Bundle();
            bundle.putString("linkUserAccountInput", jSONObject.toString());
            Intent a10 = a("com.amazon.testclient.simplesignin.linkUserAccount");
            a10.addFlags(268435456);
            a10.putExtras(bundle);
            c10.startService(a10);
        } catch (JSONException e10) {
            Log.e(f38085a, "Unable to create linkToken json");
            throw new IllegalStateException("Unable to create linkToken json", e10);
        }
    }

    public void a(RequestId requestId, Map<String, String> map) {
        Log.i(f38085a, "Handling showLoginSelection sandbox request.");
        Context c10 = c.a().c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.amazon.a.a.o.b.f37444B, requestId);
            jSONObject.put("packageName", c10.getPackageName());
            jSONObject.put(com.amazon.a.a.o.b.f37451I, SimpleSignInService.SDK_VERSION);
            Intent a10 = a("com.amazon.testclient.simplesignin.showLoginSelection");
            a10.putExtra("showLoginSelectionInput", jSONObject.toString());
            a10.putExtra(a.f38016o, new HashMap(map));
            a10.addFlags(268435456);
            c10.startService(a10);
        } catch (JSONException e10) {
            Log.e(f38085a, "Unable to create showLoginSelection Input");
            throw new IllegalStateException("Unable to create showLoginSelection input json", e10);
        }
    }

    public void a(RequestId requestId, SSIEventRequest sSIEventRequest) {
        Context c10 = c.a().c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(a.f38021t, sSIEventRequest.getEvent().toString());
            jSONObject.put(a.f38022u, sSIEventRequest.getEpochTimestamp());
            if (sSIEventRequest.getFailureReason() != null) {
                jSONObject.put(a.f38023v, sSIEventRequest.getFailureReason().toString());
            }
            Intent a10 = a("com.amazon.testclient.simplesignin.recordmetricsevent");
            a10.addFlags(268435456);
            c10.startService(a10);
        } catch (JSONException e10) {
            String str = f38085a;
            Log.e(str, "Error in preparing recordMetricEventInput for requestId: " + requestId, e10);
        }
    }

    public void a(Context context, Intent intent) {
        intent.setComponent(new ComponentName(f38086b, f38087c));
        try {
            String string = intent.getExtras().getString("responseType");
            if ("com.amazon.testclient.simplesignin.getUserAndLinks".equals(string)) {
                a((Object) a(intent));
            } else if ("com.amazon.testclient.simplesignin.linkUserAccount".equals(string)) {
                a((Object) c(intent));
            } else if ("com.amazon.testclient.simplesignin.showLoginSelection".equals(string)) {
                a((Object) d(intent));
            } else if ("com.amazon.testclient.simplesignin.recordmetricsevent".equals(string)) {
                a((Object) b(intent));
            } else {
                Log.d(f38085a, "Unknown response type received.");
            }
        } catch (Exception e10) {
            Log.e(f38085a, "Error handling response.", e10);
        }
    }

    private GetUserAndLinksResponse a(Intent intent) {
        GetUserAndLinksResponse getUserAndLinksResponse = new GetUserAndLinksResponse();
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra("getUserAndLinksOutput"));
            getUserAndLinksResponse.setRequestId(new RequestId(jSONObject.getString(com.amazon.a.a.o.b.f37444B)));
            RequestStatus valueOf = RequestStatus.valueOf(jSONObject.getString("status"));
            getUserAndLinksResponse.setRequestStatus(valueOf);
            if (!RequestStatus.SUCCESSFUL.equals(valueOf)) {
                return getUserAndLinksResponse;
            }
            String string = jSONObject.getString(a.f38003b);
            getUserAndLinksResponse.setAmazonUserId(string);
            getUserAndLinksResponse.setLinks(com.amazon.device.simplesignin.a.d.b.a(string, jSONObject.getString(a.f38004c)));
            return getUserAndLinksResponse;
        } catch (JSONException e10) {
            Log.e(f38085a, "Exception while parsing GetUserAndLinks response", e10);
        }
    }

    private Intent a(String str) {
        Intent intent = new Intent(str);
        intent.setComponent(new ComponentName(f38086b, f38087c));
        return intent;
    }

    private void a(final Object obj) {
        Context c10 = c.a().c();
        final ISimpleSignInResponseHandler d10 = c.a().d();
        if (c10 == null || obj == null) {
            String str = f38085a;
            Log.i(str, "ISimpleSignInResponseHandler is not set. Dropping response: " + obj);
            return;
        }
        new Handler(c10.getMainLooper()).post(new Runnable() {
            public void run() {
                try {
                    Object obj = obj;
                    if (obj instanceof GetUserAndLinksResponse) {
                        d10.onGetUserAndLinksResponse((GetUserAndLinksResponse) obj);
                    } else if (obj instanceof LinkUserAccountResponse) {
                        d10.onLinkUserAccountResponse((LinkUserAccountResponse) obj);
                    } else if (obj instanceof ShowLoginSelectionResponse) {
                        d10.onShowLoginSelectionResponse((ShowLoginSelectionResponse) obj);
                    } else if (obj instanceof RecordMetricsEventResponse) {
                        d10.onRecordMetricsEventResponse((RecordMetricsEventResponse) obj);
                    } else {
                        String a10 = b.f38085a;
                        Log.e(a10, "Unknown response type:" + obj.getClass().getName());
                    }
                } catch (Exception e10) {
                    String a11 = b.f38085a;
                    Log.e(a11, "Error in sendResponse: " + e10);
                }
            }
        });
    }
}
