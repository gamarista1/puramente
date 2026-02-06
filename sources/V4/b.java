package V4;

final class b extends RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    b(Throwable th2) {
        super("Unexpected exception thrown by non-Glide code", th2);
    }
}
