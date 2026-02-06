package Lh;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final BigInteger f64085a;

    /* renamed from: b  reason: collision with root package name */
    public static final BigInteger f64086b;

    /* renamed from: c  reason: collision with root package name */
    public static final BigInteger f64087c;

    /* renamed from: d  reason: collision with root package name */
    public static final BigInteger f64088d;

    /* renamed from: e  reason: collision with root package name */
    public static final BigInteger f64089e;

    /* renamed from: f  reason: collision with root package name */
    public static final BigInteger f64090f;

    /* renamed from: g  reason: collision with root package name */
    public static final BigInteger f64091g;

    /* renamed from: h  reason: collision with root package name */
    public static final BigInteger f64092h;

    /* renamed from: i  reason: collision with root package name */
    public static final File[] f64093i = new File[0];

    static {
        BigInteger valueOf = BigInteger.valueOf(1024);
        f64085a = valueOf;
        BigInteger multiply = valueOf.multiply(valueOf);
        f64086b = multiply;
        BigInteger multiply2 = valueOf.multiply(multiply);
        f64087c = multiply2;
        BigInteger multiply3 = valueOf.multiply(multiply2);
        f64088d = multiply3;
        BigInteger multiply4 = valueOf.multiply(multiply3);
        f64089e = multiply4;
        f64090f = valueOf.multiply(multiply4);
        BigInteger multiply5 = BigInteger.valueOf(1024).multiply(BigInteger.valueOf(1152921504606846976L));
        f64091g = multiply5;
        f64092h = valueOf.multiply(multiply5);
    }

    private static void a(File file, File file2) {
        if (file == null) {
            throw new NullPointerException("Source must not be null");
        } else if (file2 == null) {
            throw new NullPointerException("Destination must not be null");
        } else if (!file.exists()) {
            throw new FileNotFoundException("Source '" + file + "' does not exist");
        }
    }

    public static void b(File file) {
        IOException e10 = null;
        for (File k10 : m(file)) {
            try {
                k(k10);
            } catch (IOException e11) {
                e10 = e11;
            }
        }
        if (e10 != null) {
            throw e10;
        }
    }

    public static void c(File file, File file2) {
        e(file, file2, true);
    }

    public static void d(File file, File file2, FileFilter fileFilter, boolean z10) {
        ArrayList arrayList;
        File[] fileArr;
        a(file, file2);
        if (!file.isDirectory()) {
            throw new IOException("Source '" + file + "' exists but is not a directory");
        } else if (!file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                if (fileFilter == null) {
                    fileArr = file.listFiles();
                } else {
                    fileArr = file.listFiles(fileFilter);
                }
                if (fileArr != null && fileArr.length > 0) {
                    arrayList = new ArrayList(fileArr.length);
                    for (File name : fileArr) {
                        arrayList.add(new File(file2, name.getName()).getCanonicalPath());
                    }
                    i(file, file2, fileFilter, z10, arrayList);
                }
            }
            arrayList = null;
            i(file, file2, fileFilter, z10, arrayList);
        } else {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
    }

    public static void e(File file, File file2, boolean z10) {
        d(file, file2, (FileFilter) null, z10);
    }

    public static void f(File file, File file2) {
        g(file, file2, true);
    }

    public static void g(File file, File file2, boolean z10) {
        a(file, file2);
        if (file.isDirectory()) {
            throw new IOException("Source '" + file + "' exists but is a directory");
        } else if (!file.getCanonicalPath().equals(file2.getCanonicalPath())) {
            File parentFile = file2.getParentFile();
            if (parentFile != null && !parentFile.mkdirs() && !parentFile.isDirectory()) {
                throw new IOException("Destination '" + parentFile + "' directory cannot be created");
            } else if (!file2.exists() || file2.canWrite()) {
                j(file, file2, z10);
            } else {
                throw new IOException("Destination '" + file2 + "' exists but is read-only");
            }
        } else {
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
    }

    public static void h(File file) {
        if (file.exists()) {
            if (!l(file)) {
                b(file);
            }
            if (!file.delete()) {
                throw new IOException("Unable to delete directory " + file + ".");
            }
        }
    }

    private static void i(File file, File file2, FileFilter fileFilter, boolean z10, List list) {
        File[] fileArr;
        if (fileFilter == null) {
            fileArr = file.listFiles();
        } else {
            fileArr = file.listFiles(fileFilter);
        }
        if (fileArr != null) {
            if (file2.exists()) {
                if (!file2.isDirectory()) {
                    throw new IOException("Destination '" + file2 + "' exists but is not a directory");
                }
            } else if (!file2.mkdirs() && !file2.isDirectory()) {
                throw new IOException("Destination '" + file2 + "' directory cannot be created");
            }
            if (file2.canWrite()) {
                for (File file3 : fileArr) {
                    File file4 = new File(file2, file3.getName());
                    if (list == null || !list.contains(file3.getCanonicalPath())) {
                        if (file3.isDirectory()) {
                            i(file3, file4, fileFilter, z10, list);
                        } else {
                            j(file3, file4, z10);
                        }
                    }
                }
                if (z10) {
                    file2.setLastModified(file.lastModified());
                    return;
                }
                return;
            }
            throw new IOException("Destination '" + file2 + "' cannot be written to");
        }
        throw new IOException("Failed to list contents of " + file);
    }

    private static void j(File file, File file2, boolean z10) {
        Throwable th2;
        Throwable th3;
        long j10;
        File file3 = file;
        File file4 = file2;
        if (!file2.exists() || !file2.isDirectory()) {
            FileInputStream fileInputStream = new FileInputStream(file3);
            try {
                FileChannel channel = fileInputStream.getChannel();
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file4);
                    try {
                        FileChannel channel2 = fileOutputStream.getChannel();
                        try {
                            long size = channel.size();
                            long j11 = 0;
                            while (j11 < size) {
                                long j12 = size - j11;
                                if (j12 > 31457280) {
                                    j10 = 31457280;
                                } else {
                                    j10 = j12;
                                }
                                long transferFrom = channel2.transferFrom(channel, j11, j10);
                                if (transferFrom == 0) {
                                    break;
                                }
                                j11 += transferFrom;
                            }
                            if (channel2 != null) {
                                channel2.close();
                            }
                            fileOutputStream.close();
                            channel.close();
                            fileInputStream.close();
                            long length = file.length();
                            long length2 = file2.length();
                            if (length != length2) {
                                throw new IOException("Failed to copy full contents from '" + file3 + "' to '" + file4 + "' Expected length: " + length + " Actual: " + length2);
                            } else if (z10) {
                                file4.setLastModified(file.lastModified());
                            }
                        } catch (Throwable th4) {
                            Throwable th5 = th4;
                            if (channel2 != null) {
                                channel2.close();
                            }
                            throw th5;
                        }
                    } catch (Throwable th6) {
                        fileOutputStream.close();
                        throw th2;
                    } finally {
                    }
                } catch (Throwable th7) {
                    Throwable th8 = th7;
                    if (channel != null) {
                        channel.close();
                    }
                    throw th8;
                }
            } catch (Throwable th62) {
                try {
                    fileInputStream.close();
                } catch (Throwable th9) {
                    th2.addSuppressed(th9);
                }
                throw th2;
            } finally {
                th2 = th62;
            }
        } else {
            throw new IOException("Destination '" + file4 + "' exists but is a directory");
        }
    }

    public static void k(File file) {
        if (file.isDirectory()) {
            h(file);
            return;
        }
        boolean exists = file.exists();
        if (file.delete()) {
            return;
        }
        if (!exists) {
            throw new FileNotFoundException("File does not exist: " + file);
        }
        throw new IOException("Unable to delete file: " + file);
    }

    public static boolean l(File file) {
        if (file != null) {
            return Files.isSymbolicLink(file.toPath());
        }
        throw new NullPointerException("File must not be null");
    }

    private static File[] m(File file) {
        if (!file.exists()) {
            throw new IllegalArgumentException(file + " does not exist");
        } else if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                return listFiles;
            }
            throw new IOException("Failed to list contents of " + file);
        } else {
            throw new IllegalArgumentException(file + " is not a directory");
        }
    }
}
