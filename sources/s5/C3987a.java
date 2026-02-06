package s5;

import android.os.Bundle;
import android.util.Log;
import com.amazon.a.a.o.b;
import com.dieam.reactnativepushnotification.modules.RNPushNotification;
import io.intercom.android.sdk.metrics.MetricTracker;
import io.intercom.android.sdk.models.AttributeType;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: s5.a  reason: case insensitive filesystem */
public class C3987a {

    /* renamed from: A  reason: collision with root package name */
    private final String f48018A;

    /* renamed from: B  reason: collision with root package name */
    private final String f48019B;

    /* renamed from: C  reason: collision with root package name */
    private final double f48020C;

    /* renamed from: D  reason: collision with root package name */
    private final double f48021D;

    /* renamed from: E  reason: collision with root package name */
    private final boolean f48022E;

    /* renamed from: F  reason: collision with root package name */
    private final double f48023F;

    /* renamed from: G  reason: collision with root package name */
    private final boolean f48024G;

    /* renamed from: H  reason: collision with root package name */
    private final boolean f48025H;

    /* renamed from: I  reason: collision with root package name */
    private final String f48026I;

    /* renamed from: J  reason: collision with root package name */
    private final String f48027J;

    /* renamed from: K  reason: collision with root package name */
    private final boolean f48028K;

    /* renamed from: L  reason: collision with root package name */
    private final boolean f48029L;

    /* renamed from: M  reason: collision with root package name */
    private final String f48030M;

    /* renamed from: a  reason: collision with root package name */
    private final String f48031a;

    /* renamed from: b  reason: collision with root package name */
    private final String f48032b;

    /* renamed from: c  reason: collision with root package name */
    private final double f48033c;

    /* renamed from: d  reason: collision with root package name */
    private final String f48034d;

    /* renamed from: e  reason: collision with root package name */
    private final String f48035e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f48036f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f48037g;

    /* renamed from: h  reason: collision with root package name */
    private final String f48038h;

    /* renamed from: i  reason: collision with root package name */
    private final String f48039i;

    /* renamed from: j  reason: collision with root package name */
    private final String f48040j;

    /* renamed from: k  reason: collision with root package name */
    private final String f48041k;

    /* renamed from: l  reason: collision with root package name */
    private final String f48042l;

    /* renamed from: m  reason: collision with root package name */
    private final String f48043m;

    /* renamed from: n  reason: collision with root package name */
    private final String f48044n;

    /* renamed from: o  reason: collision with root package name */
    private final String f48045o;

    /* renamed from: p  reason: collision with root package name */
    private final String f48046p;

    /* renamed from: q  reason: collision with root package name */
    private final String f48047q;

    /* renamed from: r  reason: collision with root package name */
    private final String f48048r;

    /* renamed from: s  reason: collision with root package name */
    private final String f48049s;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f48050t;

    /* renamed from: u  reason: collision with root package name */
    private final String f48051u;

    /* renamed from: v  reason: collision with root package name */
    private final boolean f48052v;

    /* renamed from: w  reason: collision with root package name */
    private final boolean f48053w;

    /* renamed from: x  reason: collision with root package name */
    private final double f48054x;

    /* renamed from: y  reason: collision with root package name */
    private final String f48055y;

    /* renamed from: z  reason: collision with root package name */
    private final boolean f48056z;

    public C3987a(Bundle bundle) {
        this.f48031a = bundle.getString("id");
        this.f48032b = bundle.getString(MetricTracker.Object.MESSAGE);
        this.f48033c = bundle.getDouble("fireDate");
        this.f48034d = bundle.getString(b.f37461S);
        this.f48035e = bundle.getString("ticker");
        this.f48036f = bundle.getBoolean("showWhen");
        this.f48037g = bundle.getBoolean("autoCancel");
        this.f48038h = bundle.getString("largeIcon");
        this.f48039i = bundle.getString("largeIconUrl");
        this.f48040j = bundle.getString("smallIcon");
        this.f48041k = bundle.getString("bigText");
        this.f48042l = bundle.getString("subText");
        this.f48043m = bundle.getString("bigPictureUrl");
        this.f48044n = bundle.getString("shortcutId");
        this.f48045o = bundle.getString(AttributeType.NUMBER);
        this.f48046p = bundle.getString("channelId");
        this.f48047q = bundle.getString("sound");
        this.f48048r = bundle.getString("color");
        this.f48049s = bundle.getString("group");
        this.f48050t = bundle.getBoolean("groupSummary");
        this.f48051u = bundle.getString("messageId");
        this.f48052v = bundle.getBoolean("playSound");
        this.f48053w = bundle.getBoolean("vibrate");
        this.f48054x = bundle.getDouble("vibration");
        this.f48055y = bundle.getString("actions");
        this.f48056z = bundle.getBoolean("invokeApp");
        this.f48018A = bundle.getString("tag");
        this.f48019B = bundle.getString("repeatType");
        this.f48020C = bundle.getDouble("repeatTime");
        this.f48021D = bundle.getDouble("when");
        this.f48022E = bundle.getBoolean("usesChronometer");
        this.f48023F = bundle.getDouble("timeoutAfter");
        this.f48024G = bundle.getBoolean("onlyAlertOnce");
        this.f48025H = bundle.getBoolean("ongoing");
        this.f48026I = bundle.getString("reply_button_text");
        this.f48027J = bundle.getString("reply_placeholder_text");
        this.f48028K = bundle.getBoolean("allowWhileIdle");
        this.f48029L = bundle.getBoolean("ignoreInForeground");
        this.f48030M = bundle.getString("userInfo");
    }

