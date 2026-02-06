package oa;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import za.C5298a;
import za.c;

public class b extends C5298a {
    public static final Parcelable.Creator<b> CREATOR = new h();

    /* renamed from: a  reason: collision with root package name */
    final int f61153a;

    /* renamed from: b  reason: collision with root package name */
    int f61154b;

    /* renamed from: c  reason: collision with root package name */
    String f61155c;

    /* renamed from: d  reason: collision with root package name */
    Account f61156d;

    b(int i10, int i11, String str, Account account) {
        this.f61153a = i10;
        this.f61154b = i11;
        this.f61155c = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f61156d = account;
        } else {
            this.f61156d = new Account(str, "com.google");
        }
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.t(parcel, 1, this.f61153a);
        c.t(parcel, 2, this.f61154b);
        c.D(parcel, 3, this.f61155c, false);
        c.B(parcel, 4, this.f61156d, i10, false);
        c.b(parcel, a10);
    }
}
