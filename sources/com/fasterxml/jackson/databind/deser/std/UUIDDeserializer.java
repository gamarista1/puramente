package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import java.util.Arrays;
import java.util.UUID;

public class UUIDDeserializer extends FromStringDeserializer<UUID> {
    static final int[] HEX_DIGITS;
    private static final long serialVersionUID = 1;

    static {
        int[] iArr = new int[127];
        HEX_DIGITS = iArr;
        Arrays.fill(iArr, -1);
        for (int i10 = 0; i10 < 10; i10++) {
            HEX_DIGITS[i10 + 48] = i10;
        }
        for (int i11 = 0; i11 < 6; i11++) {
            int[] iArr2 = HEX_DIGITS;
            int i12 = i11 + 10;
            iArr2[i11 + 97] = i12;
            iArr2[i11 + 65] = i12;
        }
    }

    public UUIDDeserializer() {
        super(UUID.class);
    }

    private UUID _badFormat(String str, DeserializationContext deserializationContext) {
        return (UUID) deserializationContext.handleWeirdStringValue(handledType(), str, "UUID has to be represented by standard 36-char representation", new Object[0]);
    }

    private UUID _fromBytes(byte[] bArr, DeserializationContext deserializationContext) {
        if (bArr.length == 16) {
            return new UUID(_long(bArr, 0), _long(bArr, 8));
        }
        JsonParser parser = deserializationContext.getParser();
        throw InvalidFormatException.from(parser, "Can only construct UUIDs from byte[16]; got " + bArr.length + " bytes", bArr, handledType());
    }

    private static int _int(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | (bArr[i10] << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }

    private static long _long(byte[] bArr, int i10) {
        return ((((long) _int(bArr, i10 + 4)) << 32) >>> 32) | (((long) _int(bArr, i10)) << 32);
    }

    /* access modifiers changed from: package-private */
    public int _badChar(String str, int i10, DeserializationContext deserializationContext, char c10) {
        throw deserializationContext.weirdStringException(str, handledType(), String.format("Non-hex character '%c' (value 0x%s), not valid for UUID String", new Object[]{Character.valueOf(c10), Integer.toHexString(c10)}));
    }

    /* access modifiers changed from: package-private */
    public int byteFromChars(String str, int i10, DeserializationContext deserializationContext) {
        char charAt = str.charAt(i10);
        int i11 = i10 + 1;
        char charAt2 = str.charAt(i11);
        if (charAt <= 127 && charAt2 <= 127) {
            int[] iArr = HEX_DIGITS;
            int i12 = iArr[charAt2] | (iArr[charAt] << 4);
            if (i12 >= 0) {
                return i12;
            }
        }
        if (charAt > 127 || HEX_DIGITS[charAt] < 0) {
            return _badChar(str, i10, deserializationContext, charAt);
        }
        return _badChar(str, i11, deserializationContext, charAt2);
    }

    /* access modifiers changed from: package-private */
    public int intFromChars(String str, int i10, DeserializationContext deserializationContext) {
        return (byteFromChars(str, i10, deserializationContext) << 24) + (byteFromChars(str, i10 + 2, deserializationContext) << 16) + (byteFromChars(str, i10 + 4, deserializationContext) << 8) + byteFromChars(str, i10 + 6, deserializationContext);
    }

    /* access modifiers changed from: package-private */
    public int shortFromChars(String str, int i10, DeserializationContext deserializationContext) {
        return (byteFromChars(str, i10, deserializationContext) << 8) + byteFromChars(str, i10 + 2, deserializationContext);
    }

    /* access modifiers changed from: protected */
    public UUID _deserialize(String str, DeserializationContext deserializationContext) {
        if (str.length() == 36) {
            if (!(str.charAt(8) == '-' && str.charAt(13) == '-' && str.charAt(18) == '-' && str.charAt(23) == '-')) {
                _badFormat(str, deserializationContext);
            }
            int shortFromChars = shortFromChars(str, 24, deserializationContext);
            return new UUID((((long) intFromChars(str, 0, deserializationContext)) << 32) + ((((long) shortFromChars(str, 9, deserializationContext)) << 16) | ((long) shortFromChars(str, 14, deserializationContext))), ((((long) intFromChars(str, 28, deserializationContext)) << 32) >>> 32) | (((long) (shortFromChars | (shortFromChars(str, 19, deserializationContext) << 16))) << 32));
        } else if (str.length() == 24) {
            return _fromBytes(Base64Variants.getDefaultVariant().decode(str), deserializationContext);
        } else {
            return _badFormat(str, deserializationContext);
        }
    }

    /* access modifiers changed from: protected */
    public UUID _deserializeEmbedded(Object obj, DeserializationContext deserializationContext) {
        if (obj instanceof byte[]) {
            return _fromBytes((byte[]) obj, deserializationContext);
        }
        super._deserializeEmbedded(obj, deserializationContext);
        return null;
    }
}
