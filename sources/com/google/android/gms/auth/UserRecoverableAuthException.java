package com.google.android.gms.auth;

import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.C4536s;
import oa.d;

@KeepName
public class UserRecoverableAuthException extends d {

    /* renamed from: a  reason: collision with root package name */
    private final Intent f53790a;

    /* renamed from: b  reason: collision with root package name */
    private final PendingIntent f53791b;

    /* renamed from: c  reason: collision with root package name */
    private final b f53792c;

    public UserRecoverableAuthException(String str, Intent intent) {
        this(str, intent, (PendingIntent) null, b.LEGACY);
    }

    public static UserRecoverableAuthException b(String str, Intent intent, PendingIntent pendingIntent) {
        C4536s.l(intent);
        C4536s.l(pendingIntent);
        return new UserRecoverableAuthException(str, intent, pendingIntent, b.AUTH_INSTANTIATION);
    }

    public Intent a() {
        Intent intent = this.f53790a;
        if (intent != null) {
            return new Intent(intent);
        }
        int ordinal = this.f53792c.ordinal();
        if (ordinal == 0) {
            Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
            return null;
        } else if (ordinal == 1) {
            Log.e("Auth", "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.");
            return null;
        } else if (ordinal != 2) {
            return null;
        } else {
            Log.e("Auth", "this instantiation of UserRecoverableAuthException doesn't support an Intent.");
            return null;
        }
    }

    private UserRecoverableAuthException(String str, Intent intent, PendingIntent pendingIntent, b bVar) {
        super(str);
        this.f53791b = pendingIntent;
        this.f53790a = intent;
        this.f53792c = (b) C4536s.l(bVar);
    }
}
