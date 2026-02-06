package B5;

import Sg.p;
import android.adservices.common.AdData;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.adservices.customaudience.CustomAudience;
import android.adservices.customaudience.CustomAudienceManager;
import android.adservices.customaudience.JoinCustomAudienceRequest;
import android.adservices.customaudience.TrustedBiddingData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.util.Log;
import com.facebook.I;
import io.branch.rnbranch.RNBranchModule;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.C6496s;
import lf.C6514M;
import mf.C6565s;
import t7.C4049a;
import u1.m;
import z5.C4232a;

public final class C {

    /* renamed from: a  reason: collision with root package name */
    public static final C f29817a = new C();

    /* renamed from: b  reason: collision with root package name */
    private static final String f29818b = ("Fledge: " + C.class.getSimpleName());

    /* renamed from: c  reason: collision with root package name */
    private static boolean f29819c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f29820d;

    /* renamed from: e  reason: collision with root package name */
    private static CustomAudienceManager f29821e;

    /* renamed from: f  reason: collision with root package name */
    private static C4232a f29822f;

    /* renamed from: g  reason: collision with root package name */
    private static String f29823g;

    public static final class a implements OutcomeReceiver {
        a() {
        }

        /* renamed from: a */
        public void onError(Exception exc) {
            C6496s.h(exc, RNBranchModule.NATIVE_INIT_SESSION_FINISHED_EVENT_ERROR);
            Log.e(C.b(), exc.toString());
            C4232a a10 = C.a();
            if (a10 == null) {
                C6496s.v("gpsDebugLogger");
                a10 = null;
            }
            Bundle bundle = new Bundle();
            bundle.putString("gps_pa_failed_reason", exc.toString());
            C6514M m10 = C6514M.f71813a;
            a10.b("gps_pa_failed", bundle);
        }

        public void onResult(Object obj) {
            C6496s.h(obj, "result");
            Log.i(C.b(), "Successfully joined custom audience");
            C4232a a10 = C.a();
            if (a10 == null) {
                C6496s.v("gpsDebugLogger");
                a10 = null;
            }
            a10.b("gps_pa_succeed", (Bundle) null);
        }
    }

    private C() {
    }

