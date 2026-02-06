package com.amazon.d.a;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.amazon.d.a.b;
import java.util.Map;

public interface a extends IInterface {
    String a();

    void a(b bVar);

    Intent b();

    Map c();

    /* renamed from: com.amazon.d.a.a$a  reason: collision with other inner class name */
    public static abstract class C0605a extends Binder implements a {

        /* renamed from: a  reason: collision with root package name */
        static final int f37700a = 1;

        /* renamed from: b  reason: collision with root package name */
        static final int f37701b = 2;

        /* renamed from: c  reason: collision with root package name */
        static final int f37702c = 3;

        /* renamed from: d  reason: collision with root package name */
        static final int f37703d = 4;

        /* renamed from: e  reason: collision with root package name */
        private static final String f37704e = "com.amazon.venezia.command.Choice";

        public C0605a() {
            attachInterface(this, f37704e);
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f37704e);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                return new C0606a(iBinder);
            }
            return (a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface(f37704e);
                String a10 = a();
                parcel2.writeNoException();
                parcel2.writeString(a10);
                return true;
            } else if (i10 == 2) {
                parcel.enforceInterface(f37704e);
                Intent b10 = b();
                parcel2.writeNoException();
                if (b10 != null) {
                    parcel2.writeInt(1);
                    b10.writeToParcel(parcel2, 1);
                } else {
                    parcel2.writeInt(0);
                }
                return true;
            } else if (i10 == 3) {
                parcel.enforceInterface(f37704e);
                a(b.a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i10 == 4) {
                parcel.enforceInterface(f37704e);
                Map c10 = c();
                parcel2.writeNoException();
                parcel2.writeMap(c10);
                return true;
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString(f37704e);
                return true;
            }
        }

        /* renamed from: com.amazon.d.a.a$a$a  reason: collision with other inner class name */
        private static class C0606a implements a {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f37705a;

            C0606a(IBinder iBinder) {
                this.f37705a = iBinder;
            }

            public String a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0605a.f37704e);
                    this.f37705a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f37705a;
            }

            public Intent b() {
                Intent intent;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0605a.f37704e);
                    this.f37705a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        intent = (Intent) Intent.CREATOR.createFromParcel(obtain2);
                    } else {
                        intent = null;
                    }
                    return intent;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public Map c() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0605a.f37704e);
                    this.f37705a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String d() {
                return C0605a.f37704e;
            }

            public void a(b bVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C0605a.f37704e);
                    obtain.writeStrongBinder(bVar != null ? bVar.asBinder() : null);
                    this.f37705a.transact(3, obtain, obtain2, 0);
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
