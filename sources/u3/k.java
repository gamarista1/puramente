package u3;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import u3.j;

public interface k extends IInterface {
    int a1(j jVar, String str);

    void g(j jVar, int i10);

    void j0(int i10, String[] strArr);

    public static abstract class a extends Binder implements k {

        /* renamed from: u3.k$a$a  reason: collision with other inner class name */
        private static class C0443a implements k {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f26655a;

            C0443a(IBinder iBinder) {
                this.f26655a = iBinder;
            }

            public int a1(j jVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongInterface(jVar);
                    obtain.writeString(str);
                    this.f26655a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f26655a;
            }

            public void j0(int i10, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i10);
                    obtain.writeStringArray(strArr);
                    this.f26655a.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        public static k a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof k)) {
                return new C0443a(iBinder);
            }
            return (k) queryLocalInterface;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
            }
            if (i10 != 1598968902) {
                if (i10 == 1) {
                    int a12 = a1(j.a.a(parcel.readStrongBinder()), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(a12);
                } else if (i10 == 2) {
                    g(j.a.a(parcel.readStrongBinder()), parcel.readInt());
                    parcel2.writeNoException();
                } else if (i10 != 3) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                } else {
                    j0(parcel.readInt(), parcel.createStringArray());
                }
                return true;
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }

        public IBinder asBinder() {
            return this;
        }
    }
}
