package n1;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.c;
import androidx.core.graphics.drawable.IconCompat;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import n1.C2258t;
import n1.N;
import x1.g;

public abstract class c0 {

    /* renamed from: a  reason: collision with root package name */
    private static volatile N f24411a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile List f24412b;

    private static class a {
        static String a(List list) {
            Iterator it = list.iterator();
            int i10 = -1;
            String str = null;
            while (it.hasNext()) {
                ShortcutInfo shortcutInfo = (ShortcutInfo) it.next();
                if (shortcutInfo.getRank() > i10) {
                    String id2 = shortcutInfo.getId();
                    str = id2;
                    i10 = shortcutInfo.getRank();
                }
            }
            return str;
        }
    }

    static boolean a(Context context, C2258t tVar) {
        Bitmap decodeStream;
        IconCompat iconCompat;
        IconCompat iconCompat2 = tVar.f24421i;
        if (iconCompat2 == null) {
            return false;
        }
        int i10 = iconCompat2.f15968a;
        if (i10 != 6 && i10 != 4) {
            return true;
        }
        InputStream k10 = iconCompat2.k(context);
        if (k10 == null || (decodeStream = BitmapFactory.decodeStream(k10)) == null) {
            return false;
        }
        if (i10 == 6) {
            iconCompat = IconCompat.b(decodeStream);
        } else {
            iconCompat = IconCompat.c(decodeStream);
        }
        tVar.f24421i = iconCompat;
        return true;
    }

