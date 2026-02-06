package oa;

import android.content.Intent;
import com.google.android.gms.auth.UserRecoverableAuthException;

public class f extends UserRecoverableAuthException {

    /* renamed from: d  reason: collision with root package name */
    private final int f61159d;

    f(int i10, String str, Intent intent) {
        super(str, intent);
        this.f61159d = i10;
    }
}
