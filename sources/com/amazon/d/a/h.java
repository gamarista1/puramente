package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

public interface h extends IInterface {

    public static abstract class a extends Binder implements h {

        /* renamed from: a  reason: collision with root package name */
        static final int f37737a = 1;

        /* renamed from: b  reason: collision with root package name */
        static final int f37738b = 2;

        /* renamed from: c  reason: collision with root package name */
        static final int f37739c = 3;

        /* renamed from: d  reason: collision with root package name */
        static final int f37740d = 4;

        /* renamed from: e  reason: collision with root package name */
        static final int f37741e = 5;

        /* renamed from: f  reason: collision with root package name */
        static final int f37742f = 6;

        /* renamed from: g  reason: collision with root package name */
        static final int f37743g = 7;

        /* renamed from: h  reason: collision with root package name */
        private static final String f37744h = "com.amazon.venezia.command.FailureResult";

        /* renamed from: com.amazon.d.a.h$a$a  reason: collision with other inner class name */
        private static class C0613a implements h {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f37745a;

            C0613a(IBinder iBinder) {
                this.f37745a = iBinder;
            }

            public String a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37744h);
                    this.f37745a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f37745a;
            }

            public String b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37744h);
                    this.f37745a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37744h);
                    this.f37745a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37744h);
                    this.f37745a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37744h);
                    boolean z10 = false;
                    this.f37745a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public Map f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37744h);
                    this.f37745a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String g() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37744h);
                    this.f37745a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String h() {
                return a.f37744h;
            }
        }

        public a() {
            attachInterface(this, f37744h);
        }

        public static h a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f37744h);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof h)) {
                return new C0613a(iBinder);
            }
            return (h) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1598968902) {
                switch (i10) {
                    case 1:
                        parcel.enforceInterface(f37744h);
                        String a10 = a();
                        parcel2.writeNoException();
                        parcel2.writeString(a10);
                        return true;
                    case 2:
                        parcel.enforceInterface(f37744h);
                        String b10 = b();
                        parcel2.writeNoException();
                        parcel2.writeString(b10);
                        return true;
                    case 3:
                        parcel.enforceInterface(f37744h);
                        String c10 = c();
                        parcel2.writeNoException();
                        parcel2.writeString(c10);
                        return true;
                    case 4:
                        parcel.enforceInterface(f37744h);
                        String d10 = d();
                        parcel2.writeNoException();
                        parcel2.writeString(d10);
                        return true;
                    case 5:
                        parcel.enforceInterface(f37744h);
                        boolean e10 = e();
                        parcel2.writeNoException();
                        parcel2.writeInt(e10 ? 1 : 0);
                        return true;
                    case 6:
                        parcel.enforceInterface(f37744h);
                        Map f10 = f();
                        parcel2.writeNoException();
                        parcel2.writeMap(f10);
                        return true;
                    case 7:
                        parcel.enforceInterface(f37744h);
                        String g10 = g();
                        parcel2.writeNoException();
                        parcel2.writeString(g10);
                        return true;
                    default:
                        return super.onTransact(i10, parcel, parcel2, i11);
                }
            } else {
                parcel2.writeString(f37744h);
                return true;
            }
        }
    }

    String a();

    String b();

    String c();

    String d();

    boolean e();

    Map f();

    String g();
}
