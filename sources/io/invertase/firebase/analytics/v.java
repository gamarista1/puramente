package io.invertase.firebase.analytics;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.invertase.firebase.common.b;
import java.util.EnumMap;
import java.util.Set;

public class v extends b {
    v(Context context, String str) {
        super(context, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void r(String str, Bundle bundle) {
        FirebaseAnalytics.getInstance(c()).c(str, bundle);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void s() {
        FirebaseAnalytics.getInstance(c()).d();
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void t(Boolean bool) {
        FirebaseAnalytics.getInstance(c()).e(bool.booleanValue());
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void u(Bundle bundle) {
        FirebaseAnalytics.a aVar;
        FirebaseAnalytics.a aVar2;
        FirebaseAnalytics.a aVar3;
        FirebaseAnalytics.a aVar4;
        boolean z10 = bundle.getBoolean("analytics_storage");
        boolean z11 = bundle.getBoolean("ad_storage");
        boolean z12 = bundle.getBoolean("ad_user_data");
        boolean z13 = bundle.getBoolean("ad_personalization");
        EnumMap enumMap = new EnumMap(FirebaseAnalytics.b.class);
        FirebaseAnalytics.b bVar = FirebaseAnalytics.b.ANALYTICS_STORAGE;
        if (z10) {
            aVar = FirebaseAnalytics.a.GRANTED;
        } else {
            aVar = FirebaseAnalytics.a.DENIED;
        }
        enumMap.put(bVar, aVar);
        FirebaseAnalytics.b bVar2 = FirebaseAnalytics.b.AD_STORAGE;
        if (z11) {
            aVar2 = FirebaseAnalytics.a.GRANTED;
        } else {
            aVar2 = FirebaseAnalytics.a.DENIED;
        }
        enumMap.put(bVar2, aVar2);
        FirebaseAnalytics.b bVar3 = FirebaseAnalytics.b.AD_USER_DATA;
        if (z12) {
            aVar3 = FirebaseAnalytics.a.GRANTED;
        } else {
            aVar3 = FirebaseAnalytics.a.DENIED;
        }
        enumMap.put(bVar3, aVar3);
        FirebaseAnalytics.b bVar4 = FirebaseAnalytics.b.AD_PERSONALIZATION;
        if (z13) {
            aVar4 = FirebaseAnalytics.a.GRANTED;
        } else {
            aVar4 = FirebaseAnalytics.a.DENIED;
        }
        enumMap.put(bVar4, aVar4);
        FirebaseAnalytics.getInstance(c()).f(enumMap);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void v(Bundle bundle) {
        FirebaseAnalytics.getInstance(c()).g(bundle);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void w(long j10) {
        FirebaseAnalytics.getInstance(c()).h(j10);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void x(String str) {
        FirebaseAnalytics.getInstance(c()).i(str);
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void y(Bundle bundle) {
        Set<String> keySet = bundle.keySet();
        FirebaseAnalytics instance = FirebaseAnalytics.getInstance(c());
        for (String next : keySet) {
            instance.j(next, (String) bundle.get(next));
        }
        return null;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Void z(String str, String str2) {
        FirebaseAnalytics.getInstance(c()).j(str, str2);
        return null;
    }

    /* access modifiers changed from: package-private */
    public Task A(String str, Bundle bundle) {
        return Tasks.call(new r(this, str, bundle));
    }

    /* access modifiers changed from: package-private */
    public Task B() {
        return Tasks.call(new n(this));
    }

    /* access modifiers changed from: package-private */
    public Task C(Boolean bool) {
        return Tasks.call(new p(this, bool));
    }

    /* access modifiers changed from: package-private */
    public Task D(Bundle bundle) {
        return Tasks.call(new o(this, bundle));
    }

    /* access modifiers changed from: package-private */
    public Task E(Bundle bundle) {
        return Tasks.call(new t(this, bundle));
    }

    /* access modifiers changed from: package-private */
    public Task F(long j10) {
        return Tasks.call(new u(this, j10));
    }

    /* access modifiers changed from: package-private */
    public Task G(String str) {
        return Tasks.call(new q(this, str));
    }

    /* access modifiers changed from: package-private */
    public Task H(Bundle bundle) {
        return Tasks.call(new m(this, bundle));
    }

    /* access modifiers changed from: package-private */
    public Task I(String str, String str2) {
        return Tasks.call(new s(this, str, str2));
    }

    /* access modifiers changed from: package-private */
    public Task p() {
        return FirebaseAnalytics.getInstance(c()).a();
    }

    /* access modifiers changed from: package-private */
    public Task q() {
        return FirebaseAnalytics.getInstance(c()).b();
    }
}
