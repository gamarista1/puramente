package com.google.android.gms.internal.auth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class zzfe extends zzdr implements RandomAccess, zzff {
    @Deprecated
    public static final zzff zza;
    private static final zzfe zzb;
    private final List zzc;

    static {
        zzfe zzfe = new zzfe(false);
        zzb = zzfe;
        zza = zzfe;
    }

    public zzfe() {
        this(10);
    }

    private static String zzh(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzef) {
            return ((zzef) obj).zzl(zzfa.zzb);
        }
        return zzfa.zzd((byte[]) obj);
    }

    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        zza();
        this.zzc.add(i10, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(int i10, Collection collection) {
        zza();
        if (collection instanceof zzff) {
            collection = ((zzff) collection).zzg();
        }
        boolean addAll = this.zzc.addAll(i10, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        zza();
        this.zzc.clear();
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        zza();
        Object remove = this.zzc.remove(i10);
        this.modCount++;
        return zzh(remove);
    }

    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        zza();
        return zzh(this.zzc.set(i10, (String) obj));
    }

    public final int size() {
        return this.zzc.size();
    }

    public final /* bridge */ /* synthetic */ zzez zzd(int i10) {
        if (i10 >= size()) {
            ArrayList arrayList = new ArrayList(i10);
            arrayList.addAll(this.zzc);
            return new zzfe(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final zzff zze() {
        if (zzc()) {
            return new zzhe(this);
        }
        return this;
    }

    /* renamed from: zzf */
    public final String get(int i10) {
        Object obj = this.zzc.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzef) {
            zzef zzef = (zzef) obj;
            String zzl = zzef.zzl(zzfa.zzb);
            if (zzef.zzh()) {
                this.zzc.set(i10, zzl);
            }
            return zzl;
        }
        byte[] bArr = (byte[]) obj;
        String zzd = zzfa.zzd(bArr);
        if (zzhn.zzb(bArr)) {
            this.zzc.set(i10, zzd);
        }
        return zzd;
    }

    public final List zzg() {
        return Collections.unmodifiableList(this.zzc);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzfe(int i10) {
        super(true);
        ArrayList arrayList = new ArrayList(i10);
        this.zzc = arrayList;
    }

    private zzfe(ArrayList arrayList) {
        super(true);
        this.zzc = arrayList;
    }

    private zzfe(boolean z10) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
