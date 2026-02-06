package A7;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public interface a extends IInterface {

    /* renamed from: A7.a$a  reason: collision with other inner class name */
    public static abstract class C0496a extends Binder implements a {

        /* renamed from: A7.a$a$a  reason: collision with other inner class name */
        private static class C0497a implements a {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f29429a;

            C0497a(IBinder iBinder) {
                this.f29429a = iBinder;
            }

            public IBinder asBinder() {
                return this.f29429a;
            }

            public int f(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    b.b(obtain, bundle, 0);
                    this.f29429a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                return new C0497a(iBinder);
            }
            return (a) queryLocalInterface;
        }
    }

    public static class b {
        /* access modifiers changed from: private */
        public static void b(Parcel parcel, Parcelable parcelable, int i10) {
            if (parcelable != null) {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i10);
                return;
            }
            parcel.writeInt(0);
        }
    }

    int f(Bundle bundle);
}
