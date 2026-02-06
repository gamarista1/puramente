package u3;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface j extends IInterface {
    void i(String[] strArr);

    public static abstract class a extends Binder implements j {

        /* renamed from: u3.j$a$a  reason: collision with other inner class name */
        private static class C0442a implements j {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f26654a;

            C0442a(IBinder iBinder) {
                this.f26654a = iBinder;
            }

            public IBinder asBinder() {
                return this.f26654a;
            }

            public void i(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.f26654a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        public static j a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof j)) {
                return new C0442a(iBinder);
            }
            return (j) queryLocalInterface;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
            }
            if (i10 == 1598968902) {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            } else if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                i(parcel.createStringArray());
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }
    }
}
