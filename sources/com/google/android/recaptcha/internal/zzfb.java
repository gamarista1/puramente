package com.google.android.recaptcha.internal;

import Sg.p;
import android.net.Uri;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public final class zzfb {
    public static final zzfb zza = new zzfb();
    private static final List zzb = zze(C6565s.q("www.recaptcha.net", "www.gstatic.com/recaptcha", "www.gstatic.cn/recaptcha"));

    private zzfb() {
    }

    public static final boolean zza(Uri uri) {
        if (!zzd(uri) || !zzc(uri.toString())) {
            return false;
        }
        return true;
    }

    public static final boolean zzb(Uri uri) {
        return zzd(uri);
    }

    private static final boolean zzc(String str) {
        List<String> list = zzb;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (String J10 : list) {
            if (p.J(str, J10, false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean zzd(Uri uri) {
        if (TextUtils.isEmpty(uri.toString()) || !C6496s.c(Constants.SCHEME, uri.getScheme()) || TextUtils.isEmpty(uri.getHost())) {
            return false;
        }
        return true;
    }

    private static final List zze(List list) {
        ArrayList arrayList = new ArrayList(C6565s.y(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add("https://" + ((String) it.next()) + "/");
        }
        return arrayList;
    }
}
