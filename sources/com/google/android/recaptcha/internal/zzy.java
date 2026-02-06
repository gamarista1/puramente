package com.google.android.recaptcha.internal;

import Ef.c;
import Sg.p;
import android.content.Context;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;
import mf.r;
import yf.C6798l;

public final class zzy implements zzh {
    private final Context zza;
    private final String zzb = "rce_";
    private final zzad zzc;

    public zzy(Context context) {
        this.zza = context;
        this.zzc = new zzad(context);
    }

    public final String zza(String str) {
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str)));
        if (file.exists()) {
            return new String(zzad.zza(file), StandardCharsets.UTF_8);
        }
        return null;
    }

    public final void zzb() {
        try {
            File[] listFiles = this.zza.getCacheDir().listFiles();
            if (listFiles != null) {
                ArrayList<File> arrayList = new ArrayList<>();
                for (File file : listFiles) {
                    if (p.J(file.getName(), this.zzb, false, 2, (Object) null)) {
                        arrayList.add(file);
                    }
                }
                for (File delete : arrayList) {
                    delete.delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    public final void zzc(String str, String str2) {
        c cVar = new c('A', 'z');
        ArrayList arrayList = new ArrayList(C6565s.y(cVar, 10));
        Iterator it = cVar.iterator();
        while (it.hasNext()) {
            arrayList.add(Character.valueOf(((r) it).a()));
        }
        String x02 = C6565s.x0(C6565s.f(arrayList).subList(0, 8), "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C6798l) null, 62, (Object) null);
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(x02)));
        zzad.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
        file.renameTo(new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str))));
    }

    public final boolean zzd(String str) {
        try {
            File[] listFiles = this.zza.getCacheDir().listFiles();
            File file = null;
            if (listFiles != null) {
                int length = listFiles.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        break;
                    }
                    File file2 = listFiles[i10];
                    if (C6496s.c(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                    i10++;
                }
            }
            if (file != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
