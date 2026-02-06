package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* renamed from: androidx.datastore.preferences.protobuf.z  reason: case insensitive filesystem */
public class C1752z extends IOException {
    private static final long serialVersionUID = -1616151763072450476L;

    /* renamed from: a  reason: collision with root package name */
    private O f16577a = null;

    /* renamed from: androidx.datastore.preferences.protobuf.z$a */
    public static class a extends C1752z {
        private static final long serialVersionUID = 3283890091615336259L;

        public a(String str) {
            super(str);
        }
    }

    public C1752z(String str) {
        super(str);
    }

    static C1752z a() {
        return new C1752z("Protocol message end-group tag did not match expected tag.");
    }

    static C1752z b() {
        return new C1752z("Protocol message contained an invalid tag (zero).");
    }

    static C1752z c() {
        return new C1752z("Protocol message had invalid UTF-8.");
    }

    static a d() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static C1752z e() {
        return new C1752z("CodedInputStream encountered a malformed varint.");
    }

    static C1752z f() {
        return new C1752z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static C1752z g() {
        return new C1752z("Failed to parse the message.");
    }

    static C1752z h() {
        return new C1752z("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static C1752z j() {
        return new C1752z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static C1752z k() {
        return new C1752z("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public C1752z i(O o10) {
        this.f16577a = o10;
        return this;
    }
}
