package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Spliterator;
import java.util.Spliterators;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzal  reason: invalid package */
public abstract class zzal<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] zza = new Object[0];

    zzal() {
    }

    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object obj);

    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    public final Object[] toArray() {
        return toArray(zza);
    }

    /* access modifiers changed from: package-private */
    public int zza(Object[] objArr, int i10) {
        zzbd zzbd = (zzbd) iterator();
        while (zzbd.hasNext()) {
            objArr[i10] = zzbd.next();
            i10++;
        }
        return i10;
    }

    /* access modifiers changed from: package-private */
    public int zzb() {
        throw new UnsupportedOperationException();
    }

    public zzaq<E> zzc() {
        if (isEmpty()) {
            return zzaq.zzh();
        }
        return zzaq.zza(toArray());
    }

    /* renamed from: zzd */
    public abstract zzbd<E> iterator();

    /* access modifiers changed from: package-private */
    public abstract boolean zze();

    /* access modifiers changed from: package-private */
    public Object[] zzf() {
        return null;
    }

    public final <T> T[] toArray(T[] tArr) {
        zzz.zza(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] zzf = zzf();
            if (zzf != null) {
                return Arrays.copyOfRange(zzf, zzb(), zza(), tArr.getClass());
            }
            if (tArr.length != 0) {
                tArr = Arrays.copyOf(tArr, 0);
            }
            tArr = Arrays.copyOf(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        zza(tArr, 0);
        return tArr;
    }

    /* access modifiers changed from: package-private */
    public int zza() {
        throw new UnsupportedOperationException();
    }
}
