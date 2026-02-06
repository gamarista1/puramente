package lb;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: lb.g  reason: case insensitive filesystem */
public abstract class C5074g extends C5069b implements C5075h {
    public C5074g() {
        super("com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    /* access modifiers changed from: protected */
    public final boolean a(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 != 2) {
            return false;
        }
        C5070c.b(parcel);
        Y0((Bundle) C5070c.a(parcel, Bundle.CREATOR));
        return true;
    }
}
