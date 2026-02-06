package com.google.android.recaptcha.internal;

public final class zzci {
    public static final zzci zza = new zzci();

    private zzci() {
    }

    public static final Class zza(Object obj) {
        Class cls;
        if (obj instanceof Class) {
            return (Class) obj;
        }
        if (obj instanceof Integer) {
            int intValue = ((Number) obj).intValue();
            if (intValue == 1) {
                cls = Integer.TYPE;
            } else if (intValue == 2) {
                cls = Short.TYPE;
            } else if (intValue == 3) {
                cls = Byte.TYPE;
            } else if (intValue == 4) {
                cls = Long.TYPE;
            } else if (intValue == 5) {
                cls = Character.TYPE;
            } else if (intValue == 6) {
                cls = Float.TYPE;
            } else if (intValue == 7) {
                cls = Double.TYPE;
            } else if (intValue == 8) {
                cls = Boolean.TYPE;
            } else {
                cls = null;
            }
            if (cls != null) {
                return cls;
            }
            throw new zzae(4, 6, (Throwable) null);
        } else if (obj instanceof String) {
            try {
                String str = (String) obj;
                Class<?> cls2 = Class.forName(str);
                if (zzcb.zzb(str)) {
                    return cls2;
                }
                throw new zzae(6, 47, (Throwable) null);
            } catch (Exception e10) {
                throw new zzae(6, 8, e10);
            }
        } else {
            throw new zzae(4, 5, (Throwable) null);
        }
    }
}
