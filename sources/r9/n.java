package R9;

import java.util.Locale;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f33839a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f33840b;

    /* renamed from: c  reason: collision with root package name */
    private final String[] f33841c;

    /* renamed from: d  reason: collision with root package name */
    private final int f33842d;

    private n(String[] strArr, int[] iArr, String[] strArr2, int i10) {
        this.f33839a = strArr;
        this.f33840b = iArr;
        this.f33841c = strArr2;
        this.f33842d = i10;
    }

    public static n b(String str) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new n(strArr, iArr, strArr2, c(str, strArr, iArr, strArr2));
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int c(java.lang.String r12, java.lang.String[] r13, int[] r14, java.lang.String[] r15) {
        /*
            r0 = -1
            r1 = 2
            r2 = 1
            r3 = 0
            java.lang.String r4 = ""
            r13[r3] = r4
            r5 = r3
            r6 = r5
        L_0x000a:
            int r7 = r12.length()
            if (r5 >= r7) goto L_0x0114
            java.lang.String r7 = "$"
            int r8 = r12.indexOf(r7, r5)
            if (r8 != r0) goto L_0x0034
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = r13[r6]
            r7.append(r8)
            java.lang.String r5 = r12.substring(r5)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r13[r6] = r5
            int r5 = r12.length()
            goto L_0x000a
        L_0x0034:
            if (r8 == r5) goto L_0x004f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r9 = r13[r6]
            r7.append(r9)
            java.lang.String r5 = r12.substring(r5, r8)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            r13[r6] = r5
            r5 = r8
            goto L_0x000a
        L_0x004f:
            java.lang.String r8 = "$$"
            boolean r8 = r12.startsWith(r8, r5)
            if (r8 == 0) goto L_0x006c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = r13[r6]
            r8.append(r9)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r13[r6] = r7
            int r5 = r5 + r1
            goto L_0x000a
        L_0x006c:
            int r5 = r5 + r2
            int r7 = r12.indexOf(r7, r5)
            java.lang.String r5 = r12.substring(r5, r7)
            java.lang.String r8 = "RepresentationID"
            boolean r8 = r5.equals(r8)
            if (r8 == 0) goto L_0x0081
            r14[r6] = r2
            goto L_0x010d
        L_0x0081:
            java.lang.String r8 = "%0"
            int r8 = r5.indexOf(r8)
            if (r8 == r0) goto L_0x00b9
            java.lang.String r9 = r5.substring(r8)
            java.lang.String r10 = "d"
            boolean r11 = r9.endsWith(r10)
            if (r11 != 0) goto L_0x00b4
            java.lang.String r11 = "x"
            boolean r11 = r9.endsWith(r11)
            if (r11 != 0) goto L_0x00b4
            java.lang.String r11 = "X"
            boolean r11 = r9.endsWith(r11)
            if (r11 != 0) goto L_0x00b4
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r9)
            r11.append(r10)
            java.lang.String r9 = r11.toString()
        L_0x00b4:
            java.lang.String r5 = r5.substring(r3, r8)
            goto L_0x00bb
        L_0x00b9:
            java.lang.String r9 = "%01d"
        L_0x00bb:
            r5.hashCode()
            int r8 = r5.hashCode()
            switch(r8) {
                case -1950496919: goto L_0x00dd;
                case 2606829: goto L_0x00d2;
                case 38199441: goto L_0x00c7;
                default: goto L_0x00c5;
            }
        L_0x00c5:
            r5 = r0
            goto L_0x00e7
        L_0x00c7:
            java.lang.String r8 = "Bandwidth"
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L_0x00d0
            goto L_0x00c5
        L_0x00d0:
            r5 = r1
            goto L_0x00e7
        L_0x00d2:
            java.lang.String r8 = "Time"
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L_0x00db
            goto L_0x00c5
        L_0x00db:
            r5 = r2
            goto L_0x00e7
        L_0x00dd:
            java.lang.String r8 = "Number"
            boolean r5 = r5.equals(r8)
            if (r5 != 0) goto L_0x00e6
            goto L_0x00c5
        L_0x00e6:
            r5 = r3
        L_0x00e7:
            switch(r5) {
                case 0: goto L_0x0109;
                case 1: goto L_0x0105;
                case 2: goto L_0x0101;
                default: goto L_0x00ea;
            }
        L_0x00ea:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Invalid template: "
            r14.append(r15)
            r14.append(r12)
            java.lang.String r12 = r14.toString()
            r13.<init>(r12)
            throw r13
        L_0x0101:
            r5 = 3
            r14[r6] = r5
            goto L_0x010b
        L_0x0105:
            r5 = 4
            r14[r6] = r5
            goto L_0x010b
        L_0x0109:
            r14[r6] = r1
        L_0x010b:
            r15[r6] = r9
        L_0x010d:
            int r6 = r6 + r2
            r13[r6] = r4
            int r7 = r7 + r2
            r5 = r7
            goto L_0x000a
        L_0x0114:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: R9.n.c(java.lang.String, java.lang.String[], int[], java.lang.String[]):int");
    }

    public String a(String str, long j10, int i10, long j11) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            int i12 = this.f33842d;
            if (i11 < i12) {
                sb2.append(this.f33839a[i11]);
                int i13 = this.f33840b[i11];
                if (i13 == 1) {
                    sb2.append(str);
                } else if (i13 == 2) {
                    sb2.append(String.format(Locale.US, this.f33841c[i11], new Object[]{Long.valueOf(j10)}));
                } else if (i13 == 3) {
                    sb2.append(String.format(Locale.US, this.f33841c[i11], new Object[]{Integer.valueOf(i10)}));
                } else if (i13 == 4) {
                    sb2.append(String.format(Locale.US, this.f33841c[i11], new Object[]{Long.valueOf(j11)}));
                }
                i11++;
            } else {
                sb2.append(this.f33839a[i12]);
                return sb2.toString();
            }
        }
    }
}
