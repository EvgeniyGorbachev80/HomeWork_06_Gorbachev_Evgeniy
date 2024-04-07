package org.Gorbachev;

import java.util.List;

public class StreamService {
    public void sortStreams(List<Stream> streams) {
        streams.sort(new StreamComparator());
    }

    public List<Stream> getSortedStream(List<Stream> streamList) {
        return streamList;
    }
}
