package oa;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;

public final /* synthetic */ class l implements n {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Account f61177a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f61178b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Bundle f61179c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Context f61180d;

    public /* synthetic */ l(Account account, String str, Bundle bundle, Context context) {
        this.f61177a = account;
        this.f61178b = str;
        this.f61179c = bundle;
        this.f61180d = context;
    }

    public final Object a(IBinder iBinder) {
        return o.e(this.f61177a, this.f61178b, this.f61179c, this.f61180d, iBinder);
    }
}
