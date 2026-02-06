package com.google.android.gms.internal.measurement;

import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.google.android.gms.internal.measurement.zzjf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzjd<T extends zzjf<T>> {
    private static final zzjd zzb = new zzjd(true);
    final zzlm<T, Object> zza;
    private boolean zzc;
    private boolean zzd;

    private zzjd() {
        this.zza = new zzlp();
    }

    static int zza(zzmn zzmn, int i10, Object obj) {
        int zzi = zzit.zzi(i10);
        if (zzmn == zzmn.GROUP) {
            zzjm.zza((zzkt) obj);
            zzi <<= 1;
        }
        return zzi + zza(zzmn, obj);
    }

    public static <T extends zzjf<T>> zzjd<T> zzb() {
        return zzb;
    }

    public final /* synthetic */ Object clone() {
        zzjd zzjd = new zzjd();
        for (int i10 = 0; i10 < this.zza.zza(); i10++) {
            Map.Entry<T, Object> zza2 = this.zza.zza(i10);
            zzjd.zzb((zzjf) zza2.getKey(), zza2.getValue());
        }
        for (Map.Entry next : this.zza.zzb()) {
            zzjd.zzb((zzjf) next.getKey(), next.getValue());
        }
        zzjd.zzd = this.zzd;
        return zzjd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjd)) {
            return false;
        }
        return this.zza.equals(((zzjd) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    /* access modifiers changed from: package-private */
    public final Iterator<Map.Entry<T, Object>> zzc() {
        if (this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (this.zzd) {
            return new zzjy(this.zza.zzc().iterator());
        }
        return this.zza.zzc().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        if (this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (this.zzd) {
            return new zzjy(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    public final void zze() {
        if (!this.zzc) {
            for (int i10 = 0; i10 < this.zza.zza(); i10++) {
                Map.Entry<T, Object> zza2 = this.zza.zza(i10);
                if (zza2.getValue() instanceof zzjk) {
                    ((zzjk) zza2.getValue()).zzck();
                }
            }
            this.zza.zzd();
            this.zzc = true;
        }
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        for (int i10 = 0; i10 < this.zza.zza(); i10++) {
            if (!zzc(this.zza.zza(i10))) {
                return false;
            }
        }
        for (Map.Entry<T, Object> zzc2 : this.zza.zzb()) {
            if (!zzc(zzc2)) {
                return false;
            }
        }
        return true;
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        Object obj;
        zzjf zzjf = (zzjf) entry.getKey();
        Object value = entry.getValue();
        boolean z10 = value instanceof zzjx;
        if (zzjf.zze()) {
            if (!z10) {
                Object zza2 = zza(zzjf);
                if (zza2 == null) {
                    zza2 = new ArrayList();
                }
                for (Object zza3 : (List) value) {
                    ((List) zza2).add(zza(zza3));
                }
                this.zza.put(zzjf, zza2);
                return;
            }
            throw new IllegalStateException("Lazy fields can not be repeated");
        } else if (zzjf.zzc() == zzmx.MESSAGE) {
            Object zza4 = zza(zzjf);
            if (zza4 == null) {
                this.zza.put(zzjf, zza(value));
                if (z10) {
                    this.zzd = true;
                }
            } else if (!z10) {
                if (zza4 instanceof zzky) {
                    obj = zzjf.zza((zzky) zza4, (zzky) value);
                } else {
                    obj = zzjf.zza(((zzkt) zza4).zzci(), (zzkt) value).zzai();
                }
                this.zza.put(zzjf, obj);
            } else {
                throw new NoSuchMethodError();
            }
        } else if (!z10) {
            this.zza.put(zzjf, zza(value));
        } else {
            throw new IllegalStateException("Lazy fields must be message-valued");
        }
    }

    private zzjd(zzlm<T, Object> zzlm) {
        this.zza = zzlm;
        zze();
    }

    private static int zza(zzmn zzmn, Object obj) {
        switch (zzjc.zzb[zzmn.ordinal()]) {
            case 1:
                return zzit.zza(((Double) obj).doubleValue());
            case 2:
                return zzit.zza(((Float) obj).floatValue());
            case 3:
                return zzit.zzd(((Long) obj).longValue());
            case 4:
                return zzit.zzg(((Long) obj).longValue());
            case 5:
                return zzit.zzf(((Integer) obj).intValue());
            case 6:
                return zzit.zzc(((Long) obj).longValue());
            case 7:
                return zzit.zze(((Integer) obj).intValue());
            case 8:
                return zzit.zza(((Boolean) obj).booleanValue());
            case 9:
                return zzit.zzb((zzkt) obj);
            case 10:
                if (obj instanceof zzjx) {
                    return zzit.zza((zzkb) (zzjx) obj);
                }
                return zzit.zzc((zzkt) obj);
            case 11:
                if (obj instanceof zzia) {
                    return zzit.zzb((zzia) obj);
                }
                return zzit.zzb((String) obj);
            case 12:
                if (obj instanceof zzia) {
                    return zzit.zzb((zzia) obj);
                }
                return zzit.zza((byte[]) obj);
            case 13:
                return zzit.zzj(((Integer) obj).intValue());
            case StdKeyDeserializer.TYPE_URL:
                return zzit.zzg(((Integer) obj).intValue());
            case StdKeyDeserializer.TYPE_CLASS:
                return zzit.zze(((Long) obj).longValue());
            case 16:
                return zzit.zzh(((Integer) obj).intValue());
            case 17:
                return zzit.zzf(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzjp) {
                    return zzit.zzd(((zzjp) obj).zza());
                }
                return zzit.zzd(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if ((r4 instanceof com.google.android.gms.internal.measurement.zzjp) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        if ((r4 instanceof byte[]) == false) goto L_0x0018;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if ((r4 instanceof com.google.android.gms.internal.measurement.zzjx) == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void zzc(T r3, java.lang.Object r4) {
        /*
            com.google.android.gms.internal.measurement.zzmn r0 = r3.zzb()
            com.google.android.gms.internal.measurement.zzjm.zza(r4)
            int[] r1 = com.google.android.gms.internal.measurement.zzjc.zza
            com.google.android.gms.internal.measurement.zzmx r0 = r0.zzb()
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L_0x0044;
                case 2: goto L_0x0041;
                case 3: goto L_0x003e;
                case 4: goto L_0x003b;
                case 5: goto L_0x0038;
                case 6: goto L_0x0035;
                case 7: goto L_0x002c;
                case 8: goto L_0x0023;
                case 9: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            r1 = r2
            goto L_0x0046
        L_0x001a:
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzkt
            if (r0 != 0) goto L_0x0046
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzjx
            if (r0 == 0) goto L_0x0018
            goto L_0x0046
        L_0x0023:
            boolean r0 = r4 instanceof java.lang.Integer
            if (r0 != 0) goto L_0x0046
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzjp
            if (r0 == 0) goto L_0x0018
            goto L_0x0046
        L_0x002c:
            boolean r0 = r4 instanceof com.google.android.gms.internal.measurement.zzia
            if (r0 != 0) goto L_0x0046
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto L_0x0018
            goto L_0x0046
        L_0x0035:
            boolean r1 = r4 instanceof java.lang.String
            goto L_0x0046
        L_0x0038:
            boolean r1 = r4 instanceof java.lang.Boolean
            goto L_0x0046
        L_0x003b:
            boolean r1 = r4 instanceof java.lang.Double
            goto L_0x0046
        L_0x003e:
            boolean r1 = r4 instanceof java.lang.Float
            goto L_0x0046
        L_0x0041:
            boolean r1 = r4 instanceof java.lang.Long
            goto L_0x0046
        L_0x0044:
            boolean r1 = r4 instanceof java.lang.Integer
        L_0x0046:
            if (r1 == 0) goto L_0x0049
            return
        L_0x0049:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r3.zza()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            com.google.android.gms.internal.measurement.zzmn r3 = r3.zzb()
            com.google.android.gms.internal.measurement.zzmx r3 = r3.zzb()
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.Object[] r3 = new java.lang.Object[]{r1, r3, r4}
            java.lang.String r4 = "Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzjd.zzc(com.google.android.gms.internal.measurement.zzjf, java.lang.Object):void");
    }

    private zzjd(boolean z10) {
        this(new zzlp());
        zze();
    }

    private static <T extends zzjf<T>> boolean zzc(Map.Entry<T, Object> entry) {
        zzjf zzjf = (zzjf) entry.getKey();
        if (zzjf.zzc() != zzmx.MESSAGE) {
            return true;
        }
        if (!zzjf.zze()) {
            return zzb(entry.getValue());
        }
        for (Object zzb2 : (List) entry.getValue()) {
            if (!zzb(zzb2)) {
                return false;
            }
        }
        return true;
    }

    private final void zzb(T t10, Object obj) {
        if (!t10.zze()) {
            zzc(t10, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                zzc(t10, obj2);
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzjx) {
            this.zzd = true;
        }
        this.zza.put(t10, obj);
    }

    public static int zza(zzjf<?> zzjf, Object obj) {
        zzmn zzb2 = zzjf.zzb();
        int zza2 = zzjf.zza();
        if (!zzjf.zze()) {
            return zza(zzb2, zza2, obj);
        }
        List<Object> list = (List) obj;
        int i10 = 0;
        if (!zzjf.zzd()) {
            for (Object zza3 : list) {
                i10 += zza(zzb2, zza2, zza3);
            }
            return i10;
        } else if (list.isEmpty()) {
            return 0;
        } else {
            for (Object zza4 : list) {
                i10 += zza(zzb2, zza4);
            }
            return zzit.zzi(zza2) + i10 + zzit.zzj(i10);
        }
    }

    private static boolean zzb(Object obj) {
        if (obj instanceof zzkv) {
            return ((zzkv) obj).zzcm();
        }
        if (obj instanceof zzjx) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    public final int zza() {
        int i10 = 0;
        for (int i11 = 0; i11 < this.zza.zza(); i11++) {
            i10 += zza(this.zza.zza(i11));
        }
        for (Map.Entry<T, Object> zza2 : this.zza.zzb()) {
            i10 += zza(zza2);
        }
        return i10;
    }

    private static int zza(Map.Entry<T, Object> entry) {
        zzjf zzjf = (zzjf) entry.getKey();
        Object value = entry.getValue();
        if (zzjf.zzc() != zzmx.MESSAGE || zzjf.zze() || zzjf.zzd()) {
            return zza((zzjf<?>) zzjf, value);
        }
        if (value instanceof zzjx) {
            return zzit.zza(((zzjf) entry.getKey()).zza(), (zzkb) (zzjx) value);
        }
        return zzit.zzb(((zzjf) entry.getKey()).zza(), (zzkt) value);
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzky) {
            return ((zzky) obj).zza();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final Object zza(T t10) {
        Object obj = this.zza.get(t10);
        if (!(obj instanceof zzjx)) {
            return obj;
        }
        throw new NoSuchMethodError();
    }

    public final void zza(zzjd<T> zzjd) {
        for (int i10 = 0; i10 < zzjd.zza.zza(); i10++) {
            zzb(zzjd.zza.zza(i10));
        }
        for (Map.Entry<T, Object> zzb2 : zzjd.zza.zzb()) {
            zzb(zzb2);
        }
    }

    static void zza(zzit zzit, zzmn zzmn, int i10, Object obj) {
        if (zzmn == zzmn.GROUP) {
            zzkt zzkt = (zzkt) obj;
            zzjm.zza(zzkt);
            zzit.zzc(i10, 3);
            zzkt.zza(zzit);
            zzit.zzc(i10, 4);
            return;
        }
        zzit.zzc(i10, zzmn.zza());
        switch (zzjc.zzb[zzmn.ordinal()]) {
            case 1:
                zzit.zzb(((Double) obj).doubleValue());
                return;
            case 2:
                zzit.zzb(((Float) obj).floatValue());
                return;
            case 3:
                zzit.zzb(((Long) obj).longValue());
                return;
            case 4:
                zzit.zzb(((Long) obj).longValue());
                return;
            case 5:
                zzit.zzb(((Integer) obj).intValue());
                return;
            case 6:
                zzit.zza(((Long) obj).longValue());
                return;
            case 7:
                zzit.zza(((Integer) obj).intValue());
                return;
            case 8:
                zzit.zzb(((Boolean) obj).booleanValue());
                return;
            case 9:
                ((zzkt) obj).zza(zzit);
                return;
            case 10:
                zzit.zza((zzkt) obj);
                return;
            case 11:
                if (obj instanceof zzia) {
                    zzit.zza((zzia) obj);
                    return;
                } else {
                    zzit.zza((String) obj);
                    return;
                }
            case 12:
                if (obj instanceof zzia) {
                    zzit.zza((zzia) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                zzit.zzb(bArr, 0, bArr.length);
                return;
            case 13:
                zzit.zzc(((Integer) obj).intValue());
                return;
            case StdKeyDeserializer.TYPE_URL:
                zzit.zza(((Integer) obj).intValue());
                return;
            case StdKeyDeserializer.TYPE_CLASS:
                zzit.zza(((Long) obj).longValue());
                return;
            case 16:
                zzit.zzk(((Integer) obj).intValue());
                return;
            case 17:
                zzit.zzh(((Long) obj).longValue());
                return;
            case 18:
                if (obj instanceof zzjp) {
                    zzit.zzb(((zzjp) obj).zza());
                    return;
                } else {
                    zzit.zzb(((Integer) obj).intValue());
                    return;
                }
            default:
                return;
        }
    }
}
