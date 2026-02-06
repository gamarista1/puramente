package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzix;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzji<T extends zzix> {
    private static String zza = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    static <T extends zzix> T zza(Class<T> cls) {
        String str;
        Class<zzji> cls2 = zzji.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(zzix.class)) {
            str = zza;
        } else if (cls.getPackage().equals(cls2.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (zzix) cls.cast(((zzji) Class.forName(str, true, classLoader).getConstructor((Class[]) null).newInstance((Object[]) null)).zza());
        } catch (NoSuchMethodException e10) {
            throw new IllegalStateException(e10);
        } catch (InstantiationException e11) {
            throw new IllegalStateException(e11);
        } catch (IllegalAccessException e12) {
            throw new IllegalStateException(e12);
        } catch (InvocationTargetException e13) {
            throw new IllegalStateException(e13);
        } catch (ClassNotFoundException unused) {
            Iterator<S> it = ServiceLoader.load(cls2, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((zzix) cls.cast(((zzji) it.next()).zza()));
                } catch (ServiceConfigurationError e14) {
                    ServiceConfigurationError serviceConfigurationError = e14;
                    Logger logger = Logger.getLogger(zzit.class.getName());
                    Level level = Level.SEVERE;
                    String simpleName = cls.getSimpleName();
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load " + simpleName, serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (zzix) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzix) cls.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
            } catch (NoSuchMethodException e15) {
                throw new IllegalStateException(e15);
            } catch (IllegalAccessException e16) {
                throw new IllegalStateException(e16);
            } catch (InvocationTargetException e17) {
                throw new IllegalStateException(e17);
            }
        }
    }

    /* access modifiers changed from: protected */
    public abstract T zza();
}
