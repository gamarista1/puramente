package lb;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: lb.b  reason: case insensitive filesystem */
public abstract class C5069b extends Binder implements IInterface {
    protected C5069b(String str) {
        attachInterface(this, "com.google.android.play.core.inappreview.protocol.IInAppReviewServiceCallback");
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(int i10, Parcel parcel, Parcel parcel2, int i11);

    public final boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
        if (i10 <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i10, parcel, parcel2, i11)) {
            return true;
        }
        return a(i10, parcel, parcel2, i11);
    }

    public final IBinder asBinder() {
        return this;
    }
}
