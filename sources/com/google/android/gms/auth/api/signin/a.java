package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C4516b;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import ua.C5219b;
import va.q;
import va.r;

public abstract class a {
    public static b a(Context context, GoogleSignInOptions googleSignInOptions) {
        return new b(context, (GoogleSignInOptions) C4536s.l(googleSignInOptions));
    }

    public static GoogleSignInAccount b(Context context) {
        return r.c(context).a();
    }

    public static Task c(Intent intent) {
        C5219b d10 = q.d(intent);
        GoogleSignInAccount a10 = d10.a();
        if (!d10.getStatus().s0() || a10 == null) {
            return Tasks.forException(C4516b.a(d10.getStatus()));
        }
        return Tasks.forResult(a10);
    }

    public static void d(Activity activity, int i10, GoogleSignInAccount googleSignInAccount, Scope... scopeArr) {
        C4536s.m(activity, "Please provide a non-null Activity");
        C4536s.m(scopeArr, "Please provide at least one scope");
        activity.startActivityForResult(e(activity, googleSignInAccount, scopeArr), i10);
    }

    private static Intent e(Activity activity, GoogleSignInAccount googleSignInAccount, Scope... scopeArr) {
        GoogleSignInOptions.a aVar = new GoogleSignInOptions.a();
        if (scopeArr.length > 0) {
            aVar.e(scopeArr[0], scopeArr);
        }
        if (googleSignInAccount != null && !TextUtils.isEmpty(googleSignInAccount.j0())) {
            aVar.g((String) C4536s.l(googleSignInAccount.j0()));
        }
        return new b(activity, aVar.a()).d();
    }
}
