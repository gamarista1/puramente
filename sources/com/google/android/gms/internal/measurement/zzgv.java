package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import androidx.collection.Y;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import nb.l;

public final class zzgv {

    public static class zza {
        private static volatile l zza;

        private zza() {
        }

        public static l zza(Context context) {
            l lVar;
            l lVar2 = zza;
            if (lVar2 == null) {
                synchronized (zza.class) {
                    try {
                        lVar2 = zza;
                        if (lVar2 == null) {
                            new zzgv();
                            if (!zzgw.zza(Build.TYPE, Build.TAGS)) {
                                lVar = l.a();
                            } else {
                                if (zzgi.zza()) {
                                    if (!context.isDeviceProtectedStorage()) {
                                        context = context.createDeviceProtectedStorageContext();
                                    }
                                }
                                lVar = zzgv.zza(context);
                            }
                            zza = lVar;
                            lVar2 = lVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return lVar2;
        }
    }

    private static zzgt zza(Context context, File file) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            Y y10 = new Y();
            HashMap hashMap = new HashMap();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, 3);
                    if (split.length != 3) {
                        Log.e("HermeticFileOverrides", "Invalid: " + readLine);
                    } else {
                        String zza2 = zza(split[0]);
                        String decode = Uri.decode(zza(split[1]));
                        String str = (String) hashMap.get(split[2]);
                        if (str == null) {
                            String zza3 = zza(split[2]);
                            str = Uri.decode(zza3);
                            if (str.length() < 1024 || str == zza3) {
                                hashMap.put(zza3, str);
                            }
                        }
                        Y y11 = (Y) y10.get(zza2);
                        if (y11 == null) {
                            y11 = new Y();
                            y10.put(zza2, y11);
                        }
                        y11.put(decode, str);
                    }
                } else {
                    String valueOf = String.valueOf(file);
                    String packageName = context.getPackageName();
                    Log.w("HermeticFileOverrides", "Parsed " + valueOf + " for Android package " + packageName);
                    zzgo zzgo = new zzgo(y10);
                    bufferedReader.close();
                    return zzgo;
                }
            }
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    private static l zzb(Context context) {
        try {
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            if (file.exists()) {
                return l.d(file);
            }
            return l.a();
        } catch (RuntimeException e10) {
            Log.e("HermeticFileOverrides", "no data dir", e10);
            return l.a();
        }
    }

    static l zza(Context context) {
        l lVar;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            l zzb = zzb(context);
            if (zzb.c()) {
                lVar = l.d(zza(context, (File) zzb.b()));
            } else {
                lVar = l.a();
            }
            return lVar;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    private static final String zza(String str) {
        return new String(str);
    }
}
