package xd;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f62255a = new g();

    private g() {
    }

    public final int a(int i10, int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalArgumentException("[RNScreens] Invalid state " + i10 + " for detentCount " + i11);
                } else if (i10 == 3) {
                    return 2;
                } else {
                    if (i10 == 4) {
                        return 0;
                    }
                    if (i10 != 5) {
                        if (i10 != 6) {
                            throw new IllegalArgumentException("[RNScreens] Invalid state " + i10 + " for detentCount " + i11);
                        }
                    }
                }
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return 0;
                }
                if (i10 != 5) {
                    throw new IllegalArgumentException("[RNScreens] Invalid state " + i10 + " for detentCount " + i11);
                }
            }
            return 1;
        } else if (i10 == 3) {
            return 0;
        } else {
            if (i10 != 5) {
                throw new IllegalArgumentException("[RNScreens] Invalid state " + i10 + " for detentCount " + i11);
            }
        }
        return -1;
    }

    public final boolean b(int i10) {
        if (i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6) {
            return true;
        }
        return false;
    }

    public final int c(int i10, int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    throw new IllegalArgumentException("[RNScreens] Invalid detentCount/index combination " + i11 + " / " + i10);
                } else if (i10 == -1) {
                    return 5;
                } else {
                    if (i10 != 0) {
                        if (i10 == 1) {
                            return 6;
                        }
                        if (i10 != 2) {
                            throw new IllegalArgumentException("[RNScreens] Invalid detentCount/index combination " + i11 + " / " + i10);
                        }
                    }
                }
            } else if (i10 == -1) {
                return 5;
            } else {
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalArgumentException("[RNScreens] Invalid detentCount/index combination " + i11 + " / " + i10);
                    }
                }
            }
            return 4;
        } else if (i10 == -1) {
            return 5;
        } else {
            if (i10 != 0) {
                throw new IllegalArgumentException("[RNScreens] Invalid detentCount/index combination " + i11 + " / " + i10);
            }
        }
        return 3;
    }
}
