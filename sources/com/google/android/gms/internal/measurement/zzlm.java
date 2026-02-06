package com.google.android.gms.internal.measurement;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class zzlm<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    /* access modifiers changed from: private */
    public List<zzls> zza;
    /* access modifiers changed from: private */
    public Map<K, V> zzb;
    private boolean zzc;
    private volatile zzlx zzd;
    /* access modifiers changed from: private */
    public Map<K, V> zze;
    private volatile zzlq zzf;

    private final SortedMap<K, V> zzf() {
        zzg();
        if (this.zzb.isEmpty() && !(this.zzb instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.zzb = treeMap;
            this.zze = treeMap.descendingMap();
        }
        return (SortedMap) this.zzb;
    }

    /* access modifiers changed from: private */
    public final void zzg() {
        if (this.zzc) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        zzg();
        if (!this.zza.isEmpty()) {
            this.zza.clear();
        }
        if (!this.zzb.isEmpty()) {
            this.zzb.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (zza(comparable) >= 0 || this.zzb.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.zzd == null) {
            this.zzd = new zzlx(this);
        }
        return this.zzd;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzlm)) {
            return super.equals(obj);
        }
        zzlm zzlm = (zzlm) obj;
        int size = size();
        if (size != zzlm.size()) {
            return false;
        }
        int zza2 = zza();
        if (zza2 != zzlm.zza()) {
            return entrySet().equals(zzlm.entrySet());
        }
        for (int i10 = 0; i10 < zza2; i10++) {
            if (!zza(i10).equals(zzlm.zza(i10))) {
                return false;
            }
        }
        if (zza2 != size) {
            return this.zzb.equals(zzlm.zzb);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int zza2 = zza(comparable);
        if (zza2 >= 0) {
            return this.zza.get(zza2).getValue();
        }
        return this.zzb.get(comparable);
    }

    public int hashCode() {
        int zza2 = zza();
        int i10 = 0;
        for (int i11 = 0; i11 < zza2; i11++) {
            i10 += this.zza.get(i11).hashCode();
        }
        if (this.zzb.size() > 0) {
            return i10 + this.zzb.hashCode();
        }
        return i10;
    }

    public V remove(Object obj) {
        zzg();
        Comparable comparable = (Comparable) obj;
        int zza2 = zza(comparable);
        if (zza2 >= 0) {
            return zzb(zza2);
        }
        if (this.zzb.isEmpty()) {
            return null;
        }
        return this.zzb.remove(comparable);
    }

    public int size() {
        return this.zza.size() + this.zzb.size();
    }

    public final boolean zze() {
        return this.zzc;
    }

    private zzlm() {
        this.zza = Collections.emptyList();
        this.zzb = Collections.emptyMap();
        this.zze = Collections.emptyMap();
    }

    public final Iterable<Map.Entry<K, V>> zzb() {
        if (this.zzb.isEmpty()) {
            return Collections.emptySet();
        }
        return this.zzb.entrySet();
    }

    /* access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> zzc() {
        if (this.zzf == null) {
            this.zzf = new zzlq(this);
        }
        return this.zzf;
    }

    public void zzd() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.zzc) {
            if (this.zzb.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.zzb);
            }
            this.zzb = map;
            if (this.zze.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.zze);
            }
            this.zze = map2;
            this.zzc = true;
        }
    }

    private final int zza(K k10) {
        int i10;
        int size = this.zza.size();
        int i11 = size - 1;
        if (i11 >= 0) {
            int compareTo = k10.compareTo((Comparable) this.zza.get(i11).getKey());
            if (compareTo > 0) {
                i10 = size + 1;
                return -i10;
            } else if (compareTo == 0) {
                return i11;
            }
        }
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int compareTo2 = k10.compareTo((Comparable) this.zza.get(i13).getKey());
            if (compareTo2 < 0) {
                i11 = i13 - 1;
            } else if (compareTo2 <= 0) {
                return i13;
            } else {
                i12 = i13 + 1;
            }
        }
        i10 = i12 + 1;
        return -i10;
    }

    /* access modifiers changed from: private */
    public final V zzb(int i10) {
        zzg();
        V value = this.zza.remove(i10).getValue();
        if (!this.zzb.isEmpty()) {
            Iterator it = zzf().entrySet().iterator();
            this.zza.add(new zzls(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public final int zza() {
        return this.zza.size();
    }

    /* renamed from: zza */
    public final V put(K k10, V v10) {
        zzg();
        int zza2 = zza(k10);
        if (zza2 >= 0) {
            return this.zza.get(zza2).setValue(v10);
        }
        zzg();
        if (this.zza.isEmpty() && !(this.zza instanceof ArrayList)) {
            this.zza = new ArrayList(16);
        }
        int i10 = -(zza2 + 1);
        if (i10 >= 16) {
            return zzf().put(k10, v10);
        }
        if (this.zza.size() == 16) {
            zzls remove = this.zza.remove(15);
            zzf().put((Comparable) remove.getKey(), remove.getValue());
        }
        this.zza.add(i10, new zzls(this, k10, v10));
        return null;
    }

    public final Map.Entry<K, V> zza(int i10) {
        return this.zza.get(i10);
    }
}
