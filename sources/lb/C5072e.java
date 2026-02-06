package lb;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: lb.e  reason: case insensitive filesystem */
public abstract class C5072e extends C5069b implements C5073f {
    public static C5073f b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        if (queryLocalInterface instanceof C5073f) {
            return (C5073f) queryLocalInterface;
        }
        return new C5071d(iBinder);
    }
}
