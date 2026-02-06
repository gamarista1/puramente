package com.google.firebase.auth;

import Db.C4265m;
import android.app.Activity;
import com.google.android.gms.common.internal.C4536s;
import com.google.firebase.auth.Q;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class P {

    /* renamed from: a  reason: collision with root package name */
    private final FirebaseAuth f56942a;

    /* renamed from: b  reason: collision with root package name */
    private Long f56943b;

    /* renamed from: c  reason: collision with root package name */
    private Q.b f56944c;

    /* renamed from: d  reason: collision with root package name */
    private Executor f56945d;

    /* renamed from: e  reason: collision with root package name */
    private String f56946e;

    /* renamed from: f  reason: collision with root package name */
    private Activity f56947f;

    /* renamed from: g  reason: collision with root package name */
    private Q.a f56948g;

    /* renamed from: h  reason: collision with root package name */
    private L f56949h;

    /* renamed from: i  reason: collision with root package name */
    private U f56950i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f56951j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f56952k;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final FirebaseAuth f56953a;

        /* renamed from: b  reason: collision with root package name */
        private String f56954b;

        /* renamed from: c  reason: collision with root package name */
        private Long f56955c;

        /* renamed from: d  reason: collision with root package name */
        private Q.b f56956d;

        /* renamed from: e  reason: collision with root package name */
        private Executor f56957e;

        /* renamed from: f  reason: collision with root package name */
        private Activity f56958f;

        /* renamed from: g  reason: collision with root package name */
        private Q.a f56959g;

        /* renamed from: h  reason: collision with root package name */
        private L f56960h;

        /* renamed from: i  reason: collision with root package name */
        private U f56961i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f56962j;

        public a(FirebaseAuth firebaseAuth) {
            this.f56953a = (FirebaseAuth) C4536s.l(firebaseAuth);
        }

        public final P a() {
            boolean z10;
            C4536s.m(this.f56953a, "FirebaseAuth instance cannot be null");
            C4536s.m(this.f56955c, "You must specify an auto-retrieval timeout; please call #setTimeout()");
            C4536s.m(this.f56956d, "You must specify callbacks on your PhoneAuthOptions. Please call #setCallbacks()");
            this.f56957e = this.f56953a.D0();
            if (this.f56955c.longValue() < 0 || this.f56955c.longValue() > 120) {
                throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
            }
            L l10 = this.f56960h;
            boolean z11 = false;
            if (l10 == null) {
                C4536s.g(this.f56954b, "The given phoneNumber is empty. Please set a non-empty phone number with #setPhoneNumber()");
                C4536s.b(!this.f56962j, "You cannot require sms validation without setting a multi-factor session.");
                if (this.f56961i == null) {
                    z11 = true;
                }
                C4536s.b(z11, "A phoneMultiFactorInfo must be set for second factor sign-in.");
            } else if (l10 == null || !((C4265m) l10).r0()) {
                if (this.f56961i != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                C4536s.b(z10, "A phoneMultiFactorInfo must be set for second factor sign-in.");
                if (this.f56954b == null) {
                    z11 = true;
                }
                C4536s.b(z11, "A phone number must not be set for MFA sign-in. A PhoneMultiFactorInfo should be set instead.");
            } else {
                C4536s.f(this.f56954b);
                if (this.f56961i == null) {
                    z11 = true;
                }
                C4536s.b(z11, "Invalid MultiFactorSession - use the getSession method in MultiFactorResolver to get a valid sign-in session.");
            }
            return new P(this.f56953a, this.f56955c, this.f56956d, this.f56957e, this.f56954b, this.f56958f, this.f56959g, this.f56960h, this.f56961i, this.f56962j);
        }

        public final a b(boolean z10) {
            this.f56962j = z10;
            return this;
        }

        public final a c(Activity activity) {
            this.f56958f = activity;
            return this;
        }

        public final a d(Q.b bVar) {
            this.f56956d = bVar;
            return this;
        }

        public final a e(Q.a aVar) {
            this.f56959g = aVar;
            return this;
        }

        public final a f(U u10) {
            this.f56961i = u10;
            return this;
        }

        public final a g(L l10) {
            this.f56960h = l10;
            return this;
        }

        public final a h(String str) {
            this.f56954b = str;
            return this;
        }

        public final a i(Long l10, TimeUnit timeUnit) {
            this.f56955c = Long.valueOf(TimeUnit.SECONDS.convert(l10.longValue(), timeUnit));
            return this;
        }
    }

    public static a a(FirebaseAuth firebaseAuth) {
        return new a(firebaseAuth);
    }

    public final Activity b() {
        return this.f56947f;
    }

    public final void c(boolean z10) {
        this.f56952k = true;
    }

    public final FirebaseAuth d() {
        return this.f56942a;
    }

    public final L e() {
        return this.f56949h;
    }

    public final Q.a f() {
        return this.f56948g;
    }

    public final Q.b g() {
        return this.f56944c;
    }

    public final U h() {
        return this.f56950i;
    }

    public final Long i() {
        return this.f56943b;
    }

    public final String j() {
        return this.f56946e;
    }

    public final Executor k() {
        return this.f56945d;
    }

    public final boolean l() {
        return this.f56952k;
    }

    public final boolean m() {
        return this.f56951j;
    }

    public final boolean n() {
        if (this.f56949h != null) {
            return true;
        }
        return false;
    }

    private P(FirebaseAuth firebaseAuth, Long l10, Q.b bVar, Executor executor, String str, Activity activity, Q.a aVar, L l11, U u10, boolean z10) {
        this.f56942a = firebaseAuth;
        this.f56946e = str;
        this.f56943b = l10;
        this.f56944c = bVar;
        this.f56947f = activity;
        this.f56945d = executor;
        this.f56948g = aVar;
        this.f56949h = l11;
        this.f56950i = u10;
        this.f56951j = z10;
    }
}
