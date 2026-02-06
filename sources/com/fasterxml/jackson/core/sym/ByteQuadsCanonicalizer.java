package com.fasterxml.jackson.core.sym;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import w.C2780Y;

public final class ByteQuadsCanonicalizer {
    private static final int DEFAULT_T_SIZE = 64;
    static final int MAX_ENTRIES_FOR_REUSE = 6000;
    private static final int MAX_T_SIZE = 65536;
    private static final int MIN_HASH_SIZE = 16;
    private static final int MULT = 33;
    private static final int MULT2 = 65599;
    private static final int MULT3 = 31;
    /* access modifiers changed from: private */
    public int _count;
    private final boolean _failOnDoS;
    /* access modifiers changed from: private */
    public int[] _hashArea;
    private boolean _hashShared;
    /* access modifiers changed from: private */
    public int _hashSize;
    private boolean _intern;
    /* access modifiers changed from: private */
    public int _longNameOffset;
    /* access modifiers changed from: private */
    public String[] _names;
    private transient boolean _needRehash;
    private final ByteQuadsCanonicalizer _parent;
    private int _secondaryStart;
    private final int _seed;
    /* access modifiers changed from: private */
    public int _spilloverEnd;
    private final AtomicReference<TableInfo> _tableInfo;
    /* access modifiers changed from: private */
    public int _tertiaryShift;
    private int _tertiaryStart;

    private ByteQuadsCanonicalizer(int i10, boolean z10, int i11, boolean z11) {
        this._parent = null;
        this._seed = i11;
        this._intern = z10;
        this._failOnDoS = z11;
        int i12 = 16;
        if (i10 >= 16) {
            if (((i10 - 1) & i10) != 0) {
                while (i12 < i10) {
                    i12 += i12;
                }
            }
            this._tableInfo = new AtomicReference<>(TableInfo.createInitial(i10));
        }
        i10 = i12;
        this._tableInfo = new AtomicReference<>(TableInfo.createInitial(i10));
    }

    private int _appendLongName(int[] iArr, int i10) {
        int i11 = this._longNameOffset;
        int i12 = i11 + i10;
        int[] iArr2 = this._hashArea;
        if (i12 > iArr2.length) {
            this._hashArea = Arrays.copyOf(this._hashArea, this._hashArea.length + Math.max(i12 - iArr2.length, Math.min(4096, this._hashSize)));
        }
        System.arraycopy(iArr, 0, this._hashArea, i11, i10);
        this._longNameOffset += i10;
        return i11;
    }

    private final int _calcOffset(int i10) {
        return (i10 & (this._hashSize - 1)) << 2;
    }

    static int _calcTertiaryShift(int i10) {
        int i11 = i10 >> 2;
        if (i11 < 64) {
            return 4;
        }
        if (i11 <= 256) {
            return 5;
        }
        return i11 <= 1024 ? 6 : 7;
    }

    private int _findOffsetForAdd(int i10) {
        int _calcOffset = _calcOffset(i10);
        int[] iArr = this._hashArea;
        if (iArr[_calcOffset + 3] == 0) {
            return _calcOffset;
        }
        int i11 = this._secondaryStart + ((_calcOffset >> 3) << 2);
        if (iArr[i11 + 3] == 0) {
            return i11;
        }
        int i12 = this._tertiaryStart;
        int i13 = this._tertiaryShift;
        int i14 = i12 + ((_calcOffset >> (i13 + 2)) << i13);
        int i15 = (1 << i13) + i14;
        while (i14 < i15) {
            if (iArr[i14 + 3] == 0) {
                return i14;
            }
            i14 += 4;
        }
        int i16 = this._spilloverEnd;
        int i17 = i16 + 4;
        this._spilloverEnd = i17;
        if (i17 >= (this._hashSize << 3)) {
            if (this._failOnDoS) {
                _reportTooManyCollisions();
            }
            this._needRehash = true;
        }
        return i16;
    }

