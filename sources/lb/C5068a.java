package lb;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: lb.a  reason: case insensitive filesystem */
public abstract class C5068a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f60968a;

    /* renamed from: b  reason: collision with root package name */
    private final String f60969b = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";

    protected C5068a(IBinder iBinder, String str) {
        this.f60968a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f60968a;
    }

    /* access modifiers changed from: protected */
    public final Parcel r1() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f60969b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final void s1(int i10, Parcel parcel) {
        try {
            this.f60968a.transact(2, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
        }
    }
}
