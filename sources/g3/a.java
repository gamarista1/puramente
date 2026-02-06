package G3;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;

public abstract class a {
    public static b a(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return ((ParcelImpl) parcelable).a();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    public static b b(Bundle bundle, String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(a.class.getClassLoader());
            return a(bundle2.getParcelable("a"));
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public static void c(Bundle bundle, String str, b bVar) {
        if (bVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("a", d(bVar));
            bundle.putParcelable(str, bundle2);
        }
    }

    public static Parcelable d(b bVar) {
        return new ParcelImpl(bVar);
    }
}