    public static C3987a a(String str) {
        return new C3987a(new JSONObject(str));
    }

    public double b() {
        return this.f48033c;
    }

    public String c() {
        return this.f48031a;
    }

    public String d() {
        return this.f48032b;
    }

    public String e() {
        return this.f48045o;
    }

    public String f() {
        return this.f48019B;
    }

    public String g() {
        return this.f48047q;
    }

    public String h() {
        return this.f48034d;
    }

    public String i() {
        return this.f48030M;
    }

    public Bundle j() {
        Bundle bundle = new Bundle();
        bundle.putString("id", this.f48031a);
        bundle.putString(MetricTracker.Object.MESSAGE, this.f48032b);
        bundle.putDouble("fireDate", this.f48033c);
        bundle.putString(b.f37461S, this.f48034d);
        bundle.putString("ticker", this.f48035e);
        bundle.putBoolean("showWhen", this.f48036f);
        bundle.putBoolean("autoCancel", this.f48037g);
        bundle.putString("largeIcon", this.f48038h);
        bundle.putString("largeIconUrl", this.f48039i);
        bundle.putString("smallIcon", this.f48040j);
        bundle.putString("bigText", this.f48041k);
        bundle.putString("subText", this.f48042l);
        bundle.putString("bigPictureUrl", this.f48043m);
        bundle.putString("shortcutId", this.f48044n);
        bundle.putString(AttributeType.NUMBER, this.f48045o);
        bundle.putString("channelId", this.f48046p);
        bundle.putString("sound", this.f48047q);
        bundle.putString("color", this.f48048r);
        bundle.putString("group", this.f48049s);
        bundle.putBoolean("groupSummary", this.f48050t);
        bundle.putString("messageId", this.f48051u);
        bundle.putBoolean("playSound", this.f48052v);
        bundle.putBoolean("vibrate", this.f48053w);
        bundle.putDouble("vibration", this.f48054x);
        bundle.putString("actions", this.f48055y);
        bundle.putBoolean("invokeApp", this.f48056z);
        bundle.putString("tag", this.f48018A);
        bundle.putString("repeatType", this.f48019B);
        bundle.putDouble("repeatTime", this.f48020C);
        bundle.putDouble("when", this.f48021D);
        bundle.putBoolean("usesChronometer", this.f48022E);
        bundle.putDouble("timeoutAfter", this.f48023F);
        bundle.putBoolean("onlyAlertOnce", this.f48024G);
        bundle.putBoolean("ongoing", this.f48025H);
        bundle.putString("reply_button_text", this.f48026I);
        bundle.putString("reply_placeholder_text", this.f48027J);
        bundle.putBoolean("allowWhileIdle", this.f48028K);
        bundle.putBoolean("ignoreInForeground", this.f48029L);
        bundle.putString("userInfo", this.f48030M);
        return bundle;
    }

