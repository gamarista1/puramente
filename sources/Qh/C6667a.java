package qh;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.Collections;
import java.util.List;
import oh.C6630b;

/* renamed from: qh.a  reason: case insensitive filesystem */
public abstract class C6667a {
    public static List a(Context context, Intent intent) {
        List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers != null) {
            return queryBroadcastReceivers;
        }
        return Collections.emptyList();
    }

    public static void b(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent2 = new Intent(intent);
            intent2.setAction("me.leolin.shortcutbadger.BADGE_COUNT_UPDATE");
            try {
                c(context, intent2);
                return;
            } catch (C6630b unused) {
            }
        }
        c(context, intent);
    }

    public static void c(Context context, Intent intent) {
        List<ResolveInfo> a10 = a(context, intent);
        if (a10.size() != 0) {
            for (ResolveInfo resolveInfo : a10) {
                Intent intent2 = new Intent(intent);
                if (resolveInfo != null) {
                    intent2.setPackage(resolveInfo.resolvePackageName);
                    context.sendBroadcast(intent2);
                }
            }
            return;
        }
        throw new C6630b("unable to resolve intent: " + intent.toString());
    }
}
