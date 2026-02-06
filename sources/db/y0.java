package Db;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.C4536s;
import com.google.firebase.auth.A;
import com.google.firebase.auth.C0;
import com.google.firebase.auth.C4787g;
import com.google.firebase.auth.C4791i;
import java.util.List;
import za.c;

public final class y0 implements C4791i {
    public static final Parcelable.Creator<y0> CREATOR = new x0();

    /* renamed from: a  reason: collision with root package name */
    private C4258f f50575a;

    /* renamed from: b  reason: collision with root package name */
    private w0 f50576b;

    /* renamed from: c  reason: collision with root package name */
    private C0 f50577c;

    public y0(C4258f fVar) {
        C4258f fVar2 = (C4258f) C4536s.l(fVar);
        this.f50575a = fVar2;
        List X02 = fVar2.X0();
        this.f50576b = null;
        for (int i10 = 0; i10 < X02.size(); i10++) {
            if (!TextUtils.isEmpty(((A0) X02.get(i10)).zza())) {
                this.f50576b = new w0(((A0) X02.get(i10)).r(), ((A0) X02.get(i10)).zza(), fVar.Y0());
            }
        }
        if (this.f50576b == null) {
            this.f50576b = new w0(fVar.Y0());
        }
        this.f50577c = fVar.V0();
    }

    public final A H() {
        return this.f50575a;
    }

    public final C4787g a0() {
        return this.f50576b;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 1, H(), i10, false);
        c.B(parcel, 2, a0(), i10, false);
        c.B(parcel, 3, this.f50577c, i10, false);
        c.b(parcel, a10);
    }

    y0(C4258f fVar, w0 w0Var, C0 c02) {
        this.f50575a = fVar;
        this.f50576b = w0Var;
        this.f50577c = c02;
    }
}
