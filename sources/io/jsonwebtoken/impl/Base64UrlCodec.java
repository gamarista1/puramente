package io.jsonwebtoken.impl;

public class Base64UrlCodec extends AbstractTextCodec {
    public byte[] decode(String str) {
        char[] ensurePadding = ensurePadding(str.toCharArray());
        for (int i10 = 0; i10 < ensurePadding.length; i10++) {
            char c10 = ensurePadding[i10];
            if (c10 == '-') {
                ensurePadding[i10] = '+';
            } else if (c10 == '_') {
                ensurePadding[i10] = '/';
            }
        }
        return TextCodec.BASE64.decode(new String(ensurePadding));
    }

    public String encode(byte[] bArr) {
        byte[] removePadding = removePadding(TextCodec.BASE64.encode(bArr).getBytes(AbstractTextCodec.US_ASCII));
        for (int i10 = 0; i10 < removePadding.length; i10++) {
            byte b10 = removePadding[i10];
            if (b10 == 43) {
                removePadding[i10] = 45;
            } else if (b10 == 47) {
                removePadding[i10] = 95;
            }
        }
        return new String(removePadding, AbstractTextCodec.US_ASCII);
    }

    /* access modifiers changed from: protected */
    public char[] ensurePadding(char[] cArr) {
        int i10;
        int length = cArr.length % 4;
        if (length == 2 || length == 3) {
            i10 = 4 - length;
        } else {
            i10 = 0;
        }
        if (i10 <= 0) {
            return cArr;
        }
        char[] cArr2 = new char[(cArr.length + i10)];
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
        for (int i11 = 0; i11 < i10; i11++) {
            cArr2[cArr.length + i11] = '=';
        }
        return cArr2;
    }

    /* access modifiers changed from: protected */
    public byte[] removePadding(byte[] bArr) {
        int length = bArr.length - 1;
        int i10 = 0;
        while (length > 0 && bArr[length] == 61) {
            i10++;
            length--;
        }
        if (i10 <= 0) {
            return bArr;
        }
        byte[] bArr2 = new byte[(bArr.length - i10)];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length - i10);
        return bArr2;
    }
}
