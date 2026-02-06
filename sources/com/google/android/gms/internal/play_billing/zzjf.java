package com.google.android.gms.internal.play_billing;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class zzjf extends AbstractMap {
    /* access modifiers changed from: private */
    public Object[] zza;
    /* access modifiers changed from: private */
    public int zzb;
    /* access modifiers changed from: private */
    public Map zzc = Collections.emptyMap();
    private boolean zzd;
    private volatile zzjd zze;
    private Map zzf = Collections.emptyMap();

    private zzjf() {
    }

    private final int zzl(Comparable comparable) {
        int i10 = this.zzb;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int compareTo = comparable.compareTo(((zzjb) this.zza[i11]).zza());
            if (compareTo > 0) {
                return -(i10 + 1);
            }
            if (compareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int compareTo2 = comparable.compareTo(((zzjb) this.zza[i13]).zza());
            if (compareTo2 < 0) {
                i11 = i13 - 1;
            } else if (compareTo2 <= 0) {
                return i13;
            } else {
                i12 = i13 + 1;
            }
        }
        return -(i12 + 1);
    }

    /* access modifiers changed from: private */
    public final Object zzm(int i10) {
        zzo();
        Object value = ((zzjb) this.zza[i10]).getValue();
        Object[] objArr = this.zza;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.zzb - i10) - 1);
        this.zzb--;
        if (!this.zzc.isEmpty()) {
            Iterator it = zzn().entrySet().iterator();
            Object[] objArr2 = this.zza;
            int i11 = this.zzb;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new zzjb(this, (Comparable) entry.getKey(), entry.getValue());
            this.zzb++;
            it.remove();
        }
        return value;
    }

    private final SortedMap zzn() {
        zzo();
        if (this.zzc.isEmpty() && !(this.zzc instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzc = treeMap;
            this.zzf = treeMap.descendingMap();
        }
        return (SortedMap) this.zzc;
    }

    /* access modifiers changed from: private */
    public final void zzo() {
        if (this.zzd) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        zzo();
        if (this.zzb != 0) {
            this.zza = null;
            this.zzb = 0;
        }
        if (!this.zzc.isEmpty()) {
            this.zzc.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (zzl(comparable) >= 0 || this.zzc.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    public final Set entrySet() {
        if (this.zze == null) {
            this.zze = new zzjd(this, (zzje) null);
        }
        return this.zze;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzjf)) {
            return super.equals(obj);
        }
        zzjf zzjf = (zzjf) obj;
        int size = size();
        if (size != zzjf.size()) {
            return false;
        }
        int i10 = this.zzb;
        if (i10 != zzjf.zzb) {
            return entrySet().equals(zzjf.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!zzg(i11).equals(zzjf.zzg(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.zzc.equals(zzjf.zzc);
        }
        return true;
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zzl = zzl(comparable);
        if (zzl >= 0) {
            return ((zzjb) this.zza[zzl]).getValue();
        }
        return this.zzc.get(comparable);
    }

    public final int hashCode() {
        int i10 = this.zzb;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += this.zza[i12].hashCode();
        }
        if (this.zzc.size() > 0) {
            return i11 + this.zzc.hashCode();
        }
        return i11;
    }

    public final Object remove(Object obj) {
        zzo();
        Comparable comparable = (Comparable) obj;
        int zzl = zzl(comparable);
        if (zzl >= 0) {
            return zzm(zzl);
        }
        if (this.zzc.isEmpty()) {
            return null;
        }
        return this.zzc.remove(comparable);
    }

    public final int size() {
        return this.zzb + this.zzc.size();
    }

    public void zza() {
        Map map;
        Map map2;
        if (!this.zzd) {
            if (this.zzc.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.zzc);
            }
            this.zzc = map;
            if (this.zzf.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.zzf);
            }
            this.zzf = map2;
            this.zzd = true;
        }
    }

    public final int zzc() {
        return this.zzb;
    }

    public final Iterable zzd() {
        if (this.zzc.isEmpty()) {
            return Collections.emptySet();
        }
        return this.zzc.entrySet();
    }

    /* renamed from: zzf */
    public final Object put(Comparable comparable, Object obj) {
        zzo();
        int zzl = zzl(comparable);
        if (zzl >= 0) {
            return ((zzjb) this.zza[zzl]).setValue(obj);
        }
        zzo();
        if (this.zza == null) {
            this.zza = new Object[16];
        }
        int i10 = -(zzl + 1);
        if (i10 >= 16) {
            return zzn().put(comparable, obj);
        }
        if (this.zzb == 16) {
            zzjb zzjb = (zzjb) this.zza[15];
            this.zzb = 15;
            zzn().put(zzjb.zza(), zzjb.getValue());
        }
        Object[] objArr = this.zza;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.zza[i10] = new zzjb(this, comparable, obj);
        this.zzb++;
        return null;
    }

    public final Map.Entry zzg(int i10) {
        if (i10 < this.zzb) {
            return (zzjb) this.zza[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    public final boolean zzj() {
        return this.zzd;
    }

    /* synthetic */ zzjf(zzje zzje) {
    }
}
