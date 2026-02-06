package u1;

import x1.c;

public class l extends RuntimeException {
    public l() {
        this((String) null);
    }

    public l(String str) {
        super(c.e(str, "The operation has been canceled."));
    }
}
