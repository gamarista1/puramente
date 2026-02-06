package com.revenuecat.purchases.common;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.C6496s;
import kotlin.jvm.internal.r;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/Int$Companion;", "", "byteArray", "", "fromLittleEndianBytes", "(Lkotlin/jvm/internal/r;[B)I", "purchases_defaultsRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class IntExtensionsKt {
    public static final int fromLittleEndianBytes(r rVar, byte[] bArr) {
        C6496s.h(rVar, "<this>");
        C6496s.h(bArr, "byteArray");
        return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getInt();
    }
}
