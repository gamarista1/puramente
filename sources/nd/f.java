package nd;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.core.content.c;

public abstract class f {
    public static void a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z10) {
        int i10;
        if (Build.VERSION.SDK_INT < 34 || context.getApplicationInfo().targetSdkVersion < 34) {
            context.registerReceiver(broadcastReceiver, intentFilter);
            return;
        }
        if (z10) {
            i10 = 2;
        } else {
            i10 = 4;
        }
        Intent unused = context.registerReceiver(broadcastReceiver, intentFilter, i10);
    }

    public static boolean b(Context context) {
        if (c.checkSelfPermission(context, "android.permission.ACCESS_WIFI_STATE") == 0) {
            return true;
        }
        return false;
    }

    public static void c(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length / 2; i10++) {
            byte b10 = bArr[i10];
            bArr[i10] = bArr[(bArr.length - i10) - 1];
            bArr[(bArr.length - i10) - 1] = b10;
        }
    }
}
