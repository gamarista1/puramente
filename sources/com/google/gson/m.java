package com.google.gson;

import Pc.B;
import Pc.z;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

public final class m extends h {

    /* renamed from: a  reason: collision with root package name */
    private final Object f58352a;

    public m(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f58352a = bool;
    }

    private static boolean E(m mVar) {
        Object obj = mVar.f58352a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return true;
        }
        return false;
    }

    public long A() {
        if (H()) {
            return C().longValue();
        }
        return Long.parseLong(g());
    }

    public Number C() {
        Object obj = this.f58352a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new z((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public boolean D() {
        return this.f58352a instanceof Boolean;
    }

    public boolean H() {
        return this.f58352a instanceof Number;
    }

    public boolean I() {
        return this.f58352a instanceof String;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f58352a == null) {
            if (mVar.f58352a == null) {
                return true;
            }
            return false;
        } else if (!E(this) || !E(mVar)) {
            Object obj2 = this.f58352a;
            if (obj2 instanceof Number) {
                Object obj3 = mVar.f58352a;
                if (obj3 instanceof Number) {
                    if (!(obj2 instanceof BigDecimal) || !(obj3 instanceof BigDecimal)) {
                        double x10 = x();
                        double x11 = mVar.x();
                        if (x10 == x11) {
                            return true;
                        }
                        if (!Double.isNaN(x10) || !Double.isNaN(x11)) {
                            return false;
                        }
                        return true;
                    } else if (r().compareTo(mVar.r()) == 0) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }
            return obj2.equals(mVar.f58352a);
        } else if ((this.f58352a instanceof BigInteger) || (mVar.f58352a instanceof BigInteger)) {
            return t().equals(mVar.t());
        } else {
            if (C().longValue() == mVar.C().longValue()) {
                return true;
            }
            return false;
        }
    }

    public String g() {
        Object obj = this.f58352a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (H()) {
            return C().toString();
        }
        if (D()) {
            return ((Boolean) this.f58352a).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f58352a.getClass());
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f58352a == null) {
            return 31;
        }
        if (E(this)) {
            doubleToLongBits = C().longValue();
        } else {
            Object obj = this.f58352a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(C().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public BigDecimal r() {
        Object obj = this.f58352a;
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        return B.b(g());
    }

    public BigInteger t() {
        Object obj = this.f58352a;
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        if (E(this)) {
            return BigInteger.valueOf(C().longValue());
        }
        return B.c(g());
    }

    public boolean v() {
        if (D()) {
            return ((Boolean) this.f58352a).booleanValue();
        }
        return Boolean.parseBoolean(g());
    }

    public double x() {
        if (H()) {
            return C().doubleValue();
        }
        return Double.parseDouble(g());
    }

    public int z() {
        if (H()) {
            return C().intValue();
        }
        return Integer.parseInt(g());
    }

    public m(Number number) {
        Objects.requireNonNull(number);
        this.f58352a = number;
    }

    public m(String str) {
        Objects.requireNonNull(str);
        this.f58352a = str;
    }
}
