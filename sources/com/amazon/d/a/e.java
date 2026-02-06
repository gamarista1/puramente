package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

public interface e extends IInterface {

    public static abstract class a extends Binder implements e {

        /* renamed from: a  reason: collision with root package name */
        private static final String f37718a = "com.amazon.venezia.command.DecisionExpirationContext";

        /* renamed from: c  reason: collision with root package name */
        static final int f37719c = 1;

        /* renamed from: d  reason: collision with root package name */
        static final int f37720d = 2;

        /* renamed from: com.amazon.d.a.e$a$a  reason: collision with other inner class name */
        private static class C0610a implements e {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f37721a;

            C0610a(IBinder iBinder) {
                this.f37721a = iBinder;
            }

            public String a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37718a);
                    this.f37721a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f37721a;
            }

            public Map b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37718a);
                    this.f37721a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String c() {
                return a.f37718a;
            }
        }

        public a() {
            attachInterface(this, f37718a);
        }

        public static e a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f37718a);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof e)) {
                return new C0610a(iBinder);
            }
            return (e) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface(f37718a);
                String a10 = a();
                parcel2.writeNoException();
                parcel2.writeString(a10);
                return true;
            } else if (i10 == 2) {
                parcel.enforceInterface(f37718a);
                Map b10 = b();
                parcel2.writeNoException();
                parcel2.writeMap(b10);
                return true;
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString(f37718a);
                return true;
            }
        }
    }

    String a();

    Map b();
}
