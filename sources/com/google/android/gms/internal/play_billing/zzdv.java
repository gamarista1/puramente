package com.google.android.gms.internal.play_billing;

import java.util.Comparator;
import java.util.SortedSet;

final class zzdv {
    public static boolean zza(Comparator comparator, Iterable iterable) {
        Object obj;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            obj = ((SortedSet) iterable).comparator();
            if (obj == null) {
                obj = zzdc.zza;
            }
        } else if (!(iterable instanceof zzdu)) {
            return false;
        } else {
            obj = ((zzdu) iterable).comparator();
        }
        return comparator.equals(obj);
    }
}
