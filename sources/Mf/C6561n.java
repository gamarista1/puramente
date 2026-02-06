package mf;

import java.util.Arrays;
import kotlin.jvm.internal.C6496s;
import lf.C6505D;
import lf.C6507F;
import lf.C6509H;
import lf.C6512K;
import of.C6625a;

/* renamed from: mf.n  reason: case insensitive filesystem */
abstract class C6561n extends C6560m {
    public static boolean c(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            Object[] objArr3 = objArr[i10];
            Object[] objArr4 = objArr2[i10];
            if (objArr3 != objArr4) {
                if (objArr3 == null || objArr4 == null) {
                    return false;
                }
                if (!(objArr3 instanceof Object[]) || !(objArr4 instanceof Object[])) {
                    if (!(objArr3 instanceof byte[]) || !(objArr4 instanceof byte[])) {
                        if (!(objArr3 instanceof short[]) || !(objArr4 instanceof short[])) {
                            if (!(objArr3 instanceof int[]) || !(objArr4 instanceof int[])) {
                                if (!(objArr3 instanceof long[]) || !(objArr4 instanceof long[])) {
                                    if (!(objArr3 instanceof float[]) || !(objArr4 instanceof float[])) {
                                        if (!(objArr3 instanceof double[]) || !(objArr4 instanceof double[])) {
                                            if (!(objArr3 instanceof char[]) || !(objArr4 instanceof char[])) {
                                                if (!(objArr3 instanceof boolean[]) || !(objArr4 instanceof boolean[])) {
                                                    if (!(objArr3 instanceof C6505D) || !(objArr4 instanceof C6505D)) {
                                                        if (!(objArr3 instanceof C6512K) || !(objArr4 instanceof C6512K)) {
                                                            if (!(objArr3 instanceof C6507F) || !(objArr4 instanceof C6507F)) {
                                                                if (!(objArr3 instanceof C6509H) || !(objArr4 instanceof C6509H)) {
                                                                    if (!C6496s.c(objArr3, objArr4)) {
                                                                        return false;
                                                                    }
                                                                } else if (!C6625a.d(((C6509H) objArr3).I(), ((C6509H) objArr4).I())) {
                                                                    return false;
                                                                }
                                                            } else if (!C6625a.b(((C6507F) objArr3).I(), ((C6507F) objArr4).I())) {
                                                                return false;
                                                            }
                                                        } else if (!C6625a.a(((C6512K) objArr3).I(), ((C6512K) objArr4).I())) {
                                                            return false;
                                                        }
                                                    } else if (!C6625a.c(((C6505D) objArr3).I(), ((C6505D) objArr4).I())) {
                                                        return false;
                                                    }
                                                } else if (!Arrays.equals((boolean[]) objArr3, (boolean[]) objArr4)) {
                                                    return false;
                                                }
                                            } else if (!Arrays.equals((char[]) objArr3, (char[]) objArr4)) {
                                                return false;
                                            }
                                        } else if (!Arrays.equals((double[]) objArr3, (double[]) objArr4)) {
                                            return false;
                                        }
                                    } else if (!Arrays.equals((float[]) objArr3, (float[]) objArr4)) {
                                        return false;
                                    }
                                } else if (!Arrays.equals((long[]) objArr3, (long[]) objArr4)) {
                                    return false;
                                }
                            } else if (!Arrays.equals((int[]) objArr3, (int[]) objArr4)) {
                                return false;
                            }
                        } else if (!Arrays.equals((short[]) objArr3, (short[]) objArr4)) {
                            return false;
                        }
                    } else if (!Arrays.equals((byte[]) objArr3, (byte[]) objArr4)) {
                        return false;
                    }
                } else if (!C6559l.c(objArr3, objArr4)) {
                    return false;
                }
            }
        }
        return true;
    }
}
