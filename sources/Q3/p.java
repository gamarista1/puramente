package Q3;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.work.s;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;

public abstract class p {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5466a = s.i("PackageManagerHelper");

    private static int a(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str));
    }

    private static boolean b(int i10, boolean z10) {
        if (i10 == 0) {
            return z10;
        }
        if (i10 == 1) {
            return true;
        }
        return false;
    }

    public static void c(Context context, Class cls, boolean z10) {
        int i10;
        String str;
        String str2 = "disabled";
        try {
            if (z10 == b(a(context, cls.getName()), false)) {
                s.e().a(f5466a, "Skipping component enablement for " + cls.getName());
                return;
            }
            PackageManager packageManager = context.getPackageManager();
            ComponentName componentName = new ComponentName(context, cls.getName());
            if (z10) {
                i10 = 1;
            } else {
                i10 = 2;
            }
            packageManager.setComponentEnabledSetting(componentName, i10, 1);
            s e10 = s.e();
            String str3 = f5466a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            if (z10) {
                str = "enabled";
            } else {
                str = str2;
            }
            sb2.append(str);
            e10.a(str3, sb2.toString());
        } catch (Exception e11) {
            s e12 = s.e();
            String str4 = f5466a;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cls.getName());
            sb3.append("could not be ");
            if (z10) {
                str2 = "enabled";
            }
            sb3.append(str2);
            e12.b(str4, sb3.toString(), e11);
        }
    }
}
