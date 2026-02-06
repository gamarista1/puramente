package c;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.a  reason: case insensitive filesystem */
public interface C1886a extends IInterface {

    /* renamed from: k  reason: collision with root package name */
    public static final String f19172k = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    /* renamed from: c.a$a  reason: collision with other inner class name */
    public static abstract class C0331a extends Binder implements C1886a {

        /* renamed from: c.a$a$a  reason: collision with other inner class name */
        private static class C0332a implements C1886a {

            /* renamed from: a  reason: collision with root package name */
            private IBinder f19173a;

            C0332a(IBinder iBinder) {
                this.f19173a = iBinder;
            }

            public IBinder asBinder() {
                return this.f19173a;
            }

            public void m1(String str, int i10, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(C1886a.f19172k);
                    obtain.writeString(str);
                    obtain.writeInt(i10);
                    obtain.writeString(str2);
                    b.b(obtain, notification, 0);
                    this.f19173a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public static C1886a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C1886a.f19172k);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C1886a)) {
                return new C0332a(iBinder);
            }
            return (C1886a) queryLocalInterface;
        }
    }

    /* renamed from: c.a$b */
    public static class b {
        /* access modifiers changed from: private */
        public static void b(Parcel parcel, Parcelable parcelable, int i10) {
            if (parcelable != null) {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i10);
                return;
            }
            parcel.writeInt(0);
        }
    }

    void m1(String str, int i10, String str2, Notification notification);
}
