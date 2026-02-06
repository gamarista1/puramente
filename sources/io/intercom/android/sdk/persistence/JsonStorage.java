package io.intercom.android.sdk.persistence;

import com.google.gson.e;
import com.intercom.twig.Twig;
import io.intercom.android.sdk.logger.LumberMill;
import io.intercom.android.sdk.utilities.IoUtils;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class JsonStorage {
    private static final Twig TWIG = LumberMill.getLogger();
    private final e gson;

    public interface LoadFailureHandler {
        public static final LoadFailureHandler NONE = new LoadFailureHandler() {
            public void onLoadFailed(File file, Exception exc) {
            }
        };

        void onLoadFailed(File file, Exception exc);
    }

    public interface LoadHandler<T> {
        void onLoad(T t10);
    }

    public JsonStorage(e eVar) {
        this.gson = eVar;
    }

    public int getDirectoryFileCount(File file) {
        String[] list = file.list();
        if (list == null) {
            return 0;
        }
        return list.length;
    }

    public <T> void loadFilesInDirectory(File file, Class<T> cls, LoadHandler<List<T>> loadHandler) {
        loadFilesInDirectory(file, cls, loadHandler, LoadFailureHandler.NONE);
    }

    public <T> void loadThenDelete(File file, Class<T> cls, LoadHandler<T> loadHandler) {
        FileReader fileReader = null;
        try {
            FileReader fileReader2 = new FileReader(file);
            try {
                loadHandler.onLoad(this.gson.k(fileReader2, cls));
                IoUtils.safelyDelete(file);
                IoUtils.closeQuietly(fileReader2);
            } catch (Exception unused) {
                fileReader = fileReader2;
                IoUtils.safelyDelete(file);
                IoUtils.closeQuietly(fileReader);
            } catch (Throwable th2) {
                th = th2;
                fileReader = fileReader2;
                IoUtils.safelyDelete(file);
                IoUtils.closeQuietly(fileReader);
                throw th;
            }
        } catch (Exception unused2) {
            IoUtils.safelyDelete(file);
            IoUtils.closeQuietly(fileReader);
        } catch (Throwable th3) {
            th = th3;
            IoUtils.safelyDelete(file);
            IoUtils.closeQuietly(fileReader);
            throw th;
        }
    }

    public void saveToFileAsJson(Object obj, File file) {
        FileWriter fileWriter = null;
        try {
            if (file.exists()) {
                if (!file.delete()) {
                    throw new RuntimeException("Couldn't delete existing file at " + file.getAbsolutePath());
                }
            }
            File parentFile = file.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                if (!parentFile.mkdirs()) {
                    throw new RuntimeException("Couldn't create missing parent dir at " + parentFile.getAbsolutePath());
                }
            }
            FileWriter fileWriter2 = new FileWriter(file);
            try {
                this.gson.z(obj, fileWriter2);
                IoUtils.closeQuietly(fileWriter2);
            } catch (Exception e10) {
                e = e10;
                fileWriter = fileWriter2;
                try {
                    Twig twig = TWIG;
                    twig.internal("Couldn't save file to disk: " + e);
                    IoUtils.closeQuietly(fileWriter);
                } catch (Throwable th2) {
                    th = th2;
                    IoUtils.closeQuietly(fileWriter);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileWriter = fileWriter2;
                IoUtils.closeQuietly(fileWriter);
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            Twig twig2 = TWIG;
            twig2.internal("Couldn't save file to disk: " + e);
            IoUtils.closeQuietly(fileWriter);
        }
    }

    public <T> void loadFilesInDirectory(File file, Class<T> cls, LoadHandler<List<T>> loadHandler, LoadFailureHandler loadFailureHandler) {
        FileReader fileReader;
        Exception e10;
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            ArrayList arrayList = new ArrayList(listFiles.length);
            FileReader fileReader2 = null;
            for (File file2 : listFiles) {
                try {
                    fileReader = new FileReader(file2);
                    try {
                        arrayList.add(this.gson.k(fileReader, cls));
                    } catch (Exception e11) {
                        e10 = e11;
                        try {
                            loadFailureHandler.onLoadFailed(file2, e10);
                            IoUtils.closeQuietly(fileReader);
                            fileReader2 = fileReader;
                        } catch (Throwable th2) {
                            th = th2;
                            fileReader2 = fileReader;
                        }
                    }
                } catch (Exception e12) {
                    Exception exc = e12;
                    fileReader = fileReader2;
                    e10 = exc;
                    loadFailureHandler.onLoadFailed(file2, e10);
                    IoUtils.closeQuietly(fileReader);
                    fileReader2 = fileReader;
                } catch (Throwable th3) {
                    th = th3;
                    IoUtils.closeQuietly(fileReader2);
                    throw th;
                }
                IoUtils.closeQuietly(fileReader);
                fileReader2 = fileReader;
            }
            loadHandler.onLoad(arrayList);
        }
    }
}
