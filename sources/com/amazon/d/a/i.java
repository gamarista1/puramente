package com.amazon.d.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.amazon.d.a.f;
import com.amazon.d.a.g;
import com.amazon.d.a.h;
import com.amazon.d.a.j;

public interface i extends IInterface {

    public static abstract class a extends Binder implements i {

        /* renamed from: a  reason: collision with root package name */
        private static final String f37746a = "com.amazon.venezia.command.ResultCallback";

        /* renamed from: b  reason: collision with root package name */
        static final int f37747b = 1;

        /* renamed from: c  reason: collision with root package name */
        static final int f37748c = 2;

        /* renamed from: d  reason: collision with root package name */
        static final int f37749d = 3;

        /* renamed from: e  reason: collision with root package name */
        static final int f37750e = 4;

        /* renamed from: com.amazon.d.a.i$a$a  reason: collision with other inner class name */
        private static class C0614a implements i {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f37751a;

            C0614a(IBinder iBinder) {
                this.f37751a = iBinder;
            }

            public String a() {
                return a.f37746a;
            }

            public IBinder asBinder() {
                return this.f37751a;
            }

            public void a(j jVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37746a);
                    obtain.writeStrongBinder(jVar != null ? jVar.asBinder() : null);
                    this.f37751a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            public void a(h hVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37746a);
                    obtain.writeStrongBinder(hVar != null ? hVar.asBinder() : null);
                    this.f37751a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            public void a(f fVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37746a);
                    obtain.writeStrongBinder(fVar != null ? fVar.asBinder() : null);
                    this.f37751a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    obtain2.recycle();
                    obtain.recycle();
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            public void a(g gVar) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(a.f37746a);
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    this.f37751a.transact(4, obtain, obtain2, 0);
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
            attachInterface(this, f37746a);
        }

        public static i a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(f37746a);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof i)) {
                return new C0614a(iBinder);
            }
            return (i) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 1) {
                parcel.enforceInterface(f37746a);
                a(j.a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i10 == 2) {
                parcel.enforceInterface(f37746a);
                a(h.a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i10 == 3) {
                parcel.enforceInterface(f37746a);
                a(f.a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i10 == 4) {
                parcel.enforceInterface(f37746a);
                a(g.a.a(parcel.readStrongBinder()));
                parcel2.writeNoException();
                return true;
            } else if (i10 != 1598968902) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                parcel2.writeString(f37746a);
                return true;
            }
        }
    }

    void a(f fVar);

    void a(g gVar);

    void a(h hVar);

    void a(j jVar);
}
