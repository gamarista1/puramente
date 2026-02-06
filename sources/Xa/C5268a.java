package xa;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import za.C5298a;
import za.c;

/* renamed from: xa.a  reason: case insensitive filesystem */
public final class C5268a extends C5298a {
    public static final Parcelable.Creator<C5268a> CREATOR = new C5271d();

    /* renamed from: a  reason: collision with root package name */
    final Intent f62153a;

    public C5268a(Intent intent) {
        this.f62153a = intent;
    }

    public Intent o0() {
        return this.f62153a;
    }

    public String p0() {
        String stringExtra = this.f62153a.getStringExtra("google.message_id");
        if (stringExtra == null) {
            return this.f62153a.getStringExtra("message_id");
        }
        return stringExtra;
    }

    /* access modifiers changed from: package-private */
    public final Integer q0() {
        if (this.f62153a.hasExtra("google.product_id")) {
            return Integer.valueOf(this.f62153a.getIntExtra("google.product_id", 0));
        }
        return null;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.B(parcel, 1, this.f62153a, i10, false);
        c.b(parcel, a10);
    }
}
