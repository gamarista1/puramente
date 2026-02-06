package Fe;

import Fe.U;
import android.content.Context;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class I {

    /* renamed from: k  reason: collision with root package name */
    private static final B[] f30893k = {B.RegisterInstall, B.RegisterOpen, B.ContentEvent, B.TrackStandardEvent, B.TrackCustomEvent};

    /* renamed from: a  reason: collision with root package name */
    protected long f30894a;

    /* renamed from: b  reason: collision with root package name */
    protected String f30895b;

    /* renamed from: c  reason: collision with root package name */
    private JSONObject f30896c;

    /* renamed from: d  reason: collision with root package name */
    final B f30897d;

    /* renamed from: e  reason: collision with root package name */
    protected final E f30898e;

    /* renamed from: f  reason: collision with root package name */
    private long f30899f;

    /* renamed from: g  reason: collision with root package name */
    private final Context f30900g;

    /* renamed from: h  reason: collision with root package name */
    private final Set f30901h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f30902i;

    /* renamed from: j  reason: collision with root package name */
    public int f30903j;

    public enum a {
        V1,
        V1_LATD,
        V2
    }

    public enum b {
        SDK_INIT_WAIT_LOCK,
        GAID_FETCH_WAIT_LOCK,
        INTENT_PENDING_WAIT_LOCK,
        USER_SET_WAIT_LOCK,
        INSTALL_REFERRER_FETCH_WAIT_LOCK,
        USER_AGENT_STRING_LOCK
    }

    public I(Context context, B b10) {
        this(b10, new JSONObject(), context);
    }

    private boolean B(JSONObject jSONObject) {
        if (!C3016e.p0() || !jSONObject.has(y.LinkIdentifier.b())) {
            return false;
        }
        return true;
    }

    private void C(JSONObject jSONObject) {
        jSONObject.remove(A.partner.b());
        jSONObject.remove(A.campaign.b());
        jSONObject.remove(y.GooglePlayInstallReferrer.b());
    }

    private void E() {
        try {
            U.g c10 = C.d().c();
            this.f30896c.put(y.HardwareID.b(), c10.a());
            this.f30896c.put(y.IsHardwareIDReal.b(), c10.b());
            JSONObject jSONObject = this.f30896c;
            y yVar = y.UserData;
            if (jSONObject.has(yVar.b())) {
                JSONObject jSONObject2 = this.f30896c.getJSONObject(yVar.b());
                y yVar2 = y.AndroidID;
                if (jSONObject2.has(yVar2.b())) {
                    jSONObject2.put(yVar2.b(), c10.a());
                }
            }
        } catch (JSONException e10) {
            C3023l.m("Caught JSONException " + e10.getMessage());
        }
    }

    private void J(String str) {
        String str2;
        try {
            if (U.C()) {
                str2 = y.FireAdId.b();
            } else if (U.F(C3016e.X().M())) {
                str2 = y.OpenAdvertisingID.b();
            } else {
                str2 = y.AAID.b();
            }
            this.f30896c.put(y.AdvertisingIDs.b(), new JSONObject().put(str2, str));
        } catch (JSONException e10) {
            C3023l.m("Caught JSONException " + e10.getMessage());
        }
    }

    private void K() {
        JSONObject optJSONObject;
        if (j() == a.V2 && (optJSONObject = this.f30896c.optJSONObject(y.UserData.b())) != null) {
            try {
                optJSONObject.put(y.DeveloperIdentity.b(), this.f30898e.B());
                optJSONObject.put(y.RandomizedDeviceToken.b(), this.f30898e.Q());
            } catch (JSONException e10) {
                C3023l.m("Caught JSONException " + e10.getMessage());
            }
        }
    }

    private void L() {
        JSONObject jSONObject;
        boolean i10;
        if (j() == a.V1) {
            jSONObject = this.f30896c;
        } else {
            jSONObject = this.f30896c.optJSONObject(y.UserData.b());
        }
        if (jSONObject != null && (i10 = this.f30898e.i())) {
            try {
                jSONObject.putOpt(y.DisableAdNetworkCallouts.b(), Boolean.valueOf(i10));
            } catch (JSONException e10) {
                C3023l.m("Caught JSONException " + e10.getMessage());
            }
        }
    }

    private void O() {
        JSONObject jSONObject;
        boolean h02;
        if (j() == a.V1) {
            jSONObject = this.f30896c;
        } else {
            jSONObject = this.f30896c.optJSONObject(y.UserData.b());
        }
        if (jSONObject != null && (h02 = this.f30898e.h0())) {
            try {
                jSONObject.putOpt(y.limitFacebookTracking.b(), Boolean.valueOf(h02));
            } catch (JSONException e10) {
                C3023l.m("Caught JSONException " + e10.getMessage());
            }
        }
    }

    private void P() {
        try {
            JSONObject jSONObject = new JSONObject();
            Iterator<String> keys = this.f30898e.V().keys();
            while (keys.hasNext()) {
                String next = keys.next();
                jSONObject.put(next, this.f30898e.V().get(next));
            }
            JSONObject optJSONObject = this.f30896c.optJSONObject(y.Metadata.b());
            if (optJSONObject != null) {
                Iterator<String> keys2 = optJSONObject.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    jSONObject.put(next2, optJSONObject.get(next2));
                }
            }
            if ((this instanceof O) && this.f30898e.E().length() > 0) {
                Iterator<String> keys3 = this.f30898e.E().keys();
                while (keys3.hasNext()) {
                    String next3 = keys3.next();
                    this.f30896c.putOpt(next3, this.f30898e.E().get(next3));
                }
            }
            this.f30896c.put(y.Metadata.b(), jSONObject);
        } catch (JSONException e10) {
            C3023l.m("Caught JSONException. Could not merge metadata, ignoring user metadata. " + e10.getMessage());
        }
    }

    private void a() {
        if (this.f30898e != null) {
            try {
                this.f30896c.put(y.Branch_Sdk_Request_Creation_Time_Stamp.b(), this.f30894a);
                this.f30896c.put(y.Branch_Sdk_Request_Uuid.b(), this.f30895b);
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    private void b() {
        if (this.f30898e.i0()) {
            try {
                if (j() == a.V1) {
                    this.f30896c.put(y.Consumer_Protection_Attribution_Level.b(), this.f30898e.v().toString());
                    return;
                }
                JSONObject optJSONObject = this.f30896c.optJSONObject(y.UserData.b());
                if (optJSONObject != null) {
                    optJSONObject.put(y.Consumer_Protection_Attribution_Level.b(), this.f30898e.v().toString());
                }
            } catch (JSONException e10) {
                C3023l.a(e10.getMessage());
            }
        }
    }

    private String i(long j10) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("-yyyyMMddHH", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(Long.valueOf(j10));
    }

    private String p(String str) {
        return UUID.randomUUID().toString() + str;
    }

    private boolean y(JSONObject jSONObject) {
        if (jSONObject.has(y.AndroidID.b()) || jSONObject.has(y.RandomizedDeviceToken.b())) {
            return true;
        }
        return false;
    }

    public String A() {
        return Arrays.toString(this.f30901h.toArray());
    }

    public void D(b bVar) {
        this.f30901h.remove(bVar);
    }

    /* access modifiers changed from: protected */
    public void F(JSONObject jSONObject) {
        C3023l.l("setPost " + jSONObject);
        this.f30896c = jSONObject;
        if (j() == a.V1) {
            C.d().k(this, this.f30896c);
        } else {
            JSONObject jSONObject2 = new JSONObject();
            this.f30896c.put(y.UserData.b(), jSONObject2);
            C.d().l(this, this.f30898e, jSONObject2);
        }
        this.f30896c.put(y.Debug.b(), C3016e.l0());
    }

    /* access modifiers changed from: protected */
    public boolean G() {
        return false;
    }

    public boolean H() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean I() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void M(Context context, JSONObject jSONObject) {
        y yVar;
        try {
            if (C.d().h()) {
                yVar = y.NativeApp;
            } else {
                yVar = y.InstantApp;
            }
            String b10 = yVar.b();
            if (j() == a.V2) {
                JSONObject optJSONObject = jSONObject.optJSONObject(y.UserData.b());
                if (optJSONObject != null) {
                    optJSONObject.put(y.Environment.b(), b10);
                    return;
                }
                return;
            }
            jSONObject.put(y.Environment.b(), b10);
        } catch (Exception e10) {
            C3023l.a(e10.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public void N() {
        a j10 = j();
        int p10 = C.d().f().p();
        String e10 = C.d().f().e();
        if (!TextUtils.isEmpty(e10) && (this.f30898e.v() == C3032v.FULL || !this.f30898e.i0())) {
            J(e10);
            E();
        }
        try {
            if (j10 == a.V1) {
                this.f30896c.put(y.LATVal.b(), p10);
                if (!TextUtils.isEmpty(e10)) {
                    if (!U.F(this.f30900g)) {
                        if (this.f30898e.v() != C3032v.FULL) {
                            if (!this.f30898e.i0()) {
                            }
                        }
                        this.f30896c.put(y.GoogleAdvertisingID.b(), e10);
                    }
                    this.f30896c.remove(y.UnidentifiedDevice.b());
                } else if (!y(this.f30896c)) {
                    JSONObject jSONObject = this.f30896c;
                    y yVar = y.UnidentifiedDevice;
                    if (!jSONObject.optBoolean(yVar.b())) {
                        this.f30896c.put(yVar.b(), true);
                    }
                }
            } else {
                JSONObject optJSONObject = this.f30896c.optJSONObject(y.UserData.b());
                if (optJSONObject != null) {
                    optJSONObject.put(y.LimitedAdTracking.b(), p10);
                    if (!TextUtils.isEmpty(e10)) {
                        if (!U.F(this.f30900g) && (this.f30898e.v() == C3032v.FULL || !this.f30898e.i0())) {
                            optJSONObject.put(y.AAID.b(), e10);
                        }
                        optJSONObject.remove(y.UnidentifiedDevice.b());
                    } else if (!y(optJSONObject)) {
                        y yVar2 = y.UnidentifiedDevice;
                        if (!optJSONObject.optBoolean(yVar2.b())) {
                            optJSONObject.put(yVar2.b(), true);
                        }
                    }
                }
            }
        } catch (JSONException e11) {
            C3023l.m("Caught JSONException " + e11.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        if (this.f30898e.j0()) {
            try {
                if (j() == a.V1) {
                    this.f30896c.put(y.DMA_EEA.b(), this.f30898e.x());
                    this.f30896c.put(y.DMA_Ad_Personalization.b(), this.f30898e.j());
                    this.f30896c.put(y.DMA_Ad_User_Data.b(), this.f30898e.k());
                    return;
                }
                JSONObject optJSONObject = this.f30896c.optJSONObject(y.UserData.b());
                if (optJSONObject != null) {
                    optJSONObject.put(y.DMA_EEA.b(), this.f30898e.x());
                    optJSONObject.put(y.DMA_Ad_Personalization.b(), this.f30898e.j());
                    optJSONObject.put(y.DMA_Ad_User_Data.b(), this.f30898e.k());
                }
            } catch (JSONException e10) {
                C3023l.a(e10.getMessage());
            }
        }
    }

    public void d(b bVar) {
        if (bVar != null) {
            this.f30901h.add(bVar);
        }
    }

    public abstract void e();

    /* access modifiers changed from: package-private */
    public void f() {
        C3023l.l("doFinalUpdateOnBackgroundThread");
        if (this instanceof L) {
            ((L) this).S();
            if (B(this.f30896c)) {
                C(this.f30896c);
            }
        }
        K();
        L();
        if (r()) {
            N();
        }
    }

    /* access modifiers changed from: package-private */
    public void g() {
        C3023l.l("doFinalUpdateOnMainThread");
        P();
        if (I()) {
            O();
        }
        if (G()) {
            c();
        }
        b();
        a();
    }

    /* access modifiers changed from: protected */
    public boolean h(Context context) {
        int checkCallingOrSelfPermission = context.checkCallingOrSelfPermission("android.permission.INTERNET");
        if (checkCallingOrSelfPermission != 0) {
            C3023l.l("Trouble executing your request. Please add 'android.permission.INTERNET' in your applications manifest file");
        }
        if (checkCallingOrSelfPermission == 0) {
            return true;
        }
        return false;
    }

    public a j() {
        return a.V1;
    }

    public JSONObject k() {
        return this.f30896c;
    }

    public JSONObject l() {
        return this.f30896c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0080, code lost:
        Fe.C3023l.l("ServerRequest " + r5 + " getPostWithInstrumentationValues caught exception: " + r6.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a4, code lost:
        Fe.C3023l.a(r6.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return r5.f30896c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[ExcHandler: ConcurrentModificationException (unused java.util.ConcurrentModificationException), SYNTHETIC, Splitter:B:1:0x0005] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c A[Catch:{ JSONException -> 0x002e, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }, ExcHandler: Exception (r6v3 'e' java.lang.Exception A[CUSTOM_DECLARE, Catch:{ JSONException -> 0x002e, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }]), Splitter:B:1:0x0005] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject m(java.util.concurrent.ConcurrentHashMap r6) {
        /*
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = r5.f30896c     // Catch:{ JSONException -> 0x002e, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            if (r1 == 0) goto L_0x0031
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x002e, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            org.json.JSONObject r2 = r5.f30896c     // Catch:{ JSONException -> 0x002e, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            java.lang.String r2 = r2.toString()     // Catch:{ JSONException -> 0x002e, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x002e, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            java.util.Iterator r2 = r1.keys()     // Catch:{ JSONException -> 0x002e, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
        L_0x0018:
            boolean r3 = r2.hasNext()     // Catch:{ JSONException -> 0x002e, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            if (r3 == 0) goto L_0x0031
            java.lang.Object r3 = r2.next()     // Catch:{ JSONException -> 0x002e, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ JSONException -> 0x002e, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            java.lang.Object r4 = r1.get(r3)     // Catch:{ JSONException -> 0x002e, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            r0.put(r3, r4)     // Catch:{ JSONException -> 0x002e, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            goto L_0x0018
        L_0x002c:
            r6 = move-exception
            goto L_0x0080
        L_0x002e:
            r6 = move-exception
            goto L_0x00a4
        L_0x0031:
            int r1 = r6.size()     // Catch:{ JSONException -> 0x002e, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            if (r1 <= 0) goto L_0x00ab
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x002e, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            r1.<init>()     // Catch:{ JSONException -> 0x002e, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            java.util.Set r2 = r6.keySet()     // Catch:{ JSONException -> 0x002e, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ JSONException -> 0x005b, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
        L_0x0044:
            boolean r3 = r2.hasNext()     // Catch:{ JSONException -> 0x005b, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            if (r3 == 0) goto L_0x005d
            java.lang.Object r3 = r2.next()     // Catch:{ JSONException -> 0x005b, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ JSONException -> 0x005b, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            java.lang.Object r4 = r6.get(r3)     // Catch:{ JSONException -> 0x005b, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            r1.put(r3, r4)     // Catch:{ JSONException -> 0x005b, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            r6.remove(r3)     // Catch:{ JSONException -> 0x005b, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            goto L_0x0044
        L_0x005b:
            r6 = move-exception
            goto L_0x0067
        L_0x005d:
            Fe.y r6 = Fe.y.Branch_Instrumentation     // Catch:{ JSONException -> 0x005b, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            java.lang.String r6 = r6.b()     // Catch:{ JSONException -> 0x005b, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            r0.put(r6, r1)     // Catch:{ JSONException -> 0x005b, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            goto L_0x00ab
        L_0x0067:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x002e, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            r1.<init>()     // Catch:{ JSONException -> 0x002e, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            java.lang.String r2 = "Caught JSONException "
            r1.append(r2)     // Catch:{ JSONException -> 0x002e, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            java.lang.String r6 = r6.getMessage()     // Catch:{ JSONException -> 0x002e, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            r1.append(r6)     // Catch:{ JSONException -> 0x002e, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            java.lang.String r6 = r1.toString()     // Catch:{ JSONException -> 0x002e, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            Fe.C3023l.m(r6)     // Catch:{ JSONException -> 0x002e, ConcurrentModificationException -> 0x00a1, Exception -> 0x002c }
            goto L_0x00ab
        L_0x0080:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ServerRequest "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r2 = " getPostWithInstrumentationValues caught exception: "
            r1.append(r2)
            java.lang.String r6 = r6.getMessage()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            Fe.C3023l.l(r6)
            goto L_0x00ab
        L_0x00a1:
            org.json.JSONObject r0 = r5.f30896c
            goto L_0x00ab
        L_0x00a4:
            java.lang.String r6 = r6.getMessage()
            Fe.C3023l.a(r6)
        L_0x00ab:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Fe.I.m(java.util.concurrent.ConcurrentHashMap):org.json.JSONObject");
    }

    public final String n() {
        return this.f30897d.b();
    }

    public String o() {
        return this.f30898e.f() + this.f30897d.b();
    }

    public abstract void q(int i10, String str);

    public boolean r() {
        return true;
    }

    public abstract boolean s();

    /* access modifiers changed from: package-private */
    public boolean t() {
        for (B equals : f30893k) {
            if (equals.equals(this.f30897d)) {
                return true;
            }
        }
        return false;
    }

    public boolean u() {
        if (this.f30901h.size() > 0) {
            return true;
        }
        return false;
    }

    public void v() {
        C3023l.l("onPreExecute " + this);
        if ((this instanceof P) || (this instanceof M)) {
            try {
                H h10 = new H(this.f30898e);
                h10.h(this.f30898e.z());
                if (this.f30898e.v() != C3032v.FULL) {
                    if (this.f30898e.i0()) {
                        return;
                    }
                }
                JSONObject f10 = h10.f(this);
                Iterator<String> keys = f10.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    this.f30896c.put(next, f10.get(next));
                }
            } catch (Exception e10) {
                C3023l.b("Caught exception in onPreExecute: " + e10.getMessage() + " stacktrace " + C3023l.j(e10));
            }
        }
    }

    public void w() {
        this.f30899f = System.currentTimeMillis();
    }

    public abstract void x(Q q10, C3016e eVar);

    /* access modifiers changed from: protected */
    public boolean z() {
        return false;
    }

    protected I(B b10, JSONObject jSONObject, Context context) {
        this.f30894a = 0;
        this.f30899f = 0;
        this.f30902i = false;
        this.f30903j = 0;
        C3023l.l("ServerRequest constructor");
        this.f30900g = context;
        this.f30897d = b10;
        this.f30896c = jSONObject;
        this.f30898e = E.G(context);
        this.f30901h = new HashSet();
        long currentTimeMillis = System.currentTimeMillis();
        this.f30894a = currentTimeMillis;
        this.f30895b = p(i(currentTimeMillis));
    }
}
