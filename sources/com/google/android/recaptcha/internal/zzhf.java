package com.google.android.recaptcha.internal;

import java.io.IOException;

public final class zzhf extends IOException {
    zzhf() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzhf(String str, Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th2);
    }

    zzhf(Throwable th2) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
    }
}
