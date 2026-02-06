package Nd;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public interface b {
    boolean a(String str, boolean z10);

    Collection b();

    int c(String str, int i10);

    b d(String str) {
        Object obj = get(str);
        if (obj instanceof Map) {
            return new a((Map) obj);
        }
        return null;
    }

    Bundle e() {
        Bundle bundle = new Bundle();
        for (String str : b()) {
            Object obj = get(str);
            if (obj == null) {
                bundle.putString(str, (String) null);
            } else if (obj instanceof String) {
                bundle.putString(str, (String) obj);
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof ArrayList) {
                bundle.putParcelableArrayList(str, (ArrayList) obj);
            } else if (obj instanceof Map) {
                bundle.putBundle(str, new a((Map) obj).e());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else {
                throw new UnsupportedOperationException("Could not put a value of " + obj.getClass() + " to bundle.");
            }
        }
        return bundle;
    }

    Map f(String str, Map map);

    String g(String str, String str2);

    Object get(String str);

    boolean getBoolean(String str) {
        return a(str, false);
    }

    int getInt(String str) {
        return c(str, 0);
    }

    Map getMap(String str) {
        return f(str, (Map) null);
    }

    String getString(String str) {
        return g(str, (String) null);
    }

    boolean h(String str);
}
