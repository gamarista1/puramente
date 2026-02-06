package com.google.common.collect;

import java.util.Arrays;
import java.util.Map;

abstract class P {
    static Object[] a(Object[] objArr, int i10, int i11, Object[] objArr2) {
        return Arrays.copyOfRange(objArr, i10, i11, objArr2.getClass());
    }

    static Object[] b(Object[] objArr, int i10) {
        if (objArr.length != 0) {
            objArr = Arrays.copyOf(objArr, 0);
        }
        return Arrays.copyOf(objArr, i10);
    }

    static Map c(int i10) {
        return C4760k.A(i10);
    }

    static Map d() {
        return C4760k.v();
    }
}
