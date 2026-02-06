package C;

import H0.C1193n;
import com.google.android.gms.common.api.a;
import java.util.List;

public final class H {

    /* renamed from: a  reason: collision with root package name */
    public static final H f845a = new H();

    private H() {
    }

    public final int a(List list, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int i15 = 0;
        float f10 = 0.0f;
        for (int i16 = 0; i16 < size; i16++) {
            C1193n nVar = (C1193n) list.get(i16);
            float e10 = S.e(S.c(nVar));
            if (e10 == 0.0f) {
                if (i10 == Integer.MAX_VALUE) {
                    i14 = Integer.MAX_VALUE;
                } else {
                    i14 = i10 - min;
                }
                int min2 = Math.min(nVar.t0(a.e.API_PRIORITY_OTHER), i14);
                min += min2;
                i15 = Math.max(i15, nVar.s(min2));
            } else if (e10 > 0.0f) {
                f10 += e10;
            }
        }
        if (f10 == 0.0f) {
            i12 = 0;
        } else if (i10 == Integer.MAX_VALUE) {
            i12 = Integer.MAX_VALUE;
        } else {
            i12 = Math.round(((float) Math.max(i10 - min, 0)) / f10);
        }
        int size2 = list.size();
        for (int i17 = 0; i17 < size2; i17++) {
            C1193n nVar2 = (C1193n) list.get(i17);
            float e11 = S.e(S.c(nVar2));
            if (e11 > 0.0f) {
                if (i12 != Integer.MAX_VALUE) {
                    i13 = Math.round(((float) i12) * e11);
                } else {
                    i13 = Integer.MAX_VALUE;
                }
                i15 = Math.max(i15, nVar2.s(i13));
            }
        }
        return i15;
    }

    public final int b(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        float f10 = 0.0f;
        for (int i14 = 0; i14 < size; i14++) {
            C1193n nVar = (C1193n) list.get(i14);
            float e10 = S.e(S.c(nVar));
            int t02 = nVar.t0(i10);
            if (e10 == 0.0f) {
                i13 += t02;
            } else if (e10 > 0.0f) {
                f10 += e10;
                i12 = Math.max(i12, Math.round(((float) t02) / e10));
            }
        }
        return Math.round(((float) i12) * f10) + i13 + ((list.size() - 1) * i11);
    }

    public final int c(List list, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int i15 = 0;
        float f10 = 0.0f;
        for (int i16 = 0; i16 < size; i16++) {
            C1193n nVar = (C1193n) list.get(i16);
            float e10 = S.e(S.c(nVar));
            if (e10 == 0.0f) {
                if (i10 == Integer.MAX_VALUE) {
                    i14 = Integer.MAX_VALUE;
                } else {
                    i14 = i10 - min;
                }
                int min2 = Math.min(nVar.t0(a.e.API_PRIORITY_OTHER), i14);
                min += min2;
                i15 = Math.max(i15, nVar.e0(min2));
            } else if (e10 > 0.0f) {
                f10 += e10;
            }
        }
        if (f10 == 0.0f) {
            i12 = 0;
        } else if (i10 == Integer.MAX_VALUE) {
            i12 = Integer.MAX_VALUE;
        } else {
            i12 = Math.round(((float) Math.max(i10 - min, 0)) / f10);
        }
        int size2 = list.size();
        for (int i17 = 0; i17 < size2; i17++) {
            C1193n nVar2 = (C1193n) list.get(i17);
            float e11 = S.e(S.c(nVar2));
            if (e11 > 0.0f) {
                if (i12 != Integer.MAX_VALUE) {
                    i13 = Math.round(((float) i12) * e11);
                } else {
                    i13 = Integer.MAX_VALUE;
                }
                i15 = Math.max(i15, nVar2.e0(i13));
            }
        }
        return i15;
    }

    public final int d(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        float f10 = 0.0f;
        for (int i14 = 0; i14 < size; i14++) {
            C1193n nVar = (C1193n) list.get(i14);
            float e10 = S.e(S.c(nVar));
            int s02 = nVar.s0(i10);
            if (e10 == 0.0f) {
                i13 += s02;
            } else if (e10 > 0.0f) {
                f10 += e10;
                i12 = Math.max(i12, Math.round(((float) s02) / e10));
            }
        }
        return Math.round(((float) i12) * f10) + i13 + ((list.size() - 1) * i11);
    }