    public JSONObject k() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.f48031a);
            jSONObject.put(MetricTracker.Object.MESSAGE, this.f48032b);
            jSONObject.put("fireDate", this.f48033c);
            jSONObject.put(b.f37461S, this.f48034d);
            jSONObject.put("ticker", this.f48035e);
            jSONObject.put("showWhen", this.f48036f);
            jSONObject.put("autoCancel", this.f48037g);
            jSONObject.put("largeIcon", this.f48038h);
            jSONObject.put("largeIconUrl", this.f48039i);
            jSONObject.put("smallIcon", this.f48040j);
            jSONObject.put("bigText", this.f48041k);
            jSONObject.put("bigPictureUrl", this.f48043m);
            jSONObject.put("subText", this.f48042l);
            jSONObject.put("shortcutId", this.f48044n);
            jSONObject.put(AttributeType.NUMBER, this.f48045o);
            jSONObject.put("channelId", this.f48046p);
            jSONObject.put("sound", this.f48047q);
            jSONObject.put("color", this.f48048r);
            jSONObject.put("group", this.f48049s);
            jSONObject.put("groupSummary", this.f48050t);
            jSONObject.put("messageId", this.f48051u);
            jSONObject.put("playSound", this.f48052v);
            jSONObject.put("vibrate", this.f48053w);
            jSONObject.put("vibration", this.f48054x);
            jSONObject.put("actions", this.f48055y);
            jSONObject.put("invokeApp", this.f48056z);
            jSONObject.put("tag", this.f48018A);
            jSONObject.put("repeatType", this.f48019B);
            jSONObject.put("repeatTime", this.f48020C);
            jSONObject.put("when", this.f48021D);
            jSONObject.put("usesChronometer", this.f48022E);
            jSONObject.put("timeoutAfter", this.f48023F);
            jSONObject.put("onlyAlertOnce", this.f48024G);
            jSONObject.put("ongoing", this.f48025H);
            jSONObject.put("reply_button_text", this.f48026I);
            jSONObject.put("reply_placeholder_text", this.f48027J);
            jSONObject.put("allowWhileIdle", this.f48028K);
            jSONObject.put("ignoreInForeground", this.f48029L);
            jSONObject.put("userInfo", this.f48030M);
            return jSONObject;
        } catch (JSONException e10) {
            Log.e(RNPushNotification.LOG_TAG, "Exception while converting RNPushNotificationAttributes to JSON. Returning an empty object", e10);
            return new JSONObject();
        }
    }

    public String toString() {
        return "RNPushNotificationAttributes{id='" + this.f48031a + '\'' + ", message='" + this.f48032b + '\'' + ", fireDate=" + this.f48033c + ", title='" + this.f48034d + '\'' + ", ticker='" + this.f48035e + '\'' + ", showWhen=" + this.f48036f + ", autoCancel=" + this.f48037g + ", largeIcon='" + this.f48038h + '\'' + ", largeIconUrl='" + this.f48039i + '\'' + ", smallIcon='" + this.f48040j + '\'' + ", bigText='" + this.f48041k + '\'' + ", subText='" + this.f48042l + '\'' + ", bigPictureUrl='" + this.f48043m + '\'' + ", shortcutId='" + this.f48044n + '\'' + ", number='" + this.f48045o + '\'' + ", channelId='" + this.f48046p + '\'' + ", sound='" + this.f48047q + '\'' + ", color='" + this.f48048r + '\'' + ", group='" + this.f48049s + '\'' + ", groupSummary='" + this.f48050t + '\'' + ", messageId='" + this.f48051u + '\'' + ", playSound=" + this.f48052v + ", vibrate=" + this.f48053w + ", vibration=" + this.f48054x + ", actions='" + this.f48055y + '\'' + ", invokeApp=" + this.f48056z + ", tag='" + this.f48018A + '\'' + ", repeatType='" + this.f48019B + '\'' + ", repeatTime=" + this.f48020C + ", when=" + this.f48021D + ", usesChronometer=" + this.f48022E + ", timeoutAfter=" + this.f48023F + ", onlyAlertOnce=" + this.f48024G + ", ongoing=" + this.f48025H + ", reply_button_text=" + this.f48026I + ", reply_placeholder_text=" + this.f48027J + ", allowWhileIdle=" + this.f48028K + ", ignoreInForeground=" + this.f48029L + ", userInfo=" + this.f48030M + '}';
    }

    private C3987a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        String str = "color";
        String str2 = "sound";
        String str3 = "channelId";
        String str4 = AttributeType.NUMBER;
        try {
            String str5 = null;
            this.f48031a = jSONObject2.has("id") ? jSONObject2.getString("id") : null;
            this.f48032b = jSONObject2.has(MetricTracker.Object.MESSAGE) ? jSONObject2.getString(MetricTracker.Object.MESSAGE) : null;
            double d10 = 0.0d;
            this.f48033c = jSONObject2.has("fireDate") ? jSONObject2.getDouble("fireDate") : 0.0d;
            this.f48034d = jSONObject2.has(b.f37461S) ? jSONObject2.getString(b.f37461S) : null;
            this.f48035e = jSONObject2.has("ticker") ? jSONObject2.getString("ticker") : null;
            boolean z10 = true;
            this.f48036f = jSONObject2.has("showWhen") ? jSONObject2.getBoolean("showWhen") : true;
            this.f48037g = jSONObject2.has("autoCancel") ? jSONObject2.getBoolean("autoCancel") : true;
            this.f48038h = jSONObject2.has("largeIcon") ? jSONObject2.getString("largeIcon") : null;
            this.f48039i = jSONObject2.has("largeIconUrl") ? jSONObject2.getString("largeIconUrl") : null;
            this.f48040j = jSONObject2.has("smallIcon") ? jSONObject2.getString("smallIcon") : null;
            this.f48041k = jSONObject2.has("bigText") ? jSONObject2.getString("bigText") : null;
            this.f48042l = jSONObject2.has("subText") ? jSONObject2.getString("subText") : null;
            this.f48043m = jSONObject2.has("bigPictureUrl") ? jSONObject2.getString("bigPictureUrl") : null;
            this.f48044n = jSONObject2.has("shortcutId") ? jSONObject2.getString("shortcutId") : null;
            String str6 = str4;
            this.f48045o = jSONObject2.has(str6) ? jSONObject2.getString(str6) : null;
            String str7 = str3;
            this.f48046p = jSONObject2.has(str7) ? jSONObject2.getString(str7) : null;
            String str8 = str2;
            this.f48047q = jSONObject2.has(str8) ? jSONObject2.getString(str8) : null;
            String str9 = str;
            this.f48048r = jSONObject2.has(str9) ? jSONObject2.getString(str9) : null;
            this.f48049s = jSONObject2.has("group") ? jSONObject2.getString("group") : null;
            boolean z11 = false;
            this.f48050t = jSONObject2.has("groupSummary") ? jSONObject2.getBoolean("groupSummary") : false;
            this.f48051u = jSONObject2.has("messageId") ? jSONObject2.getString("messageId") : null;
            this.f48052v = jSONObject2.has("playSound") ? jSONObject2.getBoolean("playSound") : true;
            this.f48053w = jSONObject2.has("vibrate") ? jSONObject2.getBoolean("vibrate") : true;
            this.f48054x = jSONObject2.has("vibration") ? jSONObject2.getDouble("vibration") : 1000.0d;
            this.f48055y = jSONObject2.has("actions") ? jSONObject2.getString("actions") : null;
            this.f48056z = jSONObject2.has("invokeApp") ? jSONObject2.getBoolean("invokeApp") : z10;
            this.f48018A = jSONObject2.has("tag") ? jSONObject2.getString("tag") : null;
            this.f48019B = jSONObject2.has("repeatType") ? jSONObject2.getString("repeatType") : null;
            this.f48020C = jSONObject2.has("repeatTime") ? jSONObject2.getDouble("repeatTime") : d10;
            this.f48021D = jSONObject2.has("when") ? jSONObject2.getDouble("when") : -1.0d;
            this.f48022E = jSONObject2.has("usesChronometer") ? jSONObject2.getBoolean("usesChronometer") : false;
            this.f48023F = jSONObject2.has("timeoutAfter") ? jSONObject2.getDouble("timeoutAfter") : -1.0d;
            this.f48024G = jSONObject2.has("onlyAlertOnce") ? jSONObject2.getBoolean("onlyAlertOnce") : false;
            this.f48025H = jSONObject2.has("ongoing") ? jSONObject2.getBoolean("ongoing") : false;
            this.f48026I = jSONObject2.has("reply_button_text") ? jSONObject2.getString("reply_button_text") : null;
            this.f48027J = jSONObject2.has("reply_placeholder_text") ? jSONObject2.getString("reply_placeholder_text") : null;
            this.f48028K = jSONObject2.has("allowWhileIdle") ? jSONObject2.getBoolean("allowWhileIdle") : false;
            this.f48029L = jSONObject2.has("ignoreInForeground") ? jSONObject2.getBoolean("ignoreInForeground") : z11;
            this.f48030M = jSONObject2.has("userInfo") ? jSONObject2.getString("userInfo") : str5;
        } catch (JSONException e10) {
            throw new IllegalStateException("Exception while initializing RNPushNotificationAttributes from JSON", e10);
        }
    }
}