    public static final /* synthetic */ C4232a a() {
        Class<C> cls = C.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f29822f;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final /* synthetic */ String b() {
        Class<C> cls = C.class;
        if (C4049a.d(cls)) {
            return null;
        }
        try {
            return f29818b;
        } catch (Throwable th2) {
            C4049a.b(th2, cls);
            return null;
        }
    }

    public static final void c() {
        C4232a aVar;
        String str;
        Class<C> cls = C.class;
        if (!C4049a.d(cls)) {
            try {
                f29820d = true;
                Context l10 = I.l();
                f29822f = new C4232a(l10);
                f29823g = "https://www." + I.u() + "/privacy_sandbox/pa/logic";
                aVar = null;
                CustomAudienceManager a10 = CustomAudienceManager.get(l10);
                f29821e = a10;
                if (a10 != null) {
                    f29819c = true;
                }
                str = null;
            } catch (Exception e10) {
                str = e10.toString();
                Log.w(f29818b, "Failed to get CustomAudienceManager: " + e10);
            } catch (Error e11) {
                str = e11.toString();
                Log.w(f29818b, "Failed to get CustomAudienceManager: " + e11);
            } catch (Throwable th2) {
                C4049a.b(th2, cls);
                return;
            }
            if (!f29819c) {
                C4232a aVar2 = f29822f;
                if (aVar2 == null) {
                    C6496s.v("gpsDebugLogger");
                } else {
                    aVar = aVar2;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_pa_failed_reason", str);
                C6514M m10 = C6514M.f71813a;
                aVar.b("gps_pa_failed", bundle);
            }
        }
    }

    private final void f(String str, String str2) {
        C4232a aVar;
        C4232a aVar2;
        C4232a aVar3;
        boolean d10 = C4049a.d(this);
        if (!d10) {
            try {
                aVar = d10;
                aVar = d10;
                String g10 = g(str, str2);
                if (g10 != null) {
                    aVar = false;
                    OutcomeReceiver a10 = m.a(new a());
                    q.a();
                    AdData.Builder a11 = m.a();
                    StringBuilder sb2 = new StringBuilder();
                    String str3 = f29823g;
                    if (str3 == null) {
                        C6496s.v("baseUri");
                        str3 = null;
                    }
                    sb2.append(str3);
                    sb2.append("/ad");
                    Uri parse = Uri.parse(sb2.toString());
                    C6496s.d(parse, "Uri.parse(this)");
                    AdData a12 = a11.setRenderUri(parse).setMetadata("{'isRealAd': false}").build();
                    C6496s.g(a12, "Builder()\n              …\n                .build()");
                    r.a();
                    TrustedBiddingData.Builder a13 = n.a();
                    StringBuilder sb3 = new StringBuilder();
                    String str4 = f29823g;
                    if (str4 == null) {
                        C6496s.v("baseUri");
                        str4 = null;
                    }
                    sb3.append(str4);
                    sb3.append("?trusted_bidding");
                    Uri parse2 = Uri.parse(sb3.toString());
                    C6496s.d(parse2, "Uri.parse(this)");
                    TrustedBiddingData a14 = a13.setTrustedBiddingUri(parse2).setTrustedBiddingKeys(C6565s.e("")).build();
                    C6496s.g(a14, "Builder()\n              …\n                .build()");
                    s.a();
                    CustomAudience.Builder a15 = o.a().setName(g10).setBuyer(AdTechIdentifier.fromString("facebook.com"));
                    StringBuilder sb4 = new StringBuilder();
                    String str5 = f29823g;
                    if (str5 == null) {
                        C6496s.v("baseUri");
                        str5 = null;
                    }
                    sb4.append(str5);
                    sb4.append("?daily&app_id=");
                    sb4.append(str);
                    Uri parse3 = Uri.parse(sb4.toString());
                    C6496s.d(parse3, "Uri.parse(this)");
                    CustomAudience.Builder a16 = a15.setDailyUpdateUri(parse3);
                    StringBuilder sb5 = new StringBuilder();
                    String str6 = f29823g;
                    if (str6 == null) {
                        C6496s.v("baseUri");
                        str6 = null;
                    }
                    sb5.append(str6);
                    sb5.append("?bidding");
                    Uri parse4 = Uri.parse(sb5.toString());
                    C6496s.d(parse4, "Uri.parse(this)");
                    CustomAudience a17 = a16.setBiddingLogicUri(parse4).setTrustedBiddingData(a14).setUserBiddingSignals(AdSelectionSignals.fromString("{}")).setAds(C6565s.e(a12)).build();
                    C6496s.g(a17, "Builder()\n              …(listOf(dummyAd)).build()");
                    t.a();
                    JoinCustomAudienceRequest a18 = p.a().setCustomAudience(a17).build();
                    C6496s.g(a18, "Builder().setCustomAudience(ca).build()");
                    CustomAudienceManager customAudienceManager = f29821e;
                    if (customAudienceManager != null) {
                        customAudienceManager.joinCustomAudience(a18, Executors.newSingleThreadExecutor(), a10);
                    }
                }
            } catch (Exception e10) {
                Log.w(f29818b, "Failed to join Custom Audience: " + e10);
                C4232a aVar4 = f29822f;
                if (aVar4 == null) {
                    C6496s.v("gpsDebugLogger");
                    aVar2 = aVar;
                } else {
                    aVar2 = aVar4;
                }
                Bundle bundle = new Bundle();
                bundle.putString("gps_pa_failed_reason", e10.toString());
                C6514M m10 = C6514M.f71813a;
                aVar2.b("gps_pa_failed", bundle);
            } catch (Error e11) {
                Log.w(f29818b, "Failed to join Custom Audience: " + e11);
                C4232a aVar5 = f29822f;
                if (aVar5 == null) {
                    C6496s.v("gpsDebugLogger");
                    aVar3 = aVar;
                } else {
                    aVar3 = aVar5;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("gps_pa_failed_reason", e11.toString());
                C6514M m11 = C6514M.f71813a;
                aVar3.b("gps_pa_failed", bundle2);
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    private final String g(String str, String str2) {
        if (!(C4049a.d(this) || str == null || str2 == null)) {
            try {
                if (!C6496s.c(str2, "_removed_")) {
                    if (!p.O(str2, "gps", false, 2, (Object) null)) {
                        return str + '@' + str2 + '@' + (System.currentTimeMillis() / ((long) 1000)) + "@1";
                    }
                }
                return null;
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
        return null;
    }

    public final void d(String str, String str2) {
        if (!C4049a.d(this)) {
            try {
                if (!f29820d) {
                    c();
                }
                if (f29819c) {
                    f(str, str2);
                }
            } catch (Throwable th2) {
                C4049a.b(th2, this);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        android.util.Log.w(f29818b, "Failed to get event name from event.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0026 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(java.lang.String r3, t5.C4028e r4) {
        /*
            r2 = this;
            boolean r0 = t7.C4049a.d(r2)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            boolean r0 = f29820d     // Catch:{ all -> 0x000f }
            if (r0 != 0) goto L_0x0011
            c()     // Catch:{ all -> 0x000f }
            goto L_0x0011
        L_0x000f:
            r3 = move-exception
            goto L_0x0031
        L_0x0011:
            boolean r0 = f29819c     // Catch:{ all -> 0x000f }
            if (r0 != 0) goto L_0x0016
            return
        L_0x0016:
            r0 = 0
            if (r4 == 0) goto L_0x002d
            org.json.JSONObject r4 = r4.c()     // Catch:{ JSONException -> 0x0026 }
            if (r4 == 0) goto L_0x002d
            java.lang.String r1 = "_eventName"
            java.lang.String r0 = r4.getString(r1)     // Catch:{ JSONException -> 0x0026 }
            goto L_0x002d
        L_0x0026:
            java.lang.String r4 = f29818b     // Catch:{ all -> 0x000f }
            java.lang.String r1 = "Failed to get event name from event."
            android.util.Log.w(r4, r1)     // Catch:{ all -> 0x000f }
        L_0x002d:
            r2.f(r3, r0)     // Catch:{ all -> 0x000f }
            return
        L_0x0031:
            t7.C4049a.b(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: B5.C.e(java.lang.String, t5.e):void");
    }
}