    public final int e(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        float f10 = 0.0f;
        for (int i14 = 0; i14 < size; i14++) {
            C1193n nVar = (C1193n) list.get(i14);
            float e10 = S.e(S.c(nVar));
            int s10 = nVar.s(i10);
            if (e10 == 0.0f) {
                i13 += s10;
            } else if (e10 > 0.0f) {
                f10 += e10;
                i12 = Math.max(i12, Math.round(((float) s10) / e10));
            }
        }
        return Math.round(((float) i12) * f10) + i13 + ((list.size() - 1) * i11);
    }

    public final int f(List list, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int i15 = 0;
        float f10 = 0.0f;
        for (int i16 = 0; i16 < size; i16++) {
            C1193n nVar = (C1193n) list.get(i16);
            float e10 = S.e(S.c(nVar));
            if (e10 == 0.0f) {
                if (i10 == Integer.MAX_VALUE) {
                    i14 = Integer.MAX_VALUE;
                } else {
                    i14 = i10 - min;
                }
                int min2 = Math.min(nVar.s(a.e.API_PRIORITY_OTHER), i14);
                min += min2;
                i15 = Math.max(i15, nVar.t0(min2));
            } else if (e10 > 0.0f) {
                f10 += e10;
            }
        }
        if (f10 == 0.0f) {
            i12 = 0;
        } else if (i10 == Integer.MAX_VALUE) {
            i12 = Integer.MAX_VALUE;
        } else {
            i12 = Math.round(((float) Math.max(i10 - min, 0)) / f10);
        }
        int size2 = list.size();
        for (int i17 = 0; i17 < size2; i17++) {
            C1193n nVar2 = (C1193n) list.get(i17);
            float e11 = S.e(S.c(nVar2));
            if (e11 > 0.0f) {
                if (i12 != Integer.MAX_VALUE) {
                    i13 = Math.round(((float) i12) * e11);
                } else {
                    i13 = Integer.MAX_VALUE;
                }
                i15 = Math.max(i15, nVar2.t0(i13));
            }
        }
        return i15;
    }

    public final int g(List list, int i10, int i11) {
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        float f10 = 0.0f;
        for (int i14 = 0; i14 < size; i14++) {
            C1193n nVar = (C1193n) list.get(i14);
            float e10 = S.e(S.c(nVar));
            int e02 = nVar.e0(i10);
            if (e10 == 0.0f) {
                i13 += e02;
            } else if (e10 > 0.0f) {
                f10 += e10;
                i12 = Math.max(i12, Math.round(((float) e02) / e10));
            }
        }
        return Math.round(((float) i12) * f10) + i13 + ((list.size() - 1) * i11);
    }

    public final int h(List list, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        if (list.isEmpty()) {
            return 0;
        }
        int min = Math.min((list.size() - 1) * i11, i10);
        int size = list.size();
        int i15 = 0;
        float f10 = 0.0f;
        for (int i16 = 0; i16 < size; i16++) {
            C1193n nVar = (C1193n) list.get(i16);
            float e10 = S.e(S.c(nVar));
            if (e10 == 0.0f) {
                if (i10 == Integer.MAX_VALUE) {
                    i14 = Integer.MAX_VALUE;
                } else {
                    i14 = i10 - min;
                }
                int min2 = Math.min(nVar.s(a.e.API_PRIORITY_OTHER), i14);
                min += min2;
                i15 = Math.max(i15, nVar.s0(min2));
            } else if (e10 > 0.0f) {
                f10 += e10;
            }
        }
        if (f10 == 0.0f) {
            i12 = 0;
        } else if (i10 == Integer.MAX_VALUE) {
            i12 = Integer.MAX_VALUE;
        } else {
            i12 = Math.round(((float) Math.max(i10 - min, 0)) / f10);
        }
        int size2 = list.size();
        for (int i17 = 0; i17 < size2; i17++) {
            C1193n nVar2 = (C1193n) list.get(i17);
            float e11 = S.e(S.c(nVar2));
            if (e11 > 0.0f) {
                if (i12 != Integer.MAX_VALUE) {
                    i13 = Math.round(((float) i12) * e11);
                } else {
                    i13 = Integer.MAX_VALUE;
                }
                i15 = Math.max(i15, nVar2.s0(i13));
            }
        }
        return i15;
    }
}
