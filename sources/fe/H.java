package Fe;

import android.net.Uri;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf.C6565s;
import org.json.JSONException;
import org.json.JSONObject;

public final class H {

    /* renamed from: a  reason: collision with root package name */
    private final Map f30890a;

    /* renamed from: b  reason: collision with root package name */
    private E f30891b;

    /* renamed from: c  reason: collision with root package name */
    private final SimpleDateFormat f30892c = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault());

    public H(E e10) {
        C6496s.h(e10, "prefHelper");
        this.f30891b = e10;
        JSONObject U10 = e10.U();
        C6496s.g(U10, "prefHelper.referringURLQueryParameters");
        this.f30890a = d(U10);
        b();
    }

    private final JSONObject a(I i10) {
        Long l10;
        JSONObject jSONObject = new JSONObject();
        if ((i10 instanceof M) || (i10 instanceof P)) {
            Map map = this.f30890a;
            y yVar = y.Gclid;
            C3030t tVar = (C3030t) map.get(yVar.b());
            if (!(tVar == null || tVar.d() == null || C6496s.c(tVar.d(), "bnc_no_value"))) {
                long time = new Date().getTime();
                Date b10 = tVar.b();
                if (b10 != null) {
                    l10 = Long.valueOf(b10.getTime());
                } else {
                    l10 = null;
                }
                long c10 = tVar.c() * 1000;
                if (l10 != null) {
                    if (tVar.c() == 0 || time < l10.longValue() + c10) {
                        jSONObject.put(yVar.b(), tVar.d());
                        if (i10 instanceof P) {
                            jSONObject.put(y.IsDeeplinkGclid.b(), tVar.e());
                        }
                        tVar.f(false);
                        this.f30891b.X0(i(this.f30890a));
                    } else {
                        this.f30890a.remove(yVar.b());
                        this.f30891b.X0(i(this.f30890a));
                    }
                }
            }
        }
        return jSONObject;
    }

    private final void b() {
        String str;
        String S10;
        Map map = this.f30890a;
        y yVar = y.Gclid;
        C3030t tVar = (C3030t) map.get(yVar.b());
        if (tVar != null) {
            str = tVar.d();
        } else {
            str = null;
        }
        if (str == null && (S10 = this.f30891b.S()) != null && !C6496s.c(S10, "bnc_no_value")) {
            String str2 = S10;
            C3030t tVar2 = new C3030t(yVar.b(), str2, new Date(), false, this.f30891b.T());
            Map map2 = this.f30890a;
            String b10 = yVar.b();
            C6496s.g(b10, "Gclid.key");
            map2.put(b10, tVar2);
            this.f30891b.X0(i(this.f30890a));
            this.f30891b.b();
            C3023l.l("Updated old Gclid (" + S10 + ") to new BranchUrlQueryParameter (" + tVar2 + ')');
        }
    }

    private final long c(String str) {
        if (C6496s.c(str, y.Gclid.b())) {
            return this.f30891b.T() / 1000;
        }
        return 0;
    }

    private final C3030t e(String str) {
        C3030t tVar = (C3030t) this.f30890a.get(str);
        if (tVar == null) {
            return new C3030t(str, (String) null, (Date) null, false, 0, 30, (DefaultConstructorMarker) null);
        }
        return tVar;
    }

    private final boolean g(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        C6496s.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return C6565s.e(y.Gclid.b()).contains(lowerCase);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0097 A[Catch:{ JSONException -> 0x006f }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a4 A[Catch:{ JSONException -> 0x006f }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ac A[Catch:{ JSONException -> 0x006f }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b6 A[Catch:{ JSONException -> 0x006f }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0018 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map d(org.json.JSONObject r22) {
        /*
            r21 = this;
            r1 = r22
            java.lang.String r2 = "isDeeplink"
            java.lang.String r3 = "validityWindow"
            java.lang.String r4 = "timestamp"
            java.lang.String r5 = "value"
            java.lang.String r0 = "json"
            kotlin.jvm.internal.C6496s.h(r1, r0)
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.Iterator r7 = r22.keys()     // Catch:{ JSONException -> 0x0055 }
        L_0x0018:
            boolean r0 = r7.hasNext()     // Catch:{ JSONException -> 0x0055 }
            if (r0 == 0) goto L_0x00bb
            java.lang.Object r0 = r7.next()     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x0055 }
            org.json.JSONObject r8 = r1.getJSONObject(r0)     // Catch:{ JSONException -> 0x0055 }
            Fe.t r14 = new Fe.t     // Catch:{ JSONException -> 0x0055 }
            r16 = 31
            r17 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r18 = 0
            r9 = r14
            r20 = r14
            r14 = r18
            r9.<init>(r10, r11, r12, r13, r14, r16, r17)     // Catch:{ JSONException -> 0x0055 }
            java.lang.String r0 = "name"
            java.lang.String r0 = r8.getString(r0)     // Catch:{ JSONException -> 0x0055 }
            r9 = r20
            r9.g(r0)     // Catch:{ JSONException -> 0x0055 }
            boolean r0 = r8.has(r5)     // Catch:{ JSONException -> 0x0055 }
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = r8.getString(r5)     // Catch:{ JSONException -> 0x0055 }
            r9.j(r0)     // Catch:{ JSONException -> 0x0055 }
            goto L_0x0059
        L_0x0055:
            r0 = move-exception
            r10 = r21
            goto L_0x00be
        L_0x0059:
            boolean r0 = r8.has(r4)     // Catch:{ JSONException -> 0x0055 }
            if (r0 == 0) goto L_0x008f
            java.lang.String r0 = r8.getString(r4)     // Catch:{ ParseException -> 0x0073 }
            r10 = r21
            java.text.SimpleDateFormat r11 = r10.f30892c     // Catch:{ ParseException -> 0x0071 }
            java.util.Date r0 = r11.parse(r0)     // Catch:{ ParseException -> 0x0071 }
            r9.h(r0)     // Catch:{ ParseException -> 0x0071 }
            goto L_0x0091
        L_0x006f:
            r0 = move-exception
            goto L_0x00be
        L_0x0071:
            r0 = move-exception
            goto L_0x0076
        L_0x0073:
            r0 = move-exception
            r10 = r21
        L_0x0076:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x006f }
            r11.<init>()     // Catch:{ JSONException -> 0x006f }
            java.lang.String r12 = "Caught JSONException when parsing referring URL query parameter timestamp "
            r11.append(r12)     // Catch:{ JSONException -> 0x006f }
            java.lang.String r0 = r0.getMessage()     // Catch:{ JSONException -> 0x006f }
            r11.append(r0)     // Catch:{ JSONException -> 0x006f }
            java.lang.String r0 = r11.toString()     // Catch:{ JSONException -> 0x006f }
            Fe.C3023l.b(r0)     // Catch:{ JSONException -> 0x006f }
            goto L_0x0091
        L_0x008f:
            r10 = r21
        L_0x0091:
            boolean r0 = r8.has(r3)     // Catch:{ JSONException -> 0x006f }
            if (r0 == 0) goto L_0x009e
            long r11 = r8.getLong(r3)     // Catch:{ JSONException -> 0x006f }
            r9.i(r11)     // Catch:{ JSONException -> 0x006f }
        L_0x009e:
            boolean r0 = r8.has(r2)     // Catch:{ JSONException -> 0x006f }
            if (r0 == 0) goto L_0x00ac
            boolean r0 = r8.getBoolean(r2)     // Catch:{ JSONException -> 0x006f }
            r9.f(r0)     // Catch:{ JSONException -> 0x006f }
            goto L_0x00b0
        L_0x00ac:
            r0 = 0
            r9.f(r0)     // Catch:{ JSONException -> 0x006f }
        L_0x00b0:
            java.lang.String r0 = r9.a()     // Catch:{ JSONException -> 0x006f }
            if (r0 == 0) goto L_0x0018
            r6.put(r0, r9)     // Catch:{ JSONException -> 0x006f }
            goto L_0x0018
        L_0x00bb:
            r10 = r21
            goto L_0x00d6
        L_0x00be:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Caught JSONException when deserializing JSON for referring URL query parameters "
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            Fe.C3023l.b(r0)
        L_0x00d6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Fe.H.d(org.json.JSONObject):java.util.Map");
    }

    public final JSONObject f(I i10) {
        C6496s.h(i10, "request");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject a10 = a(i10);
        if (a10.length() > 0) {
            Iterator<String> keys = a10.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                C6496s.g(next, SubscriberAttributeKt.JSON_NAME_KEY);
                Object obj = a10.get(next);
                C6496s.g(obj, "gclid.get(key)");
                linkedHashMap.put(next, obj);
            }
        }
        return new JSONObject(linkedHashMap);
    }

    public final void h(String str) {
        C6496s.h(str, "urlString");
        if (!C3016e.X().r0()) {
            Uri parse = Uri.parse(str);
            if (parse.isHierarchical()) {
                for (String next : parse.getQueryParameterNames()) {
                    C6496s.g(next, "originalParamName");
                    String lowerCase = next.toLowerCase(Locale.ROOT);
                    C6496s.g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
                    String queryParameter = parse.getQueryParameter(next);
                    C3023l.l("Found URL Query Parameter - Key: " + lowerCase + ", Value: " + queryParameter);
                    if (g(lowerCase)) {
                        C3030t e10 = e(lowerCase);
                        e10.j(queryParameter);
                        e10.h(new Date());
                        e10.f(true);
                        if (e10.c() == 0) {
                            e10.i(c(lowerCase));
                        }
                        this.f30890a.put(lowerCase, e10);
                    }
                }
                this.f30891b.X0(i(this.f30890a));
                C3023l.l("Current referringURLQueryParameters: " + this.f30891b.U());
                return;
            }
            C3023l.a("Skipping referring URL query parameter parsing because the URI is not hierarchical. URI: " + str);
            return;
        }
        C3023l.a("Skipping referring URL query parameter parsing due to disabled tracking.");
    }

    public final JSONObject i(Map map) {
        String str;
        C6496s.h(map, "urlQueryParameters");
        JSONObject jSONObject = new JSONObject();
        try {
            for (C3030t tVar : map.values()) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("name", tVar.a());
                Object d10 = tVar.d();
                if (d10 == null) {
                    d10 = JSONObject.NULL;
                }
                jSONObject2.put("value", d10);
                Date b10 = tVar.b();
                if (b10 != null) {
                    str = this.f30892c.format(b10);
                } else {
                    str = null;
                }
                jSONObject2.put(DiagnosticsEntry.TIMESTAMP_KEY, str);
                jSONObject2.put("isDeeplink", tVar.e());
                jSONObject2.put("validityWindow", tVar.c());
                jSONObject.put(String.valueOf(tVar.a()), jSONObject2);
            }
        } catch (JSONException e10) {
            C3023l.b("Caught JSONException when serializing JSON for referring URL query parameters " + e10.getMessage());
        }
        return jSONObject;
    }
}
