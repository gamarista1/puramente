package d;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d.a  reason: case insensitive filesystem */
public interface C1895a extends IInterface {

    /* renamed from: l  reason: collision with root package name */
    public static final String f19387l = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* renamed from: d.a$b */
    public static class b {
        /* access modifiers changed from: private */
        public static Object b(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void n0(int i10, Bundle bundle);

    /* renamed from: d.a$a  reason: collision with other inner class name */
    public static abstract class C0335a extends Binder implements C1895a {

        /* renamed from: d.a$a$a  reason: collision with other inner class name */
        private static class C0336a implements C1895a {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f19388a;

            C0336a(IBinder iBinder) {
                this.f19388a = iBinder;
            }

            public IBinder asBinder() {
                return this.f19388a;
            }
        }

        public C0335a() {
            attachInterface(this, C1895a.f19387l);
        }

        public static C1895a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C1895a.f19387l);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C1895a)) {
                return new C0336a(iBinder);
            }
            return (C1895a) queryLocalInterface;
        }

        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) {
            String str = C1895a.f19387l;
            if (i10 >= 1 && i10 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i10 == 1598968902) {
                parcel2.writeString(str);
                return true;
            } else if (i10 != 1) {
                return super.onTransact(i10, parcel, parcel2, i11);
            } else {
                n0(parcel.readInt(), (Bundle) b.b(parcel, Bundle.CREATOR));
                return true;
            }
        }

        public IBinder asBinder() {
            return this;
        }
    }
}
