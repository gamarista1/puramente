package com.google.android.gms.internal.play_billing;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

public abstract class zzcw extends zzcv implements NavigableSet, zzdu {
    final transient Comparator zza;
    transient zzcw zzb;

    zzcw(Comparator comparator) {
        this.zza = comparator;
    }

    static zzdr zzq(Comparator comparator) {
        if (zzdc.zza.equals(comparator)) {
            return zzdr.zzc;
        }
        int i10 = zzco.zzd;
        return new zzdr(zzdk.zza, comparator);
    }

    @Deprecated
    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void addLast(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Object ceiling(Object obj) {
        obj.getClass();
        return zzcx.zza(zzp(obj, true), (Object) null);
    }

    public final Comparator comparator() {
        return this.zza;
    }

    public final /* bridge */ /* synthetic */ NavigableSet descendingSet() {
        zzcw zzcw = this.zzb;
        if (zzcw != null) {
            return zzcw;
        }
        zzcw zzl = zzl();
        this.zzb = zzl;
        zzl.zzb = this;
        return zzl;
    }

    public Object first() {
        return iterator().next();
    }

    public Object floor(Object obj) {
        obj.getClass();
        return zzda.zza(zzm(obj, true).descendingIterator(), (Object) null);
    }

    public final Object getFirst() {
        return first();
    }

    public final Object getLast() {
        return last();
    }

    public final /* synthetic */ SortedSet headSet(Object obj) {
        obj.getClass();
        return zzm(obj, false);
    }

    public Object higher(Object obj) {
        obj.getClass();
        return zzcx.zza(zzp(obj, false), (Object) null);
    }

    public Object last() {
        return descendingIterator().next();
    }

    public Object lower(Object obj) {
        obj.getClass();
        return zzda.zza(zzm(obj, false).descendingIterator(), (Object) null);
    }

    @Deprecated
    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeFirst() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final Object removeLast() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public final /* synthetic */ SortedSet tailSet(Object obj) {
        obj.getClass();
        return zzp(obj, true);
    }

    /* renamed from: zze */
    public abstract zzdw iterator();

    /* access modifiers changed from: package-private */
    public abstract zzcw zzl();

    /* access modifiers changed from: package-private */
    public abstract zzcw zzm(Object obj, boolean z10);

    /* renamed from: zzn */
    public final zzcw subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        obj.getClass();
        obj2.getClass();
        if (this.zza.compare(obj, obj2) <= 0) {
            return zzo(obj, z10, obj2, z11);
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public abstract zzcw zzo(Object obj, boolean z10, Object obj2, boolean z11);

    /* access modifiers changed from: package-private */
    public abstract zzcw zzp(Object obj, boolean z10);

    /* renamed from: zzr */
    public abstract zzdw descendingIterator();

    public final /* synthetic */ NavigableSet headSet(Object obj, boolean z10) {
        obj.getClass();
        return zzm(obj, z10);
    }

    public final /* synthetic */ NavigableSet tailSet(Object obj, boolean z10) {
        obj.getClass();
        return zzp(obj, z10);
    }
}
