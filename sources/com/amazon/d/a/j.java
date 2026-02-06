package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

public interface j extends IInterface {

    public static abstract class a extends Binder implements j {

        /* renamed from: a  reason: collision with root package name */
        static final int f37752a = 1;

        /* renamed from: b  reason: collision with root package name */
        static final int f37753b = 2;

        /* renamed from: c  reason: collision with root package name */
        private static final String f37754c = "com.amazon.venezia.command.SuccessResult";

        /* renamed from: com.amazon.d.a.j$a$a  reason: collision with other inner class name */
        private static class C0615a implements j {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f37755a;

            C0615a(IBinder iBinder) {
                this.f37755a = iBinder;
            }

            public String a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37754c);
                    this.f37755a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f37755a;
            }

            public Map b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37754c);
                    this.f37755a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String c() {
                return a.f37754c;
            }
        }

        public a() {
            attachInterface(this, f37754c);
        }

        public static j a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f37754c);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof j)) {
                return new C0615a(iBinder);
            }
            return (j) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface(f37754c);
                String a10 = a();
                parcel2.writeNoException();
                parcel2.writeString(a10);
                return true;
            } else if (i10 == 2) {
                parcel.enforceInterface(f37754c);
                Map b10 = b();
                parcel2.writeNoException();
                parcel2.writeMap(b10);
                return true;
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString(f37754c);
                return true;
            }
        }
    }

    String a();

    Map b();
}
