package od;

import android.net.NetworkInfo;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;

/* renamed from: od.a  reason: case insensitive filesystem */
public enum C5122a {
    CG_2G("2g"),
    CG_3G("3g"),
    CG_4G("4g"),
    CG_5G("5g");
    

    /* renamed from: a  reason: collision with root package name */
    public final String f61193a;

    private C5122a(String str) {
        this.f61193a = str;
    }

    public static C5122a b(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return null;
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == 20) {
            return CG_5G;
        }
        switch (subtype) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return CG_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case StdKeyDeserializer.TYPE_URL:
                return CG_3G;
            case 13:
            case StdKeyDeserializer.TYPE_CLASS:
                return CG_4G;
            default:
                return null;
        }
    }
}
