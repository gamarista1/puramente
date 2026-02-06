package wc;

import Ac.b;
import Ac.c;
import Bc.i;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import uc.C5233a;

public abstract class e {
    private static List a(i iVar, Context context) {
        ArrayList arrayList = new ArrayList();
        if (iVar.j()) {
            arrayList.add(new d(iVar.k()));
        }
        if (iVar.g()) {
            arrayList.add(new C5265c(iVar.h(), context));
        }
        if (iVar.Z()) {
            arrayList.add(new C5263a(iVar.Y()));
        }
        if (iVar.e()) {
            arrayList.add(new C5264b(iVar.l()));
        }
        return arrayList;
    }

    public static boolean b(i iVar, Context context) {
        List<e> a10 = a(iVar, context);
        if (a10.isEmpty()) {
            C5233a.e().a("No validators found for PerfMetric.");
            return false;
        }
        for (e c10 : a10) {
            if (!c10.c()) {
                return false;
            }
        }
        return true;
    }

    public static void d(String str, String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Attribute key must not be null or empty");
        } else if (str2 == null || str2.length() == 0) {
            throw new IllegalArgumentException("Attribute value must not be null or empty");
        } else if (str.length() > 40) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute key length must not exceed %d characters", new Object[]{40}));
        } else if (str2.length() > 100) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute value length must not exceed %d characters", new Object[]{100}));
        } else if (!str.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
            throw new IllegalArgumentException("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
        }
    }

    public static String e(String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Metric name must not exceed %d characters", new Object[]{100});
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (b bVar : b.values()) {
            if (bVar.toString().equals(str)) {
                return null;
            }
        }
        return "Metric name must not start with '_'";
    }

    public static String f(String str) {
        if (str == null) {
            return "Trace name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Trace name must not exceed %d characters", new Object[]{100});
        }
        if (!str.startsWith("_")) {
            return null;
        }
        for (c cVar : c.values()) {
            if (cVar.toString().equals(str)) {
                return null;
            }
        }
        if (str.startsWith("_st_")) {
            return null;
        }
        return "Trace name must not start with '_'";
    }

    public abstract boolean c();
}
