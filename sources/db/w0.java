package Db;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C4536s;
import com.google.firebase.auth.C4787g;
import java.util.Map;
import za.c;

public final class w0 implements C4787g {
    public static final Parcelable.Creator<w0> CREATOR = new v0();

    /* renamed from: a  reason: collision with root package name */
    private final String f50566a;

    /* renamed from: b  reason: collision with root package name */
    private final String f50567b;

    /* renamed from: c  reason: collision with root package name */
    private Map f50568c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f50569d;

    public w0(boolean z10) {
        this.f50569d = z10;
        this.f50567b = null;
        this.f50566a = null;
        this.f50568c = null;
    }

    public final boolean I() {
        return this.f50569d;
    }

    public final int describeContents() {
        return 0;
    }

    public final Map getProfile() {
        return this.f50568c;
    }

    public final String getUsername() {
        if ("github.com".equals(this.f50566a)) {
            return (String) this.f50568c.get("login");
        }
        if ("twitter.com".equals(this.f50566a)) {
            return (String) this.f50568c.get("screen_name");
        }
        return null;
    }

    public final String r() {
        return this.f50566a;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.D(parcel, 1, r(), false);
        c.D(parcel, 2, this.f50567b, false);
        c.g(parcel, 3, I());
        c.b(parcel, a10);
    }

    public w0(String str, String str2, boolean z10) {
        C4536s.f(str);
        C4536s.f(str2);
        this.f50566a = str;
        this.f50567b = str2;
        this.f50568c = H.d(str2);
        this.f50569d = z10;
    }
}
