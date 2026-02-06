package com.google.common.collect;

/* renamed from: com.google.common.collect.s  reason: case insensitive filesystem */
abstract class C4767s {
    static int a(int i10, double d10) {
        int max = Math.max(i10, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (d10 * ((double) highestOneBit)))) {
            return highestOneBit;
        }
        int i11 = highestOneBit << 1;
        if (i11 > 0) {
            return i11;
        }
        return 1073741824;
    }

    static int b(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * -862048943), 15)) * 461845907);
    }

    static int c(Object obj) {
        int i10;
        if (obj == null) {
            i10 = 0;
        } else {
            i10 = obj.hashCode();
        }
        return b(i10);
    }
}
