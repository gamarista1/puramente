package com.facebook.react.modules.debug;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C6496s;
import mf.C6565s;

public abstract class e {
    /* access modifiers changed from: private */
    public static final void d(ArrayList arrayList, long j10) {
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            if (((Number) arrayList.get(i11)).longValue() < j10) {
                i10++;
            }
        }
        if (i10 > 0) {
            int i12 = size - i10;
            for (int i13 = 0; i13 < i12; i13++) {
                arrayList.set(i13, arrayList.get(i13 + i10));
            }
            C6565s.h0(arrayList, i10);
        }
    }

    /* access modifiers changed from: private */
    public static final long e(ArrayList arrayList, long j10, long j11) {
        Iterator it = arrayList.iterator();
        C6496s.g(it, "iterator(...)");
        long j12 = -1;
        while (it.hasNext()) {
            Object next = it.next();
            C6496s.g(next, "next(...)");
            long longValue = ((Number) next).longValue();
            if (j10 <= longValue && longValue < j11) {
                j12 = longValue;
            } else if (longValue >= j11) {
                break;
            }
        }
        return j12;
    }

    /* access modifiers changed from: private */
    public static final boolean f(ArrayList arrayList, long j10, long j11) {
        if (arrayList != null && arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            if (j10 <= longValue && longValue < j11) {
                return true;
            }
        }
        return false;
    }
}
