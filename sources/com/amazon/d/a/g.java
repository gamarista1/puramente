package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

public interface g extends IInterface {

    public static abstract class a extends Binder implements g {

        /* renamed from: a  reason: collision with root package name */
        static final int f37733a = 1;

        /* renamed from: b  reason: collision with root package name */
        static final int f37734b = 2;

        /* renamed from: c  reason: collision with root package name */
        private static final String f37735c = "com.amazon.venezia.command.ExceptionResult";

        /* renamed from: com.amazon.d.a.g$a$a  reason: collision with other inner class name */
        private static class C0612a implements g {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f37736a;

            C0612a(IBinder iBinder) {
                this.f37736a = iBinder;
            }

            public String a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37735c);
                    this.f37736a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f37736a;
            }

            public Map b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37735c);
                    this.f37736a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String c() {
                return a.f37735c;
            }
        }

        public a() {
            attachInterface(this, f37735c);
        }

        public static g a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f37735c);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof g)) {
                return new C0612a(iBinder);
            }
            return (g) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface(f37735c);
                String a10 = a();
                parcel2.writeNoException();
                parcel2.writeString(a10);
                return true;
            } else if (i10 == 2) {
                parcel.enforceInterface(f37735c);
                Map b10 = b();
                parcel2.writeNoException();
                parcel2.writeMap(b10);
                return true;
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString(f37735c);
                return true;
            }
        }
    }

    String a();

    Map b();
}
