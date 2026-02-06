package com.amazon.d.c.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface a extends IInterface {
    String a();

    String a(String str);

    void a(String str, boolean z10, String str2);

    String b();

    /* renamed from: com.amazon.d.c.a.a$a  reason: collision with other inner class name */
    public static abstract class C0616a extends Binder implements a {

        /* renamed from: a  reason: collision with root package name */
        static final int f37763a = 1;

        /* renamed from: b  reason: collision with root package name */
        static final int f37764b = 2;

        /* renamed from: c  reason: collision with root package name */
        static final int f37765c = 3;

        /* renamed from: d  reason: collision with root package name */
        static final int f37766d = 4;

        /* renamed from: e  reason: collision with root package name */
        private static final String f37767e = "com.amazon.venezia.service.verify.IApplicationVerificationService";

        public C0616a() {
            attachInterface(this, f37767e);
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f37767e);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                return new C0617a(iBinder);
            }
            return (a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            boolean z10;
            if (i10 == 1) {
                parcel.enforceInterface(f37767e);
                String readString = parcel.readString();
                if (parcel.readInt() != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                a(readString, z10, parcel.readString());
                parcel2.writeNoException();
                return true;
            } else if (i10 == 2) {
                parcel.enforceInterface(f37767e);
                String a10 = a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a10);
                return true;
            } else if (i10 == 3) {
                parcel.enforceInterface(f37767e);
                String a11 = a();
                parcel2.writeNoException();
                parcel2.writeString(a11);
                return true;
            } else if (i10 == 4) {
                parcel.enforceInterface(f37767e);
                String b10 = b();
                parcel2.writeNoException();
                parcel2.writeString(b10);
                return true;
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString(f37767e);
                return true;
            }
        }

        /* renamed from: com.amazon.d.c.a.a$a$a  reason: collision with other inner class name */
        private static class C0617a implements a {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f37768a;

            C0617a(IBinder iBinder) {
                this.f37768a = iBinder;
            }

            public void a(String str, boolean z10, String str2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0616a.f37767e);
                    obtain.writeString(str);
                    obtain.writeInt(z10 ? 1 : 0);
                    obtain.writeString(str2);
                    this.f37768a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f37768a;
            }

            public String b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0616a.f37767e);
                    this.f37768a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String c() {
                return C0616a.f37767e;
            }

            public String a(String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0616a.f37767e);
                    obtain.writeString(str);
                    this.f37768a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0616a.f37767e);
                    this.f37768a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
