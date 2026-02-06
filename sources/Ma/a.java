package ma;

import V8.b;
import V8.c;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface a extends IInterface {

    /* renamed from: ma.a$a  reason: collision with other inner class name */
    public static abstract class C0700a extends b implements a {

        /* renamed from: ma.a$a$a  reason: collision with other inner class name */
        public static class C0701a extends V8.a implements a {
            C0701a(IBinder iBinder) {
                super(iBinder);
            }

            public final Bundle c(Bundle bundle) {
                Parcel r12 = r1();
                c.b(r12, bundle);
                Parcel s12 = s1(r12);
                Bundle bundle2 = (Bundle) c.a(s12, Bundle.CREATOR);
                s12.recycle();
                return bundle2;
            }
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface instanceof a) {
                return (a) queryLocalInterface;
            }
            return new C0701a(iBinder);
        }
    }

    Bundle c(Bundle bundle);
}
