package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

public interface c extends IInterface {

    public static abstract class a extends Binder implements c {

        /* renamed from: a  reason: collision with root package name */
        private static final String f37709a = "com.amazon.venezia.command.Command";

        /* renamed from: b  reason: collision with root package name */
        static final int f37710b = 1;

        /* renamed from: c  reason: collision with root package name */
        static final int f37711c = 2;

        /* renamed from: d  reason: collision with root package name */
        static final int f37712d = 3;

        /* renamed from: e  reason: collision with root package name */
        static final int f37713e = 4;

        /* renamed from: com.amazon.d.a.c$a$a  reason: collision with other inner class name */
        private static class C0608a implements c {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f37714a;

            C0608a(IBinder iBinder) {
                this.f37714a = iBinder;
            }

            public String a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37709a);
                    this.f37714a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f37714a;
            }

            public String b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37709a);
                    this.f37714a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public Map c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37709a);
                    this.f37714a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37709a);
                    this.f37714a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String e() {
                return a.f37709a;
            }
        }

        public a() {
            attachInterface(this, f37709a);
        }

        public static c a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f37709a);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof c)) {
                return new C0608a(iBinder);
            }
            return (c) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface(f37709a);
                String b10 = b();
                parcel2.writeNoException();
                parcel2.writeString(b10);
                return true;
            } else if (i10 == 2) {
                parcel.enforceInterface(f37709a);
                String a10 = a();
                parcel2.writeNoException();
                parcel2.writeString(a10);
                return true;
            } else if (i10 == 3) {
                parcel.enforceInterface(f37709a);
                String d10 = d();
                parcel2.writeNoException();
                parcel2.writeString(d10);
                return true;
            } else if (i10 == 4) {
                parcel.enforceInterface(f37709a);
                Map c10 = c();
                parcel2.writeNoException();
                parcel2.writeMap(c10);
                return true;
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString(f37709a);
                return true;
            }
        }
    }

    String a();

    String b();

    Map c();

    String d();
}
