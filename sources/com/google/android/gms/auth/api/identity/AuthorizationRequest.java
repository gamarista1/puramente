package com.google.android.gms.auth.api.identity;

import android.accounts.Account;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4535q;
import com.google.android.gms.common.internal.C4536s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.List;
import za.C5298a;
import za.c;

public class AuthorizationRequest extends C5298a implements ReflectedParcelable {
    public static final Parcelable.Creator<AuthorizationRequest> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final List f53797a;

    /* renamed from: b  reason: collision with root package name */
    private final String f53798b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f53799c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f53800d;

    /* renamed from: e  reason: collision with root package name */
    private final Account f53801e;

    /* renamed from: f  reason: collision with root package name */
    private final String f53802f;

    /* renamed from: g  reason: collision with root package name */
    private final String f53803g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f53804h;

    /* renamed from: i  reason: collision with root package name */
    private final Bundle f53805i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f53806j;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private List f53807a;

        /* renamed from: b  reason: collision with root package name */
        private String f53808b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f53809c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f53810d;

        /* renamed from: e  reason: collision with root package name */
        private Account f53811e;

        /* renamed from: f  reason: collision with root package name */
        private String f53812f;

        /* renamed from: g  reason: collision with root package name */
        private String f53813g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f53814h;

        /* renamed from: i  reason: collision with root package name */
        private Bundle f53815i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f53816j;

        private final String j(String str) {
            C4536s.l(str);
            String str2 = this.f53808b;
            boolean z10 = true;
            if (str2 != null && !str2.equals(str)) {
                z10 = false;
            }
            C4536s.b(z10, "two different server client ids provided");
            return str;
        }

        public a a(b bVar, String str) {
            C4536s.m(bVar, "Resource parameter cannot be null");
            C4536s.m(str, "Resource parameter value cannot be null");
            if (this.f53815i == null) {
                this.f53815i = new Bundle();
            }
            this.f53815i.putString(bVar.f53820a, str);
            return this;
        }

        public AuthorizationRequest b() {
            return new AuthorizationRequest(this.f53807a, this.f53808b, this.f53809c, this.f53810d, this.f53811e, this.f53812f, this.f53813g, this.f53814h, this.f53815i, this.f53816j);
        }

        public a c(String str) {
            this.f53812f = C4536s.f(str);
            return this;
        }

        public a d(String str, boolean z10) {
            j(str);
            this.f53808b = str;
            this.f53809c = true;
            this.f53814h = z10;
            return this;
        }

        public a e(Account account) {
            this.f53811e = (Account) C4536s.l(account);
            return this;
        }

        public a f(boolean z10) {
            this.f53816j = z10;
            return this;
        }

        public a g(List list) {
            boolean z10 = false;
            if (list != null && !list.isEmpty()) {
                z10 = true;
            }
            C4536s.b(z10, "requestedScopes cannot be null or empty");
            this.f53807a = list;
            return this;
        }

        public final a h(String str) {
            j(str);
            this.f53808b = str;
            this.f53810d = true;
            return this;
        }

