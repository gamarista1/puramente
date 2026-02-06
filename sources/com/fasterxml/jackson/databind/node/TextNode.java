package com.fasterxml.jackson.databind.node;

import com.amazon.a.a.o.b;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.SerializerProvider;

public class TextNode extends ValueNode {
    static final TextNode EMPTY_STRING_NODE = new TextNode("");
    protected final String _value;

    public TextNode(String str) {
        this._value = str;
    }

    protected static void appendQuoted(StringBuilder sb2, String str) {
        sb2.append('\"');
        CharTypes.appendQuoted(sb2, str);
        sb2.append('\"');
    }

    public static TextNode valueOf(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            return EMPTY_STRING_NODE;
        }
        return new TextNode(str);
    }

    /* access modifiers changed from: protected */
    public void _reportBase64EOF() {
        throw new JsonParseException((JsonParser) null, "Unexpected end-of-String when base64 content");
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidBase64(Base64Variant base64Variant, char c10, int i10) {
        _reportInvalidBase64(base64Variant, c10, i10, (String) null);
    }

    public boolean asBoolean(boolean z10) {
        String str = this._value;
        if (str == null) {
            return z10;
        }
        String trim = str.trim();
        if (b.f37475af.equals(trim)) {
            return true;
        }
        if (b.f37476ag.equals(trim)) {
            return false;
        }
        return z10;
    }

    public double asDouble(double d10) {
        return NumberInput.parseAsDouble(this._value, d10);
    }

    public int asInt(int i10) {
        return NumberInput.parseAsInt(this._value, i10);
    }

    public long asLong(long j10) {
        return NumberInput.parseAsLong(this._value, j10);
    }

    public String asText() {
        return this._value;
    }

    public JsonToken asToken() {
        return JsonToken.VALUE_STRING;
    }

    public byte[] binaryValue() {
        return getBinaryValue(Base64Variants.getDefaultVariant());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof TextNode)) {
            return ((TextNode) obj)._value.equals(this._value);
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        _reportBase64EOF();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        r6 = r4 + 2;
        r5 = r1.charAt(r5);
        r8 = r13.decodeBase64Char(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0037, code lost:
        if (r8 >= 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0039, code lost:
        _reportInvalidBase64(r13, r5, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003d, code lost:
        r5 = (r7 << 6) | r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r6 < r2) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0046, code lost:
        if (r13.usesPadding() != false) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0048, code lost:
        r0.append(r5 >> 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        _reportBase64EOF();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0052, code lost:
        r7 = r4 + 3;
        r6 = r1.charAt(r6);
        r8 = r13.decodeBase64Char(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        if (r8 >= 0) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0061, code lost:
        if (r8 == -2) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0063, code lost:
        _reportInvalidBase64(r13, r6, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        if (r7 < r2) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        _reportBase64EOF();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
        r4 = r4 + 4;
        r6 = r1.charAt(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0075, code lost:
        if (r13.usesPaddingChar(r6) != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0077, code lost:
        _reportInvalidBase64(r13, r6, 3, "expected padding character '" + r13.getPaddingChar() + "'");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0094, code lost:
        r0.append(r5 >> 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
        r5 = (r5 << 6) | r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009e, code lost:
        if (r7 < r2) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a4, code lost:
        if (r13.usesPadding() != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a6, code lost:
        r0.appendTwoBytes(r5 >> 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ac, code lost:
        _reportBase64EOF();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00af, code lost:
        r4 = r4 + 4;
        r6 = r1.charAt(r7);
        r7 = r13.decodeBase64Char(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b9, code lost:
        if (r7 >= 0) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bb, code lost:
        if (r7 == -2) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bd, code lost:
        _reportInvalidBase64(r13, r6, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c0, code lost:
        r0.appendTwoBytes(r5 >> 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c7, code lost:
        r0.appendThreeBytes((r5 << 6) | r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        r7 = r13.decodeBase64Char(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r7 >= 0) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        _reportInvalidBase64(r13, r6, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        if (r5 < r2) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] getBinaryValue(com.fasterxml.jackson.core.Base64Variant r13) {
        /*
            r12 = this;
            com.fasterxml.jackson.core.util.ByteArrayBuilder r0 = new com.fasterxml.jackson.core.util.ByteArrayBuilder
            r1 = 100
            r0.<init>((int) r1)
            java.lang.String r1 = r12._value
            int r2 = r1.length()
            r3 = 0
            r4 = r3
        L_0x000f:
            if (r4 >= r2) goto L_0x00d2
        L_0x0011:
            int r5 = r4 + 1
            char r6 = r1.charAt(r4)
            if (r5 < r2) goto L_0x001b
            goto L_0x00d2
        L_0x001b:
            r7 = 32
            if (r6 <= r7) goto L_0x00cf
            int r7 = r13.decodeBase64Char((char) r6)
            if (r7 >= 0) goto L_0x0028
            r12._reportInvalidBase64(r13, r6, r3)
        L_0x0028:
            if (r5 < r2) goto L_0x002d
            r12._reportBase64EOF()
        L_0x002d:
            int r6 = r4 + 2
            char r5 = r1.charAt(r5)
            int r8 = r13.decodeBase64Char((char) r5)
            if (r8 >= 0) goto L_0x003d
            r9 = 1
            r12._reportInvalidBase64(r13, r5, r9)
        L_0x003d:
            int r5 = r7 << 6
            r5 = r5 | r8
            if (r6 < r2) goto L_0x0052
            boolean r7 = r13.usesPadding()
            if (r7 != 0) goto L_0x004f
            int r13 = r5 >> 4
            r0.append(r13)
            goto L_0x00d2
        L_0x004f:
            r12._reportBase64EOF()
        L_0x0052:
            int r7 = r4 + 3
            char r6 = r1.charAt(r6)
            int r8 = r13.decodeBase64Char((char) r6)
            r9 = -2
            r10 = 3
            r11 = 2
            if (r8 >= 0) goto L_0x009b
            if (r8 == r9) goto L_0x0066
            r12._reportInvalidBase64(r13, r6, r11)
        L_0x0066:
            if (r7 < r2) goto L_0x006b
            r12._reportBase64EOF()
        L_0x006b:
            int r4 = r4 + 4
            char r6 = r1.charAt(r7)
            boolean r7 = r13.usesPaddingChar((char) r6)
            if (r7 != 0) goto L_0x0094
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "expected padding character '"
            r7.append(r8)
            char r8 = r13.getPaddingChar()
            r7.append(r8)
            java.lang.String r8 = "'"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r12._reportInvalidBase64(r13, r6, r10, r7)
        L_0x0094:
            int r5 = r5 >> 4
            r0.append(r5)
            goto L_0x000f
        L_0x009b:
            int r5 = r5 << 6
            r5 = r5 | r8
            if (r7 < r2) goto L_0x00af
            boolean r6 = r13.usesPadding()
            if (r6 != 0) goto L_0x00ac
            int r13 = r5 >> 2
            r0.appendTwoBytes(r13)
            goto L_0x00d2
        L_0x00ac:
            r12._reportBase64EOF()
        L_0x00af:
            int r4 = r4 + 4
            char r6 = r1.charAt(r7)
            int r7 = r13.decodeBase64Char((char) r6)
            if (r7 >= 0) goto L_0x00c7
            if (r7 == r9) goto L_0x00c0
            r12._reportInvalidBase64(r13, r6, r10)
        L_0x00c0:
            int r5 = r5 >> 2
            r0.appendTwoBytes(r5)
            goto L_0x000f
        L_0x00c7:
            int r5 = r5 << 6
            r5 = r5 | r7
            r0.appendThreeBytes(r5)
            goto L_0x000f
        L_0x00cf:
            r4 = r5
            goto L_0x0011
        L_0x00d2:
            byte[] r13 = r0.toByteArray()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.node.TextNode.getBinaryValue(com.fasterxml.jackson.core.Base64Variant):byte[]");
    }

    public JsonNodeType getNodeType() {
        return JsonNodeType.STRING;
    }

    public int hashCode() {
        return this._value.hashCode();
    }

    public final void serialize(JsonGenerator jsonGenerator, SerializerProvider serializerProvider) {
        String str = this._value;
        if (str == null) {
            jsonGenerator.writeNull();
        } else {
            jsonGenerator.writeString(str);
        }
    }

    public String textValue() {
        return this._value;
    }

    public String toString() {
        int length = this._value.length();
        StringBuilder sb2 = new StringBuilder(length + 2 + (length >> 4));
        appendQuoted(sb2, this._value);
        return sb2.toString();
    }

    /* access modifiers changed from: protected */
    public void _reportInvalidBase64(Base64Variant base64Variant, char c10, int i10, String str) {
        String str2;
        if (c10 <= ' ') {
            str2 = "Illegal white space character (code 0x" + Integer.toHexString(c10) + ") as character #" + (i10 + 1) + " of 4-char base64 unit: can only used between units";
        } else if (base64Variant.usesPaddingChar(c10)) {
            str2 = "Unexpected padding character ('" + base64Variant.getPaddingChar() + "') as character #" + (i10 + 1) + " of 4-char base64 unit: padding only legal as 3rd or 4th character";
        } else if (!Character.isDefined(c10) || Character.isISOControl(c10)) {
            str2 = "Illegal character (code 0x" + Integer.toHexString(c10) + ") in base64 content";
        } else {
            str2 = "Illegal character '" + c10 + "' (code 0x" + Integer.toHexString(c10) + ") in base64 content";
        }
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        throw new JsonParseException((JsonParser) null, str2, JsonLocation.NA);
    }

    public String asText(String str) {
        String str2 = this._value;
        return str2 == null ? str : str2;
    }
}
