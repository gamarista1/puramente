package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.format.InputAccessor;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.MergedStream;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collection;

public class DataFormatReaders {
    public static final int DEFAULT_MAX_INPUT_LOOKAHEAD = 64;
    protected final int _maxInputLookahead;
    protected final MatchStrength _minimalMatch;
    protected final MatchStrength _optimalMatch;
    protected final ObjectReader[] _readers;

    public static class Match {
        protected final byte[] _bufferedData;
        protected final int _bufferedLength;
        protected final int _bufferedStart;
        protected final ObjectReader _match;
        protected final MatchStrength _matchStrength;
        protected final InputStream _originalStream;

        protected Match(InputStream inputStream, byte[] bArr, int i10, int i11, ObjectReader objectReader, MatchStrength matchStrength) {
            this._originalStream = inputStream;
            this._bufferedData = bArr;
            this._bufferedStart = i10;
            this._bufferedLength = i11;
            this._match = objectReader;
            this._matchStrength = matchStrength;
        }

        public JsonParser createParserWithMatch() {
            ObjectReader objectReader = this._match;
            if (objectReader == null) {
                return null;
            }
            JsonFactory factory = objectReader.getFactory();
            if (this._originalStream == null) {
                return factory.createParser(this._bufferedData, this._bufferedStart, this._bufferedLength);
            }
            return factory.createParser(getDataStream());
        }

        public InputStream getDataStream() {
            if (this._originalStream == null) {
                return new ByteArrayInputStream(this._bufferedData, this._bufferedStart, this._bufferedLength);
            }
            return new MergedStream((IOContext) null, this._originalStream, this._bufferedData, this._bufferedStart, this._bufferedLength);
        }

        public MatchStrength getMatchStrength() {
            MatchStrength matchStrength = this._matchStrength;
            if (matchStrength == null) {
                return MatchStrength.INCONCLUSIVE;
            }
            return matchStrength;
        }

        public String getMatchedFormatName() {
            return this._match.getFactory().getFormatName();
        }

        public ObjectReader getReader() {
            return this._match;
        }

        public boolean hasMatch() {
            if (this._match != null) {
                return true;
            }
            return false;
        }
    }

    public DataFormatReaders(ObjectReader... objectReaderArr) {
        this(objectReaderArr, MatchStrength.SOLID_MATCH, MatchStrength.WEAK_MATCH, 64);
    }

    private Match _findFormat(AccessorForReader accessorForReader) {
        ObjectReader[] objectReaderArr = this._readers;
        int length = objectReaderArr.length;
        ObjectReader objectReader = null;
        int i10 = 0;
        MatchStrength matchStrength = null;
        while (true) {
            if (i10 >= length) {
                break;
            }
            ObjectReader objectReader2 = objectReaderArr[i10];
            accessorForReader.reset();
            MatchStrength hasFormat = objectReader2.getFactory().hasFormat(accessorForReader);
            if (hasFormat != null && hasFormat.ordinal() >= this._minimalMatch.ordinal() && (objectReader == null || matchStrength.ordinal() < hasFormat.ordinal())) {
                if (hasFormat.ordinal() >= this._optimalMatch.ordinal()) {
                    objectReader = objectReader2;
                    matchStrength = hasFormat;
                    break;
                }
                objectReader = objectReader2;
                matchStrength = hasFormat;
            }
            i10++;
        }
        return accessorForReader.createMatcher(objectReader, matchStrength);
    }

    public Match findFormat(InputStream inputStream) {
        return _findFormat(new AccessorForReader(inputStream, new byte[this._maxInputLookahead]));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        ObjectReader[] objectReaderArr = this._readers;
        int length = objectReaderArr.length;
        if (length > 0) {
            sb2.append(objectReaderArr[0].getFactory().getFormatName());
            for (int i10 = 1; i10 < length; i10++) {
                sb2.append(", ");
                sb2.append(this._readers[i10].getFactory().getFormatName());
            }
        }
        sb2.append(']');
        return sb2.toString();
    }

    public DataFormatReaders with(ObjectReader[] objectReaderArr) {
        return new DataFormatReaders(objectReaderArr, this._optimalMatch, this._minimalMatch, this._maxInputLookahead);
    }

    public DataFormatReaders withMaxInputLookahead(int i10) {
        if (i10 == this._maxInputLookahead) {
            return this;
        }
        return new DataFormatReaders(this._readers, this._optimalMatch, this._minimalMatch, i10);
    }

    public DataFormatReaders withMinimalMatch(MatchStrength matchStrength) {
        if (matchStrength == this._minimalMatch) {
            return this;
        }
        return new DataFormatReaders(this._readers, this._optimalMatch, matchStrength, this._maxInputLookahead);
    }

    public DataFormatReaders withOptimalMatch(MatchStrength matchStrength) {
        if (matchStrength == this._optimalMatch) {
            return this;
        }
        return new DataFormatReaders(this._readers, matchStrength, this._minimalMatch, this._maxInputLookahead);
    }

    public DataFormatReaders withType(JavaType javaType) {
        int length = this._readers.length;
        ObjectReader[] objectReaderArr = new ObjectReader[length];
        for (int i10 = 0; i10 < length; i10++) {
            objectReaderArr[i10] = this._readers[i10].forType(javaType);
        }
        return new DataFormatReaders(objectReaderArr, this._optimalMatch, this._minimalMatch, this._maxInputLookahead);
    }

    protected class AccessorForReader extends InputAccessor.Std {
        public AccessorForReader(InputStream inputStream, byte[] bArr) {
            super(inputStream, bArr);
        }

        public Match createMatcher(ObjectReader objectReader, MatchStrength matchStrength) {
            InputStream inputStream = this._in;
            byte[] bArr = this._buffer;
            int i10 = this._bufferedStart;
            return new Match(inputStream, bArr, i10, this._bufferedEnd - i10, objectReader, matchStrength);
        }

        public AccessorForReader(byte[] bArr) {
            super(bArr);
        }

        public AccessorForReader(byte[] bArr, int i10, int i11) {
            super(bArr, i10, i11);
        }
    }

    public DataFormatReaders(Collection<ObjectReader> collection) {
        this((ObjectReader[]) collection.toArray(new ObjectReader[collection.size()]));
    }

    public Match findFormat(byte[] bArr) {
        return _findFormat(new AccessorForReader(bArr));
    }

    public DataFormatReaders with(DeserializationConfig deserializationConfig) {
        int length = this._readers.length;
        ObjectReader[] objectReaderArr = new ObjectReader[length];
        for (int i10 = 0; i10 < length; i10++) {
            objectReaderArr[i10] = this._readers[i10].with(deserializationConfig);
        }
        return new DataFormatReaders(objectReaderArr, this._optimalMatch, this._minimalMatch, this._maxInputLookahead);
    }

    private DataFormatReaders(ObjectReader[] objectReaderArr, MatchStrength matchStrength, MatchStrength matchStrength2, int i10) {
        this._readers = objectReaderArr;
        this._optimalMatch = matchStrength;
        this._minimalMatch = matchStrength2;
        this._maxInputLookahead = i10;
    }

    public Match findFormat(byte[] bArr, int i10, int i11) {
        return _findFormat(new AccessorForReader(bArr, i10, i11));
    }
}