        public final a i(String str) {
            this.f53813g = str;
            return this;
        }
    }

    public enum b {
        ACCOUNT_SELECTION_TOKEN("account_selection_token"),
        ACCOUNT_SELECTION_STATE("account_selection_state");
        

        /* renamed from: a  reason: collision with root package name */
        final String f53820a;

        private b(String str) {
            this.f53820a = str;
        }
    }

    AuthorizationRequest(List list, String str, boolean z10, boolean z11, Account account, String str2, String str3, boolean z12, Bundle bundle, boolean z13) {
        boolean z14 = false;
        if (list != null && !list.isEmpty()) {
            z14 = true;
        }
        C4536s.b(z14, "requestedScopes cannot be null or empty");
        this.f53797a = list;
        this.f53798b = str;
        this.f53799c = z10;
        this.f53800d = z11;
        this.f53801e = account;
        this.f53802f = str2;
        this.f53803g = str3;
        this.f53804h = z12;
        this.f53805i = bundle;
        this.f53806j = z13;
    }

    public static a o0() {
        return new a();
    }

    public static a x0(AuthorizationRequest authorizationRequest) {
        b bVar;
        C4536s.l(authorizationRequest);
        a o02 = o0();
        o02.g(authorizationRequest.s0());
        Bundle t02 = authorizationRequest.t0();
        if (t02 != null) {
            for (String next : t02.keySet()) {
                String string = t02.getString(next);
                b[] values = b.values();
                int length = values.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        bVar = null;
                        break;
                    }
                    bVar = values[i10];
                    if (bVar.f53820a.equals(next)) {
                        break;
                    }
                    i10++;
                }
                if (!(string == null || bVar == null)) {
                    o02.a(bVar, string);
                }
            }
        }
        boolean v02 = authorizationRequest.v0();
        String str = authorizationRequest.f53803g;
        String q02 = authorizationRequest.q0();
        Account p02 = authorizationRequest.p0();
        String u02 = authorizationRequest.u0();
        if (str != null) {
            o02.i(str);
        }
        if (q02 != null) {
            o02.c(q02);
        }
        if (p02 != null) {
            o02.e(p02);
        }
        if (authorizationRequest.f53800d && u02 != null) {
            o02.h(u02);
        }
        if (authorizationRequest.w0() && u02 != null) {
            o02.d(u02, v02);
        }
        o02.f(authorizationRequest.f53806j);
        return o02;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthorizationRequest)) {
            return false;
        }
        AuthorizationRequest authorizationRequest = (AuthorizationRequest) obj;
        if (this.f53797a.size() == authorizationRequest.f53797a.size() && this.f53797a.containsAll(authorizationRequest.f53797a)) {
            Bundle bundle = authorizationRequest.f53805i;
            Bundle bundle2 = this.f53805i;
            if (bundle2 == null) {
                if (bundle == null) {
                    bundle = null;
                }
                return false;
            }
            if (bundle2 == null || bundle != null) {
                if (bundle2 != null) {
                    if (bundle2.size() != bundle.size()) {
                        return false;
                    }
                    for (String next : this.f53805i.keySet()) {
                        if (!C4535q.b(this.f53805i.getString(next), bundle.getString(next))) {
                            return false;
                        }
                    }
                }
                if (this.f53799c != authorizationRequest.f53799c || this.f53804h != authorizationRequest.f53804h || this.f53800d != authorizationRequest.f53800d || this.f53806j != authorizationRequest.f53806j || !C4535q.b(this.f53798b, authorizationRequest.f53798b) || !C4535q.b(this.f53801e, authorizationRequest.f53801e) || !C4535q.b(this.f53802f, authorizationRequest.f53802f) || !C4535q.b(this.f53803g, authorizationRequest.f53803g)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return C4535q.c(this.f53797a, this.f53798b, Boolean.valueOf(this.f53799c), Boolean.valueOf(this.f53804h), Boolean.valueOf(this.f53800d), this.f53801e, this.f53802f, this.f53803g, this.f53805i, Boolean.valueOf(this.f53806j));
    }

    public Account p0() {
        return this.f53801e;
    }

    public String q0() {
        return this.f53802f;
    }

    public boolean r0() {
        return this.f53806j;
    }

    public List s0() {
        return this.f53797a;
    }

    public Bundle t0() {
        return this.f53805i;
    }

    public String u0() {
        return this.f53798b;
    }

    public boolean v0() {
        return this.f53804h;
    }

    public boolean w0() {
        return this.f53799c;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.H(parcel, 1, s0(), false);
        c.D(parcel, 2, u0(), false);
        c.g(parcel, 3, w0());
        c.g(parcel, 4, this.f53800d);
        c.B(parcel, 5, p0(), i10, false);
        c.D(parcel, 6, q0(), false);
        c.D(parcel, 7, this.f53803g, false);
        c.g(parcel, 8, v0());
        c.j(parcel, 9, t0(), false);
        c.g(parcel, 10, r0());
        c.b(parcel, a10);
    }
}
