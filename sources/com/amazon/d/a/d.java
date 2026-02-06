package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.amazon.d.a.c;
import com.amazon.d.a.i;

public interface d extends IInterface {

    public static abstract class a extends Binder implements d {

        /* renamed from: a  reason: collision with root package name */
        static final int f37715a = 1;

        /* renamed from: b  reason: collision with root package name */
        private static final String f37716b = "com.amazon.venezia.command.CommandService";

        /* renamed from: com.amazon.d.a.d$a$a  reason: collision with other inner class name */
        private static class C0609a implements d {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f37717a;

            C0609a(IBinder iBinder) {
                this.f37717a = iBinder;
            }

            public String a() {
                return a.f37716b;
            }

            public IBinder asBinder() {
                return this.f37717a;
            }

            public void a(c cVar, i iVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37716b);
                    IBinder iBinder = null;
                    obtain.writeStrongBinder(cVar != null ? cVar.asBinder() : null);
                    if (iVar != null) {
                        iBinder = iVar.asBinder();
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f37717a.transact(1, obtain, obtain2, 0);
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

        public a() {
            attachInterface(this, f37716b);
        }

        public static d a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f37716b);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof d)) {
                return new C0609a(iBinder);
            }
            return (d) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface(f37716b);
                a(c.a.a(parcel.readStrongBinder()), i.a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString(f37716b);
                return true;
            }
        }
    }

    void a(c cVar, i iVar);
}
