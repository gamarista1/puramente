package Tg;

import kotlin.jvm.internal.C6496s;

abstract class f extends e {
    public static final d d(char c10, boolean z10) {
        if (!z10) {
            if (c10 == 'D') {
                return d.DAYS;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c10);
        } else if (c10 == 'H') {
            return d.HOURS;
        } else {
            if (c10 == 'M') {
                return d.MINUTES;
            }
            if (c10 == 'S') {
                return d.SECONDS;
            }
            throw new IllegalArgumentException("Invalid duration ISO time unit: " + c10);
        }
    }

    public static final d e(String str) {
        C6496s.h(str, "shortName");
        int hashCode = str.hashCode();
        if (hashCode != 100) {
            if (hashCode != 104) {
                if (hashCode != 109) {
                    if (hashCode != 115) {
                        if (hashCode != 3494) {
                            if (hashCode != 3525) {
                                if (hashCode == 3742 && str.equals("us")) {
                                    return d.MICROSECONDS;
                                }
                            } else if (str.equals("ns")) {
                                return d.NANOSECONDS;
                            }
                        } else if (str.equals("ms")) {
                            return d.MILLISECONDS;
                        }
                    } else if (str.equals("s")) {
                        return d.SECONDS;
                    }
                } else if (str.equals("m")) {
                    return d.MINUTES;
                }
            } else if (str.equals("h")) {
                return d.HOURS;
            }
        } else if (str.equals("d")) {
            return d.DAYS;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + str);
    }
}
