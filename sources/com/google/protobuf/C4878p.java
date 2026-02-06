package com.google.protobuf;

import java.lang.reflect.Type;

/* renamed from: com.google.protobuf.p  reason: case insensitive filesystem */
public enum C4878p {
    DOUBLE(0, r4, r8),
    FLOAT(1, r4, r9),
    INT64(2, r4, r5),
    UINT64(3, r4, r5),
    INT32(4, r4, r11),
    FIXED64(5, r4, r10),
    FIXED32(6, r4, r11),
    BOOL(7, r4, r12),
    STRING(8, r4, r13),
    MESSAGE(9, r4, r14),
    BYTES(10, r4, r15),
    UINT32(11, r4, r11),
    ENUM(12, r4, r16),
    SFIXED32(13, r4, r11),
    SFIXED64(14, r4, r10),
    SINT32(15, r4, r11),
    SINT64(16, r4, r10),
    GROUP(17, r4, r14),
    DOUBLE_LIST(18, r4, r8),
    FLOAT_LIST(19, r4, r9),
    INT64_LIST(20, r4, r5),
    UINT64_LIST(21, r4, r5),
    INT32_LIST(22, r4, r11),
    FIXED64_LIST(23, r4, r10),
    FIXED32_LIST(24, r4, r11),
    BOOL_LIST(25, r4, r12),
    STRING_LIST(26, r4, r13),
    MESSAGE_LIST(27, r4, r14),
    BYTES_LIST(28, r4, r15),
    UINT32_LIST(29, r4, r11),
    ENUM_LIST(30, r4, r16),
    SFIXED32_LIST(31, r4, r11),
    SFIXED64_LIST(32, r4, r10),
    SINT32_LIST(33, r4, r11),
    SINT64_LIST(34, r4, r10),
    DOUBLE_LIST_PACKED(35, r4, r8),
    FLOAT_LIST_PACKED(36, r4, r9),
    INT64_LIST_PACKED(37, r4, r5),
    UINT64_LIST_PACKED(38, r4, r5),
    INT32_LIST_PACKED(39, r4, r11),
    FIXED64_LIST_PACKED(40, r4, r10),
    FIXED32_LIST_PACKED(41, r4, r11),
    BOOL_LIST_PACKED(42, r4, r12),
    UINT32_LIST_PACKED(43, r4, r11),
    ENUM_LIST_PACKED(44, r4, r16),
    SFIXED32_LIST_PACKED(45, r4, r11),
    SFIXED64_LIST_PACKED(46, r4, r10),
    SINT32_LIST_PACKED(47, r4, r11),
    SINT64_LIST_PACKED(48, r4, r10),
    GROUP_LIST(49, r7, r14),
    MAP(50, b.MAP, C4884w.VOID);
    

    /* renamed from: x0  reason: collision with root package name */
    private static final C4878p[] f58628x0 = null;

    /* renamed from: y0  reason: collision with root package name */
    private static final Type[] f58630y0 = null;

    /* renamed from: a  reason: collision with root package name */
    private final C4884w f58633a;

    /* renamed from: b  reason: collision with root package name */
    private final int f58634b;

    /* renamed from: c  reason: collision with root package name */
    private final b f58635c;

    /* renamed from: d  reason: collision with root package name */
    private final Class f58636d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f58637e;

    /* renamed from: com.google.protobuf.p$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f58638a = null;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f58639b = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.google.protobuf.w[] r0 = com.google.protobuf.C4884w.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f58639b = r0
                r1 = 1
                com.google.protobuf.w r2 = com.google.protobuf.C4884w.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f58639b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.protobuf.w r3 = com.google.protobuf.C4884w.MESSAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f58639b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.protobuf.w r4 = com.google.protobuf.C4884w.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.google.protobuf.p$b[] r3 = com.google.protobuf.C4878p.b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f58638a = r3
                com.google.protobuf.p$b r4 = com.google.protobuf.C4878p.b.MAP     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f58638a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.google.protobuf.p$b r3 = com.google.protobuf.C4878p.b.VECTOR     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f58638a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.google.protobuf.p$b r1 = com.google.protobuf.C4878p.b.SCALAR     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C4878p.a.<clinit>():void");
        }
    }

    /* renamed from: com.google.protobuf.p$b */
    enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        

        /* renamed from: a  reason: collision with root package name */
        private final boolean f58645a;

        private b(boolean z10) {
            this.f58645a = z10;
        }
    }

    static {
        f58630y0 = new Type[0];
        C4878p[] values = values();
        f58628x0 = new C4878p[values.length];
        for (C4878p pVar : values) {
            f58628x0[pVar.f58634b] = pVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r1 = com.google.protobuf.C4878p.a.f58639b[r5.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C4878p(int r3, com.google.protobuf.C4878p.b r4, com.google.protobuf.C4884w r5) {
        /*
            r0 = this;
            r0.<init>(r1, r2)
            r0.f58634b = r3
            r0.f58635c = r4
            r0.f58633a = r5
            int[] r1 = com.google.protobuf.C4878p.a.f58638a
            int r2 = r4.ordinal()
            r1 = r1[r2]
            r2 = 2
            r3 = 1
            if (r1 == r3) goto L_0x0022
            if (r1 == r2) goto L_0x001b
            r1 = 0
            r0.f58636d = r1
            goto L_0x0028
        L_0x001b:
            java.lang.Class r1 = r5.b()
            r0.f58636d = r1
            goto L_0x0028
        L_0x0022:
            java.lang.Class r1 = r5.b()
            r0.f58636d = r1
        L_0x0028:
            com.google.protobuf.p$b r1 = com.google.protobuf.C4878p.b.SCALAR
            if (r4 != r1) goto L_0x003c
            int[] r1 = com.google.protobuf.C4878p.a.f58639b
            int r4 = r5.ordinal()
            r1 = r1[r4]
            if (r1 == r3) goto L_0x003c
            if (r1 == r2) goto L_0x003c
            r2 = 3
            if (r1 == r2) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r3 = 0
        L_0x003d:
            r0.f58637e = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C4878p.<init>(java.lang.String, int, int, com.google.protobuf.p$b, com.google.protobuf.w):void");
    }

    public int b() {
        return this.f58634b;
    }
}
