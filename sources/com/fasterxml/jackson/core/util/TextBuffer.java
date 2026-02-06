package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.io.NumberInput;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public final class TextBuffer {
    static final int MAX_SEGMENT_LEN = 262144;
    static final int MIN_SEGMENT_LEN = 1000;
    static final char[] NO_CHARS = new char[0];
    private final BufferRecycler _allocator;
    private char[] _currentSegment;
    private int _currentSize;
    private boolean _hasSegments;
    private char[] _inputBuffer;
    private int _inputLen;
    private int _inputStart;
    private char[] _resultArray;
    private String _resultString;
    private int _segmentSize;
    private ArrayList<char[]> _segments;

    public TextBuffer(BufferRecycler bufferRecycler) {
        this._allocator = bufferRecycler;
    }

    private char[] buf(int i10) {
        BufferRecycler bufferRecycler = this._allocator;
        if (bufferRecycler != null) {
            return bufferRecycler.allocCharBuffer(2, i10);
        }
        return new char[Math.max(i10, 1000)];
    }

    private char[] carr(int i10) {
        return new char[i10];
    }

    private void clearSegments() {
        this._hasSegments = false;
        this._segments.clear();
        this._segmentSize = 0;
        this._currentSize = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        if (r3 > MAX_SEGMENT_LEN) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void expand(int r3) {
        /*
            r2 = this;
            java.util.ArrayList<char[]> r3 = r2._segments
            if (r3 != 0) goto L_0x000b
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2._segments = r3
        L_0x000b:
            char[] r3 = r2._currentSegment
            r0 = 1
            r2._hasSegments = r0
            java.util.ArrayList<char[]> r0 = r2._segments
            r0.add(r3)
            int r0 = r2._segmentSize
            int r1 = r3.length
            int r0 = r0 + r1
            r2._segmentSize = r0
            r0 = 0
            r2._currentSize = r0
            int r3 = r3.length
            int r0 = r3 >> 1
            int r3 = r3 + r0
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r3 >= r0) goto L_0x0028
        L_0x0026:
            r3 = r0
            goto L_0x002d
        L_0x0028:
            r0 = 262144(0x40000, float:3.67342E-40)
            if (r3 <= r0) goto L_0x002d
            goto L_0x0026
        L_0x002d:
            char[] r3 = r2.carr(r3)
            r2._currentSegment = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.util.TextBuffer.expand(int):void");
    }

    private char[] resultArray() {
        int i10;
        String str = this._resultString;
        if (str != null) {
            return str.toCharArray();
        }
        int i11 = this._inputStart;
        if (i11 >= 0) {
            int i12 = this._inputLen;
            if (i12 < 1) {
                return NO_CHARS;
            }
            if (i11 == 0) {
                return Arrays.copyOf(this._inputBuffer, i12);
            }
            return Arrays.copyOfRange(this._inputBuffer, i11, i12 + i11);
        }
        int size = size();
        if (size < 1) {
            return NO_CHARS;
        }
        char[] carr = carr(size);
        ArrayList<char[]> arrayList = this._segments;
        if (arrayList != null) {
            int size2 = arrayList.size();
            i10 = 0;
            for (int i13 = 0; i13 < size2; i13++) {
                char[] cArr = this._segments.get(i13);
                int length = cArr.length;
                System.arraycopy(cArr, 0, carr, i10, length);
                i10 += length;
            }
        } else {
            i10 = 0;
        }
        System.arraycopy(this._currentSegment, 0, carr, i10, this._currentSize);
        return carr;
    }

    private void unshare(int i10) {
        int i11 = this._inputLen;
        this._inputLen = 0;
        char[] cArr = this._inputBuffer;
        this._inputBuffer = null;
        int i12 = this._inputStart;
        this._inputStart = -1;
        int i13 = i10 + i11;
        char[] cArr2 = this._currentSegment;
        if (cArr2 == null || i13 > cArr2.length) {
            this._currentSegment = buf(i13);
        }
        if (i11 > 0) {
            System.arraycopy(cArr, i12, this._currentSegment, 0, i11);
        }
        this._segmentSize = 0;
        this._currentSize = i11;
    }

    public void append(char c10) {
        if (this._inputStart >= 0) {
            unshare(16);
        }
        this._resultString = null;
        this._resultArray = null;
        char[] cArr = this._currentSegment;
        if (this._currentSize >= cArr.length) {
            expand(1);
            cArr = this._currentSegment;
        }
        int i10 = this._currentSize;
        this._currentSize = i10 + 1;
        cArr[i10] = c10;
    }

    public char[] contentsAsArray() {
        char[] cArr = this._resultArray;
        if (cArr != null) {
            return cArr;
        }
        char[] resultArray = resultArray();
        this._resultArray = resultArray;
        return resultArray;
    }

    public BigDecimal contentsAsDecimal() {
        char[] cArr;
        char[] cArr2;
        char[] cArr3 = this._resultArray;
        if (cArr3 != null) {
            return NumberInput.parseBigDecimal(cArr3);
        }
        int i10 = this._inputStart;
        if (i10 >= 0 && (cArr2 = this._inputBuffer) != null) {
            return NumberInput.parseBigDecimal(cArr2, i10, this._inputLen);
        }
        if (this._segmentSize != 0 || (cArr = this._currentSegment) == null) {
            return NumberInput.parseBigDecimal(contentsAsArray());
        }
        return NumberInput.parseBigDecimal(cArr, 0, this._currentSize);
    }

    public double contentsAsDouble() {
        return NumberInput.parseDouble(contentsAsString());
    }

    public String contentsAsString() {
        if (this._resultString == null) {
            char[] cArr = this._resultArray;
            if (cArr != null) {
                this._resultString = new String(cArr);
            } else {
                int i10 = this._inputStart;
                String str = "";
                if (i10 >= 0) {
                    int i11 = this._inputLen;
                    if (i11 < 1) {
                        this._resultString = str;
                        return str;
                    }
                    this._resultString = new String(this._inputBuffer, i10, i11);
                } else {
                    int i12 = this._segmentSize;
                    int i13 = this._currentSize;
                    if (i12 == 0) {
                        if (i13 != 0) {
                            str = new String(this._currentSegment, 0, i13);
                        }
                        this._resultString = str;
                    } else {
                        StringBuilder sb2 = new StringBuilder(i12 + i13);
                        ArrayList<char[]> arrayList = this._segments;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i14 = 0; i14 < size; i14++) {
                                char[] cArr2 = this._segments.get(i14);
                                sb2.append(cArr2, 0, cArr2.length);
                            }
                        }
                        sb2.append(this._currentSegment, 0, this._currentSize);
                        this._resultString = sb2.toString();
                    }
                }
            }
        }
        return this._resultString;
    }

    public int contentsToWriter(Writer writer) {
        int i10;
        char[] cArr = this._resultArray;
        if (cArr != null) {
            writer.write(cArr);
            return this._resultArray.length;
        }
        String str = this._resultString;
        if (str != null) {
            writer.write(str);
            return this._resultString.length();
        }
        int i11 = this._inputStart;
        if (i11 >= 0) {
            int i12 = this._inputLen;
            if (i12 > 0) {
                writer.write(this._inputBuffer, i11, i12);
            }
            return i12;
        }
        ArrayList<char[]> arrayList = this._segments;
        if (arrayList != null) {
            int size = arrayList.size();
            i10 = 0;
            for (int i13 = 0; i13 < size; i13++) {
                char[] cArr2 = this._segments.get(i13);
                int length = cArr2.length;
                writer.write(cArr2, 0, length);
                i10 += length;
            }
        } else {
            i10 = 0;
        }
        int i14 = this._currentSize;
        if (i14 <= 0) {
            return i10;
        }
        writer.write(this._currentSegment, 0, i14);
        return i10 + i14;
    }

    public char[] emptyAndGetCurrentSegment() {
        this._inputStart = -1;
        this._currentSize = 0;
        this._inputLen = 0;
        this._inputBuffer = null;
        this._resultString = null;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        }
        char[] cArr = this._currentSegment;
        if (cArr != null) {
            return cArr;
        }
        char[] buf = buf(0);
        this._currentSegment = buf;
        return buf;
    }

    public void ensureNotShared() {
        if (this._inputStart >= 0) {
            unshare(16);
        }
    }

    public char[] expandCurrentSegment() {
        char[] cArr = this._currentSegment;
        int length = cArr.length;
        int i10 = (length >> 1) + length;
        if (i10 > MAX_SEGMENT_LEN) {
            i10 = (length >> 2) + length;
        }
        char[] copyOf = Arrays.copyOf(cArr, i10);
        this._currentSegment = copyOf;
        return copyOf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (r0 > MAX_SEGMENT_LEN) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public char[] finishCurrentSegment() {
        /*
            r2 = this;
            java.util.ArrayList<char[]> r0 = r2._segments
            if (r0 != 0) goto L_0x000b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2._segments = r0
        L_0x000b:
            r0 = 1
            r2._hasSegments = r0
            java.util.ArrayList<char[]> r0 = r2._segments
            char[] r1 = r2._currentSegment
            r0.add(r1)
            char[] r0 = r2._currentSegment
            int r0 = r0.length
            int r1 = r2._segmentSize
            int r1 = r1 + r0
            r2._segmentSize = r1
            r1 = 0
            r2._currentSize = r1
            int r1 = r0 >> 1
            int r0 = r0 + r1
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 >= r1) goto L_0x0029
        L_0x0027:
            r0 = r1
            goto L_0x002e
        L_0x0029:
            r1 = 262144(0x40000, float:3.67342E-40)
            if (r0 <= r1) goto L_0x002e
            goto L_0x0027
        L_0x002e:
            char[] r0 = r2.carr(r0)
            r2._currentSegment = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.util.TextBuffer.finishCurrentSegment():char[]");
    }

    public char[] getCurrentSegment() {
        if (this._inputStart >= 0) {
            unshare(1);
        } else {
            char[] cArr = this._currentSegment;
            if (cArr == null) {
                this._currentSegment = buf(0);
            } else if (this._currentSize >= cArr.length) {
                expand(1);
            }
        }
        return this._currentSegment;
    }

    public int getCurrentSegmentSize() {
        return this._currentSize;
    }

    public char[] getTextBuffer() {
        if (this._inputStart >= 0) {
            return this._inputBuffer;
        }
        char[] cArr = this._resultArray;
        if (cArr != null) {
            return cArr;
        }
        String str = this._resultString;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this._resultArray = charArray;
            return charArray;
        } else if (this._hasSegments) {
            return contentsAsArray();
        } else {
            char[] cArr2 = this._currentSegment;
            if (cArr2 == null) {
                return NO_CHARS;
            }
            return cArr2;
        }
    }

    public int getTextOffset() {
        int i10 = this._inputStart;
        if (i10 >= 0) {
            return i10;
        }
        return 0;
    }

    public boolean hasTextAsCharacters() {
        if (this._inputStart >= 0 || this._resultArray != null || this._resultString == null) {
            return true;
        }
        return false;
    }

    public void releaseBuffers() {
        if (this._allocator == null) {
            resetWithEmpty();
        } else if (this._currentSegment != null) {
            resetWithEmpty();
            char[] cArr = this._currentSegment;
            this._currentSegment = null;
            this._allocator.releaseCharBuffer(2, cArr);
        }
    }

    public void resetWithCopy(char[] cArr, int i10, int i11) {
        this._inputBuffer = null;
        this._inputStart = -1;
        this._inputLen = 0;
        this._resultString = null;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        } else if (this._currentSegment == null) {
            this._currentSegment = buf(i11);
        }
        this._segmentSize = 0;
        this._currentSize = 0;
        append(cArr, i10, i11);
    }

    public void resetWithEmpty() {
        this._inputStart = -1;
        this._currentSize = 0;
        this._inputLen = 0;
        this._inputBuffer = null;
        this._resultString = null;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        }
    }

    public void resetWithShared(char[] cArr, int i10, int i11) {
        this._resultString = null;
        this._resultArray = null;
        this._inputBuffer = cArr;
        this._inputStart = i10;
        this._inputLen = i11;
        if (this._hasSegments) {
            clearSegments();
        }
    }

    public void resetWithString(String str) {
        this._inputBuffer = null;
        this._inputStart = -1;
        this._inputLen = 0;
        this._resultString = str;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        }
        this._currentSize = 0;
    }

    public String setCurrentAndReturn(int i10) {
        String str;
        this._currentSize = i10;
        if (this._segmentSize > 0) {
            return contentsAsString();
        }
        if (i10 == 0) {
            str = "";
        } else {
            str = new String(this._currentSegment, 0, i10);
        }
        this._resultString = str;
        return str;
    }

    public void setCurrentLength(int i10) {
        this._currentSize = i10;
    }

    public int size() {
        if (this._inputStart >= 0) {
            return this._inputLen;
        }
        char[] cArr = this._resultArray;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this._resultString;
        if (str != null) {
            return str.length();
        }
        return this._segmentSize + this._currentSize;
    }

    public String toString() {
        return contentsAsString();
    }

    public char[] expandCurrentSegment(int i10) {
        char[] cArr = this._currentSegment;
        if (cArr.length >= i10) {
            return cArr;
        }
        char[] copyOf = Arrays.copyOf(cArr, i10);
        this._currentSegment = copyOf;
        return copyOf;
    }

    public void append(char[] cArr, int i10, int i11) {
        if (this._inputStart >= 0) {
            unshare(i11);
        }
        this._resultString = null;
        this._resultArray = null;
        char[] cArr2 = this._currentSegment;
        int length = cArr2.length;
        int i12 = this._currentSize;
        int i13 = length - i12;
        if (i13 >= i11) {
            System.arraycopy(cArr, i10, cArr2, i12, i11);
            this._currentSize += i11;
            return;
        }
        if (i13 > 0) {
            System.arraycopy(cArr, i10, cArr2, i12, i13);
            i10 += i13;
            i11 -= i13;
        }
        do {
            expand(i11);
            int min = Math.min(this._currentSegment.length, i11);
            System.arraycopy(cArr, i10, this._currentSegment, 0, min);
            this._currentSize += min;
            i10 += min;
            i11 -= min;
        } while (i11 > 0);
    }

    public void append(String str, int i10, int i11) {
        if (this._inputStart >= 0) {
            unshare(i11);
        }
        this._resultString = null;
        this._resultArray = null;
        char[] cArr = this._currentSegment;
        int length = cArr.length;
        int i12 = this._currentSize;
        int i13 = length - i12;
        if (i13 >= i11) {
            str.getChars(i10, i10 + i11, cArr, i12);
            this._currentSize += i11;
            return;
        }
        if (i13 > 0) {
            int i14 = i10 + i13;
            str.getChars(i10, i14, cArr, i12);
            i11 -= i13;
            i10 = i14;
        }
        while (true) {
            expand(i11);
            int min = Math.min(this._currentSegment.length, i11);
            int i15 = i10 + min;
            str.getChars(i10, i15, this._currentSegment, 0);
            this._currentSize += min;
            i11 -= min;
            if (i11 > 0) {
                i10 = i15;
            } else {
                return;
            }
        }
    }
}
