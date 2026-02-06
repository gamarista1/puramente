package oh;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import me.leolin.shortcutbadger.impl.AdwHomeBadger;
import me.leolin.shortcutbadger.impl.ApexHomeBadger;
import me.leolin.shortcutbadger.impl.DefaultBadger;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import me.leolin.shortcutbadger.impl.NovaHomeBadger;
import me.leolin.shortcutbadger.impl.SonyHomeBadger;
import ph.C6652a;
import ph.C6653b;
import ph.C6654c;
import ph.d;
import ph.e;
import ph.f;
import ph.g;
import ph.h;

/* renamed from: oh.c  reason: case insensitive filesystem */
public abstract class C6631c {

    /* renamed from: a  reason: collision with root package name */
    private static final List f72435a;

    /* renamed from: b  reason: collision with root package name */
    private static final Object f72436b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static C6629a f72437c;

    /* renamed from: d  reason: collision with root package name */
    private static ComponentName f72438d;

    static {
        LinkedList linkedList = new LinkedList();
        f72435a = linkedList;
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(DefaultBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(C6652a.class);
        linkedList.add(C6654c.class);
        linkedList.add(d.class);
        linkedList.add(e.class);
        linkedList.add(h.class);
        linkedList.add(f.class);
        linkedList.add(g.class);
        linkedList.add(C6653b.class);
    }

    public static boolean a(Context context, int i10) {
        try {
            b(context, i10);
            return true;
        } catch (C6630b e10) {
            if (!Log.isLoggable("ShortcutBadger", 3)) {
                return false;
            }
            Log.d("ShortcutBadger", "Unable to execute badge", e10);
            return false;
        }
    }

    public static void b(Context context, int i10) {
        if (f72437c != null || c(context)) {
            try {
                f72437c.b(context, f72438d, i10);
            } catch (Exception e10) {
                throw new C6630b("Unable to execute badge", e10);
            }
        } else {
            throw new C6630b("No default launcher available");
        }
    }

    private static boolean c(Context context) {
        C6629a aVar;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            Log.e("ShortcutBadger", "Unable to find launch intent for package " + context.getPackageName());
            return false;
        }
        f72438d = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        for (ResolveInfo resolveInfo : context.getPackageManager().queryIntentActivities(intent, 65536)) {
            String str = resolveInfo.activityInfo.packageName;
            Iterator it = f72435a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                try {
                    aVar = (C6629a) ((Class) it.next()).newInstance();
                } catch (Exception unused) {
                    aVar = null;
                }
                if (aVar != null && aVar.a().contains(str)) {
                    f72437c = aVar;
                    break;
                }
            }
            if (f72437c != null) {
                break;
            }
        }
        if (f72437c != null) {
            return true;
        }
        String str2 = Build.MANUFACTURER;
        if (str2.equalsIgnoreCase("ZUK")) {
            f72437c = new h();
            return true;
        } else if (str2.equalsIgnoreCase("OPPO")) {
            f72437c = new d();
            return true;
        } else if (str2.equalsIgnoreCase("VIVO")) {
            f72437c = new f();
            return true;
        } else if (str2.equalsIgnoreCase("ZTE")) {
            f72437c = new g();
            return true;
        } else {
            f72437c = new DefaultBadger();
            return true;
        }
    }
}
