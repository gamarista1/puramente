package u1;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;

public abstract class b {

    static class a {
        static Object a(Bundle bundle, String str, Class cls) {
            return bundle.getParcelable(str, cls);
        }

        static ArrayList b(Bundle bundle, String str, Class cls) {
            return bundle.getParcelableArrayList(str, cls);
        }
    }

    public static Object a(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(bundle, str, cls);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (cls.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    public static ArrayList b(Bundle bundle, String str, Class cls) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.b(bundle, str, cls);
        }
        return bundle.getParcelableArrayList(str);
    }
}
