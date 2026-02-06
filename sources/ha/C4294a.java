package Ha;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.common.zzb;

/* renamed from: Ha.a  reason: case insensitive filesystem */
public interface C4294a extends IInterface {

    /* renamed from: Ha.a$a  reason: collision with other inner class name */
    public static abstract class C0774a extends zzb implements C4294a {
        public C0774a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static C4294a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof C4294a) {
                return (C4294a) queryLocalInterface;
            }
            return new C4297d(iBinder);
        }
    }
}
