package lb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* renamed from: lb.d  reason: case insensitive filesystem */
public final class C5071d extends C5068a implements C5073f {
    C5071d(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.inappreview.protocol.IInAppReviewService");
    }

    public final void C0(String str, Bundle bundle, C5075h hVar) {
        Parcel r12 = r1();
        r12.writeString(str);
        C5070c.c(r12, bundle);
        C5070c.d(r12, hVar);
        s1(2, r12);
    }
}
