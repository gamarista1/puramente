package ub;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.common.internal.C4539v;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final String f61697a;

    /* renamed from: b  reason: collision with root package name */
    private final String f61698b;

    /* renamed from: c  reason: collision with root package name */
    private final String f61699c;

    /* renamed from: d  reason: collision with root package name */
    private final String f61700d;

    /* renamed from: e  reason: collision with root package name */
    private final String f61701e;

    /* renamed from: f  reason: collision with root package name */
    private final String f61702f;

    /* renamed from: g  reason: collision with root package name */
    private final String f61703g;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private String f61704a;

        /* renamed from: b  reason: collision with root package name */
        private String f61705b;

        /* renamed from: c  reason: collision with root package name */
        private String f61706c;

        /* renamed from: d  reason: collision with root package name */
        private String f61707d;

        /* renamed from: e  reason: collision with root package name */
        private String f61708e;

        /* renamed from: f  reason: collision with root package name */
        private String f61709f;

        /* renamed from: g  reason: collision with root package name */
        private String f61710g;

        public p a() {
            return new p(this.f61705b, this.f61704a, this.f61706c, this.f61707d, this.f61708e, this.f61709f, this.f61710g);
        }

        public b b(String str) {
            this.f61704a = C4536s.g(str, "ApiKey must be set.");
            return this;
        }

        public b c(String str) {
            this.f61705b = C4536s.g(str, "ApplicationId must be set.");
            return this;
        }

        public b d(String str) {
            this.f61706c = str;
            return this;
        }

        public b e(String str) {
            this.f61707d = str;
            return this;
        }

        public b f(String str) {
            this.f61708e = str;
            return this;
        }

        public b g(String str) {
            this.f61710g = str;
            return this;
        }

        public b h(String str) {
            this.f61709f = str;
            return this;
        }
    }

    public static p a(Context context) {
        C4539v vVar = new C4539v(context);
        String a10 = vVar.a("google_app_id");
        if (TextUtils.isEmpty(a10)) {
            return null;
        }
        return new p(a10, vVar.a("google_api_key"), vVar.a("firebase_database_url"), vVar.a("ga_trackingId"), vVar.a("gcm_defaultSenderId"), vVar.a("google_storage_bucket"), vVar.a("project_id"));
    }

    public String b() {
        return this.f61697a;
    }

    public String c() {
        return this.f61698b;
    }

    public String d() {
        return this.f61699c;
    }

    public String e() {
        return this.f61700d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (!C4535q.b(this.f61698b, pVar.f61698b) || !C4535q.b(this.f61697a, pVar.f61697a) || !C4535q.b(this.f61699c, pVar.f61699c) || !C4535q.b(this.f61700d, pVar.f61700d) || !C4535q.b(this.f61701e, pVar.f61701e) || !C4535q.b(this.f61702f, pVar.f61702f) || !C4535q.b(this.f61703g, pVar.f61703g)) {
            return false;
        }
        return true;
    }

    public String f() {
        return this.f61701e;
    }

    public String g() {
        return this.f61703g;
    }

    public String h() {
        return this.f61702f;
    }

    public int hashCode() {
        return C4535q.c(this.f61698b, this.f61697a, this.f61699c, this.f61700d, this.f61701e, this.f61702f, this.f61703g);
    }

    public String toString() {
        return C4535q.d(this).a("applicationId", this.f61698b).a("apiKey", this.f61697a).a("databaseUrl", this.f61699c).a("gcmSenderId", this.f61701e).a("storageBucket", this.f61702f).a("projectId", this.f61703g).toString();
    }

    private p(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        C4536s.p(!Ea.p.b(str), "ApplicationId must be set.");
        this.f61698b = str;
        this.f61697a = str2;
        this.f61699c = str3;
        this.f61700d = str4;
        this.f61701e = str5;
        this.f61702f = str6;
        this.f61703g = str7;
    }
}
