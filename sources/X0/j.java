package x0;

import java.util.ArrayList;
import kotlin.jvm.internal.C6496s;
import mf.C6559l;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    private float[] f28153a = new float[64];

    public static /* synthetic */ ArrayList b(j jVar, String str, ArrayList arrayList, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            arrayList = new ArrayList();
        }
        return jVar.a(str, arrayList);
    }

    public final ArrayList a(String str, ArrayList arrayList) {
        int i10;
        char charAt;
        int i11;
        int length = str.length();
        int i12 = 0;
        while (i12 < length && C6496s.i(str.charAt(i12), 32) <= 0) {
            i12++;
        }
        while (length > i12 && C6496s.i(str.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i13 = 0;
        while (i12 < length) {
            while (true) {
                i10 = i12 + 1;
                charAt = str.charAt(i12);
                char c10 = charAt | ' ';
                if ((c10 - 'a') * (c10 - 'z') <= 0 && c10 != 'e') {
                    break;
                } else if (i10 >= length) {
                    charAt = 0;
                    break;
                } else {
                    i12 = i10;
                }
            }
            if (charAt != 0) {
                if ((charAt | ' ') != 'z') {
                    i13 = 0;
                    while (true) {
                        if (i10 >= length || C6496s.i(str.charAt(i10), 32) > 0) {
                            long a10 = C2889b.a(str, i10, length);
                            i11 = (int) (a10 >>> 32);
                            float intBitsToFloat = Float.intBitsToFloat((int) (a10 & 4294967295L));
                            if (!Float.isNaN(intBitsToFloat)) {
                                float[] fArr = this.f28153a;
                                int i14 = i13 + 1;
                                fArr[i13] = intBitsToFloat;
                                if (i14 >= fArr.length) {
                                    float[] fArr2 = new float[(i14 * 2)];
                                    this.f28153a = fArr2;
                                    C6559l.j(fArr, fArr2, 0, 0, fArr.length);
                                }
                                i13 = i14;
                            }
                            while (i11 < length && str.charAt(i11) == ',') {
                                i11++;
                            }
                            if (i11 >= length || Float.isNaN(intBitsToFloat)) {
                                i10 = i11;
                            } else {
                                i10 = i11;
                            }
                        } else {
                            i10++;
                        }
                    }
                    i10 = i11;
                }
                i.a(charAt, arrayList, this.f28153a, i13);
            }
            i12 = i10;
        }
        return arrayList;
    }
}
