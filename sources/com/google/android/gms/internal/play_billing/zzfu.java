package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzfu;
import com.google.android.gms.internal.play_billing.zzfv;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

public abstract class zzfu<MessageType extends zzfv<MessageType, BuilderType>, BuilderType extends zzfu<MessageType, BuilderType>> implements zzil {
    private static void zza(List list, int i10) {
        String str = "Element at index " + (list.size() - i10) + " is null.";
        int size = list.size();
        while (true) {
            size--;
            if (size >= i10) {
                list.remove(size);
            } else {
                throw new NullPointerException(str);
            }
        }
    }

    protected static void zzc(Iterable iterable, List list) {
        byte[] bArr = zzhp.zzb;
        iterable.getClass();
        if (iterable instanceof zzhy) {
            List zza = ((zzhy) iterable).zza();
            zzhy zzhy = (zzhy) list;
            int size = list.size();
            for (Object next : zza) {
                if (next == null) {
                    String str = "Element at index " + (zzhy.size() - size) + " is null.";
                    int size2 = zzhy.size();
                    while (true) {
                        size2--;
                        if (size2 >= size) {
                            zzhy.remove(size2);
                        } else {
                            throw new NullPointerException(str);
                        }
                    }
                } else if (next instanceof zzgk) {
                    zzgk zzgk = (zzgk) next;
                    zzhy.zzb();
                } else if (next instanceof byte[]) {
                    byte[] bArr2 = (byte[]) next;
                    zzgk.zzj(bArr2, 0, bArr2.length);
                    zzhy.zzb();
                } else {
                    zzhy.add((String) next);
                }
            }
        } else if (!(iterable instanceof zzit)) {
            if (iterable instanceof Collection) {
                int size3 = ((Collection) iterable).size();
                if (list instanceof ArrayList) {
                    ((ArrayList) list).ensureCapacity(list.size() + size3);
                }
                if (list instanceof zziv) {
                    ((zziv) list).zzf(list.size() + size3);
                }
            }
            int size4 = list.size();
            if (!(iterable instanceof List) || !(iterable instanceof RandomAccess)) {
                for (Object next2 : iterable) {
                    if (next2 == null) {
                        zza(list, size4);
                    }
                    list.add(next2);
                }
                return;
            }
            List list2 = (List) iterable;
            int size5 = list2.size();
            for (int i10 = 0; i10 < size5; i10++) {
                Object obj = list2.get(i10);
                if (obj == null) {
                    zza(list, size4);
                }
                list.add(obj);
            }
        } else {
            list.addAll((Collection) iterable);
        }
    }

    /* renamed from: zzb */
    public abstract zzfu clone();
}
