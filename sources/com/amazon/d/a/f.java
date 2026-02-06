package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.amazon.d.a.a;
import com.amazon.d.a.e;
import java.util.Map;

public interface f extends IInterface {
    String a();

    void a(e eVar);

    String b();

    String c();

    long d();

    a e();

    a f();

    a g();

    Map h();

    public static abstract class a extends Binder implements f {

        /* renamed from: a  reason: collision with root package name */
        static final int f37722a = 1;

        /* renamed from: b  reason: collision with root package name */
        static final int f37723b = 2;

        /* renamed from: c  reason: collision with root package name */
        static final int f37724c = 3;

        /* renamed from: d  reason: collision with root package name */
        static final int f37725d = 4;

        /* renamed from: e  reason: collision with root package name */
        static final int f37726e = 5;

        /* renamed from: f  reason: collision with root package name */
        static final int f37727f = 6;

        /* renamed from: g  reason: collision with root package name */
        static final int f37728g = 7;

        /* renamed from: h  reason: collision with root package name */
        static final int f37729h = 8;

        /* renamed from: i  reason: collision with root package name */
        static final int f37730i = 9;

        /* renamed from: j  reason: collision with root package name */
        private static final String f37731j = "com.amazon.venezia.command.DecisionResult";

        public a() {
            attachInterface(this, f37731j);
        }

        public static f a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f37731j);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof f)) {
                return new C0611a(iBinder);
            }
            return (f) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 != 1598968902) {
                IBinder iBinder = null;
                switch (i10) {
                    case 1:
                        parcel.enforceInterface(f37731j);
                        String a10 = a();
                        parcel2.writeNoException();
                        parcel2.writeString(a10);
                        return true;
                    case 2:
                        parcel.enforceInterface(f37731j);
                        String b10 = b();
                        parcel2.writeNoException();
                        parcel2.writeString(b10);
                        return true;
                    case 3:
                        parcel.enforceInterface(f37731j);
                        String c10 = c();
                        parcel2.writeNoException();
                        parcel2.writeString(c10);
                        return true;
                    case 4:
                        parcel.enforceInterface(f37731j);
                        long d10 = d();
                        parcel2.writeNoException();
                        parcel2.writeLong(d10);
                        return true;
                    case 5:
                        parcel.enforceInterface(f37731j);
                        a(e.a.a(parcel.readStrongBinder()));
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface(f37731j);
                        a e10 = e();
                        parcel2.writeNoException();
                        if (e10 != null) {
                            iBinder = e10.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 7:
                        parcel.enforceInterface(f37731j);
                        a f10 = f();
                        parcel2.writeNoException();
                        if (f10 != null) {
                            iBinder = f10.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 8:
                        parcel.enforceInterface(f37731j);
                        a g10 = g();
                        parcel2.writeNoException();
                        if (g10 != null) {
                            iBinder = g10.asBinder();
                        }
                        parcel2.writeStrongBinder(iBinder);
                        return true;
                    case 9:
                        parcel.enforceInterface(f37731j);
                        Map h10 = h();
                        parcel2.writeNoException();
                        parcel2.writeMap(h10);
                        return true;
                    default:
                        return super.onTransact(i10, parcel, parcel2, i11);
                }
            } else {
                parcel2.writeString(f37731j);
                return true;
            }
        }

        /* renamed from: com.amazon.d.a.f$a$a  reason: collision with other inner class name */
        private static class C0611a implements f {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f37732a;

            C0611a(IBinder iBinder) {
                this.f37732a = iBinder;
            }

            public String a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37731j);
                    this.f37732a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f37732a;
            }

            public String b() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37731j);
                    this.f37732a.transact(2, obtain, obtain2, 0);
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
                    obtain.writeInterfaceToken(a.f37731j);
                    this.f37732a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public long d() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37731j);
                    this.f37732a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readLong();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public a e() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37731j);
                    this.f37732a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    return a.C0605a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public a f() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37731j);
                    this.f37732a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    return a.C0605a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public a g() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37731j);
                    this.f37732a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return a.C0605a.a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public Map h() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37731j);
                    this.f37732a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String i() {
                return a.f37731j;
            }

            public void a(e eVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37731j);
                    obtain.writeStrongBinder(eVar != null ? eVar.asBinder() : null);
                    this.f37732a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }
        }
    }
}
