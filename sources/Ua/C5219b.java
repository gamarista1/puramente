package ua;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.k;

/* renamed from: ua.b  reason: case insensitive filesystem */
public class C5219b implements k {

    /* renamed from: a  reason: collision with root package name */
    private final Status f61671a;

    /* renamed from: b  reason: collision with root package name */
    private final GoogleSignInAccount f61672b;

    public C5219b(GoogleSignInAccount googleSignInAccount, Status status) {
        this.f61672b = googleSignInAccount;
        this.f61671a = status;
    }

    public GoogleSignInAccount a() {
        return this.f61672b;
    }

    public Status getStatus() {
        return this.f61671a;
    }
}
