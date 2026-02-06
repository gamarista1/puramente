package V8;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class a implements IInterface {

    /* renamed from: a  reason: collision with root package name */
    private final IBinder f34752a;

    /* renamed from: b  reason: collision with root package name */
    private final String f34753b = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    protected a(IBinder iBinder) {
        this.f34752a = iBinder;
    }

    public final IBinder asBinder() {
        return this.f34752a;
    }

    /* access modifiers changed from: protected */
    public final Parcel r1() {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f34753b);
        return obtain;
    }

    /* access modifiers changed from: protected */
    public final Parcel s1(Parcel parcel) {
        parcel = Parcel.obtain();
        try {
            this.f34752a.transact(1, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e10) {
            throw e10;
        } finally {
            parcel.recycle();
        }
    }
}