    private String _findSecondary(int i10, int i11) {
        int i12 = this._tertiaryStart;
        int i13 = this._tertiaryShift;
        int i14 = i12 + ((i10 >> (i13 + 2)) << i13);
        int[] iArr = this._hashArea;
        int i15 = (1 << i13) + i14;
        while (i14 < i15) {
            int i16 = iArr[i14 + 3];
            if (i11 == iArr[i14] && 1 == i16) {
                return this._names[i14 >> 2];
            }
            if (i16 == 0) {
                return null;
            }
            i14 += 4;
        }
        for (int _spilloverStart = _spilloverStart(); _spilloverStart < this._spilloverEnd; _spilloverStart += 4) {
            if (i11 == iArr[_spilloverStart] && 1 == iArr[_spilloverStart + 3]) {
                return this._names[_spilloverStart >> 2];
            }
        }
        return null;
    }

    private final int _spilloverStart() {
        int i10 = this._hashSize;
        return (i10 << 3) - i10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        if (r8[r9] == r0[r10]) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        r9 = r3 + 1;
        r4 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        if (r8[r3] == r0[r10]) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        r3 = r9 + 1;
        r4 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        if (r8[r9] == r0[r10]) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        r10 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0043, code lost:
        r9 = r3 + 1;
        r5 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        if (r8[r3] == r0[r10]) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004d, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        r4 = r3 + 2;
        r6 = r10 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r8[r9] == r0[r5]) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0058, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
        r3 = r3 + 3;
        r10 = r10 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0061, code lost:
        if (r8[r4] == r0[r6]) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0063, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0068, code lost:
        if (r8[r3] == r0[r10]) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x006b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        r3 = r9 + 1;
        r4 = r10 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean _verifyLongName(int[] r8, int r9, int r10) {
        /*
            r7 = this;
            int[] r0 = r7._hashArea
            r1 = 1
            r2 = 0
            switch(r9) {
                case 4: goto L_0x0042;
                case 5: goto L_0x0034;
                case 6: goto L_0x0026;
                case 7: goto L_0x0018;
                case 8: goto L_0x000c;
                default: goto L_0x0007;
            }
        L_0x0007:
            boolean r8 = r7._verifyLongName2(r8, r9, r10)
            return r8
        L_0x000c:
            r9 = r8[r2]
            int r3 = r10 + 1
            r10 = r0[r10]
            if (r9 == r10) goto L_0x0015
            return r2
        L_0x0015:
            r9 = r1
            r10 = r3
            goto L_0x0019
        L_0x0018:
            r9 = r2
        L_0x0019:
            int r3 = r9 + 1
            r9 = r8[r9]
            int r4 = r10 + 1
            r10 = r0[r10]
            if (r9 == r10) goto L_0x0024
            return r2
        L_0x0024:
            r10 = r4
            goto L_0x0027
        L_0x0026:
            r3 = r2
        L_0x0027:
            int r9 = r3 + 1
            r3 = r8[r3]
            int r4 = r10 + 1
            r10 = r0[r10]
            if (r3 == r10) goto L_0x0032
            return r2
        L_0x0032:
            r10 = r4
            goto L_0x0035
        L_0x0034:
            r9 = r2
        L_0x0035:
            int r3 = r9 + 1
            r9 = r8[r9]
            int r4 = r10 + 1
            r10 = r0[r10]
            if (r9 == r10) goto L_0x0040
            return r2
        L_0x0040:
            r10 = r4
            goto L_0x0043
        L_0x0042:
            r3 = r2
        L_0x0043:
            int r9 = r3 + 1
            r4 = r8[r3]
            int r5 = r10 + 1
            r6 = r0[r10]
            if (r4 == r6) goto L_0x004e
            return r2
        L_0x004e:
            int r4 = r3 + 2
            r9 = r8[r9]
            int r6 = r10 + 2
            r5 = r0[r5]
            if (r9 == r5) goto L_0x0059
            return r2
        L_0x0059:
            int r3 = r3 + 3
            r9 = r8[r4]
            int r10 = r10 + 3
            r4 = r0[r6]
            if (r9 == r4) goto L_0x0064
            return r2
        L_0x0064:
            r8 = r8[r3]
            r9 = r0[r10]
            if (r8 == r9) goto L_0x006b
            return r2
        L_0x006b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer._verifyLongName(int[], int, int):boolean");
    }

    private boolean _verifyLongName2(int[] iArr, int i10, int i11) {
        int i12 = 0;
        while (true) {
            int i13 = i12 + 1;
            int i14 = i11 + 1;
            if (iArr[i12] != this._hashArea[i11]) {
                return false;
            }
            if (i13 >= i10) {
                return true;
            }
            i12 = i13;
            i11 = i14;
        }
    }

    private void _verifyNeedForRehash() {
        if (this._count > (this._hashSize >> 1)) {
            int _spilloverStart = (this._spilloverEnd - _spilloverStart()) >> 2;
            int i10 = this._count;
            if (_spilloverStart > ((i10 + 1) >> 7) || ((double) i10) > ((double) this._hashSize) * 0.8d) {
                this._needRehash = true;
            }
        }
    }

    private void _verifySharing() {
        if (this._hashShared) {
            int[] iArr = this._hashArea;
            this._hashArea = Arrays.copyOf(iArr, iArr.length);
            String[] strArr = this._names;
            this._names = (String[]) Arrays.copyOf(strArr, strArr.length);
            this._hashShared = false;
            _verifyNeedForRehash();
        }
        if (this._needRehash) {
            rehash();
        }
    }

    public static ByteQuadsCanonicalizer createRoot() {
        long currentTimeMillis = System.currentTimeMillis();
        return createRoot((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
    }

    private void mergeChild(TableInfo tableInfo) {
        int i10 = tableInfo.count;
        TableInfo tableInfo2 = this._tableInfo.get();
        if (i10 != tableInfo2.count) {
            if (i10 > MAX_ENTRIES_FOR_REUSE) {
                tableInfo = TableInfo.createInitial(64);
            }
            C2780Y.a(this._tableInfo, tableInfo2, tableInfo);
        }
    }

    private void nukeSymbols(boolean z10) {
        this._count = 0;
        this._spilloverEnd = _spilloverStart();
        this._longNameOffset = this._hashSize << 3;
        if (z10) {
            Arrays.fill(this._hashArea, 0);
            Arrays.fill(this._names, (Object) null);
        }
    }

    private void rehash() {
        this._needRehash = false;
        this._hashShared = false;
        int[] iArr = this._hashArea;
        String[] strArr = this._names;
        int i10 = this._hashSize;
        int i11 = this._count;
        int i12 = i10 + i10;
        int i13 = this._spilloverEnd;
        if (i12 > MAX_T_SIZE) {
            nukeSymbols(true);
            return;
        }
        this._hashArea = new int[(iArr.length + (i10 << 3))];
        this._hashSize = i12;
        int i14 = i12 << 2;
        this._secondaryStart = i14;
        this._tertiaryStart = i14 + (i14 >> 1);
        this._tertiaryShift = _calcTertiaryShift(i12);
        this._names = new String[(strArr.length << 1)];
        nukeSymbols(false);
        int[] iArr2 = new int[16];
        int i15 = 0;
        for (int i16 = 0; i16 < i13; i16 += 4) {
            int i17 = iArr[i16 + 3];
            if (i17 != 0) {
                i15++;
                String str = strArr[i16 >> 2];
                if (i17 == 1) {
                    iArr2[0] = iArr[i16];
                    addName(str, iArr2, 1);
                } else if (i17 == 2) {
                    iArr2[0] = iArr[i16];
                    iArr2[1] = iArr[i16 + 1];
                    addName(str, iArr2, 2);
                } else if (i17 != 3) {
                    if (i17 > iArr2.length) {
                        iArr2 = new int[i17];
                    }
                    System.arraycopy(iArr, iArr[i16 + 1], iArr2, 0, i17);
                    addName(str, iArr2, i17);
                } else {
                    iArr2[0] = iArr[i16];
                    iArr2[1] = iArr[i16 + 1];
                    iArr2[2] = iArr[i16 + 2];
                    addName(str, iArr2, 3);
                }
            }
        }
        if (i15 != i11) {
            throw new IllegalStateException("Failed rehash(): old count=" + i11 + ", copyCount=" + i15);
        }
    }

    /* access modifiers changed from: protected */
    public void _reportTooManyCollisions() {
        if (this._hashSize > 1024) {
            throw new IllegalStateException("Spill-over slots in symbol table with " + this._count + " entries, hash area of " + this._hashSize + " slots is now full (all " + (this._hashSize >> 3) + " slots -- suspect a DoS attack based on hash collisions." + " You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`");
        }
    }

    public String addName(String str, int i10) {
        _verifySharing();
        if (this._intern) {
            str = InternCache.instance.intern(str);
        }
        int _findOffsetForAdd = _findOffsetForAdd(calcHash(i10));
        int[] iArr = this._hashArea;
        iArr[_findOffsetForAdd] = i10;
        iArr[_findOffsetForAdd + 3] = 1;
        this._names[_findOffsetForAdd >> 2] = str;
        this._count++;
        _verifyNeedForRehash();
        return str;
    }

    public int bucketCount() {
        return this._hashSize;
    }

    public int calcHash(int i10) {
        int i11 = i10 ^ this._seed;
        int i12 = i11 + (i11 >>> 16);
        int i13 = i12 ^ (i12 << 3);
        return i13 + (i13 >>> 12);
    }

    public String findName(int i10) {
        int _calcOffset = _calcOffset(calcHash(i10));
        int[] iArr = this._hashArea;
        int i11 = iArr[_calcOffset + 3];
        if (i11 == 1) {
            if (iArr[_calcOffset] == i10) {
                return this._names[_calcOffset >> 2];
            }
        } else if (i11 == 0) {
            return null;
        }
        int i12 = this._secondaryStart + ((_calcOffset >> 3) << 2);
        int i13 = iArr[i12 + 3];
        if (i13 == 1) {
            if (iArr[i12] == i10) {
                return this._names[i12 >> 2];
            }
        } else if (i13 == 0) {
            return null;
        }
        return _findSecondary(_calcOffset, i10);
    }

    public int hashSeed() {
        return this._seed;
    }

    public ByteQuadsCanonicalizer makeChild(int i10) {
        return new ByteQuadsCanonicalizer(this, JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(i10), this._seed, JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(i10), this._tableInfo.get());
    }

    public boolean maybeDirty() {
        return !this._hashShared;
    }

    public int primaryCount() {
        int i10 = this._secondaryStart;
        int i11 = 0;
        for (int i12 = 3; i12 < i10; i12 += 4) {
            if (this._hashArea[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }

    public void release() {
        if (this._parent != null && maybeDirty()) {
            this._parent.mergeChild(new TableInfo(this));
            this._hashShared = true;
        }
    }

    public int secondaryCount() {
        int i10 = this._tertiaryStart;
        int i11 = 0;
        for (int i12 = this._secondaryStart + 3; i12 < i10; i12 += 4) {
            if (this._hashArea[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }

    public int size() {
        AtomicReference<TableInfo> atomicReference = this._tableInfo;
        if (atomicReference != null) {
            return atomicReference.get().count;
        }
        return this._count;
    }

    public int spilloverCount() {
        return (this._spilloverEnd - _spilloverStart()) >> 2;
    }

    public int tertiaryCount() {
        int i10 = this._tertiaryStart + 3;
        int i11 = this._hashSize + i10;
        int i12 = 0;
        while (i10 < i11) {
            if (this._hashArea[i10] != 0) {
                i12++;
            }
            i10 += 4;
        }
        return i12;
    }

    public String toString() {
        int primaryCount = primaryCount();
        int secondaryCount = secondaryCount();
        int tertiaryCount = tertiaryCount();
        int spilloverCount = spilloverCount();
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", new Object[]{ByteQuadsCanonicalizer.class.getName(), Integer.valueOf(this._count), Integer.valueOf(this._hashSize), Integer.valueOf(primaryCount), Integer.valueOf(secondaryCount), Integer.valueOf(tertiaryCount), Integer.valueOf(spilloverCount), Integer.valueOf(primaryCount + secondaryCount + tertiaryCount + spilloverCount), Integer.valueOf(totalCount())});
    }

    public int totalCount() {
        int i10 = this._hashSize << 3;
        int i11 = 0;
        for (int i12 = 3; i12 < i10; i12 += 4) {
            if (this._hashArea[i12] != 0) {
                i11++;
            }
        }
        return i11;
    }

    public int calcHash(int i10, int i11) {
        int i12 = i10 + (i10 >>> 15);
        int i13 = ((i12 ^ (i12 >>> 9)) + (i11 * 33)) ^ this._seed;
        int i14 = i13 + (i13 >>> 16);
        int i15 = i14 ^ (i14 >>> 4);
        return i15 + (i15 << 3);
    }

    protected static ByteQuadsCanonicalizer createRoot(int i10) {
        return new ByteQuadsCanonicalizer(64, true, i10, true);
    }

    public int calcHash(int i10, int i11, int i12) {
        int i13 = i10 ^ this._seed;
        int i14 = (((i13 + (i13 >>> 9)) * MULT3) + i11) * 33;
        int i15 = (i14 + (i14 >>> 15)) ^ i12;
        int i16 = i15 + (i15 >>> 4);
        int i17 = i16 + (i16 >>> 15);
        return i17 ^ (i17 << 9);
    }

    public int calcHash(int[] iArr, int i10) {
        if (i10 >= 4) {
            int i11 = iArr[0] ^ this._seed;
            int i12 = i11 + (i11 >>> 9) + iArr[1];
            int i13 = ((i12 + (i12 >>> 15)) * 33) ^ iArr[2];
            int i14 = i13 + (i13 >>> 4);
            for (int i15 = 3; i15 < i10; i15++) {
                int i16 = iArr[i15];
                i14 += i16 ^ (i16 >> 21);
            }
            int i17 = i14 * MULT2;
            int i18 = i17 + (i17 >>> 19);
            return (i18 << 5) ^ i18;
        }
        throw new IllegalArgumentException();
    }

    private ByteQuadsCanonicalizer(ByteQuadsCanonicalizer byteQuadsCanonicalizer, boolean z10, int i10, boolean z11, TableInfo tableInfo) {
        this._parent = byteQuadsCanonicalizer;
        this._seed = i10;
        this._intern = z10;
        this._failOnDoS = z11;
        this._tableInfo = null;
        this._count = tableInfo.count;
        int i11 = tableInfo.size;
        this._hashSize = i11;
        int i12 = i11 << 2;
        this._secondaryStart = i12;
        this._tertiaryStart = i12 + (i12 >> 1);
        this._tertiaryShift = tableInfo.tertiaryShift;
        this._hashArea = tableInfo.mainHash;
        this._names = tableInfo.names;
        this._spilloverEnd = tableInfo.spilloverEnd;
        this._longNameOffset = tableInfo.longNameOffset;
        this._needRehash = false;
        this._hashShared = true;
    }

    private static final class TableInfo {
        public final int count;
        public final int longNameOffset;
        public final int[] mainHash;
        public final String[] names;
        public final int size;
        public final int spilloverEnd;
        public final int tertiaryShift;

        public TableInfo(int i10, int i11, int i12, int[] iArr, String[] strArr, int i13, int i14) {
            this.size = i10;
            this.count = i11;
            this.tertiaryShift = i12;
            this.mainHash = iArr;
            this.names = strArr;
            this.spilloverEnd = i13;
            this.longNameOffset = i14;
        }

        public static TableInfo createInitial(int i10) {
            int i11 = i10 << 3;
            return new TableInfo(i10, 0, ByteQuadsCanonicalizer._calcTertiaryShift(i10), new int[i11], new String[(i10 << 1)], i11 - i10, i11);
        }

        public TableInfo(ByteQuadsCanonicalizer byteQuadsCanonicalizer) {
            this.size = byteQuadsCanonicalizer._hashSize;
            this.count = byteQuadsCanonicalizer._count;
            this.tertiaryShift = byteQuadsCanonicalizer._tertiaryShift;
            this.mainHash = byteQuadsCanonicalizer._hashArea;
            this.names = byteQuadsCanonicalizer._names;
            this.spilloverEnd = byteQuadsCanonicalizer._spilloverEnd;
            this.longNameOffset = byteQuadsCanonicalizer._longNameOffset;
        }
    }

    private String _findSecondary(int i10, int i11, int i12) {
        int i13 = this._tertiaryStart;
        int i14 = this._tertiaryShift;
        int i15 = i13 + ((i10 >> (i14 + 2)) << i14);
        int[] iArr = this._hashArea;
        int i16 = (1 << i14) + i15;
        while (i15 < i16) {
            int i17 = iArr[i15 + 3];
            if (i11 == iArr[i15] && i12 == iArr[i15 + 1] && 2 == i17) {
                return this._names[i15 >> 2];
            }
            if (i17 == 0) {
                return null;
            }
            i15 += 4;
        }
        for (int _spilloverStart = _spilloverStart(); _spilloverStart < this._spilloverEnd; _spilloverStart += 4) {
            if (i11 == iArr[_spilloverStart] && i12 == iArr[_spilloverStart + 1] && 2 == iArr[_spilloverStart + 3]) {
                return this._names[_spilloverStart >> 2];
            }
        }
        return null;
    }

    public String addName(String str, int i10, int i11) {
        _verifySharing();
        if (this._intern) {
            str = InternCache.instance.intern(str);
        }
        int _findOffsetForAdd = _findOffsetForAdd(i11 == 0 ? calcHash(i10) : calcHash(i10, i11));
        int[] iArr = this._hashArea;
        iArr[_findOffsetForAdd] = i10;
        iArr[_findOffsetForAdd + 1] = i11;
        iArr[_findOffsetForAdd + 3] = 2;
        this._names[_findOffsetForAdd >> 2] = str;
        this._count++;
        _verifyNeedForRehash();
        return str;
    }

    public String findName(int i10, int i11) {
        int _calcOffset = _calcOffset(calcHash(i10, i11));
        int[] iArr = this._hashArea;
        int i12 = iArr[_calcOffset + 3];
        if (i12 == 2) {
            if (i10 == iArr[_calcOffset] && i11 == iArr[_calcOffset + 1]) {
                return this._names[_calcOffset >> 2];
            }
        } else if (i12 == 0) {
            return null;
        }
        int i13 = this._secondaryStart + ((_calcOffset >> 3) << 2);
        int i14 = iArr[i13 + 3];
        if (i14 == 2) {
            if (i10 == iArr[i13] && i11 == iArr[i13 + 1]) {
                return this._names[i13 >> 2];
            }
        } else if (i14 == 0) {
            return null;
        }
        return _findSecondary(_calcOffset, i10, i11);
    }

    private String _findSecondary(int i10, int i11, int i12, int i13) {
        int i14 = this._tertiaryStart;
        int i15 = this._tertiaryShift;
        int i16 = i14 + ((i10 >> (i15 + 2)) << i15);
        int[] iArr = this._hashArea;
        int i17 = (1 << i15) + i16;
        while (i16 < i17) {
            int i18 = iArr[i16 + 3];
            if (i11 == iArr[i16] && i12 == iArr[i16 + 1] && i13 == iArr[i16 + 2] && 3 == i18) {
                return this._names[i16 >> 2];
            }
            if (i18 == 0) {
                return null;
            }
            i16 += 4;
        }
        for (int _spilloverStart = _spilloverStart(); _spilloverStart < this._spilloverEnd; _spilloverStart += 4) {
            if (i11 == iArr[_spilloverStart] && i12 == iArr[_spilloverStart + 1] && i13 == iArr[_spilloverStart + 2] && 3 == iArr[_spilloverStart + 3]) {
                return this._names[_spilloverStart >> 2];
            }
        }
        return null;
    }

    public String addName(String str, int i10, int i11, int i12) {
        _verifySharing();
        if (this._intern) {
            str = InternCache.instance.intern(str);
        }
        int _findOffsetForAdd = _findOffsetForAdd(calcHash(i10, i11, i12));
        int[] iArr = this._hashArea;
        iArr[_findOffsetForAdd] = i10;
        iArr[_findOffsetForAdd + 1] = i11;
        iArr[_findOffsetForAdd + 2] = i12;
        iArr[_findOffsetForAdd + 3] = 3;
        this._names[_findOffsetForAdd >> 2] = str;
        this._count++;
        _verifyNeedForRehash();
        return str;
    }

    public String findName(int i10, int i11, int i12) {
        int _calcOffset = _calcOffset(calcHash(i10, i11, i12));
        int[] iArr = this._hashArea;
        int i13 = iArr[_calcOffset + 3];
        if (i13 == 3) {
            if (i10 == iArr[_calcOffset] && iArr[_calcOffset + 1] == i11 && iArr[_calcOffset + 2] == i12) {
                return this._names[_calcOffset >> 2];
            }
        } else if (i13 == 0) {
            return null;
        }
        int i14 = this._secondaryStart + ((_calcOffset >> 3) << 2);
        int i15 = iArr[i14 + 3];
        if (i15 == 3) {
            if (i10 == iArr[i14] && iArr[i14 + 1] == i11 && iArr[i14 + 2] == i12) {
                return this._names[i14 >> 2];
            }
        } else if (i15 == 0) {
            return null;
        }
        return _findSecondary(_calcOffset, i10, i11, i12);
    }

    private String _findSecondary(int i10, int i11, int[] iArr, int i12) {
        int i13 = this._tertiaryStart;
        int i14 = this._tertiaryShift;
        int i15 = i13 + ((i10 >> (i14 + 2)) << i14);
        int[] iArr2 = this._hashArea;
        int i16 = (1 << i14) + i15;
        while (i15 < i16) {
            int i17 = iArr2[i15 + 3];
            if (i11 == iArr2[i15] && i12 == i17 && _verifyLongName(iArr, i12, iArr2[i15 + 1])) {
                return this._names[i15 >> 2];
            }
            if (i17 == 0) {
                return null;
            }
            i15 += 4;
        }
        for (int _spilloverStart = _spilloverStart(); _spilloverStart < this._spilloverEnd; _spilloverStart += 4) {
            if (i11 == iArr2[_spilloverStart] && i12 == iArr2[_spilloverStart + 3] && _verifyLongName(iArr, i12, iArr2[_spilloverStart + 1])) {
                return this._names[_spilloverStart >> 2];
            }
        }
        return null;
    }

    public String findName(int[] iArr, int i10) {
        if (i10 >= 4) {
            int calcHash = calcHash(iArr, i10);
            int _calcOffset = _calcOffset(calcHash);
            int[] iArr2 = this._hashArea;
            int i11 = iArr2[_calcOffset + 3];
            if (calcHash == iArr2[_calcOffset] && i11 == i10 && _verifyLongName(iArr, i10, iArr2[_calcOffset + 1])) {
                return this._names[_calcOffset >> 2];
            }
            if (i11 == 0) {
                return null;
            }
            int i12 = this._secondaryStart + ((_calcOffset >> 3) << 2);
            int i13 = iArr2[i12 + 3];
            if (calcHash == iArr2[i12] && i13 == i10 && _verifyLongName(iArr, i10, iArr2[i12 + 1])) {
                return this._names[i12 >> 2];
            }
            return _findSecondary(_calcOffset, calcHash, iArr, i10);
        } else if (i10 == 3) {
            return findName(iArr[0], iArr[1], iArr[2]);
        } else {
            if (i10 == 2) {
                return findName(iArr[0], iArr[1]);
            }
            return findName(iArr[0]);
        }
    }

    public String addName(String str, int[] iArr, int i10) {
        int i11;
        _verifySharing();
        if (this._intern) {
            str = InternCache.instance.intern(str);
        }
        if (i10 == 1) {
            i11 = _findOffsetForAdd(calcHash(iArr[0]));
            int[] iArr2 = this._hashArea;
            iArr2[i11] = iArr[0];
            iArr2[i11 + 3] = 1;
        } else if (i10 == 2) {
            i11 = _findOffsetForAdd(calcHash(iArr[0], iArr[1]));
            int[] iArr3 = this._hashArea;
            iArr3[i11] = iArr[0];
            iArr3[i11 + 1] = iArr[1];
            iArr3[i11 + 3] = 2;
        } else if (i10 != 3) {
            int calcHash = calcHash(iArr, i10);
            i11 = _findOffsetForAdd(calcHash);
            this._hashArea[i11] = calcHash;
            int _appendLongName = _appendLongName(iArr, i10);
            int[] iArr4 = this._hashArea;
            iArr4[i11 + 1] = _appendLongName;
            iArr4[i11 + 3] = i10;
        } else {
            int _findOffsetForAdd = _findOffsetForAdd(calcHash(iArr[0], iArr[1], iArr[2]));
            int[] iArr5 = this._hashArea;
            iArr5[_findOffsetForAdd] = iArr[0];
            iArr5[_findOffsetForAdd + 1] = iArr[1];
            iArr5[_findOffsetForAdd + 2] = iArr[2];
            iArr5[_findOffsetForAdd + 3] = 3;
            i11 = _findOffsetForAdd;
        }
        this._names[i11 >> 2] = str;
        this._count++;
        _verifyNeedForRehash();
        return str;
    }
}
