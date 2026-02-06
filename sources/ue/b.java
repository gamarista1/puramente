package ue;

import Sg.C5541d;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.UUID;
import kotlin.jvm.internal.C6496s;

public abstract class b {
    public static final byte[] a(UUID uuid) {
        C6496s.h(uuid, "uuid");
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        byte[] array = wrap.array();
        C6496s.g(array, "array(...)");
        return array;
    }

    public static final UUID b(UUID uuid, String str) {
        C6496s.h(uuid, "namespace");
        C6496s.h(str, "name");
        MessageDigest instance = MessageDigest.getInstance("SHA-1");
        instance.update(a(uuid));
        byte[] bytes = str.getBytes(C5541d.f65029b);
        C6496s.g(bytes, "getBytes(...)");
        instance.update(bytes);
        byte[] digest = instance.digest();
        digest[6] = (byte) ((digest[6] & 15) | 80);
        digest[8] = (byte) ((digest[8] & 63) | 128);
        ByteBuffer wrap = ByteBuffer.wrap(digest);
        return new UUID(wrap.getLong(), wrap.getLong());
    }
}
