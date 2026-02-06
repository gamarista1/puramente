package pg;

import java.io.IOException;

/* renamed from: pg.k  reason: case insensitive filesystem */
public class C6649k extends IOException {

    /* renamed from: a  reason: collision with root package name */
    private p f72549a = null;

    public C6649k(String str) {
        super(str);
    }

    static C6649k b() {
        return new C6649k("Protocol message end-group tag did not match expected tag.");
    }

    static C6649k c() {
        return new C6649k("Protocol message contained an invalid tag (zero).");
    }

    static C6649k d() {
        return new C6649k("Protocol message had invalid UTF-8.");
    }

    static C6649k e() {
        return new C6649k("Protocol message tag had invalid wire type.");
    }

    static C6649k f() {
        return new C6649k("CodedInputStream encountered a malformed varint.");
    }

    static C6649k g() {
        return new C6649k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static C6649k h() {
        return new C6649k("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static C6649k j() {
        return new C6649k("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static C6649k k() {
        return new C6649k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public p a() {
        return this.f72549a;
    }

    public C6649k i(p pVar) {
        this.f72549a = pVar;
        return this;
    }
}
