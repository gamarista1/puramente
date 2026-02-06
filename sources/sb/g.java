package sb;

public abstract class g {
    public static String a(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder(bArr.length * 2);
        for (byte b10 : bArr) {
            byte b11 = b10 & 255;
            sb2.append("0123456789abcdef".charAt(b11 / 16));
            sb2.append("0123456789abcdef".charAt(b11 % 16));
        }
        return sb2.toString();
    }
}
