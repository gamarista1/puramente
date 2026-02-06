package com.google.android.gms.internal.location;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public abstract class zzbs<E> extends zzbp<E> implements List<E>, RandomAccess {
    private static final zzbv<Object> zza = new zzbq(zzbt.zza, 0);

    zzbs() {
    }

    public static <E> zzbs<E> zzi() {
        return zzbt.zza;
    }

    public static <E> zzbs<E> zzj(Collection<? extends E> collection) {
        if (collection instanceof zzbp) {
            zzbs<E> zze = ((zzbp) collection).zze();
            if (!zze.zzf()) {
                return zze;
            }
            Object[] array = zze.toArray();
            return zzk(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        int i10 = 0;
        while (i10 < length) {
            if (array2[i10] != null) {
                i10++;
            } else {
                StringBuilder sb2 = new StringBuilder(20);
                sb2.append("at index ");
                sb2.append(i10);
                throw new NullPointerException(sb2.toString());
            }
        }
        return zzk(array2, length);
    }

    static <E> zzbs<E> zzk(Object[] objArr, int i10) {
        if (i10 == 0) {
            return zzbt.zza;
        }
        return new zzbt(objArr, i10);
    }

    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean contains(@NullableDecl Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    int i10 = 0;
                    while (i10 < size) {
                        if (zzbl.zza(get(i10), list.get(i10))) {
                            i10++;
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it2.hasNext()) {
                            if (!zzbl.zza(it.next(), it2.next())) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = (i10 * 31) + get(i11).hashCode();
        }
        return i10;
    }

    public final int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    public final int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    public final zzbu<E> zza() {
        return listIterator(0);
    }

    public final zzbs<E> zze() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public int zzg(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i11] = get(i11);
        }
        return size;
    }

    /* renamed from: zzh */
    public zzbs<E> subList(int i10, int i11) {
        zzbm.zzc(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return zzbt.zza;
        }
        return new zzbr(this, i10, i12);
    }

    /* renamed from: zzl */
    public final zzbv<E> listIterator(int i10) {
        zzbm.zzb(i10, size(), "index");
        if (isEmpty()) {
            return zza;
        }
        return new zzbq(this, i10);
    }
}
