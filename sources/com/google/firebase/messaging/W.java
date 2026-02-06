package com.google.firebase.messaging;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.C1587a;
import com.google.firebase.messaging.C4824e;
import io.intercom.android.sdk.m5.navigation.TicketDetailDestinationKt;
import java.util.Map;
import za.C5298a;

public final class W extends C5298a {
    public static final Parcelable.Creator<W> CREATOR = new X();

    /* renamed from: a  reason: collision with root package name */
    Bundle f57439a;

    /* renamed from: b  reason: collision with root package name */
    private Map f57440b;

    /* renamed from: c  reason: collision with root package name */
    private c f57441c;

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Bundle f57442a;

        /* renamed from: b  reason: collision with root package name */
        private final Map f57443b = new C1587a();

        public b(String str) {
            Bundle bundle = new Bundle();
            this.f57442a = bundle;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("google.to", str);
                return;
            }
            throw new IllegalArgumentException("Invalid to: " + str);
        }

        public b a(String str, String str2) {
            this.f57443b.put(str, str2);
            return this;
        }

        public W b() {
            Bundle bundle = new Bundle();
            for (Map.Entry entry : this.f57443b.entrySet()) {
                bundle.putString((String) entry.getKey(), (String) entry.getValue());
            }
            bundle.putAll(this.f57442a);
            this.f57442a.remove(TicketDetailDestinationKt.LAUNCHED_FROM);
            return new W(bundle);
        }

        public b c(String str) {
            this.f57442a.putString("collapse_key", str);
            return this;
        }

        public b d(String str) {
            this.f57442a.putString("google.message_id", str);
            return this;
        }

        public b e(String str) {
            this.f57442a.putString("message_type", str);
            return this;
        }

        public b f(int i10) {
            this.f57442a.putString("google.ttl", String.valueOf(i10));
            return this;
        }
    }

    public static class c {

        /* renamed from: a  reason: collision with root package name */
        private final String f57444a;

        /* renamed from: b  reason: collision with root package name */
        private final String f57445b;

        /* renamed from: c  reason: collision with root package name */
        private final String[] f57446c;

        /* renamed from: d  reason: collision with root package name */
        private final String f57447d;

        /* renamed from: e  reason: collision with root package name */
        private final String f57448e;

        /* renamed from: f  reason: collision with root package name */
        private final String[] f57449f;

        /* renamed from: g  reason: collision with root package name */
        private final String f57450g;

        /* renamed from: h  reason: collision with root package name */
        private final String f57451h;

        /* renamed from: i  reason: collision with root package name */
        private final String f57452i;

        /* renamed from: j  reason: collision with root package name */
        private final String f57453j;

        /* renamed from: k  reason: collision with root package name */
        private final String f57454k;

        /* renamed from: l  reason: collision with root package name */
        private final String f57455l;

        /* renamed from: m  reason: collision with root package name */
        private final String f57456m;

        /* renamed from: n  reason: collision with root package name */
        private final Uri f57457n;

        /* renamed from: o  reason: collision with root package name */
        private final String f57458o;

        /* renamed from: p  reason: collision with root package name */
        private final Integer f57459p;

        /* renamed from: q  reason: collision with root package name */
        private final Integer f57460q;

        /* renamed from: r  reason: collision with root package name */
        private final Integer f57461r;

        /* renamed from: s  reason: collision with root package name */
        private final int[] f57462s;

        /* renamed from: t  reason: collision with root package name */
        private final Long f57463t;

        /* renamed from: u  reason: collision with root package name */
        private final boolean f57464u;

        /* renamed from: v  reason: collision with root package name */
        private final boolean f57465v;

        /* renamed from: w  reason: collision with root package name */
        private final boolean f57466w;

        /* renamed from: x  reason: collision with root package name */
        private final boolean f57467x;

        /* renamed from: y  reason: collision with root package name */
        private final boolean f57468y;

        /* renamed from: z  reason: collision with root package name */
        private final long[] f57469z;

        private static String[] j(N n10, String str) {
            Object[] g10 = n10.g(str);
            if (g10 == null) {
                return null;
            }
            String[] strArr = new String[g10.length];
            for (int i10 = 0; i10 < g10.length; i10++) {
                strArr[i10] = String.valueOf(g10[i10]);
            }
            return strArr;
        }

        public String a() {
            return this.f57447d;
        }

        public String[] b() {
            return this.f57449f;
        }

        public String c() {
            return this.f57448e;
        }

        public String d() {
            return this.f57456m;
        }

        public String e() {
            return this.f57455l;
        }

        public String f() {
            return this.f57454k;
        }

        public String g() {
            return this.f57450g;
        }

        public Uri h() {
            String str = this.f57451h;
            if (str != null) {
                return Uri.parse(str);
            }
            return null;
        }

        public Uri i() {
            return this.f57457n;
        }

        public Integer k() {
            return this.f57461r;
        }

        public Integer l() {
            return this.f57459p;
        }

        public String m() {
            return this.f57452i;
        }

        public String n() {
            return this.f57458o;
        }

        public String o() {
            return this.f57444a;
        }

        public String[] p() {
            return this.f57446c;
        }

        public String q() {
            return this.f57445b;
        }

        public Integer r() {
            return this.f57460q;
        }

        private c(N n10) {
            this.f57444a = n10.p("gcm.n.title");
            this.f57445b = n10.h("gcm.n.title");
            this.f57446c = j(n10, "gcm.n.title");
            this.f57447d = n10.p("gcm.n.body");
            this.f57448e = n10.h("gcm.n.body");
            this.f57449f = j(n10, "gcm.n.body");
            this.f57450g = n10.p("gcm.n.icon");
            this.f57452i = n10.o();
            this.f57453j = n10.p("gcm.n.tag");
            this.f57454k = n10.p("gcm.n.color");
            this.f57455l = n10.p("gcm.n.click_action");
            this.f57456m = n10.p("gcm.n.android_channel_id");
            this.f57457n = n10.f();
            this.f57451h = n10.p("gcm.n.image");
            this.f57458o = n10.p("gcm.n.ticker");
            this.f57459p = n10.b("gcm.n.notification_priority");
            this.f57460q = n10.b("gcm.n.visibility");
            this.f57461r = n10.b("gcm.n.notification_count");
            this.f57464u = n10.a("gcm.n.sticky");
            this.f57465v = n10.a("gcm.n.local_only");
            this.f57466w = n10.a("gcm.n.default_sound");
            this.f57467x = n10.a("gcm.n.default_vibrate_timings");
            this.f57468y = n10.a("gcm.n.default_light_settings");
            this.f57463t = n10.j("gcm.n.event_time");
            this.f57462s = n10.e();
            this.f57469z = n10.q();
        }
    }

    public W(Bundle bundle) {
        this.f57439a = bundle;
    }

    public String o0() {
        return this.f57439a.getString("collapse_key");
    }

    public Map p0() {
        if (this.f57440b == null) {
            this.f57440b = C4824e.a.a(this.f57439a);
        }
        return this.f57440b;
    }

    public String q0() {
        return this.f57439a.getString(TicketDetailDestinationKt.LAUNCHED_FROM);
    }

    public String r0() {
        String string = this.f57439a.getString("google.message_id");
        if (string == null) {
            return this.f57439a.getString("message_id");
        }
        return string;
    }

    public String s0() {
        return this.f57439a.getString("message_type");
    }

    public c t0() {
        if (this.f57441c == null && N.t(this.f57439a)) {
            this.f57441c = new c(new N(this.f57439a));
        }
        return this.f57441c;
    }

    public long u0() {
        Object obj = this.f57439a.get("google.sent_time");
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Long.parseLong((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid sent time: " + obj);
            return 0;
        }
    }

    public String v0() {
        return this.f57439a.getString("google.to");
    }

    public int w0() {
        Object obj = this.f57439a.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
            return 0;
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
        X.c(this, parcel, i10);
    }

    /* access modifiers changed from: package-private */
    public void x0(Intent intent) {
        intent.putExtras(this.f57439a);
    }
}