    public static List b(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            List<Object> a10 = T.a(context.getSystemService(O.a())).getDynamicShortcuts();
            ArrayList arrayList = new ArrayList(a10.size());
            for (Object a11 : a10) {
                arrayList.add(new C2258t.b(context, C2247h.a(a11)).a());
            }
            return arrayList;
        }
        try {
            return f(context).b();
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    public static int c(Context context) {
        g.f(context);
        if (Build.VERSION.SDK_INT >= 25) {
            return T.a(context.getSystemService(O.a())).getMaxShortcutCountPerActivity();
        }
        return 5;
    }

    private static String d(List list) {
        Iterator it = list.iterator();
        int i10 = -1;
        String str = null;
        while (it.hasNext()) {
            C2258t tVar = (C2258t) it.next();
            if (tVar.h() > i10) {
                String c10 = tVar.c();
                str = c10;
                i10 = tVar.h();
            }
        }
        return str;
    }

    private static List e(Context context) {
        Bundle bundle;
        String string;
        if (f24412b == null) {
            ArrayList arrayList = new ArrayList();
            PackageManager packageManager = context.getPackageManager();
            Intent intent = new Intent("androidx.core.content.pm.SHORTCUT_LISTENER");
            intent.setPackage(context.getPackageName());
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 128)) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (!(activityInfo == null || (bundle = activityInfo.metaData) == null || (string = bundle.getString("androidx.core.content.pm.shortcut_listener_impl")) == null)) {
                    try {
                        c.a(Class.forName(string, false, c0.class.getClassLoader()).getMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context}));
                        arrayList.add((Object) null);
                    } catch (Exception unused) {
                    }
                }
            }
            if (f24412b == null) {
                f24412b = arrayList;
            }
        }
        return f24412b;
    }

    private static N f(Context context) {
        if (f24411a == null) {
            try {
                f24411a = (N) Class.forName("androidx.sharetarget.ShortcutInfoCompatSaverImpl", false, c0.class.getClassLoader()).getMethod("getInstance", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
            } catch (Exception unused) {
            }
            if (f24411a == null) {
                f24411a = new N.a();
            }
        }
        return f24411a;
    }

    public static List g(Context context, int i10) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 30) {
            return C2258t.b(context, T.a(context.getSystemService(O.a())).getShortcuts(i10));
        }
        if (i11 >= 25) {
            ShortcutManager a10 = T.a(context.getSystemService(O.a()));
            ArrayList arrayList = new ArrayList();
            if ((i10 & 1) != 0) {
                arrayList.addAll(a10.getManifestShortcuts());
            }
            if ((i10 & 2) != 0) {
                arrayList.addAll(a10.getDynamicShortcuts());
            }
            if ((i10 & 4) != 0) {
                arrayList.addAll(a10.getPinnedShortcuts());
            }
            return C2258t.b(context, arrayList);
        }
        if ((i10 & 2) != 0) {
            try {
                return f(context).b();
            } catch (Exception unused) {
            }
        }
        return Collections.emptyList();
    }

    public static boolean h(Context context, C2258t tVar) {
        g.f(context);
        g.f(tVar);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 > 32 || !tVar.j(1)) {
            int c10 = c(context);
            if (c10 == 0) {
                return false;
            }
            if (i10 <= 29) {
                a(context, tVar);
            }
            if (i10 >= 30) {
                T.a(context.getSystemService(O.a())).pushDynamicShortcut(tVar.k());
            } else if (i10 >= 25) {
                ShortcutManager a10 = T.a(context.getSystemService(O.a()));
                if (a10.isRateLimitingActive()) {
                    return false;
                }
                List a11 = a10.getDynamicShortcuts();
                if (a11.size() >= c10) {
                    a10.removeDynamicShortcuts(Arrays.asList(new String[]{a.a(a11)}));
                }
                boolean unused = a10.addDynamicShortcuts(Arrays.asList(new ShortcutInfo[]{tVar.k()}));
            }
            N f10 = f(context);
            try {
                List b10 = f10.b();
                if (b10.size() >= c10) {
                    f10.d(Arrays.asList(new String[]{d(b10)}));
                }
                f10.a(Arrays.asList(new C2258t[]{tVar}));
                Iterator it = e(context).iterator();
                if (!it.hasNext()) {
                    k(context, tVar.c());
                    return true;
                }
                c.a(it.next());
                Collections.singletonList(tVar);
                throw null;
            } catch (Exception unused2) {
                Iterator it2 = e(context).iterator();
                if (!it2.hasNext()) {
                    k(context, tVar.c());
                    return false;
                }
                c.a(it2.next());
                Collections.singletonList(tVar);
                throw null;
            } catch (Throwable th2) {
                Iterator it3 = e(context).iterator();
                if (it3.hasNext()) {
                    c.a(it3.next());
                    Collections.singletonList(tVar);
                    throw null;
                }
                k(context, tVar.c());
                throw th2;
            }
        } else {
            Iterator it4 = e(context).iterator();
            if (!it4.hasNext()) {
                return true;
            }
            c.a(it4.next());
            Collections.singletonList(tVar);
            throw null;
        }
    }

    public static void i(Context context, List list) {
        if (Build.VERSION.SDK_INT >= 25) {
            T.a(context.getSystemService(O.a())).removeDynamicShortcuts(list);
        }
        f(context).d(list);
        Iterator it = e(context).iterator();
        if (it.hasNext()) {
            c.a(it.next());
            throw null;
        }
    }

    private static List j(List list, int i10) {
        Objects.requireNonNull(list);
        if (Build.VERSION.SDK_INT > 32) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2258t tVar = (C2258t) it.next();
            if (tVar.j(i10)) {
                arrayList.remove(tVar);
            }
        }
        return arrayList;
    }

    public static void k(Context context, String str) {
        g.f(context);
        g.f(str);
        if (Build.VERSION.SDK_INT >= 25) {
            T.a(context.getSystemService(O.a())).reportShortcutUsed(str);
        }
        Iterator it = e(context).iterator();
        if (it.hasNext()) {
            c.a(it.next());
            Collections.singletonList(str);
            throw null;
        }
    }

    public static boolean l(Context context, List list) {
        g.f(context);
        g.f(list);
        List<C2258t> j10 = j(list, 1);
        if (Build.VERSION.SDK_INT >= 25) {
            ArrayList arrayList = new ArrayList(j10.size());
            for (C2258t k10 : j10) {
                arrayList.add(k10.k());
            }
            if (!T.a(context.getSystemService(O.a())).setDynamicShortcuts(arrayList)) {
                return false;
            }
        }
        f(context).c();
        f(context).a(j10);
        Iterator it = e(context).iterator();
        if (!it.hasNext()) {
            return true;
        }
        c.a(it.next());
        throw null;
    }
}
