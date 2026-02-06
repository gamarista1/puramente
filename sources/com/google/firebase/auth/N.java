package com.google.firebase.auth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.internal.p002firebaseauthapi.zzact;
import com.google.android.gms.internal.p002firebaseauthapi.zzaec;
import com.google.firebase.auth.internal.GenericIdpActivity;
import java.util.ArrayList;
import java.util.List;

public class N extends C4801n {

    /* renamed from: a  reason: collision with root package name */
    private final Bundle f56923a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final FirebaseAuth f56924a;

        /* renamed from: b  reason: collision with root package name */
        private final Bundle f56925b;

        /* renamed from: c  reason: collision with root package name */
        private final Bundle f56926c;

        public a a(String str, String str2) {
            this.f56926c.putString(str, str2);
            return this;
        }

        public N b() {
            return new N(this.f56925b);
        }

        public a c(List list) {
            this.f56925b.putStringArrayList("com.google.firebase.auth.KEY_PROVIDER_SCOPES", new ArrayList(list));
            return this;
        }

        private a(String str, FirebaseAuth firebaseAuth) {
            Bundle bundle = new Bundle();
            this.f56925b = bundle;
            Bundle bundle2 = new Bundle();
            this.f56926c = bundle2;
            this.f56924a = firebaseAuth;
            bundle.putString("com.google.firebase.auth.KEY_API_KEY", firebaseAuth.j().r().b());
            bundle.putString("com.google.firebase.auth.KEY_PROVIDER_ID", str);
            bundle.putBundle("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS", bundle2);
            bundle.putString("com.google.firebase.auth.internal.CLIENT_VERSION", zzact.zza().zzb());
            bundle.putString("com.google.firebase.auth.KEY_TENANT_ID", firebaseAuth.p());
            bundle.putString("com.google.firebase.auth.KEY_FIREBASE_APP_NAME", firebaseAuth.j().q());
            bundle.putString("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", firebaseAuth.l());
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f56927a;

        /* renamed from: b  reason: collision with root package name */
        private String f56928b;

        /* renamed from: c  reason: collision with root package name */
        private String f56929c;

        /* renamed from: d  reason: collision with root package name */
        private String f56930d;

        public C4789h a() {
            return C0.x0(this.f56927a, this.f56928b, this.f56929c, this.f56930d);
        }

        public b b(String str) {
            this.f56928b = str;
            return this;
        }

        public b c(String str, String str2) {
            this.f56928b = str;
            this.f56930d = str2;
            return this;
        }

        private b(String str) {
            this.f56927a = str;
        }
    }

    public static C4789h d(String str, String str2, String str3) {
        return C0.w0(str, str2, str3);
    }

    public static a e(String str, FirebaseAuth firebaseAuth) {
        C4536s.f(str);
        C4536s.l(firebaseAuth);
        if (!"facebook.com".equals(str) || zzaec.zza(firebaseAuth.j())) {
            return new a(str, firebaseAuth);
        }
        throw new IllegalArgumentException("Sign in with Facebook is not supported via this method; the Facebook TOS dictate that you must use the Facebook Android SDK for Facebook login.");
    }

    public static b f(String str) {
        return new b(C4536s.f(str));
    }

    public final void a(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_LINK");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f56923a);
        activity.startActivity(intent);
    }

    public final void b(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f56923a);
        activity.startActivity(intent);
    }

    public final void c(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f56923a);
        activity.startActivity(intent);
    }

    private N(Bundle bundle) {
        this.f56923a = bundle;
    }
}
