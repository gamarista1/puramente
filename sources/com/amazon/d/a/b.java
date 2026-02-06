package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.Map;

public interface b extends IInterface {

    public static abstract class a extends Binder implements b {

        /* renamed from: a  reason: collision with root package name */
        static final int f37706a = 1;

        /* renamed from: b  reason: collision with root package name */
        private static final String f37707b = "com.amazon.venezia.command.ChoiceContext";

        /* renamed from: com.amazon.d.a.b$a$a  reason: collision with other inner class name */
        private static class C0607a implements b {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f37708a;

            C0607a(IBinder iBinder) {
                this.f37708a = iBinder;
            }

            public Map a() {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37707b);
                    this.f37708a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readHashMap(getClass().getClassLoader());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f37708a;
            }

            public String b() {
                return a.f37707b;
            }
        }

        public a() {
            attachInterface(this, f37707b);
        }

        public static b a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f37707b);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof b)) {
                return new C0607a(iBinder);
            }
            return (b) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface(f37707b);
                Map a10 = a();
                parcel2.writeNoException();
                parcel2.writeMap(a10);
                return true;
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString(f37707b);
                return true;
            }
        }
    }

    Map a();
}
