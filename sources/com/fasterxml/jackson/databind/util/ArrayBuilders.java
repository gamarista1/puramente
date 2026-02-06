package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class ArrayBuilders {
    private BooleanBuilder _booleanBuilder = null;
    private ByteBuilder _byteBuilder = null;
    private DoubleBuilder _doubleBuilder = null;
    private FloatBuilder _floatBuilder = null;
    private IntBuilder _intBuilder = null;
    private LongBuilder _longBuilder = null;
    private ShortBuilder _shortBuilder = null;

    public static final class BooleanBuilder extends PrimitiveArrayBuilder<boolean[]> {
        public final boolean[] _constructArray(int i10) {
            return new boolean[i10];
        }
    }

    public static final class ByteBuilder extends PrimitiveArrayBuilder<byte[]> {
        public final byte[] _constructArray(int i10) {
            return new byte[i10];
        }
    }

    public static final class DoubleBuilder extends PrimitiveArrayBuilder<double[]> {
        public final double[] _constructArray(int i10) {
            return new double[i10];
        }
    }

    public static final class FloatBuilder extends PrimitiveArrayBuilder<float[]> {
        public final float[] _constructArray(int i10) {
            return new float[i10];
        }
    }

    public static final class IntBuilder extends PrimitiveArrayBuilder<int[]> {
        public final int[] _constructArray(int i10) {
            return new int[i10];
        }
    }

    public static final class LongBuilder extends PrimitiveArrayBuilder<long[]> {
        public final long[] _constructArray(int i10) {
            return new long[i10];
        }
    }

    public static final class ShortBuilder extends PrimitiveArrayBuilder<short[]> {
        public final short[] _constructArray(int i10) {
            return new short[i10];
        }
    }

    public static <T> List<T> addToList(List<T> list, T t10) {
        if (list == null) {
            list = new ArrayList<>();
        }
        list.add(t10);
        return list;
    }

    public static <T> ArrayList<T> arrayToList(T[] tArr) {
        ArrayList<T> arrayList = new ArrayList<>();
        if (tArr != null) {
            for (T add : tArr) {
                arrayList.add(add);
            }
        }
        return arrayList;
    }

    public static <T> HashSet<T> arrayToSet(T[] tArr) {
        HashSet<T> hashSet = new HashSet<>();
        if (tArr != null) {
            for (T add : tArr) {
                hashSet.add(add);
            }
        }
        return hashSet;
    }

    public static Object getArrayComparator(final Object obj) {
        final int length = Array.getLength(obj);
        final Class<?> cls = obj.getClass();
        return new Object() {
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (obj == null || obj.getClass() != cls || Array.getLength(obj) != length) {
                    return false;
                }
                for (int i10 = 0; i10 < length; i10++) {
                    Object obj2 = Array.get(obj, i10);
                    Object obj3 = Array.get(obj, i10);
                    if (obj2 != obj3 && obj2 != null && !obj2.equals(obj3)) {
                        return false;
                    }
                }
                return true;
            }
        };
    }

    public static <T> T[] insertInList(T[] tArr, T t10) {
        int length = tArr.length;
        T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + 1);
        if (length > 0) {
            System.arraycopy(tArr, 0, tArr2, 1, length);
        }
        tArr2[0] = t10;
        return tArr2;
    }

    public static <T> T[] insertInListNoDup(T[] tArr, T t10) {
        int length = tArr.length;
        int i10 = 0;
        while (i10 < length) {
            if (tArr[i10] != t10) {
                i10++;
            } else if (i10 == 0) {
                return tArr;
            } else {
                T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), length);
                System.arraycopy(tArr, 0, tArr2, 1, i10);
                tArr2[0] = t10;
                int i11 = i10 + 1;
                int i12 = length - i11;
                if (i12 > 0) {
                    System.arraycopy(tArr, i11, tArr2, i11, i12);
                }
                return tArr2;
            }
        }
        T[] tArr3 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + 1);
        if (length > 0) {
            System.arraycopy(tArr, 0, tArr3, 1, length);
        }
        tArr3[0] = t10;
        return tArr3;
    }

    public static <T> HashSet<T> setAndArray(Set<T> set, T[] tArr) {
        HashSet<T> hashSet = new HashSet<>();
        if (set != null) {
            hashSet.addAll(set);
        }
        if (tArr != null) {
            for (T add : tArr) {
                hashSet.add(add);
            }
        }
        return hashSet;
    }

    public BooleanBuilder getBooleanBuilder() {
        if (this._booleanBuilder == null) {
            this._booleanBuilder = new BooleanBuilder();
        }
        return this._booleanBuilder;
    }

    public ByteBuilder getByteBuilder() {
        if (this._byteBuilder == null) {
            this._byteBuilder = new ByteBuilder();
        }
        return this._byteBuilder;
    }

    public DoubleBuilder getDoubleBuilder() {
        if (this._doubleBuilder == null) {
            this._doubleBuilder = new DoubleBuilder();
        }
        return this._doubleBuilder;
    }

    public FloatBuilder getFloatBuilder() {
        if (this._floatBuilder == null) {
            this._floatBuilder = new FloatBuilder();
        }
        return this._floatBuilder;
    }

    public IntBuilder getIntBuilder() {
        if (this._intBuilder == null) {
            this._intBuilder = new IntBuilder();
        }
        return this._intBuilder;
    }

    public LongBuilder getLongBuilder() {
        if (this._longBuilder == null) {
            this._longBuilder = new LongBuilder();
        }
        return this._longBuilder;
    }

    public ShortBuilder getShortBuilder() {
        if (this._shortBuilder == null) {
            this._shortBuilder = new ShortBuilder();
        }
        return this._shortBuilder;
    }
}
