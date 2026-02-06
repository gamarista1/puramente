package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* renamed from: b.b  reason: case insensitive filesystem */
public interface C1862b extends IInterface {

    /* renamed from: b.b$a */
    public static abstract class a extends Binder implements C1862b {

        /* renamed from: b.b$a$a  reason: collision with other inner class name */
        private static class C0328a implements C1862b {

            /* renamed from: b  reason: collision with root package name */
            public static C1862b f19053b;

            /* renamed from: a  reason: collision with root package name */
            private IBinder f19054a;

            C0328a(IBinder iBinder) {
                this.f19054a = iBinder;
            }

            public boolean I0(C1861a aVar, Uri uri, Bundle bundle, List list) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z10 = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeTypedList(list);
                    if (this.f19054a.transact(4, obtain, obtain2, 0) || a.r1() == null) {
                        obtain2.readException();
                        if (obtain2.readInt() == 0) {
                            z10 = false;
                        }
                        obtain2.recycle();
                        obtain.recycle();
                        return z10;
                    }
                    boolean I02 = a.r1().I0(aVar, uri, bundle, list);
                    obtain2.recycle();
                    obtain.recycle();
                    return I02;
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            public boolean N0(long j10) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(j10);
                    boolean z10 = false;
                    if (!this.f19054a.transact(2, obtain, obtain2, 0) && a.r1() != null) {
                        return a.r1().N0(j10);
                    }
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z10 = true;
                    }
                    obtain2.recycle();
                    obtain.recycle();
                    return z10;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public boolean R0(C1861a aVar) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z10 = false;
                    if (this.f19054a.transact(3, obtain, obtain2, 0) || a.r1() == null) {
                        obtain2.readException();
                        if (obtain2.readInt() != 0) {
                            z10 = true;
                        }
                        obtain2.recycle();
                        obtain.recycle();
                        return z10;
                    }
                    boolean R02 = a.r1().R0(aVar);
                    obtain2.recycle();
                    obtain.recycle();
                    return R02;
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            public boolean Z(C1861a aVar, Bundle bundle) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    if (aVar != null) {
                        iBinder = aVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z10 = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.f19054a.transact(10, obtain, obtain2, 0) || a.r1() == null) {
                        obtain2.readException();
                        if (obtain2.readInt() == 0) {
                            z10 = false;
                        }
                        obtain2.recycle();
                        obtain.recycle();
                        return z10;
                    }
                    boolean Z10 = a.r1().Z(aVar, bundle);
                    obtain2.recycle();
                    obtain.recycle();
                    return Z10;
                } catch (Throwable th2) {
                    obtain2.recycle();
                    obtain.recycle();
                    throw th2;
                }
            }

            public IBinder asBinder() {
                return this.f19054a;
            }
        }

        public static C1862b a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C1862b)) {
                return new C0328a(iBinder);
            }
            return (C1862b) queryLocalInterface;
        }

        public static C1862b r1() {
            return C0328a.f19053b;
        }
    }

    boolean I0(C1861a aVar, Uri uri, Bundle bundle, List list);

    boolean N0(long j10);

    boolean R0(C1861a aVar);

    boolean Z(C1861a aVar, Bundle bundle);
}
